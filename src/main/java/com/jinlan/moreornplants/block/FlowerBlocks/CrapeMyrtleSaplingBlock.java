package com.jinlan.moreornplants.block.FlowerBlocks;

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

public class CrapeMyrtleSaplingBlock extends BushBlock implements BonemealableBlock {
    public static final MapCodec<CrapeMyrtleSaplingBlock> CODEC = simpleCodec(CrapeMyrtleSaplingBlock::new);
    protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);

    @Override
    @NotNull
    protected MapCodec<? extends BushBlock> codec() {
        return CODEC;
    }

    public CrapeMyrtleSaplingBlock(Properties properties) {
        super(properties);
    }

    @Override
    @NotNull
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
        return false;
    }

    @Override
    public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
        return (double)level.random.nextFloat() < 0.45;
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        ModTreeGrower.CRAPE_MYRTLE.growTree(level, level.getChunkSource().getGenerator(), pos, state, random);
    }
}
