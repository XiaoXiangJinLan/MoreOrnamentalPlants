package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantBodyBlock;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class WisteriaPlantBlock extends GrowingPlantBodyBlock {
    public static final MapCodec<WisteriaPlantBlock> CODEC = simpleCodec(WisteriaPlantBlock::new);
    public static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);
    public static final BooleanProperty TOP = BooleanProperty.create("top");

    @Override
    protected @NotNull MapCodec<? extends GrowingPlantBodyBlock> codec() {
        return CODEC;
    }

    public WisteriaPlantBlock(Properties properties) {
        super(properties, Direction.DOWN, SHAPE, false);
        this.registerDefaultState(this.stateDefinition.any().setValue(TOP, false));
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
    protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(TOP);
    }

    @Override
    protected @NotNull GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) ModBlocks.CHINESE_WISTERIA.get();
    }

    @Override
    public void onPlace(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull BlockState state1, boolean isMoving) {
        super.onPlace(state, level, pos, state1, isMoving);
        updateTop(level, pos, state);
    }

    @Override
    public void neighborChanged(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Block block, @NotNull BlockPos neighborPos, boolean movedByPiston) {
        super.neighborChanged(state, level, pos, block, neighborPos, movedByPiston);
        if (neighborPos.equals(pos.above())) {
            updateTop(level, pos, state);
        }
    }

    @Override
    public boolean canSurvive(@NotNull BlockState state, LevelReader level, BlockPos pos) {
        BlockPos abovePos = pos.above();
        BlockState aboveState = level.getBlockState(abovePos);

        boolean canSurvive = isSupportedBlock(aboveState, level, pos) ||
                aboveState.is(this.getHeadBlock()) ||
                aboveState.is(this);

        if (canSurvive && level instanceof Level) {
            updateTop((Level) level, pos, state);
        }

        return canSurvive;
    }

    private void updateTop(Level level, BlockPos pos, BlockState state) {
        BlockPos abovePos = pos.above();
        BlockState aboveState = level.getBlockState(abovePos);
        boolean isTop = isSupportedBlock(aboveState, level, pos);

        if (state.getValue(TOP) != isTop) {
            level.setBlock(pos, state.setValue(TOP, isTop), 3);
        }
    }

    private boolean isSupportedBlock(BlockState state, BlockGetter level, @NotNull BlockPos pos) {
        return state.isFaceSturdy(level, pos, Direction.DOWN) ||
                state.is(BlockTags.LEAVES);
    }
}
