package com.quarztastic.goldfishboy.entity;

import com.quarztastic.goldfishboy.registry.PrasioliteQuartzList;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.SmokerMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class PrasioliteQuartzOvenEntity extends AbstractFurnaceBlockEntity {
    private static final Component DEFAULT_NAME = Component.translatable("container.prasiolite_quartz_oven");


    public PrasioliteQuartzOvenEntity(BlockPos pos, BlockState blockState) {
        super(PrasioliteQuartzList.PRASIOLITE_QUARTZ_OVEN_ENTITY.get(), pos, blockState, RecipeType.SMOKING);
    }

    @Override
    protected Component getDefaultName() {
        return DEFAULT_NAME;
    }

    @SuppressWarnings("null")
    @Override
    protected AbstractContainerMenu createMenu(int id, Inventory player) {
        return new SmokerMenu(id, player, this, this.dataAccess);
    }
    

    public static void serverTick(ServerLevel level, BlockPos pos, BlockState state, PrasioliteQuartzOvenEntity furnace) {
        for (int i = 0; i < 2; i++) {
            AbstractFurnaceBlockEntity.serverTick(level, pos, state, furnace);
        }
    }
}