package com.jinlan.moreornplants.init;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.feature.blockstateproviders.VersicolorMeiLeavesProvider;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProviderType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockStateProviderTypes {
    public static final DeferredRegister<BlockStateProviderType<?>> BLOCK_STATE_PROVIDERS =
            DeferredRegister.create(Registries.BLOCK_STATE_PROVIDER_TYPE, MoreOrnPlants.MODID);

    public static final Supplier<BlockStateProviderType<VersicolorMeiLeavesProvider>> VERSICOLOR_MEI_LEAVES_PROVIDER =
            BLOCK_STATE_PROVIDERS.register("versicolor_mei_leaves_provider", () -> new BlockStateProviderType<>(VersicolorMeiLeavesProvider.CODEC));

    public static void register(IEventBus eventBus) {
        BLOCK_STATE_PROVIDERS.register(eventBus);
    }
}
