package com.jinlan.moreornplants.block.saplingBlocks;

import com.jinlan.moreornplants.block.FlowerBlocks.ModFlowerBlock;
import com.jinlan.moreornplants.worldgen.tree.CharmingRhododendronTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockState;

public class CharmingRhododendronSaplingBlock extends ModFlowerBlock implements BonemealableBlock {
    private static final CharmingRhododendronTreeGrower TREE_GROWER = new CharmingRhododendronTreeGrower();

    public CharmingRhododendronSaplingBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
        return (double)level.random.nextFloat() < 0.45;
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        TREE_GROWER.growTree(level, level.getChunkSource().getGenerator(), pos, state, random);
    }
}
