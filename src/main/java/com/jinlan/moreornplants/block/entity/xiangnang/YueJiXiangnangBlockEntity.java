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

public class YueJiXiangnangBlockEntity extends BlockEntity {
    private static final double EFFECT_RANGE = 4.0;
    private static final long CHECK_INTERVAL = 40;
    private static final int EFFECT_DURATION = 300;
    private final AABB effectArea;
    public YueJiXiangnangBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntities.YUE_JI_XIANGNANG.get(), pos, blockState);
        this.effectArea = new AABB(pos).inflate(EFFECT_RANGE);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, YueJiXiangnangBlockEntity blockEntity) {
        if (level.isClientSide) {
            return;
        }

        if (level.getGameTime() % CHECK_INTERVAL != 0) {
            return;
        }

        for (LivingEntity entity : level.getEntitiesOfClass(LivingEntity.class, blockEntity.effectArea)) {
            if (entity instanceof Player || entity instanceof Animal || entity instanceof Villager) {
                applyRegenerationEffect(entity);
            }
        }
    }

    private static void applyRegenerationEffect(LivingEntity entity) {
        MobEffectInstance existingEffect = entity.getEffect(MobEffects.REGENERATION);

        if (existingEffect != null && existingEffect.getDuration() > 260) {
            return;
        }

        entity.addEffect(new MobEffectInstance(
                MobEffects.REGENERATION, EFFECT_DURATION, 1));
    }
}
