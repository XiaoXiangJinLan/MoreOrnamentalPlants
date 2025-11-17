package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PinkWeepingMeiBlock extends GrowingPlantHeadBlock {
    protected static final VoxelShape SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);

    public PinkWeepingMeiBlock(Properties properties) {
        super(properties, Direction.DOWN, SHAPE, false, 0.1D);
    }

    @Override
    protected int getBlocksToGrowWhenBonemealed(RandomSource pRandom) {
        return 1;
    }

    @Override
    protected boolean canGrowInto(BlockState state) {
        return state.isAir();
    }

    @Override
    protected Block getBodyBlock() {
        return ModBlocks.PINK_WEEPING_MEI_PLANT.get();
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