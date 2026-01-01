package com.quarztastic.goldfishboy.registry;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.block.RoseQuartzBlastFurnaceBlock;
import com.quarztastic.goldfishboy.block.Shelf;
import com.quarztastic.goldfishboy.block.Sink;
import com.quarztastic.goldfishboy.block.Sink.SinkShape;
import com.quarztastic.goldfishboy.block.Statuette;
import com.quarztastic.goldfishboy.block.Table;
import com.quarztastic.goldfishboy.block.crafting_tables.RoseQuartzCraftingTable;
import com.quarztastic.goldfishboy.block.crafting_tables.SmokyQuartzCraftingTable;
import com.quarztastic.goldfishboy.block.furnaces.RoseQuartzFurnaceBlock;
import com.quarztastic.goldfishboy.block.ovens.RoseQuartzOvenBlock;
import com.quarztastic.goldfishboy.block.stonecutters.RoseQuartzStonecutter;
import com.quarztastic.goldfishboy.block.stonecutters.SmokyQuartzStonecutter;
import com.quarztastic.goldfishboy.block.RoseQuartzBarrelBlock;
import com.quarztastic.goldfishboy.block.RoseQuartzNightstand;
import com.quarztastic.goldfishboy.block.Chair;
import com.quarztastic.goldfishboy.block.OreBlock;
import com.quarztastic.goldfishboy.block.Path;
import com.quarztastic.goldfishboy.block.Pillar;
import com.quarztastic.goldfishboy.entity.RoseQuartzOvenEntity;
import com.quarztastic.goldfishboy.registry.smoky_quartz.SmokyQuartzList;
import com.quarztastic.goldfishboy.entity.RoseQuartzNightstandEntity;
import com.quarztastic.goldfishboy.entity.RoseQuartzBarrelEntity;
import com.quarztastic.goldfishboy.entity.RoseQuartzBlastFurnaceEntity;
import com.quarztastic.goldfishboy.entity.RoseQuartzFurnaceEntity;

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

public class RoseQuartzRegistry {

    static SoundType ROSE_QUARTZ_SOUND = SoundType.AMETHYST;

    static Float ROSE_QUARTZ_DESTROY_TIME = 3.0f;
    static Float ROSE_QUARTZ_BLAST_RESISTANCE = 6.0f;

    static BlockSetType ROSE_QUARTZ_BLOCK_SET_TYPE = BlockSetTypes.QUARTZ;
    static WoodType ROSE_QUARTZ_WOOD_TYPE = WoodType.CRIMSON;
    
    public static void registerAll() {

        registerBasicBlocks();

        registerFunctionalBlocks();

        registerDoorBlocks();

        registerFurnitureBlocks();

        registerDecorBlocks();

        registerFlowerPotBlocks();

    }

