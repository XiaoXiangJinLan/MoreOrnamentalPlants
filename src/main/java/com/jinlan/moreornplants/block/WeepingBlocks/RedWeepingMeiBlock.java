package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.block.Block;

public class RedWeepingMeiBlock extends WeepingMeiBlock {
    public RedWeepingMeiBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected Block getPlant() {
        return ModBlocks.RED_WEEPING_MEI_PLANT;
    }
}
