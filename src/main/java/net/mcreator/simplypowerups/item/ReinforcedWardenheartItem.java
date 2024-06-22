
package net.mcreator.simplypowerups.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ReinforcedWardenheartItem extends Item {
	public ReinforcedWardenheartItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
