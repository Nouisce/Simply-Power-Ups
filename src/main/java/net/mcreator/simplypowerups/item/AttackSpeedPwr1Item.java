
package net.mcreator.simplypowerups.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.simplypowerups.procedures.AttackSpeedPwr1BaubleIsUnequippedProcedure;
import net.mcreator.simplypowerups.procedures.AttackSpeedPwr1BaubleIsEquippedProcedure;

public class AttackSpeedPwr1Item extends Item implements ICurioItem {
	public AttackSpeedPwr1Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		AttackSpeedPwr1BaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		AttackSpeedPwr1BaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
