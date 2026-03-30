package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class BlueWisteriaBlock extends WisteriaBlock {
    public BlueWisteriaBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull Block getBodyBlock() {
        return ModBlocks.BLUE_CHINESE_WISTERIA_PLANT.get();
    }
}
