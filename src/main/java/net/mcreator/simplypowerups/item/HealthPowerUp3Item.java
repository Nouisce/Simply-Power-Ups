
package net.mcreator.simplypowerups.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.simplypowerups.procedures.HealthPowerUp3BaubleIsUnequippedProcedure;
import net.mcreator.simplypowerups.procedures.HealthPowerUp3BaubleIsEquippedProcedure;

public class HealthPowerUp3Item extends Item implements ICurioItem {
	public HealthPowerUp3Item() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		HealthPowerUp3BaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		HealthPowerUp3BaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
