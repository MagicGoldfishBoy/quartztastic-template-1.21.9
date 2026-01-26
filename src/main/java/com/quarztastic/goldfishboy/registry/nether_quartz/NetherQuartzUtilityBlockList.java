package com.quarztastic.goldfishboy.registry.nether_quartz;

import java.util.function.Supplier;

import com.quarztastic.goldfishboy.block.NetherQuartzBlastFurnaceBlock;
import com.quarztastic.goldfishboy.block.crafting_tables.NetherQuartzCraftingTable;
import com.quarztastic.goldfishboy.block.furnaces.NetherQuartzFurnaceBlock;
import com.quarztastic.goldfishboy.block.ovens.NetherQuartzOvenBlock;
import com.quarztastic.goldfishboy.entity.NetherQuartzBlastFurnaceEntity;
import com.quarztastic.goldfishboy.entity.NetherQuartzFurnaceEntity;
import com.quarztastic.goldfishboy.entity.NetherQuartzOvenEntity;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class NetherQuartzUtilityBlockList {

    public static DeferredBlock<NetherQuartzFurnaceBlock> NETHER_QUARTZ_FURNACE;
    public static Supplier<BlockEntityType<NetherQuartzFurnaceEntity>> NETHER_QUARTZ_FURNACE_ENTITY;
    public static DeferredItem<BlockItem> NETHER_QUARTZ_FURNACE_ITEM;
    
    public static DeferredBlock<NetherQuartzOvenBlock> NETHER_QUARTZ_OVEN;
    public static Supplier<BlockEntityType<NetherQuartzOvenEntity>> NETHER_QUARTZ_OVEN_ENTITY;
    public static DeferredItem<BlockItem> NETHER_QUARTZ_OVEN_ITEM;

    public static DeferredBlock<NetherQuartzBlastFurnaceBlock> NETHER_QUARTZ_BLAST_FURNACE;
    public static Supplier<BlockEntityType<NetherQuartzBlastFurnaceEntity>> NETHER_QUARTZ_BLAST_FURNACE_ENTITY;
    public static DeferredItem<BlockItem> NETHER_QUARTZ_BLAST_FURNACE_ITEM;

    public static DeferredBlock<NetherQuartzCraftingTable> NETHER_QUARTZ_CRAFTING_TABLE;
    public static DeferredItem<BlockItem> NETHER_QUARTZ_CRAFTING_TABLE_ITEM;
}
