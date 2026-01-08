package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class PinkWeepingMeiBlock extends WeepingMeiBlock {
    public PinkWeepingMeiBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull Block getBodyBlock() {
        return ModBlocks.PINK_WEEPING_MEI_PLANT.get();
    }
}