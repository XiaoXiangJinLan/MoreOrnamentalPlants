package com.jinlan.moreornplants.worldgen.biome.surface;

import com.jinlan.moreornplants.worldgen.biome.ModBiomes;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class ModSurfaceRules {
    private static final SurfaceRules.RuleSource SAND = SurfaceRules.state(Blocks.SAND.defaultBlockState());
    private static final SurfaceRules.RuleSource SANDSTONE = SurfaceRules.state(Blocks.SANDSTONE.defaultBlockState());

    public static SurfaceRules.RuleSource makeRules() {
        // 胡杨林使用原版沙漠的地表规则
        return SurfaceRules.sequence(
                // 地表规则：使用沙子，天花板使用砂岩（类似沙漠）
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                        SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.DESERT_POPLAR_WOODS),
                                SurfaceRules.sequence(
                                        SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, SANDSTONE),
                                        SAND
                                )
                        )
                ),

                // 深层规则：深层使用砂岩（类似沙漠深层）
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.DESERT_POPLAR_WOODS),
                        SurfaceRules.ifTrue(SurfaceRules.VERY_DEEP_UNDER_FLOOR, SANDSTONE)
                )
        );
    }
}
