package com.jinlan.moreornplants.block.FlowerBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;

import javax.annotation.Nullable;

public class ModRotatedPlantBlock extends ModTallFlowerBlock  {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public ModRotatedPlantBlock(Properties p_57296_) {
        super(p_57296_);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(HALF, DoubleBlockHalf.LOWER));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(FACING);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos pos = context.getClickedPos();
        // 检查上方是否有足够的空间放置上半部分
        if (pos.getY() < context.getLevel().getMaxBuildHeight() - 1 &&
                context.getLevel().getBlockState(pos.above()).canBeReplaced(context)) {
            // 获取玩家的水平朝向（忽略上下看）
            Direction facing = context.getHorizontalDirection().getOpposite();
            return this.defaultBlockState()
                    .setValue(FACING, facing)
                    .setValue(HALF, DoubleBlockHalf.LOWER);
        }
        return null;
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState,
                                  LevelAccessor level, BlockPos currentPos, BlockPos neighborPos) {
        // 调用父类方法保持双格植物的行为
        BlockState updatedState = super.updateShape(state, direction, neighborState, level, currentPos, neighborPos);

        // 确保上下两部分的朝向保持一致
        if (state.getValue(HALF) == DoubleBlockHalf.LOWER &&
                direction == Direction.UP &&
                level.getBlockState(currentPos.above()).getBlock() == this) {
            // 设置上半部分的朝向与下半部分一致
            level.setBlock(currentPos.above(), level.getBlockState(currentPos.above())
                    .setValue(FACING, state.getValue(FACING)), 3);
        }

        return updatedState;
    }
}
