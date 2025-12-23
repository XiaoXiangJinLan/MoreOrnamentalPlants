package com.jinlan.moreornplants.block.WeepingBlocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.WorldView;

public class WeepingMeiBlock extends AbstractPlantStemBlock {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(1.0F, 0.0F, 1.0F, 15.0F, 16.0F, 15.0F);

    public WeepingMeiBlock(AbstractBlock.Settings settings) {
        super(settings, Direction.DOWN, SHAPE, false, 0.1);
    }

    @Override
    protected int getGrowthLength(Random random) {
        return 1;
    }

    @Override
    protected boolean chooseStemState(BlockState state) {
        return state.isAir();
    }

    @Override
    protected Block getPlant() {
        return null;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView level, BlockPos pos) {
        BlockPos abovePos = pos.up();
        BlockState aboveState = level.getBlockState(abovePos);

        return isSupportedBlock(aboveState) ||
                aboveState.isOf(this.getPlant()) ||
                aboveState.isOf(this);
    }

    private boolean isSupportedBlock(BlockState state) {
        return state.isIn(BlockTags.LEAVES) ||
                state.isIn(BlockTags.LOGS);
    }
}
