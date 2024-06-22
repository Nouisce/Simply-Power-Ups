
package net.mcreator.simplypowerups.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.simplypowerups.procedures.SpeedPowerup2BaubleIsUnequippedProcedure;
import net.mcreator.simplypowerups.procedures.SpeedPowerup2BaubleIsEquippedProcedure;

public class SpeedPowerup2Item extends Item implements ICurioItem {
	public SpeedPowerup2Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		SpeedPowerup2BaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		SpeedPowerup2BaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
