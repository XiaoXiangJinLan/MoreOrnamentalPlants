package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.world.level.block.Block;

public class GreenWeepingMeiBlock extends WeepingMeiBlock {
    public GreenWeepingMeiBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected Block getBodyBlock() {
        return ModBlocks.GREEN_WEEPING_MEI_PLANT.get();
    }
}
