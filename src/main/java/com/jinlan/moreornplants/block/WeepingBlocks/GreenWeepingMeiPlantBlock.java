package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;

public class GreenWeepingMeiPlantBlock extends WeepingMeiPlantBlock {
    public GreenWeepingMeiPlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) ModBlocks.GREEN_WEEPING_MEI.get();
    }
}
