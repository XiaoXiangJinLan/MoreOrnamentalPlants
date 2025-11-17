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

public class UprightCrabappleFoliagePlacer extends FoliagePlacer {
    public static final Codec<UprightCrabappleFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            foliagePlacerParts(instance).and(instance.group(
                    IntProvider.codec(3, 8).fieldOf("height").forGetter((placer) -> placer.height),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("density").forGetter((placer) -> placer.density)
            )).apply(instance, UprightCrabappleFoliagePlacer::new)
    );

    private final IntProvider height;
    private final float density;

    public UprightCrabappleFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider height,
                                         float density) {
        super(radius, offset);
        this.height = height;
        this.density = density;
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return ModFoliagePlacerTypes.UPRIGHT_CRABAPPLE_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader level, FoliageSetter foliageSetter, RandomSource random,
                                 TreeConfiguration config, int maxFreeTreeHeight, FoliageAttachment attachment,
                                 int foliageHeight, int foliageRadius, int offset) {
        BlockPos centerPos = attachment.pos().above(offset);
        int radius = foliageRadius + attachment.radiusOffset();

        createBouquetCrown(level, foliageSetter, random, config, centerPos, radius, foliageHeight);
    }

    @Override
    public int foliageHeight(RandomSource random, int trunkHeight, TreeConfiguration config) {
        return this.height.sample(random);
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource random, int localX, int localY, int localZ, int range, boolean large) {
        if (localY >= 0) {
            return random.nextFloat() > this.density;
        } else {
            return random.nextFloat() > (this.density * 0.8F);
        }
    }

    private void createBouquetCrown(LevelSimulatedReader level, FoliageSetter foliageSetter, RandomSource random,
                                    TreeConfiguration config, BlockPos centerPos, int radius, int foliageHeight) {
        createRoundedTop(level, foliageSetter, random, config, centerPos.above(foliageHeight), radius);
        for (int yOffset = foliageHeight - 1; yOffset >= foliageHeight / 2; yOffset--) {
            int currentRadius = radius;
            if (yOffset == foliageHeight - 1) {
                currentRadius = radius - 1;
            }
            this.placeLeavesRow(level, foliageSetter, random, config, centerPos, currentRadius, yOffset, false);
        }

        for (int yOffset = (foliageHeight / 2) - 1; yOffset >= 0; yOffset--) {
            int currentRadius = Math.max(1, radius - 1);
            this.placeLeavesRow(level, foliageSetter, random, config, centerPos, currentRadius, yOffset, false);
        }

        addOuterLeaves(level, foliageSetter, random, config, centerPos, radius, foliageHeight);
    }

    private void createRoundedTop(LevelSimulatedReader level, FoliageSetter foliageSetter, RandomSource random,
                                  TreeConfiguration config, BlockPos topPos, int radius) {
        foliageSetter.set(topPos, config.foliageProvider.getState(random, topPos));

        for (int xOffset = -radius; xOffset <= radius; xOffset++) {
            for (int zOffset = -radius; zOffset <= radius; zOffset++) {
                double distance = Math.sqrt(xOffset * xOffset + zOffset * zOffset);

                if (distance <= radius && random.nextFloat() < this.density) {
                    BlockPos leafPos = topPos.offset(xOffset, 0, zOffset);
                    if (level.isStateAtPosition(leafPos, state -> state.canBeReplaced())) {
                        foliageSetter.set(leafPos, config.foliageProvider.getState(random, leafPos));
                    }
                }
            }
        }

        BlockPos belowTop = topPos.below();
        for (int xOffset = -radius; xOffset <= radius; xOffset++) {
            for (int zOffset = -radius; zOffset <= radius; zOffset++) {
                double distance = Math.sqrt(xOffset * xOffset + zOffset * zOffset);
                if (distance <= radius && random.nextFloat() < this.density * 0.9F) {
                    BlockPos leafPos = belowTop.offset(xOffset, 0, zOffset);
                    if (level.isStateAtPosition(leafPos, state -> state.canBeReplaced())) {
                        foliageSetter.set(leafPos, config.foliageProvider.getState(random, leafPos));
                    }
                }
            }
        }
    }

    private void addOuterLeaves(LevelSimulatedReader level, FoliageSetter foliageSetter, RandomSource random,
                                TreeConfiguration config, BlockPos centerPos, int radius, int foliageHeight) {
        for (int yOffset = foliageHeight / 2; yOffset < foliageHeight; yOffset++) {
            for (int i = 0; i < 3; i++) {
                double angle = random.nextDouble() * 2 * Math.PI;
                double distance = radius + random.nextDouble() * 2;

                int xOffset = (int) (Math.cos(angle) * distance);
                int zOffset = (int) (Math.sin(angle) * distance);

                BlockPos leafPos = centerPos.offset(xOffset, yOffset, zOffset);
                if (level.isStateAtPosition(leafPos, state -> state.canBeReplaced())) {
                    foliageSetter.set(leafPos, config.foliageProvider.getState(random, leafPos));
                }
            }
        }
    }
}
