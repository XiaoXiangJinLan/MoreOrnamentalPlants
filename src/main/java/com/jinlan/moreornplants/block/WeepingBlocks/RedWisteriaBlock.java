package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class RedWisteriaBlock extends WisteriaBlock {
    public RedWisteriaBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull Block getBodyBlock() {
        return ModBlocks.RED_CHINESE_WISTERIA_PLANT.get();
    }
}
