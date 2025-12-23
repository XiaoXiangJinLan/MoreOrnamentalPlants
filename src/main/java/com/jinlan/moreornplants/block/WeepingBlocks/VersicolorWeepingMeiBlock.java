package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.block.Block;

public class VersicolorWeepingMeiBlock extends WeepingMeiBlock {
    public VersicolorWeepingMeiBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected Block getPlant() {
        return ModBlocks.VERSICOLOR_WEEPING_MEI_PLANT;
    }
}
