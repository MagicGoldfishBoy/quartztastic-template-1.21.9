package com.quarztastic.goldfishboy.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class BlueQuartzList {

    public static DeferredItem<Item> BLUE_QUARTZ_CRYSTAL;

    
    public static DeferredBlock<Block> BLUE_QUARTZ_ORE;

    public static DeferredItem<BlockItem> BLUE_QUARTZ_ORE_ITEM;


    public static DeferredBlock<Block> BLUE_QUARTZ_BLOCK;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_BLOCK_ITEM;

    public static DeferredBlock<SlabBlock> BLUE_QUARTZ_SLAB;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_SLAB_ITEM;

    public static DeferredBlock<StairBlock> BLUE_QUARTZ_STAIRS;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_STAIRS_ITEM;
}
