package com.quarztastic.goldfishboy.block;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class OreBlock extends Block {

    public OreBlock(Properties properties) {
        super(properties);
    }

    public void playerDestroy(@Nonnull Level level, @Nonnull Player player, @Nonnull BlockPos pos, @Nonnull BlockState state, @Nullable BlockEntity blockEntity, @Nonnull ItemStack tool) {
        player.awardStat(Stats.BLOCK_MINED.get(this));
        player.causeFoodExhaustion(0.005F);
        
        if (level instanceof ServerLevel) {
            ExperienceOrb.award((ServerLevel)level, Vec3.atCenterOf(pos), 4);
        }
        player.causeFoodExhaustion(0.005F);
        
        dropResources(state, level, pos, blockEntity, player, tool);
    }
    
}
//player.giveExperiencePoints(5);