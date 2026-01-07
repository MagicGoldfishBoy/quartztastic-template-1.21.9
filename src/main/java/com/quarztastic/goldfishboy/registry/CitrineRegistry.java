package com.quarztastic.goldfishboy.registry;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.block.CitrineBlastFurnaceBlock;
import com.quarztastic.goldfishboy.block.Shelf;
import com.quarztastic.goldfishboy.block.Sink;
import com.quarztastic.goldfishboy.block.Statuette;
import com.quarztastic.goldfishboy.block.Table;
import com.quarztastic.goldfishboy.block.Sink.SinkShape;
import com.quarztastic.goldfishboy.block.crafting_tables.CitrineCraftingTable;
import com.quarztastic.goldfishboy.block.crafting_tables.RoseQuartzCraftingTable;
import com.quarztastic.goldfishboy.block.furnaces.CitrineFurnaceBlock;
import com.quarztastic.goldfishboy.block.grindstones.CitrineGrindstone;
import com.quarztastic.goldfishboy.block.ovens.CitrineOvenBlock;
import com.quarztastic.goldfishboy.block.stonecutters.CitrineStonecutter;
import com.quarztastic.goldfishboy.block.stonecutters.SmokyQuartzStonecutter;
import com.quarztastic.goldfishboy.block.CitrineBarrelBlock;
import com.quarztastic.goldfishboy.block.CitrineNightstand;
import com.quarztastic.goldfishboy.block.Chair;
import com.quarztastic.goldfishboy.block.OreBlock;
import com.quarztastic.goldfishboy.block.Path;
import com.quarztastic.goldfishboy.block.Pillar;
import com.quarztastic.goldfishboy.entity.CitrineOvenEntity;
import com.quarztastic.goldfishboy.registry.smoky_quartz.SmokyQuartzList;
import com.quarztastic.goldfishboy.entity.CitrineNightstandEntity;
import com.quarztastic.goldfishboy.entity.CitrineBarrelEntity;
import com.quarztastic.goldfishboy.entity.CitrineBlastFurnaceEntity;
import com.quarztastic.goldfishboy.entity.CitrineFurnaceEntity;

import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;

public class CitrineRegistry {

    static SoundType CITRINE_SOUND = SoundType.AMETHYST;

    static Float CITRINE_DESTROY_TIME = 3.0f;
    static Float CITRINE_BLAST_RESISTANCE = 6.0f;

    static BlockSetType CITRINE_BLOCK_SET_TYPE = BlockSetTypes.QUARTZ;
    static WoodType CITRINE_WOOD_TYPE = WoodType.CRIMSON;
    
    public static void registerAll() {

        registerBasicBlocks();

        registerFunctionalBlocks();

        registerDoorBlocks();

        registerFurnitureBlocks();

        registerDecorBlocks();

        registerFlowerPotBlocks();

    }

    public static void registerBasicBlocks() {

        CitrineList.CITRINE_CRYSTAL = Quartztastic.ITEMS.registerSimpleItem(
            "citrine_crystal"
        );


        CitrineList.CITRINE_ORE = Quartztastic.BLOCKS.register(
            "citrine_ore", 
            registryName -> new OreBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        CitrineList.CITRINE_ORE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_ORE
        );


        CitrineList.CITRINE_BLOCK = Quartztastic.BLOCKS.register(
            "citrine_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_BLOCK
        );

        CitrineList.CITRINE_PANE = Quartztastic.BLOCKS.register(
            "citrine_pane", 
            registryName -> new IronBarsBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME / 2, CITRINE_BLAST_RESISTANCE / 2)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_PANE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_PANE
        );

        CitrineList.CITRINE_SLAB = Quartztastic.BLOCKS.register(
            "citrine_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME / 2, CITRINE_BLAST_RESISTANCE / 2)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_SLAB
        );

