package com.jinlan.moreornplants.feature.BambooFeatures;

import com.jinlan.moreornplants.block.BambooBlocks.MottledBambooStalkBlock;
import com.jinlan.moreornplants.block.ModBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BambooLeaves;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.ProbabilityFeatureConfiguration;

public class MottledBambooFeature extends Feature<ProbabilityFeatureConfiguration> {
    private static final BlockState MOTTLED_BAMBOO_TRUNK = ModBlocks.MOTTLED_BAMBOO.get().defaultBlockState().setValue(MottledBambooStalkBlock.AGE, 1).setValue(MottledBambooStalkBlock.LEAVES, BambooLeaves.NONE).setValue(MottledBambooStalkBlock.STAGE, 0);
    private static final BlockState MOTTLED_BAMBOO_FINAL_LARGE = MOTTLED_BAMBOO_TRUNK.setValue(MottledBambooStalkBlock.LEAVES, BambooLeaves.LARGE).setValue(MottledBambooStalkBlock.STAGE, 1);
    private static final BlockState MOTTLED_BAMBOO_TOP_LARGE = MOTTLED_BAMBOO_TRUNK.setValue(MottledBambooStalkBlock.LEAVES, BambooLeaves.LARGE);
    private static final BlockState MOTTLED_BAMBOO_TOP_SMALL = MOTTLED_BAMBOO_TRUNK.setValue(MottledBambooStalkBlock.LEAVES, BambooLeaves.SMALL);

    public MottledBambooFeature(Codec<ProbabilityFeatureConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<ProbabilityFeatureConfiguration> context) {
        int i = 0;
        BlockPos origin = context.origin();
        WorldGenLevel level = context.level();
        RandomSource random = context.random();

        BlockPos.MutableBlockPos mutablePos = origin.mutable();

        if (level.isEmptyBlock(mutablePos)) {
            if (ModBlocks.MOTTLED_BAMBOO.get().defaultBlockState().canSurvive(level, mutablePos)) {
                int height = random.nextInt(12) + 5;

                for (int h = 0; h < height && level.isEmptyBlock(mutablePos); ++h) {
                    level.setBlock(mutablePos, MOTTLED_BAMBOO_TRUNK, 2);
                    mutablePos.move(Direction.UP, 1);
                }

                if (mutablePos.getY() - origin.getY() >= 3) {
                    level.setBlock(mutablePos, MOTTLED_BAMBOO_FINAL_LARGE, 2);
                    level.setBlock(mutablePos.move(Direction.DOWN, 1), MOTTLED_BAMBOO_TOP_LARGE, 2);
                    level.setBlock(mutablePos.move(Direction.DOWN, 1), MOTTLED_BAMBOO_TOP_SMALL, 2);
                }
            }

            return true;
        }

        return false;
    }
}