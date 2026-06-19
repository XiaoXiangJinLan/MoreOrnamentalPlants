package com.jinlan.moreornplants.init;

import com.jinlan.moreornplants.MoreOrnPlants;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModParticleTypes {
    public static final DeferredRegister<ParticleType<?>> PARTICLES =
            DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, MoreOrnPlants.MODID);

    public static final Supplier<SimpleParticleType> RED_MEI_LEAVES =
            registerParticleType("red_mei_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> WHITE_MEI_LEAVES =
            registerParticleType("white_mei_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> PINK_MEI_LEAVES =
            registerParticleType("pink_mei_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> GREEN_CALYX_MEI_LEAVES =
            registerParticleType("green_calyx_mei_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> DOUBLE_PINK_MEI_LEAVES =
            registerParticleType("double_pink_mei_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> DOUBLE_WHITE_MEI_LEAVES =
            registerParticleType("double_white_mei_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> FLAVESCENS_MEI_LEAVES =
            registerParticleType("flavescens_mei_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> VERSICOLOR_MEI_LEAVES =
            registerParticleType("versicolor_mei_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> UPRIGHT_CRABAPPLE_LEAVES =
            registerParticleType("upright_crabapple_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> WEEPING_CRABAPPLE_LEAVES =
            registerParticleType("weeping_crabapple_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> PINK_APRICOT_LEAVES =
            registerParticleType("pink_apricot_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> WHITE_APRICOT_LEAVES =
            registerParticleType("white_apricot_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> CLOUD_APRICOT_LEAVES =
            registerParticleType("cloud_apricot_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> ORNAMENTAL_PEACH_LEAVES =
            registerParticleType("ornamental_peach_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> WILD_PEACH_LEAVES =
            registerParticleType("wild_peach_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> WHITE_PEACH_LEAVES =
            registerParticleType("white_peach_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> IMMORTAL_PEACH_LEAVES =
            registerParticleType("immortal_peach_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> PEAR_LEAVES =
            registerParticleType("pear_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> FLOWERING_PURPLE_LEAF_PLUM_LEAVES =
            registerParticleType("flowering_purple_leaf_plum_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> PURPLE_LEAF_PLUM_LEAVES =
            registerParticleType("purple_leaf_plum_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> GOLDEN_OSMANTHUS_LEAVES =
            registerParticleType("golden_osmanthus_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> ORANGE_OSMANTHUS_LEAVES =
            registerParticleType("orange_osmanthus_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> WHITE_OSMANTHUS_LEAVES =
            registerParticleType("white_osmanthus_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> GOLDEN_GINKGO_LEAVES =
            registerParticleType("golden_ginkgo_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> YELLOW_CHINESE_PARASOL_LEAVES =
            registerParticleType("yellow_chinese_parasol_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> SWEETGUM_LEAVES =
            registerParticleType("sweetgum_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> CAMPHOR_LEAVES =
            registerParticleType("camphor_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> DOVE_TREE_BLOSSOM_LEAVES =
            registerParticleType("dove_tree_blossom_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> CHINABERRY_LEAVES =
            registerParticleType("chinaberry_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> DESERT_POPLAR_LEAVES =
            registerParticleType("desert_poplar_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> CRAPE_MYRTLE_LEAVES =
            registerParticleType("crape_myrtle_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> RED_CRAPE_MYRTLE_LEAVES =
            registerParticleType("red_crape_myrtle_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> PINK_CRAPE_MYRTLE_LEAVES =
            registerParticleType("pink_crape_myrtle_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> WHITE_CRAPE_MYRTLE_LEAVES =
            registerParticleType("white_crape_myrtle_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> CAMELLIA_LEAVES =
            registerParticleType("camellia_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> WHITE_CAMELLIA_LEAVES =
            registerParticleType("white_camellia_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> PINK_CAMELLIA_LEAVES =
            registerParticleType("pink_camellia_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> VERSICOLOR_CAMELLIA_LEAVES =
            registerParticleType("versicolor_camellia_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> TAIWAN_CHERRY_LEAVES =
            registerParticleType("taiwan_cherry_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> BAIHUA_CAT =
            registerParticleType("baihua_cat", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> BAIHUA_CAT_PINK =
            registerParticleType("baihua_cat_pink", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> BAIHUA_CAT_BLUE =
            registerParticleType("baihua_cat_blue", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> BAIHUA_CAT_PURPLE =
            registerParticleType("baihua_cat_purple", () -> new SimpleParticleType(false));

    public static final java.util.function.Supplier<SimpleParticleType> ZIYING_FOX =
            registerParticleType("ziying_fox", () -> new SimpleParticleType(false));

    public static final java.util.function.Supplier<SimpleParticleType> SUYU_FOX =
            registerParticleType("suyu_fox", () -> new SimpleParticleType(false));

    public static final java.util.function.Supplier<SimpleParticleType> ZIYU_YUANYANG =
            registerParticleType("ziyu_yuanyang", () -> new SimpleParticleType(false));

    public static final java.util.function.Supplier<SimpleParticleType> MUXUE =
            registerParticleType("muxue", () -> new SimpleParticleType(false));

    public static <T extends ParticleType<?>> java.util.function.Supplier<T> registerParticleType(String name, Supplier<T> particleType) {
        return ModParticleTypes.PARTICLES.register(name, particleType);
    }

    public static void register(IEventBus eventBus) {
        PARTICLES.register(eventBus);
    }
}
