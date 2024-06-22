
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.simplypowerups.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.simplypowerups.item.SpeedPowerup1Item;
import net.mcreator.simplypowerups.item.SpeedGemItem;
import net.mcreator.simplypowerups.item.PowerUpBaseItem;
import net.mcreator.simplypowerups.item.MobHeartItem;
import net.mcreator.simplypowerups.item.HealthPowerup1Item;
import net.mcreator.simplypowerups.item.FlightPowerupItem;
import net.mcreator.simplypowerups.item.FlightCoreItem;
import net.mcreator.simplypowerups.SimplyPowerupsMod;

public class SimplyPowerupsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, SimplyPowerupsMod.MODID);
	public static final DeferredHolder<Item, Item> HEALTH_POWERUP_1 = REGISTRY.register("health_powerup_1", () -> new HealthPowerup1Item());
	public static final DeferredHolder<Item, Item> SPEED_POWERUP_1 = REGISTRY.register("speed_powerup_1", () -> new SpeedPowerup1Item());
	public static final DeferredHolder<Item, Item> FLIGHT_POWERUP = REGISTRY.register("flight_powerup", () -> new FlightPowerupItem());
	public static final DeferredHolder<Item, Item> POWER_UP_BASE = REGISTRY.register("power_up_base", () -> new PowerUpBaseItem());
	public static final DeferredHolder<Item, Item> MOB_HEART = REGISTRY.register("mob_heart", () -> new MobHeartItem());
	public static final DeferredHolder<Item, Item> FLIGHT_CORE = REGISTRY.register("flight_core", () -> new FlightCoreItem());
	public static final DeferredHolder<Item, Item> SPEED_GEM = REGISTRY.register("speed_gem", () -> new SpeedGemItem());
	public static final DeferredHolder<Item, Item> BLOCK_OF_SUGAR = block(SimplyPowerupsModBlocks.BLOCK_OF_SUGAR);

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
