package com.quarztastic.goldfishboy.entity;

import com.quarztastic.goldfishboy.registry.BlueQuartzList;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.FurnaceMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlueQuartzFurnaceEntity extends AbstractFurnaceBlockEntity {

    private static final Component DEFAULT_NAME = Component.translatable("container.blue_quartz_furnace");
    
    public BlueQuartzFurnaceEntity(BlockPos pos, BlockState blockState) {
        super(BlueQuartzList.BLUE_QUARTZ_FURNACE_ENTITY.get(), pos, blockState, RecipeType.SMELTING);
    }
    
    @Override
    protected Component getDefaultName() {
        return DEFAULT_NAME;
    }
    
    @SuppressWarnings("null")
    @Override
    protected AbstractContainerMenu createMenu(int id, Inventory player) {
        return new FurnaceMenu(id, player, this, this.dataAccess);
    }
    
    public static void serverTick(ServerLevel level, BlockPos pos, BlockState state, BlueQuartzFurnaceEntity furnace) {
        for (int i = 0; i < 2; i++) {
            AbstractFurnaceBlockEntity.serverTick(level, pos, state, furnace);
        }
    }
}