    public static void registerBasicBlocks() {

        RoseQuartzList.ROSE_QUARTZ_CRYSTAL = Quartztastic.ITEMS.registerSimpleItem(
            "rose_quartz_crystal"
        );


        RoseQuartzList.ROSE_QUARTZ_ORE = Quartztastic.BLOCKS.register(
            "rose_quartz_ore", 
            registryName -> new OreBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        RoseQuartzList.ROSE_QUARTZ_ORE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_ORE
        );

        RoseQuartzList.ROSE_QUARTZ_BLOCK = Quartztastic.BLOCKS.register(
            "rose_quartz_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_BLOCK
        );

        RoseQuartzList.ROSE_QUARTZ_SLAB = Quartztastic.BLOCKS.register(
            "rose_quartz_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME / 2, ROSE_QUARTZ_BLAST_RESISTANCE / 2)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_SLAB
        );

        RoseQuartzList.ROSE_QUARTZ_STAIRS = Quartztastic.BLOCKS.register(
            "rose_quartz_stairs", 
            registryName -> new StairBlock(RoseQuartzList.ROSE_QUARTZ_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_STAIRS
        );

        RoseQuartzList.ROSE_QUARTZ_BUTTON = Quartztastic.BLOCKS.register(
            "rose_quartz_button", 
            registryName -> new ButtonBlock(ROSE_QUARTZ_BLOCK_SET_TYPE, 25, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .noCollision()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_BUTTON_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_BUTTON
        );

        RoseQuartzList.ROSE_QUARTZ_PRESSURE_PLATE = Quartztastic.BLOCKS.register(
            "rose_quartz_pressure_plate", 
            registryName -> new PressurePlateBlock(ROSE_QUARTZ_BLOCK_SET_TYPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME / 4, ROSE_QUARTZ_BLAST_RESISTANCE / 4)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_PRESSURE_PLATE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_PRESSURE_PLATE
        );

        RoseQuartzList.ROSE_QUARTZ_FENCE = Quartztastic.BLOCKS.register(
            "rose_quartz_fence", 
            registryName -> new FenceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_FENCE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_FENCE
        );

        RoseQuartzList.ROSE_QUARTZ_WALL = Quartztastic.BLOCKS.register(
            "rose_quartz_wall", 
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_WALL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_WALL
        );

        RoseQuartzList.ROSE_QUARTZ_GATE = Quartztastic.BLOCKS.register(
            "rose_quartz_gate", 
            registryName -> new FenceGateBlock(ROSE_QUARTZ_WOOD_TYPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_GATE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_GATE
        );


        RoseQuartzList.ROSE_QUARTZ_BRICKS = Quartztastic.BLOCKS.register(
            "rose_quartz_bricks", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_BRICKS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_BRICKS
        );

        RoseQuartzList.ROSE_QUARTZ_BRICK_SLAB = Quartztastic.BLOCKS.register(
            "rose_quartz_brick_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_BRICK_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_BRICK_SLAB
        );

        RoseQuartzList.ROSE_QUARTZ_BRICK_STAIRS = Quartztastic.BLOCKS.register(
            "rose_quartz_brick_stairs", 
            registryName -> new StairBlock(
                RoseQuartzList.ROSE_QUARTZ_BRICKS.get().defaultBlockState(),
                BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                    .sound(ROSE_QUARTZ_SOUND)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_BRICK_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_BRICK_STAIRS
        );

        RoseQuartzList.ROSE_QUARTZ_BRICK_WALL = Quartztastic.BLOCKS.register(
            "rose_quartz_brick_wall", 
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_BRICK_WALL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_BRICK_WALL
        );


        RoseQuartzList.CHISELED_ROSE_QUARTZ_BLOCK = Quartztastic.BLOCKS.register(
            "chiseled_rose_quartz_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.CHISELED_ROSE_QUARTZ_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.CHISELED_ROSE_QUARTZ_BLOCK
        );


        RoseQuartzList.ROSE_QUARTZ_TILES = Quartztastic.BLOCKS.register(
            "rose_quartz_tiles", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_TILES_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_TILES
        );

        RoseQuartzList.ROSE_QUARTZ_TILE_SLAB = Quartztastic.BLOCKS.register(
            "rose_quartz_tile_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME / 2, ROSE_QUARTZ_BLAST_RESISTANCE / 2)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_TILE_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_TILE_SLAB
        );

        RoseQuartzList.ROSE_QUARTZ_TILE_STAIRS = Quartztastic.BLOCKS.register(
            "rose_quartz_tile_stairs", 
            registryName -> new StairBlock(RoseQuartzList.ROSE_QUARTZ_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_TILE_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_TILE_STAIRS
        );

        RoseQuartzList.ROSE_QUARTZ_PILLAR = Quartztastic.BLOCKS.register(
            "rose_quartz_pillar", 
            registryName -> new Pillar(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_PILLAR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_PILLAR
        );


        RoseQuartzList.ROSE_QUARTZ_BARS_BLOCK = Quartztastic.BLOCKS.register(
            "rose_quartz_bars_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        RoseQuartzList.ROSE_QUARTZ_BARS_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_BARS_BLOCK
        );


        RoseQuartzList.ROSE_QUARTZ_BARS = Quartztastic.BLOCKS.register(
            "rose_quartz_bars", 
            registryName -> new IronBarsBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        RoseQuartzList.ROSE_QUARTZ_BARS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_BARS
        );


        RoseQuartzList.ROSE_QUARTZ_BOOKSHELF = Quartztastic.BLOCKS.register(
            "rose_quartz_bookshelf", 
            registryName -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF)
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        RoseQuartzList.ROSE_QUARTZ_BOOKSHELF_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_BOOKSHELF
        );

        RoseQuartzList.ROSE_QUARTZ_LIGHT = Quartztastic.BLOCKS.register(
            "rose_quartz_light", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .lightLevel(state -> 15)
            )
        );

        RoseQuartzList.ROSE_QUARTZ_LIGHT_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_LIGHT
        );
    }

    public static void registerFunctionalBlocks() {

        RoseQuartzList.ROSE_QUARTZ_FURNACE = Quartztastic.BLOCKS.register(
            "rose_quartz_furnace", 
            registryName -> new RoseQuartzFurnaceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
            )
        );

        RoseQuartzList.ROSE_QUARTZ_FURNACE_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "rose_quartz_furnace",
            () -> new BlockEntityType<>(
            RoseQuartzFurnaceEntity::new,
            false,
            RoseQuartzList.ROSE_QUARTZ_FURNACE.get())
        );

        RoseQuartzList.ROSE_QUARTZ_FURNACE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_FURNACE
        );


        RoseQuartzList.ROSE_QUARTZ_OVEN = Quartztastic.BLOCKS.register(
            "rose_quartz_oven", 
            registryName -> new RoseQuartzOvenBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
            )
        );

