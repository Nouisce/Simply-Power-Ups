
package net.mcreator.simplypowerups.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ReachGemItem extends Item {
	public ReachGemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
