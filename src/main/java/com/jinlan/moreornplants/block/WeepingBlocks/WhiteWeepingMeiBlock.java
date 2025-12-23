package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.block.Block;

public class WhiteWeepingMeiBlock extends WeepingMeiBlock {
    public WhiteWeepingMeiBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected Block getPlant() {
        return ModBlocks.WHITE_WEEPING_MEI_PLANT;
    }
}
