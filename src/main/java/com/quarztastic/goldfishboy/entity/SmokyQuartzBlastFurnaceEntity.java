package com.quarztastic.goldfishboy.entity;

import java.util.logging.Logger;

import com.mojang.logging.LogUtils;
import com.quarztastic.goldfishboy.registry.smoky_quartz.SmokyQuartzList;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.BlastFurnaceMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SmokyQuartzBlastFurnaceEntity extends AbstractFurnaceBlockEntity {

    private static final Component DEFAULT_NAME = Component.translatable("container.smoky_quartz_blast_furnace");
    
    public SmokyQuartzBlastFurnaceEntity(BlockPos pos, BlockState blockState) {
        super(SmokyQuartzList.SMOKY_QUARTZ_BLAST_FURNACE_ENTITY.get(), pos, blockState, RecipeType.BLASTING);
    }
    
    @Override
    protected Component getDefaultName() {
        return DEFAULT_NAME;
    }
    
    @SuppressWarnings("null")
    @Override
    protected AbstractContainerMenu createMenu(int id, Inventory player) {
        return new BlastFurnaceMenu(id, player, this, this.dataAccess);
    }
    
    public static void serverTick(ServerLevel level, BlockPos pos, BlockState state, SmokyQuartzBlastFurnaceEntity furnace) {
        for (int i = 0; i < 2; i++) {
            AbstractFurnaceBlockEntity.serverTick(level, pos, state, furnace);
        }
    }
}