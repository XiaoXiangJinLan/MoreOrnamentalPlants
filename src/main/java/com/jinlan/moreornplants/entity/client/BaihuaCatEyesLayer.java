package com.jinlan.moreornplants.entity.client;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.entity.custom.BaihuaCat;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.CatModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.level.LightLayer;
import org.jetbrains.annotations.NotNull;

public class BaihuaCatEyesLayer extends EyesLayer<Cat, CatModel<Cat>> {
    private static final RenderType BAIHUA_CAT_EYES = RenderType.eyes(
            ResourceLocation.fromNamespaceAndPath(MoreOrnPlants.MODID, "textures/entity/baihua_cat/baihua_cat_eyes.png"));

    public BaihuaCatEyesLayer(BaihuaCatRenderer parent) {
        super(parent);
    }

    @Override
    public void render(@NotNull PoseStack poseStack, @NotNull MultiBufferSource buffer, int packedLight, @NotNull Cat entity,
                       float limbSwing, float limbSwingAmount, float partialTick, float ageInTicks,
                       float netHeadYaw, float headPitch) {
        if (!(entity instanceof BaihuaCat)) return;
        long roundedTime = entity.level().getDayTime() % 24000;
        boolean night = roundedTime >= 13000 && roundedTime <= 22000;
        int light = night
                ? entity.level().getBrightness(LightLayer.BLOCK, entity.blockPosition())
                : entity.level().getRawBrightness(entity.blockPosition(), 0);
        if (light < 7 && !entity.isSleeping()) {
            super.render(poseStack, buffer, packedLight, entity, limbSwing, limbSwingAmount,
                    partialTick, ageInTicks, netHeadYaw, headPitch);
        }
    }

    @Override
    public @NotNull RenderType renderType() {
        return BAIHUA_CAT_EYES;
    }
}
