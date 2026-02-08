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

public class ChineseAzaleaSaplingBlock extends ModFlowerBlock implements BonemealableBlock {
    public ChineseAzaleaSaplingBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
        return level.getFluidState(pos.above()).isEmpty();
    }

    @Override
    public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
        return (double)level.random.nextFloat() < 0.45;
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        ModTreeGrower.CHINESE_AZALEA_TREE.growTree(level, level.getChunkSource().getGenerator(), pos, state, random);
    }
}
