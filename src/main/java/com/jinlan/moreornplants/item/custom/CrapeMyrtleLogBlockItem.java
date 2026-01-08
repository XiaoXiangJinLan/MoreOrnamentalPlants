package com.jinlan.moreornplants.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class CrapeMyrtleLogBlockItem extends BlockItem {
    public CrapeMyrtleLogBlockItem(Block pBlock, Properties pProperties) {
        super(pBlock, pProperties);
    }

    public void appendHoverText(@NotNull ItemStack pStack, @Nullable TooltipContext pContext, List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.more_orn_plants.crape_myrtle_log.tooltip"));
        if (pContext != null) {
            super.appendHoverText(pStack, pContext, pTooltipComponents, pIsAdvanced);
        }
    }
}
