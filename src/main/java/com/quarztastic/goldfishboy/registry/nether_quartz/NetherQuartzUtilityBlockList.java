package com.quarztastic.goldfishboy.registry.nether_quartz;

import java.util.function.Supplier;

import com.quarztastic.goldfishboy.block.furnaces.NetherQuartzFurnaceBlock;
import com.quarztastic.goldfishboy.entity.NetherQuartzFurnaceEntity;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class NetherQuartzUtilityBlockList {

    public static DeferredBlock<NetherQuartzFurnaceBlock> NETHER_QUARTZ_FURNACE;
    public static Supplier<BlockEntityType<NetherQuartzFurnaceEntity>> NETHER_QUARTZ_FURNACE_ENTITY;
    public static DeferredItem<BlockItem> NETHER_QUARTZ_FURNACE_ITEM;
    
}
