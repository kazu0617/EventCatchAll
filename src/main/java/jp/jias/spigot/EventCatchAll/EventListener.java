package jp.jias.spigot.EventCatchAll;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockExpEvent;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.block.BlockFormEvent;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockGrowEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.BlockMultiPlaceEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPistonRetractEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.event.block.BlockSpreadEvent;
import org.bukkit.event.block.EntityBlockFormEvent;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.event.block.NotePlayEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreeperPowerEvent;
import org.bukkit.event.entity.EntityBreakDoorEvent;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.EntityCombustByBlockEvent;
import org.bukkit.event.entity.EntityCombustByEntityEvent;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.event.entity.EntityCreatePortalEvent;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.entity.EntityPortalEnterEvent;
import org.bukkit.event.entity.EntityPortalEvent;
import org.bukkit.event.entity.EntityPortalExitEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.entity.EntityTameEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.event.entity.EntityTeleportEvent;
import org.bukkit.event.entity.EntityUnleashEvent;
import org.bukkit.event.entity.ExpBottleEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.HorseJumpEvent;
import org.bukkit.event.entity.ItemDespawnEvent;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.entity.PigZapEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.PlayerLeashEntityEvent;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.entity.SheepDyeWoolEvent;
import org.bukkit.event.entity.SheepRegrowWoolEvent;
import org.bukkit.event.entity.SlimeSplitEvent;
import org.bukkit.event.entity.SpawnerSpawnEvent;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.event.hanging.HangingBreakEvent;
import org.bukkit.event.hanging.HangingPlaceEvent;
import org.bukkit.event.inventory.BrewEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.FurnaceBurnEvent;
import org.bukkit.event.inventory.FurnaceExtractEvent;
import org.bukkit.event.inventory.FurnaceSmeltEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryCreativeEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryPickupItemEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.PlayerAchievementAwardedEvent;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerChatTabCompleteEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerEditBookEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemBreakEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRegisterChannelEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.event.player.PlayerStatisticIncrementEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.event.player.PlayerUnleashEntityEvent;
import org.bukkit.event.player.PlayerUnregisterChannelEvent;
import org.bukkit.event.player.PlayerVelocityEvent;
import org.bukkit.event.server.MapInitializeEvent;
import org.bukkit.event.server.PluginDisableEvent;
import org.bukkit.event.server.PluginEnableEvent;
import org.bukkit.event.server.RemoteServerCommandEvent;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.event.server.ServiceRegisterEvent;
import org.bukkit.event.server.ServiceUnregisterEvent;
import org.bukkit.event.vehicle.VehicleBlockCollisionEvent;
import org.bukkit.event.vehicle.VehicleCreateEvent;
import org.bukkit.event.vehicle.VehicleDamageEvent;
import org.bukkit.event.vehicle.VehicleDestroyEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.event.vehicle.VehicleEntityCollisionEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;
import org.bukkit.event.vehicle.VehicleMoveEvent;
import org.bukkit.event.vehicle.VehicleUpdateEvent;
import org.bukkit.event.weather.LightningStrikeEvent;
import org.bukkit.event.weather.ThunderChangeEvent;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.event.world.ChunkPopulateEvent;
import org.bukkit.event.world.ChunkUnloadEvent;
import org.bukkit.event.world.PortalCreateEvent;
import org.bukkit.event.world.SpawnChangeEvent;
import org.bukkit.event.world.StructureGrowEvent;
import org.bukkit.event.world.WorldInitEvent;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.event.world.WorldSaveEvent;
import org.bukkit.event.world.WorldUnloadEvent;

/**
 * あらゆるイベントをキャッチする
 * 
 * @author i_shi_ba_shi ( jias.jp )
 *
 */
public class EventListener implements Listener{

	/** メインクラス */
	private EventCatchAll main;

	/** コンストラクタ */
	public EventListener(EventCatchAll main) {
		this.main = main;
	}

	/**
	 * 座標を見やすく文字列化する
	 * 
	 * @param loc
	 *            座標
	 * @return 座標を表す文字列
	 */
	private String toString(Location loc) {
		return loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ();
	}

