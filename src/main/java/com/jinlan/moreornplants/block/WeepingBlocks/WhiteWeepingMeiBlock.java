package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.world.level.block.Block;

public class WhiteWeepingMeiBlock extends WeepingMeiBlock {
    public WhiteWeepingMeiBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected Block getBodyBlock() {
        return ModBlocks.WHITE_WEEPING_MEI_PLANT.get();
    }
}
