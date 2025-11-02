package com.quarztastic.goldfishboy.registry;

import net.minecraft.client.gui.components.Button;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class CitrineList {
    
    public static DeferredItem<Item> CITRINE_CRYSTAL;

    public static DeferredBlock<Block> CITRINE_ORE;
    public static DeferredItem<BlockItem> CITRINE_ORE_ITEM;


    public static DeferredBlock<Block> CITRINE_BLOCK;
    public static DeferredItem<BlockItem> CITRINE_BLOCK_ITEM;

    public static DeferredBlock<SlabBlock> CITRINE_SLAB;
    public static DeferredItem<BlockItem> CITRINE_SLAB_ITEM;

    public static DeferredBlock<StairBlock> CITRINE_STAIRS;
    public static DeferredItem<BlockItem> CITRINE_STAIRS_ITEM;


    public static DeferredBlock<ButtonBlock> CITRINE_BUTTON;
    public static DeferredItem<BlockItem> CITRINE_BUTTON_ITEM;

    public static DeferredBlock<Block> CITRINE_PRESSURE_PLATE;
    public static DeferredItem<BlockItem> CITRINE_PRESSURE_PLATE_ITEM;


    public static DeferredBlock<Block> CITRINE_BRICKS;
    public static DeferredItem<BlockItem> CITRINE_BRICKS_ITEM;
}
