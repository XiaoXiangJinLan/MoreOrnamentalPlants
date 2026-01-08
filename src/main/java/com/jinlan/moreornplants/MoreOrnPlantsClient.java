package com.jinlan.moreornplants;

import com.google.common.collect.ImmutableMap;
import com.jinlan.moreornplants.entity.ModEntities;
import com.jinlan.moreornplants.entity.custom.ModBoatEntity;
import com.jinlan.moreornplants.entity.custom.ModChestBoatEntity;
import com.jinlan.moreornplants.init.ModParticleTypes;
import com.jinlan.moreornplants.particle.BlossomParticle;
import com.jinlan.moreornplants.particle.CamphorParticle;
import com.jinlan.moreornplants.particle.ChineseParasolParticle;
import com.jinlan.moreornplants.particle.PeachParticle;
import com.jinlan.moreornplants.util.ModWoodTypes;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.model.ListModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.stream.Stream;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = MoreOrnPlants.MODID, dist = Dist.CLIENT)
// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
@EventBusSubscriber(modid = MoreOrnPlants.MODID, value = Dist.CLIENT)
public class MoreOrnPlantsClient {
    public MoreOrnPlantsClient(ModContainer container) {
        // Allows NeoForge to create a config screen for this mod's configs.
        // The config screen is accessed by going to the Mods screen > clicking on your mod > clicking on config.
        // Do not forget to add translations for your config options to the en_us.json file.
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    public static void registerParticles(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(ModParticleTypes.RED_MEI_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.WHITE_MEI_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.GREEN_CALYX_MEI_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.DOUBLE_PINK_MEI_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.VERSICOLOR_MEI_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.UPRIGHT_CRABAPPLE_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.WEEPING_CRABAPPLE_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.PINK_APRICOT_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.WHITE_APRICOT_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.ORNAMENTAL_PEACH_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new PeachParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.WILD_PEACH_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new PeachParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.PEAR_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.FLOWERING_PURPLE_LEAF_PLUM_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.PURPLE_LEAF_PLUM_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.GOLDEN_OSMANTHUS_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.ORANGE_OSMANTHUS_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.WHITE_OSMANTHUS_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.GOLDEN_GINKGO_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.YELLOW_CHINESE_PARASOL_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new ChineseParasolParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.SWEETGUM_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new ChineseParasolParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.CAMPHOR_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new CamphorParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.DOVE_TREE_BLOSSOM_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new ChineseParasolParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.CHINABERRY_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.DESERT_POPLAR_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.CRAPE_MYRTLE_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
    }

    public static class ModBoatRenderer extends BoatRenderer {
        private final Map<ModBoatEntity.Type, Pair<ResourceLocation, ListModel<Boat>>> boatResources;

        public ModBoatRenderer(EntityRendererProvider.Context pContext, boolean pChestBoat) {
            super(pContext, pChestBoat);
            this.boatResources = Stream.of(ModBoatEntity.Type.values()).collect(ImmutableMap.toImmutableMap(type -> type,
                    type -> Pair.of(ResourceLocation.parse(MoreOrnPlants.MODID + ":" + getTextureLocation(type, pChestBoat)), this.createBoatModel(pContext, type,pChestBoat))));
        }

        private static String getTextureLocation(ModBoatEntity.Type pType, boolean pChestBoat) {
            return pChestBoat ? "textures/entity/chest_boat/" + pType.getName() + ".png" : "textures/entity/boat/" + pType.getName() + ".png";
        }

        private ListModel<Boat> createBoatModel(EntityRendererProvider.Context pContext, ModBoatEntity.Type pType, boolean pChestBoat) {
            ModelLayerLocation modellayerlocation = pChestBoat ? ModBoatRenderer.createChestBoatModelName(pType) : ModBoatRenderer.createBoatModelName(pType);
            ModelPart modelpart = pContext.bakeLayer(modellayerlocation);
            return pChestBoat ? new ChestBoatModel(modelpart) : new BoatModel(modelpart);
        }

        public static ModelLayerLocation createBoatModelName(ModBoatEntity.Type pType) {
            return createLocation("boat/" + pType.getName());
        }

        public static ModelLayerLocation createChestBoatModelName(ModBoatEntity.Type pType) {
            return createLocation("chest_boat/" + pType.getName());
        }

        private static ModelLayerLocation createLocation(String pPath) {
            return new ModelLayerLocation(ResourceLocation.parse(MoreOrnPlants.MODID), "main");
        }

        public @NotNull Pair<ResourceLocation, ListModel<Boat>> getModelWithLocation(@NotNull Boat boat) {
            if (boat instanceof ModBoatEntity modBoat) {
                return this.boatResources.get(modBoat.getModVariant());
            } else if (boat instanceof ModChestBoatEntity modChestBoatEntity) {
                return this.boatResources.get(modChestBoatEntity.getModVariant());
            } else {
                return null;
            }
        }
    }

    public static class ModModelLayers {
        public static final ModelLayerLocation RED_MEI_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "boat/red_mei"), "main");
        public static final ModelLayerLocation RED_MEI_CHEST_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "chest_boat/red_mei"), "main");

        public static final ModelLayerLocation WHITE_MEI_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "boat/white_mei"), "main");
        public static final ModelLayerLocation WHITE_MEI_CHEST_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "chest_boat/white_mei"), "main");

        public static final ModelLayerLocation GREEN_CALYX_MEI_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "boat/green_calyx_mei"), "main");
        public static final ModelLayerLocation GREEN_CALYX_MEI_CHEST_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "chest_boat/green_calyx_mei"), "main");

        public static final ModelLayerLocation DOUBLE_PINK_MEI_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "boat/double_pink_mei"), "main");
        public static final ModelLayerLocation DOUBLE_PINK_MEI_CHEST_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "chest_boat/double_pink_mei"), "main");

        public static final ModelLayerLocation CRABAPPLE_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "boat/crabapple"), "main");
        public static final ModelLayerLocation CRABAPPLE_CHEST_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "chest_boat/crabapple"), "main");

        public static final ModelLayerLocation APRICOT_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "boat/apricot"), "main");
        public static final ModelLayerLocation APRICOT_CHEST_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "chest_boat/apricot"), "main");

        public static final ModelLayerLocation PEACH_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "boat/peach"), "main");
        public static final ModelLayerLocation PEACH_CHEST_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "chest_boat/peach"), "main");

        public static final ModelLayerLocation PEAR_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "boat/pear"), "main");
        public static final ModelLayerLocation PEAR_CHEST_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "chest_boat/pear"), "main");

        public static final ModelLayerLocation PURPLE_LEAF_PLUM_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "boat/purple_leaf_plum"), "main");
        public static final ModelLayerLocation PURPLE_LEAF_PLUM_CHEST_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "chest_boat/purple_leaf_plum"), "main");

        public static final ModelLayerLocation OSMANTHUS_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "boat/osmanthus"), "main");
        public static final ModelLayerLocation OSMANTHUS_CHEST_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "chest_boat/osmanthus"), "main");

        public static final ModelLayerLocation GINKGO_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "boat/ginkgo"), "main");
        public static final ModelLayerLocation GINKGO_CHEST_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "chest_boat/ginkgo"), "main");

        public static final ModelLayerLocation SWEETGUM_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "boat/sweetgum"), "main");
        public static final ModelLayerLocation SWEETGUM_CHEST_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "chest_boat/sweetgum"), "main");

        public static final ModelLayerLocation CHINESE_PARASOL_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "boat/chinese_parasol"), "main");
        public static final ModelLayerLocation CHINESE_PARASOL_CHEST_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "chest_boat/chinese_parasol"), "main");

        public static final ModelLayerLocation CAMPHOR_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "boat/camphor"), "main");
        public static final ModelLayerLocation CAMPHOR_CHEST_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "chest_boat/camphor"), "main");

        public static final ModelLayerLocation DOVE_TREE_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "boat/dove_tree"), "main");
        public static final ModelLayerLocation DOVE_TREE_CHEST_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "chest_boat/dove_tree"), "main");

        public static final ModelLayerLocation CHINABERRY_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "boat/chinaberry"), "main");
        public static final ModelLayerLocation CHINABERRY_CHEST_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "chest_boat/chinaberry"), "main");

        public static final ModelLayerLocation DESERT_POPLAR_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "boat/desert_poplar"), "main");
        public static final ModelLayerLocation DESERT_POPLAR_CHEST_BOAT_LAYER = new ModelLayerLocation(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "chest_boat/desert_poplar"), "main");

    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
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
        // Some client setup code
        MoreOrnPlants.LOGGER.info("HELLO FROM CLIENT SETUP");
        MoreOrnPlants.LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
    }
}
