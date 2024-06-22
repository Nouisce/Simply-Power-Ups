
package net.mcreator.simplypowerups.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.simplypowerups.procedures.SpeedPowerup3BaubleIsUnequippedProcedure;
import net.mcreator.simplypowerups.procedures.SpeedPowerup3BaubleIsEquippedProcedure;

public class SpeedPowerup3Item extends Item implements ICurioItem {
	public SpeedPowerup3Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		SpeedPowerup3BaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		SpeedPowerup3BaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
