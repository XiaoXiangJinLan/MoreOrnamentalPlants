package com.jinlan.moreornplants.datagen;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.advancement.MoonlightTrigger;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.util.ForgeTags;
import com.jinlan.moreornplants.util.ModTags;
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
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementProvider extends ForgeAdvancementProvider {
    public ModAdvancementProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, ExistingFileHelper existingFileHelper) {
        super(output, registries, existingFileHelper, List.of(new ModAdvancements()));
    }

    public static class ModAdvancements implements AdvancementGenerator {
        @Override
        public void generate(HolderLookup.@NotNull Provider registries, @NotNull Consumer<Advancement> saver, @NotNull ExistingFileHelper existingFileHelper) {
            // 根进度
            Advancement root = Advancement.Builder.advancement()
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.TWO_QIAO_PEONY.get()),
                            Component.translatable("advancement.moreornplants.root.title"),
                            Component.translatable("advancement.moreornplants.root.description"),
                            new ResourceLocation("more_orn_plants:textures/gui/advancement/florilegium.png"),
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_florilegium", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.PLANT_IN_FLORILEGIUM).build()
                    ))
                    .rewards(AdvancementRewards.Builder.loot(new ResourceLocation(MoreOrnPlants.MOD_ID, "advancements/baihua_sword")))
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
                            false,
                            false
                    ))
                    .addCriterion("get_mei", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModTags.Items.MEI_SAPLING).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(11))
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
                            false,
                            false
                    ))
                    .addCriterion("get_wintersweet", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.WINTERSWEET.get()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(6))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "the_winter_guest"), existingFileHelper);

            Advancement flowerKing = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.ZHAO_PINK_PEONY.get()),
                            Component.translatable("advancement.moreornplants.flower_king.title"),
                            Component.translatable("advancement.moreornplants.flower_king.description"),
                            null,
                            FrameType.TASK,
                            true,
                            false,
                            false
                    ))
                    .addCriterion("get_tree_peony", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.TREE_PEONY).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(10))
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
                            false,
                            false
                    ))
                    .addCriterion("get_herbaceous_peony", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.HERBACEOUS_PEONY).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(8))
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
                            false,
                            false
                    ))
                    .addCriterion("get_chinese_rose", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CHINESE_ROSE).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(8))
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
                            false,
                            false
                    ))
                    .addCriterion("get_cymbidium", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CYMBIDIUM).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(9))
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
                            false,
                            false
                    ))
                    .addCriterion("get_chrysanthemum", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CHRYSANTHEMUM).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(9))
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
                            false,
                            false
                    ))
                    .addCriterion("get_crabapple", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModTags.Items.CRABAPPLE_SAPLING).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(8))
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
                            false,
                            false
                    ))
                    .addCriterion("get_osmanthus", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.OSMANTHUS_SAPLING).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(9))
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
                            false,
                            false
                    ))
                    .addCriterion("get_apricot", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.APRICOT_SAPLING).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(6))
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
                            false,
                            false
                    ))
                    .addCriterion("get_peach", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.PEACH_SAPLING).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(6))
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
                            false,
                            false
                    ))
                    .addCriterion("get_pear", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.PEAR_SAPLING.get()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(4))
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
                            false,
                            false
                    ))
                    .addCriterion("get_plum", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.PLUM_SAPLING).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(4))
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
                            false,
                            false
                    ))
                    .addCriterion("get_lotus", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.LOTUS).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(9))
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
                            false,
                            false
                    ))
                    .addCriterion("get_crape_myrtle", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CRAPE_MYRTLE).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(6))
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
                            false,
                            false
                    ))
                    .addCriterion("get_camellia", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CAMELLIA).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(6))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "lasting_beauty"), existingFileHelper);

            Advancement flowerBeauty = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.CHARMING_RHODODENDRON.get()),
                            Component.translatable("advancement.moreornplants.flower_beauty.title"),
                            Component.translatable("advancement.moreornplants.flower_beauty.description"),
                            null,
                            FrameType.TASK,
                            true,
                            false,
                            false
                    ))
                    .addCriterion("get_azalea", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.AZALEA).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(6))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "flower_beauty"), existingFileHelper);

            Advancement TheNymphOfLingbo = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.CHINESE_NARCISSUS.get()),
                            Component.translatable("advancement.moreornplants.the_nymph_of_lingbo.title"),
                            Component.translatable("advancement.moreornplants.the_nymph_of_lingbo.description"),
                            null,
                            FrameType.TASK,
                            true,
                            false,
                            false
                    ))
                    .addCriterion("get_narcissus", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.NARCISSUS).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(6))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "the_nymph_of_lingbo"), existingFileHelper);

            Advancement frostDefiant = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.COTTON_ROSE.get()),
                            Component.translatable("advancement.moreornplants.the_frost_defiant.title"),
                            Component.translatable("advancement.moreornplants.the_frost_defiant.description"),
                            null,
                            FrameType.TASK,
                            true,
                            false,
                            false
                    ))
                    .addCriterion("get_cottonrose", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.COTTON_ROSE.get()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(6))
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
                            false,
                            false
                    ))
                    .addCriterion("get_rose_bush", InventoryChangeTrigger.TriggerInstance.hasItems(
                            Blocks.ROSE_BUSH
                    ))
                    .rewards(AdvancementRewards.Builder.experience(2))
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
                            false,
                            false
                    ))
                    .addCriterion("get_poppy", InventoryChangeTrigger.TriggerInstance.hasItems(
                            Blocks.POPPY
                    ))
                    .rewards(AdvancementRewards.Builder.experience(2))
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
                            false,
                            false
                    ))
                    .addCriterion("get_lilac", InventoryChangeTrigger.TriggerInstance.hasItems(
                            Blocks.LILAC
                    ))
                    .rewards(AdvancementRewards.Builder.experience(2))
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
                            false,
                            false
                    ))
                    .addCriterion("get_sunflower", InventoryChangeTrigger.TriggerInstance.hasItems(
                            Blocks.SUNFLOWER
                    ))
                    .rewards(AdvancementRewards.Builder.experience(2))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "flower_loyalist"), existingFileHelper);

            Advancement grandMonarch = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.GOLDEN_GINKGO_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.grand_monarch.title"),
                            Component.translatable("advancement.moreornplants.grand_monarch.description"),
                            null,
                            FrameType.TASK,
                            true,
                            false,
                            false
                    ))
                    .addCriterion("get_ginkgo", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.GINKGO_SAPLING).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(9))
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
                            false,
                            false
                    ))
                    .addCriterion("get_camphor", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.CAMPHOR_SAPLING.get()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(8))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "sacred_timber"), existingFileHelper);

            Advancement  phoenixRoost = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.YELLOW_CHINESE_PARASOL_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.fenghuang_roost.title"),
                            Component.translatable("advancement.moreornplants.fenghuang_roost.description"),
                            null,
                            FrameType.TASK,
                            true,
                            false,
                            false
                    ))
                    .addCriterion("get_chinese_parasol", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.CHINESE_PARASOL_SAPLING).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(6))
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
                            false,
                            false
                    ))
                    .addCriterion("get_sweetgum", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.SWEETGUM_SAPLING.get()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(4))
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
                            false,
                            false
                    ))
                    .addCriterion("get_dove_tree", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.DOVE_TREE_SAPLING.get()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(2))
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
                            false,
                            false
                    ))
                    .addCriterion("get_chinaberry", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.CHINABERRY_SAPLING.get()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(4))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "chinaberry_wind"), existingFileHelper);

            Advancement heroOfDesert = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.DESERT_POPLAR_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.hero_of_desert.title"),
                            Component.translatable("advancement.moreornplants.hero_of_desert.description"),
                            null,
                            FrameType.TASK,
                            true,
                            false,
                            false
                    ))
                    .addCriterion("get_desert_poplar", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModBlocks.DESERT_POPLAR_SAPLING.get()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(2))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "hero_of_desert"), existingFileHelper);

            Advancement foremostOfVines = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.CHINESE_WISTERIA.get()),
                            Component.translatable("advancement.moreornplants.foremost_of_vines.title"),
                            Component.translatable("advancement.moreornplants.foremost_of_vines.description"),
                            null,
                            FrameType.TASK,
                            true,
                            false,
                            false
                    ))
                    .addCriterion("get_wisteria", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.WISTERIA).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(6))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "foremost_of_vines"), existingFileHelper);

            Advancement grasses = Advancement.Builder.advancement()
                    .parent(root)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.FOUNTAIN_GRASS.get()),
                            Component.translatable("advancement.moreornplants.grasses.title"),
                            Component.translatable("advancement.moreornplants.grasses.description"),
                            null,
                            FrameType.TASK,
                            true,
                            false,
                            false
                    ))
                    .addCriterion("get_grasses", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ForgeTags.Items.ORNAMENTAL_GRASS).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(4))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "grasses"), existingFileHelper);

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
                    .rewards(AdvancementRewards.Builder.experience(40))
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
                    .rewards(AdvancementRewards.Builder.experience(11))
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
                    .rewards(AdvancementRewards.Builder.experience(9))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "offer_chrysanthemum"), existingFileHelper);

            Advancement fragrantSnowSea = Advancement.Builder.advancement()
                    .parent(flowerLeader)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.WHITE_WEEPING_MEI_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.fragrant_snow_sea.title"),
                            Component.translatable("advancement.moreornplants.fragrant_snow_sea.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("visit_fragrant_snow_sea", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.FRAGRANT_SNOW_SEA).build()
                    ))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "fragrant_snow_sea"), existingFileHelper);

            Advancement treadSnowSeekMei = Advancement.Builder.advancement()
                    .parent(fragrantSnowSea)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.VERSICOLOR_MEI_SAPLING.get()),
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
                    .addCriterion("visit_fragrant_snow_sea", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.FRAGRANT_SNOW_SEA).build()
                    ))
                    .addCriterion("visit_mount_mei", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.MOUNT_MEI).build()
                    ))
                    .addCriterion("visit_snow_greets_spring", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.SNOW_GREETS_SPRING).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(54))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "tread_snow_seek_mei"), existingFileHelper);

            Advancement flowersAsMatchmakers = Advancement.Builder.advancement()
                    .parent(flowerQueen)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.PINK_WHITE_CHINESE_ROSE.get()),
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
                    .rewards(AdvancementRewards.Builder.experience(10))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "flowers_as_matchmakers"), existingFileHelper);

            Advancement redHighlands = Advancement.Builder.advancement()
                    .parent(flowerBeauty)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.RED_AZALEA.get()),
                            Component.translatable("advancement.moreornplants.red_highlands.title"),
                            Component.translatable("advancement.moreornplants.red_highlands.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("visit_red_highlands", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.RED_HIGHLANDS).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(10))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "red_highlands"), existingFileHelper);

            Advancement furongGuo = Advancement.Builder.advancement()
                    .parent(frostDefiant)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.MOTTLED_BAMBOO.get()),
                            Component.translatable("advancement.moreornplants.furong_guo.title"),
                            Component.translatable("advancement.moreornplants.furong_guo.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("visit_furong_guo", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.FURONG_GUO).build()
                    ))
                    .rewards(AdvancementRewards.Builder.experience(10))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "furong_guo"), existingFileHelper);

            Advancement flowersAndMoon = Advancement.Builder.advancement()
                    .parent(flowerKing)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.YAO_HUANG_PEONY.get()),
                            Component.translatable("advancement.moreornplants.flowers_and_moon.title"),
                            Component.translatable("advancement.moreornplants.flowers_and_moon.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("visit_1", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.FLOWERS_GROVE).build()
                    ))
                    .addCriterion("visit_2", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.SPRING_RIVER).build()
                    ))
                    .addCriterion("visit_3", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.RED_MEI_FOREST).build()
                    ))
                    .addCriterion("visit_4", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.FRAGRANT_SNOW_SEA).build()
                    ))
                    .addCriterion("visit_5", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.CAMELLIA_VALLEY).build()
                    ))
                    .addCriterion("visit_6", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.RED_CAMELLIA_VALLEY).build()
                    ))
                    .addCriterion("visit_7", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.PINK_CAMELLIA_VALLEY).build()
                    ))
                    .addCriterion("visit_8", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.CRABAPPLE_GROVE).build()
                    ))
                    .addCriterion("visit_9", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.CHINABERRY_WOODS).build()
                    ))
                    .addCriterion("visit_10", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.SNOW_WOODS).build()
                    ))
                    .addCriterion("visit_11", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.PURPLE_CLOUD).build()
                    ))
                    .addCriterion("visit_12", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.PEONY_SEA).build()
                    ))
                    .addCriterion("visit_13", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.PEONY_MEADOWS).build()
                    ))
                    .addCriterion("visit_14", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.FURONG_GUO).build()
                    ))
                    .addCriterion("visit_15", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.CHINESE_ROSE_FIELDS).build()
                    ))
                    .addCriterion("visit_16", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.AZALEA_FOREST).build()
                    ))
                    .addCriterion("visit_17", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.TEN_MILE_GALLERY).build()
                    ))
                    .addCriterion("visit_18", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.THE_PEACH_BLOSSOM_SPRING).build()
                    ))
                    .addCriterion("visit_19", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.THE_APRICOT_SPRING_PLATEAU).build()
                    ))
                    .addCriterion("visit_20", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.SWEETGUM_WOODS).build()
                    ))
                    .addCriterion("visit_21", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.PENGLAI).build()
                    ))
                    .addCriterion("visit_22", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.YUNMENG_MARSH).build()
                    ))
                    .addCriterion("visit_23", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.MOUNT_MEI).build()
                    ))
                    .addCriterion("visit_24", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setBiome(ModBiomes.SNOW_GREETS_SPRING).build()
                    ))
                    .addCriterion("moonlight", new MoonlightTrigger.Instance(ContextAwarePredicate.ANY))
                    .requirements(new String[][] {
                            {"visit_1", "visit_2", "visit_3", "visit_4", "visit_5", "visit_6", "visit_7", "visit_8", "visit_9", "visit_10", "visit_11", "visit_12", "visit_13",
                                    "visit_14", "visit_15", "visit_16", "visit_17", "visit_18", "visit_19", "visit_20", "visit_21", "visit_22", "visit_23", "visit_24"},
                            {"moonlight"}
                    })
                    .rewards(AdvancementRewards.Builder.loot(new ResourceLocation(MoreOrnPlants.MOD_ID, "advancements/zhuiyue_sword")))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "flowers_and_moon"), existingFileHelper);

            Advancement cloudChasingMoon = Advancement.Builder.advancement()
                    .parent(flowersAndMoon)
                    .display(new DisplayInfo(
                            new ItemStack(ModItems.ZHUIYUE_SWORD.get()),
                            Component.translatable("advancement.moreornplants.cloud_chasing_moon.title"),
                            Component.translatable("advancement.moreornplants.cloud_chasing_moon.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("get_zhuiyue_sword", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ModItems.ZHUIYUE_SWORD.get()
                    ))
                    .rewards(AdvancementRewards.Builder.loot(new ResourceLocation(MoreOrnPlants.MOD_ID, "advancements/caiyun_sword")))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "cloud_chasing_moon"), existingFileHelper);

            Advancement ironThresholdTemple = Advancement.Builder.advancement()
                    .parent(flowerLeader)
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
                    .parent(wulingVista)
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
            Advancement peachVillage = Advancement.Builder.advancement()
                    .parent(wulingVista)
                    .display(new DisplayInfo(
                            new ItemStack(ModBlocks.WILD_PEACH_SAPLING.get()),
                            Component.translatable("advancement.moreornplants.peach_village.title"),
                            Component.translatable("advancement.moreornplants.peach_village.description"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    ))
                    .addCriterion("found_peach_village", PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.location().setStructure(ResourceKey.create(Registries.STRUCTURE,
                                    new ResourceLocation(MoreOrnPlants.MOD_ID, "village_peach"))).build()
                    ))
                    .rewards(AdvancementRewards.Builder.loot(new ResourceLocation(MoreOrnPlants.MOD_ID, "advancements/peach")))
                    .save(saver, new ResourceLocation(MoreOrnPlants.MOD_ID, "peach_village"), existingFileHelper);
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
