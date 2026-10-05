package com.jinlan.moreornplants.block.foodBlock;

import com.jinlan.moreornplants.item.ModItems;
import net.minecraft.world.item.Item;

public class ApricotPlateBlock extends PeachPlateBlock{
    public ApricotPlateBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected Item getFruitItem() {
        return ModItems.CLOUD_APRICOT.get();
    }
}
