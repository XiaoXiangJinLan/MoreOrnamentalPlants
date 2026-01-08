package com.jinlan.moreornplants.item.custom;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class LeafPileUseItemNameBlockItem extends LeafPileBlockItem {
    public LeafPileUseItemNameBlockItem(Block block, Properties properties, int burnTime) {
        super(block, properties, burnTime);
    }

    @Override
    @NotNull
    public String getDescriptionId() {
        return "item.more_orn_plants." + Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(this)).getPath();
    }
}
