package com.jinlan.moreornplants.block.saplingBlocks;

import com.jinlan.moreornplants.block.tree.ModTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class ChineseAzaleaSaplingBlock extends RedAzaleaSaplingBlock {
    public ChineseAzaleaSaplingBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void performBonemeal(@NotNull ServerLevel level, @NotNull RandomSource random, @NotNull BlockPos pos, @NotNull BlockState state) {
        ModTreeGrower.CHINESE_AZALEA_TREE.growTree(level, level.getChunkSource().getGenerator(), pos, state, random);
    }
}
