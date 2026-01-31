// XiangnangItem.java
package com.jinlan.moreornplants.item.custom;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class XiangnangItem extends BlockItem {
    private final int effectDuration; // 效果持续时间（tick）
    private final int effectAmplifier; // 效果等级（0为基础等级）

    public XiangnangItem(Block block, Properties properties, int effectDuration, int effectAmplifier) {
        super(block, properties);
        this.effectDuration = effectDuration;
        this.effectAmplifier = effectAmplifier;
    }

    @Override
    public void inventoryTick(@NotNull ItemStack stack, @NotNull Level level, @NotNull Entity entity, int slotId, boolean isSelected) {
        super.inventoryTick(stack, level, entity, slotId, isSelected);

        if (!level.isClientSide && entity instanceof LivingEntity livingEntity) {
            // 检查物品是否在玩家的手持槽位（主手或副手）
            boolean isHeld = false;

            if (entity instanceof Player player) {
                // 检查主手和副手
                if (player.getMainHandItem() == stack || player.getOffhandItem() == stack) {
                    isHeld = true;
                }

                // 检查玩家是否处于生存/冒险模式
                if (!player.isSpectator() && isHeld) {
                    // 给予生命恢复效果
                    // 设置为持续效果，duration > 0 会每 tick 刷新
                    MobEffectInstance currentEffect = livingEntity.getEffect(MobEffects.REGENERATION);

                    // 如果还没有效果，或者效果剩余时间少于13秒，则添加新效果
                    if (currentEffect == null || currentEffect.getDuration() < 260) {
                        livingEntity.addEffect(new MobEffectInstance(
                                MobEffects.REGENERATION,
                                effectDuration,
                                effectAmplifier,
                                false,
                                true,
                                true
                        ));
                    }
                }
            }
        }
    }
}
