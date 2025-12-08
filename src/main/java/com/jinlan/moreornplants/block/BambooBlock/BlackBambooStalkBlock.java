package com.jinlan.moreornplants.block.BambooBlock;

import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BambooStalkBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BambooLeaves;

import javax.annotation.Nullable;

public class BlackBambooStalkBlock extends BambooStalkBlock {
    public BlackBambooStalkBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        return level.getBlockState(pos.below()).is(ModTags.Blocks.BLACK_BAMBOO_PLANTABLE_ON);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        if (!context.getLevel().getFluidState(context.getClickedPos()).isEmpty()) {
            return null;
        }

        BlockState belowState = context.getLevel().getBlockState(context.getClickedPos().below());

        if (belowState.is(ModTags.Blocks.BLACK_BAMBOO_PLANTABLE_ON)) {
            if (belowState.is(ModBlocks.BLACK_BAMBOO_SAPLING.get())) {
                return this.defaultBlockState().setValue(AGE, 0);
            } else if (belowState.is(ModBlocks.BLACK_BAMBOO.get())) {
                int age = belowState.getValue(AGE) > 0 ? 1 : 0;
                return this.defaultBlockState().setValue(AGE, age);
            } else {
                BlockState aboveState = context.getLevel().getBlockState(context.getClickedPos().above());
                return aboveState.is(ModBlocks.BLACK_BAMBOO.get()) ?
                        this.defaultBlockState().setValue(AGE, aboveState.getValue(AGE)) :
                        ModBlocks.BLACK_BAMBOO_SAPLING.get().defaultBlockState();
            }
        }

        return null;
    }

    @Override
    public BlockState updateShape(BlockState pState, Direction pDirection, BlockState pNeighborState, LevelAccessor pLevel, BlockPos pPos, BlockPos pNeighborPos) {
        if (!pState.canSurvive(pLevel, pPos)) {
            pLevel.scheduleTick(pPos, this, 1);
        }

        if (pDirection == Direction.UP && pNeighborState.is(ModBlocks.BLACK_BAMBOO.get()) && pNeighborState.getValue(AGE) > pState.getValue(AGE)) {
            pLevel.setBlock(pPos, pState.cycle(AGE), 2);
        }

        return super.updateShape(pState, pDirection, pNeighborState, pLevel, pPos, pNeighborPos);
    }

    @Override
    protected void growBamboo(BlockState pState, Level pLevel, BlockPos pPos, RandomSource pRandom, int pAge) {
        BlockState blockstate = pLevel.getBlockState(pPos.below());
        BlockPos blockpos = pPos.below(2);
        BlockState blockstate1 = pLevel.getBlockState(blockpos);
        BambooLeaves bambooleaves = BambooLeaves.NONE;
        if (pAge >= 1) {
            if (blockstate.is(ModBlocks.BLACK_BAMBOO.get()) && blockstate.getValue(LEAVES) != BambooLeaves.NONE) {
                if (blockstate.is(ModBlocks.BLACK_BAMBOO.get()) && blockstate.getValue(LEAVES) != BambooLeaves.NONE) {
                    bambooleaves = BambooLeaves.LARGE;
                    if (blockstate1.is(ModBlocks.BLACK_BAMBOO.get())) {
                        pLevel.setBlock(pPos.below(), blockstate.setValue(LEAVES, BambooLeaves.SMALL), 3);
                        pLevel.setBlock(blockpos, blockstate1.setValue(LEAVES, BambooLeaves.NONE), 3);
                    }
                }
            } else {
                bambooleaves = BambooLeaves.SMALL;
            }
        }

        int i = pState.getValue(AGE) != 1 && !blockstate1.is(ModBlocks.BLACK_BAMBOO.get()) ? 0 : 1;
        int j = (pAge < 11 || !(pRandom.nextFloat() < 0.25F)) && pAge != 15 ? 0 : 1;
        pLevel.setBlock(pPos.above(), this.defaultBlockState().setValue(AGE, Integer.valueOf(i)).setValue(LEAVES, bambooleaves).setValue(STAGE, Integer.valueOf(j)), 3);
    }

    @Override
    protected int getHeightAboveUpToMax(BlockGetter pLevel, BlockPos pPos) {
        int i;
        for(i = 0; i < 16 && pLevel.getBlockState(pPos.above(i + 1)).is(ModBlocks.BLACK_BAMBOO.get()); ++i) {
        }

        return i;
    }

    @Override
    protected int getHeightBelowUpToMax(BlockGetter pLevel, BlockPos pPos) {
        int i;
        for(i = 0; i < 16 && pLevel.getBlockState(pPos.below(i + 1)).is(ModBlocks.BLACK_BAMBOO.get()); ++i) {
        }

        return i;
    }
}