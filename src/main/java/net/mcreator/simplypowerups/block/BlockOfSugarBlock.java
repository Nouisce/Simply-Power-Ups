
package net.mcreator.simplypowerups.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import com.mojang.serialization.MapCodec;

public class BlockOfSugarBlock extends FallingBlock {
	public static final MapCodec<BlockOfSugarBlock> CODEC = simpleCodec(BlockOfSugarBlock::new);

	public MapCodec<BlockOfSugarBlock> codec() {
		return CODEC;
	}

	public BlockOfSugarBlock(BlockBehaviour.Properties ignored) {
		this();
	}

	public BlockOfSugarBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.SNARE).sound(SoundType.SAND).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