        RoseQuartzList.ROSE_QUARTZ_OVEN_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "rose_quartz_oven",
            () -> new BlockEntityType<>(
            RoseQuartzOvenEntity::new,
            false,
            RoseQuartzList.ROSE_QUARTZ_OVEN.get())
        );

        RoseQuartzList.ROSE_QUARTZ_OVEN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_OVEN
        );


        RoseQuartzList.ROSE_QUARTZ_BLAST_FURNACE = Quartztastic.BLOCKS.register(
            "rose_quartz_blast_furnace", 
            registryName -> new RoseQuartzBlastFurnaceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_BLAST_FURNACE_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "rose_quartz_blast_furnace",
            () -> new BlockEntityType<>(
            RoseQuartzBlastFurnaceEntity::new,
            false,
            RoseQuartzList.ROSE_QUARTZ_BLAST_FURNACE.get())
        );
        RoseQuartzList.ROSE_QUARTZ_BLAST_FURNACE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_BLAST_FURNACE
        );

        RoseQuartzList.ROSE_QUARTZ_CRAFTING_TABLE = Quartztastic.BLOCKS.register(
            "rose_quartz_crafting_table", 
            registryName -> new RoseQuartzCraftingTable(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_CRAFTING_TABLE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_CRAFTING_TABLE
        );

        RoseQuartzList.ROSE_QUARTZ_STONECUTTER = Quartztastic.BLOCKS.register(
            "rose_quartz_stonecutter", 
            registryName -> new RoseQuartzStonecutter(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_STONECUTTER_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_STONECUTTER
        );

        RoseQuartzList.ROSE_QUARTZ_LADDER = Quartztastic.BLOCKS.register(
            "rose_quartz_ladder", 
            registryName -> new net.minecraft.world.level.block.LadderBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_LADDER_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_LADDER
        );

        RoseQuartzList.ROSE_QUARTZ_BARREL_BLOCK = Quartztastic.BLOCKS.register(
            "rose_quartz_barrel", 
            registryName -> new RoseQuartzBarrelBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_BARREL_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "rose_quartz_barrel",
            () -> new BlockEntityType<>(
            RoseQuartzBarrelEntity::new,
            false,
            RoseQuartzList.ROSE_QUARTZ_BARREL_BLOCK.get())
        );
        RoseQuartzList.ROSE_QUARTZ_BARREL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_BARREL_BLOCK
        );
    }

    private static void registerDoorBlocks() {
        RoseQuartzList.ROSE_QUARTZ_DOOR = Quartztastic.BLOCKS.register(
            "rose_quartz_door", 
            registryName -> new DoorBlock(BlockSetTypes.QUARTZ, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_DOOR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_DOOR
        );


        RoseQuartzList.ROSE_QUARTZ_TRAPDOOR = Quartztastic.BLOCKS.register(
            "rose_quartz_trapdoor", 
            registryName -> new TrapDoorBlock(BlockSetTypes.QUARTZ, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_TRAPDOOR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_TRAPDOOR
        );
    }    

    private static void registerFurnitureBlocks() {
        RoseQuartzList.ROSE_QUARTZ_CHAIR = Quartztastic.BLOCKS.register(
            "rose_quartz_chair", 
            registryName -> new Chair("dining", BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_CHAIR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_CHAIR
        );


        RoseQuartzList.ROSE_QUARTZ_TABLE = Quartztastic.BLOCKS.register(
            "rose_quartz_table", 
            registryName -> new Table(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_TABLE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_TABLE
        );


        RoseQuartzList.ROSE_QUARTZ_SHELF = Quartztastic.BLOCKS.register(
            "rose_quartz_shelf", 
            registryName -> new Shelf(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_SHELF_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_SHELF
        );


        RoseQuartzList.ROSE_QUARTZ_NIGHTSTAND_BLOCK = Quartztastic.BLOCKS.register(
            "rose_quartz_nightstand", 
            registryName -> new RoseQuartzNightstand(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_NIGHTSTAND_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "rose_quartz_nightstand",
            () -> new BlockEntityType<>(
            RoseQuartzNightstandEntity::new,
            false,
            RoseQuartzList.ROSE_QUARTZ_NIGHTSTAND_BLOCK.get())
        );
        RoseQuartzList.ROSE_QUARTZ_NIGHTSTAND_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_NIGHTSTAND_BLOCK
        );

        RoseQuartzList.ROSE_QUARTZ_SINK = Quartztastic.BLOCKS.register(
            "rose_quartz_sink", 
            registryName -> new Sink(SinkShape.BASIN_WITH_SHELVES, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_SINK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_SINK
        );
    }    

    private static void registerDecorBlocks() {
        RoseQuartzList.ROSE_QUARTZ_LANTERN = Quartztastic.BLOCKS.register(
            "rose_quartz_lantern", 
            registryName -> new net.minecraft.world.level.block.LanternBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .lightLevel(state -> 15)
            )
        );

        RoseQuartzList.ROSE_QUARTZ_LANTERN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_LANTERN
        );


        RoseQuartzList.ROSE_QUARTZ_SOUL_LANTERN = Quartztastic.BLOCKS.register(
            "rose_quartz_soul_lantern", 
            registryName -> new net.minecraft.world.level.block.LanternBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .lightLevel(state -> 10)
            )
        );

        RoseQuartzList.ROSE_QUARTZ_SOUL_LANTERN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_SOUL_LANTERN
        );


        RoseQuartzList.ROSE_QUARTZ_CHAIN = Quartztastic.BLOCKS.register(
            "rose_quartz_chain", 
            registryName -> new ChainBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        RoseQuartzList.ROSE_QUARTZ_CHAIN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_CHAIN
        );


        RoseQuartzList.ROSE_QUARTZ_TORCH = Quartztastic.BLOCKS.register(
            "rose_quartz_torch", 
            registryName -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 15)
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_WALL_TORCH = Quartztastic.BLOCKS.register(
            "rose_quartz_wall_torch", 
            registryName -> new net.minecraft.world.level.block.WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 15)
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_TORCH_ITEM = Quartztastic.ITEMS.register(
            "rose_quartz_torch", 
            registryName -> new StandingAndWallBlockItem(
                RoseQuartzList.ROSE_QUARTZ_TORCH.get(),
                RoseQuartzList.ROSE_QUARTZ_WALL_TORCH.get(), 
                Direction.DOWN, 
                new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, registryName))
        ));


        RoseQuartzList.ROSE_QUARTZ_SOUL_TORCH = Quartztastic.BLOCKS.register(
            "rose_quartz_soul_torch", 
            registryName -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 10)
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_WALL_SOUL_TORCH = Quartztastic.BLOCKS.register(
            "rose_quartz_wall_soul_torch", 
            registryName -> new net.minecraft.world.level.block.WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 10)
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_SOUL_TORCH_ITEM = Quartztastic.ITEMS.register(
            "rose_quartz_soul_torch", 
            registryName -> new StandingAndWallBlockItem(
                RoseQuartzList.ROSE_QUARTZ_SOUL_TORCH.get(),
                RoseQuartzList.ROSE_QUARTZ_WALL_SOUL_TORCH.get(), 
                Direction.DOWN, 
                new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, registryName))
        ));

        RoseQuartzList.ROSE_QUARTZ_PATH = Quartztastic.BLOCKS.register(
            "rose_quartz_path", 
            registryName -> new Path(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.65f, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_PATH_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_PATH
        );

        RoseQuartzList.ROSE_QUARTZ_SKULL_STATUETTE = Quartztastic.BLOCKS.register(
            "rose_quartz_skull_statuette", 
            registryName -> new Statuette("skull", BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                .sound(ROSE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
                .lightLevel(state -> 5)
            )
        );
        RoseQuartzList.ROSE_QUARTZ_SKULL_STATUETTE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_SKULL_STATUETTE
        );
    }  
    
    private static void registerFlowerPotBlocks() {

        RoseQuartzList.ROSE_QUARTZ_FLOWER_POT = Quartztastic.BLOCKS.register(
            "rose_quartz_flower_pot", 
        registryName -> new FlowerPotBlock(null, () -> Blocks.AIR, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .instabreak()
            .sound(ROSE_QUARTZ_SOUND)
            .noOcclusion()
        ));
        RoseQuartzList.ROSE_QUARTZ_FLOWER_POT_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_FLOWER_POT
        );

        RoseQuartzList.ROSE_QUARTZ_POTTED_POPPY = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_poppy",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.POPPY,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_POPPY_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_POPPY
        );
        

        RoseQuartzList.ROSE_QUARTZ_POTTED_DANDELION = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_dandelion",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.DANDELION,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_DANDELION_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_DANDELION
        );
        

        RoseQuartzList.ROSE_QUARTZ_POTTED_BLUE_ORCHID = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_blue_orchid",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.BLUE_ORCHID,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_BLUE_ORCHID_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_BLUE_ORCHID
        );
        

        RoseQuartzList.ROSE_QUARTZ_POTTED_ALLIUM = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_allium",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.ALLIUM,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_ALLIUM_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_ALLIUM
        );
        

        RoseQuartzList.ROSE_QUARTZ_POTTED_AZURE_BLUET = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_azure_bluet",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.AZURE_BLUET,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_AZURE_BLUET_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_AZURE_BLUET
        );
        

        RoseQuartzList.ROSE_QUARTZ_POTTED_RED_TULIP = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_red_tulip",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.RED_TULIP,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_RED_TULIP_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_RED_TULIP
        );
        

        RoseQuartzList.ROSE_QUARTZ_POTTED_ORANGE_TULIP = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_orange_tulip",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.ORANGE_TULIP,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_ORANGE_TULIP_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_ORANGE_TULIP
        );
        

        RoseQuartzList.ROSE_QUARTZ_POTTED_WHITE_TULIP = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_white_tulip",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.WHITE_TULIP,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_WHITE_TULIP_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_WHITE_TULIP
        );
        

        RoseQuartzList.ROSE_QUARTZ_POTTED_PINK_TULIP = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_pink_tulip",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.PINK_TULIP,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_PINK_TULIP_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_PINK_TULIP
        );
        

        RoseQuartzList.ROSE_QUARTZ_POTTED_OXEYE_DAISY = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_oxeye_daisy",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.OXEYE_DAISY,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_OXEYE_DAISY_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_OXEYE_DAISY
        );
        

        RoseQuartzList.ROSE_QUARTZ_POTTED_CORNFLOWER = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_cornflower",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.CORNFLOWER,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_CORNFLOWER_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_CORNFLOWER
        );
        

        RoseQuartzList.ROSE_QUARTZ_POTTED_LILY_OF_THE_VALLEY = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_lily_of_the_valley",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.LILY_OF_THE_VALLEY,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_LILY_OF_THE_VALLEY_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_LILY_OF_THE_VALLEY
        );
        

        RoseQuartzList.ROSE_QUARTZ_POTTED_WITHER_ROSE = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_wither_rose",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.WITHER_ROSE,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_WITHER_ROSE_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_WITHER_ROSE
        );
        

        RoseQuartzList.ROSE_QUARTZ_POTTED_TORCHFLOWER = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_torchflower",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.TORCHFLOWER,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_TORCHFLOWER_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_TORCHFLOWER
        );
        

        RoseQuartzList.ROSE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_closed_eyeblossom",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.CLOSED_EYEBLOSSOM,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM
        );
        

        RoseQuartzList.ROSE_QUARTZ_POTTED_OPEN_EYEBLOSSOM = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_open_eyeblossom",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.OPEN_EYEBLOSSOM,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_OPEN_EYEBLOSSOM_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_OPEN_EYEBLOSSOM
        );
        

        RoseQuartzList.ROSE_QUARTZ_POTTED_OAK_SAPLING = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_oak_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.OAK_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_OAK_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_OAK_SAPLING
        );

        RoseQuartzList.ROSE_QUARTZ_POTTED_SPRUCE_SAPLING = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_spruce_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.SPRUCE_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_SPRUCE_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_SPRUCE_SAPLING
        );

        RoseQuartzList.ROSE_QUARTZ_POTTED_BIRCH_SAPLING = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_birch_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.BIRCH_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_BIRCH_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_BIRCH_SAPLING
        );

        RoseQuartzList.ROSE_QUARTZ_POTTED_JUNGLE_SAPLING = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_jungle_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.JUNGLE_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_JUNGLE_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_JUNGLE_SAPLING
        );

        RoseQuartzList.ROSE_QUARTZ_POTTED_ACACIA_SAPLING = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_acacia_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.ACACIA_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_ACACIA_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_ACACIA_SAPLING
        );

        RoseQuartzList.ROSE_QUARTZ_POTTED_DARK_OAK_SAPLING = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_dark_oak_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.DARK_OAK_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_DARK_OAK_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_DARK_OAK_SAPLING
        );

        RoseQuartzList.ROSE_QUARTZ_POTTED_AZALEA = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_azalea",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.AZALEA,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_AZALEA_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_AZALEA
        );

        RoseQuartzList.ROSE_QUARTZ_POTTED_FLOWERING_AZALEA = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_flowering_azalea",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.FLOWERING_AZALEA,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_FLOWERING_AZALEA_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_FLOWERING_AZALEA
        );

        RoseQuartzList.ROSE_QUARTZ_POTTED_MANGROVE_PROPAGULE = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_mangrove_propagule",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.MANGROVE_PROPAGULE,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_MANGROVE_PROPAGULE_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_MANGROVE_PROPAGULE
        );

        RoseQuartzList.ROSE_QUARTZ_POTTED_CHERRY_SAPLING = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_cherry_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.CHERRY_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_CHERRY_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_CHERRY_SAPLING
        );

        RoseQuartzList.ROSE_QUARTZ_POTTED_PALE_OAK_SAPLING = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_pale_oak_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.PALE_OAK_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_PALE_OAK_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_PALE_OAK_SAPLING
        );


        RoseQuartzList.ROSE_QUARTZ_POTTED_RED_MUSHROOM = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_red_mushroom",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.RED_MUSHROOM,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_RED_MUSHROOM_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_RED_MUSHROOM
        );

        RoseQuartzList.ROSE_QUARTZ_POTTED_BROWN_MUSHROOM = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_brown_mushroom",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.BROWN_MUSHROOM,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_BROWN_MUSHROOM_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_BROWN_MUSHROOM
        );

        RoseQuartzList.ROSE_QUARTZ_POTTED_CRIMSON_FUNGUS = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_crimson_fungus",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.CRIMSON_FUNGUS,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_CRIMSON_FUNGUS_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_CRIMSON_FUNGUS
        );

        RoseQuartzList.ROSE_QUARTZ_POTTED_WARPED_FUNGUS = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_warped_fungus",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.WARPED_FUNGUS,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_WARPED_FUNGUS_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_WARPED_FUNGUS
        );

        
        RoseQuartzList.ROSE_QUARTZ_POTTED_CRIMSON_ROOTS = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_crimson_roots",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.CRIMSON_ROOTS,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_CRIMSON_ROOTS_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_CRIMSON_ROOTS
        );

        RoseQuartzList.ROSE_QUARTZ_POTTED_WARPED_ROOTS = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_warped_roots",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.WARPED_ROOTS,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_WARPED_ROOTS_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_WARPED_ROOTS
        );

        RoseQuartzList.ROSE_QUARTZ_POTTED_FERN = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_fern",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.FERN,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
                .mapColor(MapColor.PLANT)
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_FERN_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_FERN
        );

        RoseQuartzList.ROSE_QUARTZ_POTTED_DEAD_BUSH = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_dead_bush",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.DEAD_BUSH,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
                .mapColor(MapColor.PLANT)
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_DEAD_BUSH_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_DEAD_BUSH
        );

        RoseQuartzList.ROSE_QUARTZ_POTTED_CACTUS = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_cactus",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.CACTUS,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
                .mapColor(MapColor.PLANT)
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_CACTUS_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_CACTUS
        );

        RoseQuartzList.ROSE_QUARTZ_POTTED_BAMBOO = Quartztastic.BLOCKS.register(
            "rose_quartz_potted_bamboo",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.BAMBOO,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(ROSE_QUARTZ_SOUND)
                .noOcclusion()
                .mapColor(MapColor.PLANT)
            )
        );
        RoseQuartzList.ROSE_QUARTZ_POTTED_BAMBOO_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_POTTED_BAMBOO
        );
    }    
}
