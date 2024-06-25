
package net.mcreator.simplypowerups.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.simplypowerups.procedures.AttackSpeedPwr3BaubleIsUnequippedProcedure;
import net.mcreator.simplypowerups.procedures.AttackSpeedPwr3BaubleIsEquippedProcedure;

public class AttackSpeedPwr3Item extends Item implements ICurioItem {
	public AttackSpeedPwr3Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		AttackSpeedPwr3BaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		AttackSpeedPwr3BaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
