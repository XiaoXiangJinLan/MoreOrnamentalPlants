package com.jinlan.moreornplants.block.FlowerBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class CutFlowerBlock extends ModFlowerBlock implements BonemealableBlock {
    private final Block flower;
    public CutFlowerBlock(Block flower, Properties properties) {
        super(properties);
        this.flower = flower;
    }

    @Override
    public boolean isValidBonemealTarget(@NotNull LevelReader level, @NotNull BlockPos pos, @NotNull BlockState state) {
        return true;
    }

    @Override
    public boolean isBonemealSuccess(@NotNull Level level, @NotNull RandomSource random, @NotNull BlockPos pos, @NotNull BlockState state) {
        return true;
    }

    @Override
    public void performBonemeal(@NotNull ServerLevel level, @NotNull RandomSource random, @NotNull BlockPos pos, BlockState state) {
        BlockState fullState = flower.defaultBlockState();
        if (!fullState.canSurvive(level, pos)) {
            return;
        }
        if (flower instanceof DoublePlantBlock doublePlant) {
            if (level.isEmptyBlock(pos.above())) {
                DoublePlantBlock.placeAt(level, fullState, pos, 2);
            }
        } else {
            level.setBlock(pos, fullState, 3);
        }
    }
}
