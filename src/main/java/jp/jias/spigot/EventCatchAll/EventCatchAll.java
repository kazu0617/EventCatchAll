package jp.jias.spigot.EventCatchAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * すべてのイベントをキャッチして表示するプラグイン
 *
 * @author i_shi_ba_shi ( jias.jp )
 */
public class EventCatchAll extends JavaPlugin {

    /**
     * 非表示条件の保存用キー名
     */
    private static final String CONF_HIDE_PATTERN = "hidePattern";

    /**
     * イベントをパッケージごとに色分けするためのマップ
     */
    private Map<String, ChatColor> pkgColor = new HashMap<>();

    /**
     * イベントの非表示条件
     */
    private List<String> hidePattern = new ArrayList<String>();

    /**
     * 設定情報
     */
    private FileConfiguration conf;

    /**
     * プラグインが有効化されるとき呼び出される
     */
    public void onEnable() {
        // 設定を読み込む
        saveDefaultConfig();
        conf = getConfig();
        loadHidePattern(Bukkit.getConsoleSender());
        initPackageColor();

        // イベントリスナーの登録
        getServer().getPluginManager().registerEvents(new EventListener(this),
                this);
    }

    /**
     * イベントを表示する
     *
     * @param event イベントオブジェクト
     * @param str 表示したい文字列
     */
    public void showEvent(String handler, Event event, Object... detail) {

        // 表示する文言を組み立てる
        StringBuilder sb = new StringBuilder();

        // まずイベントハンドラ名を挿入
        sb.append(pkgColor.get(event.getClass().getPackage().getName()));
        sb.append(handler);

        // イベント名とイベントハンドラ名が異なる場合はイベント名も挿入する
        if (!event.getEventName().equals(handler)) {
            sb.append(ChatColor.WHITE);
            sb.append("<");
            sb.append(event.getEventName());
            sb.append(">");
        }

        // 詳細があれば挿入する
        if (detail.length != 0) {
            sb.append(ChatColor.DARK_GRAY + "(");
            boolean isFirst = true;
            for (Object obj : detail) {

                // 最初の要素以外は区切りにカンマを挿入
                if (isFirst) {
                    isFirst = false;
                } else {
                    sb.append(ChatColor.DARK_GRAY + ", ");
                }

                // 値を挿入
                sb.append(ChatColor.GRAY
                        + (obj == null ? "null" : obj.toString()));
            }
            sb.append(ChatColor.DARK_GRAY + ")");
        }

        // イベントが非表示条件にマッチするか確認する
        String eventName = event.getEventName().toLowerCase();
        boolean isShow = true;
        for (String pattern : hidePattern) {
            // 非表示条件にイベント名が先頭一致するか
            if (eventName.indexOf(pattern) == 0) {
                isShow = false;
                break;
            }
        }

        // 非表示条件に合致したか
        if (isShow) {
            // ゲーム画面とコンソールに表示する
            Bukkit.broadcastMessage(sb.toString());
        } else {
            // コンソールにだけ表示する
            Bukkit.getConsoleSender().sendMessage(sb.toString());
        }
    }

    /**
     * コマンド実行時に呼ばれる
     */
    @Override
    public boolean onCommand(CommandSender sender, Command cmd,
            String commandLabel, String[] args) {

        // 引数なし
        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "引数が必要です。");
        } // 読み込み
        else if ("load".equalsIgnoreCase(args[0])) {
            loadHidePattern(sender);
            sender.sendMessage(ChatColor.GREEN + "表示条件を読み込みました。");
            showHidePattern(sender);
            return true;
        } // 追加
        else if ("add".equalsIgnoreCase(args[0]) && args.length > 1) {
            int count = 0;
            for (int i = 1; i < args.length; i++) {
                if (addHidePattern(sender, args[i])) {
                    count++;
                }
            }
            sender.sendMessage(ChatColor.GREEN + "表示条件を" + count + "個追加しました。");
            return true;
        } // 削除
        else if ("del".equalsIgnoreCase(args[0]) && args.length > 1) {
            int count = 0;
            for (int i = 1; i < args.length; i++) {
                if (hidePattern.remove(args[i].toLowerCase())) {
                    count++;
                }
            }
            sender.sendMessage(ChatColor.GREEN + "表示条件を" + count + "個削除しました。");

            return true;
        } // 表示
        else if ("show".equalsIgnoreCase(args[0])) {
            showHidePattern(sender);
            return true;
        } // 保存
        else if ("save".equalsIgnoreCase(args[0])) {
            conf.set(CONF_HIDE_PATTERN, hidePattern);
            saveConfig();
            sender.sendMessage(ChatColor.GREEN + "非表示条件を保存しました。");
            return true;
        } // それ以外
        else {
            sender.sendMessage(ChatColor.RED + "引数が不正です。");
        }

        return false;
    }

    /**
     * イベントの非表示条件を表示する
     *
     * @param sender 表示する相手
     */
    private void showHidePattern(CommandSender sender) {
        sender.sendMessage(ChatColor.GREEN + "設定されている非表示条件は"
                + hidePattern.size() + "個です。");
        for (String disable : hidePattern) {
            sender.sendMessage(disable.toString());
        }
    }

    /**
     * 設定ファイルからイベントの非表示条件を取り込む
     */
    private void loadHidePattern(CommandSender sender) {
        hidePattern.clear();

        // 設定ファイルから一覧を読み込む
        List<?> list = conf.getList(CONF_HIDE_PATTERN);

        if (list == null) {
            return;
        }

        for (Object pattern : list) {
            addHidePattern(sender, pattern.toString());
        }
    }

    /**
     * 設定ファイルからパッケージの表示色を取り込む
     */
    private void initPackageColor() {
        // マップを初期化
        pkgColor.clear();

        // 設定ファイルのエントリを順に処理
        Map<?, ?> map = conf.getMapList("color").get(0);
        for (Entry<?, ?> entry : map.entrySet()) {
            try {
                // パッケージ名と色名をマップに保存
                pkgColor.put(entry.getKey().toString(),
                        ChatColor.valueOf(entry.getValue().toString()));
            } catch (IllegalArgumentException e) {
                // 色名が不明な場合はデフォルトで白で保存
                Bukkit.broadcastMessage(ChatColor.RED + "不明な色名："
                        + entry.getValue());
                pkgColor.put(entry.getKey().toString(), ChatColor.WHITE);
            }
        }
    }

    /**
     * 非表示条件を追加する
     */
    private boolean addHidePattern(CommandSender sender, String pattern) {
        // 小文字にする
        pattern = pattern.toLowerCase();

        // 重複は無視
        if (hidePattern.contains(pattern)) {
            return false;
        }

        hidePattern.add(pattern);
        return true;
    }
}