        CitrineList.CITRINE_STAIRS = Quartztastic.BLOCKS.register(
            "citrine_stairs", 
            registryName -> new StairBlock(CitrineList.CITRINE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_STAIRS
        );

        CitrineList.CITRINE_BUTTON = Quartztastic.BLOCKS.register(
            "citrine_button", 
            registryName -> new ButtonBlock(CITRINE_BLOCK_SET_TYPE, 25, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .noCollision()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_BUTTON_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_BUTTON
        );

        CitrineList.CITRINE_PRESSURE_PLATE = Quartztastic.BLOCKS.register(
            "citrine_pressure_plate", 
            registryName -> new PressurePlateBlock(CITRINE_BLOCK_SET_TYPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME / 4, CITRINE_BLAST_RESISTANCE / 4)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_PRESSURE_PLATE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_PRESSURE_PLATE
        );

        CitrineList.CITRINE_FENCE = Quartztastic.BLOCKS.register(
            "citrine_fence", 
            registryName -> new FenceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_FENCE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_FENCE
        );

        CitrineList.CITRINE_WALL = Quartztastic.BLOCKS.register(
            "citrine_wall", 
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_WALL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_WALL
        );

        CitrineList.CITRINE_GATE = Quartztastic.BLOCKS.register(
            "citrine_gate", 
            registryName -> new FenceGateBlock(CITRINE_WOOD_TYPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_GATE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_GATE
        );


        CitrineList.CITRINE_BRICKS = Quartztastic.BLOCKS.register(
            "citrine_bricks", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_BRICKS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_BRICKS
        );

        CitrineList.CITRINE_BRICK_SLAB = Quartztastic.BLOCKS.register(
            "citrine_brick_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_BRICK_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_BRICK_SLAB
        );

        CitrineList.CITRINE_BRICK_STAIRS = Quartztastic.BLOCKS.register(
            "citrine_brick_stairs", 
            registryName -> new StairBlock(
                CitrineList.CITRINE_BRICKS.get().defaultBlockState(),
                BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                    .sound(CITRINE_SOUND)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
        );
        CitrineList.CITRINE_BRICK_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_BRICK_STAIRS
        );

        CitrineList.CITRINE_BRICK_WALL = Quartztastic.BLOCKS.register(
            "citrine_brick_wall", 
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_BRICK_WALL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_BRICK_WALL
        );


        CitrineList.CHISELED_CITRINE_BLOCK = Quartztastic.BLOCKS.register(
            "chiseled_citrine_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CHISELED_CITRINE_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CHISELED_CITRINE_BLOCK
        );


        CitrineList.CITRINE_TILES = Quartztastic.BLOCKS.register(
            "citrine_tiles", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_TILES_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_TILES
        );

        CitrineList.CITRINE_TILE_SLAB = Quartztastic.BLOCKS.register(
            "citrine_tile_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME / 2, CITRINE_BLAST_RESISTANCE / 2)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_TILE_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_TILE_SLAB
        );

        CitrineList.CITRINE_TILE_STAIRS = Quartztastic.BLOCKS.register(
            "citrine_tile_stairs", 
            registryName -> new StairBlock(CitrineList.CITRINE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_TILE_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_TILE_STAIRS
        );

        CitrineList.CITRINE_PILLAR = Quartztastic.BLOCKS.register(
            "citrine_pillar", 
            registryName -> new Pillar(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_PILLAR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_PILLAR
        );


        CitrineList.CITRINE_BARS_BLOCK = Quartztastic.BLOCKS.register(
            "citrine_bars_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        CitrineList.CITRINE_BARS_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_BARS_BLOCK
        );


        CitrineList.CITRINE_BARS = Quartztastic.BLOCKS.register(
            "citrine_bars", 
            registryName -> new IronBarsBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        CitrineList.CITRINE_BARS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_BARS
        );


        CitrineList.CITRINE_BOOKSHELF = Quartztastic.BLOCKS.register(
            "citrine_bookshelf", 
            registryName -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF)
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        CitrineList.CITRINE_BOOKSHELF_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_BOOKSHELF
        );

        CitrineList.CITRINE_LIGHT = Quartztastic.BLOCKS.register(
            "citrine_light", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .lightLevel(state -> 15)
            )
        );

        CitrineList.CITRINE_LIGHT_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_LIGHT
        );
    }

    public static void registerFunctionalBlocks() {

        CitrineList.CITRINE_FURNACE = Quartztastic.BLOCKS.register(
            "citrine_furnace", 
            registryName -> new CitrineFurnaceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        CitrineList.CITRINE_FURNACE_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "citrine_furnace",
            () -> new BlockEntityType<>(
            CitrineFurnaceEntity::new,
            false,
            CitrineList.CITRINE_FURNACE.get())
        );

        CitrineList.CITRINE_FURNACE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_FURNACE
        );


        CitrineList.CITRINE_OVEN = Quartztastic.BLOCKS.register(
            "citrine_oven", 
            registryName -> new CitrineOvenBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        CitrineList.CITRINE_OVEN_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "citrine_oven",
            () -> new BlockEntityType<>(
            CitrineOvenEntity::new,
            false,
            CitrineList.CITRINE_OVEN.get())
        );

        CitrineList.CITRINE_OVEN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_OVEN
        );


