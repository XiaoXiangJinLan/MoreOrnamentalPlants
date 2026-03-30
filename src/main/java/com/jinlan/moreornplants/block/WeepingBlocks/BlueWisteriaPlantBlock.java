package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import org.jetbrains.annotations.NotNull;

public class BlueWisteriaPlantBlock extends WisteriaPlantBlock {
    public BlueWisteriaPlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) ModBlocks.BLUE_CHINESE_WISTERIA.get();
    }
}
