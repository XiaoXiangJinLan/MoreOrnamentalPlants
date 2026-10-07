package com.jinlan.moreornplants.feature.trunkplacers;

import com.jinlan.moreornplants.init.ModTrunkPlacerTypes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import org.jetbrains.annotations.NotNull;

public class AncientWisteriaTrunkPlacer extends AncientCamphorTrunkPlacer {
    public static final MapCodec<AncientWisteriaTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    Codec.intRange(0, 32).fieldOf("base_height").forGetter(placer -> placer.baseHeight),
                    Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter(placer -> placer.heightRandA),
                    Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter(placer -> placer.heightRandB),
                    Codec.intRange(2, 10).fieldOf("fork_height").forGetter(placer -> placer.forkHeight),
                    Codec.intRange(2, 4).fieldOf("min_branches").forGetter(placer -> placer.minBranches),
                    Codec.intRange(3, 6).fieldOf("max_branches").forGetter(placer -> placer.maxBranches),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("branch_chance").forGetter(placer -> placer.branchChance),
                    Codec.intRange(2, 10).fieldOf("branch_length").forGetter(placer -> placer.branchLength)
            ).apply(instance, AncientWisteriaTrunkPlacer::new)
    );
    public AncientWisteriaTrunkPlacer(int baseHeight, int heightRandA, int heightRandB, int forkHeight, int minBranches, int maxBranches, float branchChance, int branchLength) {
        super(baseHeight, heightRandA, heightRandB, forkHeight, minBranches, maxBranches, branchChance, branchLength);
    }


    @Override
    @NotNull
    protected TrunkPlacerType<?> type() {
        return ModTrunkPlacerTypes.ANCIENT_WISTERIA_TRUNK_PLACER.get();
    }

    @Override
    protected int getFoliageOffset() {
        return 1;
    }
}
