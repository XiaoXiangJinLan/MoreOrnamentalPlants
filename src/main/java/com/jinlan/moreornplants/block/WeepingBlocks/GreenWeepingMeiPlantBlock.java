package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.block.AbstractPlantStemBlock;

public class GreenWeepingMeiPlantBlock extends WeepingMeiPlantBlock {
    public GreenWeepingMeiPlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) ModBlocks.GREEN_WEEPING_MEI;
    }
}
