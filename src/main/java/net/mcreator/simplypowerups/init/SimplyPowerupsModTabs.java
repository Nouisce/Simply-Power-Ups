
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
			tabData.accept(SimplyPowerupsModItems.DRAGON_CLAW.get());
			tabData.accept(SimplyPowerupsModItems.COMPRESSED_HEART.get());
			tabData.accept(SimplyPowerupsModItems.TIER_2SPEEDGEM.get());
			tabData.accept(SimplyPowerupsModItems.WARDEN_HEART.get());
			tabData.accept(SimplyPowerupsModItems.SPEED_GEM_3.get());
			tabData.accept(SimplyPowerupsModItems.REACH_GEM.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SimplyPowerupsModItems.HEALTH_POWERUP_1.get());
			tabData.accept(SimplyPowerupsModItems.SPEED_POWERUP_1.get());
			tabData.accept(SimplyPowerupsModItems.FLIGHT_POWERUP.get());
			tabData.accept(SimplyPowerupsModItems.POWER_UP_BASE.get());
			tabData.accept(SimplyPowerupsModItems.HEALTH_POWERUP_2.get());
			tabData.accept(SimplyPowerupsModItems.HEALTH_POWER_UP_3.get());
			tabData.accept(SimplyPowerupsModItems.SPEED_POWERUP_2.get());
			tabData.accept(SimplyPowerupsModItems.SPEED_POWERUP_3.get());
			tabData.accept(SimplyPowerupsModItems.REINFORCED_WARDENHEART.get());
			tabData.accept(SimplyPowerupsModItems.ATTACK_SPEED_PWR_1.get());
			tabData.accept(SimplyPowerupsModItems.ATTACK_SPEED_PWR_2.get());
			tabData.accept(SimplyPowerupsModItems.ATTACK_SPEED_PWR_3.get());
			tabData.accept(SimplyPowerupsModItems.REACH_POWER_1.get());
			tabData.accept(SimplyPowerupsModItems.STEP_ASSIST_PWR.get());
		}
	}
}
