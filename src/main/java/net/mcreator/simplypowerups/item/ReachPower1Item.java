
package net.mcreator.simplypowerups.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.simplypowerups.procedures.ReachPower1BaubleIsUnequippedProcedure;
import net.mcreator.simplypowerups.procedures.ReachPower1BaubleIsEquippedProcedure;

public class ReachPower1Item extends Item implements ICurioItem {
	public ReachPower1Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		ReachPower1BaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		ReachPower1BaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
