package com.jinlan.moreornplants.block.saplingBlocks;

import com.jinlan.moreornplants.block.FlowerBlocks.ModFlowerBlock;
import com.jinlan.moreornplants.block.tree.ModTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class RedAzaleaSaplingBlock extends ModFlowerBlock implements BonemealableBlock {
    public RedAzaleaSaplingBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, @NotNull BlockState state) {
        return level.getFluidState(pos.above()).isEmpty();
    }

    @Override
    public boolean isBonemealSuccess(Level level, @NotNull RandomSource random, @NotNull BlockPos pos, @NotNull BlockState state) {
        return (double)level.random.nextFloat() < 0.45;
    }

    @Override
    public void performBonemeal(@NotNull ServerLevel level, @NotNull RandomSource random, @NotNull BlockPos pos, @NotNull BlockState state) {
        ModTreeGrower.RED_AZALEA_TREE.growTree(level, level.getChunkSource().getGenerator(), pos, state, random);
    }
}
