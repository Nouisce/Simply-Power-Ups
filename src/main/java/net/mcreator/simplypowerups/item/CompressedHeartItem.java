
package net.mcreator.simplypowerups.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CompressedHeartItem extends Item {
	public CompressedHeartItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
