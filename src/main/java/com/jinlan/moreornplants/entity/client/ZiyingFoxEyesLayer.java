package com.jinlan.moreornplants.entity.client;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.entity.custom.ZiyingFox;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class ZiyingFoxEyesLayer extends EyesLayer<ZiyingFox, ZiyingFoxModel<ZiyingFox>> {
    private static final RenderType ZIYING_FOX_EYES = RenderType.eyes(
           new ResourceLocation(MoreOrnPlants.MOD_ID, "textures/entity/ziying_fox/ziying_fox_eyes.png"));

    public ZiyingFoxEyesLayer(RenderLayerParent<ZiyingFox, ZiyingFoxModel<ZiyingFox>> parent) {
        super(parent);
    }

    @Override
    public void render(@NotNull PoseStack poseStack, @NotNull MultiBufferSource buffer, int packedLight, ZiyingFox entity,
                       float limbSwing, float limbSwingAmount, float partialTick, float ageInTicks,
                       float netHeadYaw, float headPitch) {
        if (entity.isSleeping()) {
            return;
        }
        int light = entity.level().getRawBrightness(entity.blockPosition(), 0);
        if (light < 5) {
            super.render(poseStack, buffer, packedLight, entity, limbSwing, limbSwingAmount,
                    partialTick, ageInTicks, netHeadYaw, headPitch);
        }
    }

    @Override
    public @NotNull RenderType renderType() {
        return ZIYING_FOX_EYES;
    }
}
