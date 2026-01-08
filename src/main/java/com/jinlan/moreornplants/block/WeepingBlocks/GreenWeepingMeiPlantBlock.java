package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import org.jetbrains.annotations.NotNull;

public class GreenWeepingMeiPlantBlock extends WeepingMeiPlantBlock {
    public GreenWeepingMeiPlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) ModBlocks.GREEN_WEEPING_MEI.get();
    }
}
