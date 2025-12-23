package com.jinlan.moreornplants.init;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {
    public static final DefaultParticleType RED_MEI_LEAVES = FabricParticleTypes.simple(false);
    public static final DefaultParticleType WHITE_MEI_LEAVES = FabricParticleTypes.simple(false);
    public static final DefaultParticleType GREEN_CALYX_MEI_LEAVES = FabricParticleTypes.simple(false);
    public static final DefaultParticleType DOUBLE_PINK_MEI_LEAVES = FabricParticleTypes.simple(false);
    public static final DefaultParticleType VERSICOLOR_MEI_LEAVES = FabricParticleTypes.simple(false);

    public static void initialize() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier("more_orn_plants", "red_mei_leaves"), RED_MEI_LEAVES);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier("more_orn_plants", "white_mei_leaves"), WHITE_MEI_LEAVES);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier("more_orn_plants", "green_calyx_mei_leaves"), GREEN_CALYX_MEI_LEAVES);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier("more_orn_plants", "double_pink_mei_leaves"), DOUBLE_PINK_MEI_LEAVES);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier("more_orn_plants", "versicolor_mei_leaves"), VERSICOLOR_MEI_LEAVES);
    }
}
