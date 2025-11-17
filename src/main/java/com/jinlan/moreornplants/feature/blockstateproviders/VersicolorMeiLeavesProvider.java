package com.jinlan.moreornplants.feature.blockstateproviders;

import com.jinlan.moreornplants.init.ModBlockStateProviderTypes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProviderType;

public class VersicolorMeiLeavesProvider extends BlockStateProvider {
    public static final Codec<VersicolorMeiLeavesProvider> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    BlockStateProvider.CODEC.fieldOf("primary_leaves").forGetter(provider -> provider.primaryLeaves),
                    BlockStateProvider.CODEC.fieldOf("secondary_leaves").forGetter(provider -> provider.secondaryLeaves),
                    BlockStateProvider.CODEC.fieldOf("tertiary_leaves").forGetter(provider -> provider.tertiaryLeaves),
                    Codec.intRange(1, 100).fieldOf("primary_weight").forGetter(provider -> provider.primaryWeight),
                    Codec.intRange(1, 100).fieldOf("secondary_weight").forGetter(provider -> provider.secondaryWeight),
                    Codec.intRange(1, 100).fieldOf("tertiary_weight").forGetter(provider -> provider.tertiaryWeight)
            ).apply(instance, VersicolorMeiLeavesProvider::new)
    );

    private final BlockStateProvider primaryLeaves;
    private final BlockStateProvider secondaryLeaves;
    private final BlockStateProvider tertiaryLeaves;
    private final int primaryWeight;
    private final int secondaryWeight;
    private final int tertiaryWeight;
    private final int totalWeight;

    public VersicolorMeiLeavesProvider(BlockStateProvider primaryLeaves, BlockStateProvider secondaryLeaves,
                                       BlockStateProvider tertiaryLeaves, int primaryWeight, int secondaryWeight,
                                       int tertiaryWeight) {
        this.primaryLeaves = primaryLeaves;
        this.secondaryLeaves = secondaryLeaves;
        this.tertiaryLeaves = tertiaryLeaves;
        this.primaryWeight = primaryWeight;
        this.secondaryWeight = secondaryWeight;
        this.tertiaryWeight = tertiaryWeight;
        this.totalWeight = primaryWeight + secondaryWeight + tertiaryWeight;
    }

    @Override
    protected BlockStateProviderType<?> type() {
        // 需要在ModBlockStateProviderTypes中注册这个类型
        return ModBlockStateProviderTypes.VERSICOLOR_MEI_LEAVES_PROVIDER.get();
    }

    @Override
    public BlockState getState(RandomSource random, BlockPos pos) {
        int randomValue = random.nextInt(totalWeight);

        if (randomValue < primaryWeight) {
            return primaryLeaves.getState(random, pos);
        } else if (randomValue < primaryWeight + secondaryWeight) {
            return secondaryLeaves.getState(random, pos);
        } else {
            return tertiaryLeaves.getState(random, pos);
        }
    }
}
