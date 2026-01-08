package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import org.jetbrains.annotations.NotNull;

public class VersicolorWeepingMeiPlantBlock extends WeepingMeiPlantBlock {
    public VersicolorWeepingMeiPlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) ModBlocks.VERSICOLOR_WEEPING_MEI.get();
    }
}
