package com.quarztastic.goldfishboy.registry;

import java.util.function.Supplier;

import com.quarztastic.goldfishboy.block.RoseQuartzFurnaceBlock;
import com.quarztastic.goldfishboy.block.RoseQuartzBlastFurnaceBlock;
import com.quarztastic.goldfishboy.block.RoseQuartzOvenBlock;
import com.quarztastic.goldfishboy.block.Shelf;
import com.quarztastic.goldfishboy.block.Sink;
import com.quarztastic.goldfishboy.block.Statuette;
import com.quarztastic.goldfishboy.block.Table;
import com.quarztastic.goldfishboy.block.crafting_tables.RoseQuartzCraftingTable;
import com.quarztastic.goldfishboy.block.crafting_tables.SmokyQuartzCraftingTable;
import com.quarztastic.goldfishboy.block.RoseQuartzBarrelBlock;
import com.quarztastic.goldfishboy.block.RoseQuartzNightstand;
import com.quarztastic.goldfishboy.block.Chair;
import com.quarztastic.goldfishboy.block.OreBlock;
import com.quarztastic.goldfishboy.block.Path;
import com.quarztastic.goldfishboy.block.Pillar;
import com.quarztastic.goldfishboy.entity.RoseQuartzOvenEntity;
import com.quarztastic.goldfishboy.entity.RoseQuartzNightstandEntity;
import com.quarztastic.goldfishboy.entity.RoseQuartzBarrelEntity;
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
import net.minecraft.world.level.block.FlowerPotBlock;
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

public class RoseQuartzList {

    public static DeferredItem<Item> ROSE_QUARTZ_CRYSTAL;

    
    public static DeferredBlock<OreBlock> ROSE_QUARTZ_ORE;
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


    public static DeferredBlock<Block> ROSE_QUARTZ_BARS_BLOCK;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_BARS_BLOCK_ITEM;

    public static DeferredBlock<IronBarsBlock> ROSE_QUARTZ_BARS;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_BARS_ITEM;


    public static DeferredBlock<Block> ROSE_QUARTZ_BOOKSHELF;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_BOOKSHELF_ITEM;

    public static DeferredBlock<RoseQuartzFurnaceBlock> ROSE_QUARTZ_FURNACE;
    public static Supplier<BlockEntityType<RoseQuartzFurnaceEntity>> ROSE_QUARTZ_FURNACE_ENTITY;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_FURNACE_ITEM;

    public static DeferredBlock<RoseQuartzOvenBlock> ROSE_QUARTZ_OVEN;
    public static Supplier<BlockEntityType<RoseQuartzOvenEntity>> ROSE_QUARTZ_OVEN_ENTITY;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_OVEN_ITEM;

    public static DeferredBlock<RoseQuartzBlastFurnaceBlock> ROSE_QUARTZ_BLAST_FURNACE;
    public static Supplier<BlockEntityType<RoseQuartzBlastFurnaceEntity>> ROSE_QUARTZ_BLAST_FURNACE_ENTITY;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_BLAST_FURNACE_ITEM;

    public static DeferredBlock<RoseQuartzCraftingTable> ROSE_QUARTZ_CRAFTING_TABLE;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_CRAFTING_TABLE_ITEM;

    public static DeferredBlock<DoorBlock> ROSE_QUARTZ_DOOR;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_DOOR_ITEM;

    public static DeferredBlock<TrapDoorBlock> ROSE_QUARTZ_TRAPDOOR;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_TRAPDOOR_ITEM;


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


    public static DeferredBlock<LadderBlock> ROSE_QUARTZ_LADDER;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_LADDER_ITEM;


    public static DeferredBlock<RoseQuartzBarrelBlock> ROSE_QUARTZ_BARREL_BLOCK;
    public static Supplier<BlockEntityType<RoseQuartzBarrelEntity>> ROSE_QUARTZ_BARREL_ENTITY;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_BARREL_ITEM;


    public static DeferredBlock<RoseQuartzNightstand> ROSE_QUARTZ_NIGHTSTAND_BLOCK;
    public static Supplier<BlockEntityType<RoseQuartzNightstandEntity>> ROSE_QUARTZ_NIGHTSTAND_ENTITY;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_NIGHTSTAND_ITEM;


    public static DeferredBlock<Sink> ROSE_QUARTZ_SINK;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_SINK_ITEM;


    public static DeferredBlock<Path> ROSE_QUARTZ_PATH;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_PATH_ITEM;


    public static DeferredBlock<Statuette> ROSE_QUARTZ_SKULL_STATUETTE;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_SKULL_STATUETTE_ITEM;


    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_FLOWER_POT;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_FLOWER_POT_ITEM;

    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_POPPY;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_POPPY_ITEM; //<-this is actually necessary for drop table purposes.
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_DANDELION;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_DANDELION_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_BLUE_ORCHID;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_BLUE_ORCHID_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_ALLIUM;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_ALLIUM_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_AZURE_BLUET;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_AZURE_BLUET_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_RED_TULIP;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_RED_TULIP_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_ORANGE_TULIP;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_ORANGE_TULIP_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_WHITE_TULIP;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_WHITE_TULIP_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_PINK_TULIP;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_PINK_TULIP_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_OXEYE_DAISY;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_OXEYE_DAISY_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_CORNFLOWER;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_CORNFLOWER_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_LILY_OF_THE_VALLEY;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_LILY_OF_THE_VALLEY_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_WITHER_ROSE;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_WITHER_ROSE_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_TORCHFLOWER;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_TORCHFLOWER_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_OPEN_EYEBLOSSOM;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_OPEN_EYEBLOSSOM_ITEM;
    
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_OAK_SAPLING;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_OAK_SAPLING_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_SPRUCE_SAPLING;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_SPRUCE_SAPLING_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_BIRCH_SAPLING;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_BIRCH_SAPLING_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_JUNGLE_SAPLING;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_JUNGLE_SAPLING_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_ACACIA_SAPLING;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_ACACIA_SAPLING_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_DARK_OAK_SAPLING;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_DARK_OAK_SAPLING_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_AZALEA;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_AZALEA_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_FLOWERING_AZALEA;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_FLOWERING_AZALEA_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_MANGROVE_PROPAGULE;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_MANGROVE_PROPAGULE_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_CHERRY_SAPLING;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_CHERRY_SAPLING_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_PALE_OAK_SAPLING;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_PALE_OAK_SAPLING_ITEM;
    
    
    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_RED_MUSHROOM;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_RED_MUSHROOM_ITEM;

    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_BROWN_MUSHROOM;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_BROWN_MUSHROOM_ITEM;

    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_CRIMSON_FUNGUS;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_CRIMSON_FUNGUS_ITEM;

    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_WARPED_FUNGUS;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_WARPED_FUNGUS_ITEM;


    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_CRIMSON_ROOTS;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_CRIMSON_ROOTS_ITEM;

    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_WARPED_ROOTS;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_WARPED_ROOTS_ITEM;

    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_FERN;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_FERN_ITEM;

    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_DEAD_BUSH;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_DEAD_BUSH_ITEM;

    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_CACTUS;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_CACTUS_ITEM;

    public static DeferredBlock<FlowerPotBlock> ROSE_QUARTZ_POTTED_BAMBOO;
    public static DeferredItem<BlockItem> ROSE_QUARTZ_POTTED_BAMBOO_ITEM;
}
