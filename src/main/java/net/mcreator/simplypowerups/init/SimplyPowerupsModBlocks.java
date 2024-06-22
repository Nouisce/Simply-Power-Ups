
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.simplypowerups.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.simplypowerups.block.BlockOfSugarBlock;
import net.mcreator.simplypowerups.SimplyPowerupsMod;

public class SimplyPowerupsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, SimplyPowerupsMod.MODID);
	public static final DeferredHolder<Block, Block> BLOCK_OF_SUGAR = REGISTRY.register("block_of_sugar", () -> new BlockOfSugarBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
