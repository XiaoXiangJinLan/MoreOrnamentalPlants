package com.jinlan.moreornplants.worldgen.biome.surface;

import com.jinlan.moreornplants.worldgen.biome.ModBiomes;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class ModSurfaceRules {
    private static final SurfaceRules.RuleSource SAND = SurfaceRules.state(Blocks.SAND.defaultBlockState());
    private static final SurfaceRules.RuleSource SANDSTONE = SurfaceRules.state(Blocks.SANDSTONE.defaultBlockState());
    private static final SurfaceRules.RuleSource MUD = SurfaceRules.state(Blocks.MUD.defaultBlockState());
    private static final SurfaceRules.RuleSource WATER = SurfaceRules.state(Blocks.WATER.defaultBlockState());

    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isYunmengMarsh = SurfaceRules.isBiome(ModBiomes.YUNMENG_MARSH);
        SurfaceRules.ConditionSource isDesertPoplarWoods = SurfaceRules.isBiome(ModBiomes.DESERT_POPLAR_WOODS);

        SurfaceRules.RuleSource desertPoplarRules = SurfaceRules.ifTrue(isDesertPoplarWoods,
                SurfaceRules.sequence(
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, SANDSTONE), SAND)),
                        SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SAND),
                        SurfaceRules.ifTrue(SurfaceRules.VERY_DEEP_UNDER_FLOOR, SANDSTONE)
                )
        );

        SurfaceRules.RuleSource yunmengMarshRules = SurfaceRules.ifTrue(isYunmengMarsh,
                SurfaceRules.sequence(
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, MUD),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                                SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0),
                                        SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.waterBlockCheck(0, 0)),
                                                SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.0D), WATER)))),
                        SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, MUD)
                )
        );

        return SurfaceRules.sequence(desertPoplarRules, yunmengMarshRules);
    }
}
