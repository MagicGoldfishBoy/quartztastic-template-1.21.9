package com.quarztastic.goldfishboy.registry.citrine;

import java.util.function.Supplier;

import com.quarztastic.goldfishboy.block.OreBlock;
import com.quarztastic.goldfishboy.block.Path;
import com.quarztastic.goldfishboy.block.Pillar;
import com.quarztastic.goldfishboy.block.CitrineNightstand;
import com.quarztastic.goldfishboy.block.CitrineBarrelBlock;
import com.quarztastic.goldfishboy.block.Shelf;
import com.quarztastic.goldfishboy.block.Sink;
import com.quarztastic.goldfishboy.block.Statuette;
import com.quarztastic.goldfishboy.block.Table;
import com.quarztastic.goldfishboy.block.crafting_tables.CitrineCraftingTable;
import com.quarztastic.goldfishboy.block.furnaces.CitrineFurnaceBlock;
import com.quarztastic.goldfishboy.block.grindstones.CitrineGrindstone;
import com.quarztastic.goldfishboy.block.ovens.CitrineOvenBlock;
import com.quarztastic.goldfishboy.block.stonecutters.CitrineStonecutter;
import com.quarztastic.goldfishboy.block.CitrineBlastFurnaceBlock;
import com.quarztastic.goldfishboy.block.Chair;
import com.quarztastic.goldfishboy.entity.CitrineFurnaceEntity;
import com.quarztastic.goldfishboy.entity.CitrineOvenEntity;
import com.quarztastic.goldfishboy.entity.CitrineNightstandEntity;
import com.quarztastic.goldfishboy.entity.CitrineBarrelEntity;
import com.quarztastic.goldfishboy.entity.CitrineBlastFurnaceEntity;

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

public class CitrineList {

    public static DeferredItem<Item> CITRINE_CRYSTAL;

    
    public static DeferredBlock<OreBlock> CITRINE_ORE;

    public static DeferredItem<BlockItem> CITRINE_ORE_ITEM;


    public static DeferredBlock<Block> CITRINE_BLOCK;
    public static DeferredItem<BlockItem> CITRINE_BLOCK_ITEM;

    public static DeferredBlock<IronBarsBlock> CITRINE_PANE;
    public static DeferredItem<BlockItem> CITRINE_PANE_ITEM;

    public static DeferredBlock<SlabBlock> CITRINE_SLAB;
    public static DeferredItem<BlockItem> CITRINE_SLAB_ITEM;

    public static DeferredBlock<StairBlock> CITRINE_STAIRS;
    public static DeferredItem<BlockItem> CITRINE_STAIRS_ITEM;

    public static DeferredBlock<ButtonBlock> CITRINE_BUTTON;
    public static DeferredItem<BlockItem> CITRINE_BUTTON_ITEM;

    public static DeferredBlock<PressurePlateBlock> CITRINE_PRESSURE_PLATE;
    public static DeferredItem<BlockItem> CITRINE_PRESSURE_PLATE_ITEM;

    public static DeferredBlock<FenceBlock> CITRINE_FENCE;
    public static DeferredItem<BlockItem> CITRINE_FENCE_ITEM;

    public static DeferredBlock<WallBlock> CITRINE_WALL;
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

    public static DeferredBlock<CitrineCraftingTable> CITRINE_CRAFTING_TABLE;
    public static DeferredItem<BlockItem> CITRINE_CRAFTING_TABLE_ITEM;

    public static DeferredBlock<CitrineStonecutter> CITRINE_STONECUTTER;
    public static DeferredItem<BlockItem> CITRINE_STONECUTTER_ITEM;

    public static DeferredBlock<CitrineGrindstone> CITRINE_GRINDSTONE;
    public static DeferredItem<BlockItem> CITRINE_GRINDSTONE_ITEM;


    public static DeferredBlock<DoorBlock> CITRINE_DOOR;
    public static DeferredItem<BlockItem> CITRINE_DOOR_ITEM;

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


    public static DeferredBlock<Path> CITRINE_PATH;
    public static DeferredItem<BlockItem> CITRINE_PATH_ITEM;


    public static DeferredBlock<Statuette> CITRINE_SKULL_STATUETTE;
    public static DeferredItem<BlockItem> CITRINE_SKULL_STATUETTE_ITEM;

    public static DeferredBlock<Statuette> CITRINE_GOLDFISH_STATUETTE;
    public static DeferredItem<BlockItem> CITRINE_GOLDFISH_STATUETTE_ITEM;

    public static DeferredBlock<Statuette> CITRINE_CHICKEN_STATUETTE;
    public static DeferredItem<BlockItem> CITRINE_CHICKEN_STATUETTE_ITEM;

    public static DeferredBlock<Statuette> CITRINE_BEE_STATUETTE;
    public static DeferredItem<BlockItem> CITRINE_BEE_STATUETTE_ITEM;

    public static DeferredBlock<Statuette> CITRINE_FROG_STATUETTE;
    public static DeferredItem<BlockItem> CITRINE_FROG_STATUETTE_ITEM;

    public static DeferredBlock<Statuette> CITRINE_AXOLOTL_STATUETTE;
    public static DeferredItem<BlockItem> CITRINE_AXOLOTL_STATUETTE_ITEM;


