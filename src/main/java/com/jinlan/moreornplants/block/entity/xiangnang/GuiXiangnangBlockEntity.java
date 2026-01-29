package com.jinlan.moreornplants.block.entity.xiangnang;

import com.jinlan.moreornplants.block.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

public class GuiXiangnangBlockEntity extends BlockEntity {
    private static final double EFFECT_RANGE = 8.0;
    private static final long CHECK_INTERVAL = 40;
    private static final int EFFECT_DURATION = 300;
    public GuiXiangnangBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntities.GUI_XIANGNANG.get(), pos, blockState);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, GuiXiangnangBlockEntity blockEntity) {
        if (level.isClientSide) {
            return;
        }

        if (level.getGameTime() % CHECK_INTERVAL != 0) {
            return;
        }

        AABB effectArea = new AABB(pos).inflate(EFFECT_RANGE);

        for (LivingEntity entity : level.getEntitiesOfClass(LivingEntity.class, effectArea)) {
            if (entity instanceof Player || entity instanceof Animal || entity instanceof Villager) {
                applyRegenerationEffect(entity);
            }
        }
    }

    private static void applyRegenerationEffect(LivingEntity entity) {
        MobEffectInstance existingEffect = entity.getEffect(MobEffects.REGENERATION);

        if (existingEffect != null && existingEffect.getDuration() > 240) {
            return;
        }

        MobEffectInstance effect = new MobEffectInstance(
                MobEffects.REGENERATION,
                EFFECT_DURATION,
                0,
                false,
                true
        );

        entity.addEffect(effect);
    }
}
