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

public class CutFlowerBlock extends ModFlowerBlock implements BonemealableBlock {
    private final Block flower;
    public CutFlowerBlock(Block flower, Properties properties) {
        super(properties);
        this.flower = flower;
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader pLevel, BlockPos pPos, BlockState pState, boolean pIsClient) {
        return true;
    }

    @Override
    public boolean isBonemealSuccess(Level pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState) {
        BlockState fullState = flower.defaultBlockState();
        if (!fullState.canSurvive(pLevel, pPos)) {
            return;
        }
        if (flower instanceof DoublePlantBlock doublePlant) {
            if (pLevel.isEmptyBlock(pPos.above())) {
                DoublePlantBlock.placeAt(pLevel, fullState, pPos, 2);
            }
        } else {
            pLevel.setBlock(pPos, fullState, 3);
        }
    }
}