        CitrineList.CITRINE_BLAST_FURNACE = Quartztastic.BLOCKS.register(
            "citrine_blast_furnace", 
            registryName -> new CitrineBlastFurnaceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_BLAST_FURNACE_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "citrine_blast_furnace",
            () -> new BlockEntityType<>(
            CitrineBlastFurnaceEntity::new,
            false,
            CitrineList.CITRINE_BLAST_FURNACE.get())
        );
        CitrineList.CITRINE_BLAST_FURNACE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_BLAST_FURNACE
        );

        CitrineList.CITRINE_CRAFTING_TABLE = Quartztastic.BLOCKS.register(
            "citrine_crafting_table", 
            registryName -> new CitrineCraftingTable(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_CRAFTING_TABLE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_CRAFTING_TABLE
        );

        CitrineList.CITRINE_STONECUTTER = Quartztastic.BLOCKS.register(
            "citrine_stonecutter", 
            registryName -> new CitrineStonecutter(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_STONECUTTER_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_STONECUTTER
        );

        CitrineList.CITRINE_GRINDSTONE = Quartztastic.BLOCKS.register(
            "citrine_grindstone", 
            registryName -> new CitrineGrindstone(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_GRINDSTONE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_GRINDSTONE
        );

        CitrineList.CITRINE_LADDER = Quartztastic.BLOCKS.register(
            "citrine_ladder", 
            registryName -> new net.minecraft.world.level.block.LadderBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_LADDER_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_LADDER
        );

        CitrineList.CITRINE_BARREL_BLOCK = Quartztastic.BLOCKS.register(
            "citrine_barrel", 
            registryName -> new CitrineBarrelBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_BARREL_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "citrine_barrel",
            () -> new BlockEntityType<>(
            CitrineBarrelEntity::new,
            false,
            CitrineList.CITRINE_BARREL_BLOCK.get())
        );
        CitrineList.CITRINE_BARREL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_BARREL_BLOCK
        );
    }

    private static void registerDoorBlocks() {
        CitrineList.CITRINE_DOOR = Quartztastic.BLOCKS.register(
            "citrine_door", 
            registryName -> new DoorBlock(BlockSetTypes.QUARTZ, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_DOOR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_DOOR
        );


        CitrineList.CITRINE_TRAPDOOR = Quartztastic.BLOCKS.register(
            "citrine_trapdoor", 
            registryName -> new TrapDoorBlock(BlockSetTypes.QUARTZ, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_TRAPDOOR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_TRAPDOOR
        );
    }    

    private static void registerFurnitureBlocks() {
        CitrineList.CITRINE_CHAIR = Quartztastic.BLOCKS.register(
            "citrine_chair", 
            registryName -> new Chair("dining", BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_CHAIR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_CHAIR
        );


        CitrineList.CITRINE_TABLE = Quartztastic.BLOCKS.register(
            "citrine_table", 
            registryName -> new Table(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_TABLE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_TABLE
        );


        CitrineList.CITRINE_SHELF = Quartztastic.BLOCKS.register(
            "citrine_shelf", 
            registryName -> new Shelf(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_SHELF_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_SHELF
        );


        CitrineList.CITRINE_NIGHTSTAND_BLOCK = Quartztastic.BLOCKS.register(
            "citrine_nightstand", 
            registryName -> new CitrineNightstand(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_NIGHTSTAND_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "citrine_nightstand",
            () -> new BlockEntityType<>(
            CitrineNightstandEntity::new,
            false,
            CitrineList.CITRINE_NIGHTSTAND_BLOCK.get())
        );
        CitrineList.CITRINE_NIGHTSTAND_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_NIGHTSTAND_BLOCK
        );

        CitrineList.CITRINE_SINK = Quartztastic.BLOCKS.register(
            "citrine_sink", 
            registryName -> new Sink(SinkShape.BASIN, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_SINK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_SINK
        );
    }    

    private static void registerDecorBlocks() {
        CitrineList.CITRINE_LANTERN = Quartztastic.BLOCKS.register(
            "citrine_lantern", 
            registryName -> new net.minecraft.world.level.block.LanternBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .lightLevel(state -> 15)
            )
        );

        CitrineList.CITRINE_LANTERN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_LANTERN
        );


        CitrineList.CITRINE_SOUL_LANTERN = Quartztastic.BLOCKS.register(
            "citrine_soul_lantern", 
            registryName -> new net.minecraft.world.level.block.LanternBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .lightLevel(state -> 10)
            )
        );

        CitrineList.CITRINE_SOUL_LANTERN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_SOUL_LANTERN
        );


        CitrineList.CITRINE_CHAIN = Quartztastic.BLOCKS.register(
            "citrine_chain", 
            registryName -> new ChainBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        CitrineList.CITRINE_CHAIN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_CHAIN
        );


        CitrineList.CITRINE_TORCH = Quartztastic.BLOCKS.register(
            "citrine_torch", 
            registryName -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 15)
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_WALL_TORCH = Quartztastic.BLOCKS.register(
            "citrine_wall_torch", 
            registryName -> new net.minecraft.world.level.block.WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 15)
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_TORCH_ITEM = Quartztastic.ITEMS.register(
            "citrine_torch", 
            registryName -> new StandingAndWallBlockItem(
                CitrineList.CITRINE_TORCH.get(),
                CitrineList.CITRINE_WALL_TORCH.get(), 
                Direction.DOWN, 
                new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, registryName))
        ));


        CitrineList.CITRINE_SOUL_TORCH = Quartztastic.BLOCKS.register(
            "citrine_soul_torch", 
            registryName -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 10)
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_WALL_SOUL_TORCH = Quartztastic.BLOCKS.register(
            "citrine_wall_soul_torch", 
            registryName -> new net.minecraft.world.level.block.WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 10)
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_SOUL_TORCH_ITEM = Quartztastic.ITEMS.register(
            "citrine_soul_torch", 
            registryName -> new StandingAndWallBlockItem(
                CitrineList.CITRINE_SOUL_TORCH.get(),
                CitrineList.CITRINE_WALL_SOUL_TORCH.get(), 
                Direction.DOWN, 
                new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, registryName))
        ));

        CitrineList.CITRINE_PATH = Quartztastic.BLOCKS.register(
            "citrine_path", 
            registryName -> new Path(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.65f, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_PATH_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_PATH
        );

        CitrineList.CITRINE_SKULL_STATUETTE = Quartztastic.BLOCKS.register(
            "citrine_skull_statuette", 
            registryName -> new Statuette(Statuette.StatuetteShape.SKULL_SHAPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
                .lightLevel(state -> 5)
            )
        );
        CitrineList.CITRINE_SKULL_STATUETTE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_SKULL_STATUETTE
        );

        CitrineList.CITRINE_GOLDFISH_STATUETTE = Quartztastic.BLOCKS.register(
            "citrine_goldfish_statuette", 
            registryName -> new Statuette(Statuette.StatuetteShape.GOLDFISH_SHAPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_BLAST_RESISTANCE)
                .sound(CITRINE_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
                .lightLevel(state -> 3)
            )
        );
        CitrineList.CITRINE_GOLDFISH_STATUETTE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_GOLDFISH_STATUETTE
        );
    }  
    
    private static void registerFlowerPotBlocks() {

        CitrineList.CITRINE_FLOWER_POT = Quartztastic.BLOCKS.register(
            "citrine_flower_pot", 
        registryName -> new FlowerPotBlock(null, () -> Blocks.AIR, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .instabreak()
            .sound(CITRINE_SOUND)
            .noOcclusion()
        ));
        CitrineList.CITRINE_FLOWER_POT_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_FLOWER_POT
        );

        CitrineList.CITRINE_POTTED_POPPY = Quartztastic.BLOCKS.register(
            "citrine_potted_poppy",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.POPPY,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_POPPY_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_POPPY
        );
        

        CitrineList.CITRINE_POTTED_DANDELION = Quartztastic.BLOCKS.register(
            "citrine_potted_dandelion",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.DANDELION,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_DANDELION_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_DANDELION
        );
        

        CitrineList.CITRINE_POTTED_BLUE_ORCHID = Quartztastic.BLOCKS.register(
            "citrine_potted_blue_orchid",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.BLUE_ORCHID,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_BLUE_ORCHID_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_BLUE_ORCHID
        );
        

        CitrineList.CITRINE_POTTED_ALLIUM = Quartztastic.BLOCKS.register(
            "citrine_potted_allium",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.ALLIUM,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_ALLIUM_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_ALLIUM
        );
        

        CitrineList.CITRINE_POTTED_AZURE_BLUET = Quartztastic.BLOCKS.register(
            "citrine_potted_azure_bluet",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.AZURE_BLUET,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_AZURE_BLUET_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_AZURE_BLUET
        );
        

        CitrineList.CITRINE_POTTED_RED_TULIP = Quartztastic.BLOCKS.register(
            "citrine_potted_red_tulip",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.RED_TULIP,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_RED_TULIP_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_RED_TULIP
        );
        

        CitrineList.CITRINE_POTTED_ORANGE_TULIP = Quartztastic.BLOCKS.register(
            "citrine_potted_orange_tulip",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.ORANGE_TULIP,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_ORANGE_TULIP_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_ORANGE_TULIP
        );
        

        CitrineList.CITRINE_POTTED_WHITE_TULIP = Quartztastic.BLOCKS.register(
            "citrine_potted_white_tulip",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.WHITE_TULIP,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_WHITE_TULIP_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_WHITE_TULIP
        );
        

        CitrineList.CITRINE_POTTED_PINK_TULIP = Quartztastic.BLOCKS.register(
            "citrine_potted_pink_tulip",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.PINK_TULIP,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_PINK_TULIP_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_PINK_TULIP
        );
        

        CitrineList.CITRINE_POTTED_OXEYE_DAISY = Quartztastic.BLOCKS.register(
            "citrine_potted_oxeye_daisy",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.OXEYE_DAISY,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_OXEYE_DAISY_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_OXEYE_DAISY
        );
        

        CitrineList.CITRINE_POTTED_CORNFLOWER = Quartztastic.BLOCKS.register(
            "citrine_potted_cornflower",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.CORNFLOWER,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_CORNFLOWER_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_CORNFLOWER
        );
        

        CitrineList.CITRINE_POTTED_LILY_OF_THE_VALLEY = Quartztastic.BLOCKS.register(
            "citrine_potted_lily_of_the_valley",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.LILY_OF_THE_VALLEY,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_LILY_OF_THE_VALLEY_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_LILY_OF_THE_VALLEY
        );
        

        CitrineList.CITRINE_POTTED_WITHER_ROSE = Quartztastic.BLOCKS.register(
            "citrine_potted_wither_rose",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.WITHER_ROSE,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_WITHER_ROSE_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_WITHER_ROSE
        );
        

        CitrineList.CITRINE_POTTED_TORCHFLOWER = Quartztastic.BLOCKS.register(
            "citrine_potted_torchflower",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.TORCHFLOWER,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_TORCHFLOWER_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_TORCHFLOWER
        );
        

        CitrineList.CITRINE_POTTED_CLOSED_EYEBLOSSOM = Quartztastic.BLOCKS.register(
            "citrine_potted_closed_eyeblossom",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.CLOSED_EYEBLOSSOM,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_CLOSED_EYEBLOSSOM_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_CLOSED_EYEBLOSSOM
        );
        

        CitrineList.CITRINE_POTTED_OPEN_EYEBLOSSOM = Quartztastic.BLOCKS.register(
            "citrine_potted_open_eyeblossom",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.OPEN_EYEBLOSSOM,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_OPEN_EYEBLOSSOM_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_OPEN_EYEBLOSSOM
        );
        

        CitrineList.CITRINE_POTTED_OAK_SAPLING = Quartztastic.BLOCKS.register(
            "citrine_potted_oak_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.OAK_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_OAK_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_OAK_SAPLING
        );

        CitrineList.CITRINE_POTTED_SPRUCE_SAPLING = Quartztastic.BLOCKS.register(
            "citrine_potted_spruce_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.SPRUCE_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_SPRUCE_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_SPRUCE_SAPLING
        );

        CitrineList.CITRINE_POTTED_BIRCH_SAPLING = Quartztastic.BLOCKS.register(
            "citrine_potted_birch_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.BIRCH_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_BIRCH_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_BIRCH_SAPLING
        );

        CitrineList.CITRINE_POTTED_JUNGLE_SAPLING = Quartztastic.BLOCKS.register(
            "citrine_potted_jungle_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.JUNGLE_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_JUNGLE_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_JUNGLE_SAPLING
        );

        CitrineList.CITRINE_POTTED_ACACIA_SAPLING = Quartztastic.BLOCKS.register(
            "citrine_potted_acacia_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.ACACIA_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_ACACIA_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_ACACIA_SAPLING
        );

        CitrineList.CITRINE_POTTED_DARK_OAK_SAPLING = Quartztastic.BLOCKS.register(
            "citrine_potted_dark_oak_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.DARK_OAK_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_DARK_OAK_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_DARK_OAK_SAPLING
        );

        CitrineList.CITRINE_POTTED_AZALEA = Quartztastic.BLOCKS.register(
            "citrine_potted_azalea",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.AZALEA,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_AZALEA_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_AZALEA
        );

        CitrineList.CITRINE_POTTED_FLOWERING_AZALEA = Quartztastic.BLOCKS.register(
            "citrine_potted_flowering_azalea",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.FLOWERING_AZALEA,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_FLOWERING_AZALEA_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_FLOWERING_AZALEA
        );

        CitrineList.CITRINE_POTTED_MANGROVE_PROPAGULE = Quartztastic.BLOCKS.register(
            "citrine_potted_mangrove_propagule",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.MANGROVE_PROPAGULE,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_MANGROVE_PROPAGULE_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_MANGROVE_PROPAGULE
        );

        CitrineList.CITRINE_POTTED_CHERRY_SAPLING = Quartztastic.BLOCKS.register(
            "citrine_potted_cherry_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.CHERRY_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_CHERRY_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_CHERRY_SAPLING
        );

        CitrineList.CITRINE_POTTED_PALE_OAK_SAPLING = Quartztastic.BLOCKS.register(
            "citrine_potted_pale_oak_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.PALE_OAK_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_PALE_OAK_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_PALE_OAK_SAPLING
        );


        CitrineList.CITRINE_POTTED_RED_MUSHROOM = Quartztastic.BLOCKS.register(
            "citrine_potted_red_mushroom",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.RED_MUSHROOM,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_RED_MUSHROOM_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_RED_MUSHROOM
        );

        CitrineList.CITRINE_POTTED_BROWN_MUSHROOM = Quartztastic.BLOCKS.register(
            "citrine_potted_brown_mushroom",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.BROWN_MUSHROOM,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_BROWN_MUSHROOM_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_BROWN_MUSHROOM
        );

        CitrineList.CITRINE_POTTED_CRIMSON_FUNGUS = Quartztastic.BLOCKS.register(
            "citrine_potted_crimson_fungus",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.CRIMSON_FUNGUS,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_CRIMSON_FUNGUS_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_CRIMSON_FUNGUS
        );

        CitrineList.CITRINE_POTTED_WARPED_FUNGUS = Quartztastic.BLOCKS.register(
            "citrine_potted_warped_fungus",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.WARPED_FUNGUS,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_WARPED_FUNGUS_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_WARPED_FUNGUS
        );

        
        CitrineList.CITRINE_POTTED_CRIMSON_ROOTS = Quartztastic.BLOCKS.register(
            "citrine_potted_crimson_roots",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.CRIMSON_ROOTS,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_CRIMSON_ROOTS_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_CRIMSON_ROOTS
        );

        CitrineList.CITRINE_POTTED_WARPED_ROOTS = Quartztastic.BLOCKS.register(
            "citrine_potted_warped_roots",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.WARPED_ROOTS,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_POTTED_WARPED_ROOTS_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_WARPED_ROOTS
        );

        CitrineList.CITRINE_POTTED_FERN = Quartztastic.BLOCKS.register(
            "citrine_potted_fern",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.FERN,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
                .mapColor(MapColor.PLANT)
            )
        );
        CitrineList.CITRINE_POTTED_FERN_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_FERN
        );

        CitrineList.CITRINE_POTTED_DEAD_BUSH = Quartztastic.BLOCKS.register(
            "citrine_potted_dead_bush",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.DEAD_BUSH,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
                .mapColor(MapColor.PLANT)
            )
        );
        CitrineList.CITRINE_POTTED_DEAD_BUSH_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_DEAD_BUSH
        );

        CitrineList.CITRINE_POTTED_CACTUS = Quartztastic.BLOCKS.register(
            "citrine_potted_cactus",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.CACTUS,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
                .mapColor(MapColor.PLANT)
            )
        );
        CitrineList.CITRINE_POTTED_CACTUS_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_CACTUS
        );

        CitrineList.CITRINE_POTTED_BAMBOO = Quartztastic.BLOCKS.register(
            "citrine_potted_bamboo",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) CitrineList.CITRINE_FLOWER_POT.get(),
            () -> Blocks.BAMBOO,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(CITRINE_SOUND)
                .noOcclusion()
                .mapColor(MapColor.PLANT)
            )
        );
        CitrineList.CITRINE_POTTED_BAMBOO_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_POTTED_BAMBOO
        );
    }    
}
