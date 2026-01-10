package com.jinlan.moreornplants;

import com.jinlan.moreornplants.block.ModBlockEntities;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.entity.ModEntities;
import com.jinlan.moreornplants.init.*;
import com.jinlan.moreornplants.item.ModCreativeModeTabs;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.worldgen.biome.ModTerrablender;
import net.minecraft.world.level.block.FlowerPotBlock;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

import static com.jinlan.moreornplants.config.ModBiomeConfig.SPEC;

@Mod(MoreOrnPlants.MODID)
public class MoreOrnPlants {
    public static final String MODID = "more_orn_plants";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MoreOrnPlants(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModEntities.register(modEventBus);
        ModParticleTypes.register(modEventBus);
        ModBlockStateProviderTypes.register(modEventBus);
        ModTrunkPlacerTypes.register(modEventBus);
        ModFoliagePlacerTypes.register(modEventBus);
        ModTreeDecoratorTypes.register(modEventBus);
        ModBambooFeatures.register(modEventBus);
        NeoForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

        modContainer.registerConfig(ModConfig.Type.COMMON, SPEC, "moreornplants-common.toml");
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM COMMON SETUP");

        event.enqueueWork(() -> {
            ModTerrablender.registerBiomes();

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RED_MEI_SAPLING.getId(), ModBlocks.POTTED_RED_MEI_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_MEI_SAPLING.getId(), ModBlocks.POTTED_WHITE_MEI_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GREEN_CALYX_MEI_SAPLING.getId(), ModBlocks.POTTED_GREEN_CALYX_MEI_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.DOUBLE_PINK_MEI_SAPLING.getId(), ModBlocks.POTTED_DOUBLE_PINK_MEI_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.VERSICOLOR_MEI_SAPLING.getId(), ModBlocks.POTTED_VERSICOLOR_MEI_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RED_WEEPING_MEI_SAPLING.getId(), ModBlocks.POTTED_RED_WEEPING_MEI_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_WEEPING_MEI_SAPLING.getId(), ModBlocks.POTTED_WHITE_WEEPING_MEI_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GREEN_WEEPING_MEI_SAPLING.getId(), ModBlocks.POTTED_GREEN_WEEPING_MEI_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_WEEPING_MEI_SAPLING.getId(), ModBlocks.POTTED_PINK_WEEPING_MEI_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING.getId(), ModBlocks.POTTED_VERSICOLOR_WEEPING_MEI_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.UPRIGHT_CRABAPPLE_SAPLING.getId(), ModBlocks.POTTED_UPRIGHT_CRABAPPLE_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WEEPING_CRABAPPLE_SAPLING.getId(), ModBlocks.POTTED_WEEPING_CRABAPPLE_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_APRICOT_SAPLING.getId(), ModBlocks.POTTED_PINK_APRICOT_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_APRICOT_SAPLING.getId(), ModBlocks.POTTED_WHITE_APRICOT_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ORNAMENTAL_PEACH_SAPLING.getId(), ModBlocks.POTTED_ORNAMENTAL_PEACH_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WILD_PEACH_SAPLING.getId(), ModBlocks.POTTED_WILD_PEACH_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PEAR_SAPLING.getId(), ModBlocks.POTTED_PEAR_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING.getId(), ModBlocks.POTTED_FLOWERING_PURPLE_LEAF_PLUM_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_LEAF_PLUM_SAPLING.getId(), ModBlocks.POTTED_PURPLE_LEAF_PLUM_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GOLDEN_OSMANTHUS_SAPLING.getId(), ModBlocks.POTTED_GOLDEN_OSMANTHUS_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ORANGE_OSMANTHUS_SAPLING.getId(), ModBlocks.POTTED_ORANGE_OSMANTHUS_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_OSMANTHUS_SAPLING.getId(), ModBlocks.POTTED_WHITE_OSMANTHUS_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GOLDEN_GINKGO_SAPLING.getId(), ModBlocks.POTTED_GOLDEN_GINKGO_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GREEN_GINKGO_SAPLING.getId(), ModBlocks.POTTED_GREEN_GINKGO_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.YELLOW_CHINESE_PARASOL_SAPLING.getId(), ModBlocks.POTTED_YELLOW_CHINESE_PARASOL_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GREEN_CHINESE_PARASOL_SAPLING.getId(), ModBlocks.POTTED_GREEN_CHINESE_PARASOL_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SWEETGUM_SAPLING.getId(), ModBlocks.POTTED_SWEETGUM_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CAMPHOR_SAPLING.getId(), ModBlocks.POTTED_CAMPHOR_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.DOVE_TREE_SAPLING.getId(), ModBlocks.POTTED_DOVE_TREE_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CHINABERRY_SAPLING.getId(), ModBlocks.POTTED_CHINABERRY_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.DESERT_POPLAR_SAPLING.getId(), ModBlocks.POTTED_DESERT_POPLAR_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CRAPE_MYRTLE_SAPLING.getId(), ModBlocks.POTTED_CRAPE_MYRTLE_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CHRYSANTHEMUM.getId(), ModBlocks.POTTED_CHRYSANTHEMUM);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GOLDEN_CHRYSANTHEMUM.getId(), ModBlocks.POTTED_GOLDEN_CHRYSANTHEMUM);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GOLD_BACKED_SCARLET_MUM.getId(), ModBlocks.POTTED_GOLD_BACKED_SCARLET_MUM);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_CHRYSANTHEMUM.getId(), ModBlocks.POTTED_WHITE_CHRYSANTHEMUM);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GREEN_CHRYSANTHEMUM.getId(), ModBlocks.POTTED_GREEN_CHRYSANTHEMUM);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_CHRYSANTHEMUM.getId(), ModBlocks.POTTED_PURPLE_CHRYSANTHEMUM);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.VIOLET_PINK_CHRYSANTHEMUM.getId(), ModBlocks.POTTED_VIOLET_PINK_CHRYSANTHEMUM);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_CHRYSANTHEMUM.getId(), ModBlocks.POTTED_PINK_CHRYSANTHEMUM);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LIGHT_PINK_CHRYSANTHEMUM.getId(), ModBlocks.POTTED_LIGHT_PINK_CHRYSANTHEMUM);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SPRING_CYMBIDIUM.getId(), ModBlocks.POTTED_SPRING_CYMBIDIUM);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SUMMER_CYMBIDIUM.getId(), ModBlocks.POTTED_SUMMER_CYMBIDIUM);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.AUTUMN_CYMBIDIUM.getId(), ModBlocks.POTTED_AUTUMN_CYMBIDIUM);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WINTER_CYMBIDIUM.getId(), ModBlocks.POTTED_WINTER_CYMBIDIUM);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PEONY.getId(), ModBlocks.POTTED_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LIGHT_PINK_PEONY.getId(), ModBlocks.POTTED_LIGHT_PINK_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.VIOLET_PINK_PEONY.getId(), ModBlocks.POTTED_VIOLET_PINK_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_PEONY.getId(), ModBlocks.POTTED_PINK_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RED_PEONY.getId(), ModBlocks.POTTED_RED_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LIGHT_RED_PEONY.getId(), ModBlocks.POTTED_LIGHT_RED_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.INK_RED_PEONY.getId(), ModBlocks.POTTED_INK_RED_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.VERMILION_PEONY.getId(), ModBlocks.POTTED_VERMILION_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_PEONY.getId(), ModBlocks.POTTED_PURPLE_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LIGHT_PURPLE_PEONY.getId(), ModBlocks.POTTED_LIGHT_PURPLE_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.INK_PURPLE_PEONY.getId(), ModBlocks.POTTED_INK_PURPLE_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.VIOLET_PEONY.getId(), ModBlocks.POTTED_VIOLET_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.YELLOW_PEONY.getId(), ModBlocks.POTTED_YELLOW_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LIGHT_YELLOW_PEONY.getId(), ModBlocks.POTTED_LIGHT_YELLOW_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.OCHRE_YELLOW_PEONY.getId(), ModBlocks.POTTED_OCHRE_YELLOW_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GOLDEN_PEONY.getId(), ModBlocks.POTTED_GOLDEN_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_PEONY.getId(), ModBlocks.POTTED_WHITE_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.INK_PEONY.getId(), ModBlocks.POTTED_INK_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLUE_PEONY.getId(), ModBlocks.POTTED_BLUE_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GREEN_PEONY.getId(), ModBlocks.POTTED_GREEN_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.COLORFUL_PEONY.getId(), ModBlocks.POTTED_COLORFUL_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LIGHT_COLORFUL_PEONY.getId(), ModBlocks.POTTED_LIGHT_COLORFUL_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.INK_COLORFUL_PEONY.getId(), ModBlocks.POTTED_INK_COLORFUL_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RED_WHITE_PEONY.getId(), ModBlocks.POTTED_RED_WHITE_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_WHITE_PEONY.getId(), ModBlocks.POTTED_PINK_WHITE_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.YELLOW_WHITE_PEONY.getId(), ModBlocks.POTTED_YELLOW_WHITE_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_WHITE_PEONY.getId(), ModBlocks.POTTED_PURPLE_WHITE_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WU_HUA_LONG_YU_PEONY.getId(), ModBlocks.POTTED_WU_HUA_LONG_YU_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MAUVE_PEONY.getId(), ModBlocks.POTTED_MAUVE_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WINTERSWEET.getId(), ModBlocks.POTTED_WINTERSWEET);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CAMELLIA.getId(), ModBlocks.POTTED_CAMELLIA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_CAMELLIA.getId(), ModBlocks.POTTED_WHITE_CAMELLIA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_CAMELLIA.getId(), ModBlocks.POTTED_PINK_CAMELLIA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.VERSICOLOR_CAMELLIA.getId(), ModBlocks.POTTED_VERSICOLOR_CAMELLIA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CRIMSON_AZALEA.getId(), ModBlocks.POTTED_CRIMSON_AZALEA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.FOUNTAIN_GRASS.getId(), ModBlocks.POTTED_FOUNTAIN_GRASS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_FOUNTAIN_GRASS.getId(), ModBlocks.POTTED_PURPLE_FOUNTAIN_GRASS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_FOUNTAIN_GRASS.getId(), ModBlocks.POTTED_PINK_FOUNTAIN_GRASS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_FOUNTAIN_GRASS.getId(), ModBlocks.POTTED_WHITE_FOUNTAIN_GRASS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CHINESE_ROSE.getId(), ModBlocks.POTTED_CHINESE_ROSE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_CHINESE_ROSE.getId(), ModBlocks.POTTED_PINK_CHINESE_ROSE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.YELLOW_CHINESE_ROSE.getId(), ModBlocks.POTTED_YELLOW_CHINESE_ROSE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_CHINESE_ROSE.getId(), ModBlocks.POTTED_WHITE_CHINESE_ROSE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RED_PINK_CHINESE_ROSE.getId(), ModBlocks.POTTED_RED_PINK_CHINESE_ROSE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RED_YELLOW_CHINESE_ROSE.getId(), ModBlocks.POTTED_RED_YELLOW_CHINESE_ROSE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RED_WHITE_CHINESE_ROSE.getId(), ModBlocks.POTTED_RED_WHITE_CHINESE_ROSE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_WHITE_CHINESE_ROSE.getId(), ModBlocks.POTTED_PINK_WHITE_CHINESE_ROSE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.YELLOW_WHITE_CHINESE_ROSE.getId(), ModBlocks.POTTED_YELLOW_WHITE_CHINESE_ROSE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MOTTLED_BAMBOO.getId(), ModBlocks.POTTED_MOTTLED_BAMBOO);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLACK_BAMBOO.getId(), ModBlocks.POTTED_BLACK_BAMBOO);
        });
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }
}
