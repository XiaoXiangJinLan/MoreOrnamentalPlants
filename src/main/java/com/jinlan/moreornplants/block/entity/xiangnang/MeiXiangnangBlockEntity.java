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

public class MeiXiangnangBlockEntity extends BlockEntity {
    private static final double EFFECT_RANGE = 3.0;
    private static final long CHECK_INTERVAL = 40;
    private static final int EFFECT_DURATION = 300;
    private final AABB effectArea;
    public MeiXiangnangBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntities.MEI_XIANGNANG.get(), pos, blockState);
        this.effectArea = new AABB(pos).inflate(EFFECT_RANGE);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, MeiXiangnangBlockEntity blockEntity) {
        // 确保只在服务端运行
        if (level.isClientSide) {
            return;
        }

        // 每2秒检查一次（使用游戏时间）
        if (level.getGameTime() % CHECK_INTERVAL != 0) {
            return;
        }

        for (LivingEntity entity : level.getEntitiesOfClass(LivingEntity.class, blockEntity.effectArea)) {
            // 只对玩家、动物和村民生效
            if (entity instanceof Player || entity instanceof Animal || entity instanceof Villager) {
                applyRegenerationEffect(entity);
            }
        }
    }

    // 应用生命恢复效果
    private static void applyRegenerationEffect(LivingEntity entity) {
        MobEffectInstance existingEffect = entity.getEffect(MobEffects.REGENERATION);
        MobEffectInstance existingEffect2 = entity.getEffect(MobEffects.DAMAGE_BOOST);
        MobEffectInstance existingEffect3 = entity.getEffect(MobEffects.DAMAGE_RESISTANCE);
        MobEffectInstance existingEffect4 = entity.getEffect(MobEffects.DIG_SPEED);

        if (existingEffect == null || existingEffect.getDuration() < 260 ||
                existingEffect2 == null || existingEffect2.getDuration() < 260 ||
                existingEffect3 == null || existingEffect3.getDuration() < 260 ||
                existingEffect4 == null || existingEffect4.getDuration() < 260) {
            entity.addEffect(new MobEffectInstance(
                    MobEffects.REGENERATION, EFFECT_DURATION, 1));
            entity.addEffect(new MobEffectInstance(
                    MobEffects.DAMAGE_BOOST, EFFECT_DURATION, 0));
            entity.addEffect(new MobEffectInstance(
                    MobEffects.DAMAGE_RESISTANCE, EFFECT_DURATION, 0));
            entity.addEffect(new MobEffectInstance(
                    MobEffects.DIG_SPEED, EFFECT_DURATION, 0));
        }
    }
}
