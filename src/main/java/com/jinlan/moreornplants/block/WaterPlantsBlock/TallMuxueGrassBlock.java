package com.jinlan.moreornplants.block.WaterPlantsBlock;

import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.init.ModParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.TallSeagrassBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class TallMuxueGrassBlock extends TallSeagrassBlock {
    public TallMuxueGrassBlock(Properties p_154745_) {
        super(p_154745_);
    }

    @Override
    public @NotNull ItemStack getCloneItemStack(@NotNull BlockGetter p_154749_, @NotNull BlockPos p_154750_, @NotNull BlockState p_154751_) {
        return new ItemStack(ModBlocks.MUXUE_GRASS.get());
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
