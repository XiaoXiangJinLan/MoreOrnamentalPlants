package com.jinlan.moreornplants.init;

import com.google.common.base.Supplier;
import com.jinlan.moreornplants.MoreOrnPlants;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModParticleTypes {
    public static final DeferredRegister<ParticleType<?>> PARTICLES =
            DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, MoreOrnPlants.MOD_ID);

    public static final RegistryObject<SimpleParticleType> RED_MEI_LEAVES =
            registerParticleType("red_mei_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> WHITE_MEI_LEAVES =
            registerParticleType("white_mei_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> GREEN_CALYX_MEI_LEAVES =
            registerParticleType("green_calyx_mei_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> DOUBLE_PINK_MEI_LEAVES =
            registerParticleType("double_pink_mei_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> VERSICOLOR_MEI_LEAVES =
            registerParticleType("versicolor_mei_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> UPRIGHT_CRABAPPLE_LEAVES =
            registerParticleType("upright_crabapple_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> WEEPING_CRABAPPLE_LEAVES =
            registerParticleType("weeping_crabapple_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> PINK_APRICOT_LEAVES =
            registerParticleType("pink_apricot_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> WHITE_APRICOT_LEAVES =
            registerParticleType("white_apricot_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> ORNAMENTAL_PEACH_LEAVES =
            registerParticleType("ornamental_peach_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> WILD_PEACH_LEAVES =
            registerParticleType("wild_peach_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> PEAR_LEAVES =
            registerParticleType("pear_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> FLOWERING_PURPLE_LEAF_PLUM_LEAVES =
            registerParticleType("flowering_purple_leaf_plum_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> PURPLE_LEAF_PLUM_LEAVES =
            registerParticleType("purple_leaf_plum_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> GOLDEN_OSMANTHUS_LEAVES =
            registerParticleType("golden_osmanthus_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> ORANGE_OSMANTHUS_LEAVES =
            registerParticleType("orange_osmanthus_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> WHITE_OSMANTHUS_LEAVES =
            registerParticleType("white_osmanthus_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> GOLDEN_GINKGO_LEAVES =
            registerParticleType("golden_ginkgo_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> YELLOW_CHINESE_PARASOL_LEAVES =
            registerParticleType("yellow_chinese_parasol_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> SWEETGUM_LEAVES =
            registerParticleType("sweetgum_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> CAMPHOR_LEAVES =
            registerParticleType("camphor_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> DOVE_TREE_BLOSSOM_LEAVES =
            registerParticleType("dove_tree_blossom_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> CHINABERRY_LEAVES =
            registerParticleType("chinaberry_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> DESERT_POPLAR_LEAVES =
            registerParticleType("desert_poplar_leaves", () -> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> CRAPE_MYRTLE_LEAVES =
            registerParticleType("crape_myrtle_leaves", () -> new SimpleParticleType(false));

    public static <T extends ParticleType<?>> RegistryObject<T> registerParticleType(String name, Supplier<T> particleType) {
        return ModParticleTypes.PARTICLES.register(name, particleType);
    }
}
