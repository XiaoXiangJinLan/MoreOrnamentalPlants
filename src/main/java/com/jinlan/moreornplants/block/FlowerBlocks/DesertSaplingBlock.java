package com.jinlan.moreornplants.block.FlowerBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.Tags;

public class DesertSaplingBlock extends SaplingBlock {
    public DesertSaplingBlock(TreeGrower treeGrower, Properties properties) {
        super(treeGrower, properties);
    }

    @Override
    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(BlockTags.SAND) || pState.is(BlockTags.TERRACOTTA) || pState.is(Tags.Blocks.SANDSTONE_BLOCKS) || super.mayPlaceOn(pState, pLevel, pPos);
    }
}
