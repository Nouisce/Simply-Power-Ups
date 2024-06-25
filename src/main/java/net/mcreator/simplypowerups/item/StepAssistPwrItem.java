
package net.mcreator.simplypowerups.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.simplypowerups.procedures.StepAssistPwrBaubleIsUnequippedProcedure;
import net.mcreator.simplypowerups.procedures.StepAssistPwrBaubleIsEquippedProcedure;

public class StepAssistPwrItem extends Item implements ICurioItem {
	public StepAssistPwrItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		StepAssistPwrBaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		StepAssistPwrBaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
