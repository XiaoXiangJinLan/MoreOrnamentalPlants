package com.jinlan.moreornplants.block.FlowerBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class WaterLotusBlock extends DoublePlantBlock implements SimpleWaterloggedBlock, BonemealableBlock {
    private static final VoxelShape LOWER_SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);
    private static final VoxelShape UPPER_SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;

    public WaterLotusBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(HALF, DoubleBlockHalf.LOWER).setValue(WATERLOGGED, true).setValue(AGE, 0));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(WATERLOGGED, AGE);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());
        BlockPos pos = context.getClickedPos();

        // 检查：必须在水源中，且上方可放置
        if (pos.getY() < context.getLevel().getMaxBuildHeight() - 1 &&
                fluidState.is(Fluids.WATER) &&
                fluidState.getAmount() == 8 &&
                context.getLevel().getBlockState(pos.above()).canBeReplaced(context)) {
            return this.defaultBlockState()
                    .setValue(HALF, DoubleBlockHalf.LOWER)
                    .setValue(WATERLOGGED, true)
                    .setValue(AGE, 0);
        }
        return null;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        Vec3 vec3 = state.getOffset(level, pos);
        VoxelShape shape = state.getValue(HALF) == DoubleBlockHalf.LOWER ? LOWER_SHAPE : UPPER_SHAPE;
        return shape.move(vec3.x, vec3.y, vec3.z);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        if (state.getValue(HALF) == DoubleBlockHalf.LOWER) {
            BlockState existingState = level.getBlockState(pos);
            BlockPos belowPos = pos.below();
            BlockState belowState = level.getBlockState(belowPos);

            return (existingState.getBlock() == this || existingState.getFluidState().is(Fluids.WATER))
                    && this.isExposed(level, pos.above())
                    && (belowState.is(BlockTags.DIRT)
                    || belowState.is(BlockTags.SAND)
                    || belowState.is(Blocks.CLAY)
                    || belowState.is(Blocks.GRAVEL)
                    || belowState.is(Blocks.SUSPICIOUS_GRAVEL)
                    || belowState.is(Blocks.FARMLAND));
        } else {
            // 上半部分：检查下方是否是荷花的下半部分且含水
            BlockState belowState = level.getBlockState(pos.below());
            return belowState.is(this)
                    && belowState.getValue(HALF) == DoubleBlockHalf.LOWER
                    && belowState.getValue(WATERLOGGED)
                    && this.isExposed(level, pos);
        }
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
        // 放置上半部分（强制不含水）
        BlockPos abovePos = pos.above();
        BlockState aboveState = this.defaultBlockState()
                .setValue(HALF, DoubleBlockHalf.UPPER)
                .setValue(WATERLOGGED, false)
                .setValue(AGE, state.getValue(AGE));
        level.setBlock(abovePos, aboveState, 3);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        int age = state.getValue(AGE);
        if (age < 3) {
            float growthSpeed = getGrowthSpeed(level, pos);
            if (net.minecraftforge.common.ForgeHooks.onCropsGrowPre(level, pos, state, random.nextInt((int)(25.0F / growthSpeed) + 1) == 0)) {
                int newAge = age + 1;
                growPlant(level, pos, state, newAge);
                net.minecraftforge.common.ForgeHooks.onCropsGrowPost(level, pos, state);
            }
        }
    }

    protected float getGrowthSpeed(ServerLevel level, BlockPos pos) {
        float speed = 1.0F;
        BlockPos belowPos = pos.below();
        BlockState belowState = level.getBlockState(belowPos);

        if (belowState.is(Blocks.FARMLAND)) {
            if (belowState.getValue(FarmBlock.MOISTURE) >= FarmBlock.MAX_MOISTURE) {
                speed = 3.0F;
            }
        }

        return speed;
    }

    protected void growPlant(ServerLevel level, BlockPos pos, BlockState state, int newAge) {
        if (state.getValue(HALF) == DoubleBlockHalf.LOWER) {
            // 生长下半部分
            BlockState newState = state.setValue(AGE, newAge);
            level.setBlock(pos, newState, 3);

            // 同时生长上半部分
            BlockPos abovePos = pos.above();
            BlockState aboveState = level.getBlockState(abovePos);
            if (aboveState.is(this)) {
                level.setBlock(abovePos, aboveState.setValue(AGE, newAge), 3);
            }

        } else {
            // 如果是上半部分，生长下半部分
            BlockPos belowPos = pos.below();
            BlockState belowState = level.getBlockState(belowPos);
            if (belowState.is(this)) {
                BlockState newBelowState = belowState.setValue(AGE, newAge);
                level.setBlock(belowPos, newBelowState, 3);
                level.setBlock(pos, state.setValue(AGE, newAge), 3);
            }
        }
    }

    // 确保方块被随机刻更新
    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return state.getValue(AGE) < 3; // 只有未完全成熟时才会随机刻
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state, boolean isClient) {
        return state.getValue(AGE) < 3;
    }

    @Override
    public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
        return true; // 骨粉总是成功
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        int currentAge = state.getValue(AGE);
        if (currentAge < 3) {
            // 骨粉增加1-2个阶段
            int growth = random.nextInt(2) + 1; // 1或2
            int newAge = Math.min(currentAge + growth, 3);

            growPlant(level, pos, state, newAge);
        }
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState,
                                  LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        // 处理含水逻辑
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }

        // 如果无法存活，返回空气
        if (direction == Direction.DOWN && !state.canSurvive(level, pos)) {
            return Blocks.AIR.defaultBlockState();
        }

        return super.updateShape(state, direction, neighborState, level, pos, neighborPos);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    protected boolean isExposed(LevelReader level, BlockPos pos) {
        BlockState state = level.getBlockState(pos);
        // 如果是荷花，检查是否含水（上半部分不应含水）
        if (state.is(this)) {
            return !state.getValue(WATERLOGGED);
        }
        // 否则必须是空气
        return level.isEmptyBlock(pos);
    }
}
