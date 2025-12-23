package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.block.Block;

public class GreenWeepingMeiBlock extends WeepingMeiBlock {
    public GreenWeepingMeiBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected Block getPlant() {
        return ModBlocks.GREEN_WEEPING_MEI_PLANT;
    }
}
