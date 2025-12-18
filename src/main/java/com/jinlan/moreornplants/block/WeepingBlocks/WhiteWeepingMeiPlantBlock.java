package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;

public class WhiteWeepingMeiPlantBlock extends WeepingMeiPlantBlock {
    public WhiteWeepingMeiPlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) ModBlocks.WHITE_WEEPING_MEI.get();
    }
}
