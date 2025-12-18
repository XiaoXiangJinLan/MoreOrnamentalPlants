package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.world.level.block.Block;

public class VersicolorWeepingMeiBlock extends WeepingMeiBlock {
    public VersicolorWeepingMeiBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected Block getBodyBlock() {
        return ModBlocks.VERSICOLOR_WEEPING_MEI_PLANT.get();
    }
}
