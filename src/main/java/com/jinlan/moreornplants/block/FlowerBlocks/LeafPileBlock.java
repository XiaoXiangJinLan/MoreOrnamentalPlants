package com.jinlan.moreornplants.block.FlowerBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class LeafPileBlock extends WaterlilyBlock {
    protected static final VoxelShape AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D);
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public LeafPileBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH));
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
    @NotNull
    public VoxelShape getShape(@NotNull BlockState pState, @NotNull BlockGetter pLevel, @NotNull BlockPos pPos, @NotNull CollisionContext pContext) {
        return AABB;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, @NotNull BlockPos pos) {
        FluidState fluidstate = level.getFluidState(pos);
        FluidState fluidstate1 = level.getFluidState(pos.above());
        boolean canPlaceOnWater = (fluidstate.getType() == Fluids.WATER || state.getBlock() instanceof IceBlock) && fluidstate1.getType() == Fluids.EMPTY;

        boolean canPlaceOnFullSurface = state.isFaceSturdy(level, pos, Direction.UP) && state.getBlock() != Blocks.AIR;

        boolean canPlaceOnFarmlandOrLeaves = state.getBlock() instanceof FarmBlock || state.is(BlockTags.LEAVES);

        return canPlaceOnWater || canPlaceOnFullSurface || canPlaceOnFarmlandOrLeaves;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }
}
