package com.jinlan.moreornplants.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;

import javax.annotation.Nullable;

public class WaterLotusLeafBlock extends WaterLotusBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public WaterLotusLeafBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(HALF, DoubleBlockHalf.LOWER)
                .setValue(WATERLOGGED, true)
                .setValue(FACING, Direction.SOUTH)); // 默认朝北
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(FACING); // 添加方向属性
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState state = super.getStateForPlacement(context);
        if (state != null) {
            // 设置朝向为玩家放置时的水平方向
            return state.setValue(FACING, context.getHorizontalDirection().getOpposite());
        }
        return null;
    }

    @Override
    public void setPlacedBy(net.minecraft.world.level.Level level, BlockPos pos, BlockState state, net.minecraft.world.entity.LivingEntity placer, net.minecraft.world.item.ItemStack stack) {
        super.setPlacedBy(level, pos, state, placer, stack);

        // 确保上半部分也有相同的朝向
        BlockPos abovePos = pos.above();
        BlockState aboveState = level.getBlockState(abovePos);
        if (aboveState.is(this)) {
            level.setBlock(abovePos, aboveState.setValue(FACING, state.getValue(FACING)), 3);
        }
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState,
                                  LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        // 调用父类方法处理含水逻辑
        BlockState updatedState = super.updateShape(state, direction, neighborState, level, pos, neighborPos);

        // 确保上下部分的朝向保持一致
        if (!level.isClientSide() && state.getValue(HALF) == DoubleBlockHalf.LOWER) {
            BlockPos abovePos = pos.above();
            BlockState aboveState = level.getBlockState(abovePos);
            if (aboveState.is(this) && aboveState.getValue(FACING) != state.getValue(FACING)) {
                level.setBlock(abovePos, aboveState.setValue(FACING, state.getValue(FACING)), 3);
            }
        } else if (!level.isClientSide() && state.getValue(HALF) == DoubleBlockHalf.UPPER) {
            BlockPos belowPos = pos.below();
            BlockState belowState = level.getBlockState(belowPos);
            if (belowState.is(this) && belowState.getValue(FACING) != state.getValue(FACING)) {
                level.setBlock(belowPos, belowState.setValue(FACING, state.getValue(FACING)), 3);
            }
        }

        return updatedState;
    }

    @Override
    protected void growPlant(ServerLevel level, BlockPos pos, BlockState state, int newAge) {
        // 保存原有的方向（如果有）
        Direction facing = state.hasProperty(FACING) ? state.getValue(FACING) : Direction.NORTH;

        super.growPlant(level, pos, state, newAge);

        // 重新设置方向（如果因为setBlock丢失了）
        if (state.hasProperty(FACING)) {
            BlockPos currentPos = pos;
            if (state.getValue(HALF) == DoubleBlockHalf.UPPER) {
                currentPos = pos.below(); // 获取下半部分的位置
            }

            BlockState newState = level.getBlockState(currentPos);
            if (newState.is(this) && newState.getValue(FACING) != facing) {
                level.setBlock(currentPos, newState.setValue(FACING, facing), 3);
            }

            // 同样处理上半部分
            BlockPos abovePos = currentPos.above();
            BlockState aboveState = level.getBlockState(abovePos);
            if (aboveState.is(this) && aboveState.getValue(FACING) != facing) {
                level.setBlock(abovePos, aboveState.setValue(FACING, facing), 3);
            }
        }
    }
}
