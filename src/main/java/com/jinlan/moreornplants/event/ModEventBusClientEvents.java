package com.jinlan.moreornplants.event;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.MoreOrnPlantsClient;
import com.jinlan.moreornplants.block.ModBlockEntities;
import com.jinlan.moreornplants.init.ModParticleTypes;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.util.ModTags;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.player.AttackEntityEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

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

    private static void spawnSwordParticle(Player player, SimpleParticleType particleType, int count) {
        var level = player.level();
        var lookVec = player.getLookAngle();
        double startX = player.getX();
        double startY = player.getY() + player.getEyeHeight() - 0.2;
        double startZ = player.getZ();

        double rightX = lookVec.z;
        double rightZ = -lookVec.x;
        double upX = 0;
        double upY = 1;
        double upZ = 0;

        for (int i = 0; i < count; i++) {
            double distance = 1.2 + level.random.nextDouble() * 0.8;
            double lateral = (level.random.nextDouble() - 0.5) * 3.2;
            double vertical = (level.random.nextDouble() - 0.5);

            double x = startX + lookVec.x * distance + rightX * lateral + upX * vertical;
            double z = startZ + lookVec.z * distance + rightZ * lateral + upZ * vertical;
            double y = startY + lookVec.y * distance + upY * vertical;

            double vx = (level.random.nextDouble() - 0.5) * 0.2;
            double vz = (level.random.nextDouble() - 0.5) * 0.2;
            double vy = level.random.nextDouble() * 0.2;

            level.addParticle(particleType, x, y, z, vx, vy, vz);
        }
    }

    @SubscribeEvent
    public static void onAttackEntity(AttackEntityEvent event) {
        if (!event.getEntity().level().isClientSide) return;
        Player player = event.getEntity();
        ItemStack weapon = player.getMainHandItem();
        if (weapon.is(ModTags.Items.ZIYING_TOOLS)) {
            spawnSwordParticle(player, ModParticleTypes.ZIYING_FOX.get(), 20);
        } else if (weapon.is(ModTags.Items.SUYU_TOOLS)) {
            spawnSwordParticle(player, ModParticleTypes.SUYU_FOX.get(), 20);
        } else if (weapon.is(ModTags.Items.ZIYU_YUANYANG_TOOLS)) {
            spawnSwordParticle(player, ModParticleTypes.ZIYU_YUANYANG.get(), 24);
        } else if (weapon.is(ModItems.PEACH_WOODEN_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.IMMORTAL_PEACH_LEAVES.get(), 16);
        } else if (weapon.is(ModItems.CAMPHOR_WOODEN_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.CAMPHOR_LEAVES.get(), 16);
        } else if (weapon.is(ModItems.CHINESE_PARASOL_WOODEN_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.YELLOW_CHINESE_PARASOL_LEAVES.get(), 12);
        } else if (weapon.is(ModItems.BAIHUA_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.BAIHUA_CAT.get(), 24);
        }
    }

    @SubscribeEvent
    public static void onLeftClickEmpty(PlayerInteractEvent.LeftClickEmpty event) {
        if (!event.getEntity().level().isClientSide) return;
        Player player = event.getEntity();
        ItemStack weapon = player.getMainHandItem();
        if (weapon.is(ModTags.Items.ZIYING_TOOLS)) {
            spawnSwordParticle(player, ModParticleTypes.ZIYING_FOX.get(), 20);
        } else if (weapon.is(ModTags.Items.SUYU_TOOLS)) {
            spawnSwordParticle(player, ModParticleTypes.SUYU_FOX.get(), 20);
        } else if (weapon.is(ModTags.Items.ZIYU_YUANYANG_TOOLS)) {
            spawnSwordParticle(player, ModParticleTypes.ZIYU_YUANYANG.get(), 24);
        } else if (weapon.is(ModItems.PEACH_WOODEN_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.IMMORTAL_PEACH_LEAVES.get(), 16);
        } else if (weapon.is(ModItems.CAMPHOR_WOODEN_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.CAMPHOR_LEAVES.get(), 16);
        } else if (weapon.is(ModItems.CHINESE_PARASOL_WOODEN_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.YELLOW_CHINESE_PARASOL_LEAVES.get(), 12);
        } else if (weapon.is(ModItems.BAIHUA_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.BAIHUA_CAT.get(), 24);
        }
    }

    private static void spawnSwordParticle2(Player player, SimpleParticleType particleType) {
        var level = player.level();
        double baseX = player.getX();
        double baseY = player.getY() + player.getBbHeight() / 2;
        double baseZ = player.getZ();

        for (int i = 0; i < 1; i++) {
            double radius = 1.2;
            double x = baseX + (level.random.nextDouble() - 0.5) * radius * 2;
            double y = baseY + (level.random.nextDouble() - 0.5) * radius * 1.2;
            double z = baseZ + (level.random.nextDouble() - 0.5) * radius * 2;

            double vx = (level.random.nextDouble() - 0.5) * 0.6;
            double vz = (level.random.nextDouble() - 0.5) * 0.6;
            double vy = level.random.nextDouble() * 0.2 + 0.1;

            level.addParticle(particleType, x, y, z, vx, vy, vz);
        }
    }

    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Post event) {
        Player player = event.getEntity();
        if (!player.level().isClientSide) return;
        ItemStack weapon = player.getMainHandItem();
        ItemStack offHand = player.getOffhandItem();
        if (player.tickCount % 6 == 0) {
            if (weapon.is(ModTags.Items.ZIYING_TOOLS) || weapon.is(ModItems.ZIYING_BEAD)) {
                spawnSwordParticle2(player, ModParticleTypes.ZIYING_FOX.get());
            } else if (weapon.is(ModTags.Items.SUYU_TOOLS) || weapon.is(ModItems.SUYU_BEAD)) {
                spawnSwordParticle2(player, ModParticleTypes.SUYU_FOX.get());
            } else if (weapon.is(ModTags.Items.ZIYU_YUANYANG_TOOLS) || weapon.is(ModItems.ZIYU_YUANYANG_BEAD)) {
                spawnSwordParticle2(player, ModParticleTypes.ZIYU_YUANYANG.get());
            } else if (weapon.is(ModItems.BAIHUA_SWORD)) {
                spawnSwordParticle2(player, ModParticleTypes.BAIHUA_CAT.get());
            }
            if (offHand.is(ModTags.Items.ZIYING_TOOLS) || offHand.is(ModItems.ZIYING_BEAD)) {
                spawnSwordParticle2(player, ModParticleTypes.ZIYING_FOX.get());
            } else if (offHand.is(ModTags.Items.SUYU_TOOLS) || offHand.is(ModItems.SUYU_BEAD)) {
                spawnSwordParticle2(player, ModParticleTypes.SUYU_FOX.get());
            } else if (offHand.is(ModTags.Items.ZIYU_YUANYANG_TOOLS) || offHand.is(ModItems.ZIYU_YUANYANG_BEAD)) {
                spawnSwordParticle2(player, ModParticleTypes.ZIYU_YUANYANG.get());
            } else if (offHand.is(ModItems.BAIHUA_SWORD)) {
                spawnSwordParticle2(player, ModParticleTypes.BAIHUA_CAT.get());
            }
        }
        if (player.tickCount % 10 == 0) {
            if (weapon.is(ModItems.PEACH_WOODEN_SWORD)) {
                spawnSwordParticle2(player, ModParticleTypes.IMMORTAL_PEACH_LEAVES.get());
            } else if (weapon.is(ModItems.CAMPHOR_WOODEN_SWORD)) {
                spawnSwordParticle2(player, ModParticleTypes.CAMPHOR_LEAVES.get());
            } else if (weapon.is(ModItems.CHINESE_PARASOL_WOODEN_SWORD)) {
                spawnSwordParticle2(player, ModParticleTypes.YELLOW_CHINESE_PARASOL_LEAVES.get());
            }
            if (offHand.is(ModItems.PEACH_WOODEN_SWORD)) {
                spawnSwordParticle2(player, ModParticleTypes.IMMORTAL_PEACH_LEAVES.get());
            } else if (offHand.is(ModItems.CAMPHOR_WOODEN_SWORD)) {
                spawnSwordParticle2(player, ModParticleTypes.CAMPHOR_LEAVES.get());
            } else if (offHand.is(ModItems.CHINESE_PARASOL_WOODEN_SWORD)) {
                spawnSwordParticle2(player, ModParticleTypes.YELLOW_CHINESE_PARASOL_LEAVES.get());
            }
        }
    }
}
