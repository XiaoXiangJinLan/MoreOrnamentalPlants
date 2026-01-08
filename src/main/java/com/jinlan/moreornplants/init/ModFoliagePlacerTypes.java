package com.jinlan.moreornplants.init;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.feature.foliageplacers.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModFoliagePlacerTypes {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS =
            DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, MoreOrnPlants.MODID);

    public static final Supplier<FoliagePlacerType<MeiFoliagePlacer>> MEI_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("mei_foliage_placer", () -> new FoliagePlacerType<>(MeiFoliagePlacer.CODEC));

    public static final Supplier<FoliagePlacerType<ApricotFoliagePlacer>> APRICOT_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("apricot_foliage_placer", () -> new FoliagePlacerType<>(ApricotFoliagePlacer.CODEC));

    public static final Supplier<FoliagePlacerType<PeachFoliagePlacer>> PEACH_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("peach_foliage_placer", () -> new FoliagePlacerType<>(PeachFoliagePlacer.CODEC));

    public static final Supplier<FoliagePlacerType<GinkgoFoliagePlacer>> GINKGO_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("ginkgo_foliage_placer", () -> new FoliagePlacerType<>(GinkgoFoliagePlacer.CODEC));

    public static final Supplier<FoliagePlacerType<SweetgumFoliagePlacer>> SWEETGUM_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("sweetgum_foliage_placer", () -> new FoliagePlacerType<>(SweetgumFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}

