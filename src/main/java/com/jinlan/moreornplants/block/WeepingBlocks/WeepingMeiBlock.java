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
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 60;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
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
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos abovePos = pos.above();
        BlockState aboveState = level.getBlockState(abovePos);

        // 只能生长在树叶或原木上
        return isSupportedBlock(aboveState) ||
                aboveState.is(this.getBodyBlock()) ||
                aboveState.is(this);
    }

    // 检查方块是否是树叶或原木
    private boolean isSupportedBlock(BlockState state) {
        return state.is(BlockTags.LEAVES) ||
                state.is(BlockTags.LOGS);
    }
}
