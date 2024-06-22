
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.simplypowerups.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.simplypowerups.SimplyPowerupsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SimplyPowerupsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SimplyPowerupsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(SimplyPowerupsModBlocks.BLOCK_OF_SUGAR.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(SimplyPowerupsModItems.MOB_HEART.get());
			tabData.accept(SimplyPowerupsModItems.FLIGHT_CORE.get());
			tabData.accept(SimplyPowerupsModItems.SPEED_GEM.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SimplyPowerupsModItems.HEALTH_POWERUP_1.get());
			tabData.accept(SimplyPowerupsModItems.SPEED_POWERUP_1.get());
			tabData.accept(SimplyPowerupsModItems.FLIGHT_POWERUP.get());
			tabData.accept(SimplyPowerupsModItems.POWER_UP_BASE.get());
		}
	}
}
