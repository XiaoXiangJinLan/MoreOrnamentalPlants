package com.jinlan.moreornplants.block.saplingBlocks;

import com.jinlan.moreornplants.block.tree.ModTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class GreatWhiteRhododendronSaplingBlock extends RedAzaleaSaplingBlock {
    public GreatWhiteRhododendronSaplingBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void performBonemeal(@NotNull ServerLevel level, @NotNull RandomSource random, @NotNull BlockPos pos, @NotNull BlockState state) {
        ModTreeGrower.GREAT_WHITE_RHODODENDRON_TREE.growTree(level, level.getChunkSource().getGenerator(), pos, state, random);
    }
}
