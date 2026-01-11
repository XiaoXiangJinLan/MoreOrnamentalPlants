package com.jinlan.moreornplants.block.BambooBlocks;

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
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class MottledBambooStalkBlock extends BambooStalkBlock {
    public MottledBambooStalkBlock(Properties properties) {
        super(properties);
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
        return 60;
    }

    @Override
    public boolean canSurvive(@NotNull BlockState state, LevelReader level, BlockPos pos) {
        return level.getBlockState(pos.below()).is(ModTags.Blocks.MOTTLED_BAMBOO_PLANTABLE_ON);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        if (!context.getLevel().getFluidState(context.getClickedPos()).isEmpty()) {
            return null;
        }

        BlockState belowState = context.getLevel().getBlockState(context.getClickedPos().below());

        if (belowState.is(ModTags.Blocks.MOTTLED_BAMBOO_PLANTABLE_ON)) {
            if (belowState.is(ModBlocks.MOTTLED_BAMBOO_SAPLING.get())) {
                return this.defaultBlockState().setValue(AGE, 0);
            } else if (belowState.is(ModBlocks.MOTTLED_BAMBOO.get())) {
                int age = belowState.getValue(AGE) > 0 ? 1 : 0;
                return this.defaultBlockState().setValue(AGE, age);
            } else {
                BlockState aboveState = context.getLevel().getBlockState(context.getClickedPos().above());
                return aboveState.is(ModBlocks.MOTTLED_BAMBOO.get()) ?
                        this.defaultBlockState().setValue(AGE, aboveState.getValue(AGE)) :
                        ModBlocks.MOTTLED_BAMBOO_SAPLING.get().defaultBlockState();
            }
        }

        return null;
    }

    @Override
    @NotNull
    public BlockState updateShape(BlockState pState, Direction pDirection, BlockState pNeighborState, LevelAccessor pLevel, BlockPos pPos, BlockPos pNeighborPos) {
        if (!pState.canSurvive(pLevel, pPos)) {
            pLevel.scheduleTick(pPos, this, 1);
        }

        if (pDirection == Direction.UP && pNeighborState.is(ModBlocks.MOTTLED_BAMBOO.get()) && pNeighborState.getValue(AGE) > pState.getValue(AGE)) {
            pLevel.setBlock(pPos, pState.cycle(AGE), 2);
        }

        return super.updateShape(pState, pDirection, pNeighborState, pLevel, pPos, pNeighborPos);
    }

    @Override
    protected void growBamboo(@NotNull BlockState state, Level level, BlockPos pos, @NotNull RandomSource random, int age) {
        BlockState blockstate = level.getBlockState(pos.below());
        BlockPos blockpos = pos.below(2);
        BlockState blockstate1 = level.getBlockState(blockpos);
        BambooLeaves bambooleaves = BambooLeaves.NONE;
        if (age >= 1) {
            if (!blockstate.is(ModBlocks.MOTTLED_BAMBOO) || blockstate.getValue(LEAVES) == BambooLeaves.NONE) {
                bambooleaves = BambooLeaves.SMALL;
            } else if (blockstate.is(ModBlocks.MOTTLED_BAMBOO) && blockstate.getValue(LEAVES) != BambooLeaves.NONE) {
                bambooleaves = BambooLeaves.LARGE;
                if (blockstate1.is(ModBlocks.MOTTLED_BAMBOO)) {
                    level.setBlock(pos.below(), blockstate.setValue(LEAVES, BambooLeaves.SMALL), 3);
                    level.setBlock(blockpos, blockstate1.setValue(LEAVES, BambooLeaves.NONE), 3);
                }
            }
        }

        int i = state.getValue(AGE) != 1 && !blockstate1.is(ModBlocks.MOTTLED_BAMBOO) ? 0 : 1;
        int j = (age < 11 || !(random.nextFloat() < 0.25F)) && age != 15 ? 0 : 1;
        level.setBlock(
                pos.above(), this.defaultBlockState().setValue(AGE, i).setValue(LEAVES, bambooleaves).setValue(STAGE, j), 3
        );
    }

    @Override
    protected int getHeightAboveUpToMax(@NotNull BlockGetter pLevel, @NotNull BlockPos pPos) {
        int i = 0;
        while (i < 16 && pLevel.getBlockState(pPos.above(i + 1)).is(ModBlocks.MOTTLED_BAMBOO.get())) {
            i++;
        }
        return i;
    }

    @Override
    protected int getHeightBelowUpToMax(@NotNull BlockGetter pLevel, @NotNull BlockPos pPos) {
        int i= 0;
        while (i < 16 && pLevel.getBlockState(pPos.below(i + 1)).is(ModBlocks.MOTTLED_BAMBOO.get())) {
            i++;
        }
        return i;
    }
}