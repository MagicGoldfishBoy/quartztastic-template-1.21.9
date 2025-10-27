package com.quarztastic.goldfishboy.block;

import javax.annotation.Nullable;

import com.mojang.serialization.MapCodec;
import com.quarztastic.goldfishboy.entity.SmokyQuartzOvenEntity;
import com.quarztastic.goldfishboy.registry.SmokyQuartzList;

import net.minecraft.core.BlockPos;
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

public class SmokyQuartzOvenBlock extends AbstractFurnaceBlock {
    public static final MapCodec<SmokyQuartzOvenBlock> CODEC = simpleCodec(SmokyQuartzOvenBlock::new);

    @Override
    public MapCodec<SmokyQuartzOvenBlock> codec() {
        return CODEC;
    }

    public SmokyQuartzOvenBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new SmokyQuartzOvenEntity(pos, state);
    }
    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        if (level.isClientSide()) return null;
        if (blockEntityType != SmokyQuartzList.SMOKY_QUARTZ_OVEN_ENTITY.get()) return null;
        return (BlockEntityTicker<T>) (lvl, pos, st, entity) -> SmokyQuartzOvenEntity.serverTick((ServerLevel) lvl, pos, st, (SmokyQuartzOvenEntity) entity);
    }

    @Override
    protected void openContainer(Level level, BlockPos pos, Player player) {
        BlockEntity blockentity = level.getBlockEntity(pos);
        if (blockentity instanceof SmokyQuartzOvenEntity) {
            player.openMenu((MenuProvider)blockentity);
            player.awardStat(Stats.INTERACT_WITH_SMOKER);
        }
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (state.getValue(LIT)) {
            double d0 = pos.getX() + 0.5;
            double d1 = pos.getY();
            double d2 = pos.getZ() + 0.5;
            if (random.nextDouble() < 0.1) {
                level.playLocalSound(d0, d1, d2, SoundEvents.SMOKER_SMOKE, SoundSource.BLOCKS, 1.0F, 1.0F, false);
            }

            level.addParticle(ParticleTypes.SMOKE, d0, d1 + 1.1, d2, 0.0, 0.0, 0.0);
        }
    }
}
