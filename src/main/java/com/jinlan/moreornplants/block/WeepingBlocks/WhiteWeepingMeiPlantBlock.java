package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.block.AbstractPlantStemBlock;

public class WhiteWeepingMeiPlantBlock extends WeepingMeiPlantBlock {
    public WhiteWeepingMeiPlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) ModBlocks.WHITE_WEEPING_MEI;
    }
}
