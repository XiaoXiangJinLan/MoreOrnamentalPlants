package com.jinlan.moreornplants.block.BambooBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BambooSaplingBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BambooLeaves;

public class BlackBambooSaplingBlock extends BambooSaplingBlock {
    public BlackBambooSaplingBlock(Properties pProperties) {
        super(pProperties);
    }
    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        return level.getBlockState(pos.below()).is(ModTags.Blocks.BLACK_BAMBOO_PLANTABLE_ON);
    }

    @Override
    public ItemStack getCloneItemStack(BlockGetter level, BlockPos pos, BlockState state) {
        return new ItemStack(ModBlocks.BLACK_BAMBOO.get());
    }

    @Override
    public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
        if (!pState.canSurvive(pLevel, pCurrentPos)) {
            return Blocks.AIR.defaultBlockState();
        } else {
            if (pFacing == Direction.UP && pFacingState.is(ModBlocks.BLACK_BAMBOO.get())) {
                pLevel.setBlock(pCurrentPos, ModBlocks.BLACK_BAMBOO.get().defaultBlockState(), 2);
            }

            return super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
        }
    }

    @Override
    protected void growBamboo(Level level, BlockPos pos) {
        level.setBlock(pos.above(), ModBlocks.BLACK_BAMBOO.get().defaultBlockState().setValue(MottledBambooStalkBlock.LEAVES, BambooLeaves.SMALL), 3);
    }
}