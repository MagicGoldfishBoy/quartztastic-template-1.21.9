package com.quarztastic.goldfishboy.registry.nether_quartz;

import java.util.function.Supplier;

import com.quarztastic.goldfishboy.block.Chair;
import com.quarztastic.goldfishboy.block.Shelf;
import com.quarztastic.goldfishboy.block.NetherQuartzBarrelBlock;
import com.quarztastic.goldfishboy.block.Table;
import com.quarztastic.goldfishboy.entity.NetherQuartzBarrelEntity;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class NetherQuartzFurnitureBlockList {

    public static DeferredBlock<Chair> NETHER_QUARTZ_CHAIR;
    public static DeferredItem<BlockItem> NETHER_QUARTZ_CHAIR_ITEM;

    public static DeferredBlock<Table> NETHER_QUARTZ_TABLE;
    public static DeferredItem<BlockItem> NETHER_QUARTZ_TABLE_ITEM;

    public static DeferredBlock<Shelf> NETHER_QUARTZ_SHELF;
    public static DeferredItem<BlockItem> NETHER_QUARTZ_SHELF_ITEM;

    public static DeferredBlock<NetherQuartzBarrelBlock> NETHER_QUARTZ_BARREL_BLOCK;
    public static Supplier<BlockEntityType<NetherQuartzBarrelEntity>> NETHER_QUARTZ_BARREL_ENTITY;
    public static DeferredItem<BlockItem> NETHER_QUARTZ_BARREL_ITEM;

}
