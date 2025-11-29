package com.quarztastic.goldfishboy.registry.prasiolite_quartz;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.block.PrasioliteQuartzFurnaceBlock;
import com.quarztastic.goldfishboy.block.PrasioliteQuartzBlastFurnaceBlock;
import com.quarztastic.goldfishboy.block.PrasioliteQuartzOvenBlock;
import com.quarztastic.goldfishboy.block.Shelf;
import com.quarztastic.goldfishboy.block.Sink;
import com.quarztastic.goldfishboy.block.Statuette;
import com.quarztastic.goldfishboy.block.Table;
import com.quarztastic.goldfishboy.block.PrasioliteQuartzBarrelBlock;
import com.quarztastic.goldfishboy.block.PrasioliteQuartzNightstand;
import com.quarztastic.goldfishboy.block.Chair;
import com.quarztastic.goldfishboy.block.OreBlock;
import com.quarztastic.goldfishboy.block.Path;
import com.quarztastic.goldfishboy.block.Pillar;
import com.quarztastic.goldfishboy.entity.PrasioliteQuartzOvenEntity;
import com.quarztastic.goldfishboy.registry.BlockSetTypes;
import com.quarztastic.goldfishboy.entity.PrasioliteQuartzNightstandEntity;
import com.quarztastic.goldfishboy.entity.PrasioliteQuartzBarrelEntity;
import com.quarztastic.goldfishboy.entity.PrasioliteQuartzBlastFurnaceEntity;
import com.quarztastic.goldfishboy.entity.PrasioliteQuartzFurnaceEntity;

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

public class PrasioliteQuartzRegistry {

    static SoundType PRASIOLITE_QUARTZ_SOUND = SoundType.AMETHYST;

    static Float PRASIOLITE_QUARTZ_DESTROY_TIME = 3.0f;
    static Float PRASIOLITE_QUARTZ_BLAST_RESISTANCE = 6.0f;

    static BlockSetType PRASIOLITE_QUARTZ_BLOCK_SET_TYPE = BlockSetTypes.QUARTZ;
    static WoodType PRASIOLITE_QUARTZ_WOOD_TYPE = WoodType.CRIMSON;
    
    public static void registerAll() {

        registerBasicBlocks();

        registerFunctionalBlocks();

        registerDoorBlocks();

        registerFurnitureBlocks();

        registerDecorBlocks();

        registerFlowerPotBlocks();

    }

