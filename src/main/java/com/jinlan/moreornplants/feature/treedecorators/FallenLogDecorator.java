package com.jinlan.moreornplants.feature.treedecorators;

import com.jinlan.moreornplants.init.ModTreeDecoratorTypes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class FallenLogDecorator extends TreeDecorator {
    public static final Codec<FallenLogDecorator> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    BlockStateProvider.CODEC.fieldOf("log_provider").forGetter(d -> d.logProvider),
                    Codec.FLOAT.fieldOf("probability").orElse(0.35f).forGetter(d -> d.probability),
                    BlockStateProvider.CODEC.fieldOf("decorator_provider").forGetter(d -> d.decoratorProvider),
                    Codec.FLOAT.fieldOf("decorator_chance").orElse(0.5f).forGetter(d -> d.decoratorChance)
            ).apply(instance, FallenLogDecorator::new)
    );

    private final BlockStateProvider logProvider;
    private final float probability;
    private final BlockStateProvider decoratorProvider;
    private final float decoratorChance;

    public FallenLogDecorator(BlockStateProvider logProvider, float probability,
                              BlockStateProvider decoratorProvider, float decoratorChance) {
        this.logProvider = logProvider;
        this.probability = probability;
        this.decoratorProvider = decoratorProvider;
        this.decoratorChance = decoratorChance;
    }

    @Override
    protected @NotNull TreeDecoratorType<?> type() {
        return ModTreeDecoratorTypes.FALLEN_LOG_DECORATOR.get();
    }

    @Override
    public void place(Context context) {
        if (context.random().nextFloat() >= probability) {
            return;
        }

        LevelSimulatedReader level = context.level();
        RandomSource random = context.random();
        List<BlockPos> logs = context.logs();
        if (logs.isEmpty()) return;

        int baseGroundY = logs.stream().mapToInt(BlockPos::getY).min().orElse(logs.get(0).getY());
        BlockPos reference = logs.get(random.nextInt(logs.size()));

        for (int attempt = 0; attempt < 30; attempt++) {
            Direction.Axis axis = random.nextBoolean() ? Direction.Axis.X : Direction.Axis.Z;
            int length = 4 + random.nextInt(3);
            int offset = 2 + random.nextInt(5);
            int dx = axis == Direction.Axis.X ? offset * (random.nextBoolean() ? 1 : -1) : 0;
            int dz = axis == Direction.Axis.Z ? offset * (random.nextBoolean() ? 1 : -1) : 0;
            int yOffset = (2 + random.nextInt(4)) * (random.nextBoolean() ? 1 : -1);
            int groundY = baseGroundY + yOffset;
            BlockPos startPos = new BlockPos(reference.getX() + dx, groundY, reference.getZ() + dz);

            boolean allPlaceable = true;
            int supportedCount = 0;
            List<BlockPos> placedPositions = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                BlockPos pos = startPos.relative(axis == Direction.Axis.X ? Direction.EAST : Direction.SOUTH, i);

                boolean tooClose = logs.stream().anyMatch(log -> {
                    int dx2 = Math.abs(log.getX() - pos.getX());
                    int dz2 = Math.abs(log.getZ() - pos.getZ());
                    return dx2 + dz2 < 2;
                });
                if (tooClose) {
                    allPlaceable = false;
                    break;
                }

                if (!level.isStateAtPosition(pos, BlockState::isAir) &&
                        !level.isStateAtPosition(pos, BlockBehaviour.BlockStateBase::canBeReplaced)) {
                    allPlaceable = false;
                    break;
                }

                BlockPos below = pos.below();
                if (level.isStateAtPosition(below, state ->
                        state.is(BlockTags.DIRT) || state.is(BlockTags.BASE_STONE_OVERWORLD))) {
                    supportedCount++;
                }

            }

            if (allPlaceable && supportedCount >= 4) {
                BlockState logState = logProvider.getState(random, startPos);
                for (int i = 0; i < length; i++) {
                    BlockPos pos = startPos.relative(axis == Direction.Axis.X ? Direction.EAST : Direction.SOUTH, i);
                    BlockState finalState = logState.setValue(RotatedPillarBlock.AXIS, axis);
                    context.setBlock(pos, finalState);
                    placedPositions.add(pos);
                }
                if (decoratorProvider != null && decoratorChance > 0) {
                    for (BlockPos pos : placedPositions) {
                        if (random.nextFloat() < decoratorChance) {
                            BlockPos above = pos.above();
                            if (level.isStateAtPosition(above, BlockState::isAir)) {
                                BlockState decoratorState = decoratorProvider.getState(random, above);
                                context.setBlock(above, decoratorState);
                            }
                        }
                    }
                }
                return;
            }
        }
    }
}
