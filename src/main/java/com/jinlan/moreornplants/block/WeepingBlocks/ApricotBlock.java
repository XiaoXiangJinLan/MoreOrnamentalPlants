package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class ApricotBlock extends WeepingCrabappleBlock {
    public ApricotBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull ItemStack getCloneItemStack(@NotNull LevelReader level, @NotNull BlockPos pos, @NotNull BlockState state) {
        return new ItemStack(ModItems.CLOUD_APRICOT.get());
    }
}
