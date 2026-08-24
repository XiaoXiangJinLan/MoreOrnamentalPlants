package com.jinlan.moreornplants.block.WaterPlantsBlock;

import com.jinlan.moreornplants.init.ModParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TallMuxueGrassBlock extends DoublePlantBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public TallMuxueGrassBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(WATERLOGGED);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos pos = context.getClickedPos();
        Level level = context.getLevel();
        if (pos.getY() < level.getMaxBuildHeight() - 2 &&
                level.getBlockState(pos.below()).isFaceSturdy(level, pos.below(), Direction.UP) &&
                level.getFluidState(pos).getType() == Fluids.WATER && level.getFluidState(pos).getAmount() == 8 &&
                level.getFluidState(pos.above()).getType() == Fluids.WATER && level.getFluidState(pos.above()).getAmount() == 8) {
            return this.defaultBlockState()
                    .setValue(HALF, DoubleBlockHalf.LOWER)
                    .setValue(WATERLOGGED, true);
        }
        return null;
    }

    @Override
    public boolean canSurvive(BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
        if (state.getValue(HALF) == DoubleBlockHalf.UPPER) {
            BlockState belowState = level.getBlockState(pos.below());
            return belowState.is(this) &&
                    belowState.getValue(HALF) == DoubleBlockHalf.LOWER &&
                    belowState.getValue(WATERLOGGED) &&
                    state.getValue(WATERLOGGED) &&
                    level.getFluidState(pos).getType() == Fluids.WATER &&
                    level.getFluidState(pos).getAmount() == 8;
        } else {
            BlockPos belowPos = pos.below();
            return level.getBlockState(belowPos).isFaceSturdy(level, belowPos, Direction.UP) &&
                    state.getValue(WATERLOGGED) &&
                    level.getFluidState(pos).getType() == Fluids.WATER &&
                    level.getFluidState(pos).getAmount() == 8;
        }
    }
    @Override
    public void setPlacedBy(Level level, BlockPos pos, @NotNull BlockState state, @NotNull LivingEntity placer, @NotNull ItemStack stack) {
        BlockPos abovePos = pos.above();
        BlockState aboveState = this.defaultBlockState()
                .setValue(HALF, DoubleBlockHalf.UPPER)
                .setValue(WATERLOGGED, true);
        level.setBlock(abovePos, aboveState, 3);
    }

    @Override
    public @NotNull BlockState updateShape(BlockState state, @NotNull Direction direction, @NotNull BlockState neighborState,
                                           @NotNull LevelAccessor level, @NotNull BlockPos pos, @NotNull BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }

        if (!state.canSurvive(level, pos)) {
            return net.minecraft.world.level.block.Blocks.AIR.defaultBlockState();
        }

        if (state.getValue(HALF) == DoubleBlockHalf.LOWER) {
            BlockPos abovePos = pos.above();
            BlockState aboveState = level.getBlockState(abovePos);
            if (aboveState.is(this) && aboveState.getValue(HALF) == DoubleBlockHalf.UPPER) {
                boolean shouldWaterlog = state.getValue(WATERLOGGED);
                if (aboveState.getValue(WATERLOGGED) != shouldWaterlog) {
                    level.setBlock(abovePos, aboveState.setValue(WATERLOGGED, shouldWaterlog), 3);
                }
            }
        }

        return super.updateShape(state, direction, neighborState, level, pos, neighborPos);
    }

    @Override
    public @NotNull FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public void animateTick(@NotNull BlockState state, @NotNull Level world, @NotNull BlockPos pos, @NotNull RandomSource random) {
        super.animateTick(state, world, pos, random);
        if (random.nextInt(10) == 0) {
            double x = pos.getX() + random.nextDouble();
            double y = pos.getY() + random.nextDouble();
            double z = pos.getZ() + random.nextDouble();
            world.addParticle(ModParticleTypes.MUXUE.get(), x, y, z, 0.0, 0.0, 0.0);
        }
    }
}
