package com.jinlan.moreornplants.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class ZiyuSwordItem extends ModRangeSwordItem{
    public ZiyuSwordItem(Tier tier, Properties properties) {
        super(tier, properties);
    }

    public void appendHoverText(@NotNull ItemStack pStack, @Nullable TooltipContext pContext, List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.more_orn_plants.ziyu_sword.tooltip"));
        if (pContext != null) {
            super.appendHoverText(pStack, pContext, pTooltipComponents, pIsAdvanced);
        }
    }
}
