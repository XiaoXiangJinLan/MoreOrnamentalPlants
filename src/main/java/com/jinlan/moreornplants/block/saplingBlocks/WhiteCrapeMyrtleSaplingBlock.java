package com.jinlan.moreornplants.block.saplingBlocks;

import com.jinlan.moreornplants.block.tree.ModTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;

public class WhiteCrapeMyrtleSaplingBlock extends CrapeMyrtleSaplingBlock {
    public WhiteCrapeMyrtleSaplingBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        ModTreeGrower.WHITE_CRAPE_MYRTLE.growTree(level, level.getChunkSource().getGenerator(), pos, state, random);
    }
}
