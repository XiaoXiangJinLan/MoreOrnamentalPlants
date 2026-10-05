package com.jinlan.moreornplants.block.foodBlock;

import com.jinlan.moreornplants.item.ModItems;
import net.minecraft.world.item.Item;

public class GoldenCrabapplePlateBlock extends CrabapplePlateBlock{
    public GoldenCrabapplePlateBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected Item getFruitItem() {
        return ModItems.GOLDEN_CRABAPPLE.get();
    }
}
