package com.jinlan.moreornplants.item.custom;

import com.jinlan.moreornplants.MoreOrnPlants;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffects;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Method;
import java.util.UUID;

public class GoldenCrabappleItem extends Item {
    private static Method startConvertingMethod;

    public GoldenCrabappleItem(Properties properties) {
        super(properties);
        cacheStartConvertingMethod();
    }

    private void cacheStartConvertingMethod() {
        try {
            startConvertingMethod = ZombieVillager.class.getDeclaredMethod("startConverting", UUID.class, int.class);
            startConvertingMethod.setAccessible(true);
        } catch (NoSuchMethodException e) {
            // 方法名可能因映射变化而不同，若出错请检查实际名称（开发环境通常为 startConverting）
            MoreOrnPlants.LOGGER.error("Failed to find ZombieVillager.startConverting method via reflection!", e);
        }
    }

    @Override
    public @NotNull InteractionResult interactLivingEntity(@NotNull ItemStack stack, Player player, @NotNull LivingEntity target, net.minecraft.world.@NotNull InteractionHand hand) {
        if (player.level().isClientSide) {
            return InteractionResult.PASS;
        }

        if (!(target instanceof ZombieVillager zombieVillager) || !zombieVillager.hasEffect(MobEffects.WEAKNESS)) {
            return InteractionResult.PASS;
        }

        // 消耗物品（非创造模式）
        if (!player.getAbilities().instabuild) {
            stack.shrink(1);
        }

        try {
            // 随机转化时间：3600 ~ 6000 ticks（与原版一致）
            int conversionTime = 3600 + player.getRandom().nextInt(2401);
            // 调用私有方法 startConverting(UUID, int)
            startConvertingMethod.invoke(zombieVillager, player.getUUID(), conversionTime);
            return InteractionResult.SUCCESS;
        } catch (Exception e) {
            MoreOrnPlants.LOGGER.error("Failed to find ZombieVillager.startConverting method via reflection!", e);
            return InteractionResult.FAIL;
        }
    }
}
