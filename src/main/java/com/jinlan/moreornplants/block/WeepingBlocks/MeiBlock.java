package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import org.jetbrains.annotations.NotNull;

public class MeiBlock extends PeachBlock {
    public static final BooleanProperty PINK = BooleanProperty.create("pink");
    public MeiBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(PINK, false)
                .setValue(WATERLOGGED, false));
    }

    @Override
    public void randomTick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        super.randomTick(state, level, pos, random);

        int age = state.getValue(AGE);
        boolean isCorrectBiome = level.getBiome(pos).is(ModTags.Biomes.APRICOT_BEARING);
        if (age < 1) {
            int growthChance = isCorrectBiome ? 3 : 1;
            if (random.nextInt(5) < growthChance) {
                level.setBlock(pos, state.setValue(AGE, age + 1), 3);
            }
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(PINK);
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
        boolean isPink = isPinkMeiLeaves(aboveState);

        if (state.getValue(PINK) != isPink) {
            level.setBlock(pos, state.setValue(PINK, isPink), 3);
        }
    }

    private boolean isPinkMeiLeaves(BlockState state) {
        return state.is(ModBlocks.PINK_MEI_LEAVES);
    }
}