    public static DeferredBlock<FlowerPotBlock> CITRINE_FLOWER_POT;
    public static DeferredItem<BlockItem> CITRINE_FLOWER_POT_ITEM;

    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_POPPY;
    public static DeferredItem<BlockItem> CITRINE_POTTED_POPPY_ITEM; //<-this is actually necessary for drop table purposes.
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_DANDELION;
    public static DeferredItem<BlockItem> CITRINE_POTTED_DANDELION_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_BLUE_ORCHID;
    public static DeferredItem<BlockItem> CITRINE_POTTED_BLUE_ORCHID_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_ALLIUM;
    public static DeferredItem<BlockItem> CITRINE_POTTED_ALLIUM_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_AZURE_BLUET;
    public static DeferredItem<BlockItem> CITRINE_POTTED_AZURE_BLUET_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_RED_TULIP;
    public static DeferredItem<BlockItem> CITRINE_POTTED_RED_TULIP_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_ORANGE_TULIP;
    public static DeferredItem<BlockItem> CITRINE_POTTED_ORANGE_TULIP_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_WHITE_TULIP;
    public static DeferredItem<BlockItem> CITRINE_POTTED_WHITE_TULIP_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_PINK_TULIP;
    public static DeferredItem<BlockItem> CITRINE_POTTED_PINK_TULIP_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_OXEYE_DAISY;
    public static DeferredItem<BlockItem> CITRINE_POTTED_OXEYE_DAISY_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_CORNFLOWER;
    public static DeferredItem<BlockItem> CITRINE_POTTED_CORNFLOWER_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_LILY_OF_THE_VALLEY;
    public static DeferredItem<BlockItem> CITRINE_POTTED_LILY_OF_THE_VALLEY_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_WITHER_ROSE;
    public static DeferredItem<BlockItem> CITRINE_POTTED_WITHER_ROSE_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_TORCHFLOWER;
    public static DeferredItem<BlockItem> CITRINE_POTTED_TORCHFLOWER_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_CLOSED_EYEBLOSSOM;
    public static DeferredItem<BlockItem> CITRINE_POTTED_CLOSED_EYEBLOSSOM_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_OPEN_EYEBLOSSOM;
    public static DeferredItem<BlockItem> CITRINE_POTTED_OPEN_EYEBLOSSOM_ITEM;
    
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_OAK_SAPLING;
    public static DeferredItem<BlockItem> CITRINE_POTTED_OAK_SAPLING_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_SPRUCE_SAPLING;
    public static DeferredItem<BlockItem> CITRINE_POTTED_SPRUCE_SAPLING_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_BIRCH_SAPLING;
    public static DeferredItem<BlockItem> CITRINE_POTTED_BIRCH_SAPLING_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_JUNGLE_SAPLING;
    public static DeferredItem<BlockItem> CITRINE_POTTED_JUNGLE_SAPLING_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_ACACIA_SAPLING;
    public static DeferredItem<BlockItem> CITRINE_POTTED_ACACIA_SAPLING_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_DARK_OAK_SAPLING;
    public static DeferredItem<BlockItem> CITRINE_POTTED_DARK_OAK_SAPLING_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_AZALEA;
    public static DeferredItem<BlockItem> CITRINE_POTTED_AZALEA_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_FLOWERING_AZALEA;
    public static DeferredItem<BlockItem> CITRINE_POTTED_FLOWERING_AZALEA_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_MANGROVE_PROPAGULE;
    public static DeferredItem<BlockItem> CITRINE_POTTED_MANGROVE_PROPAGULE_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_CHERRY_SAPLING;
    public static DeferredItem<BlockItem> CITRINE_POTTED_CHERRY_SAPLING_ITEM;
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_PALE_OAK_SAPLING;
    public static DeferredItem<BlockItem> CITRINE_POTTED_PALE_OAK_SAPLING_ITEM;
    
    
    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_RED_MUSHROOM;
    public static DeferredItem<BlockItem> CITRINE_POTTED_RED_MUSHROOM_ITEM;

    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_BROWN_MUSHROOM;
    public static DeferredItem<BlockItem> CITRINE_POTTED_BROWN_MUSHROOM_ITEM;

    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_CRIMSON_FUNGUS;
    public static DeferredItem<BlockItem> CITRINE_POTTED_CRIMSON_FUNGUS_ITEM;

    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_WARPED_FUNGUS;
    public static DeferredItem<BlockItem> CITRINE_POTTED_WARPED_FUNGUS_ITEM;


    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_CRIMSON_ROOTS;
    public static DeferredItem<BlockItem> CITRINE_POTTED_CRIMSON_ROOTS_ITEM;

    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_WARPED_ROOTS;
    public static DeferredItem<BlockItem> CITRINE_POTTED_WARPED_ROOTS_ITEM;

    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_FERN;
    public static DeferredItem<BlockItem> CITRINE_POTTED_FERN_ITEM;

    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_DEAD_BUSH;
    public static DeferredItem<BlockItem> CITRINE_POTTED_DEAD_BUSH_ITEM;

    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_CACTUS;
    public static DeferredItem<BlockItem> CITRINE_POTTED_CACTUS_ITEM;

    public static DeferredBlock<FlowerPotBlock> CITRINE_POTTED_BAMBOO;
    public static DeferredItem<BlockItem> CITRINE_POTTED_BAMBOO_ITEM;
}
