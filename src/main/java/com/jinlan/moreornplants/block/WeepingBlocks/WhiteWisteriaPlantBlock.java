package com.jinlan.moreornplants.block.WeepingBlocks;

import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import org.jetbrains.annotations.NotNull;

public class WhiteWisteriaPlantBlock extends WisteriaPlantBlock {
    public WhiteWisteriaPlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) ModBlocks.WHITE_CHINESE_WISTERIA.get();
    }
}