	@EventHandler	public void onEvent(BlockBreakEvent e){main.showEvent("BlockBreakEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()));}
	@EventHandler	public void onEvent(BlockBurnEvent e){main.showEvent("BlockBurnEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()));}
	@EventHandler	public void onEvent(BlockCanBuildEvent e){main.showEvent("BlockCanBuildEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()));}
	@EventHandler	public void onEvent(BlockDamageEvent e){main.showEvent("BlockDamageEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()));}
	@EventHandler	public void onEvent(BlockDispenseEvent e){main.showEvent("BlockDispenseEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()));}
	@EventHandler	public void onEvent(BlockExpEvent e){main.showEvent("BlockExpEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()));}
	@EventHandler	public void onEvent(BlockExplodeEvent e){main.showEvent("BlockExplodeEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()));}
	@EventHandler	public void onEvent(BlockFadeEvent e){main.showEvent("BlockFadeEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()));}
	@EventHandler	public void onEvent(BlockFormEvent e){main.showEvent("BlockFormEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()));}
	@EventHandler	public void onEvent(BlockFromToEvent e){main.showEvent("BlockFromToEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()));}
	@EventHandler	public void onEvent(BlockGrowEvent e){main.showEvent("BlockGrowEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()));}
	@EventHandler	public void onEvent(BlockIgniteEvent e){main.showEvent("BlockIgniteEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()));}
	@EventHandler	public void onEvent(BlockMultiPlaceEvent e){main.showEvent("BlockMultiPlaceEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()));}
	@EventHandler	public void onEvent(BlockPhysicsEvent e){main.showEvent("BlockPhysicsEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()));}
	@EventHandler	public void onEvent(BlockPistonExtendEvent e){main.showEvent("BlockPistonExtendEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()),e.getBlocks().size());}
	@EventHandler	public void onEvent(BlockPistonRetractEvent e){main.showEvent("BlockPistonRetractEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()),e.getBlocks().size());}
	@EventHandler	public void onEvent(BlockPlaceEvent e){main.showEvent("BlockPlaceEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()));}
	@EventHandler	public void onEvent(BlockRedstoneEvent e){main.showEvent("BlockRedstoneEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()));}
	@EventHandler	public void onEvent(BlockSpreadEvent e){main.showEvent("BlockSpreadEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()));}
	@EventHandler	public void onEvent(EntityBlockFormEvent e){main.showEvent("EntityBlockFormEvent",e,e.getBlock().getType(),toString(e.getBlock().getLocation()));}
	@EventHandler	public void onEvent(LeavesDecayEvent e){main.showEvent("LeavesDecayEvent",e);}
	@EventHandler	public void onEvent(NotePlayEvent e){main.showEvent("NotePlayEvent",e);}
	@EventHandler	public void onEvent(SignChangeEvent e){main.showEvent("SignChangeEvent",e);}
	@EventHandler	public void onEvent(EnchantItemEvent e){main.showEvent("EnchantItemEvent",e);}
	@EventHandler	public void onEvent(PrepareItemEnchantEvent e){main.showEvent("PrepareItemEnchantEvent",e);}
	@EventHandler	public void onEvent(CreatureSpawnEvent e){main.showEvent("CreatureSpawnEvent",e);}
	@EventHandler	public void onEvent(CreeperPowerEvent e){main.showEvent("CreeperPowerEvent",e);}
	@EventHandler	public void onEvent(EntityBreakDoorEvent e){main.showEvent("EntityBreakDoorEvent",e);}
	@EventHandler	public void onEvent(EntityChangeBlockEvent e){main.showEvent("EntityChangeBlockEvent",e);}
	@EventHandler	public void onEvent(EntityCombustByBlockEvent e){main.showEvent("EntityCombustByBlockEvent",e,e.getCombuster(),e.getEntity());}
	@EventHandler	public void onEvent(EntityCombustByEntityEvent e){main.showEvent("EntityCombustByEntityEvent",e,e.getCombuster(),e.getEntity());}
	@EventHandler	public void onEvent(EntityCombustEvent e){main.showEvent("EntityCombustEvent",e,e.getEntity());}
	@EventHandler	public void onEvent(EntityCreatePortalEvent e){main.showEvent("EntityCreatePortalEvent",e);}
	@EventHandler	public void onEvent(EntityDamageByBlockEvent e){main.showEvent("EntityDamageByBlockEvent",e,e.getDamager(),e.getEntityType(),e.getCause(),e.getDamage());}
	@EventHandler	public void onEvent(EntityDamageByEntityEvent e){main.showEvent("EntityDamageByEntityEvent",e,e.getDamager().getType(),e.getEntityType(),e.getCause(),e.getDamage());}
	@EventHandler	public void onEvent(EntityDamageEvent e){main.showEvent("EntityDamageEvent",e,e.getEntityType(),e.getCause(),e.getDamage());}
	@EventHandler	public void onEvent(EntityDeathEvent e){main.showEvent("EntityDeathEvent",e,e.getEntityType());}
	@EventHandler	public void onEvent(EntityExplodeEvent e){main.showEvent("EntityExplodeEvent",e);}
	@EventHandler	public void onEvent(EntityInteractEvent e){main.showEvent("EntityInteractEvent",e);}
	@EventHandler	public void onEvent(EntityPortalEnterEvent e){main.showEvent("EntityPortalEnterEvent",e);}
	@EventHandler	public void onEvent(EntityPortalEvent e){main.showEvent("EntityPortalEvent",e);}
	@EventHandler	public void onEvent(EntityPortalExitEvent e){main.showEvent("EntityPortalExitEvent",e);}
	@EventHandler	public void onEvent(EntityRegainHealthEvent e){main.showEvent("EntityRegainHealthEvent",e);}
	@EventHandler	public void onEvent(EntityShootBowEvent e){main.showEvent("EntityShootBowEvent",e);}
	@EventHandler	public void onEvent(EntitySpawnEvent e){main.showEvent("EntitySpawnEvent",e,e.getEntityType());}
	@EventHandler	public void onEvent(EntityTameEvent e){main.showEvent("EntityTameEvent",e,e.getEntityType());}
	@EventHandler	public void onEvent(EntityTargetEvent e){main.showEvent("EntityTargetEvent",e,e.getEntityType(),e.getTarget());}
	@EventHandler	public void onEvent(EntityTargetLivingEntityEvent e){main.showEvent("EntityTargetLivingEntityEvent",e);}
	@EventHandler	public void onEvent(EntityTeleportEvent e){main.showEvent("EntityTeleportEvent",e);}
	@EventHandler	public void onEvent(EntityUnleashEvent e){main.showEvent("EntityUnleashEvent",e);}
	@EventHandler	public void onEvent(ExpBottleEvent e){main.showEvent("ExpBottleEvent",e);}
	@EventHandler	public void onEvent(ExplosionPrimeEvent e){main.showEvent("ExplosionPrimeEvent",e);}
	@EventHandler	public void onEvent(FoodLevelChangeEvent e){main.showEvent("FoodLevelChangeEvent",e);}
	@EventHandler	public void onEvent(HorseJumpEvent e){main.showEvent("HorseJumpEvent",e);}
	@EventHandler	public void onEvent(ItemDespawnEvent e){main.showEvent("ItemDespawnEvent",e);}
	@EventHandler	public void onEvent(ItemSpawnEvent e){main.showEvent("ItemSpawnEvent",e,e.getEntity().getItemStack().getType().name());}
	@EventHandler	public void onEvent(PigZapEvent e){main.showEvent("PigZapEvent",e);}
	@EventHandler	public void onEvent(PlayerDeathEvent e){main.showEvent("PlayerDeathEvent",e,e.getEntity().getName());}
	@EventHandler	public void onEvent(PlayerLeashEntityEvent e){main.showEvent("PlayerLeashEntityEvent",e);}
	@EventHandler	public void onEvent(PotionSplashEvent e){main.showEvent("PotionSplashEvent",e);}
	@EventHandler	public void onEvent(ProjectileHitEvent e){main.showEvent("ProjectileHitEvent",e);}
	@EventHandler	public void onEvent(ProjectileLaunchEvent e){main.showEvent("ProjectileLaunchEvent",e);}
	@EventHandler	public void onEvent(SheepDyeWoolEvent e){main.showEvent("SheepDyeWoolEvent",e);}
	@EventHandler	public void onEvent(SheepRegrowWoolEvent e){main.showEvent("SheepRegrowWoolEvent",e);}
	@EventHandler	public void onEvent(SlimeSplitEvent e){main.showEvent("SlimeSplitEvent",e);}
	@EventHandler	public void onEvent(SpawnerSpawnEvent e){main.showEvent("SpawnerSpawnEvent",e);}
	@EventHandler	public void onEvent(HangingBreakByEntityEvent e){main.showEvent("HangingBreakByEntityEvent",e);}
	@EventHandler	public void onEvent(HangingBreakEvent e){main.showEvent("HangingBreakEvent",e);}
	@EventHandler	public void onEvent(HangingPlaceEvent e){main.showEvent("HangingPlaceEvent",e);}
	@EventHandler	public void onEvent(BrewEvent e){main.showEvent("BrewEvent",e);}
	@EventHandler	public void onEvent(CraftItemEvent e){main.showEvent("CraftItemEvent",e);}
	@EventHandler	public void onEvent(FurnaceBurnEvent e){main.showEvent("FurnaceBurnEvent",e);}
	@EventHandler	public void onEvent(FurnaceExtractEvent e){main.showEvent("FurnaceExtractEvent",e);}
	@EventHandler	public void onEvent(FurnaceSmeltEvent e){main.showEvent("FurnaceSmeltEvent",e);}
	@EventHandler	public void onEvent(InventoryClickEvent e){main.showEvent("InventoryClickEvent",e);}
	@EventHandler	public void onEvent(InventoryCloseEvent e){main.showEvent("InventoryCloseEvent",e);}
	@EventHandler	public void onEvent(InventoryCreativeEvent e){main.showEvent("InventoryCreativeEvent",e);}
	@EventHandler	public void onEvent(InventoryDragEvent e){main.showEvent("InventoryDragEvent",e);}
	@EventHandler	public void onEvent(InventoryEvent e){main.showEvent("InventoryEvent",e);}
	@EventHandler	public void onEvent(InventoryMoveItemEvent e){main.showEvent("InventoryMoveItemEvent",e);}
	@EventHandler	public void onEvent(InventoryOpenEvent e){main.showEvent("InventoryOpenEvent",e);}
	@EventHandler	public void onEvent(InventoryPickupItemEvent e){main.showEvent("InventoryPickupItemEvent",e);}
	@EventHandler	public void onEvent(PrepareItemCraftEvent e){main.showEvent("PrepareItemCraftEvent",e);}
	@EventHandler	public void onEvent(AsyncPlayerChatEvent e){main.showEvent("AsyncPlayerChatEvent",e);}
	@EventHandler	public void onEvent(AsyncPlayerPreLoginEvent e){main.showEvent("AsyncPlayerPreLoginEvent",e);}
	@EventHandler	public void onEvent(PlayerAchievementAwardedEvent e){main.showEvent("PlayerAchievementAwardedEvent",e);}
	@EventHandler	public void onEvent(PlayerAnimationEvent e){main.showEvent("PlayerAnimationEvent",e);}
	@EventHandler	public void onEvent(PlayerArmorStandManipulateEvent e){main.showEvent("PlayerArmorStandManipulateEvent",e);}
	@EventHandler	public void onEvent(PlayerBedEnterEvent e){main.showEvent("PlayerBedEnterEvent",e);}
	@EventHandler	public void onEvent(PlayerBedLeaveEvent e){main.showEvent("PlayerBedLeaveEvent",e);}
	@EventHandler	public void onEvent(PlayerBucketEmptyEvent e){main.showEvent("PlayerBucketEmptyEvent",e);}
	@EventHandler	public void onEvent(PlayerBucketFillEvent e){main.showEvent("PlayerBucketFillEvent",e);}
	@EventHandler	public void onEvent(PlayerChangedWorldEvent e){main.showEvent("PlayerChangedWorldEvent",e);}
	@EventHandler	public void onEvent(PlayerChatTabCompleteEvent e){main.showEvent("PlayerChatTabCompleteEvent",e);}
	@EventHandler	public void onEvent(PlayerCommandPreprocessEvent e){main.showEvent("PlayerCommandPreprocessEvent",e);}
	@EventHandler	public void onEvent(PlayerDropItemEvent e){main.showEvent("PlayerDropItemEvent",e);}
	@EventHandler	public void onEvent(PlayerEditBookEvent e){main.showEvent("PlayerEditBookEvent",e);}
	@EventHandler	public void onEvent(PlayerEggThrowEvent e){main.showEvent("PlayerEggThrowEvent",e);}
	@EventHandler	public void onEvent(PlayerExpChangeEvent e){main.showEvent("PlayerExpChangeEvent",e);}
	@EventHandler	public void onEvent(PlayerFishEvent e){main.showEvent("PlayerFishEvent",e);}
	@EventHandler	public void onEvent(PlayerGameModeChangeEvent e){main.showEvent("PlayerGameModeChangeEvent",e);}
	@EventHandler	public void onEvent(PlayerInteractAtEntityEvent e){main.showEvent("PlayerInteractAtEntityEvent",e);}
	@EventHandler	public void onEvent(PlayerInteractEntityEvent e){main.showEvent("PlayerInteractEntityEvent",e);}
	@EventHandler	public void onEvent(PlayerInteractEvent e){main.showEvent("PlayerInteractEvent",e,e.getPlayer().getName(),e.getAction().name());}
	@EventHandler	public void onEvent(PlayerItemBreakEvent e){main.showEvent("PlayerItemBreakEvent",e);}
	@EventHandler	public void onEvent(PlayerItemConsumeEvent e){main.showEvent("PlayerItemConsumeEvent",e);}
	@EventHandler	public void onEvent(PlayerItemDamageEvent e){main.showEvent("PlayerItemDamageEvent",e);}
	@EventHandler	public void onEvent(PlayerItemHeldEvent e){main.showEvent("PlayerItemHeldEvent",e);}
	@EventHandler	public void onEvent(PlayerJoinEvent e){main.showEvent("PlayerJoinEvent",e);}
	@EventHandler	public void onEvent(PlayerKickEvent e){main.showEvent("PlayerKickEvent",e);}
	@EventHandler	public void onEvent(PlayerLevelChangeEvent e){main.showEvent("PlayerLevelChangeEvent",e);}
	@EventHandler	public void onEvent(PlayerLoginEvent e){main.showEvent("PlayerLoginEvent",e);}
	@EventHandler	public void onEvent(PlayerMoveEvent e){main.showEvent("PlayerMoveEvent",e,e.getPlayer().getName());}
	@EventHandler	public void onEvent(PlayerPickupItemEvent e){main.showEvent("PlayerPickupItemEvent",e);}
	@EventHandler	public void onEvent(PlayerPortalEvent e){main.showEvent("PlayerPortalEvent",e);}
	@EventHandler	public void onEvent(PlayerQuitEvent e){main.showEvent("PlayerQuitEvent",e,e.getPlayer().getName());}
	@EventHandler	public void onEvent(PlayerRegisterChannelEvent e){main.showEvent("PlayerRegisterChannelEvent",e);}
	@EventHandler	public void onEvent(PlayerRespawnEvent e){main.showEvent("PlayerRespawnEvent",e);}
	@EventHandler	public void onEvent(PlayerShearEntityEvent e){main.showEvent("PlayerShearEntityEvent",e);}
	@EventHandler	public void onEvent(PlayerStatisticIncrementEvent e){main.showEvent("PlayerStatisticIncrementEvent",e,e.getPlayer().getName(),e.getStatistic().name(),e.getNewValue());}
	@EventHandler	public void onEvent(PlayerTeleportEvent e){main.showEvent("PlayerTeleportEvent",e);}
	@EventHandler	public void onEvent(PlayerToggleFlightEvent e){main.showEvent("PlayerToggleFlightEvent",e);}
	@EventHandler	public void onEvent(PlayerToggleSneakEvent e){main.showEvent("PlayerToggleSneakEvent",e);}
	@EventHandler	public void onEvent(PlayerToggleSprintEvent e){main.showEvent("PlayerToggleSprintEvent",e);}
	@EventHandler	public void onEvent(PlayerUnleashEntityEvent e){main.showEvent("PlayerUnleashEntityEvent",e);}
	@EventHandler	public void onEvent(PlayerUnregisterChannelEvent e){main.showEvent("PlayerUnregisterChannelEvent",e);}
	@EventHandler	public void onEvent(PlayerVelocityEvent e){main.showEvent("PlayerVelocityEvent",e);}
	@EventHandler	public void onEvent(MapInitializeEvent e){main.showEvent("MapInitializeEvent",e);}
	@EventHandler	public void onEvent(PluginDisableEvent e){main.showEvent("PluginDisableEvent",e);}
	@EventHandler	public void onEvent(PluginEnableEvent e){main.showEvent("PluginEnableEvent",e);}
	@EventHandler	public void onEvent(RemoteServerCommandEvent e){main.showEvent("RemoteServerCommandEvent",e);}
	@EventHandler	public void onEvent(ServerCommandEvent e){main.showEvent("ServerCommandEvent",e);}
	@EventHandler	public void onEvent(ServerListPingEvent e){main.showEvent("ServerListPingEvent",e);}
	@EventHandler	public void onEvent(ServiceRegisterEvent e){main.showEvent("ServiceRegisterEvent",e);}
	@EventHandler	public void onEvent(ServiceUnregisterEvent e){main.showEvent("ServiceUnregisterEvent",e);}
	@EventHandler	public void onEvent(VehicleBlockCollisionEvent e){main.showEvent("VehicleBlockCollisionEvent",e);}
	@EventHandler	public void onEvent(VehicleCreateEvent e){main.showEvent("VehicleCreateEvent",e);}
	@EventHandler	public void onEvent(VehicleDamageEvent e){main.showEvent("VehicleDamageEvent",e);}
	@EventHandler	public void onEvent(VehicleDestroyEvent e){main.showEvent("VehicleDestroyEvent",e);}
	@EventHandler	public void onEvent(VehicleEnterEvent e){main.showEvent("VehicleEnterEvent",e);}
	@EventHandler	public void onEvent(VehicleEntityCollisionEvent e){main.showEvent("VehicleEntityCollisionEvent",e);}
	@EventHandler	public void onEvent(VehicleExitEvent e){main.showEvent("VehicleExitEvent",e);}
	@EventHandler	public void onEvent(VehicleMoveEvent e){main.showEvent("VehicleMoveEvent",e);}
	@EventHandler	public void onEvent(VehicleUpdateEvent e){main.showEvent("VehicleUpdateEvent",e);}
	@EventHandler	public void onEvent(LightningStrikeEvent e){main.showEvent("LightningStrikeEvent",e);}
	@EventHandler	public void onEvent(ThunderChangeEvent e){main.showEvent("ThunderChangeEvent",e);}
	@EventHandler	public void onEvent(WeatherChangeEvent e){main.showEvent("WeatherChangeEvent",e);}
	@EventHandler	public void onEvent(ChunkLoadEvent e){main.showEvent("ChunkLoadEvent",e,e.getChunk().getX(),e.getChunk().getZ());}
	@EventHandler	public void onEvent(ChunkPopulateEvent e){main.showEvent("ChunkPopulateEvent",e,e.getChunk().getX(),e.getChunk().getZ());}
	@EventHandler	public void onEvent(ChunkUnloadEvent e){main.showEvent("ChunkUnloadEvent",e,e.getChunk().getX(),e.getChunk().getZ());}
	@EventHandler	public void onEvent(PortalCreateEvent e){main.showEvent("PortalCreateEvent",e,e.getBlocks().get(0).getLocation());}
	@EventHandler	public void onEvent(SpawnChangeEvent e){main.showEvent("SpawnChangeEvent",e);}
	@EventHandler	public void onEvent(StructureGrowEvent e){main.showEvent("StructureGrowEvent",e);}
	@EventHandler	public void onEvent(WorldInitEvent e){main.showEvent("WorldInitEvent",e,e.getWorld().getName());}
	@EventHandler	public void onEvent(WorldLoadEvent e){main.showEvent("WorldLoadEvent",e,e.getWorld().getName());}
	@EventHandler	public void onEvent(WorldSaveEvent e){main.showEvent("WorldSaveEvent",e,e.getWorld().getName());}
	@EventHandler	public void onEvent(WorldUnloadEvent e){main.showEvent("WorldUnloadEvent",e,e.getWorld().getName());}
}
