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
    public MeiXiangnangBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntities.MEI_XIANGNANG.get(), pos, blockState);
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

        // 计算效果区域（以方块为中心的3格半径立方体）
        AABB effectArea = new AABB(pos).inflate(EFFECT_RANGE);

        // 获取区域内的所有玩家、动物和村民
        for (LivingEntity entity : level.getEntitiesOfClass(LivingEntity.class, effectArea)) {
            // 只对玩家、动物和村民生效
            if (entity instanceof Player || entity instanceof Animal || entity instanceof Villager) {
                applyRegenerationEffect(entity);
            }
        }
    }

    // 应用生命恢复效果
    private static void applyRegenerationEffect(LivingEntity entity) {
        // 检查是否已经有生命恢复效果
        MobEffectInstance existingEffect = entity.getEffect(MobEffects.REGENERATION);

        // 如果已经有持续时间大于12秒的效果，就不重复应用
        if (existingEffect != null && existingEffect.getDuration() > 240) {
            return;
        }

        // 创建生命恢复I效果，持续5秒
        MobEffectInstance effect = new MobEffectInstance(
                MobEffects.REGENERATION,
                EFFECT_DURATION,
                0, // 等级：0 = I级
                false, // 不是环境效果（会显示图标）
                true   // 显示粒子（仅效果本身的粒子）
        );

        entity.addEffect(effect);
    }
}
