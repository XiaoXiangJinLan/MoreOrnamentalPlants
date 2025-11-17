package com.jinlan.moreornplants.init;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.feature.foliageplacers.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModFoliagePlacerTypes {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS =
            DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, MoreOrnPlants.MOD_ID);

    public static final RegistryObject<FoliagePlacerType<MeiFoliagePlacer>> MEI_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("mei_foliage_placer", () -> new FoliagePlacerType<>(MeiFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<RedWeepingMeiFoliagePlacer>> RED_WEEPING_MEI_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("red_weeping_mei_foliage_placer", () -> new FoliagePlacerType<>(RedWeepingMeiFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<WhiteWeepingMeiFoliagePlacer>> WHITE_WEEPING_MEI_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("white_weeping_mei_foliage_placer", () -> new FoliagePlacerType<>(WhiteWeepingMeiFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<GreenWeepingMeiFoliagePlacer>> GREEN_WEEPING_MEI_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("green_weeping_mei_foliage_placer", () -> new FoliagePlacerType<>(GreenWeepingMeiFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<PinkWeepingMeiFoliagePlacer>> PINK_WEEPING_MEI_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("pink_weeping_mei_foliage_placer", () -> new FoliagePlacerType<>(PinkWeepingMeiFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<VersicolorWeepingMeiFoliagePlacer>> VERSICOLOR_WEEPING_MEI_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("versicolor_weeping_mei_foliage_placer", () -> new FoliagePlacerType<>(VersicolorWeepingMeiFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<UprightCrabappleFoliagePlacer>> UPRIGHT_CRABAPPLE_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("upright_crabapple_foliage_placer", () -> new FoliagePlacerType<>(UprightCrabappleFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<ApricotFoliagePlacer>> APRICOT_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("apricot_foliage_placer", () -> new FoliagePlacerType<>(ApricotFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<PeachFoliagePlacer>> PEACH_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("peach_foliage_placer", () -> new FoliagePlacerType<>(PeachFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<GinkgoFoliagePlacer>> GINKGO_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("ginkgo_foliage_placer", () -> new FoliagePlacerType<>(GinkgoFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<AncientGinkgoFoliagePlacer>> ANCIENT_GINKGO_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("ancient_ginkgo_foliage_placer", () -> new FoliagePlacerType<>(AncientGinkgoFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<SweetgumFoliagePlacer>> SWEETGUM_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("sweetgum_foliage_placer", () -> new FoliagePlacerType<>(SweetgumFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}

