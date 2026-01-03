package com.jinlan.moreornplants.client;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MoreOrnPlants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModColorHandler {
    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
        // 为芒草注册颜色处理器
        event.register((state, level, pos, tintIndex) -> {
            if (level != null && pos != null) {
                // 处理双格植物：使用下半部分的位置获取颜色
                if (state.hasProperty(DoublePlantBlock.HALF) &&
                        state.getValue(DoublePlantBlock.HALF) == DoubleBlockHalf.UPPER) {
                    pos = pos.below();
                }
                // 完全模仿原版草的颜色逻辑
                return BiomeColors.getAverageGrassColor(level, pos);
            }
            return GrassColor.getDefaultColor();
        }, ModBlocks.MISCANTHUS.get());
    }

    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        // 为芒草物品注册颜色处理器
        event.register((stack, tintIndex) -> {
            // 使用默认的草颜色
            return GrassColor.getDefaultColor();
        }, ModBlocks.MISCANTHUS.get().asItem());
    }
}
