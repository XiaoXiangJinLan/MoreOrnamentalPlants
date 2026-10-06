package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ForgeHooks;
import org.jetbrains.annotations.NotNull;

public class ApricotBlock extends PeachBlock {
    public ApricotBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void randomTick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        super.randomTick(state, level, pos, random);

        int age = state.getValue(AGE);
        boolean isCorrectBiome = level.getBiome(pos).is(ModTags.Biomes.APRICOT_BEARING);
        if (age < 1) {
            int growthChance = isCorrectBiome ? 5 : 1;
            boolean shouldGrow = random.nextInt(12) < growthChance;
            if (ForgeHooks.onCropsGrowPre(level, pos, state, shouldGrow)) {
                level.setBlock(pos, state.setValue(AGE, age + 1), 3);
                ForgeHooks.onCropsGrowPost(level, pos, state);
            }
        }
    }
}
