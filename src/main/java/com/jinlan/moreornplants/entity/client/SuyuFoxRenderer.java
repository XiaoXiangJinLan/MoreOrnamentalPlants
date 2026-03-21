package com.jinlan.moreornplants.entity.client;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.entity.custom.ZiyingFox;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class SuyuFoxRenderer extends ZiyingFoxRenderer {
    private static final ResourceLocation SUYU_FOX_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(MoreOrnPlants.MODID, "textures/entity/suyu_fox/suyu_fox.png");
    private static final ResourceLocation SUYU_FOX_SLEEP_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(MoreOrnPlants.MODID, "textures/entity/suyu_fox/suyu_fox_sleep.png");
    private static final ResourceLocation SUYU_FOX_TAME_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(MoreOrnPlants.MODID, "textures/entity/suyu_fox/suyu_fox_tame.png");
    private static final ResourceLocation SUYU_FOX_TAME_SLEEP_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(MoreOrnPlants.MODID, "textures/entity/suyu_fox/suyu_fox_tame_sleep.png");

    public SuyuFoxRenderer(EntityRendererProvider.Context p_174127_) {
        super(p_174127_);
        this.addLayer(new SuyuFoxEyesLayer(this));
    }

    public @NotNull ResourceLocation getTextureLocation(ZiyingFox entity) {
        if (entity.isTame()) {
            return entity.isSleeping() ? SUYU_FOX_TAME_SLEEP_TEXTURE : SUYU_FOX_TAME_TEXTURE;
        } else {
            return entity.isSleeping() ? SUYU_FOX_SLEEP_TEXTURE : SUYU_FOX_TEXTURE;
        }
    }
}
