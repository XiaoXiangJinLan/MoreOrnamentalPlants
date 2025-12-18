package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.world.level.block.Block;

public class RedWeepingMeiBlock extends WeepingMeiBlock {
    public RedWeepingMeiBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected Block getBodyBlock() {
        return ModBlocks.RED_WEEPING_MEI_PLANT.get();
    }
}
