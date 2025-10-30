package com.quarztastic.goldfishboy.registry;

import java.util.function.Supplier;

import com.quarztastic.goldfishboy.block.Chair;
import com.quarztastic.goldfishboy.block.Pillar;
import com.quarztastic.goldfishboy.block.RoseQuartzBlastFurnaceBlock;
import com.quarztastic.goldfishboy.block.RoseQuartzFurnaceBlock;
import com.quarztastic.goldfishboy.block.RoseQuartzOvenBlock;
import com.quarztastic.goldfishboy.block.Shelf;
import com.quarztastic.goldfishboy.block.Table;
import com.quarztastic.goldfishboy.entity.RoseQuartzBlastFurnaceEntity;
import com.quarztastic.goldfishboy.entity.RoseQuartzFurnaceEntity;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class RoseQuartzList {

    public static DeferredItem<Item> ROSE_QUARTZ_CRYSTAL;

    
    public static DeferredBlock<Block> ROSE_QUARTZ_ORE;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_ORE_ITEM;


    public static DeferredBlock<Block> ROSE_QUARTZ_BLOCK;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_BLOCK_ITEM;


    public static DeferredBlock<SlabBlock> ROSE_QUARTZ_SLAB;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_SLAB_ITEM;


    public static DeferredBlock<StairBlock> ROSE_QUARTZ_STAIRS;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_STAIRS_ITEM;


    public static DeferredBlock<ButtonBlock> ROSE_QUARTZ_BUTTON;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_BUTTON_ITEM;


    public static DeferredBlock<PressurePlateBlock> ROSE_QUARTZ_PRESSURE_PLATE;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_PRESSURE_PLATE_ITEM;


    public static DeferredBlock<FenceBlock> ROSE_QUARTZ_FENCE;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_FENCE_ITEM;


    public static DeferredBlock<WallBlock> ROSE_QUARTZ_WALL;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_WALL_ITEM;


    public static DeferredBlock<FenceGateBlock> ROSE_QUARTZ_GATE;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_GATE_ITEM;



    public static DeferredBlock<Block> ROSE_QUARTZ_BRICKS;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_BRICKS_ITEM;


    public static DeferredBlock<SlabBlock> ROSE_QUARTZ_BRICK_SLAB;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_BRICK_SLAB_ITEM;


    public static DeferredBlock<StairBlock> ROSE_QUARTZ_BRICK_STAIRS;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_BRICK_STAIRS_ITEM;


    public static DeferredBlock<WallBlock> ROSE_QUARTZ_BRICK_WALL;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_BRICK_WALL_ITEM;



    public static DeferredBlock<Block> CHISELED_ROSE_QUARTZ_BLOCK;

    public static DeferredItem<BlockItem> CHISELED_ROSE_QUARTZ_BLOCK_ITEM;



    public static DeferredBlock<Block> ROSE_QUARTZ_TILES;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_TILES_ITEM;


    public static DeferredBlock<SlabBlock> ROSE_QUARTZ_TILE_SLAB;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_TILE_SLAB_ITEM;


    public static DeferredBlock<StairBlock> ROSE_QUARTZ_TILE_STAIRS;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_TILE_STAIRS_ITEM;


    public static DeferredBlock<Pillar> ROSE_QUARTZ_PILLAR;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_PILLAR_ITEM;


    public static DeferredBlock<Block> ROSE_QUARTZ_BOOKSHELF;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_BOOKSHELF_ITEM;


    public static DeferredBlock<RoseQuartzFurnaceBlock> ROSE_QUARTZ_FURNACE;
    
    public static Supplier<BlockEntityType<RoseQuartzFurnaceEntity>> ROSE_QUARTZ_FURNACE_ENTITY;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_FURNACE_ITEM;


    public static DeferredBlock<RoseQuartzOvenBlock> ROSE_QUARTZ_OVEN;

    public static Supplier<BlockEntityType<RoseQuartzFurnaceEntity>> ROSE_QUARTZ_OVEN_ENTITY;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_OVEN_ITEM;

    
    public static DeferredBlock<RoseQuartzBlastFurnaceBlock> ROSE_QUARTZ_BLAST_FURNACE;

    public static Supplier<BlockEntityType<RoseQuartzBlastFurnaceEntity>> ROSE_QUARTZ_BLAST_FURNACE_ENTITY;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_BLAST_FURNACE_ITEM;


    public static DeferredBlock<DoorBlock> ROSE_QUARTZ_DOOR;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_DOOR_ITEM;


    public static DeferredBlock<Chair> ROSE_QUARTZ_CHAIR;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_CHAIR_ITEM;


    public static DeferredBlock<Table> ROSE_QUARTZ_TABLE;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_TABLE_ITEM;


    public static DeferredBlock<Shelf> ROSE_QUARTZ_SHELF;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_SHELF_ITEM;


    public static DeferredBlock<Block> ROSE_QUARTZ_LIGHT;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_LIGHT_ITEM;


    public static DeferredBlock<LanternBlock> ROSE_QUARTZ_LANTERN;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_LANTERN_ITEM;


    public static DeferredBlock<LanternBlock> ROSE_QUARTZ_SOUL_LANTERN;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_SOUL_LANTERN_ITEM;


    public static DeferredBlock<ChainBlock> ROSE_QUARTZ_CHAIN;

    public static DeferredItem<BlockItem> ROSE_QUARTZ_CHAIN_ITEM;


    public static DeferredBlock<TorchBlock> ROSE_QUARTZ_TORCH;

    public static DeferredBlock<WallTorchBlock> ROSE_QUARTZ_WALL_TORCH;

    public static DeferredItem<StandingAndWallBlockItem> ROSE_QUARTZ_TORCH_ITEM;


    public static DeferredBlock<TorchBlock> ROSE_QUARTZ_SOUL_TORCH;

    public static DeferredBlock<WallTorchBlock> ROSE_QUARTZ_WALL_SOUL_TORCH;

    public static DeferredItem<StandingAndWallBlockItem> ROSE_QUARTZ_SOUL_TORCH_ITEM;
    
}
