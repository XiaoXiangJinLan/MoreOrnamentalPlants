package com.jinlan.moreornplants.block.foodBlock;

import com.jinlan.moreornplants.item.ModItems;
import net.minecraft.world.item.Item;

public class MeiPlateBlock extends PeachPlateBlock{
    public MeiPlateBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected Item getFruitItem() {
        return ModItems.MEI.get();
    }
}
