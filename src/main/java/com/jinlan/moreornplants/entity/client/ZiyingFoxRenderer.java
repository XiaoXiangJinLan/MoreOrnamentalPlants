package com.jinlan.moreornplants.entity.client;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.entity.custom.ZiyingFox;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import org.jetbrains.annotations.NotNull;

public class ZiyingFoxRenderer extends MobRenderer<ZiyingFox, ZiyingFoxModel<ZiyingFox>> {
    private static final ResourceLocation ZIYING_FOX_TEXTURE =
            new ResourceLocation(MoreOrnPlants.MOD_ID, "textures/entity/ziying_fox/ziying_fox.png");
    private static final ResourceLocation ZIYING_FOX_SLEEP_TEXTURE =
            new ResourceLocation(MoreOrnPlants.MOD_ID, "textures/entity/ziying_fox/ziying_fox_sleep.png");
    private static final ResourceLocation ZIYING_FOX_TAME_TEXTURE =
            new ResourceLocation(MoreOrnPlants.MOD_ID, "textures/entity/ziying_fox/ziying_fox_tame.png");
    private static final ResourceLocation ZIYING_FOX_TAME_SLEEP_TEXTURE =
            new ResourceLocation(MoreOrnPlants.MOD_ID, "textures/entity/ziying_fox/ziying_fox_tame_sleep.png");

    public ZiyingFoxRenderer(EntityRendererProvider.Context p_174127_) {
        super(p_174127_, new ZiyingFoxModel<>(p_174127_.bakeLayer(ModelLayers.FOX)), 0.4F);
        this.addLayer(new ZiyingFoxHeldItemLayer(this, p_174127_.getItemInHandRenderer()));
        this.addLayer(new ZiyingFoxEyesLayer(this));
    }

    @Override
    protected void setupRotations(@NotNull ZiyingFox pEntityLiving, @NotNull PoseStack pPoseStack, float pAgeInTicks, float pRotationYaw, float pPartialTicks) {
        super.setupRotations(pEntityLiving, pPoseStack, pAgeInTicks, pRotationYaw, pPartialTicks);
        if (pEntityLiving.isPouncing() || pEntityLiving.isFaceplanted()) {
            float f = -Mth.lerp(pPartialTicks, pEntityLiving.xRotO, pEntityLiving.getXRot());
            pPoseStack.mulPose(Axis.XP.rotationDegrees(f));
        }
    }

    public @NotNull ResourceLocation getTextureLocation(ZiyingFox entity) {
        if (entity.isTame()) {
            return entity.isSleeping() ? ZIYING_FOX_TAME_SLEEP_TEXTURE : ZIYING_FOX_TAME_TEXTURE;
        } else {
            return entity.isSleeping() ? ZIYING_FOX_SLEEP_TEXTURE : ZIYING_FOX_TEXTURE;
        }
    }
}
