package com.jinlan.moreornplants.feature.foliageplacers;

import com.jinlan.moreornplants.init.ModFoliagePlacerTypes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;

public class MeiFoliagePlacer extends FoliagePlacer {
    public static final Codec<MeiFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            foliagePlacerParts(instance).and(instance.group(
                    IntProvider.codec(4, 16).fieldOf("height").forGetter((placer) -> placer.height),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("wide_bottom_layer_hole_chance").forGetter((placer) -> placer.wideBottomLayerHoleChance),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("corner_hole_chance").forGetter((placer) -> placer.cornerHoleChance),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("hanging_leaves_chance").forGetter((placer) -> placer.hangingLeavesChance),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("hanging_leaves_extension_chance").forGetter((placer) -> placer.hangingLeavesExtensionChance)
            )).apply(instance, MeiFoliagePlacer::new)
    );

    private final IntProvider height;
    private final float wideBottomLayerHoleChance;
    private final float cornerHoleChance;
    private final float hangingLeavesChance;
    private final float hangingLeavesExtensionChance;

    public MeiFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider height, float wideBottomLayerHoleChance, float cornerHoleChance, float hangingLeavesChance, float hangingLeavesExtensionChance) {
        super(radius, offset);
        this.height = height;
        this.wideBottomLayerHoleChance = wideBottomLayerHoleChance;
        this.cornerHoleChance = cornerHoleChance;
        this.hangingLeavesChance = hangingLeavesChance;
        this.hangingLeavesExtensionChance = hangingLeavesExtensionChance;
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return ModFoliagePlacerTypes.MEI_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader level, FoliageSetter foliageSetter, RandomSource random, TreeConfiguration config, int maxFreeTreeHeight, FoliageAttachment attachment, int foliageHeight, int foliageRadius, int offset) {
        boolean flag = attachment.doubleTrunk();
        BlockPos centerPos = attachment.pos().above(offset);
        int radius = foliageRadius + attachment.radiusOffset() - 1;

        // 放置树叶层，从顶部开始向下
        this.placeLeavesRow(level, foliageSetter, random, config, centerPos, radius - 1, foliageHeight - 3, flag);

        // 放置主要的树叶层
        for(int layer = foliageHeight - 4; layer >= 0; --layer) {
            this.placeLeavesRow(level, foliageSetter, random, config, centerPos, radius, layer, flag);
        }
        for(int layer = foliageHeight - 5; layer >= 0; --layer) {
            this.placeLeavesRow(level, foliageSetter, random, config, centerPos, radius, layer, flag);
        }

        this.placeLeavesRowWithHangingLeavesBelow(level, foliageSetter, random, config, centerPos, radius, -1, flag, this.hangingLeavesChance, this.hangingLeavesExtensionChance);
        this.placeLeavesRowWithHangingLeavesBelow(level, foliageSetter, random, config, centerPos, radius - 1, -2, flag, this.hangingLeavesChance, this.hangingLeavesExtensionChance);

    }

    @Override
    public int foliageHeight(RandomSource random, int trunkHeight, TreeConfiguration config) {
        return this.height.sample(random);
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource random, int localX, int localY, int localZ, int range, boolean large) {
        if (localY == -1 && (localX == range || localZ == range) && random.nextFloat() < this.wideBottomLayerHoleChance) {
            return true;
        } else {
            boolean isCorner = localX == range && localZ == range;
            boolean isLargeRange = range > 2;

            if (isLargeRange) {
                return isCorner || (localX + localZ > range * 2 - 2 && random.nextFloat() < this.cornerHoleChance);
            } else {
                return isCorner && random.nextFloat() < this.cornerHoleChance;
            }
        }
    }
}
