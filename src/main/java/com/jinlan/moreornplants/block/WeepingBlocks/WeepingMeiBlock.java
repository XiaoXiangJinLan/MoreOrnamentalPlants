package com.jinlan.moreornplants.block.WeepingBlocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class WeepingMeiBlock extends GrowingPlantHeadBlock {
    protected static final VoxelShape SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
    public static final MapCodec<WeepingMeiBlock> CODEC = simpleCodec(WeepingMeiBlock::new);

    public WeepingMeiBlock(Properties properties) {
        super(properties, Direction.DOWN, SHAPE, false, 0.1D);
    }

    @Override
    public boolean isFlammable(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction direction) {
        return 60;
    }

    @Override
    public int getFireSpreadSpeed(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction direction) {
        return 30;
    }

    @Override
    protected @NotNull MapCodec<? extends GrowingPlantHeadBlock> codec() {
        return CODEC;
    }

    @Override
    protected int getBlocksToGrowWhenBonemealed(@NotNull RandomSource pRandom) {
        return 1;
    }

    @Override
    protected boolean canGrowInto(BlockState state) {
        return state.isAir();
    }

    @Override
    protected @NotNull Block getBodyBlock() {
        return null;
    }

    @Override
    public boolean canSurvive(@NotNull BlockState state, LevelReader level, BlockPos pos) {
        BlockPos abovePos = pos.above();
        BlockState aboveState = level.getBlockState(abovePos);

        return isSupportedBlock(aboveState, level, pos) ||
                aboveState.is(this.getBodyBlock()) ||
                aboveState.is(this);
    }

    private boolean isSupportedBlock(BlockState state, BlockGetter level, @NotNull BlockPos pos) {
        return state.is(BlockTags.LEAVES) ||
                state.isFaceSturdy(level, pos, Direction.DOWN);
    }
}
