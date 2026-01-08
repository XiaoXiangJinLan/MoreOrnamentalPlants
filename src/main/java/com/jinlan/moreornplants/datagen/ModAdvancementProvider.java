package com.jinlan.moreornplants.datagen;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.util.ForgeTags;
import com.jinlan.moreornplants.worldgen.biome.ModBiomes;
import net.minecraft.advancements.*;
import net.minecraft.advancements.critereon.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.AdvancementProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementProvider extends AdvancementProvider {
    public ModAdvancementProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, ExistingFileHelper existingFileHelper) {
        super(output, registries, existingFileHelper, List.of(new ModAdvancements()));
    }

    public static class ModAdvancements implements AdvancementGenerator {
        @Override
        public void generate(HolderLookup.Provider registries, Consumer<AdvancementHolder> saver, ExistingFileHelper existingFileHelper) {
            // 根进度
            AdvancementHolder root = Advancement.Builder.advancement()
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.TWO_QIAO_PEONY.get()),
                            Component.translatable("advancement.moreornplants.root.title"),
                            Component.translatable("advancement.moreornplants.root.description"),
                            Optional.of(ResourceLocation.parse("more_orn_plants:textures/gui/advancement/florilegium.png")),
                            AdvancementType.TASK,
                            false,
                            false,
                            false
                    ))
                    .addCriterion("get_florilegium", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.PLANT_IN_FLORILEGIUM).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID), existingFileHelper);

            AdvancementHolder flowerLeader = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.DOUBLE_PINK_MEI_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.the_leader_among_flower.title"),
                            Component.translatable("advancement.moreornplants.the_leader_among_flower.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_mei", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.MEI_SAPLING).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "the_leader_among_flower"), existingFileHelper);

            Advancement winterGuest = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.WINTERSWEET.get()),
                            Component.translatable("advancement.moreornplants.the_winter_guest.title"),
                            Component.translatable("advancement.moreornplants.the_winter_guest.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_wintersweet", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.WINTERSWEET.get()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "the_winter_guest"), existingFileHelper).value();

            Advancement flowerKing = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(Blocks.PEONY),
                            Component.translatable("advancement.moreornplants.flower_king.title"),
                            Component.translatable("advancement.moreornplants.flower_king.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_tree_peony", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.TREE_PEONY).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "flower_king"), existingFileHelper).value();

            Advancement flowerChancellor = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.PEONY.get()),
                            Component.translatable("advancement.moreornplants.flower_chancellor.title"),
                            Component.translatable("advancement.moreornplants.flower_chancellor.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_herbaceous_peony", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.HERBACEOUS_PEONY).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "flower_chancellor"), existingFileHelper).value();

            AdvancementHolder flowerQueen = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.CHINESE_ROSE.get()),
                            Component.translatable("advancement.moreornplants.flower_queen.title"),
                            Component.translatable("advancement.moreornplants.flower_queen.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_chinese_rose", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CHINESE_ROSE).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "flower_queen"), existingFileHelper);

            Advancement regalFragrance = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.SPRING_CYMBIDIUM.get()),
                            Component.translatable("advancement.moreornplants.regal_fragrance.title"),
                            Component.translatable("advancement.moreornplants.regal_fragrance.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_cymbidium", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CYMBIDIUM).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "regal_fragrance"), existingFileHelper).value() ;

            AdvancementHolder flowerHermit = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.CHRYSANTHEMUM.get()),
                            Component.translatable("advancement.moreornplants.flower_hermit.title"),
                            Component.translatable("advancement.moreornplants.flower_hermit.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_chrysanthemum", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CHRYSANTHEMUM).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "flower_hermit"), existingFileHelper);

            Advancement celestialConsort = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.UPRIGHT_CRABAPPLE_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.celestial_consort.title"),
                            Component.translatable("advancement.moreornplants.celestial_consort.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_crabapple", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CRABAPPLE_SAPLING).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "celestial_consort"), existingFileHelper).value();

            Advancement fragranceAfar = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.GOLDEN_OSMANTHUS_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.fragrance_afar.title"),
                            Component.translatable("advancement.moreornplants.fragrance_afar.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_osmanthus", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.OSMANTHUS_SAPLING).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "fragrance_afar"), existingFileHelper).value();

            AdvancementHolder flowerScholar = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.PINK_APRICOT_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.flower_scholar.title"),
                            Component.translatable("advancement.moreornplants.flower_scholar.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_apricot", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.APRICOT_SAPLING).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "flower_scholar"), existingFileHelper);

            AdvancementHolder wulingVista = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.ORNAMENTAL_PEACH_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.wuling_vista.title"),
                            Component.translatable("advancement.moreornplants.wuling_vista.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_peach", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.PEACH_SAPLING).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "wuling_vista"), existingFileHelper);

            Advancement pearInRain = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.PEAR_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.pear_in_rain.title"),
                            Component.translatable("advancement.moreornplants.pear_in_rain.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_pear", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.PEAR_SAPLING.get()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "pear_in_rain"), existingFileHelper).value();

            Advancement auraFromEast = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.aura_from_east.title"),
                            Component.translatable("advancement.moreornplants.aura_from_east.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_plum", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.PLUM_SAPLING).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "aura_from_east"), existingFileHelper).value();

            Advancement lotusSage = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.LOTUS.get()),
                            Component.translatable("advancement.moreornplants.lotus_sage.title"),
                            Component.translatable("advancement.moreornplants.lotus_sage.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_lotus", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.LOTUS).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "lotus_sage"), existingFileHelper).value();

            Advancement hundredDayRed = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.CRAPE_MYRTLE.get()),
                            Component.translatable("advancement.moreornplants.hundred_day_red.title"),
                            Component.translatable("advancement.moreornplants.hundred_day_red.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_crape_myrtle", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CRAPE_MYRTLE).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "hundred_day_red"), existingFileHelper).value();

            Advancement lastingBeauty = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.CAMELLIA.get()),
                            Component.translatable("advancement.moreornplants.lasting_beauty.title"),
                            Component.translatable("advancement.moreornplants.lasting_beauty.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_camellia", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CAMELLIA).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "lasting_beauty"), existingFileHelper).value();

            AdvancementHolder flowerBeauty = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(Blocks.FLOWERING_AZALEA),
                            Component.translatable("advancement.moreornplants.flower_beauty.title"),
                            Component.translatable("advancement.moreornplants.flower_beauty.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_azalea", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.AZALEA).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "flower_beauty"), existingFileHelper);

            AdvancementHolder frostDefiant = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.COTTON_ROSE.get()),
                            Component.translatable("advancement.moreornplants.the_frost_defiant.title"),
                            Component.translatable("advancement.moreornplants.the_frost_defiant.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_cottonrose", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.COTTON_ROSE.get()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "the_frost_defiant"), existingFileHelper);

            Advancement flowerGallant = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(Blocks.ROSE_BUSH),
                            Component.translatable("advancement.moreornplants.flower_gallant.title"),
                            Component.translatable("advancement.moreornplants.flower_gallant.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_rose_bush", InventoryChangeTrigger.TriggerInstance.hasItems(
                            Blocks.ROSE_BUSH
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "flower_gallant"), existingFileHelper).value();

            Advancement flowerLament = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(Blocks.POPPY),
                            Component.translatable("advancement.moreornplants.flower_lament.title"),
                            Component.translatable("advancement.moreornplants.flower_lament.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_poppy", InventoryChangeTrigger.TriggerInstance.hasItems(
                            Blocks.POPPY
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "flower_lament"), existingFileHelper).value();

            Advancement flowerMelancholy = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(Blocks.LILAC),
                            Component.translatable("advancement.moreornplants.flower_melancholy.title"),
                            Component.translatable("advancement.moreornplants.flower_melancholy.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_lilac", InventoryChangeTrigger.TriggerInstance.hasItems(
                            Blocks.LILAC
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "flower_melancholy"), existingFileHelper).value();

            Advancement flowerLoyalist = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(Blocks.SUNFLOWER),
                            Component.translatable("advancement.moreornplants.flower_loyalist.title"),
                            Component.translatable("advancement.moreornplants.flower_loyalist.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_sunflower", InventoryChangeTrigger.TriggerInstance.hasItems(
                            Blocks.SUNFLOWER
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "flower_loyalist"), existingFileHelper).value();

            Advancement grandMonarch = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.GOLDEN_GINKGO_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.grand_monarch.title"),
                            Component.translatable("advancement.moreornplants.grand_monarch.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_ginkgo", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.GINKGO_SAPLING).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "grand_monarch"), existingFileHelper).value();

            Advancement sacredTimber = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.CAMPHOR_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.sacred_timber.title"),
                            Component.translatable("advancement.moreornplants.sacred_timber.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_camphor", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.CAMPHOR_SAPLING.get()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "sacred_timber"), existingFileHelper).value();

            Advancement phoenixRoost = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.YELLOW_CHINESE_PARASOL_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.phoenix_roost.title"),
                            Component.translatable("advancement.moreornplants.phoenix_roost.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_chinese_parasol", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CHINESE_PARASOL_SAPLING).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "phoenix_roost"), existingFileHelper).value();

            Advancement riversideBeacon = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.SWEETGUM_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.riverside_beacon.title"),
                            Component.translatable("advancement.moreornplants.riverside_beacon.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_sweetgum", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.SWEETGUM_SAPLING.get()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "riverside_beacon"), existingFileHelper).value();

            Advancement doveTree = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.DOVE_TREE_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.dove_tree.title"),
                            Component.translatable("advancement.moreornplants.dove_tree.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_dove_tree", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.DOVE_TREE_SAPLING.get()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "dove_tree"), existingFileHelper).value();

            Advancement chinaberryWind = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.CHINABERRY_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.chinaberry_wind.title"),
                            Component.translatable("advancement.moreornplants.chinaberry_wind.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_chinaberry", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.CHINABERRY_SAPLING.get()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "chinaberry_wind"), existingFileHelper).value();

            Advancement heroOfDesert = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.DESERT_POPLAR_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.hero_of_desert.title"),
                            Component.translatable("advancement.moreornplants.hero_of_desert.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_desert_poplar", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.DESERT_POPLAR_SAPLING.get()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "hero_of_desert"), existingFileHelper).value();

            Advancement grasses = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.FOUNTAIN_GRASS.get()),
                            Component.translatable("advancement.moreornplants.grasses.title"),
                            Component.translatable("advancement.moreornplants.grasses.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_grasses", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.ORNAMENTAL_GRASS).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "grasses"), existingFileHelper).value();

            Advancement fourGentlemen = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(Blocks.BAMBOO),
                            Component.translatable("advancement.moreornplants.four_gentlemen.title"),
                            Component.translatable("advancement.moreornplants.four_gentlemen.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
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
                    .requirements(AdvancementRequirements.Strategy.AND)
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "four_gentlemen"), existingFileHelper).value();

            Advancement sendSpring = Advancement.Builder.advancement()
                    .parent(flowerLeader)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.WHITE_MEI_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.send_spring.title"),
                            Component.translatable("advancement.moreornplants.send_spring.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("place_mei_sapling", ItemUsedOnLocationTrigger.TriggerInstance.itemUsedOnBlock(
                            LocationPredicate.Builder.location().setBlock(BlockPredicate.Builder.block().of(BlockTags.DIRT).of(Blocks.FARMLAND)),
                            ItemPredicate.Builder.item().of(ForgeTags.Items.MEI_SAPLING)))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "send_spring"), existingFileHelper).value();

            Advancement offerChrysanthemum = Advancement.Builder.advancement()
                    .parent(flowerHermit)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.WHITE_CHRYSANTHEMUM.get()),
                            Component.translatable("advancement.moreornplants.offer_chrysanthemum.title"),
                            Component.translatable("advancement.moreornplants.offer_chrysanthemum.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("offer_chrysanthemum", ItemUsedOnLocationTrigger.TriggerInstance.itemUsedOnBlock(
                            LocationPredicate.Builder.location().setBlock(BlockPredicate.Builder.block().of(BlockTags.DIRT).of(Blocks.FARMLAND)),
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CHRYSANTHEMUM)))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "offer_chrysanthemum"), existingFileHelper).value();

            AdvancementHolder treadSnowSeekMei = Advancement.Builder.advancement()
                    .parent(flowerLeader)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.RED_MEI_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.tread_snow_seek_mei.title"),
                            Component.translatable("advancement.moreornplants.tread_snow_seek_mei.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("visit_red_mei_forest", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiomes(ModBiomes.RED_MEI_FOREST).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "tread_snow_seek_mei"), existingFileHelper);

            AdvancementHolder peachBlossomSpring = Advancement.Builder.advancement()
                    .parent(wulingVista)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.WILD_PEACH_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.peach_blossom_spring.title"),
                            Component.translatable("advancement.moreornplants.peach_blossom_spring.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("visit_peach_blossom_spring", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiomes(ModBiomes.THE_PEACH_BLOSSOM_SPRING).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "peach_blossom_spring"), existingFileHelper);

            Advancement flowersAsMatchmakers = Advancement.Builder.advancement()
                    .parent(flowerQueen)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.PINK_CHINESE_ROSE.get()),
                            Component.translatable("advancement.moreornplants.flowers_as_matchmakers.title"),
                            Component.translatable("advancement.moreornplants.flowers_as_matchmakers.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("visit_flowers_grove", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiomes(ModBiomes.FLOWERS_GROVE).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "flowers_as_matchmakers"), existingFileHelper);

            Advancement crimsonHighlands = Advancement.Builder.advancement()
                    .parent(flowerBeauty)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.CRIMSON_AZALEA.get()),
                            Component.translatable("advancement.moreornplants.crimson_highlands.title"),
                            Component.translatable("advancement.moreornplants.crimson_highlands.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("visit_crimson_highlands", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiomes(ModBiomes.CRIMSON_HIGHLANDS).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "crimson_highlands"), existingFileHelper);

            Advancement cottonroseRealm = Advancement.Builder.advancement()
                    .parent(frostDefiant)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.MOTTLED_BAMBOO.get()),
                            Component.translatable("advancement.moreornplants.cottonrose_realm.title"),
                            Component.translatable("advancement.moreornplants.cottonrose_realm.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("visit_cottonrose_realm", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiomes(ModBiomes.COTTONROSE_REALM).build()
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "cottonrose_realm"), existingFileHelper);

            Advancement ironThresholdTemple = Advancement.Builder.advancement()
                    .parent(treadSnowSeekMei)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.RED_WEEPING_MEI_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.little_iron_threshold_temple.title"),
                            Component.translatable("advancement.moreornplants.little_iron_threshold_temple.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("found_iron_threshold_temple", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setStructures(HolderSet.direct(registries.lookupOrThrow(Registries.STRUCTURE).getOrThrow(
                                    ResourceKey.create(Registries.STRUCTURE, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "little_iron_threshold_temple")))))
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "little_iron_threshold_temple"), existingFileHelper).value();
            Advancement peachHermitage = Advancement.Builder.advancement()
                    .parent(peachBlossomSpring)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.PEACH_PINK_PETALS.get()),
                            Component.translatable("advancement.moreornplants.peach_blossom_hermitage.title"),
                            Component.translatable("advancement.moreornplants.peach_blossom_hermitage.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("found_peach_hermitage", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setStructures(HolderSet.direct(registries.lookupOrThrow(Registries.STRUCTURE).getOrThrow(
                                    ResourceKey.create(Registries.STRUCTURE, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "peach_blossom_hermitage")))))
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "peach_blossom_hermitage"), existingFileHelper).value();
            Advancement apricotVillage = Advancement.Builder.advancement()
                    .parent(flowerScholar)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.WHITE_APRICOT_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.apricot_village.title"),
                            Component.translatable("advancement.moreornplants.apricot_village.description"),
                            Optional.empty(),
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("found_apricot_village", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setStructures(HolderSet.direct(registries.lookupOrThrow(Registries.STRUCTURE).getOrThrow(
                                    ResourceKey.create(Registries.STRUCTURE, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "village_apricot")))))
                    ))
                    .save(saver, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "apricot_village"), existingFileHelper).value();
        }
    }
}
