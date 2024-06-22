
package net.mcreator.simplypowerups.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WardenHeartItem extends Item {
	public WardenHeartItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
