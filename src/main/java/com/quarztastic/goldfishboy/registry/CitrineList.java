package com.quarztastic.goldfishboy.registry;

import java.util.function.Supplier;

import com.quarztastic.goldfishboy.block.Chair;
import com.quarztastic.goldfishboy.block.CitrineBlastFurnaceBlock;
import com.quarztastic.goldfishboy.block.CitrineFurnaceBlock;
import com.quarztastic.goldfishboy.block.CitrineOvenBlock;
import com.quarztastic.goldfishboy.block.Pillar;
import com.quarztastic.goldfishboy.block.CitrineNightstand;
import com.quarztastic.goldfishboy.block.CitrineBarrelBlock;
import com.quarztastic.goldfishboy.block.Shelf;
import com.quarztastic.goldfishboy.block.Sink;
import com.quarztastic.goldfishboy.block.Table;
import com.quarztastic.goldfishboy.entity.CitrineBlastFurnaceEntity;
import com.quarztastic.goldfishboy.entity.CitrineFurnaceEntity;
import com.quarztastic.goldfishboy.entity.CitrineOvenEntity;
import com.quarztastic.goldfishboy.entity.CitrineNightstandEntity;
import com.quarztastic.goldfishboy.entity.CitrineBarrelEntity;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
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

    public static DeferredBlock<Block> CITRINE_FENCE;
    public static DeferredItem<BlockItem> CITRINE_FENCE_ITEM;

    public static DeferredBlock<Block> CITRINE_WALL;
    public static DeferredItem<BlockItem> CITRINE_WALL_ITEM;

    public static DeferredBlock<FenceGateBlock> CITRINE_GATE;
    public static DeferredItem<BlockItem> CITRINE_GATE_ITEM;


    public static DeferredBlock<Block> CITRINE_BRICKS;
    public static DeferredItem<BlockItem> CITRINE_BRICKS_ITEM;

    public static DeferredBlock<SlabBlock> CITRINE_BRICK_SLAB;
    public static DeferredItem<BlockItem> CITRINE_BRICK_SLAB_ITEM;

    public static DeferredBlock<StairBlock> CITRINE_BRICK_STAIRS;
    public static DeferredItem<BlockItem> CITRINE_BRICK_STAIRS_ITEM;

    public static DeferredBlock<WallBlock> CITRINE_BRICK_WALL;
    public static DeferredItem<BlockItem> CITRINE_BRICK_WALL_ITEM;


    public static DeferredBlock<Block> CHISELED_CITRINE_BLOCK;
    public static DeferredItem<BlockItem> CHISELED_CITRINE_BLOCK_ITEM;


    public static DeferredBlock<Block> CITRINE_TILES;
    public static DeferredItem<BlockItem> CITRINE_TILES_ITEM;

    public static DeferredBlock<SlabBlock> CITRINE_TILE_SLAB;
    public static DeferredItem<BlockItem> CITRINE_TILE_SLAB_ITEM;

    public static DeferredBlock<StairBlock> CITRINE_TILE_STAIRS;
    public static DeferredItem<BlockItem> CITRINE_TILE_STAIRS_ITEM;


    public static DeferredBlock<Pillar> CITRINE_PILLAR;
    public static DeferredItem<BlockItem> CITRINE_PILLAR_ITEM;


    public static DeferredBlock<Block> CITRINE_BARS_BLOCK;
    public static DeferredItem<BlockItem> CITRINE_BARS_BLOCK_ITEM;

    public static DeferredBlock<IronBarsBlock> CITRINE_BARS;
    public static DeferredItem<BlockItem> CITRINE_BARS_ITEM;

    public static DeferredBlock<Block> CITRINE_BOOKSHELF;
    public static DeferredItem<BlockItem> CITRINE_BOOKSHELF_ITEM;

    public static DeferredBlock<CitrineFurnaceBlock> CITRINE_FURNACE;
    public static Supplier<BlockEntityType<CitrineFurnaceEntity>> CITRINE_FURNACE_ENTITY;
    public static DeferredItem<BlockItem> CITRINE_FURNACE_ITEM;

    public static DeferredBlock<CitrineOvenBlock> CITRINE_OVEN;
    public static Supplier<BlockEntityType<CitrineOvenEntity>> CITRINE_OVEN_ENTITY;
    public static DeferredItem<BlockItem> CITRINE_OVEN_ITEM;

    public static DeferredBlock<CitrineBlastFurnaceBlock> CITRINE_BLAST_FURNACE;
    public static Supplier<BlockEntityType<CitrineBlastFurnaceEntity>> CITRINE_BLAST_FURNACE_ENTITY;
    public static DeferredItem<BlockItem> CITRINE_BLAST_FURNACE_ITEM;


    public static DeferredBlock<DoorBlock> CITRINE_DOOR;
    public static DeferredItem <BlockItem> CITRINE_DOOR_ITEM;

    public static DeferredBlock<TrapDoorBlock> CITRINE_TRAPDOOR;
    public static DeferredItem<BlockItem> CITRINE_TRAPDOOR_ITEM;


    public static DeferredBlock<Chair> CITRINE_CHAIR;
    public static DeferredItem<BlockItem> CITRINE_CHAIR_ITEM;

    public static DeferredBlock<Table> CITRINE_TABLE;
    public static DeferredItem<BlockItem> CITRINE_TABLE_ITEM;

    public static DeferredBlock<Shelf> CITRINE_SHELF;
    public static DeferredItem<BlockItem> CITRINE_SHELF_ITEM;


    public static DeferredBlock<Block> CITRINE_LIGHT;
    public static DeferredItem<BlockItem> CITRINE_LIGHT_ITEM;

    public static DeferredBlock<LanternBlock> CITRINE_LANTERN;
    public static DeferredItem<BlockItem> CITRINE_LANTERN_ITEM;

    public static DeferredBlock<LanternBlock> CITRINE_SOUL_LANTERN;
    public static DeferredItem<BlockItem> CITRINE_SOUL_LANTERN_ITEM;

    public static DeferredBlock<ChainBlock> CITRINE_CHAIN;
    public static DeferredItem<BlockItem> CITRINE_CHAIN_ITEM;

    public static DeferredBlock<TorchBlock> CITRINE_TORCH;
    public static DeferredBlock<WallTorchBlock> CITRINE_WALL_TORCH;
    public static DeferredItem<StandingAndWallBlockItem> CITRINE_TORCH_ITEM;

    public static DeferredBlock<TorchBlock> CITRINE_SOUL_TORCH;
    public static DeferredBlock<WallTorchBlock> CITRINE_WALL_SOUL_TORCH;
    public static DeferredItem<StandingAndWallBlockItem> CITRINE_SOUL_TORCH_ITEM;

    public static DeferredBlock<LadderBlock> CITRINE_LADDER;
    public static DeferredItem<BlockItem> CITRINE_LADDER_ITEM;


    public static DeferredBlock<CitrineBarrelBlock> CITRINE_BARREL_BLOCK;
    public static Supplier<BlockEntityType<CitrineBarrelEntity>> CITRINE_BARREL_ENTITY;
    public static DeferredItem<BlockItem> CITRINE_BARREL_ITEM;


    public static DeferredBlock<CitrineNightstand> CITRINE_NIGHTSTAND_BLOCK;
    public static Supplier<BlockEntityType<CitrineNightstandEntity>> CITRINE_NIGHTSTAND_ENTITY;
    public static DeferredItem<BlockItem> CITRINE_NIGHTSTAND_ITEM;


    public static DeferredBlock<Sink> CITRINE_SINK;
    public static DeferredItem<BlockItem> CITRINE_SINK_ITEM;
}
