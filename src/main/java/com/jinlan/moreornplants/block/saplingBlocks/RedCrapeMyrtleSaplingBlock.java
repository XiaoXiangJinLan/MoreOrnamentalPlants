package com.jinlan.moreornplants.block.saplingBlocks;

import com.jinlan.moreornplants.block.tree.ModTreeGrower;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class RedCrapeMyrtleSaplingBlock extends CrapeMyrtleSaplingBlock {
    public RedCrapeMyrtleSaplingBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void performBonemeal(@NotNull ServerLevel level, @NotNull RandomSource random, @NotNull BlockPos pos, @NotNull BlockState state) {
        ModTreeGrower.RED_CRAPE_MYRTLE.growTree(level, level.getChunkSource().getGenerator(), pos, state, random);
    }
}
