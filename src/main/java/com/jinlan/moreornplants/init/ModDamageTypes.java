package com.jinlan.moreornplants.init;

import com.jinlan.moreornplants.MoreOrnPlants;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class ModDamageTypes {
    public static final ResourceKey<DamageType> BIOME_DAMAGE = ResourceKey.create(
            Registries.DAMAGE_TYPE,
            new ResourceLocation(MoreOrnPlants.MOD_ID, "biome_damage")
    );

    public static DamageSource biomeDamage(Level level) {
        return new DamageSource(getHolder(level));
    }

    public static DamageSource biomeDamage(Level level, @Nullable Entity entity) {
        return new DamageSource(getHolder(level), entity, entity);
    }

    private static Holder<DamageType> getHolder(Level level) {
        return level.registryAccess()
                .registryOrThrow(Registries.DAMAGE_TYPE)
                .getHolderOrThrow(BIOME_DAMAGE);
    }
}
