package com.jinlan.moreornplants.block.WaterPlantsBlock;

import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.init.ModParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SeagrassBlock;
import net.minecraft.world.level.block.TallSeagrassBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import org.jetbrains.annotations.NotNull;

public class MuxueGrassBlock extends SeagrassBlock {
    public MuxueGrassBlock(Properties p_154496_) {
        super(p_154496_);
    }

    @Override
    public void performBonemeal(ServerLevel p_222423_, @NotNull RandomSource p_222424_, BlockPos p_222425_, @NotNull BlockState p_222426_) {
        BlockState blockstate = ModBlocks.TALL_MUXUE_GRASS.get().defaultBlockState();
        BlockState blockstate1 = blockstate.setValue(TallSeagrassBlock.HALF, DoubleBlockHalf.UPPER);
        BlockPos blockpos = p_222425_.above();
        if (p_222423_.getBlockState(blockpos).is(Blocks.WATER)) {
            p_222423_.setBlock(p_222425_, blockstate, 2);
            p_222423_.setBlock(blockpos, blockstate1, 2);
        }
    }

    @Override
    public void animateTick(@NotNull BlockState state, @NotNull Level world, @NotNull BlockPos pos, @NotNull RandomSource random) {
        super.animateTick(state, world, pos, random);
        if (random.nextInt(10) == 0) {
            double x = pos.getX() + random.nextDouble();
            double y = pos.getY() + random.nextDouble();
            double z = pos.getZ() + random.nextDouble();
            world.addParticle(ModParticleTypes.MUXUE.get(), x, y, z, 0.0, 0.0, 0.0);
        }
    }
}
