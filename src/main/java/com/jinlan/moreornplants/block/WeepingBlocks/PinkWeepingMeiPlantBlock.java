package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.world.level.block.*;

public class PinkWeepingMeiPlantBlock extends WeepingMeiPlantBlock {
    public PinkWeepingMeiPlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) ModBlocks.PINK_WEEPING_MEI.get();
    }
}