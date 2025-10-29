package com.quarztastic.goldfishboy.entity;

import com.quarztastic.goldfishboy.registry.RoseQuartzList;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.SmokerMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class RoseQuartzOvenEntity extends AbstractFurnaceBlockEntity {
    private static final Component DEFAULT_NAME = Component.translatable("container.rose_quartz_oven");
    
    private int lastScaledTotalTime = -1;

    public RoseQuartzOvenEntity(BlockPos pos, BlockState blockState) {
        super(RoseQuartzList.ROSE_QUARTZ_OVEN_ENTITY.get(), pos, blockState, RecipeType.SMOKING);
    }

    @Override
    protected Component getDefaultName() {
        return DEFAULT_NAME;
    }

    @Override
    protected AbstractContainerMenu createMenu(int id, Inventory player) {
        return new SmokerMenu(id, player, this, this.dataAccess);
    }
    

    public static void serverTick(ServerLevel level, BlockPos pos, BlockState state, RoseQuartzOvenEntity furnace) {
        for (int i = 0; i < 2; i++) {
            AbstractFurnaceBlockEntity.serverTick(level, pos, state, furnace);
        }
    }
}
