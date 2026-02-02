package com.quarztastic.goldfishboy.registry.smoky_quartz;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.block.SmokyQuartzBlastFurnaceBlock;
import com.quarztastic.goldfishboy.block.Shelf;
import com.quarztastic.goldfishboy.block.Sink;
import com.quarztastic.goldfishboy.block.Sink.SinkShape;
import com.quarztastic.goldfishboy.block.Statuette;
import com.quarztastic.goldfishboy.block.Table;
import com.quarztastic.goldfishboy.block.Chair.ChairShape;
import com.quarztastic.goldfishboy.block.crafting_tables.SmokyQuartzCraftingTable;
import com.quarztastic.goldfishboy.block.furnaces.SmokyQuartzFurnaceBlock;
import com.quarztastic.goldfishboy.block.grindstones.SmokyQuartzGrindstone;
import com.quarztastic.goldfishboy.block.ovens.SmokyQuartzOvenBlock;
import com.quarztastic.goldfishboy.block.stonecutters.SmokyQuartzStonecutter;
import com.quarztastic.goldfishboy.block.SmokyQuartzBarrelBlock;
import com.quarztastic.goldfishboy.block.SmokyQuartzNightstand;
import com.quarztastic.goldfishboy.block.Chair;
import com.quarztastic.goldfishboy.block.OreBlock;
import com.quarztastic.goldfishboy.block.Path;
import com.quarztastic.goldfishboy.block.Pillar;
import com.quarztastic.goldfishboy.entity.SmokyQuartzOvenEntity;
import com.quarztastic.goldfishboy.registry.BlockSetTypes;
import com.quarztastic.goldfishboy.entity.SmokyQuartzNightstandEntity;
import com.quarztastic.goldfishboy.entity.SmokyQuartzBarrelEntity;
import com.quarztastic.goldfishboy.entity.SmokyQuartzBlastFurnaceEntity;
import com.quarztastic.goldfishboy.entity.SmokyQuartzFurnaceEntity;

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

public class SmokyQuartzRegistry {

    static SoundType SMOKY_QUARTZ_SOUND = SoundType.AMETHYST;

    static Float SMOKY_QUARTZ_DESTROY_TIME = 3.0f;
    static Float SMOKY_QUARTZ_BLAST_RESISTANCE = 6.0f;

    static BlockSetType SMOKY_QUARTZ_BLOCK_SET_TYPE = BlockSetTypes.QUARTZ;
    static WoodType SMOKY_QUARTZ_WOOD_TYPE = WoodType.CRIMSON;
    
    public static void registerAll() {

        registerBasicBlocks();

        registerFunctionalBlocks();

        registerDoorBlocks();

        registerFurnitureBlocks();

        registerDecorBlocks();

        registerFlowerPotBlocks();

    }

