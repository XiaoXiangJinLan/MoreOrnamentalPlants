package com.jinlan.moreornplants.block;

import com.jinlan.moreornplants.init.ModParticleTypes;
import com.jinlan.moreornplants.util.ModTags;
import com.jinlan.moreornplants.worldgen.dimension.ModDimension;
import com.jinlan.moreornplants.worldgen.dimension.PortalAnchorData;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraftforge.common.util.ITeleporter;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;
import java.util.function.Function;

public class QunfangPortalBlock extends HorizontalDirectionalBlock {
    public QunfangPortalBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public void entityInside(@NotNull BlockState state, @NotNull Level level,
                                @NotNull BlockPos pos, @NotNull Entity entity) {
        if (level.isClientSide) return;
        if (!entity.canChangeDimensions()) return;
        if (entity.isOnPortalCooldown()) return;

        // 准入检查
        if (entity instanceof Player player) {
            boolean hasFlower = player.getMainHandItem().is(ItemTags.FLOWERS)
                    || player.getOffhandItem().is(ItemTags.FLOWERS);
            if (!hasFlower) return;
        } else {
            if (!entity.getType().is(ModTags.EntityTypes.QUNFANG_ALLOWED)) return;
        }

        teleport(entity, (ServerLevel) level);
    }

    private static final class QunfangTeleporter implements ITeleporter {
        private final BlockPos destination;

        QunfangTeleporter(BlockPos destination) {
            this.destination = destination;
        }

        @Override
        public Entity placeEntity(Entity entity, ServerLevel currentWorld, ServerLevel destWorld,
                                  float yaw, Function<Boolean, Entity> repositionEntity) {
            // repositionEntity.apply(false) 会返回迁移到目标维度后的实体
            Entity newEntity = repositionEntity.apply(false);
            newEntity.moveTo(
                    destination.getX() + 0.5,
                    destination.getY(),
                    destination.getZ() + 0.5,
                    newEntity.getYRot(),
                    newEntity.getXRot()
            );
            return newEntity;
        }
    }

    private void teleport(Entity entity, ServerLevel level) {
        boolean isInQunfang = level.dimension().equals(ModDimension.THE_QUNFANG_LEVEL);
        ResourceKey<Level> targetKey = isInQunfang
                ? Level.OVERWORLD
                : ModDimension.THE_QUNFANG_LEVEL;

        ServerLevel targetLevel = level.getServer().getLevel(targetKey);
        if (targetLevel == null) return;

        PortalAnchorData data = PortalAnchorData.get(level);
        UUID id = entity.getUUID();

        BlockPos destination;
        if (isInQunfang) {
            data.setQunfangAnchor(id, entity.blockPosition());
            BlockPos anchor = data.getOverworldAnchor(id);
            ServerLevel overworld = level.getServer().overworld();
            destination = anchor != null
                    ? findSafePosition(overworld, anchor, entity)
                    : overworld.getSharedSpawnPos();
        } else {
            data.setOverworldAnchor(id, entity.blockPosition());
            BlockPos anchor = data.getQunfangAnchor(id);
            destination = anchor != null
                    ? findSafePosition(targetLevel, anchor, entity)
                    : targetLevel.getSharedSpawnPos();
        }

        entity.setPortalCooldown(80);

        level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                SoundEvents.PORTAL_TRAVEL, SoundSource.BLOCKS, 0.5F, 1.0F);

        entity.changeDimension(targetLevel, new QunfangTeleporter(destination));

        if (entity instanceof ServerPlayer player) {
            player.connection.teleport(
                    destination.getX() + 0.5,
                    destination.getY(),
                    destination.getZ() + 0.5,
                    player.getYRot(),
                    player.getXRot());
        }
    }

    private static BlockPos findSafePosition(ServerLevel level, BlockPos target, Entity entity) {
        if (isSafe(level, target)) return target;

        for (int r = 1; r <= 3; r++) {
            for (int dy = 0; dy <= 3; dy++) {
                for (int dx = -r; dx <= r; dx++) {
                    for (int dz = -r; dz <= r; dz++) {
                        if (Math.abs(dx) != r && Math.abs(dz) != r) continue;
                        BlockPos candidate = target.offset(dx, dy, dz);
                        if (isSafe(level, candidate)) return candidate;
                    }
                }
            }
        }
        return level.getSharedSpawnPos();
    }

    private static boolean isSafe(ServerLevel level, BlockPos pos) {
        if (pos.getY() <= level.getMinBuildHeight() + 1
                || pos.getY() >= level.getMaxBuildHeight() - 1) {
            return false;
        }
        BlockPos below = pos.below();
        BlockState belowState = level.getBlockState(below);
        BlockState atState    = level.getBlockState(pos);
        BlockState aboveState = level.getBlockState(pos.above());

        boolean standable = belowState.isFaceSturdy(level, below, Direction.UP);
        boolean bodyFree  = atState.getCollisionShape(level, pos).isEmpty();
        boolean headFree  = aboveState.getCollisionShape(level, pos.above()).isEmpty();
        boolean noFluid   = level.getFluidState(pos).isEmpty()
                && level.getFluidState(pos.above()).isEmpty();

        return standable && bodyFree && headFree && noFluid;
    }

    @Override
    public void animateTick(@NotNull BlockState state, @NotNull Level level,
                            @NotNull BlockPos pos, @NotNull RandomSource random) {
        if (random.nextInt(100) == 0) {
            level.playLocalSound(
                    pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
                    SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS,
                    0.5F, random.nextFloat() * 0.4F + 0.8F, false);
        }

        Direction back = state.getValue(FACING).getOpposite();

        double xMin = pos.getX();
        double xMax = pos.getX() + 1.0;
        double zMin = pos.getZ();
        double zMax = pos.getZ() + 1.0;

        if (back.getStepX() > 0) {
            xMin = pos.getX() + 0.5;
        } else if (back.getStepX() < 0) {
            xMax = pos.getX() + 0.5;
        } else if (back.getStepZ() > 0) {
            zMin = pos.getZ() + 0.5;
        } else if (back.getStepZ() < 0) {
            zMax = pos.getZ() + 0.5;
        }

        for (int i = 0; i < 1; i++) {
            double x = xMin + random.nextDouble() * (xMax - xMin);
            double y = pos.getY() + random.nextDouble();
            double z = zMin + random.nextDouble() * (zMax - zMin);

            double vx = (random.nextFloat() - 0.5) * 0.5;
            double vy = (random.nextFloat() - 0.5) * 0.5;
            double vz = (random.nextFloat() - 0.5) * 0.5;

            level.addParticle(ModParticleTypes.BAIHUA_CAT.get(), x, y, z, vx, vy, vz);
        }
    }
}
