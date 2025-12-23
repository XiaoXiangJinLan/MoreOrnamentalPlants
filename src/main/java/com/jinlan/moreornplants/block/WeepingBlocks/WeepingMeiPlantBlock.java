package com.jinlan.moreornplants.block.WeepingBlocks;

import net.minecraft.block.AbstractPlantBlock;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class WeepingMeiPlantBlock extends AbstractPlantBlock {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(1.0F, 0.0F, 1.0F, 15.0F, 16.0F, 15.0F);
    public static final BooleanProperty TOP = BooleanProperty.of("top");

    protected WeepingMeiPlantBlock(Settings settings) {
        super(settings, Direction.DOWN, SHAPE, false);
        this.setDefaultState(this.stateManager.getDefaultState().with(TOP, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add();
    }

    @Override
    protected AbstractPlantStemBlock getStem() {
        return null;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView level, BlockPos pos) {
        BlockPos abovePos = pos.up();
        BlockState aboveState = level.getBlockState(abovePos);

        boolean canPlaceAt = isSupportedBlock(aboveState) ||
                aboveState.isOf(this.getStem()) ||
                aboveState.isOf(this);

        if (canPlaceAt && level instanceof World) {
            updateTopState((World) level, pos, state);
        }

        return canPlaceAt;
    }

    private void updateTopState(World level, BlockPos pos, BlockState state) {
        BlockPos abovePos = pos.up();
        BlockState aboveState = level.getBlockState(abovePos);
        boolean isTop = isSupportedBlock(aboveState);

        if (state.get(TOP) != isTop) {
            level.setBlockState(pos, state.with(TOP, isTop), 3);
        }
    }

    @Override
    public void onBlockAdded(BlockState state, World level, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onBlockAdded(state, level, pos, oldState, isMoving);
        updateTopState(level, pos, state);
    }

    @Override
    public void neighborUpdate(BlockState state, World level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        super.neighborUpdate(state, level, pos, block, fromPos, isMoving);
        if (fromPos.equals(pos.up())) {
            updateTopState(level, pos, state);
        }
    }

    private boolean isSupportedBlock(BlockState state) {
        return state.isIn(BlockTags.LEAVES) ||
                state.isIn(BlockTags.LOGS);
    }
}
