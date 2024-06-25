
package net.mcreator.simplypowerups.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.simplypowerups.procedures.AttackSpeedPwr2BaubleIsUnequippedProcedure;
import net.mcreator.simplypowerups.procedures.AttackSpeedPwr2BaubleIsEquippedProcedure;

public class AttackSpeedPwr2Item extends Item implements ICurioItem {
	public AttackSpeedPwr2Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		AttackSpeedPwr2BaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		AttackSpeedPwr2BaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
