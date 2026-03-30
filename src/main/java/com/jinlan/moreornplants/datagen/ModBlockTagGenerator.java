package com.jinlan.moreornplants.datagen;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.util.CommonTags;
import com.jinlan.moreornplants.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MoreOrnPlants.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.MOTTLED_BAMBOO.get(), ModBlocks.BLACK_BAMBOO.get())
                .add(ModBlocks.FOUNTAIN_GRASS.get(), ModBlocks.PURPLE_FOUNTAIN_GRASS.get(), ModBlocks.PINK_FOUNTAIN_GRASS.get(), ModBlocks.WHITE_FOUNTAIN_GRASS.get())
                .addTag(CommonTags.Blocks.WEEPING_MEI)
                .add(ModBlocks.RED_WEEPING_MEI_PLANT.get(), ModBlocks.WHITE_WEEPING_MEI_PLANT.get(), ModBlocks.GREEN_WEEPING_MEI_PLANT.get(),
                        ModBlocks.PINK_WEEPING_MEI_PLANT.get(), ModBlocks.VERSICOLOR_WEEPING_MEI_PLANT.get())
                .addTag(CommonTags.Blocks.WISTERIA)
                .add(ModBlocks.CHINESE_WISTERIA_PLANT.get(), ModBlocks.WHITE_CHINESE_WISTERIA_PLANT.get(), ModBlocks.NANJING_WISTERIA_PLANT.get(),
                        ModBlocks.BLUE_CHINESE_WISTERIA_PLANT.get(), ModBlocks.RED_CHINESE_WISTERIA_PLANT.get())
                .add(ModBlocks.CRABAPPLE.get(), ModBlocks.CLOUD_APRICOT.get(), ModBlocks.IMMORTAL_PEACH.get(), ModBlocks.BAMBOO_STICK.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ZIYING_BEADLIGHT.get(), ModBlocks.SUYU_BEADLIGHT.get());

        this.tag(BlockTags.CROPS)
                .addTag(CommonTags.Blocks.LOTUS)
                .add(ModBlocks.LOTUS_LEAF.get());

        this.tag(BlockTags.MAINTAINS_FARMLAND)
                .addTag(CommonTags.Blocks.LOTUS)
                .add(ModBlocks.LOTUS_LEAF.get());

        this.tag(BlockTags.REPLACEABLE).add(ModBlocks.BAMBOO_STICK.get());

        this.tag(BlockTags.MOSS_REPLACEABLE)
                .addTag(CommonTags.Blocks.WEEPING_MEI)
                .add(ModBlocks.RED_WEEPING_MEI_PLANT.get(), ModBlocks.WHITE_WEEPING_MEI_PLANT.get(), ModBlocks.GREEN_WEEPING_MEI_PLANT.get(),
                        ModBlocks.PINK_WEEPING_MEI_PLANT.get(), ModBlocks.VERSICOLOR_WEEPING_MEI_PLANT.get())
                .addTag(CommonTags.Blocks.WISTERIA)
                .add(ModBlocks.CHINESE_WISTERIA_PLANT.get(), ModBlocks.WHITE_CHINESE_WISTERIA_PLANT.get(), ModBlocks.NANJING_WISTERIA_PLANT.get(),
                        ModBlocks.BLUE_CHINESE_WISTERIA_PLANT.get(), ModBlocks.RED_CHINESE_WISTERIA_PLANT.get());

        this.tag(BlockTags.FLOWER_POTS)
                .add(ModBlocks.POTTED_RED_MEI_SAPLING.get(), ModBlocks.POTTED_WHITE_MEI_SAPLING.get())
                .add(ModBlocks.POTTED_GREEN_CALYX_MEI_SAPLING.get(), ModBlocks.POTTED_DOUBLE_PINK_MEI_SAPLING.get(), ModBlocks.POTTED_VERSICOLOR_MEI_SAPLING.get())
                .add(ModBlocks.POTTED_RED_WEEPING_MEI_SAPLING.get(), ModBlocks.POTTED_WHITE_WEEPING_MEI_SAPLING.get())
                .add(ModBlocks.POTTED_GREEN_WEEPING_MEI_SAPLING.get(), ModBlocks.POTTED_PINK_WEEPING_MEI_SAPLING.get(), ModBlocks.POTTED_VERSICOLOR_WEEPING_MEI_SAPLING.get())
                .add(ModBlocks.POTTED_UPRIGHT_CRABAPPLE_SAPLING.get(), ModBlocks.POTTED_WEEPING_CRABAPPLE_SAPLING.get())
                .add(ModBlocks.POTTED_PINK_APRICOT_SAPLING.get(), ModBlocks.POTTED_WHITE_APRICOT_SAPLING.get(), ModBlocks.POTTED_CLOUD_APRICOT_SAPLING.get())
                .add(ModBlocks.POTTED_ORNAMENTAL_PEACH_SAPLING.get(), ModBlocks.POTTED_WILD_PEACH_SAPLING.get(), ModBlocks.POTTED_IMMORTAL_PEACH_SAPLING.get())
                .add(ModBlocks.POTTED_PEAR_SAPLING.get())
                .add(ModBlocks.POTTED_FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get(), ModBlocks.POTTED_PURPLE_LEAF_PLUM_SAPLING.get())
                .add(ModBlocks.POTTED_GOLDEN_OSMANTHUS_SAPLING.get(), ModBlocks.POTTED_ORANGE_OSMANTHUS_SAPLING.get(), ModBlocks.POTTED_WHITE_OSMANTHUS_SAPLING.get())
                .add(ModBlocks.POTTED_GOLDEN_GINKGO_SAPLING.get(), ModBlocks.POTTED_GREEN_GINKGO_SAPLING.get())
                .add(ModBlocks.POTTED_YELLOW_CHINESE_PARASOL_SAPLING.get(), ModBlocks.POTTED_GREEN_CHINESE_PARASOL_SAPLING.get())
                .add(ModBlocks.POTTED_SWEETGUM_SAPLING.get())
                .add(ModBlocks.POTTED_CAMPHOR_SAPLING.get())
                .add(ModBlocks.POTTED_DOVE_TREE_SAPLING.get())
                .add(ModBlocks.POTTED_CHINABERRY_SAPLING.get())
                .add(ModBlocks.POTTED_DESERT_POPLAR_SAPLING.get())
                .add(ModBlocks.POTTED_CRAPE_MYRTLE_SAPLING.get(), ModBlocks.POTTED_RED_CRAPE_MYRTLE_SAPLING.get())
                .add(ModBlocks.POTTED_PINK_CRAPE_MYRTLE_SAPLING.get(), ModBlocks.POTTED_WHITE_CRAPE_MYRTLE_SAPLING.get())
                .add(ModBlocks.POTTED_CHRYSANTHEMUM.get(), ModBlocks.POTTED_XIHU_LIUYUE.get(), ModBlocks.POTTED_GOLD_BACKED_SCARLET_MUM.get())
                .add(ModBlocks.POTTED_WHITE_CHRYSANTHEMUM.get(), ModBlocks.POTTED_GREEN_CHRYSANTHEMUM.get())
                .add(ModBlocks.POTTED_PURPLE_CHRYSANTHEMUM.get(), ModBlocks.POTTED_VIOLET_PINK_CHRYSANTHEMUM.get())
                .add(ModBlocks.POTTED_PINK_CHRYSANTHEMUM.get(), ModBlocks.POTTED_LIGHT_PINK_CHRYSANTHEMUM.get())
                .add(ModBlocks.POTTED_SPRING_CYMBIDIUM.get(), ModBlocks.POTTED_SUMMER_CYMBIDIUM.get(), ModBlocks.POTTED_AUTUMN_CYMBIDIUM.get(), ModBlocks.POTTED_WINTER_CYMBIDIUM.get())
                .add(ModBlocks.POTTED_PEONY.get(), ModBlocks.POTTED_LIGHT_PINK_PEONY.get(), ModBlocks.POTTED_VIOLET_PINK_PEONY.get(), ModBlocks.POTTED_PINK_PEONY.get())
                .add(ModBlocks.POTTED_RED_PEONY.get(), ModBlocks.POTTED_LIGHT_RED_PEONY.get(), ModBlocks.POTTED_INK_RED_PEONY.get(), ModBlocks.POTTED_VERMILION_PEONY.get())
                .add(ModBlocks.POTTED_PURPLE_PEONY.get(), ModBlocks.POTTED_LIGHT_PURPLE_PEONY.get(), ModBlocks.POTTED_INK_PURPLE_PEONY.get(), ModBlocks.POTTED_VIOLET_PEONY.get())
                .add(ModBlocks.POTTED_YELLOW_PEONY.get(), ModBlocks.POTTED_LIGHT_YELLOW_PEONY.get(), ModBlocks.POTTED_OCHRE_YELLOW_PEONY.get(), ModBlocks.POTTED_GOLDEN_PEONY.get())
                .add(ModBlocks.POTTED_WHITE_PEONY.get(), ModBlocks.POTTED_INK_PEONY.get(), ModBlocks.POTTED_BLUE_PEONY.get(), ModBlocks.POTTED_GREEN_PEONY.get())
                .add(ModBlocks.POTTED_COLORFUL_PEONY.get(), ModBlocks.POTTED_LIGHT_COLORFUL_PEONY.get(), ModBlocks.POTTED_INK_COLORFUL_PEONY.get())
                .add(ModBlocks.POTTED_RED_WHITE_PEONY.get(), ModBlocks.POTTED_PINK_WHITE_PEONY.get(), ModBlocks.POTTED_YELLOW_WHITE_PEONY.get(), ModBlocks.POTTED_PURPLE_WHITE_PEONY.get())
                .add(ModBlocks.POTTED_WU_HUA_LONG_YU_PEONY.get())
                .add(ModBlocks.POTTED_MAUVE_PEONY.get())
                .add(ModBlocks.POTTED_CHINESE_ROSE.get(), ModBlocks.POTTED_PINK_CHINESE_ROSE.get())
                .add(ModBlocks.POTTED_YELLOW_CHINESE_ROSE.get(), ModBlocks.POTTED_WHITE_CHINESE_ROSE.get())
                .add(ModBlocks.POTTED_RED_PINK_CHINESE_ROSE.get(), ModBlocks.POTTED_RED_YELLOW_CHINESE_ROSE.get())
                .add(ModBlocks.POTTED_RED_WHITE_CHINESE_ROSE.get(), ModBlocks.POTTED_PINK_WHITE_CHINESE_ROSE.get())
                .add(ModBlocks.POTTED_YELLOW_WHITE_CHINESE_ROSE.get(), ModBlocks.POTTED_BAOHUA_CHINESE_ROSE.get())
                .add(ModBlocks.POTTED_WINTERSWEET.get())
                .add(ModBlocks.POTTED_CAMELLIA.get(), ModBlocks.POTTED_PINK_CAMELLIA.get())
                .add(ModBlocks.POTTED_WHITE_CAMELLIA.get(), ModBlocks.POTTED_VERSICOLOR_CAMELLIA.get())
                .add(ModBlocks.POTTED_RED_AZALEA.get(), ModBlocks.POTTED_MAYING_RHODODENDRON.get(), ModBlocks.POTTED_DEWDROP_RHODODENDRON.get())
                .add(ModBlocks.POTTED_CHARMING_RHODODENDRON.get(), ModBlocks.POTTED_GREAT_WHITE_RHODODENDRON.get(), ModBlocks.POTTED_PURPLE_RHODODENDRON.get())
                .add(ModBlocks.POTTED_PINK_RHODODENDRON.get(), ModBlocks.POTTED_CHINESE_AZALEA.get())
                .add(ModBlocks.POTTED_FOUNTAIN_GRASS.get(), ModBlocks.POTTED_PURPLE_FOUNTAIN_GRASS.get())
                .add(ModBlocks.POTTED_PINK_FOUNTAIN_GRASS.get(), ModBlocks.POTTED_WHITE_FOUNTAIN_GRASS.get())
                .add(ModBlocks.POTTED_MOTTLED_BAMBOO.get(), ModBlocks.POTTED_BLACK_BAMBOO.get(), ModBlocks.POTTED_BAMBOO_STICK.get())
                .add(ModBlocks.POTTED_CUT_PEONY.get(), ModBlocks.POTTED_CUT_LIGHT_PINK_PEONY.get(), ModBlocks.POTTED_CUT_VIOLET_PINK_PEONY.get())
                .add(ModBlocks.POTTED_CUT_RED_PEONY.get(), ModBlocks.POTTED_CUT_LIGHT_RED_PEONY.get(), ModBlocks.POTTED_CUT_INK_RED_PEONY.get())
                .add(ModBlocks.POTTED_CUT_PURPLE_PEONY.get(), ModBlocks.POTTED_CUT_LIGHT_PURPLE_PEONY.get(), ModBlocks.POTTED_CUT_INK_PURPLE_PEONY.get())
                .add(ModBlocks.POTTED_CUT_YELLOW_PEONY.get(), ModBlocks.POTTED_CUT_LIGHT_YELLOW_PEONY.get(), ModBlocks.POTTED_CUT_OCHRE_YELLOW_PEONY.get())
                .add(ModBlocks.POTTED_CUT_WHITE_PEONY.get(), ModBlocks.POTTED_CUT_INK_PEONY.get(), ModBlocks.POTTED_CUT_BLUE_PEONY.get())
                .add(ModBlocks.POTTED_CUT_GREEN_PEONY.get(), ModBlocks.POTTED_CUT_WU_HUA_LONG_YU_PEONY.get(), ModBlocks.POTTED_CUT_MAUVE_PEONY.get())
                .add(ModBlocks.POTTED_CUT_CHINESE_ROSE.get(), ModBlocks.POTTED_CUT_PINK_ROSE.get(), ModBlocks.POTTED_CUT_YELLOW_ROSE.get())
                .add(ModBlocks.POTTED_CUT_WHITE_ROSE.get(), ModBlocks.POTTED_CUT_BAOHUA_CHINESE_ROSE.get(), ModBlocks.POTTED_CUT_COTTON_ROSE.get())
                .add(ModBlocks.POTTED_CUT_WINTERSWEET.get());

        this.tag(BlockTags.FLOWERS)
                .addTag(BlockTags.SMALL_FLOWERS)
                .addTag(BlockTags.TALL_FLOWERS)
                .addTag(CommonTags.Blocks.MEI_SAPLING)
                .addTag(CommonTags.Blocks.CRABAPPLE_SAPLING)
                .addTag(CommonTags.Blocks.APRICOT_SAPLING)
                .addTag(CommonTags.Blocks.PEACH_SAPLING)
                .add(ModBlocks.PEAR_SAPLING.get())
                .add(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get())
                .addTag(CommonTags.Blocks.OSMANTHUS_SAPLING)
                .add(ModBlocks.DOVE_TREE_SAPLING.get())
                .add(ModBlocks.CHINABERRY_SAPLING.get())
                .add(ModBlocks.DESERT_POPLAR_SAPLING.get())
                .addTag(CommonTags.Blocks.CRAPE_MYRTLE_SAPLING)
                .addTag(CommonTags.Blocks.MEI_LEAVES)
                .addTag(CommonTags.Blocks.CRABAPPLE_LEAVES)
                .addTag(CommonTags.Blocks.APRICOT_LEAVES)
                .addTag(CommonTags.Blocks.PEACH_LEAVES)
                .add(ModBlocks.PEAR_LEAVES.get())
                .add(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_LEAVES.get())
                .addTag(CommonTags.Blocks.OSMANTHUS_LEAVES)
                .addTag(CommonTags.Blocks.CAMELLIA_LEAVES)
                .add(ModBlocks.DOVE_TREE_BLOSSOM_LEAVES.get())
                .add(ModBlocks.CHINABERRY_LEAVES.get())
                .add(ModBlocks.DESERT_POPLAR_LEAVES.get())
                .addTag(CommonTags.Blocks.CRAPE_MYRTLE_LEAVES)
                .addTag(CommonTags.Blocks.RHODODENDRON_LEAVES)
                .addTag(CommonTags.Blocks.WEEPING_MEI)
                .add(ModBlocks.RED_WEEPING_MEI_PLANT.get(), ModBlocks.WHITE_WEEPING_MEI_PLANT.get(), ModBlocks.GREEN_WEEPING_MEI_PLANT.get(),
                        ModBlocks.PINK_WEEPING_MEI_PLANT.get(), ModBlocks.VERSICOLOR_WEEPING_MEI_PLANT.get())
                .add(ModBlocks.PEACH_PINK_PETALS.get(), ModBlocks.FRAGRANT_SNOW_PETALS.get(), ModBlocks.SPRING_PETALS.get())
                .addTag(CommonTags.Blocks.WISTERIA)
                .add(ModBlocks.CHINESE_WISTERIA_PLANT.get(), ModBlocks.WHITE_CHINESE_WISTERIA_PLANT.get(), ModBlocks.NANJING_WISTERIA_PLANT.get(),
                        ModBlocks.BLUE_CHINESE_WISTERIA_PLANT.get(), ModBlocks.RED_CHINESE_WISTERIA_PLANT.get());

        this.tag(BlockTags.LEAVES)
                .addTag(CommonTags.Blocks.MEI_LEAVES)
                .addTag(CommonTags.Blocks.CRABAPPLE_LEAVES)
                .addTag(CommonTags.Blocks.APRICOT_LEAVES)
                .addTag(CommonTags.Blocks.PEACH_LEAVES)
                .add(ModBlocks.PEAR_LEAVES.get())
                .addTag(CommonTags.Blocks.PLUM_LEAVES)
                .addTag(CommonTags.Blocks.OSMANTHUS_LEAVES)
                .addTag(CommonTags.Blocks.GINKGO_LEAVES)
                .addTag(CommonTags.Blocks.CHINESE_PARASOL_LEAVES)
                .add(ModBlocks.SWEETGUM_LEAVES.get())
                .addTag(CommonTags.Blocks.CAMPHOR_LEAVES)
                .addTag(CommonTags.Blocks.DOVE_TREE_LEAVES)
                .add(ModBlocks.CHINABERRY_LEAVES.get())
                .add(ModBlocks.DESERT_POPLAR_LEAVES.get())
                .addTag(CommonTags.Blocks.CRAPE_MYRTLE_LEAVES)
                .addTag(CommonTags.Blocks.RHODODENDRON_LEAVES)
                .addTag(CommonTags.Blocks.CAMELLIA_LEAVES);

        this.tag(BlockTags.CLIMBABLE)
                .addTag(CommonTags.Blocks.WEEPING_MEI)
                .add(ModBlocks.RED_WEEPING_MEI_PLANT.get(), ModBlocks.WHITE_WEEPING_MEI_PLANT.get(), ModBlocks.GREEN_WEEPING_MEI_PLANT.get(),
                        ModBlocks.PINK_WEEPING_MEI_PLANT.get(), ModBlocks.VERSICOLOR_WEEPING_MEI_PLANT.get())
                .addTag(CommonTags.Blocks.WISTERIA)
                .add(ModBlocks.CHINESE_WISTERIA_PLANT.get(), ModBlocks.WHITE_CHINESE_WISTERIA_PLANT.get(), ModBlocks.NANJING_WISTERIA_PLANT.get(),
                        ModBlocks.BLUE_CHINESE_WISTERIA_PLANT.get(), ModBlocks.RED_CHINESE_WISTERIA_PLANT.get());

        this.tag(BlockTags.MINEABLE_WITH_HOE)
                .add(ModBlocks.MOTTLED_BAMBOO_SAPLING.get(), ModBlocks.BLACK_BAMBOO_SAPLING.get())
                .addTag(CommonTags.Blocks.MEI_LEAVES)
                .addTag(CommonTags.Blocks.CRABAPPLE_LEAVES)
                .addTag(CommonTags.Blocks.APRICOT_LEAVES)
                .addTag(CommonTags.Blocks.PEACH_LEAVES)
                .add(ModBlocks.PEAR_LEAVES.get())
                .addTag(CommonTags.Blocks.PLUM_LEAVES)
                .addTag(CommonTags.Blocks.OSMANTHUS_LEAVES)
                .addTag(CommonTags.Blocks.GINKGO_LEAVES)
                .addTag(CommonTags.Blocks.CHINESE_PARASOL_LEAVES)
                .add(ModBlocks.SWEETGUM_LEAVES.get())
                .addTag(CommonTags.Blocks.CAMPHOR_LEAVES)
                .addTag(CommonTags.Blocks.DOVE_TREE_LEAVES)
                .add(ModBlocks.CHINABERRY_LEAVES.get())
                .add(ModBlocks.DESERT_POPLAR_LEAVES.get())
                .addTag(CommonTags.Blocks.CRAPE_MYRTLE_LEAVES)
                .addTag(CommonTags.Blocks.RHODODENDRON_LEAVES)
                .addTag(CommonTags.Blocks.CAMELLIA_LEAVES)
                .add(ModBlocks.PEACH_PINK_PETALS.get(), ModBlocks.FRAGRANT_SNOW_PETALS.get(), ModBlocks.SPRING_PETALS.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .addTag(ModTags.Blocks.RED_MEI_LOGS)
                .addTag(ModTags.Blocks.WHITE_MEI_LOGS)
                .addTag(ModTags.Blocks.GREEN_CALYX_MEI_LOGS)
                .addTag(ModTags.Blocks.DOUBLE_PINK_MEI_LOGS)
                .addTag(ModTags.Blocks.CRABAPPLE_LOGS)
                .addTag(ModTags.Blocks.APRICOT_LOGS)
                .addTag(ModTags.Blocks.PEACH_LOGS)
                .addTag(ModTags.Blocks.PEAR_LOGS)
                .addTag(ModTags.Blocks.PURPLE_LEAF_PLUM_LOGS)
                .addTag(ModTags.Blocks.OSMANTHUS_LOGS)
                .addTag(ModTags.Blocks.GINKGO_LOGS)
                .addTag(ModTags.Blocks.CHINESE_PARASOL_LOGS)
                .addTag(ModTags.Blocks.SWEETGUM_LOGS)
                .addTag(ModTags.Blocks.CAMPHOR_LOGS)
                .addTag(ModTags.Blocks.DOVE_TREE_LOGS)
                .addTag(ModTags.Blocks.CHINABERRY_LOGS)
                .addTag(ModTags.Blocks.DESERT_POPLAR_LOGS)
                .add(ModBlocks.CRAPE_MYRTLE_LOG.get())
                .add(ModBlocks.CRAPE_MYRTLE_WOOD.get());

        this.tag(BlockTags.OVERWORLD_NATURAL_LOGS)
                .add(ModBlocks.RED_MEI_LOG.get())
                .add(ModBlocks.WHITE_MEI_LOG.get())
                .add(ModBlocks.GREEN_CALYX_MEI_LOG.get())
                .add(ModBlocks.DOUBLE_PINK_MEI_LOG.get())
                .add(ModBlocks.CRABAPPLE_LOG.get())
                .add(ModBlocks.APRICOT_LOG.get())
                .add(ModBlocks.PEACH_LOG.get())
                .add(ModBlocks.PEAR_LOG.get())
                .add(ModBlocks.PURPLE_LEAF_PLUM_LOG.get())
                .add(ModBlocks.OSMANTHUS_LOG.get())
                .add(ModBlocks.GINKGO_LOG.get())
                .add(ModBlocks.CHINESE_PARASOL_LOG.get())
                .add(ModBlocks.SWEETGUM_LOG.get())
                .add(ModBlocks.CAMPHOR_LOG.get())
                .add(ModBlocks.DOVE_TREE_LOG.get())
                .add(ModBlocks.CHINABERRY_LOG.get())
                .add(ModBlocks.DESERT_POPLAR_LOG.get())
                .add(ModBlocks.CRAPE_MYRTLE_LOG.get());

        this.tag(Tags.Blocks.STRIPPED_LOGS)
                .add(ModBlocks.STRIPPED_RED_MEI_LOG.get())
                .add(ModBlocks.STRIPPED_WHITE_MEI_LOG.get())
                .add(ModBlocks.STRIPPED_GREEN_CALYX_MEI_LOG.get())
                .add(ModBlocks.STRIPPED_DOUBLE_PINK_MEI_LOG.get())
                .add(ModBlocks.STRIPPED_CRABAPPLE_LOG.get())
                .add(ModBlocks.STRIPPED_APRICOT_LOG.get())
                .add(ModBlocks.STRIPPED_PEACH_LOG.get())
                .add(ModBlocks.STRIPPED_PEAR_LOG.get())
                .add(ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_LOG.get())
                .add(ModBlocks.STRIPPED_OSMANTHUS_LOG.get())
                .add(ModBlocks.STRIPPED_GINKGO_LOG.get())
                .add(ModBlocks.STRIPPED_CHINESE_PARASOL_LOG.get())
                .add(ModBlocks.STRIPPED_SWEETGUM_LOG.get())
                .add(ModBlocks.STRIPPED_CAMPHOR_LOG.get())
                .add(ModBlocks.STRIPPED_DOVE_TREE_LOG.get())
                .add(ModBlocks.STRIPPED_CHINABERRY_LOG.get())
                .add(ModBlocks.STRIPPED_DESERT_POPLAR_LOG.get());

        this.tag(Tags.Blocks.STRIPPED_WOODS)
                .add(ModBlocks.STRIPPED_RED_MEI_WOOD.get())
                .add(ModBlocks.STRIPPED_WHITE_MEI_WOOD.get())
                .add(ModBlocks.STRIPPED_GREEN_CALYX_MEI_WOOD.get())
                .add(ModBlocks.STRIPPED_DOUBLE_PINK_MEI_WOOD.get())
                .add(ModBlocks.STRIPPED_CRABAPPLE_WOOD.get())
                .add(ModBlocks.STRIPPED_APRICOT_WOOD.get())
                .add(ModBlocks.STRIPPED_PEACH_WOOD.get())
                .add(ModBlocks.STRIPPED_PEAR_WOOD.get())
                .add(ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_WOOD.get())
                .add(ModBlocks.STRIPPED_OSMANTHUS_WOOD.get())
                .add(ModBlocks.STRIPPED_GINKGO_WOOD.get())
                .add(ModBlocks.STRIPPED_CHINESE_PARASOL_WOOD.get())
                .add(ModBlocks.STRIPPED_SWEETGUM_WOOD.get())
                .add(ModBlocks.STRIPPED_CAMPHOR_WOOD.get())
                .add(ModBlocks.STRIPPED_DOVE_TREE_WOOD.get())
                .add(ModBlocks.STRIPPED_CHINABERRY_WOOD.get())
                .add(ModBlocks.STRIPPED_DESERT_POPLAR_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.RED_MEI_PLANKS.get())
                .add(ModBlocks.WHITE_MEI_PLANKS.get())
                .add(ModBlocks.GREEN_CALYX_MEI_PLANKS.get())
                .add(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get())
                .add(ModBlocks.CRABAPPLE_PLANKS.get())
                .add(ModBlocks.APRICOT_PLANKS.get())
                .add(ModBlocks.PEACH_PLANKS.get())
                .add(ModBlocks.PEAR_PLANKS.get())
                .add(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get())
                .add(ModBlocks.OSMANTHUS_PLANKS.get())
                .add(ModBlocks.GINKGO_PLANKS.get())
                .add(ModBlocks.CHINESE_PARASOL_PLANKS.get())
                .add(ModBlocks.SWEETGUM_PLANKS.get())
                .add(ModBlocks.CAMPHOR_PLANKS.get())
                .add(ModBlocks.DOVE_TREE_PLANKS.get())
                .add(ModBlocks.CHINABERRY_PLANKS.get())
                .add(ModBlocks.DESERT_POPLAR_PLANKS.get());

        this.tag(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.RED_MEI_STAIRS.get())
                .add(ModBlocks.WHITE_MEI_STAIRS.get())
                .add(ModBlocks.GREEN_CALYX_MEI_STAIRS.get())
                .add(ModBlocks.DOUBLE_PINK_MEI_STAIRS.get())
                .add(ModBlocks.CRABAPPLE_STAIRS.get())
                .add(ModBlocks.APRICOT_STAIRS.get())
                .add(ModBlocks.PEACH_STAIRS.get())
                .add(ModBlocks.PEAR_STAIRS.get())
                .add(ModBlocks.PURPLE_LEAF_PLUM_STAIRS.get())
                .add(ModBlocks.OSMANTHUS_STAIRS.get())
                .add(ModBlocks.GINKGO_STAIRS.get())
                .add(ModBlocks.CHINESE_PARASOL_STAIRS.get())
                .add(ModBlocks.SWEETGUM_STAIRS.get())
                .add(ModBlocks.CAMPHOR_STAIRS.get())
                .add(ModBlocks.DOVE_TREE_STAIRS.get())
                .add(ModBlocks.CHINABERRY_STAIRS.get())
                .add(ModBlocks.DESERT_POPLAR_STAIRS.get());

        this.tag(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.RED_MEI_SLAB.get())
                .add(ModBlocks.WHITE_MEI_SLAB.get())
                .add(ModBlocks.GREEN_CALYX_MEI_SLAB.get())
                .add(ModBlocks.DOUBLE_PINK_MEI_SLAB.get())
                .add(ModBlocks.CRABAPPLE_SLAB.get())
                .add(ModBlocks.APRICOT_SLAB.get())
                .add(ModBlocks.PEACH_SLAB.get())
                .add(ModBlocks.PEAR_SLAB.get())
                .add(ModBlocks.PURPLE_LEAF_PLUM_SLAB.get())
                .add(ModBlocks.OSMANTHUS_SLAB.get())
                .add(ModBlocks.GINKGO_SLAB.get())
                .add(ModBlocks.CHINESE_PARASOL_SLAB.get())
                .add(ModBlocks.SWEETGUM_SLAB.get())
                .add(ModBlocks.CAMPHOR_SLAB.get())
                .add(ModBlocks.DOVE_TREE_SLAB.get())
                .add(ModBlocks.CHINABERRY_SLAB.get())
                .add(ModBlocks.DESERT_POPLAR_SLAB.get());

        this.tag(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.RED_MEI_BUTTON.get())
                .add(ModBlocks.WHITE_MEI_BUTTON.get())
                .add(ModBlocks.GREEN_CALYX_MEI_BUTTON.get())
                .add(ModBlocks.DOUBLE_PINK_MEI_BUTTON.get())
                .add(ModBlocks.CRABAPPLE_BUTTON.get())
                .add(ModBlocks.APRICOT_BUTTON.get())
                .add(ModBlocks.PEACH_BUTTON.get())
                .add(ModBlocks.PEAR_BUTTON.get())
                .add(ModBlocks.PURPLE_LEAF_PLUM_BUTTON.get())
                .add(ModBlocks.OSMANTHUS_BUTTON.get())
                .add(ModBlocks.GINKGO_BUTTON.get())
                .add(ModBlocks.CHINESE_PARASOL_BUTTON.get())
                .add(ModBlocks.SWEETGUM_BUTTON.get())
                .add(ModBlocks.CAMPHOR_BUTTON.get())
                .add(ModBlocks.DOVE_TREE_BUTTON.get())
                .add(ModBlocks.CHINABERRY_BUTTON.get())
                .add(ModBlocks.DESERT_POPLAR_BUTTON.get());

        this.tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.RED_MEI_PRESSURE_PLATE.get())
                .add(ModBlocks.WHITE_MEI_PRESSURE_PLATE.get())
                .add(ModBlocks.GREEN_CALYX_MEI_PRESSURE_PLATE.get())
                .add(ModBlocks.DOUBLE_PINK_MEI_PRESSURE_PLATE.get())
                .add(ModBlocks.CRABAPPLE_PRESSURE_PLATE.get())
                .add(ModBlocks.APRICOT_PRESSURE_PLATE.get())
                .add(ModBlocks.PEACH_PRESSURE_PLATE.get())
                .add(ModBlocks.PEAR_PRESSURE_PLATE.get())
                .add(ModBlocks.PURPLE_LEAF_PLUM_PRESSURE_PLATE.get())
                .add(ModBlocks.OSMANTHUS_PRESSURE_PLATE.get())
                .add(ModBlocks.GINKGO_PRESSURE_PLATE.get())
                .add(ModBlocks.CHINESE_PARASOL_PRESSURE_PLATE.get())
                .add(ModBlocks.SWEETGUM_PRESSURE_PLATE.get())
                .add(ModBlocks.CAMPHOR_PRESSURE_PLATE.get())
                .add(ModBlocks.DOVE_TREE_PRESSURE_PLATE.get())
                .add(ModBlocks.CHINABERRY_PRESSURE_PLATE.get())
                .add(ModBlocks.DESERT_POPLAR_PRESSURE_PLATE.get());

        this.tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.RED_MEI_FENCE.get())
                .add(ModBlocks.WHITE_MEI_FENCE.get())
                .add(ModBlocks.GREEN_CALYX_MEI_FENCE.get())
                .add(ModBlocks.DOUBLE_PINK_MEI_FENCE.get())
                .add(ModBlocks.CRABAPPLE_FENCE.get())
                .add(ModBlocks.APRICOT_FENCE.get())
                .add(ModBlocks.PEACH_FENCE.get())
                .add(ModBlocks.PEAR_FENCE.get())
                .add(ModBlocks.PURPLE_LEAF_PLUM_FENCE.get())
                .add(ModBlocks.OSMANTHUS_FENCE.get())
                .add(ModBlocks.GINKGO_FENCE.get())
                .add(ModBlocks.CHINESE_PARASOL_FENCE.get())
                .add(ModBlocks.SWEETGUM_FENCE.get())
                .add(ModBlocks.CAMPHOR_FENCE.get())
                .add(ModBlocks.DOVE_TREE_FENCE.get())
                .add(ModBlocks.CHINABERRY_FENCE.get())
                .add(ModBlocks.DESERT_POPLAR_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.RED_MEI_FENCE_GATE.get())
                .add(ModBlocks.WHITE_MEI_FENCE_GATE.get())
                .add(ModBlocks.GREEN_CALYX_MEI_FENCE_GATE.get())
                .add(ModBlocks.DOUBLE_PINK_MEI_FENCE_GATE.get())
                .add(ModBlocks.CRABAPPLE_FENCE_GATE.get())
                .add(ModBlocks.APRICOT_FENCE_GATE.get())
                .add(ModBlocks.PEACH_FENCE_GATE.get())
                .add(ModBlocks.PEAR_FENCE_GATE.get())
                .add(ModBlocks.PURPLE_LEAF_PLUM_FENCE_GATE.get())
                .add(ModBlocks.OSMANTHUS_FENCE_GATE.get())
                .add(ModBlocks.GINKGO_FENCE_GATE.get())
                .add(ModBlocks.CHINESE_PARASOL_FENCE_GATE.get())
                .add(ModBlocks.SWEETGUM_FENCE_GATE.get())
                .add(ModBlocks.CAMPHOR_FENCE_GATE.get())
                .add(ModBlocks.DOVE_TREE_FENCE_GATE.get())
                .add(ModBlocks.CHINABERRY_FENCE_GATE.get())
                .add(ModBlocks.DESERT_POPLAR_FENCE_GATE.get());

        this.tag(Tags.Blocks.FENCE_GATES_WOODEN)
                .add(ModBlocks.RED_MEI_FENCE_GATE.get())
                .add(ModBlocks.WHITE_MEI_FENCE_GATE.get())
                .add(ModBlocks.GREEN_CALYX_MEI_FENCE_GATE.get())
                .add(ModBlocks.DOUBLE_PINK_MEI_FENCE_GATE.get())
                .add(ModBlocks.CRABAPPLE_FENCE_GATE.get())
                .add(ModBlocks.APRICOT_FENCE_GATE.get())
                .add(ModBlocks.PEACH_FENCE_GATE.get())
                .add(ModBlocks.PEAR_FENCE_GATE.get())
                .add(ModBlocks.PURPLE_LEAF_PLUM_FENCE_GATE.get())
                .add(ModBlocks.OSMANTHUS_FENCE_GATE.get())
                .add(ModBlocks.GINKGO_FENCE_GATE.get())
                .add(ModBlocks.CHINESE_PARASOL_FENCE_GATE.get())
                .add(ModBlocks.SWEETGUM_FENCE_GATE.get())
                .add(ModBlocks.CAMPHOR_FENCE_GATE.get())
                .add(ModBlocks.DOVE_TREE_FENCE_GATE.get())
                .add(ModBlocks.CHINABERRY_FENCE_GATE.get())
                .add(ModBlocks.DESERT_POPLAR_FENCE_GATE.get());

        this.tag(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.RED_MEI_DOOR.get())
                .add(ModBlocks.WHITE_MEI_DOOR.get())
                .add(ModBlocks.GREEN_CALYX_MEI_DOOR.get())
                .add(ModBlocks.DOUBLE_PINK_MEI_DOOR.get())
                .add(ModBlocks.CRABAPPLE_DOOR.get())
                .add(ModBlocks.APRICOT_DOOR.get())
                .add(ModBlocks.PEACH_DOOR.get())
                .add(ModBlocks.PEAR_DOOR.get())
                .add(ModBlocks.PURPLE_LEAF_PLUM_DOOR.get())
                .add(ModBlocks.OSMANTHUS_DOOR.get())
                .add(ModBlocks.GINKGO_DOOR.get())
                .add(ModBlocks.CHINESE_PARASOL_DOOR.get())
                .add(ModBlocks.SWEETGUM_DOOR.get())
                .add(ModBlocks.CAMPHOR_DOOR.get())
                .add(ModBlocks.DOVE_TREE_DOOR.get())
                .add(ModBlocks.CHINABERRY_DOOR.get())
                .add(ModBlocks.DESERT_POPLAR_DOOR.get());

        this.tag(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.RED_MEI_TRAPDOOR.get())
                .add(ModBlocks.WHITE_MEI_TRAPDOOR.get())
                .add(ModBlocks.GREEN_CALYX_MEI_TRAPDOOR.get())
                .add(ModBlocks.DOUBLE_PINK_MEI_TRAPDOOR.get())
                .add(ModBlocks.CRABAPPLE_TRAPDOOR.get())
                .add(ModBlocks.APRICOT_TRAPDOOR.get())
                .add(ModBlocks.PEACH_TRAPDOOR.get())
                .add(ModBlocks.PEAR_TRAPDOOR.get())
                .add(ModBlocks.PURPLE_LEAF_PLUM_TRAPDOOR.get())
                .add(ModBlocks.OSMANTHUS_TRAPDOOR.get())
                .add(ModBlocks.GINKGO_TRAPDOOR.get())
                .add(ModBlocks.CHINESE_PARASOL_TRAPDOOR.get())
                .add(ModBlocks.SWEETGUM_TRAPDOOR.get())
                .add(ModBlocks.CAMPHOR_TRAPDOOR.get())
                .add(ModBlocks.DOVE_TREE_TRAPDOOR.get())
                .add(ModBlocks.CHINABERRY_TRAPDOOR.get())
                .add(ModBlocks.DESERT_POPLAR_TRAPDOOR.get());

        this.tag(BlockTags.STANDING_SIGNS)
                .add(ModBlocks.RED_MEI_SIGN.get())
                .add(ModBlocks.WHITE_MEI_SIGN.get())
                .add(ModBlocks.GREEN_CALYX_MEI_SIGN.get())
                .add(ModBlocks.DOUBLE_PINK_MEI_SIGN.get())
                .add(ModBlocks.CRABAPPLE_SIGN.get())
                .add(ModBlocks.APRICOT_SIGN.get())
                .add(ModBlocks.PEACH_SIGN.get())
                .add(ModBlocks.PEAR_SIGN.get())
                .add(ModBlocks.PURPLE_LEAF_PLUM_SIGN.get())
                .add(ModBlocks.OSMANTHUS_SIGN.get())
                .add(ModBlocks.GINKGO_SIGN.get())
                .add(ModBlocks.CHINESE_PARASOL_SIGN.get())
                .add(ModBlocks.SWEETGUM_SIGN.get())
                .add(ModBlocks.CAMPHOR_SIGN.get())
                .add(ModBlocks.DOVE_TREE_SIGN.get())
                .add(ModBlocks.CHINABERRY_SIGN.get())
                .add(ModBlocks.DESERT_POPLAR_SIGN.get());

        this.tag(BlockTags.WALL_SIGNS)
                .add(ModBlocks.RED_MEI_WALL_SIGN.get())
                .add(ModBlocks.WHITE_MEI_WALL_SIGN.get())
                .add(ModBlocks.GREEN_CALYX_MEI_WALL_SIGN.get())
                .add(ModBlocks.DOUBLE_PINK_MEI_WALL_SIGN.get())
                .add(ModBlocks.CRABAPPLE_WALL_SIGN.get())
                .add(ModBlocks.APRICOT_WALL_SIGN.get())
                .add(ModBlocks.PEACH_WALL_SIGN.get())
                .add(ModBlocks.PEAR_WALL_SIGN.get())
                .add(ModBlocks.PURPLE_LEAF_PLUM_WALL_SIGN.get())
                .add(ModBlocks.OSMANTHUS_WALL_SIGN.get())
                .add(ModBlocks.GINKGO_WALL_SIGN.get())
                .add(ModBlocks.CHINESE_PARASOL_WALL_SIGN.get())
                .add(ModBlocks.SWEETGUM_WALL_SIGN.get())
                .add(ModBlocks.CAMPHOR_WALL_SIGN.get())
                .add(ModBlocks.DOVE_TREE_WALL_SIGN.get())
                .add(ModBlocks.CHINABERRY_WALL_SIGN.get())
                .add(ModBlocks.DESERT_POPLAR_WALL_SIGN.get());

        this.tag(BlockTags.CEILING_HANGING_SIGNS)
                .add(ModBlocks.RED_MEI_HANGING_SIGN.get())
                .add(ModBlocks.WHITE_MEI_HANGING_SIGN.get())
                .add(ModBlocks.GREEN_CALYX_MEI_HANGING_SIGN.get())
                .add(ModBlocks.DOUBLE_PINK_MEI_HANGING_SIGN.get())
                .add(ModBlocks.CRABAPPLE_HANGING_SIGN.get())
                .add(ModBlocks.APRICOT_HANGING_SIGN.get())
                .add(ModBlocks.PEACH_HANGING_SIGN.get())
                .add(ModBlocks.PEAR_HANGING_SIGN.get())
                .add(ModBlocks.PURPLE_LEAF_PLUM_HANGING_SIGN.get())
                .add(ModBlocks.OSMANTHUS_HANGING_SIGN.get())
                .add(ModBlocks.GINKGO_HANGING_SIGN.get())
                .add(ModBlocks.CHINESE_PARASOL_HANGING_SIGN.get())
                .add(ModBlocks.SWEETGUM_HANGING_SIGN.get())
                .add(ModBlocks.CAMPHOR_HANGING_SIGN.get())
                .add(ModBlocks.DOVE_TREE_HANGING_SIGN.get())
                .add(ModBlocks.CHINABERRY_HANGING_SIGN.get())
                .add(ModBlocks.DESERT_POPLAR_HANGING_SIGN.get());

        this.tag(BlockTags.WALL_HANGING_SIGNS)
                .add(ModBlocks.RED_MEI_WALL_HANGING_SIGN.get())
                .add(ModBlocks.WHITE_MEI_WALL_HANGING_SIGN.get())
                .add(ModBlocks.GREEN_CALYX_MEI_WALL_HANGING_SIGN.get())
                .add(ModBlocks.DOUBLE_PINK_MEI_WALL_HANGING_SIGN.get())
                .add(ModBlocks.CRABAPPLE_WALL_HANGING_SIGN.get())
                .add(ModBlocks.APRICOT_WALL_HANGING_SIGN.get())
                .add(ModBlocks.PEACH_WALL_HANGING_SIGN.get())
                .add(ModBlocks.PEAR_WALL_HANGING_SIGN.get())
                .add(ModBlocks.PURPLE_LEAF_PLUM_WALL_HANGING_SIGN.get())
                .add(ModBlocks.OSMANTHUS_WALL_HANGING_SIGN.get())
                .add(ModBlocks.GINKGO_WALL_HANGING_SIGN.get())
                .add(ModBlocks.CHINESE_PARASOL_WALL_HANGING_SIGN.get())
                .add(ModBlocks.SWEETGUM_WALL_HANGING_SIGN.get())
                .add(ModBlocks.CAMPHOR_WALL_HANGING_SIGN.get())
                .add(ModBlocks.DOVE_TREE_WALL_HANGING_SIGN.get())
                .add(ModBlocks.CHINABERRY_WALL_HANGING_SIGN.get())
                .add(ModBlocks.DESERT_POPLAR_WALL_HANGING_SIGN.get());

        this.tag(ModTags.Blocks.RED_MEI_LOGS)
                .add(ModBlocks.RED_MEI_LOG.get(), ModBlocks.RED_MEI_WOOD.get(), ModBlocks.STRIPPED_RED_MEI_LOG.get(), ModBlocks.STRIPPED_RED_MEI_WOOD.get());
        this.tag(ModTags.Blocks.WHITE_MEI_LOGS)
                .add(ModBlocks.WHITE_MEI_LOG.get(), ModBlocks.WHITE_MEI_WOOD.get(), ModBlocks.STRIPPED_WHITE_MEI_LOG.get(), ModBlocks.STRIPPED_WHITE_MEI_WOOD.get());
        this.tag(ModTags.Blocks.GREEN_CALYX_MEI_LOGS)
                .add(ModBlocks.GREEN_CALYX_MEI_LOG.get(), ModBlocks.GREEN_CALYX_MEI_WOOD.get(), ModBlocks.STRIPPED_GREEN_CALYX_MEI_LOG.get(), ModBlocks.STRIPPED_GREEN_CALYX_MEI_WOOD.get());
        this.tag(ModTags.Blocks.DOUBLE_PINK_MEI_LOGS)
                .add(ModBlocks.DOUBLE_PINK_MEI_LOG.get(), ModBlocks.DOUBLE_PINK_MEI_WOOD.get(), ModBlocks.STRIPPED_DOUBLE_PINK_MEI_LOG.get(), ModBlocks.STRIPPED_DOUBLE_PINK_MEI_WOOD.get());
        this.tag(ModTags.Blocks.CRABAPPLE_LOGS)
                .add(ModBlocks.CRABAPPLE_LOG.get(), ModBlocks.CRABAPPLE_WOOD.get(), ModBlocks.STRIPPED_CRABAPPLE_LOG.get(), ModBlocks.STRIPPED_CRABAPPLE_WOOD.get());
        this.tag(ModTags.Blocks.APRICOT_LOGS)
                .add(ModBlocks.APRICOT_LOG.get(), ModBlocks.APRICOT_WOOD.get(), ModBlocks.STRIPPED_APRICOT_LOG.get(), ModBlocks.STRIPPED_APRICOT_WOOD.get());
        this.tag(ModTags.Blocks.PEACH_LOGS)
                .add(ModBlocks.PEACH_LOG.get(), ModBlocks.PEACH_WOOD.get(), ModBlocks.STRIPPED_PEACH_LOG.get(), ModBlocks.STRIPPED_PEACH_WOOD.get());
        this.tag(ModTags.Blocks.PEAR_LOGS)
                .add(ModBlocks.PEAR_LOG.get(), ModBlocks.PEAR_WOOD.get(), ModBlocks.STRIPPED_PEAR_LOG.get(), ModBlocks.STRIPPED_PEAR_WOOD.get());
        this.tag(ModTags.Blocks.PURPLE_LEAF_PLUM_LOGS)
                .add(ModBlocks.PURPLE_LEAF_PLUM_LOG.get(), ModBlocks.PURPLE_LEAF_PLUM_WOOD.get(), ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_LOG.get(), ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_WOOD.get());
        this.tag(ModTags.Blocks.OSMANTHUS_LOGS)
                .add(ModBlocks.OSMANTHUS_LOG.get(), ModBlocks.OSMANTHUS_WOOD.get(), ModBlocks.STRIPPED_OSMANTHUS_LOG.get(), ModBlocks.STRIPPED_OSMANTHUS_WOOD.get());
        this.tag(ModTags.Blocks.GINKGO_LOGS)
                .add(ModBlocks.GINKGO_LOG.get(), ModBlocks.GINKGO_WOOD.get(), ModBlocks.STRIPPED_GINKGO_LOG.get(), ModBlocks.STRIPPED_GINKGO_WOOD.get());
        this.tag(ModTags.Blocks.CHINESE_PARASOL_LOGS)
                .add(ModBlocks.CHINESE_PARASOL_LOG.get(), ModBlocks.CHINESE_PARASOL_WOOD.get(), ModBlocks.STRIPPED_CHINESE_PARASOL_LOG.get(), ModBlocks.STRIPPED_CHINESE_PARASOL_WOOD.get());
        this.tag(ModTags.Blocks.SWEETGUM_LOGS)
                .add(ModBlocks.SWEETGUM_LOG.get(), ModBlocks.SWEETGUM_WOOD.get(), ModBlocks.STRIPPED_SWEETGUM_LOG.get(), ModBlocks.STRIPPED_SWEETGUM_WOOD.get());
        this.tag(ModTags.Blocks.CAMPHOR_LOGS)
                .add(ModBlocks.CAMPHOR_LOG.get(), ModBlocks.CAMPHOR_WOOD.get(), ModBlocks.STRIPPED_CAMPHOR_LOG.get(), ModBlocks.STRIPPED_CAMPHOR_WOOD.get());
        this.tag(ModTags.Blocks.DOVE_TREE_LOGS)
                .add(ModBlocks.DOVE_TREE_LOG.get(), ModBlocks.DOVE_TREE_WOOD.get(), ModBlocks.STRIPPED_DOVE_TREE_LOG.get(), ModBlocks.STRIPPED_DOVE_TREE_WOOD.get());
        this.tag(ModTags.Blocks.CHINABERRY_LOGS)
                .add(ModBlocks.CHINABERRY_LOG.get(), ModBlocks.CHINABERRY_WOOD.get(),ModBlocks.STRIPPED_CHINABERRY_LOG.get(), ModBlocks.STRIPPED_CHINABERRY_WOOD.get());
        this.tag(ModTags.Blocks.DESERT_POPLAR_LOGS)
                .add(ModBlocks.DESERT_POPLAR_LOG.get(), ModBlocks.DESERT_POPLAR_WOOD.get(), ModBlocks.STRIPPED_DESERT_POPLAR_LOG.get(), ModBlocks.STRIPPED_DESERT_POPLAR_WOOD.get());

        this.tag(BlockTags.SAPLINGS)
                .addTag(CommonTags.Blocks.MEI_SAPLING)
                .addTag(CommonTags.Blocks.CRABAPPLE_SAPLING)
                .addTag(CommonTags.Blocks.APRICOT_SAPLING)
                .addTag(CommonTags.Blocks.PEACH_SAPLING)
                .add(ModBlocks.PEAR_SAPLING.get())
                .addTag(CommonTags.Blocks.PLUM_SAPLING)
                .addTag(CommonTags.Blocks.OSMANTHUS_SAPLING)
                .addTag(CommonTags.Blocks.GINKGO_SAPLING)
                .addTag(CommonTags.Blocks.CHINESE_PARASOL_SAPLING)
                .add(ModBlocks.SWEETGUM_SAPLING.get())
                .add(ModBlocks.CAMPHOR_SAPLING.get())
                .add(ModBlocks.DOVE_TREE_SAPLING.get())
                .add(ModBlocks.CHINABERRY_SAPLING.get())
                .add(ModBlocks.DESERT_POPLAR_SAPLING.get())
                .addTag(CommonTags.Blocks.CRAPE_MYRTLE_SAPLING);

        this.tag(BlockTags.REPLACEABLE_BY_TREES)
                .add(ModBlocks.WINTER_CYMBIDIUM.get())
                .add(ModBlocks.WINTERSWEET.get())
                .addTag(CommonTags.Blocks.TREE_PEONY)
                .addTag(CommonTags.Blocks.CHINESE_ROSE)
                .add(ModBlocks.CRAPE_MYRTLE.get(), ModBlocks.RED_CRAPE_MYRTLE.get())
                .add(ModBlocks.PINK_CRAPE_MYRTLE.get(), ModBlocks.WHITE_CRAPE_MYRTLE.get())
                .add(ModBlocks.COTTON_ROSE.get())
                .addTag(CommonTags.Blocks.LOTUS)
                .add(ModBlocks.BAMBOO_STICK.get());

        this.tag(BlockTags.SMALL_FLOWERS)
                .add(ModBlocks.WEEPING_CRABAPPLE.get())
                .addTag(CommonTags.Blocks.CHRYSANTHEMUM)
                .add(ModBlocks.SPRING_CYMBIDIUM.get(), ModBlocks.SUMMER_CYMBIDIUM.get(), ModBlocks.AUTUMN_CYMBIDIUM.get())
                .addTag(CommonTags.Blocks.HERBACEOUS_PEONY)
                .addTag(CommonTags.Blocks.CAMELLIA)
                .addTag(CommonTags.Blocks.RHODODENDRON)
                .add(ModBlocks.CUT_PEONY.get(), ModBlocks.CUT_LIGHT_PINK_PEONY.get(), ModBlocks.CUT_VIOLET_PINK_PEONY.get())
                .add(ModBlocks.CUT_RED_PEONY.get(), ModBlocks.CUT_LIGHT_RED_PEONY.get(), ModBlocks.CUT_INK_RED_PEONY.get())
                .add(ModBlocks.CUT_PURPLE_PEONY.get(), ModBlocks.CUT_LIGHT_PURPLE_PEONY.get(), ModBlocks.CUT_INK_PURPLE_PEONY.get())
                .add(ModBlocks.CUT_YELLOW_PEONY.get(), ModBlocks.CUT_LIGHT_YELLOW_PEONY.get(), ModBlocks.CUT_OCHRE_YELLOW_PEONY.get())
                .add(ModBlocks.CUT_WHITE_PEONY.get(), ModBlocks.CUT_INK_PEONY.get(), ModBlocks.CUT_BLUE_PEONY.get())
                .add(ModBlocks.CUT_GREEN_PEONY.get(), ModBlocks.CUT_WU_HUA_LONG_YU_PEONY.get(), ModBlocks.CUT_MAUVE_PEONY.get())
                .add(ModBlocks.CUT_CHINESE_ROSE.get(), ModBlocks.CUT_PINK_ROSE.get(), ModBlocks.CUT_YELLOW_ROSE.get())
                .add(ModBlocks.CUT_WHITE_ROSE.get(), ModBlocks.CUT_BAOHUA_CHINESE_ROSE.get(), ModBlocks.CUT_COTTON_ROSE.get())
                .add(ModBlocks.CUT_WINTERSWEET.get());

        this.tag(BlockTags.TALL_FLOWERS)
                .add(ModBlocks.WINTER_CYMBIDIUM.get())
                .add(ModBlocks.WINTERSWEET.get())
                .addTag(CommonTags.Blocks.TREE_PEONY)
                .addTag(CommonTags.Blocks.CHINESE_ROSE)
                .add(ModBlocks.CRAPE_MYRTLE.get(), ModBlocks.RED_CRAPE_MYRTLE.get())
                .add(ModBlocks.PINK_CRAPE_MYRTLE.get(), ModBlocks.WHITE_CRAPE_MYRTLE.get())
                .add(ModBlocks.COTTON_ROSE.get())
                .addTag(CommonTags.Blocks.LOTUS);

        this.tag(CommonTags.Blocks.MEI_SAPLING)
                .add(ModBlocks.RED_MEI_SAPLING.get(), ModBlocks.RED_WEEPING_MEI_SAPLING.get())
                .add(ModBlocks.WHITE_MEI_SAPLING.get(), ModBlocks.WHITE_WEEPING_MEI_SAPLING.get())
                .add(ModBlocks.GREEN_CALYX_MEI_SAPLING.get(), ModBlocks.GREEN_WEEPING_MEI_SAPLING.get())
                .add(ModBlocks.DOUBLE_PINK_MEI_SAPLING.get(), ModBlocks.PINK_WEEPING_MEI_SAPLING.get())
                .add(ModBlocks.VERSICOLOR_MEI_SAPLING.get(), ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING.get());
        this.tag(CommonTags.Blocks.MEI_LEAVES)
                .add(ModBlocks.RED_MEI_LEAVES.get(), ModBlocks.WHITE_MEI_LEAVES.get(), ModBlocks.GREEN_CALYX_MEI_LEAVES.get(),
                        ModBlocks.DOUBLE_PINK_MEI_LEAVES.get(), ModBlocks.VERSICOLOR_MEI_LEAVES.get());
        this.tag(CommonTags.Blocks.WEEPING_MEI)
                .add(ModBlocks.RED_WEEPING_MEI.get(), ModBlocks.WHITE_WEEPING_MEI.get(), ModBlocks.GREEN_WEEPING_MEI.get(),
                        ModBlocks.PINK_WEEPING_MEI.get(), ModBlocks.VERSICOLOR_WEEPING_MEI.get());

        this.tag(CommonTags.Blocks.CRABAPPLE_SAPLING)
                .add(ModBlocks.UPRIGHT_CRABAPPLE_SAPLING.get(), ModBlocks.WEEPING_CRABAPPLE_SAPLING.get());
        this.tag(CommonTags.Blocks.CRABAPPLE_LEAVES)
                .add(ModBlocks.UPRIGHT_CRABAPPLE_LEAVES.get(), ModBlocks.WEEPING_CRABAPPLE_LEAVES.get());

        this.tag(CommonTags.Blocks.OSMANTHUS_SAPLING)
                .add(ModBlocks.GOLDEN_OSMANTHUS_SAPLING.get(), ModBlocks.ORANGE_OSMANTHUS_SAPLING.get(), ModBlocks.WHITE_OSMANTHUS_SAPLING.get());
        this.tag(CommonTags.Blocks.OSMANTHUS_LEAVES)
                .add(ModBlocks.GOLDEN_OSMANTHUS_LEAVES.get(), ModBlocks.ORANGE_OSMANTHUS_LEAVES.get(), ModBlocks.WHITE_OSMANTHUS_LEAVES.get());

        this.tag(CommonTags.Blocks.APRICOT_SAPLING)
                .add(ModBlocks.PINK_APRICOT_SAPLING.get(), ModBlocks.WHITE_APRICOT_SAPLING.get(), ModBlocks.CLOUD_APRICOT_SAPLING.get());
        this.tag(CommonTags.Blocks.APRICOT_LEAVES)
                .add(ModBlocks.PINK_APRICOT_LEAVES.get(), ModBlocks.WHITE_APRICOT_LEAVES.get(), ModBlocks.CLOUD_APRICOT_LEAVES.get());

        this.tag(CommonTags.Blocks.PEACH_SAPLING)
                .add(ModBlocks.ORNAMENTAL_PEACH_SAPLING.get(), ModBlocks.WILD_PEACH_SAPLING.get(), ModBlocks.IMMORTAL_PEACH_SAPLING.get());
        this.tag(CommonTags.Blocks.PEACH_LEAVES)
                .add(ModBlocks.ORNAMENTAL_PEACH_LEAVES.get(), ModBlocks.WILD_PEACH_LEAVES.get(), ModBlocks.IMMORTAL_PEACH_LEAVES.get());

        this.tag(CommonTags.Blocks.PLUM_SAPLING)
                .add(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get(), ModBlocks.PURPLE_LEAF_PLUM_SAPLING.get());
        this.tag(CommonTags.Blocks.PLUM_LEAVES)
                .add(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_LEAVES.get(), ModBlocks.PURPLE_LEAF_PLUM_LEAVES.get());

        this.tag(CommonTags.Blocks.GINKGO_SAPLING)
                .add(ModBlocks.GOLDEN_GINKGO_SAPLING.get(), ModBlocks.GREEN_GINKGO_SAPLING.get());
        this.tag(CommonTags.Blocks.GINKGO_LEAVES)
                .add(ModBlocks.GOLDEN_GINKGO_LEAVES.get(), ModBlocks.GREEN_GINKGO_LEAVES.get());

        this.tag(CommonTags.Blocks.CHINESE_PARASOL_SAPLING)
                .add(ModBlocks.YELLOW_CHINESE_PARASOL_SAPLING.get(), ModBlocks.GREEN_CHINESE_PARASOL_SAPLING.get());
        this.tag(CommonTags.Blocks.CHINESE_PARASOL_LEAVES)
                .add(ModBlocks.YELLOW_CHINESE_PARASOL_LEAVES.get(), ModBlocks.GREEN_CHINESE_PARASOL_LEAVES.get());

        this.tag(CommonTags.Blocks.CAMPHOR_LEAVES)
                .add(ModBlocks.CAMPHOR_LEAVES.get(), ModBlocks.NEW_CAMPHOR_LEAVES.get());

        this.tag(CommonTags.Blocks.DOVE_TREE_LEAVES)
                .add(ModBlocks.DOVE_TREE_LEAVES.get(), ModBlocks.DOVE_TREE_BLOSSOM_LEAVES.get());

        this.tag(CommonTags.Blocks.CRAPE_MYRTLE_SAPLING)
                .add(ModBlocks.CRAPE_MYRTLE_SAPLING.get(), ModBlocks.RED_CRAPE_MYRTLE_SAPLING.get())
                .add(ModBlocks.PINK_CRAPE_MYRTLE_SAPLING.get(), ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING.get());
        this.tag(CommonTags.Blocks.CRAPE_MYRTLE_LEAVES)
                .add(ModBlocks.CRAPE_MYRTLE_LEAVES.get(), ModBlocks.RED_CRAPE_MYRTLE_LEAVES.get())
                .add(ModBlocks.PINK_CRAPE_MYRTLE_LEAVES.get(), ModBlocks.WHITE_CRAPE_MYRTLE_LEAVES.get());
        this.tag(CommonTags.Blocks.CRAPE_MYRTLE)
                .addTag(CommonTags.Blocks.CRAPE_MYRTLE_SAPLING)
                .add(ModBlocks.CRAPE_MYRTLE.get(), ModBlocks.RED_CRAPE_MYRTLE.get(),
                        ModBlocks.PINK_CRAPE_MYRTLE.get(), ModBlocks.WHITE_CRAPE_MYRTLE.get());

        this.tag(CommonTags.Blocks.RHODODENDRON_LEAVES)
                .add(ModBlocks.RED_AZALEA_LEAVES.get(), ModBlocks.MAYING_RHODODENDRON_LEAVES.get(),
                        ModBlocks.DEWDROP_RHODODENDRON_LEAVES.get(), ModBlocks.CHARMING_RHODODENDRON_LEAVES.get())
                .add(ModBlocks.GREAT_WHITE_RHODODENDRON_LEAVES.get(), ModBlocks.PURPLE_RHODODENDRON_LEAVES.get(),
                        ModBlocks.PINK_RHODODENDRON_LEAVES.get(), ModBlocks.CHINESE_AZALEA_LEAVES.get());

        this.tag(CommonTags.Blocks.CAMELLIA_LEAVES)
                .add(ModBlocks.CAMELLIA_LEAVES.get(), ModBlocks.PINK_CAMELLIA_LEAVES.get(),
                        ModBlocks.WHITE_CAMELLIA_LEAVES.get(), ModBlocks.VERSICOLOR_CAMELLIA_LEAVES.get());

        this.tag(CommonTags.Blocks.CYMBIDIUM)
                .add(ModBlocks.SPRING_CYMBIDIUM.get(), ModBlocks.SUMMER_CYMBIDIUM.get(),
                        ModBlocks.AUTUMN_CYMBIDIUM.get(), ModBlocks.WINTER_CYMBIDIUM.get());

        this.tag(CommonTags.Blocks.TREE_PEONY)
                .add(ModBlocks.YAO_HUANG_PEONY.get(), ModBlocks.WEI_ZI_PEONY.get(), ModBlocks.ZHAO_PINK_PEONY.get(), ModBlocks.DOU_GREEN_PEONY.get(),
                        Blocks.PEONY, ModBlocks.LUOYANG_RED_PEONY.get(), ModBlocks.TWO_QIAO_PEONY.get(), ModBlocks.VERSICOLOR_PEONY.get());

        this.tag(CommonTags.Blocks.HERBACEOUS_PEONY)
                .add(ModBlocks.PEONY.get(), ModBlocks.LIGHT_PINK_PEONY.get(), ModBlocks.VIOLET_PINK_PEONY.get(), ModBlocks.PINK_PEONY.get())
                .add(ModBlocks.RED_PEONY.get(), ModBlocks.LIGHT_RED_PEONY.get(), ModBlocks.INK_RED_PEONY.get(), ModBlocks.VERMILION_PEONY.get())
                .add(ModBlocks.PURPLE_PEONY.get(), ModBlocks.LIGHT_PURPLE_PEONY.get(), ModBlocks.INK_PURPLE_PEONY.get(), ModBlocks.VIOLET_PEONY.get())
                .add(ModBlocks.YELLOW_PEONY.get(), ModBlocks.LIGHT_YELLOW_PEONY.get(), ModBlocks.OCHRE_YELLOW_PEONY.get(), ModBlocks.GOLDEN_PEONY.get())
                .add(ModBlocks.WHITE_PEONY.get(), ModBlocks.INK_PEONY.get(), ModBlocks.BLUE_PEONY.get(), ModBlocks.GREEN_PEONY.get())
                .add(ModBlocks.COLORFUL_PEONY.get(), ModBlocks.LIGHT_COLORFUL_PEONY.get(), ModBlocks.INK_COLORFUL_PEONY.get())
                .add(ModBlocks.RED_WHITE_PEONY.get(), ModBlocks.PINK_WHITE_PEONY.get())
                .add(ModBlocks.YELLOW_WHITE_PEONY.get(), ModBlocks.PURPLE_WHITE_PEONY.get())
                .add(ModBlocks.WU_HUA_LONG_YU_PEONY.get(), ModBlocks.MAUVE_PEONY.get());

        this.tag(CommonTags.Blocks.CHINESE_ROSE)
                .add(ModBlocks.CHINESE_ROSE.get(), ModBlocks.PINK_CHINESE_ROSE.get())
                .add(ModBlocks.YELLOW_CHINESE_ROSE.get(), ModBlocks.WHITE_CHINESE_ROSE.get())
                .add(ModBlocks.RED_PINK_CHINESE_ROSE.get(), ModBlocks.RED_YELLOW_CHINESE_ROSE.get())
                .add(ModBlocks.RED_WHITE_CHINESE_ROSE.get(), ModBlocks.PINK_WHITE_CHINESE_ROSE.get())
                .add(ModBlocks.YELLOW_WHITE_CHINESE_ROSE.get(), ModBlocks.BAOHUA_CHINESE_ROSE.get());

        this.tag(CommonTags.Blocks.CHRYSANTHEMUM)
                .add(ModBlocks.CHRYSANTHEMUM.get(), ModBlocks.XIHU_LIUYUE.get(), ModBlocks.GOLD_BACKED_SCARLET_MUM.get())
                .add(ModBlocks.WHITE_CHRYSANTHEMUM.get(), ModBlocks.GREEN_CHRYSANTHEMUM.get(), ModBlocks.PURPLE_CHRYSANTHEMUM.get())
                .add(ModBlocks.VIOLET_PINK_CHRYSANTHEMUM.get(), ModBlocks.PINK_CHRYSANTHEMUM.get(), ModBlocks.LIGHT_PINK_CHRYSANTHEMUM.get());

        this.tag(CommonTags.Blocks.CAMELLIA)
                .add(ModBlocks.CAMELLIA.get(), ModBlocks.PINK_CAMELLIA.get(), ModBlocks.WHITE_CAMELLIA.get(), ModBlocks.VERSICOLOR_CAMELLIA.get());

        this.tag(CommonTags.Blocks.AZALEA)
                .add(Blocks.AZALEA, Blocks.FLOWERING_AZALEA)
                .addTag(CommonTags.Blocks.RHODODENDRON);
        this.tag(CommonTags.Blocks.RHODODENDRON)
                .add(ModBlocks.MAYING_RHODODENDRON.get(), ModBlocks.DEWDROP_RHODODENDRON.get(), ModBlocks.CHARMING_RHODODENDRON.get())
                .add(ModBlocks.GREAT_WHITE_RHODODENDRON.get(), ModBlocks.PURPLE_RHODODENDRON.get(), ModBlocks.PINK_RHODODENDRON.get())
                .add(ModBlocks.RED_AZALEA.get(), ModBlocks.CHINESE_AZALEA.get());

        this.tag(CommonTags.Blocks.LOTUS)
                .add(ModBlocks.LOTUS.get(), ModBlocks.WHITE_LOTUS.get());

        this.tag(CommonTags.Blocks.WISTERIA)
                .add(ModBlocks.CHINESE_WISTERIA.get(), ModBlocks.WHITE_CHINESE_WISTERIA.get(), ModBlocks.NANJING_WISTERIA.get())
                .add(ModBlocks.BLUE_CHINESE_WISTERIA.get(), ModBlocks.RED_CHINESE_WISTERIA.get());

        this.tag(ModTags.Blocks.MOTTLED_BAMBOO_PLANTABLE_ON)
                .addTag(BlockTags.SAND)
                .addTag(BlockTags.DIRT)
                .add(ModBlocks.MOTTLED_BAMBOO.get())
                .add(ModBlocks.MOTTLED_BAMBOO_SAPLING.get())
                .add(Blocks.GRAVEL)
                .add(Blocks.SUSPICIOUS_GRAVEL);

        this.tag(ModTags.Blocks.BLACK_BAMBOO_PLANTABLE_ON)
                .addTag(BlockTags.SAND)
                .addTag(BlockTags.DIRT)
                .add(ModBlocks.BLACK_BAMBOO.get())
                .add(ModBlocks.BLACK_BAMBOO_SAPLING.get())
                .add(Blocks.GRAVEL)
                .add(Blocks.SUSPICIOUS_GRAVEL);

        this.tag(ModTags.Blocks.ZIYING_FOX_SPAWNABLE_ON)
                .add(Blocks.MOSS_BLOCK)
                .add(ModBlocks.ZIYING_BEADLIGHT.get(), ModBlocks.SUYU_BEADLIGHT.get());
    }
}
