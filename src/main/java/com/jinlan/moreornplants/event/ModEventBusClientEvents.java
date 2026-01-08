package com.jinlan.moreornplants.event;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.MoreOrnPlantsClient;
import com.jinlan.moreornplants.block.ModBlockEntities;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@Mod(value = MoreOrnPlants.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = MoreOrnPlants.MODID, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.RED_MEI_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.RED_MEI_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.WHITE_MEI_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.WHITE_MEI_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.GREEN_CALYX_MEI_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.GREEN_CALYX_MEI_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.DOUBLE_PINK_MEI_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.DOUBLE_PINK_MEI_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.CRABAPPLE_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.CRABAPPLE_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.APRICOT_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.APRICOT_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.PEACH_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.PEACH_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.PEAR_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.PEAR_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.PURPLE_LEAF_PLUM_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.PURPLE_LEAF_PLUM_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.OSMANTHUS_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.OSMANTHUS_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.GINKGO_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.GINKGO_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.SWEETGUM_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.SWEETGUM_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.CHINESE_PARASOL_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.CHINESE_PARASOL_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.CAMPHOR_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.CAMPHOR_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.DOVE_TREE_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.DOVE_TREE_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.CHINABERRY_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.CHINABERRY_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.DESERT_POPLAR_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(MoreOrnPlantsClient.ModModelLayers.DESERT_POPLAR_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
    }

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.MOD_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MOD_HANGING_SIGN.get(), HangingSignRenderer::new);
    }
}
