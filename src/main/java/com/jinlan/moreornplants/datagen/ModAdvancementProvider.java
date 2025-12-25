package com.jinlan.moreornplants.datagen;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.util.ForgeTags;
import com.jinlan.moreornplants.worldgen.biome.ModBiomes;
import net.minecraft.advancements.*;
import net.minecraft.advancements.critereon.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import net.minecraft.advancements.critereon.BlockPredicate;
import net.minecraft.advancements.critereon.LocationPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementProvider extends ForgeAdvancementProvider {
    public ModAdvancementProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, ExistingFileHelper existingFileHelper) {
        super(output, registries, existingFileHelper, List.of(new ModAdvancements()));
    }

    public static class ModAdvancements implements AdvancementGenerator {
        @Override
        public void generate(HolderLookup.Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
            // 根进度
            Advancement root = Advancement.Builder.advancement()
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.TWO_QIAO_PEONY.get()),
                            Component.translatable("advancement.moreornplants.root.title"),
                            Component.translatable("advancement.moreornplants.root.description"),
                            new ResourceLocation("more_orn_plants:textures/gui/advancement/florilegium.png"),
                            FrameType.TASK,
                            false,
                            false,
                            false
                    ))
                    .addCriterion("get_florilegium", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.PLANT_IN_FLORILEGIUM).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "root"), existingFileHelper);

            Advancement flowerLeader = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.DOUBLE_PINK_MEI_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.the_leader_among_flower.title"),
                            Component.translatable("advancement.moreornplants.the_leader_among_flower.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_mei", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.MEI_SAPLING).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "the_leader_among_flower"), existingFileHelper);

            Advancement winterGuest = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.WINTERSWEET.get()),
                            Component.translatable("advancement.moreornplants.the_winter_guest.title"),
                            Component.translatable("advancement.moreornplants.the_winter_guest.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_wintersweet", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.WINTERSWEET).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "the_winter_guest"), existingFileHelper);

            Advancement flowerKing = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(Blocks.PEONY),
                            Component.translatable("advancement.moreornplants.flower_king.title"),
                            Component.translatable("advancement.moreornplants.flower_king.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_tree_peony", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.TREE_PEONY).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "flower_king"), existingFileHelper);

            Advancement flowerChancellor = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.PEONY.get()),
                            Component.translatable("advancement.moreornplants.flower_chancellor.title"),
                            Component.translatable("advancement.moreornplants.flower_chancellor.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_herbaceous_peony", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.HERBACEOUS_PEONY).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "flower_chancellor"), existingFileHelper);

            Advancement flowerQueen = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.CHINESE_ROSE.get()),
                            Component.translatable("advancement.moreornplants.flower_queen.title"),
                            Component.translatable("advancement.moreornplants.flower_queen.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_chinese_rose", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CHINESE_ROSE).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "flower_queen"), existingFileHelper);

            Advancement regalFragrance = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.SPRING_CYMBIDIUM.get()),
                            Component.translatable("advancement.moreornplants.regal_fragrance.title"),
                            Component.translatable("advancement.moreornplants.regal_fragrance.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_cymbidium", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.SPRING_CYMBIDIUM.get()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "regal_fragrance"), existingFileHelper);

            Advancement flowerHermit = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.CHRYSANTHEMUM.get()),
                            Component.translatable("advancement.moreornplants.flower_hermit.title"),
                            Component.translatable("advancement.moreornplants.flower_hermit.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_chrysanthemum", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CHRYSANTHEMUM).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "flower_hermit"), existingFileHelper);

            Advancement celestialConsort = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.UPRIGHT_CRABAPPLE_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.celestial_consort.title"),
                            Component.translatable("advancement.moreornplants.celestial_consort.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_crabapple", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CRABAPPLE_SAPLING).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "celestial_consort"), existingFileHelper);

            Advancement fragranceAfar = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.GOLDEN_OSMANTHUS_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.fragrance_afar.title"),
                            Component.translatable("advancement.moreornplants.fragrance_afar.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_osmanthus", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.OSMANTHUS_SAPLING).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "fragrance_afar"), existingFileHelper);

            Advancement flowerScholar = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.PINK_APRICOT_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.flower_scholar.title"),
                            Component.translatable("advancement.moreornplants.flower_scholar.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_apricot", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.APRICOT_SAPLING).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "flower_scholar"), existingFileHelper);

            Advancement wulingVista = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.ORNAMENTAL_PEACH_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.wuling_vista.title"),
                            Component.translatable("advancement.moreornplants.wuling_vista.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_peach", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.PEACH_SAPLING).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "wuling_vista"), existingFileHelper);

            Advancement pearInRain = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.PEAR_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.pear_in_rain.title"),
                            Component.translatable("advancement.moreornplants.pear_in_rain.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_pear", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.PEAR_SAPLING.get()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "pear_in_rain"), existingFileHelper);

            Advancement auraFromEast = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.aura_from_east.title"),
                            Component.translatable("advancement.moreornplants.aura_from_east.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_plum", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.PLUM_SAPLING).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "aura_from_east"), existingFileHelper);

            Advancement lotusSage = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.LOTUS.get()),
                            Component.translatable("advancement.moreornplants.lotus_sage.title"),
                            Component.translatable("advancement.moreornplants.lotus_sage.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_lotus", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.LOTUS.get()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "lotus_sage"), existingFileHelper);

            Advancement hundredDayRed = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.CRAPE_MYRTLE.get()),
                            Component.translatable("advancement.moreornplants.hundred_day_red.title"),
                            Component.translatable("advancement.moreornplants.hundred_day_red.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_crape_myrtle", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CRAPE_MYRTLE).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "hundred_day_red"), existingFileHelper);

            Advancement  lastingBeauty = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.CAMELLIA.get()),
                            Component.translatable("advancement.moreornplants.lasting_beauty.title"),
                            Component.translatable("advancement.moreornplants.lasting_beauty.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_camellia", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CAMELLIA).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "lasting_beauty"), existingFileHelper);

            Advancement flowerBeauty = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(Blocks.FLOWERING_AZALEA),
                            Component.translatable("advancement.moreornplants.flower_beauty.title"),
                            Component.translatable("advancement.moreornplants.flower_beauty.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_azalea", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.AZALEA).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "flower_beauty"), existingFileHelper);

            Advancement frostDefiant = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.COTTON_ROSE.get()),
                            Component.translatable("advancement.moreornplants.the_frost_defiant.title"),
                            Component.translatable("advancement.moreornplants.the_frost_defiant.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_cottonrose", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.COTTON_ROSE.get()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "the_frost_defiant"), existingFileHelper);

            Advancement flowerGallant = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(Blocks.ROSE_BUSH),
                            Component.translatable("advancement.moreornplants.flower_gallant.title"),
                            Component.translatable("advancement.moreornplants.flower_gallant.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_rose_bush", InventoryChangeTrigger.TriggerInstance.hasItems(
                            Blocks.ROSE_BUSH
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "flower_gallant"), existingFileHelper);

            Advancement flowerLament = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(Blocks.POPPY),
                            Component.translatable("advancement.moreornplants.flower_lament.title"),
                            Component.translatable("advancement.moreornplants.flower_lament.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_poppy", InventoryChangeTrigger.TriggerInstance.hasItems(
                            Blocks.POPPY
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "flower_lament"), existingFileHelper);

            Advancement flowerMelancholy = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(Blocks.LILAC),
                            Component.translatable("advancement.moreornplants.flower_melancholy.title"),
                            Component.translatable("advancement.moreornplants.flower_melancholy.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_lilac", InventoryChangeTrigger.TriggerInstance.hasItems(
                            Blocks.LILAC
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "flower_melancholy"), existingFileHelper);

            Advancement flowerLoyalist = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(Blocks.SUNFLOWER),
                            Component.translatable("advancement.moreornplants.flower_loyalist.title"),
                            Component.translatable("advancement.moreornplants.flower_loyalist.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_sunflower", InventoryChangeTrigger.TriggerInstance.hasItems(
                            Blocks.SUNFLOWER
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "flower_loyalist"), existingFileHelper);

            Advancement  grandMonarch = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.GOLDEN_GINKGO_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.grand_monarch.title"),
                            Component.translatable("advancement.moreornplants.grand_monarch.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_ginkgo", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.GINKGO_SAPLING).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "grand_monarch"), existingFileHelper);

            Advancement sacredTimber = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.CAMPHOR_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.sacred_timber.title"),
                            Component.translatable("advancement.moreornplants.sacred_timber.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_camphor", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.CAMPHOR_SAPLING.get()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "sacred_timber"), existingFileHelper);

            Advancement  phoenixRoost = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.YELLOW_CHINESE_PARASOL_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.phoenix_roost.title"),
                            Component.translatable("advancement.moreornplants.phoenix_roost.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_chinese_parasol", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CHINESE_PARASOL_SAPLING).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "phoenix_roost"), existingFileHelper);

            Advancement riversideBeacon = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.SWEETGUM_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.riverside_beacon.title"),
                            Component.translatable("advancement.moreornplants.riverside_beacon.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_sweetgum", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.SWEETGUM_SAPLING.get()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "riverside_beacon"), existingFileHelper);

            Advancement doveTree = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.DOVE_TREE_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.dove_tree.title"),
                            Component.translatable("advancement.moreornplants.dove_tree.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_dove_tree", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.DOVE_TREE_SAPLING.get()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "dove_tree"), existingFileHelper);

            Advancement chinaberryWind = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.CHINABERRY_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.chinaberry_wind.title"),
                            Component.translatable("advancement.moreornplants.chinaberry_wind.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_chinaberry", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.CHINABERRY_SAPLING.get()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "chinaberry_wind"), existingFileHelper);

            Advancement fourGentlemen = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(Blocks.BAMBOO),
                            Component.translatable("advancement.moreornplants.four_gentlemen.title"),
                            Component.translatable("advancement.moreornplants.four_gentlemen.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_mei", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.MEI_SAPLING).build()))
                    .addCriterion("get_spring_cymbidium", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.SPRING_CYMBIDIUM.get()))
                    .addCriterion("get_bamboo", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.BAMBOO).build()))
                    .addCriterion("get_chrysanthemum", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CHRYSANTHEMUM).build()))
                    .requirements(RequirementsStrategy.AND)
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "four_gentlemen"), existingFileHelper);

            Advancement sendSpring = Advancement.Builder.advancement()
                    .parent(flowerLeader)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.WHITE_MEI_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.send_spring.title"),
                            Component.translatable("advancement.moreornplants.send_spring.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("place_mei_sapling", ItemUsedOnLocationTrigger.TriggerInstance.itemUsedOnBlock(
                            LocationPredicate.Builder.location().setBlock(BlockPredicate.Builder.block().of(Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL, Blocks.FARMLAND, Blocks.MOSS_BLOCK, Blocks.MUD).build()),
                            ItemPredicate.Builder.item().of(ForgeTags.Items.MEI_SAPLING)))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "send_spring"), existingFileHelper);

            Advancement offerChrysanthemum = Advancement.Builder.advancement()
                    .parent(flowerHermit)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.WHITE_CHRYSANTHEMUM.get()),
                            Component.translatable("advancement.moreornplants.offer_chrysanthemum.title"),
                            Component.translatable("advancement.moreornplants.offer_chrysanthemum.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("offer_chrysanthemum", ItemUsedOnLocationTrigger.TriggerInstance.itemUsedOnBlock(
                            LocationPredicate.Builder.location().setBlock(BlockPredicate.Builder.block().of(Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL, Blocks.FARMLAND, Blocks.MOSS_BLOCK, Blocks.MUD).build()),
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CHRYSANTHEMUM)))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "offer_chrysanthemum"), existingFileHelper);

            Advancement treadSnowSeekMei = Advancement.Builder.advancement()
                    .parent(flowerLeader)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.RED_MEI_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.tread_snow_seek_mei.title"),
                            Component.translatable("advancement.moreornplants.tread_snow_seek_mei.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("visit_red_mei_forest", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.RED_MEI_FOREST).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "tread_snow_seek_mei"), existingFileHelper);

            Advancement peachBlossomSpring = Advancement.Builder.advancement()
                    .parent(wulingVista)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.WILD_PEACH_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.peach_blossom_spring.title"),
                            Component.translatable("advancement.moreornplants.peach_blossom_spring.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("visit_peach_blossom_spring", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.THE_PEACH_BLOSSOM_SPRING).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "peach_blossom_spring"), existingFileHelper);

            Advancement flowersAsMatchmakers = Advancement.Builder.advancement()
                    .parent(flowerQueen)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.PINK_CHINESE_ROSE.get()),
                            Component.translatable("advancement.moreornplants.flowers_as_matchmakers.title"),
                            Component.translatable("advancement.moreornplants.flowers_as_matchmakers.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("visit_flowers_grove", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.FLOWERS_GROVE).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "flowers_as_matchmakers"), existingFileHelper);

            Advancement crimsonHighlands = Advancement.Builder.advancement()
                    .parent(flowerBeauty)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.CRIMSON_AZALEA.get()),
                            Component.translatable("advancement.moreornplants.crimson_highlands.title"),
                            Component.translatable("advancement.moreornplants.crimson_highlands.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("visit_crimson_highlands", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.CRIMSON_HIGHLANDS).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "crimson_highlands"), existingFileHelper);

            Advancement cottonroseRealm = Advancement.Builder.advancement()
                    .parent(frostDefiant)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.MOTTLED_BAMBOO.get()),
                            Component.translatable("advancement.moreornplants.cottonrose_realm.title"),
                            Component.translatable("advancement.moreornplants.cottonrose_realm.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("visit_cottonrose_realm", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.COTTONROSE_REALM).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "cottonrose_realm"), existingFileHelper);

            Advancement ironThresholdTemple = Advancement.Builder.advancement()
                    .parent(treadSnowSeekMei)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.RED_WEEPING_MEI_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.little_iron_threshold_temple.title"),
                            Component.translatable("advancement.moreornplants.little_iron_threshold_temple.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("found_iron_threshold_temple", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setStructure(ResourceKey.create(Registries.STRUCTURE,
                                    new ResourceLocation(MoreOrnPlants.MOD_ID, "little_iron_threshold_temple"))).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "little_iron_threshold_temple"), existingFileHelper);
            Advancement peachHermitage = Advancement.Builder.advancement()
                    .parent(peachBlossomSpring)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.PEACH_PINK_PETALS.get()),
                            Component.translatable("advancement.moreornplants.peach_blossom_hermitage.title"),
                            Component.translatable("advancement.moreornplants.peach_blossom_hermitage.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("found_peach_hermitage", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setStructure(ResourceKey.create(Registries.STRUCTURE,
                                    new ResourceLocation(MoreOrnPlants.MOD_ID, "peach_blossom_hermitage"))).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "peach_blossom_hermitage"), existingFileHelper);
            Advancement apricotVillage = Advancement.Builder.advancement()
                    .parent(flowerScholar)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.WHITE_APRICOT_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.apricot_village.title"),
                            Component.translatable("advancement.moreornplants.apricot_village.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("found_apricot_village", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setStructure(ResourceKey.create(Registries.STRUCTURE,
                                    new ResourceLocation(MoreOrnPlants.MOD_ID, "village_apricot"))).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "apricot_village"), existingFileHelper);
        }
    }
}
