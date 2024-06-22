
package net.mcreator.simplypowerups.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.simplypowerups.procedures.HealthPowerup2BaubleIsUnequippedProcedure;
import net.mcreator.simplypowerups.procedures.HealthPowerup2BaubleIsEquippedProcedure;

public class HealthPowerup2Item extends Item implements ICurioItem {
	public HealthPowerup2Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		HealthPowerup2BaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		HealthPowerup2BaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
