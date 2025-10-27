package com.quarztastic.goldfishboy.block;

import javax.annotation.Nullable;

import com.mojang.serialization.MapCodec;
import com.quarztastic.goldfishboy.entity.SmokyQuartzBlastFurnaceEntity;
import com.quarztastic.goldfishboy.registry.SmokyQuartzList;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.util.RandomSource;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class SmokyQuartzBlastFurnaceBlock extends AbstractFurnaceBlock {
    public static final MapCodec<SmokyQuartzBlastFurnaceBlock> CODEC = simpleCodec(SmokyQuartzBlastFurnaceBlock::new);

    @Override
    public MapCodec<SmokyQuartzBlastFurnaceBlock> codec() {
        return CODEC;
    }

    public SmokyQuartzBlastFurnaceBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @SuppressWarnings("null")
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new SmokyQuartzBlastFurnaceEntity(pos, state);
    }

    @SuppressWarnings("null")
    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        if (level.isClientSide()) return null;
        if (blockEntityType != SmokyQuartzList.SMOKY_QUARTZ_BLAST_FURNACE_ENTITY.get()) return null;
        return (BlockEntityTicker<T>) (lvl, pos, st, entity) -> SmokyQuartzBlastFurnaceEntity.serverTick((ServerLevel) lvl, pos, st, (SmokyQuartzBlastFurnaceEntity) entity);
    }
    /**
     * Called to open this furnace's container.
     *
     * @see #use
     */
    @SuppressWarnings("null")
    @Override
    protected void openContainer(Level level, BlockPos pos, Player player) {
        BlockEntity blockentity = level.getBlockEntity(pos);
        if (blockentity instanceof SmokyQuartzBlastFurnaceEntity) {
            player.openMenu((MenuProvider)blockentity);
            player.awardStat(Stats.INTERACT_WITH_FURNACE);
        }
    }

    /**
     * Called periodically clientside on blocks near the player to show effects (like furnace fire particles).
     */
    @SuppressWarnings({ "null", "unused" })
    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (state.getValue(LIT)) {
            double d0 = pos.getX() + 0.5;
            double d1 = pos.getY();
            double d2 = pos.getZ() + 0.5;
            if (random.nextDouble() < 0.1) {
                level.playLocalSound(d0, d1, d2, SoundEvents.FURNACE_FIRE_CRACKLE, SoundSource.BLOCKS, 1.0F, 1.0F, false);
            }

            Direction direction = state.getValue(FACING);
            Direction.Axis direction$axis = direction.getAxis();
            double d3 = 0.52;
            double d4 = random.nextDouble() * 0.6 - 0.3;
            double d5 = direction$axis == Direction.Axis.X ? direction.getStepX() * 0.52 : d4;
            double d6 = random.nextDouble() * 6.0 / 16.0;
            double d7 = direction$axis == Direction.Axis.Z ? direction.getStepZ() * 0.52 : d4;
            level.addParticle(ParticleTypes.SMOKE, d0 + d5, d1 + d6, d2 + d7, 0.0, 0.0, 0.0);
            level.addParticle(ParticleTypes.FLAME, d0 + d5, d1 + d6, d2 + d7, 0.0, 0.0, 0.0);
        }
    }
}