package com.jinlan.moreornplants.block.saplingBlocks;

import com.jinlan.moreornplants.worldgen.tree.CamelliaTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class CamelliaSaplingBlock extends RedAzaleaSaplingBlock {
    private static final CamelliaTreeGrower TREE_GROWER = new CamelliaTreeGrower();
    public CamelliaSaplingBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void performBonemeal(@NotNull ServerLevel level, @NotNull RandomSource random, @NotNull BlockPos pos, @NotNull BlockState state) {
        TREE_GROWER.growTree(level, level.getChunkSource().getGenerator(), pos, state, random);
    }
}
