package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.block.AbstractPlantStemBlock;

public class PinkWeepingMeiPlantBlock extends WeepingMeiPlantBlock {
    public PinkWeepingMeiPlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) ModBlocks.PINK_WEEPING_MEI;
    }
}
