package com.quarztastic.goldfishboy.registry;

import java.util.Properties;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.block.Chair;
import com.quarztastic.goldfishboy.block.Pillar;
import com.quarztastic.goldfishboy.block.Shelf;
import com.quarztastic.goldfishboy.block.Sink;
import com.quarztastic.goldfishboy.block.SmokyQuartzBarrelBlock;
import com.quarztastic.goldfishboy.block.SmokyQuartzBlastFurnaceBlock;
import com.quarztastic.goldfishboy.block.SmokyQuartzFurnaceBlock;
import com.quarztastic.goldfishboy.block.SmokyQuartzNightstand;
import com.quarztastic.goldfishboy.block.SmokyQuartzOvenBlock;
import com.quarztastic.goldfishboy.block.Table;
import com.quarztastic.goldfishboy.entity.SmokyQuartzBarrelEntity;
import com.quarztastic.goldfishboy.entity.SmokyQuartzBlastFurnaceEntity;
import com.quarztastic.goldfishboy.entity.SmokyQuartzFurnaceEntity;
import com.quarztastic.goldfishboy.entity.SmokyQuartzNightstandEntity;
import com.quarztastic.goldfishboy.entity.SmokyQuartzOvenEntity;

import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
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
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.trialspawner.TrialSpawner.FlameParticle;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class SmokyQuartzRegistry {

    public static void registerAll() {

        SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL = Quartztastic.ITEMS.registerSimpleItem(
            "smoky_quartz_crystal"
        );


        SmokyQuartzList.SMOKY_QUARTZ_ORE = Quartztastic.BLOCKS.register(
            "smoky_quartz_ore", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(2.0f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_ORE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_ORE
        );


        SmokyQuartzList.SMOKY_QUARTZ_NETHERRACK_ORE = Quartztastic.BLOCKS.register(
            "smoky_quartz_netherrack_ore", 
            registryName -> new Block(BlockBehaviour.Properties.of()
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
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BLOCK
        );


        SmokyQuartzList.SMOKY_QUARTZ_SLAB = Quartztastic.BLOCKS.register(
            "smoky_quartz_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
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
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_STAIRS
        );


        SmokyQuartzList.SMOKY_QUARTZ_BUTTON = Quartztastic.BLOCKS.register(
            "smoky_quartz_button", 
            registryName -> new ButtonBlock(BlockSetTypes.QUARTZ, 25, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .sound(SoundType.AMETHYST_CLUSTER)
                .instabreak()
                .noOcclusion()
                .noCollision()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_BUTTON_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BUTTON
        );


        SmokyQuartzList.SMOKY_QUARTZ_PRESSURE_PLATE = Quartztastic.BLOCKS.register(
            "smoky_quartz_pressure_plate", 
            registryName -> new PressurePlateBlock(BlockSetTypes.QUARTZ, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.4f, 2.0f)
                .sound(SoundType.AMETHYST_CLUSTER)
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
                .strength(0.4f, 2.0f)
                .sound(SoundType.AMETHYST)
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
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_WALL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_WALL
        );


        SmokyQuartzList.SMOKY_QUARTZ_GATE = Quartztastic.BLOCKS.register(
            "smoky_quartz_gate", 
            registryName -> new FenceGateBlock(WoodType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.4f, 2.0f)
                .sound(SoundType.AMETHYST_CLUSTER)
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
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BRICKS
        );


        SmokyQuartzList.SMOKY_QUARTZ_BRICKS_SLAB = Quartztastic.BLOCKS.register(
            "smoky_quartz_bricks_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_BRICKS_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BRICKS_SLAB
        );


        SmokyQuartzList.SMOKY_QUARTZ_BRICKS_STAIRS = Quartztastic.BLOCKS.register(
            "smoky_quartz_bricks_stairs", 
            registryName -> new StairBlock(SmokyQuartzList.SMOKY_QUARTZ_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_BRICKS_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BRICKS_STAIRS
        );


        SmokyQuartzList.SMOKY_QUARTZ_BRICK_WALL = Quartztastic.BLOCKS.register(
            "smoky_quartz_brick_wall", 
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
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
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
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
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .noOcclusion()
            )
        );


        SmokyQuartzList.SMOKY_QUARTZ_TILES_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_TILES
        );


        SmokyQuartzList.SMOKY_QUARTZ_TILES_SLAB = Quartztastic.BLOCKS.register(
            "smoky_quartz_tile_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_TILES_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_TILES_SLAB
        );


        SmokyQuartzList.SMOKY_QUARTZ_TILES_STAIRS = Quartztastic.BLOCKS.register(
            "smoky_quartz_tile_stairs", 
            registryName -> new StairBlock(SmokyQuartzList.SMOKY_QUARTZ_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_TILES_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_TILES_STAIRS
        );


        BlockBehaviour.Properties.of();
        SmokyQuartzList.SMOKY_QUARTZ_BOOKSHELF = Quartztastic.BLOCKS.register(
            "smoky_quartz_bookshelf", 
            registryName -> new Block(net.minecraft.world.level.block.state.BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF)
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_BOOKSHELF_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BOOKSHELF
        );



        SmokyQuartzList.SMOKY_QUARTZ_FURNACE_BLOCK = Quartztastic.BLOCKS.register(
            "smoky_quartz_furnace", 
            registryName -> new SmokyQuartzFurnaceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.AMETHYST)
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_FURNACE_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "smoky_quartz_furnace_entity",
            () -> new BlockEntityType<>(
                SmokyQuartzFurnaceEntity::new,
                false,
                SmokyQuartzList.SMOKY_QUARTZ_FURNACE_BLOCK.get())
        );

        SmokyQuartzList.SMOKY_QUARTZ_FURNACE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_FURNACE_BLOCK
        );


        SmokyQuartzList.SMOKY_QUARTZ_OVEN_BLOCK = Quartztastic.BLOCKS.register(
            "smoky_quartz_oven", 
            registryName -> new SmokyQuartzOvenBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.AMETHYST)
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_OVEN_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "smoky_quartz_oven_entity",
            () -> new BlockEntityType<>(
                SmokyQuartzOvenEntity::new,
                false,
                SmokyQuartzList.SMOKY_QUARTZ_OVEN_BLOCK.get())
        );

        SmokyQuartzList.SMOKY_QUARTZ_OVEN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_OVEN_BLOCK
        );


        SmokyQuartzList.SMOKY_QUARTZ_BLAST_FURNACE_BLOCK = Quartztastic.BLOCKS.register(
            "smoky_quartz_blast_furnace", 
            registryName -> new SmokyQuartzBlastFurnaceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.AMETHYST)
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_BLAST_FURNACE_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "smoky_quartz_blast_furnace_entity",
            () -> new BlockEntityType<>(
                SmokyQuartzBlastFurnaceEntity::new,
                false,
                SmokyQuartzList.SMOKY_QUARTZ_BLAST_FURNACE_BLOCK.get())
        );

        SmokyQuartzList.SMOKY_QUARTZ_BLAST_FURNACE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BLAST_FURNACE_BLOCK
        );



        SmokyQuartzList.SMOKY_QUARTZ_PILLAR = Quartztastic.BLOCKS.register(
            "smoky_quartz_pillar", 
            registryName -> new Pillar(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_PILLAR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_PILLAR
        );



        SmokyQuartzList.SMOKY_QUARTZ_DOOR = Quartztastic.BLOCKS.register(
            "smoky_quartz_door", 
            registryName -> new DoorBlock(BlockSetTypes.QUARTZ, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_DOOR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_DOOR
        );


        SmokyQuartzList.SMOKY_QUARTZ_CHAIR = Quartztastic.BLOCKS.register(
            "smoky_quartz_chair", 
            registryName -> new Chair("diner", BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
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
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
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
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_SHELF_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_SHELF
        );


        SmokyQuartzList.SMOKY_QUARTZ_LIGHT = Quartztastic.BLOCKS.register(
            "smoky_quartz_light", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .lightLevel(state -> 15)
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_LIGHT_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_LIGHT
        );


        SmokyQuartzList.SMOKY_QUARTZ_LANTERN = Quartztastic.BLOCKS.register(
            "smoky_quartz_lantern", 
            registryName -> new LanternBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .lightLevel(state -> 15)
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_LANTERN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_LANTERN
        );


        SmokyQuartzList.SMOKY_QUARTZ_SOUL_LANTERN = Quartztastic.BLOCKS.register(
            "smoky_quartz_soul_lantern", 
            registryName -> new LanternBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .lightLevel(state -> 15)
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_SOUL_LANTERN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_SOUL_LANTERN
        );


        SmokyQuartzList.SMOKY_QUARTZ_CHAIN = Quartztastic.BLOCKS.register(
            "smoky_quartz_chain", 
            registryName -> new ChainBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_CHAIN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_CHAIN
        );


        SmokyQuartzList.SMOKY_QUARTZ_TORCH = Quartztastic.BLOCKS.register(
            "smoky_quartz_torch", 
            registryName -> new TorchBlock(ParticleTypes.FLAME , BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .sound(SoundType.AMETHYST)
                .instabreak()
                .noOcclusion()
                .noCollision()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_WALL_TORCH = Quartztastic.BLOCKS.register(
            "smoky_quartz_wall_torch", 
            registryName -> new WallTorchBlock(ParticleTypes.FLAME , BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .sound(SoundType.AMETHYST)
                .instabreak()
                .noOcclusion()
                .noCollision()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_TORCH_ITEM = Quartztastic.ITEMS.register(
            "smoky_quartz_torch", 
            registryName -> new StandingAndWallBlockItem(SmokyQuartzList.SMOKY_QUARTZ_TORCH.get(), SmokyQuartzList.SMOKY_QUARTZ_WALL_TORCH.get(), Direction.DOWN, new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM, registryName))
            )
        );


        SmokyQuartzList.SMOKY_QUARTZ_SOUL_TORCH = Quartztastic.BLOCKS.register(
            "smoky_quartz_soul_torch", 
            registryName -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME , BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .sound(SoundType.AMETHYST)
                .instabreak()
                .noOcclusion()
                .noCollision()
            )
        ); 

        SmokyQuartzList.SMOKY_QUARTZ_WALL_SOUL_TORCH = Quartztastic.BLOCKS.register(
            "smoky_quartz_wall_soul_torch", 
            registryName -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME , BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .sound(SoundType.AMETHYST)
                .instabreak()
                .noOcclusion()
                .noCollision()
            )
        ); 

        SmokyQuartzList.SMOKY_QUARTZ_SOUL_TORCH_ITEM = Quartztastic.ITEMS.register(
            "smoky_quartz_soul_torch", 
            registryName -> new StandingAndWallBlockItem(SmokyQuartzList.SMOKY_QUARTZ_SOUL_TORCH.get(), SmokyQuartzList.SMOKY_QUARTZ_WALL_SOUL_TORCH.get(), Direction.DOWN, new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM, registryName))
            )
        );


        SmokyQuartzList.SMOKY_QUARTZ_LADDER = Quartztastic.BLOCKS.register(
            "smoky_quartz_ladder", 
            registryName -> new LadderBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .sound(SoundType.AMETHYST_CLUSTER)
                .strength(0.8f, 4.0f)
                .noOcclusion()
                .requiresCorrectToolForDrops()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_LADDER_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_LADDER
        );


        SmokyQuartzList.SMOKY_QUARTZ_BARREL = Quartztastic.BLOCKS.register(
            "smoky_quartz_barrel", 
            registryName -> new SmokyQuartzBarrelBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.AMETHYST)
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_BARREL_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "smoky_quartz_barrel_entity",
            () -> new BlockEntityType<>(
                SmokyQuartzBarrelEntity::new,
                false,
                SmokyQuartzList.SMOKY_QUARTZ_BARREL.get())
        );

        SmokyQuartzList.SMOKY_QUARTZ_BARREL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_BARREL
        );


        SmokyQuartzList.SMOKY_QUARTZ_NIGHTSTAND = Quartztastic.BLOCKS.register(
            "smoky_quartz_nightstand", 
            registryName -> new SmokyQuartzNightstand(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.AMETHYST)
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_NIGHTSTAND_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "smoky_quartz_nightstand_entity",
            () -> new BlockEntityType<>(
                SmokyQuartzNightstandEntity::new,
                false,
                SmokyQuartzList.SMOKY_QUARTZ_NIGHTSTAND.get())
        );

        SmokyQuartzList.SMOKY_QUARTZ_NIGHTSTAND_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_NIGHTSTAND
        );


        SmokyQuartzList.SMOKY_QUARTZ_SINK = Quartztastic.BLOCKS.register(
            "smoky_quartz_sink", 
            registryName -> new Sink(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.AMETHYST)
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_SINK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_SINK
        );

    }
    
}
