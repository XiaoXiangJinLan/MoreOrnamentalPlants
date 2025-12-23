package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.block.Block;

public class PinkWeepingMeiBlock extends WeepingMeiBlock {
    public PinkWeepingMeiBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected Block getPlant() {
        return ModBlocks.PINK_WEEPING_MEI_PLANT;
    }
}
