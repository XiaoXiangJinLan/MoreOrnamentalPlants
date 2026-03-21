package com.jinlan.moreornplants.entity.client;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.entity.custom.ZiyingFox;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class SuyuFoxEyesLayer extends ZiyingFoxEyesLayer {
    private static final RenderType SUYU_FOX_EYES = RenderType.eyes(
            ResourceLocation.fromNamespaceAndPath(MoreOrnPlants.MODID, "textures/entity/suyu_fox/suyu_fox_eyes.png"));

    public SuyuFoxEyesLayer(RenderLayerParent<ZiyingFox, ZiyingFoxModel<ZiyingFox>> parent) {
        super(parent);
    }

    @Override
    public @NotNull RenderType renderType() {
        return SUYU_FOX_EYES;
    }
}
