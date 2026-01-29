package com.jinlan.moreornplants.block.xiangnangBlocks;

import com.jinlan.moreornplants.block.ModBlockEntities;
import com.jinlan.moreornplants.block.entity.xiangnang.MeiXiangnangBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MeiXiangnangBlock extends BaseEntityBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty HANGING = BlockStateProperties.HANGING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape STANDING_SHAPE = Shapes.or(Block.box(4.0, 0.0, 4.0, 12.0, 3.0, 12.0));
    protected static final VoxelShape HANGING_SHAPE = Shapes.or(Block.box(6.0, 8.0, 6.0, 10.0, 16.0, 10.0));

    public MeiXiangnangBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(HANGING, false)
                .setValue(WATERLOGGED, false));
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(FACING, HANGING, WATERLOGGED);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());

        for (Direction direction : context.getNearestLookingDirections()) {
            BlockState blockstate;

            if (direction.getAxis() == Direction.Axis.Y) {
                boolean isHanging = (direction == Direction.UP);
                blockstate = this.defaultBlockState().setValue(HANGING, isHanging).setValue(FACING, context.getHorizontalDirection().getOpposite());
            } else {
                blockstate = this.defaultBlockState().setValue(HANGING, false).setValue(FACING, direction);
            }
            if (blockstate.canSurvive(context.getLevel(), context.getClickedPos())) {
                return blockstate.setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
            }
        }

        return null;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level,
                                           BlockPos pos, CollisionContext context) {
        return state.getValue(HANGING) ? HANGING_SHAPE : STANDING_SHAPE;
    }

    @Override
    public boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, BlockPos pos) {
        Direction direction = getConnectedDirection(state).getOpposite();
        BlockPos supportPos = pos.relative(direction);
        BlockState supportState = level.getBlockState(supportPos);
        if (supportState.is(BlockTags.LEAVES)) {
            return true;
        }
        return Block.canSupportCenter(level, pos.relative(direction), direction.getOpposite());
    }

    protected static Direction getConnectedDirection(BlockState state) {
        return state.getValue(HANGING) ? Direction.DOWN : Direction.UP;
    }

    @Override
    public BlockState updateShape(BlockState pState, Direction pDirection, BlockState pNeighborState, LevelAccessor pLevel, BlockPos pPos, BlockPos pNeighborPos) {
        if (pState.getValue(WATERLOGGED)) {
            pLevel.scheduleTick(pPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
        }

        return getConnectedDirection(pState).getOpposite() == pDirection && !pState.canSurvive(pLevel, pPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(pState, pDirection, pNeighborState, pLevel, pPos, pNeighborPos);
    }

    @Override
    public FluidState getFluidState(BlockState pState) {
        return pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
    }

    @Override
    public boolean isPathfindable(BlockState pState, BlockGetter pLevel, BlockPos pPos, PathComputationType pType) {
        return false;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return new MeiXiangnangBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, @NotNull BlockState state, @NotNull BlockEntityType<T> blockEntityType) {
        // 只在服务器端tick，客户端不需要
        return level.isClientSide ? null : createTickerHelper(
                blockEntityType,
                ModBlockEntities.MEI_XIANGNANG.get(),
                MeiXiangnangBlockEntity::tick
        );
    }
}
