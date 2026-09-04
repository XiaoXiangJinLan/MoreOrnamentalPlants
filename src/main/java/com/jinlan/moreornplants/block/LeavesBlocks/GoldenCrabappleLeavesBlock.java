package com.jinlan.moreornplants.block.LeavesBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.block.WeepingBlocks.CrabappleBlock;
import com.jinlan.moreornplants.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import org.jetbrains.annotations.NotNull;

public class GoldenCrabappleLeavesBlock extends LeavesBlock {
    public GoldenCrabappleLeavesBlock(Properties properties) {
        super(properties);
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
                int chance = level.getBiome(pos).is(ModTags.Biomes.CRABAPPLE_BEARING) ? 5 : 10;
                if (random.nextInt(chance) == 0) {
                    Direction randomDirection = Direction.Plane.HORIZONTAL.getRandomDirection(random);
                    level.setBlock(belowPos, ModBlocks.GOLDEN_CRABAPPLE.get().defaultBlockState()
                            .setValue(CrabappleBlock.FACING, randomDirection),2);
                }
            }
        }
    }
}
