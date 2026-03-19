package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class CrabappleBlock extends PeachBlock {
    public CrabappleBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull ItemStack getCloneItemStack(@NotNull LevelReader level, @NotNull BlockPos pos, @NotNull BlockState state) {
        return new ItemStack(ModItems.CRABAPPLE.get());
    }

    @Override
    public void randomTick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        super.randomTick(state, level, pos, random);

        int age = state.getValue(AGE);
        if (age < 2) {
            if (random.nextInt(10) == 0) {
                level.setBlock(pos, state.setValue(AGE, age + 1), 3);
            }
        }
    }
}
