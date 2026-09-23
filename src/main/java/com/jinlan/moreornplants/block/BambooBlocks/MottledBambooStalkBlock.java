package com.jinlan.moreornplants.block.BambooBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BambooStalkBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BambooLeaves;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class MottledBambooStalkBlock extends BambooStalkBlock {
    private static final Direction[] HORIZONTAL_DIRS = {
            Direction.NORTH, Direction.SOUTH, Direction.EAST, Direction.WEST
    };

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
    public @NotNull BlockState updateShape(BlockState pState, @NotNull Direction pDirection, @NotNull BlockState pNeighborState,
                                           @NotNull LevelAccessor pLevel, @NotNull BlockPos pPos, @NotNull BlockPos pNeighborPos) {
        if (!pState.canSurvive(pLevel, pPos)) {
            pLevel.scheduleTick(pPos, this, 1);
        }

        if (pDirection == Direction.UP && pNeighborState.is(ModBlocks.MOTTLED_BAMBOO.get()) && pNeighborState.getValue(AGE) > pState.getValue(AGE)) {
            pLevel.setBlock(pPos, pState.cycle(AGE), 2);
        }

        return super.updateShape(pState, pDirection, pNeighborState, pLevel, pPos, pNeighborPos);
    }

    @Override
    protected void growBamboo(@NotNull BlockState pState, Level pLevel, BlockPos pPos, @NotNull RandomSource pRandom, int pAge) {
        BlockState blockstate = pLevel.getBlockState(pPos.below());
        BlockPos blockpos = pPos.below(2);
        BlockState blockstate1 = pLevel.getBlockState(blockpos);
        BambooLeaves bambooleaves = BambooLeaves.NONE;
        if (pAge >= 1) {
            if (blockstate.is(ModBlocks.MOTTLED_BAMBOO.get()) && blockstate.getValue(LEAVES) != BambooLeaves.NONE) {
                if (blockstate.is(ModBlocks.MOTTLED_BAMBOO.get()) && blockstate.getValue(LEAVES) != BambooLeaves.NONE) {
                    bambooleaves = BambooLeaves.LARGE;
                    if (blockstate1.is(ModBlocks.MOTTLED_BAMBOO.get())) {
                        pLevel.setBlock(pPos.below(), blockstate.setValue(LEAVES, BambooLeaves.SMALL), 3);
                        pLevel.setBlock(blockpos, blockstate1.setValue(LEAVES, BambooLeaves.NONE), 3);
                    }
                }
            } else {
                bambooleaves = BambooLeaves.SMALL;
            }
        }

        int i = pState.getValue(AGE) != 1 && !blockstate1.is(ModBlocks.MOTTLED_BAMBOO.get()) ? 0 : 1;
        int j = (pAge < 11 || !(pRandom.nextFloat() < 0.25F)) && pAge != 15 ? 0 : 1;
        pLevel.setBlock(pPos.above(), this.defaultBlockState().setValue(AGE, Integer.valueOf(i)).setValue(LEAVES, bambooleaves).setValue(STAGE, Integer.valueOf(j)), 3);
    }

    @Override
    protected int getHeightAboveUpToMax(@NotNull BlockGetter pLevel, @NotNull BlockPos pPos) {
        int i;
        for(i = 0; i < 16 && pLevel.getBlockState(pPos.above(i + 1)).is(ModBlocks.MOTTLED_BAMBOO.get()); ++i) {
        }

        return i;
    }

    @Override
    protected int getHeightBelowUpToMax(@NotNull BlockGetter pLevel, @NotNull BlockPos pPos) {
        int i;
        for(i = 0; i < 16 && pLevel.getBlockState(pPos.below(i + 1)).is(ModBlocks.MOTTLED_BAMBOO.get()); ++i) {
        }

        return i;
    }

    @Override
    public void randomTick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        super.randomTick(state, level, pos, random);
        if (level.getBlockState(pos.below()).getBlock() instanceof BambooStalkBlock) {
            return;
        }
        if (random.nextFloat() >= 0.05F) {
            return;
        }
        Direction chosenDir = null;
        int validCount = 0;
        for (Direction dir : HORIZONTAL_DIRS) {
            BlockPos neighborPos = pos.relative(dir);
            BlockState neighborState = level.getBlockState(neighborPos);
            if (neighborState.getBlock() instanceof BambooStalkBlock) {
                return;
            }
            if (neighborState.isAir() || neighborState.canBeReplaced()) {
                BlockState neighborBelow = level.getBlockState(neighborPos.below());
                if (neighborBelow.is(BlockTags.DIRT) || neighborBelow.is(BlockTags.SAND) ||
                        neighborBelow.is(Blocks.GRAVEL) || neighborBelow.is(Blocks.SUSPICIOUS_GRAVEL)) {
                    validCount++;
                    if (random.nextInt(validCount) == 0) {
                        chosenDir = dir;
                    }
                }
            }
        }
        if (chosenDir == null) {
            return;
        }
        level.setBlock(pos.relative(chosenDir), ModBlocks.BLACK_BAMBOO_SAPLING.get().defaultBlockState(), 3);
    }
}