    public static void registerBasicBlocks() {

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL = Quartztastic.ITEMS.registerSimpleItem(
            "prasiolite_quartz_crystal"
        );


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_ORE = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_ore", 
            registryName -> new OreBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_ORE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_ORE
        );


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_NETHERRACK_ORE = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_netherrack_ore", 
            registryName -> new OreBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(2.0f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_NETHERRACK_ORE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_NETHERRACK_ORE
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_PANE = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_pane", 
            registryName -> new IronBarsBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME / 2, PRASIOLITE_QUARTZ_BLAST_RESISTANCE / 2)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_PANE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_PANE
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME / 2, PRASIOLITE_QUARTZ_BLAST_RESISTANCE / 2)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_STAIRS = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_stairs", 
            registryName -> new StairBlock(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_STAIRS
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BUTTON = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_button", 
            registryName -> new ButtonBlock(PRASIOLITE_QUARTZ_BLOCK_SET_TYPE, 25, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .noCollision()
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BUTTON_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_BUTTON
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_PRESSURE_PLATE = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_pressure_plate", 
            registryName -> new PressurePlateBlock(PRASIOLITE_QUARTZ_BLOCK_SET_TYPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME / 4, PRASIOLITE_QUARTZ_BLAST_RESISTANCE / 4)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_PRESSURE_PLATE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_PRESSURE_PLATE
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_FENCE = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_fence", 
            registryName -> new FenceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_FENCE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_FENCE
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_WALL = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_wall", 
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_WALL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_WALL
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_GATE = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_gate", 
            registryName -> new FenceGateBlock(PRASIOLITE_QUARTZ_WOOD_TYPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_GATE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_GATE
        );


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_bricks", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_SLAB = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_brick_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_SLAB
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_STAIRS = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_brick_stairs", 
            registryName -> new StairBlock(
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS.get().defaultBlockState(),
                BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                    .sound(PRASIOLITE_QUARTZ_SOUND)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_STAIRS
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_WALL = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_brick_wall", 
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_WALL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_WALL
        );


        PrasioliteQuartzList.CHISELED_PRASIOLITE_QUARTZ_BLOCK = Quartztastic.BLOCKS.register(
            "chiseled_prasiolite_quartz_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.CHISELED_PRASIOLITE_QUARTZ_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.CHISELED_PRASIOLITE_QUARTZ_BLOCK
        );


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILES = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_tiles", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILES_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILES
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILE_SLAB = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_tile_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME / 2, PRASIOLITE_QUARTZ_BLAST_RESISTANCE / 2)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILE_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILE_SLAB
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILE_STAIRS = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_tile_stairs", 
            registryName -> new StairBlock(PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILE_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILE_STAIRS
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_PILLAR = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_pillar", 
            registryName -> new Pillar(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_PILLAR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_PILLAR
        );


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARS_BLOCK = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_bars_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARS_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARS_BLOCK
        );


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARS = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_bars", 
            registryName -> new IronBarsBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARS
        );


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BOOKSHELF = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_bookshelf", 
            registryName -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF)
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BOOKSHELF_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_BOOKSHELF
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_LIGHT = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_light", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .lightLevel(state -> 15)
            )
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_LIGHT_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_LIGHT
        );
    }

    public static void registerFunctionalBlocks() {

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_FURNACE = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_furnace", 
            registryName -> new PrasioliteQuartzFurnaceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
            )
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_FURNACE_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "prasiolite_quartz_furnace",
            () -> new BlockEntityType<>(
            PrasioliteQuartzFurnaceEntity::new,
            false,
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_FURNACE.get())
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_FURNACE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_FURNACE
        );


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_OVEN = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_oven", 
            registryName -> new PrasioliteQuartzOvenBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
            )
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_OVEN_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "prasiolite_quartz_oven",
            () -> new BlockEntityType<>(
            PrasioliteQuartzOvenEntity::new,
            false,
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_OVEN.get())
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_OVEN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_OVEN
        );


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLAST_FURNACE = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_blast_furnace", 
            registryName -> new PrasioliteQuartzBlastFurnaceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLAST_FURNACE_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "prasiolite_quartz_blast_furnace",
            () -> new BlockEntityType<>(
            PrasioliteQuartzBlastFurnaceEntity::new,
            false,
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLAST_FURNACE.get())
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLAST_FURNACE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLAST_FURNACE
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_LADDER = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_ladder", 
            registryName -> new net.minecraft.world.level.block.LadderBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_LADDER_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_LADDER
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARREL_BLOCK = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_barrel", 
            registryName -> new PrasioliteQuartzBarrelBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARREL_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "prasiolite_quartz_barrel",
            () -> new BlockEntityType<>(
            PrasioliteQuartzBarrelEntity::new,
            false,
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARREL_BLOCK.get())
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARREL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARREL_BLOCK
        );
    }

    private static void registerDoorBlocks() {
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_DOOR = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_door", 
            registryName -> new DoorBlock(BlockSetTypes.QUARTZ, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_DOOR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_DOOR
        );


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_TRAPDOOR = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_trapdoor", 
            registryName -> new TrapDoorBlock(BlockSetTypes.QUARTZ, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_TRAPDOOR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_TRAPDOOR
        );
    }    

    private static void registerFurnitureBlocks() {
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_CHAIR = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_chair", 
            registryName -> new Chair("dining", BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_CHAIR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_CHAIR
        );


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_TABLE = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_table", 
            registryName -> new Table(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_TABLE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_TABLE
        );


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_SHELF = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_shelf", 
            registryName -> new Shelf(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_SHELF_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_SHELF
        );


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_NIGHTSTAND_BLOCK = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_nightstand", 
            registryName -> new PrasioliteQuartzNightstand(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_NIGHTSTAND_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "prasiolite_quartz_nightstand",
            () -> new BlockEntityType<>(
            PrasioliteQuartzNightstandEntity::new,
            false,
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_NIGHTSTAND_BLOCK.get())
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_NIGHTSTAND_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_NIGHTSTAND_BLOCK
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_SINK = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_sink", 
            registryName -> new Sink("basin_with_legs", BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_SINK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_SINK
        );
    }    

    private static void registerDecorBlocks() {
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_LANTERN = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_lantern", 
            registryName -> new net.minecraft.world.level.block.LanternBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .lightLevel(state -> 15)
            )
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_LANTERN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_LANTERN
        );


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_SOUL_LANTERN = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_soul_lantern", 
            registryName -> new net.minecraft.world.level.block.LanternBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .lightLevel(state -> 10)
            )
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_SOUL_LANTERN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_SOUL_LANTERN
        );


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_CHAIN = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_chain", 
            registryName -> new ChainBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_CHAIN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_CHAIN
        );


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_TORCH = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_torch", 
            registryName -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 15)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_WALL_TORCH = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_wall_torch", 
            registryName -> new net.minecraft.world.level.block.WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 15)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_TORCH_ITEM = Quartztastic.ITEMS.register(
            "prasiolite_quartz_torch", 
            registryName -> new StandingAndWallBlockItem(
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_TORCH.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_WALL_TORCH.get(), 
                Direction.DOWN, 
                new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, registryName))
        ));


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_SOUL_TORCH = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_soul_torch", 
            registryName -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 10)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_WALL_SOUL_TORCH = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_wall_soul_torch", 
            registryName -> new net.minecraft.world.level.block.WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 10)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_SOUL_TORCH_ITEM = Quartztastic.ITEMS.register(
            "prasiolite_quartz_soul_torch", 
            registryName -> new StandingAndWallBlockItem(
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_SOUL_TORCH.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_WALL_SOUL_TORCH.get(), 
                Direction.DOWN, 
                new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, registryName))
        ));

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_PATH = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_path", 
            registryName -> new Path(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.65f, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_PATH_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_PATH
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_SKULL_STATUETTE = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_skull_statuette", 
            registryName -> new Statuette("skull", BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
                .lightLevel(state -> 5)
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_SKULL_STATUETTE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_SKULL_STATUETTE
        );
    }  
    
    private static void registerFlowerPotBlocks() {

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_flower_pot", 
        registryName -> new FlowerPotBlock(null, () -> Blocks.AIR, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .instabreak()
            .sound(PRASIOLITE_QUARTZ_SOUND)
            .noOcclusion()
        ));
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_POPPY = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_potted_poppy",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.POPPY,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_POPPY_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_POPPY
        );
        

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_DANDELION = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_potted_dandelion",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.DANDELION,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_DANDELION_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_DANDELION
        );
        

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_BLUE_ORCHID = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_potted_blue_orchid",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.BLUE_ORCHID,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_BLUE_ORCHID_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_BLUE_ORCHID
        );
        

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_ALLIUM = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_potted_allium",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.ALLIUM,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_ALLIUM_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_ALLIUM
        );
        

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_AZURE_BLUET = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_potted_azure_bluet",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.AZURE_BLUET,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_AZURE_BLUET_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_AZURE_BLUET
        );
        

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_RED_TULIP = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_potted_red_tulip",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.RED_TULIP,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_RED_TULIP_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_RED_TULIP
        );
        

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_ORANGE_TULIP = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_potted_orange_tulip",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.ORANGE_TULIP,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_ORANGE_TULIP_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_ORANGE_TULIP
        );
        

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_WHITE_TULIP = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_potted_white_tulip",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.WHITE_TULIP,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_WHITE_TULIP_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_WHITE_TULIP
        );
        

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_PINK_TULIP = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_potted_pink_tulip",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.PINK_TULIP,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_PINK_TULIP_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_PINK_TULIP
        );
        

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_OXEYE_DAISY = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_potted_oxeye_daisy",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.OXEYE_DAISY,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_OXEYE_DAISY_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_OXEYE_DAISY
        );
        

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_CORNFLOWER = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_potted_cornflower",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.CORNFLOWER,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_CORNFLOWER_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_CORNFLOWER
        );
        

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_LILY_OF_THE_VALLEY = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_potted_lily_of_the_valley",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.LILY_OF_THE_VALLEY,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_LILY_OF_THE_VALLEY_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_LILY_OF_THE_VALLEY
        );
        

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_WITHER_ROSE = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_potted_wither_rose",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.WITHER_ROSE,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_WITHER_ROSE_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_WITHER_ROSE
        );
        

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_TORCHFLOWER = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_potted_torchflower",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.TORCHFLOWER,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_TORCHFLOWER_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_TORCHFLOWER
        );
        

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_potted_closed_eyeblossom",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.CLOSED_EYEBLOSSOM,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM
        );
        

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_OPEN_EYEBLOSSOM = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_potted_open_eyeblossom",
            registryName -> new FlowerPotBlock(
            () -> (FlowerPotBlock) PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT.get(),
            () -> Blocks.OPEN_EYEBLOSSOM,
            BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_OPEN_EYEBLOSSOM_ITEM = Quartztastic.UNOBTAINABLE_ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_OPEN_EYEBLOSSOM
        );

    }    
}
