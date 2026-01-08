package com.jinlan.moreornplants.block.tree;

import com.jinlan.moreornplants.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrower {
    public static final TreeGrower RED_MEI = new TreeGrower(
            "red_mei",
            0.1F, // 10% 的概率长成古红梅树
            Optional.empty(), // 没有大型树
            Optional.empty(), // 没有次级大型树
            Optional.of(ModConfiguredFeatures.RED_MEI), // 普通红梅树
            Optional.of(ModConfiguredFeatures.ANCIENT_RED_MEI), // 古红梅树作为次级变体
            Optional.empty(), // 没有带蜜蜂的普通红梅树
            Optional.empty()  // 没有带蜜蜂的古红梅树
    );

    public static final TreeGrower WHITE_MEI = new TreeGrower(
            "white_mei",
            0.1F,
            Optional.empty(),
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.WHITE_MEI),
            Optional.of(ModConfiguredFeatures.ANCIENT_WHITE_MEI),
            Optional.empty(),
            Optional.empty()
    );

    public static final TreeGrower GREEN_CALYX_MEI = new TreeGrower(
            "green_calyx_mei",
            0.1F,
            Optional.empty(),
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.GREEN_CALYX_MEI),
            Optional.of(ModConfiguredFeatures.ANCIENT_GREEN_CALYX_MEI),
            Optional.empty(),
            Optional.empty()
    );

    public static final TreeGrower DOUBLE_PINK_MEI = new TreeGrower(
            "double_pink_mei",
            0.1F,
            Optional.empty(),
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.DOUBLE_PINK_MEI),
            Optional.of(ModConfiguredFeatures.ANCIENT_DOUBLE_PINK_MEI),
            Optional.empty(),
            Optional.empty()
    );

    public static final TreeGrower VERSICOLOR_MEI = new TreeGrower(
            "versicolor_mei",
            0.1F,
            Optional.empty(),
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.VERSICOLOR_MEI),
            Optional.of(ModConfiguredFeatures.ANCIENT_VERSICOLOR_MEI),
            Optional.empty(),
            Optional.empty()
    );

    public static final TreeGrower RED_WEEPING_MEI = new TreeGrower(
            "red_weeping_mei",
            Optional.empty(), // 没有次级大型树
            Optional.of(ModConfiguredFeatures.RED_WEEPING_MEI),
            Optional.empty()
    );

    public static final TreeGrower WHITE_WEEPING_MEI = new TreeGrower(
            "white_weeping_mei",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.WHITE_WEEPING_MEI),
            Optional.empty()
    );

    public static final TreeGrower GREEN_WEEPING_MEI = new TreeGrower(
            "green_weeping_mei",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.GREEN_WEEPING_MEI),
            Optional.empty()
    );

    public static final TreeGrower PINK_WEEPING_MEI = new TreeGrower(
            "pink_weeping_mei",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.PINK_WEEPING_MEI),
            Optional.empty()
    );

    public static final TreeGrower VERSICOLOR_WEEPING_MEI = new TreeGrower(
            "versicolor_weeping_mei",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.VERSICOLOR_WEEPING_MEI),
            Optional.empty()
    );

    public static final TreeGrower UPRIGHT_CRABAPPLE = new TreeGrower(
            "upright_crabapple",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.UPRIGHT_CRABAPPLE),
            Optional.empty()
    );

    public static final TreeGrower WEEPING_CRABAPPLE = new TreeGrower(
            "weeping_crabapple",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.WEEPING_CRABAPPLE),
            Optional.empty()
    );

    public static final TreeGrower PINK_APRICOT = new TreeGrower(
            "pink_apricot",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.PINK_APRICOT),
            Optional.empty()
    );

    public static final TreeGrower WHITE_APRICOT = new TreeGrower(
            "white_apricot",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.WHITE_APRICOT),
            Optional.empty()
    );

    public static final TreeGrower ORNAMENTAL_PEACH = new TreeGrower(
            "ornamental_peach",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.ORNAMENTAL_PEACH),
            Optional.empty()
    );

    public static final TreeGrower WILD_PEACH = new TreeGrower(
            "wild_peach",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.WILD_PEACH),
            Optional.empty()
    );

    public static final TreeGrower PEAR = new TreeGrower(
            "pear",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.PEAR),
            Optional.empty()
    );

    public static final TreeGrower FLOWERING_PURPLE_LEAF_PLUM = new TreeGrower(
            "flowering_purple_leaf_plum",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.FLOWERING_PURPLE_LEAF_PLUM),
            Optional.empty()
    );

    public static final TreeGrower PURPLE_LEAF_PLUM = new TreeGrower(
            "purple_leaf_plum",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.PURPLE_LEAF_PLUM),
            Optional.empty()
    );

    public static final TreeGrower GOLDEN_OSMANTHUS = new TreeGrower(
            "golden_osmanthus",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.GOLDEN_OSMANTHUS),
            Optional.empty()
    );

    public static final TreeGrower ORANGE_OSMANTHUS = new TreeGrower(
            "orange_osmanthus",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.ORANGE_OSMANTHUS),
            Optional.empty()
    );

    public static final TreeGrower WHITE_OSMANTHUS = new TreeGrower(
            "white_osmanthus",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.WHITE_OSMANTHUS),
            Optional.empty()
    );

    public static final TreeGrower GOLDEN_GINKGO = new TreeGrower(
            "golden_ginkgo",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.GOLDEN_GINKGO),
            Optional.empty()
    );

    public static final TreeGrower GREEN_GINKGO = new TreeGrower(
            "green_ginkgo",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.GREEN_GINKGO),
            Optional.empty()
    );

    public static final TreeGrower YELLOW_CHINESE_PARASOL = new TreeGrower(
            "yellow_chinese_parasol",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.YELLOW_CHINESE_PARASOL),
            Optional.empty()
    );

    public static final TreeGrower GREEN_CHINESE_PARASOL = new TreeGrower(
            "green_chinese_parasol",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.GREEN_CHINESE_PARASOL),
            Optional.empty()
    );

    public static final TreeGrower SWEETGUM = new TreeGrower(
            "sweetgum",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.SWEETGUM),
            Optional.empty()
    );

    public static final TreeGrower CAMPHOR = new TreeGrower(
            "camphor",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.CAMPHOR),
            Optional.empty()
    );

    public static final TreeGrower DOVE_TREE = new TreeGrower(
            "dove_tree",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.DOVE_TREE),
            Optional.empty()
    );

    public static final TreeGrower CHINABERRY = new TreeGrower(
            "chinaberry",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.CHINABERRY),
            Optional.empty()
    );

    public static final TreeGrower DESERT_POPLAR = new TreeGrower(
            "desert_poplar",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.DESERT_POPLAR_2),
            Optional.empty()
    );

    public static final TreeGrower CRAPE_MYRTLE = new TreeGrower(
            "crape_myrtle",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.CRAPE_MYRTLE_TREE),
            Optional.empty()
    );
}