    public static void registerBasicBlocks() {

        SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL = Quartztastic.ITEMS.registerSimpleItem(
            "smoky_quartz_crystal"
        );


        SmokyQuartzList.SMOKY_QUARTZ_ORE = Quartztastic.BLOCKS.register(
            "smoky_quartz_ore", 
            registryName -> new OreBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_ORE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_ORE
        );


        SmokyQuartzList.SMOKY_QUARTZ_NETHERRACK_ORE = Quartztastic.BLOCKS.register(
            "smoky_quartz_netherrack_ore", 
            registryName -> new OreBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(2.0f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_NETHERRACK_ORE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_NETHERRACK_ORE
        );

        SmokyQuartzList.SMOKY_QUARTZ_BLOCK = Quartztastic.BLOCKS.register(
            "smoky_quartz_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BLOCK
        );

        SmokyQuartzList.SMOKY_QUARTZ_PANE = Quartztastic.BLOCKS.register(
            "smoky_quartz_pane", 
            registryName -> new IronBarsBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME / 2, SMOKY_QUARTZ_BLAST_RESISTANCE / 2)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_PANE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_PANE
        );

        SmokyQuartzList.SMOKY_QUARTZ_SLAB = Quartztastic.BLOCKS.register(
            "smoky_quartz_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME / 2, SMOKY_QUARTZ_BLAST_RESISTANCE / 2)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_SLAB
        );

        SmokyQuartzList.SMOKY_QUARTZ_STAIRS = Quartztastic.BLOCKS.register(
            "smoky_quartz_stairs", 
            registryName -> new StairBlock(SmokyQuartzList.SMOKY_QUARTZ_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_STAIRS
        );

        SmokyQuartzList.SMOKY_QUARTZ_BUTTON = Quartztastic.BLOCKS.register(
            "smoky_quartz_button", 
            registryName -> new ButtonBlock(SMOKY_QUARTZ_BLOCK_SET_TYPE, 25, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .noCollision()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_BUTTON_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BUTTON
        );

        SmokyQuartzList.SMOKY_QUARTZ_PRESSURE_PLATE = Quartztastic.BLOCKS.register(
            "smoky_quartz_pressure_plate", 
            registryName -> new PressurePlateBlock(SMOKY_QUARTZ_BLOCK_SET_TYPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME / 4, SMOKY_QUARTZ_BLAST_RESISTANCE / 4)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_PRESSURE_PLATE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_PRESSURE_PLATE
        );

        SmokyQuartzList.SMOKY_QUARTZ_FENCE = Quartztastic.BLOCKS.register(
            "smoky_quartz_fence", 
            registryName -> new FenceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_FENCE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_FENCE
        );

        SmokyQuartzList.SMOKY_QUARTZ_WALL = Quartztastic.BLOCKS.register(
            "smoky_quartz_wall", 
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_WALL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_WALL
        );

        SmokyQuartzList.SMOKY_QUARTZ_GATE = Quartztastic.BLOCKS.register(
            "smoky_quartz_gate", 
            registryName -> new FenceGateBlock(SMOKY_QUARTZ_WOOD_TYPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_GATE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_GATE
        );


        SmokyQuartzList.SMOKY_QUARTZ_BRICKS = Quartztastic.BLOCKS.register(
            "smoky_quartz_bricks", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BRICKS
        );

        SmokyQuartzList.SMOKY_QUARTZ_BRICK_SLAB = Quartztastic.BLOCKS.register(
            "smoky_quartz_brick_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_BRICK_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BRICK_SLAB
        );

        SmokyQuartzList.SMOKY_QUARTZ_BRICK_STAIRS = Quartztastic.BLOCKS.register(
            "smoky_quartz_brick_stairs", 
            registryName -> new StairBlock(
                SmokyQuartzList.SMOKY_QUARTZ_BRICKS.get().defaultBlockState(),
                BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                    .sound(SMOKY_QUARTZ_SOUND)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_BRICK_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BRICK_STAIRS
        );

        SmokyQuartzList.SMOKY_QUARTZ_BRICK_WALL = Quartztastic.BLOCKS.register(
            "smoky_quartz_brick_wall", 
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_BRICK_WALL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BRICK_WALL
        );


        SmokyQuartzList.CHISELED_SMOKY_QUARTZ_BLOCK = Quartztastic.BLOCKS.register(
            "chiseled_smoky_quartz_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.CHISELED_SMOKY_QUARTZ_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.CHISELED_SMOKY_QUARTZ_BLOCK
        );


        SmokyQuartzList.SMOKY_QUARTZ_TILES = Quartztastic.BLOCKS.register(
            "smoky_quartz_tiles", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_TILES_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_TILES
        );

        SmokyQuartzList.SMOKY_QUARTZ_TILE_SLAB = Quartztastic.BLOCKS.register(
            "smoky_quartz_tile_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME / 2, SMOKY_QUARTZ_BLAST_RESISTANCE / 2)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_TILE_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_TILE_SLAB
        );

        SmokyQuartzList.SMOKY_QUARTZ_TILE_STAIRS = Quartztastic.BLOCKS.register(
            "smoky_quartz_tile_stairs", 
            registryName -> new StairBlock(SmokyQuartzList.SMOKY_QUARTZ_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_TILE_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_TILE_STAIRS
        );

        SmokyQuartzList.SMOKY_QUARTZ_PILLAR = Quartztastic.BLOCKS.register(
            "smoky_quartz_pillar", 
            registryName -> new Pillar(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_PILLAR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_PILLAR
        );


        SmokyQuartzList.SMOKY_QUARTZ_BARS_BLOCK = Quartztastic.BLOCKS.register(
            "smoky_quartz_bars_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_BARS_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BARS_BLOCK
        );


        SmokyQuartzList.SMOKY_QUARTZ_BARS = Quartztastic.BLOCKS.register(
            "smoky_quartz_bars", 
            registryName -> new IronBarsBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_BARS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BARS
        );


        SmokyQuartzList.SMOKY_QUARTZ_BOOKSHELF = Quartztastic.BLOCKS.register(
            "smoky_quartz_bookshelf", 
            registryName -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF)
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_BOOKSHELF_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BOOKSHELF
        );

        SmokyQuartzList.SMOKY_QUARTZ_LIGHT = Quartztastic.BLOCKS.register(
            "smoky_quartz_light", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .lightLevel(state -> 15)
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_LIGHT_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_LIGHT
        );
    }

    public static void registerFunctionalBlocks() {

        SmokyQuartzList.SMOKY_QUARTZ_FURNACE = Quartztastic.BLOCKS.register(
            "smoky_quartz_furnace", 
            registryName -> new SmokyQuartzFurnaceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_FURNACE_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "smoky_quartz_furnace",
            () -> new BlockEntityType<>(
            SmokyQuartzFurnaceEntity::new,
            false,
            SmokyQuartzList.SMOKY_QUARTZ_FURNACE.get())
        );

        SmokyQuartzList.SMOKY_QUARTZ_FURNACE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_FURNACE
        );


        SmokyQuartzList.SMOKY_QUARTZ_OVEN = Quartztastic.BLOCKS.register(
            "smoky_quartz_oven", 
            registryName -> new SmokyQuartzOvenBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_OVEN_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "smoky_quartz_oven",
            () -> new BlockEntityType<>(
            SmokyQuartzOvenEntity::new,
            false,
            SmokyQuartzList.SMOKY_QUARTZ_OVEN.get())
        );

        SmokyQuartzList.SMOKY_QUARTZ_OVEN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_OVEN
        );


        SmokyQuartzList.SMOKY_QUARTZ_BLAST_FURNACE = Quartztastic.BLOCKS.register(
            "smoky_quartz_blast_furnace", 
            registryName -> new SmokyQuartzBlastFurnaceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_BLAST_FURNACE_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "smoky_quartz_blast_furnace",
            () -> new BlockEntityType<>(
            SmokyQuartzBlastFurnaceEntity::new,
            false,
            SmokyQuartzList.SMOKY_QUARTZ_BLAST_FURNACE.get())
        );
        SmokyQuartzList.SMOKY_QUARTZ_BLAST_FURNACE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BLAST_FURNACE
        );

        SmokyQuartzList.SMOKY_QUARTZ_CRAFTING_TABLE = Quartztastic.BLOCKS.register(
            "smoky_quartz_crafting_table", 
            registryName -> new SmokyQuartzCraftingTable(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_CRAFTING_TABLE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_CRAFTING_TABLE
        );

        SmokyQuartzList.SMOKY_QUARTZ_STONECUTTER = Quartztastic.BLOCKS.register(
            "smoky_quartz_stonecutter", 
            registryName -> new SmokyQuartzStonecutter(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_STONECUTTER_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_STONECUTTER
        );

        SmokyQuartzList.SMOKY_QUARTZ_GRINDSTONE = Quartztastic.BLOCKS.register(
            "smoky_quartz_grindstone", 
            registryName -> new SmokyQuartzGrindstone(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_GRINDSTONE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_GRINDSTONE
        );

        SmokyQuartzList.SMOKY_QUARTZ_LADDER = Quartztastic.BLOCKS.register(
            "smoky_quartz_ladder", 
            registryName -> new net.minecraft.world.level.block.LadderBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_LADDER_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_LADDER
        );

        SmokyQuartzList.SMOKY_QUARTZ_BARREL_BLOCK = Quartztastic.BLOCKS.register(
            "smoky_quartz_barrel", 
            registryName -> new SmokyQuartzBarrelBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_BARREL_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "smoky_quartz_barrel",
            () -> new BlockEntityType<>(
            SmokyQuartzBarrelEntity::new,
            false,
            SmokyQuartzList.SMOKY_QUARTZ_BARREL_BLOCK.get())
        );
        SmokyQuartzList.SMOKY_QUARTZ_BARREL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BARREL_BLOCK
        );
    }

    private static void registerDoorBlocks() {
        SmokyQuartzList.SMOKY_QUARTZ_DOOR = Quartztastic.BLOCKS.register(
            "smoky_quartz_door", 
            registryName -> new DoorBlock(BlockSetTypes.QUARTZ, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_DOOR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_DOOR
        );


        SmokyQuartzList.SMOKY_QUARTZ_TRAPDOOR = Quartztastic.BLOCKS.register(
            "smoky_quartz_trapdoor", 
            registryName -> new TrapDoorBlock(BlockSetTypes.QUARTZ, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_TRAPDOOR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_TRAPDOOR
        );
    }    

    private static void registerFurnitureBlocks() {
        SmokyQuartzList.SMOKY_QUARTZ_CHAIR = Quartztastic.BLOCKS.register(
            "smoky_quartz_chair", 
            registryName -> new Chair(ChairShape.DINER_SHAPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_CHAIR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_CHAIR
        );


        SmokyQuartzList.SMOKY_QUARTZ_TABLE = Quartztastic.BLOCKS.register(
            "smoky_quartz_table", 
            registryName -> new Table(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_TABLE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_TABLE
        );


        SmokyQuartzList.SMOKY_QUARTZ_SHELF = Quartztastic.BLOCKS.register(
            "smoky_quartz_shelf", 
            registryName -> new Shelf(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_SHELF_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_SHELF
        );


        SmokyQuartzList.SMOKY_QUARTZ_NIGHTSTAND_BLOCK = Quartztastic.BLOCKS.register(
            "smoky_quartz_nightstand", 
            registryName -> new SmokyQuartzNightstand(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_NIGHTSTAND_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "smoky_quartz_nightstand",
            () -> new BlockEntityType<>(
            SmokyQuartzNightstandEntity::new,
            false,
            SmokyQuartzList.SMOKY_QUARTZ_NIGHTSTAND_BLOCK.get())
        );
        SmokyQuartzList.SMOKY_QUARTZ_NIGHTSTAND_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_NIGHTSTAND_BLOCK
        );

        SmokyQuartzList.SMOKY_QUARTZ_SINK = Quartztastic.BLOCKS.register(
            "smoky_quartz_sink", 
            registryName -> new Sink(SinkShape.BATHROOM, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
            .sound(SMOKY_QUARTZ_SOUND)
            .requiresCorrectToolForDrops()
            .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_SINK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_SINK
        );
    }    

    private static void registerDecorBlocks() {
        SmokyQuartzList.SMOKY_QUARTZ_LANTERN = Quartztastic.BLOCKS.register(
            "smoky_quartz_lantern", 
            registryName -> new net.minecraft.world.level.block.LanternBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .lightLevel(state -> 15)
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_LANTERN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_LANTERN
        );


        SmokyQuartzList.SMOKY_QUARTZ_SOUL_LANTERN = Quartztastic.BLOCKS.register(
            "smoky_quartz_soul_lantern", 
            registryName -> new net.minecraft.world.level.block.LanternBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .lightLevel(state -> 10)
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_SOUL_LANTERN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_SOUL_LANTERN
        );


        SmokyQuartzList.SMOKY_QUARTZ_CHAIN = Quartztastic.BLOCKS.register(
            "smoky_quartz_chain", 
            registryName -> new ChainBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_CHAIN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_CHAIN
        );


        SmokyQuartzList.SMOKY_QUARTZ_TORCH = Quartztastic.BLOCKS.register(
            "smoky_quartz_torch", 
            registryName -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 15)
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_WALL_TORCH = Quartztastic.BLOCKS.register(
            "smoky_quartz_wall_torch", 
            registryName -> new net.minecraft.world.level.block.WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 15)
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_TORCH_ITEM = Quartztastic.ITEMS.register(
            "smoky_quartz_torch", 
            registryName -> new StandingAndWallBlockItem(
                SmokyQuartzList.SMOKY_QUARTZ_TORCH.get(),
                SmokyQuartzList.SMOKY_QUARTZ_WALL_TORCH.get(), 
                Direction.DOWN, 
                new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, registryName))
        ));


        SmokyQuartzList.SMOKY_QUARTZ_SOUL_TORCH = Quartztastic.BLOCKS.register(
            "smoky_quartz_soul_torch", 
            registryName -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 10)
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_WALL_SOUL_TORCH = Quartztastic.BLOCKS.register(
            "smoky_quartz_wall_soul_torch", 
            registryName -> new net.minecraft.world.level.block.WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 10)
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_SOUL_TORCH_ITEM = Quartztastic.ITEMS.register(
            "smoky_quartz_soul_torch", 
            registryName -> new StandingAndWallBlockItem(
                SmokyQuartzList.SMOKY_QUARTZ_SOUL_TORCH.get(),
                SmokyQuartzList.SMOKY_QUARTZ_WALL_SOUL_TORCH.get(), 
                Direction.DOWN, 
                new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, registryName))
        ));

        SmokyQuartzList.SMOKY_QUARTZ_PATH = Quartztastic.BLOCKS.register(
            "smoky_quartz_path", 
            registryName -> new Path(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.65f, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_PATH_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_PATH
        );

        SmokyQuartzList.SMOKY_QUARTZ_SKULL_STATUETTE = Quartztastic.BLOCKS.register(
            "smoky_quartz_skull_statuette", 
            registryName -> new Statuette(Statuette.StatuetteShape.SKULL_SHAPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
                .lightLevel(state -> 5)
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_SKULL_STATUETTE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_SKULL_STATUETTE
        );

        SmokyQuartzList.SMOKY_QUARTZ_GOLDFISH_STATUETTE = Quartztastic.BLOCKS.register(
            "smoky_quartz_goldfish_statuette", 
            registryName -> new Statuette(Statuette.StatuetteShape.GOLDFISH_SHAPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
                .lightLevel(state -> 3)
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_GOLDFISH_STATUETTE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_GOLDFISH_STATUETTE
        );

        SmokyQuartzList.SMOKY_QUARTZ_CHICKEN_STATUETTE = Quartztastic.BLOCKS.register(
            "smoky_quartz_chicken_statuette", 
            registryName -> new Statuette(Statuette.StatuetteShape.CHICKEN_SHAPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
                .lightLevel(state -> 3)
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_CHICKEN_STATUETTE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_CHICKEN_STATUETTE
        );

        SmokyQuartzList.SMOKY_QUARTZ_BEE_STATUETTE = Quartztastic.BLOCKS.register(
            "smoky_quartz_bee_statuette", 
            registryName -> new Statuette(Statuette.StatuetteShape.BEE_SHAPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
                .lightLevel(state -> 6)
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_BEE_STATUETTE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BEE_STATUETTE
        );

        SmokyQuartzList.SMOKY_QUARTZ_FROG_STATUETTE = Quartztastic.BLOCKS.register(
            "smoky_quartz_frog_statuette", 
            registryName -> new Statuette(Statuette.StatuetteShape.FROG_SHAPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
                .lightLevel(state -> 5)
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_FROG_STATUETTE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_FROG_STATUETTE
        );

        SmokyQuartzList.SMOKY_QUARTZ_AXOLOTL_STATUETTE = Quartztastic.BLOCKS.register(
            "smoky_quartz_axolotl_statuette", 
            registryName -> new Statuette(Statuette.StatuetteShape.AXOLOTL_SHAPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(SMOKY_QUARTZ_DESTROY_TIME, SMOKY_QUARTZ_BLAST_RESISTANCE)
                .sound(SMOKY_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
                .lightLevel(state -> 4)
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_AXOLOTL_STATUETTE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_AXOLOTL_STATUETTE
        );
    }  
    
    private static void registerFlowerPotBlocks() {

        SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT = Quartztastic.BLOCKS.register(
            "smoky_quartz_flower_pot", 
        registryName -> new FlowerPotBlock(null, () -> Blocks.AIR, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .instabreak()
            .sound(SMOKY_QUARTZ_SOUND)
            .noOcclusion()
        ));
        SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT
        );

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_POPPY = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_poppy",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.POPPY,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_POPPY_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_POPPY
        );
        

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_DANDELION = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_dandelion",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.DANDELION,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_DANDELION_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_DANDELION
        );
        

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_BLUE_ORCHID = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_blue_orchid",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.BLUE_ORCHID,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_BLUE_ORCHID_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_BLUE_ORCHID
        );
        

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_ALLIUM = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_allium",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.ALLIUM,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_ALLIUM_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_ALLIUM
        );
        

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_AZURE_BLUET = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_azure_bluet",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.AZURE_BLUET,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_AZURE_BLUET_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_AZURE_BLUET
        );
        

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_RED_TULIP = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_red_tulip",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.RED_TULIP,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_RED_TULIP_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_RED_TULIP
        );
        

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_ORANGE_TULIP = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_orange_tulip",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.ORANGE_TULIP,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_ORANGE_TULIP_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_ORANGE_TULIP
        );
        

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_WHITE_TULIP = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_white_tulip",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.WHITE_TULIP,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_WHITE_TULIP_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_WHITE_TULIP
        );
        

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_PINK_TULIP = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_pink_tulip",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.PINK_TULIP,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_PINK_TULIP_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_PINK_TULIP
        );
        

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_OXEYE_DAISY = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_oxeye_daisy",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.OXEYE_DAISY,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_OXEYE_DAISY_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_OXEYE_DAISY
        );
        

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_CORNFLOWER = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_cornflower",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.CORNFLOWER,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_CORNFLOWER_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_CORNFLOWER
        );
        

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_LILY_OF_THE_VALLEY = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_lily_of_the_valley",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.LILY_OF_THE_VALLEY,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_LILY_OF_THE_VALLEY_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_LILY_OF_THE_VALLEY
        );
        

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_WITHER_ROSE = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_wither_rose",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.WITHER_ROSE,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_WITHER_ROSE_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_WITHER_ROSE
        );
        

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_TORCHFLOWER = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_torchflower",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.TORCHFLOWER,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_TORCHFLOWER_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_TORCHFLOWER
        );
        

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_CLOSED_EYEBLOSSOM = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_closed_eyeblossom",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.CLOSED_EYEBLOSSOM,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_CLOSED_EYEBLOSSOM_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_CLOSED_EYEBLOSSOM
        );
        

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_OPEN_EYEBLOSSOM = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_open_eyeblossom",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.OPEN_EYEBLOSSOM,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_OPEN_EYEBLOSSOM_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_OPEN_EYEBLOSSOM
        );
        

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_OAK_SAPLING = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_oak_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.OAK_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_OAK_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_OAK_SAPLING
        );

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_SPRUCE_SAPLING = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_spruce_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.SPRUCE_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_SPRUCE_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_SPRUCE_SAPLING
        );

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_BIRCH_SAPLING = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_birch_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.BIRCH_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_BIRCH_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_BIRCH_SAPLING
        );

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_JUNGLE_SAPLING = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_jungle_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.JUNGLE_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_JUNGLE_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_JUNGLE_SAPLING
        );

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_ACACIA_SAPLING = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_acacia_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.ACACIA_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_ACACIA_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_ACACIA_SAPLING
        );

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_DARK_OAK_SAPLING = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_dark_oak_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.DARK_OAK_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_DARK_OAK_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_DARK_OAK_SAPLING
        );

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_AZALEA = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_azalea",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.AZALEA,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_AZALEA_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_AZALEA
        );

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_FLOWERING_AZALEA = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_flowering_azalea",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.FLOWERING_AZALEA,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_FLOWERING_AZALEA_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_FLOWERING_AZALEA
        );

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_MANGROVE_PROPAGULE = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_mangrove_propagule",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.MANGROVE_PROPAGULE,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_MANGROVE_PROPAGULE_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_MANGROVE_PROPAGULE
        );

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_CHERRY_SAPLING = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_cherry_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.CHERRY_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_CHERRY_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_CHERRY_SAPLING
        );

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_PALE_OAK_SAPLING = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_pale_oak_sapling",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.PALE_OAK_SAPLING,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_PALE_OAK_SAPLING_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_PALE_OAK_SAPLING
        );


        SmokyQuartzList.SMOKY_QUARTZ_POTTED_RED_MUSHROOM = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_red_mushroom",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.RED_MUSHROOM,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_RED_MUSHROOM_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_RED_MUSHROOM
        );

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_BROWN_MUSHROOM = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_brown_mushroom",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.BROWN_MUSHROOM,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_BROWN_MUSHROOM_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_BROWN_MUSHROOM
        );

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_CRIMSON_FUNGUS = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_crimson_fungus",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.CRIMSON_FUNGUS,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_CRIMSON_FUNGUS_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_CRIMSON_FUNGUS
        );

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_WARPED_FUNGUS = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_warped_fungus",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.WARPED_FUNGUS,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_WARPED_FUNGUS_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_WARPED_FUNGUS
        );

        
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_CRIMSON_ROOTS = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_crimson_roots",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.CRIMSON_ROOTS,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_CRIMSON_ROOTS_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_CRIMSON_ROOTS
        );

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_WARPED_ROOTS = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_warped_roots",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.WARPED_ROOTS,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_WARPED_ROOTS_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_WARPED_ROOTS
        );

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_FERN = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_fern",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.FERN,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
                .mapColor(MapColor.PLANT)
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_FERN_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_FERN
        );

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_DEAD_BUSH = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_dead_bush",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.DEAD_BUSH,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
                .mapColor(MapColor.PLANT)
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_DEAD_BUSH_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_DEAD_BUSH
        );

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_CACTUS = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_cactus",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.CACTUS,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
                .mapColor(MapColor.PLANT)
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_CACTUS_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_CACTUS
        );

        SmokyQuartzList.SMOKY_QUARTZ_POTTED_BAMBOO = Quartztastic.BLOCKS.register(
            "smoky_quartz_potted_bamboo",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.BAMBOO,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(SMOKY_QUARTZ_SOUND)
                .noOcclusion()
                .mapColor(MapColor.PLANT)
            )
        );
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_BAMBOO_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_POTTED_BAMBOO
        );
    }    
}
