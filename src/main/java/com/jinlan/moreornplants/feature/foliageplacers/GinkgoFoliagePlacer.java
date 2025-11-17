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

import java.util.HashSet;
import java.util.Set;

public class GinkgoFoliagePlacer extends FoliagePlacer {
    public static final Codec<GinkgoFoliagePlacer> CODEC = RecordCodecBuilder.create((instance) -> foliagePlacerParts(instance).and(
            IntProvider.codec(0, 24).fieldOf("trunk_height").forGetter((placer) -> placer.trunkHeight)
    ).apply(instance, GinkgoFoliagePlacer::new));

    private final IntProvider trunkHeight;

    public GinkgoFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider trunkHeight) {
        super(radius, offset);
        this.trunkHeight = trunkHeight;
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return ModFoliagePlacerTypes.GINKGO_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader level, FoliageSetter blockSetter, RandomSource random,
                                 TreeConfiguration config, int maxFreeTreeHeight, FoliageAttachment attachment,
                                 int foliageHeight, int foliageRadius, int offset) {
        BlockPos center = attachment.pos();

        // 最顶层 - 半径0，只有一个方块
        this.placeLeavesRow(level, blockSetter, random, config, center, 0, offset, attachment.doubleTrunk());

        // 中间层 - 中上层（两层，半径1）
        createUpperMiddleLayer(level, blockSetter, random, config, center, offset - 1, attachment.doubleTrunk());
        createUpperMiddleLayer(level, blockSetter, random, config, center, offset - 2, attachment.doubleTrunk());

        // 中间层 - 中层（3-4层，半径2）
        int middleLayers = 4 + random.nextInt(2); // 4-5层
        for (int i = 0; i < middleLayers; i++) {
            createMiddleLayer(level, blockSetter, random, config, center, offset - 3 - i, attachment.doubleTrunk());
        }

        int middleLayerBottom = offset - 3 - middleLayers;

        // 中间层 - 中下层（两层，半径3）
        createLowerMiddleLayer(level, blockSetter, random, config, center, middleLayerBottom, attachment.doubleTrunk(), true);
        createLowerMiddleLayer(level, blockSetter, random, config, center, middleLayerBottom - 1, attachment.doubleTrunk(), false);

        // 最底层 - 半径1，不做特殊处理
        this.placeLeavesRow(level, blockSetter, random, config, center, 1, middleLayerBottom - 2, attachment.doubleTrunk());
    }

    private void createUpperMiddleLayer(LevelSimulatedReader level, FoliageSetter blockSetter, RandomSource random,
                                        TreeConfiguration config, BlockPos center, int y, boolean doubleTrunk) {
        // 半径1，跳过四个角
        Set<BlockPos> corners = new HashSet<>();
        corners.add(new BlockPos(1, 0, 1));
        corners.add(new BlockPos(1, 0, -1));
        corners.add(new BlockPos(-1, 0, 1));
        corners.add(new BlockPos(-1, 0, -1));

        for (int x = -1; x <= 1; x++) {
            for (int z = -1; z <= 1; z++) {
                BlockPos pos = new BlockPos(x, 0, z);
                if (!corners.contains(pos)) {
                    this.placeLeavesRow(level, blockSetter, random, config, center.offset(x, 0, z), 0, y, doubleTrunk);
                }
            }
        }
    }

    private void createMiddleLayer(LevelSimulatedReader level, FoliageSetter blockSetter, RandomSource random,
                                   TreeConfiguration config, BlockPos center, int y, boolean doubleTrunk) {
        // 半径2，跳过四个角，最边缘随机跳过
        for (int x = -2; x <= 2; x++) {
            for (int z = -2; z <= 2; z++) {

                int dist = Math.max(Math.abs(x), Math.abs(z));
                if (dist == 0) continue;

                // 跳过四个角
                if ((Math.abs(x) == 2 && Math.abs(z) == 2)) {
                    continue;
                }

                // 最边缘随机跳过（半径2的位置）
                if (dist == 2) {
                    if (random.nextFloat() < 0.6f) {
                        continue;
                    }
                }

                this.placeLeavesRow(level, blockSetter, random, config, center.offset(x, 0, z), 0, y, doubleTrunk);
            }
        }
    }

    private void createLowerMiddleLayer(LevelSimulatedReader level, FoliageSetter blockSetter, RandomSource random,
                                        TreeConfiguration config, BlockPos center, int y, boolean doubleTrunk, boolean isUpper) {
        // 半径2
        for (int x = -2; x <= 2; x++) {
            for (int z = -2; z <= 2; z++) {

                int dist = Math.max(Math.abs(x), Math.abs(z));
                if (dist == 0) continue;

                // 总是跳过四个角
                if ((Math.abs(x) == 2 && Math.abs(z) == 2)) {
                    continue;
                }

                if (isUpper) {
                    // 上层：跳过四个角和与角落相邻的位置
                    if ((Math.abs(x) == 2 && Math.abs(z) == 1) ||
                            (Math.abs(x) == 1 && Math.abs(z) == 2)) {
                        continue;
                    }
                } else {
                    // 下层：只跳过四个角，在四个边缘中心向外延伸
                    if (dist == 2) {
                        // 在四个边缘中心位置向外添加树叶
                        if (x == 0 && Math.abs(z) == 2) {
                            // 南北方向
                            this.placeLeavesRow(level, blockSetter, random, config, center.offset(0, 0, z > 0 ? 3 : -3), 0, y, doubleTrunk);
                        } else if (z == 0 && Math.abs(x) == 2) {
                            // 东西方向
                            this.placeLeavesRow(level, blockSetter, random, config, center.offset(x > 0 ? 3 : -3, 0, 0), 0, y, doubleTrunk);
                        }
                    }
                }

                this.placeLeavesRow(level, blockSetter, random, config, center.offset(x, 0, z), 0, y, doubleTrunk);
            }
        }
    }

    @Override
    public int foliageHeight(RandomSource random, int height, TreeConfiguration config) {
        return Math.max(4, height - this.trunkHeight.sample(random));
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource random, int localX, int localY, int localZ, int range, boolean large) {
        // 基础跳过逻辑 - 跳过角落
        return localX == range && localZ == range && range > 0;
    }
}