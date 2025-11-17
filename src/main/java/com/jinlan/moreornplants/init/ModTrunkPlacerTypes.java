package com.jinlan.moreornplants.init;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.feature.trunkplacers.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTrunkPlacerTypes {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACERS =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, MoreOrnPlants.MOD_ID);

    public static final RegistryObject<TrunkPlacerType<MeiTrunkPlacer>> MEI_TRUNK_PLACER =
            TRUNK_PLACERS.register("mei_trunk_placer", () -> new TrunkPlacerType<>(MeiTrunkPlacer.CODEC));

    public static final RegistryObject<TrunkPlacerType<AncientMeiTrunkPlacer>> ANCIENT_MEI_TRUNK_PLACER =
            TRUNK_PLACERS.register("ancient_mei_trunk_placer", () -> new TrunkPlacerType<>(AncientMeiTrunkPlacer.CODEC));

    public static final RegistryObject<TrunkPlacerType<WeepingMeiTrunkPlacer>> WEEPING_MEI_TRUNK_PLACER =
            TRUNK_PLACERS.register("weeping_mei_trunk_placer", () -> new TrunkPlacerType<>(WeepingMeiTrunkPlacer.CODEC));

    public static final RegistryObject<TrunkPlacerType<UprightCrabappleTrunkPlacer>> UPRIGHT_CRABAPPLE_TRUNK_PLACER =
            TRUNK_PLACERS.register("upright_crabapple_trunk_placer", () -> new TrunkPlacerType<>(UprightCrabappleTrunkPlacer.CODEC));

    public static final RegistryObject<TrunkPlacerType<WeepingCrabappleTrunkPlacer>> WEEPING_CRABAPPLE_TRUNK_PLACER =
            TRUNK_PLACERS.register("weeping_crabapple_trunk_placer", () -> new TrunkPlacerType<>(WeepingCrabappleTrunkPlacer.CODEC));

    public static final RegistryObject<TrunkPlacerType<ApricotTrunkPlacer>> APRICOT_TRUNK_PLACER =
            TRUNK_PLACERS.register("apricot_trunk_placer", () -> new TrunkPlacerType<>(ApricotTrunkPlacer.CODEC));

    public static final RegistryObject<TrunkPlacerType<PeachTrunkPlacer>> PEACH_TRUNK_PLACER =
            TRUNK_PLACERS.register("peach_trunk_placer", () -> new TrunkPlacerType<>(PeachTrunkPlacer.CODEC));

    public static final RegistryObject<TrunkPlacerType<ChineseParasolTrunkPlacer>> CHINESE_PARASOL_TRUNK_PLACER =
            TRUNK_PLACERS.register("chinese_parasol_trunk_placer", () -> new TrunkPlacerType<>(ChineseParasolTrunkPlacer.CODEC));

    public static final RegistryObject<TrunkPlacerType<CamphorTrunkPlacer>> CAMPHOR_TRUNK_PLACER =
            TRUNK_PLACERS.register("camphor_trunk_placer", () -> new TrunkPlacerType<>(CamphorTrunkPlacer.CODEC));

    public static final RegistryObject<TrunkPlacerType<AncientCamphorTrunkPlacer>> ANCIENT_CAMPHOR_TRUNK_PLACER =
            TRUNK_PLACERS.register("ancient_camphor_trunk_placer", () -> new TrunkPlacerType<>(AncientCamphorTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus) {
        TRUNK_PLACERS.register(eventBus);
    }
}
