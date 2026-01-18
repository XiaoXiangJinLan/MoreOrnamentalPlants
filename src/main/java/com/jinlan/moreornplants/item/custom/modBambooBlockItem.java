package com.jinlan.moreornplants.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class modBambooBlockItem extends BurnBlockItem {
    public modBambooBlockItem(Block pBlock, Properties pProperties, int burnTime) {
        super(pBlock, pProperties, burnTime);
    }

    public void appendHoverText(@NotNull ItemStack pStack, @Nullable TooltipContext pContext, List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.more_orn_plants.mod_bamboo.tooltip"));
        if (pContext != null) {
            super.appendHoverText(pStack, pContext, pTooltipComponents, pIsAdvanced);
        }
    }
}
