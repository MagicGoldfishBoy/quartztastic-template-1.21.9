package com.quarztastic.goldfishboy.registry;

import java.util.function.Supplier;

import com.quarztastic.goldfishboy.block.OreBlock;
import com.quarztastic.goldfishboy.block.Pillar;
import com.quarztastic.goldfishboy.block.BlueQuartzBlastFurnaceBlock;
import com.quarztastic.goldfishboy.block.BlueQuartzOvenBlock;
import com.quarztastic.goldfishboy.block.Chair;
import com.quarztastic.goldfishboy.block.BlueQuartzFurnaceBlock;
import com.quarztastic.goldfishboy.entity.BlueQuartzFurnaceEntity;
import com.quarztastic.goldfishboy.entity.BlueQuartzOvenEntity;
import com.quarztastic.goldfishboy.entity.BlueQuartzBlastFurnaceEntity;
import com.quarztastic.goldfishboy.entity.BlueQuartzFurnaceEntity;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class BlueQuartzList {

    public static DeferredItem<Item> BLUE_QUARTZ_CRYSTAL;

    
    public static DeferredBlock<OreBlock> BLUE_QUARTZ_ORE;

    public static DeferredItem<BlockItem> BLUE_QUARTZ_ORE_ITEM;


    public static DeferredBlock<Block> BLUE_QUARTZ_BLOCK;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_BLOCK_ITEM;

    public static DeferredBlock<IronBarsBlock> BLUE_QUARTZ_PANE;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_PANE_ITEM;

    public static DeferredBlock<SlabBlock> BLUE_QUARTZ_SLAB;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_SLAB_ITEM;

    public static DeferredBlock<StairBlock> BLUE_QUARTZ_STAIRS;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_STAIRS_ITEM;

    public static DeferredBlock<ButtonBlock> BLUE_QUARTZ_BUTTON;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_BUTTON_ITEM;

    public static DeferredBlock<PressurePlateBlock> BLUE_QUARTZ_PRESSURE_PLATE;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_PRESSURE_PLATE_ITEM;

    public static DeferredBlock<FenceBlock> BLUE_QUARTZ_FENCE;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_FENCE_ITEM;

    public static DeferredBlock<WallBlock> BLUE_QUARTZ_WALL;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_WALL_ITEM;

    public static DeferredBlock<FenceGateBlock> BLUE_QUARTZ_GATE;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_GATE_ITEM;


    public static DeferredBlock<Block> BLUE_QUARTZ_BRICKS;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_BRICKS_ITEM;

    public static DeferredBlock<SlabBlock> BLUE_QUARTZ_BRICK_SLAB;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_BRICK_SLAB_ITEM;

    public static DeferredBlock<StairBlock> BLUE_QUARTZ_BRICK_STAIRS;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_BRICK_STAIRS_ITEM;

    public static DeferredBlock<WallBlock> BLUE_QUARTZ_BRICK_WALL;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_BRICK_WALL_ITEM;


    public static DeferredBlock<Block> CHISELED_BLUE_QUARTZ_BLOCK;
    public static DeferredItem<BlockItem> CHISELED_BLUE_QUARTZ_BLOCK_ITEM;


    public static DeferredBlock<Block> BLUE_QUARTZ_TILES;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_TILES_ITEM;

    public static DeferredBlock<SlabBlock> BLUE_QUARTZ_TILE_SLAB;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_TILE_SLAB_ITEM;

    public static DeferredBlock<StairBlock> BLUE_QUARTZ_TILE_STAIRS;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_TILE_STAIRS_ITEM;


    public static DeferredBlock<Pillar> BLUE_QUARTZ_PILLAR;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_PILLAR_ITEM;


    public static DeferredBlock<Block> BLUE_QUARTZ_BARS_BLOCK;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_BARS_BLOCK_ITEM;

    public static DeferredBlock<IronBarsBlock> BLUE_QUARTZ_BARS;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_BARS_ITEM;


    public static DeferredBlock<Block> BLUE_QUARTZ_BOOKSHELF;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_BOOKSHELF_ITEM;

    public static DeferredBlock<BlueQuartzFurnaceBlock> BLUE_QUARTZ_FURNACE;
    public static Supplier<BlockEntityType<BlueQuartzFurnaceEntity>> BLUE_QUARTZ_FURNACE_ENTITY;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_FURNACE_ITEM;

    public static DeferredBlock<BlueQuartzOvenBlock> BLUE_QUARTZ_OVEN;
    public static Supplier<BlockEntityType<BlueQuartzOvenEntity>> BLUE_QUARTZ_OVEN_ENTITY;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_OVEN_ITEM;

    public static DeferredBlock<BlueQuartzBlastFurnaceBlock> BLUE_QUARTZ_BLAST_FURNACE;
    public static Supplier<BlockEntityType<BlueQuartzBlastFurnaceEntity>> BLUE_QUARTZ_BLAST_FURNACE_ENTITY;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_BLAST_FURNACE_ITEM;


    public static DeferredBlock<DoorBlock> BLUE_QUARTZ_DOOR;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_DOOR_ITEM;

    public static DeferredBlock<TrapDoorBlock> BLUE_QUARTZ_TRAPDOOR;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_TRAPDOOR_ITEM;


    public static DeferredBlock<Chair> BLUE_QUARTZ_CHAIR;
    public static DeferredItem<BlockItem> BLUE_QUARTZ_CHAIR_ITEM;
}
