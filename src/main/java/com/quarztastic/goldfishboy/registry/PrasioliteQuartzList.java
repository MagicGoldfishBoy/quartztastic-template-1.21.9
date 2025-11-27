package com.quarztastic.goldfishboy.registry;

import java.util.function.Supplier;

import com.quarztastic.goldfishboy.block.PrasioliteQuartzFurnaceBlock;
import com.quarztastic.goldfishboy.block.PrasioliteQuartzBlastFurnaceBlock;
import com.quarztastic.goldfishboy.block.PrasioliteQuartzOvenBlock;
import com.quarztastic.goldfishboy.block.Shelf;
import com.quarztastic.goldfishboy.block.Table;
import com.quarztastic.goldfishboy.block.PrasioliteQuartzBarrelBlock;
import com.quarztastic.goldfishboy.block.Chair;
import com.quarztastic.goldfishboy.block.OreBlock;
import com.quarztastic.goldfishboy.block.Pillar;
import com.quarztastic.goldfishboy.entity.PrasioliteQuartzOvenEntity;
import com.quarztastic.goldfishboy.entity.PrasioliteQuartzBarrelEntity;
import com.quarztastic.goldfishboy.entity.PrasioliteQuartzBlastFurnaceEntity;
import com.quarztastic.goldfishboy.entity.PrasioliteQuartzFurnaceEntity;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class PrasioliteQuartzList {

    public static DeferredItem<Item> PRASIOLITE_QUARTZ_CRYSTAL;

    
    public static DeferredBlock<OreBlock> PRASIOLITE_QUARTZ_ORE;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_ORE_ITEM;

    public static DeferredBlock<OreBlock> PRASIOLITE_QUARTZ_NETHERRACK_ORE;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_NETHERRACK_ORE_ITEM;


    public static DeferredBlock<Block> PRASIOLITE_QUARTZ_BLOCK;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_BLOCK_ITEM;

    public static DeferredBlock<IronBarsBlock> PRASIOLITE_QUARTZ_PANE;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_PANE_ITEM;

    public static DeferredBlock<SlabBlock> PRASIOLITE_QUARTZ_SLAB;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_SLAB_ITEM;

    public static DeferredBlock<StairBlock> PRASIOLITE_QUARTZ_STAIRS;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_STAIRS_ITEM;

    public static DeferredBlock<ButtonBlock> PRASIOLITE_QUARTZ_BUTTON;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_BUTTON_ITEM;

    public static DeferredBlock<PressurePlateBlock> PRASIOLITE_QUARTZ_PRESSURE_PLATE;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_PRESSURE_PLATE_ITEM;

    public static DeferredBlock<FenceBlock> PRASIOLITE_QUARTZ_FENCE;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_FENCE_ITEM;

    public static DeferredBlock<WallBlock> PRASIOLITE_QUARTZ_WALL;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_WALL_ITEM;

    public static DeferredBlock<FenceGateBlock> PRASIOLITE_QUARTZ_GATE;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_GATE_ITEM;


    public static DeferredBlock<Block> PRASIOLITE_QUARTZ_BRICKS;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_BRICKS_ITEM;

    public static DeferredBlock<SlabBlock> PRASIOLITE_QUARTZ_BRICK_SLAB;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_BRICK_SLAB_ITEM;

    public static DeferredBlock<StairBlock> PRASIOLITE_QUARTZ_BRICK_STAIRS;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_BRICK_STAIRS_ITEM;

    public static DeferredBlock<WallBlock> PRASIOLITE_QUARTZ_BRICK_WALL;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_BRICK_WALL_ITEM; 


    public static DeferredBlock<Block> CHISELED_PRASIOLITE_QUARTZ_BLOCK;
    public static DeferredItem<BlockItem> CHISELED_PRASIOLITE_QUARTZ_BLOCK_ITEM;


    public static DeferredBlock<Block> PRASIOLITE_QUARTZ_TILES;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_TILES_ITEM;

    public static DeferredBlock<SlabBlock> PRASIOLITE_QUARTZ_TILE_SLAB;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_TILE_SLAB_ITEM;

    public static DeferredBlock<StairBlock> PRASIOLITE_QUARTZ_TILE_STAIRS;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_TILE_STAIRS_ITEM;


    public static DeferredBlock<Pillar> PRASIOLITE_QUARTZ_PILLAR;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_PILLAR_ITEM;


    public static DeferredBlock<Block> PRASIOLITE_QUARTZ_BARS_BLOCK;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_BARS_BLOCK_ITEM;

    public static DeferredBlock<IronBarsBlock> PRASIOLITE_QUARTZ_BARS;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_BARS_ITEM;


    public static DeferredBlock<Block> PRASIOLITE_QUARTZ_BOOKSHELF;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_BOOKSHELF_ITEM;

    public static DeferredBlock<PrasioliteQuartzFurnaceBlock> PRASIOLITE_QUARTZ_FURNACE;
    public static Supplier<BlockEntityType<PrasioliteQuartzFurnaceEntity>> PRASIOLITE_QUARTZ_FURNACE_ENTITY;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_FURNACE_ITEM;

    public static DeferredBlock<PrasioliteQuartzOvenBlock> PRASIOLITE_QUARTZ_OVEN;
    public static Supplier<BlockEntityType<PrasioliteQuartzOvenEntity>> PRASIOLITE_QUARTZ_OVEN_ENTITY;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_OVEN_ITEM;

    public static DeferredBlock<PrasioliteQuartzBlastFurnaceBlock> PRASIOLITE_QUARTZ_BLAST_FURNACE;
    public static Supplier<BlockEntityType<PrasioliteQuartzBlastFurnaceEntity>> PRASIOLITE_QUARTZ_BLAST_FURNACE_ENTITY;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_BLAST_FURNACE_ITEM;


    public static DeferredBlock<DoorBlock> PRASIOLITE_QUARTZ_DOOR;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_DOOR_ITEM;

    public static DeferredBlock<TrapDoorBlock> PRASIOLITE_QUARTZ_TRAPDOOR;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_TRAPDOOR_ITEM;


    public static DeferredBlock<Chair> PRASIOLITE_QUARTZ_CHAIR;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_CHAIR_ITEM;

    public static DeferredBlock<Table> PRASIOLITE_QUARTZ_TABLE;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_TABLE_ITEM;

    public static DeferredBlock<Shelf> PRASIOLITE_QUARTZ_SHELF;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_SHELF_ITEM;


    public static DeferredBlock<Block> PRASIOLITE_QUARTZ_LIGHT;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_LIGHT_ITEM;


    public static DeferredBlock<LanternBlock> PRASIOLITE_QUARTZ_LANTERN;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_LANTERN_ITEM;


    public static DeferredBlock<LanternBlock> PRASIOLITE_QUARTZ_SOUL_LANTERN;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_SOUL_LANTERN_ITEM;


    public static DeferredBlock<ChainBlock> PRASIOLITE_QUARTZ_CHAIN;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_CHAIN_ITEM;


    public static DeferredBlock<TorchBlock> PRASIOLITE_QUARTZ_TORCH;
    public static DeferredBlock<WallTorchBlock> PRASIOLITE_QUARTZ_WALL_TORCH;
    public static DeferredItem<StandingAndWallBlockItem> PRASIOLITE_QUARTZ_TORCH_ITEM;


    public static DeferredBlock<TorchBlock> PRASIOLITE_QUARTZ_SOUL_TORCH;
    public static DeferredBlock<WallTorchBlock> PRASIOLITE_QUARTZ_WALL_SOUL_TORCH;
    public static DeferredItem<StandingAndWallBlockItem> PRASIOLITE_QUARTZ_SOUL_TORCH_ITEM;


    public static DeferredBlock<LadderBlock> PRASIOLITE_QUARTZ_LADDER;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_LADDER_ITEM;


    public static DeferredBlock<PrasioliteQuartzBarrelBlock> PRASIOLITE_QUARTZ_BARREL_BLOCK;
    public static Supplier<BlockEntityType<PrasioliteQuartzBarrelEntity>> PRASIOLITE_QUARTZ_BARREL_ENTITY;
    public static DeferredItem<BlockItem> PRASIOLITE_QUARTZ_BARREL_ITEM;
}
