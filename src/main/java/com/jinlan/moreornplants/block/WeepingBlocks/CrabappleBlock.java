package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class CrabappleBlock extends PeachBlock {
    public static final BooleanProperty WHITE = BooleanProperty.create("white");
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public CrabappleBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(WHITE, false)
                .setValue(FACING, Direction.NORTH)
                .setValue(WATERLOGGED, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(WHITE, FACING);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState state = super.getStateForPlacement(context);
        if (state != null) {
            return state.setValue(FACING, context.getHorizontalDirection().getOpposite());
        }
        return null;
    }

    @Override
    public void randomTick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        super.randomTick(state, level, pos, random);

        int age = state.getValue(AGE);
        if (age < 1) {
            int chance = level.getBiome(pos).is(ModTags.Biomes.CRABAPPLE_BEARING) ? 20 : 40;
            if (random.nextInt(chance) == 0) {
                level.setBlock(pos, state.setValue(AGE, age + 1), 3);
            }
        }
    }

    @Override
    public void onPlace(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull BlockState state1, boolean isMoving) {
        super.onPlace(state, level, pos, state1, isMoving);
        updateState(level, pos, state);
    }

    @Override
    public void neighborChanged(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Block block, @NotNull BlockPos neighborPos, boolean movedByPiston) {
        super.neighborChanged(state, level, pos, block, neighborPos, movedByPiston);
        if (neighborPos.equals(pos.above())) {
            updateState(level, pos, state);
        }
    }

    private void updateState(Level level, BlockPos pos, BlockState state) {
        BlockPos abovePos = pos.above();
        BlockState aboveState = level.getBlockState(abovePos);
        boolean isWhite = isWhiteCrabappleLeaves(aboveState);

        if (state.getValue(WHITE) != isWhite) {
            level.setBlock(pos, state.setValue(WHITE, isWhite), 3);
        }
    }

    private boolean isWhiteCrabappleLeaves(BlockState state) {
        return state.is(ModBlocks.WHITE_CRABAPPLE_LEAVES);
    }
}
