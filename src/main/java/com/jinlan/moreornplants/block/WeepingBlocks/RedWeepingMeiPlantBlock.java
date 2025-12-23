package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.block.AbstractPlantStemBlock;

public class RedWeepingMeiPlantBlock extends WeepingMeiPlantBlock {
    public RedWeepingMeiPlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) ModBlocks.RED_WEEPING_MEI;
    }
}
