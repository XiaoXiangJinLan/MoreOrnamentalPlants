package com.jinlan.moreornplants;

import com.jinlan.moreornplants.advancement.ModCriteriaTriggers;
import com.jinlan.moreornplants.block.ModBlockEntities;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.client.ModBoatRenderer;
import com.jinlan.moreornplants.entity.ModEntities;
import com.jinlan.moreornplants.entity.client.BaihuaCatRenderer;
import com.jinlan.moreornplants.entity.client.SuyuFoxRenderer;
import com.jinlan.moreornplants.entity.client.ZiyingFoxRenderer;
import com.jinlan.moreornplants.entity.custom.ZiyingFox;
import com.jinlan.moreornplants.init.*;
import com.jinlan.moreornplants.item.ModCreativeModeTabs;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.util.ModWoodTypes;
import com.jinlan.moreornplants.worldgen.biome.ModTerrablender;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.Map;

import static com.jinlan.moreornplants.config.ModBiomeConfig.SPEC;

@Mod(MoreOrnPlants.MOD_ID)
public class MoreOrnPlants
{
    public static final String MOD_ID = "more_orn_plants";
    public static final Logger LOGGER = LogUtils.getLogger();

    private Map<Item, Item> cuttingMap;

    public MoreOrnPlants(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        modEventBus.addListener(this::commonSetup);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModEntities.register(modEventBus);
        ModParticleTypes.PARTICLES.register(modEventBus);
        ModBlockStateProviderTypes.register(modEventBus);
        ModTrunkPlacerTypes.register(modEventBus);
        ModFoliagePlacerTypes.register(modEventBus);
        ModTreeDecoratorTypes.register(modEventBus);
        ModFeatures.register(modEventBus);
        ModCriteriaTriggers.register();

        context.registerConfig(ModConfig.Type.COMMON, SPEC, "moreornplants-common.toml");

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM COMMON SETUP");

        event.enqueueWork(() -> {
            ModTerrablender.registerBiomes();

            SpawnPlacements.register(ModEntities.ZIYING_FOX.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    ZiyingFox::checkZiyingFoxSpawnRules);
            SpawnPlacements.register(ModEntities.SUYU_FOX.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    ZiyingFox::checkZiyingFoxSpawnRules);
            SpawnPlacements.register(ModEntities.BAIHUA_CAT.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            ComposterBlock.COMPOSTABLES.put(ModBlocks.RED_MEI_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.RED_MEI_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_MEI_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_MEI_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_MEI_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_MEI_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GREEN_CALYX_MEI_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GREEN_CALYX_MEI_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.DOUBLE_PINK_MEI_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.DOUBLE_PINK_MEI_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.DOUBLE_WHITE_MEI_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.DOUBLE_WHITE_MEI_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.FLAVESCENS_MEI_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.FLAVESCENS_MEI_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.VERSICOLOR_MEI_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.VERSICOLOR_MEI_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.RED_WEEPING_MEI_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_WEEPING_MEI_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GREEN_WEEPING_MEI_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_WEEPING_MEI_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.UPRIGHT_CRABAPPLE_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.UPRIGHT_CRABAPPLE_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WEEPING_CRABAPPLE_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WEEPING_CRABAPPLE_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_APRICOT_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_APRICOT_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_APRICOT_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_APRICOT_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.ORNAMENTAL_PEACH_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.ORNAMENTAL_PEACH_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_PEACH_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_PEACH_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_PEACH_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_PEACH_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PEAR_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PEAR_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.TAIWAN_CHERRY_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.TAIWAN_CHERRY_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PURPLE_LEAF_PLUM_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PURPLE_LEAF_PLUM_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GOLDEN_OSMANTHUS_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GOLDEN_OSMANTHUS_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.ORANGE_OSMANTHUS_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.ORANGE_OSMANTHUS_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_OSMANTHUS_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_OSMANTHUS_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GOLDEN_GINKGO_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GOLDEN_GINKGO_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GREEN_GINKGO_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GREEN_GINKGO_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.YELLOW_CHINESE_PARASOL_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.YELLOW_CHINESE_PARASOL_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GREEN_CHINESE_PARASOL_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GREEN_CHINESE_PARASOL_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.SWEETGUM_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.SWEETGUM_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CAMPHOR_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.NEW_CAMPHOR_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CAMPHOR_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.DOVE_TREE_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.DOVE_TREE_BLOSSOM_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.DOVE_TREE_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CHINABERRY_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CHINABERRY_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.DESERT_POPLAR_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.DESERT_POPLAR_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CRAPE_MYRTLE_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.RED_CRAPE_MYRTLE_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_CRAPE_MYRTLE_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_CRAPE_MYRTLE_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CRAPE_MYRTLE_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.RED_CRAPE_MYRTLE_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_CRAPE_MYRTLE_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.RED_AZALEA_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.MAYING_RHODODENDRON_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.DEWDROP_RHODODENDRON_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CHARMING_RHODODENDRON_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GREAT_WHITE_RHODODENDRON_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PURPLE_RHODODENDRON_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_RHODODENDRON_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CHINESE_AZALEA_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CAMELLIA_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_CAMELLIA_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_CAMELLIA_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.VERSICOLOR_CAMELLIA_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PEACH_PINK_PETALS.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.FRAGRANT_SNOW_PETALS.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.SPRING_PETALS.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModItems.ORNAMENTAL_PEACH_PETALS.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModItems.WILD_PEACH_PETALS.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModItems.CHINESE_PARASOL_LEAF_0.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModItems.CHINESE_PARASOL_LEAF_1.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModItems.SWEETGUM_LEAF_0.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModItems.SWEETGUM_LEAF_1.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModItems.GINKGO_LEAF.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModItems.LOTUS_SEED.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModItems.BAMBOO_STICK.get(), 0.3F);

            ComposterBlock.COMPOSTABLES.put(ModItems.LOTUS_SEED_POD.get(), 0.5F);

            ComposterBlock.COMPOSTABLES.put(ModBlocks.RED_WEEPING_MEI.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_WEEPING_MEI.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GREEN_WEEPING_MEI.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_WEEPING_MEI.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.VERSICOLOR_WEEPING_MEI.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WEEPING_CRABAPPLE.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CHINESE_WISTERIA.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_CHINESE_WISTERIA.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.BLUE_CHINESE_WISTERIA.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.RED_CHINESE_WISTERIA.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.NANJING_WISTERIA.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CHRYSANTHEMUM.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.XIHU_LIUYUE.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GOLD_BACKED_SCARLET_MUM.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_CHRYSANTHEMUM.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.BLACK_CHRYSANTHEMUM.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GREEN_CHRYSANTHEMUM.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PURPLE_CHRYSANTHEMUM.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.VIOLET_PINK_CHRYSANTHEMUM.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_CHRYSANTHEMUM.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.LIGHT_PINK_CHRYSANTHEMUM.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.SPRING_CYMBIDIUM.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.SUMMER_CYMBIDIUM.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.AUTUMN_CYMBIDIUM.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.LIGHT_PINK_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.VIOLET_PINK_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.RED_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.LIGHT_RED_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.INK_RED_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.VERMILION_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PURPLE_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.LIGHT_PURPLE_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.INK_PURPLE_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.VIOLET_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.YELLOW_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.LIGHT_YELLOW_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.OCHRE_YELLOW_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GOLDEN_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.INK_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.BLUE_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GREEN_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.COLORFUL_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.LIGHT_COLORFUL_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.INK_COLORFUL_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.RED_WHITE_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_WHITE_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.YELLOW_WHITE_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PURPLE_WHITE_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WU_HUA_LONG_YU_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.MAUVE_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CAMELLIA.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_CAMELLIA.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_CAMELLIA.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.VERSICOLOR_CAMELLIA.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.RED_AZALEA.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.MAYING_RHODODENDRON.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.DEWDROP_RHODODENDRON.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CHARMING_RHODODENDRON.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GREAT_WHITE_RHODODENDRON.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PURPLE_RHODODENDRON.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_RHODODENDRON.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CHINESE_AZALEA.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CHINESE_NARCISSUS.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GOLDEN_CHINESE_NARCISSUS.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_MOTH_ORCHID.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_MOTH_ORCHID.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PURPLE_MOTH_ORCHID.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GOLDEN_MOTH_ORCHID.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WINTER_CYMBIDIUM.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WINTERSWEET.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.YAO_HUANG_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WEI_ZI_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.ZHAO_PINK_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.DOU_GREEN_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.LUOYANG_RED_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.TWO_QIAO_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.VERSICOLOR_PEONY.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CHINESE_ROSE.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_CHINESE_ROSE.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.YELLOW_CHINESE_ROSE.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_CHINESE_ROSE.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PURPLE_CHINESE_ROSE.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.RED_PINK_CHINESE_ROSE.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.RED_YELLOW_CHINESE_ROSE.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.RED_WHITE_CHINESE_ROSE.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_WHITE_CHINESE_ROSE.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.YELLOW_WHITE_CHINESE_ROSE.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PURPLE_WHITE_CHINESE_ROSE.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CRAPE_MYRTLE.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.RED_CRAPE_MYRTLE.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_CRAPE_MYRTLE.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_CRAPE_MYRTLE.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.COTTON_ROSE.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.LOTUS.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_LOTUS.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModItems.GOLDEN_MISCANTHUS.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.FOUNTAIN_GRASS.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PURPLE_FOUNTAIN_GRASS.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_FOUNTAIN_GRASS.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_FOUNTAIN_GRASS.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.LOTUS_LEAF.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.HARDY_BANANA.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.MUXUE_GRASS.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModItems.CRABAPPLE.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModItems.MEI.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModItems.LOTUS_ROOT.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModItems.PEELED_BAMBOO_SHOOTS.get(), 0.65F);

            ComposterBlock.COMPOSTABLES.put(ModBlocks.MISCANTHUS.get().asItem(), 0.85F);
        });

        initCuttingMap();
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("HELLO from server starting");
    }

    private void initCuttingMap() {
        // 使用 Map.ofEntries 构建不可变映射（或 HashMap 亦可）
        cuttingMap = Map.ofEntries(
                Map.entry(ModBlocks.CHINESE_ROSE.get().asItem(), ModBlocks.CUT_CHINESE_ROSE.get().asItem()),
                Map.entry(ModBlocks.PINK_CHINESE_ROSE.get().asItem(), ModBlocks.CUT_PINK_ROSE.get().asItem()),
                Map.entry(ModBlocks.YELLOW_CHINESE_ROSE.get().asItem(), ModBlocks.CUT_YELLOW_ROSE.get().asItem()),
                Map.entry(ModBlocks.WHITE_CHINESE_ROSE.get().asItem(), ModBlocks.CUT_WHITE_ROSE.get().asItem()),
                Map.entry(ModBlocks.PURPLE_CHINESE_ROSE.get().asItem(), ModBlocks.CUT_PURPLE_ROSE.get().asItem()),
                Map.entry(ModBlocks.BAOHUA_CHINESE_ROSE.get().asItem(), ModBlocks.CUT_BAOHUA_CHINESE_ROSE.get().asItem()),
                Map.entry(ModBlocks.COTTON_ROSE.get().asItem(), ModBlocks.CUT_COTTON_ROSE.get().asItem()),
                Map.entry(ModBlocks.PEONY.get().asItem(), ModBlocks.CUT_PEONY.get().asItem()),
                Map.entry(ModBlocks.LIGHT_PINK_PEONY.get().asItem(), ModBlocks.CUT_LIGHT_PINK_PEONY.get().asItem()),
                Map.entry(ModBlocks.VIOLET_PINK_PEONY.get().asItem(), ModBlocks.CUT_VIOLET_PINK_PEONY.get().asItem()),
                Map.entry(ModBlocks.RED_PEONY.get().asItem(), ModBlocks.CUT_RED_PEONY.get().asItem()),
                Map.entry(ModBlocks.LIGHT_RED_PEONY.get().asItem(), ModBlocks.CUT_LIGHT_RED_PEONY.get().asItem()),
                Map.entry(ModBlocks.INK_RED_PEONY.get().asItem(), ModBlocks.CUT_INK_RED_PEONY.get().asItem()),
                Map.entry(ModBlocks.PURPLE_PEONY.get().asItem(), ModBlocks.CUT_PURPLE_PEONY.get().asItem()),
                Map.entry(ModBlocks.LIGHT_PURPLE_PEONY.get().asItem(), ModBlocks.CUT_LIGHT_PURPLE_PEONY.get().asItem()),
                Map.entry(ModBlocks.INK_PURPLE_PEONY.get().asItem(), ModBlocks.CUT_INK_PURPLE_PEONY.get().asItem()),
                Map.entry(ModBlocks.YELLOW_PEONY.get().asItem(), ModBlocks.CUT_YELLOW_PEONY.get().asItem()),
                Map.entry(ModBlocks.LIGHT_YELLOW_PEONY.get().asItem(), ModBlocks.CUT_LIGHT_YELLOW_PEONY.get().asItem()),
                Map.entry(ModBlocks.OCHRE_YELLOW_PEONY.get().asItem(), ModBlocks.CUT_OCHRE_YELLOW_PEONY.get().asItem()),
                Map.entry(ModBlocks.WHITE_PEONY.get().asItem(), ModBlocks.CUT_WHITE_PEONY.get().asItem()),
                Map.entry(ModBlocks.INK_PEONY.get().asItem(), ModBlocks.CUT_INK_PEONY.get().asItem()),
                Map.entry(ModBlocks.BLUE_PEONY.get().asItem(), ModBlocks.CUT_BLUE_PEONY.get().asItem()),
                Map.entry(ModBlocks.GREEN_PEONY.get().asItem(), ModBlocks.CUT_GREEN_PEONY.get().asItem()),
                Map.entry(ModBlocks.WU_HUA_LONG_YU_PEONY.get().asItem(), ModBlocks.CUT_WU_HUA_LONG_YU_PEONY.get().asItem()),
                Map.entry(ModBlocks.MAUVE_PEONY.get().asItem(), ModBlocks.CUT_MAUVE_PEONY.get().asItem()),
                Map.entry(ModBlocks.WINTERSWEET.get().asItem(), ModBlocks.CUT_WINTERSWEET.get().asItem())
        );
    }

    @SubscribeEvent
    public void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        Player player = event.getEntity();
        Level level = event.getLevel();

        // 只在服务端执行
        if (level.isClientSide) return;

        ItemStack mainHand = player.getMainHandItem();
        ItemStack offHand = player.getOffhandItem();

        // 检查主手剪刀，副手粉色月季
        if (!mainHand.is(Items.SHEARS)) return;

        Item cutItem = cuttingMap.get(offHand.getItem());
        if (cutItem != null) {
            ItemStack result = new ItemStack(cutItem, 4);
            // 非创造模式下消耗物品和耐久
            if (!player.isCreative()) {
                offHand.shrink(1);
                mainHand.hurtAndBreak(1, player, (entity) -> {});
            }

            // 给予切花月季，背包满则掉落
            if (!player.getInventory().add(result)) {
                player.drop(result, false);
            }

            // 取消事件，防止其他逻辑干扰
            event.setCanceled(true);
            event.setCancellationResult(InteractionResult.SUCCESS);
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            Sheets.addWoodType(ModWoodTypes.RED_MEI);
            Sheets.addWoodType(ModWoodTypes.WHITE_MEI);
            Sheets.addWoodType(ModWoodTypes.GREEN_CALYX_MEI);
            Sheets.addWoodType(ModWoodTypes.DOUBLE_PINK_MEI);
            Sheets.addWoodType(ModWoodTypes.CRABAPPLE);
            Sheets.addWoodType(ModWoodTypes.APRICOT);
            Sheets.addWoodType(ModWoodTypes.PEACH);
            Sheets.addWoodType(ModWoodTypes.PEAR);
            Sheets.addWoodType(ModWoodTypes.PURPLE_LEAF_PLUM);
            Sheets.addWoodType(ModWoodTypes.OSMANTHUS);
            Sheets.addWoodType(ModWoodTypes.GINKGO);
            Sheets.addWoodType(ModWoodTypes.CHINESE_PARASOL);
            Sheets.addWoodType(ModWoodTypes.SWEETGUM);
            Sheets.addWoodType(ModWoodTypes.CAMPHOR);
            Sheets.addWoodType(ModWoodTypes.DOVE_TREE);
            Sheets.addWoodType(ModWoodTypes.CHINABERRY);
            Sheets.addWoodType(ModWoodTypes.DESERT_POPLAR);

            EntityRenderers.register(ModEntities.MOD_BOAT.get(), pContext -> new ModBoatRenderer(pContext, false));
            EntityRenderers.register(ModEntities.MOD_CHEST_BOAT.get(), pContext -> new ModBoatRenderer(pContext, true));
            EntityRenderers.register(ModEntities.ZIYING_FOX.get(), ZiyingFoxRenderer::new);
            EntityRenderers.register(ModEntities.SUYU_FOX.get(), SuyuFoxRenderer::new);
            EntityRenderers.register(ModEntities.BAIHUA_CAT.get(), BaihuaCatRenderer::new);
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
