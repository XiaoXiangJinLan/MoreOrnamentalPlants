package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.block.AbstractPlantStemBlock;

public class VersicolorWeepingMeiPlantBlock extends WeepingMeiPlantBlock {
    public VersicolorWeepingMeiPlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) ModBlocks.VERSICOLOR_WEEPING_MEI;
    }
}
