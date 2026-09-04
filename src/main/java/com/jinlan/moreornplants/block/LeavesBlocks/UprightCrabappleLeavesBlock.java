package com.jinlan.moreornplants.block.LeavesBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.block.WeepingBlocks.CrabappleBlock;
import com.jinlan.moreornplants.init.ModParticleTypes;
import com.jinlan.moreornplants.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.ParticleUtils;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import org.jetbrains.annotations.NotNull;

public class UprightCrabappleLeavesBlock extends ModLeavesBlock {
    public UprightCrabappleLeavesBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void animateTick(@NotNull BlockState state, @NotNull Level world, @NotNull BlockPos pos, @NotNull RandomSource random) {
        super.animateTick(state, world, pos, random);
        if (random.nextInt(10) ==0) {
            BlockPos blockPos = pos.below();
            BlockState blockState = world.getBlockState(blockPos);
            if (!isFaceFull(blockState.getCollisionShape(world, blockPos), Direction.UP)) {
                ParticleUtils.spawnParticleBelow(world, pos, random, ModParticleTypes.UPRIGHT_CRABAPPLE_LEAVES.get());
            }
        }
    }

    @Override
    protected boolean isRandomlyTicking(@NotNull BlockState state) {
        return true;
    }

    @Override
    public void randomTick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        super.randomTick(state, level, pos, random);
        if (!level.getBlockState(pos).is(this)) return;

        if (!level.isAreaLoaded(pos, 1)) return;

        if (!state.getValue(BlockStateProperties.PERSISTENT)) {
            BlockPos belowPos = pos.below();
            if (level.isEmptyBlock(belowPos)) {
                int chance = level.getBiome(pos).is(ModTags.Biomes.CRABAPPLE_BEARING) ? 10 : 20;
                if (random.nextInt(chance) == 0) {
                    Direction randomDirection = Direction.Plane.HORIZONTAL.getRandomDirection(random);
                    level.setBlock(belowPos, ModBlocks.CRABAPPLE.get().defaultBlockState()
                            .setValue(CrabappleBlock.FACING, randomDirection), 2);
                }
            }
        }
    }
}
