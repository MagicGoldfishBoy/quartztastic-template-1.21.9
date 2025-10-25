package com.quarztastic.goldfishboy.registry;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.block.Chair;
import com.quarztastic.goldfishboy.block.Pillar;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
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
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SmokyQuartzList.SMOKY_QUARTZ_ORE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SmokyQuartzList.SMOKY_QUARTZ_ORE
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
                .strength(0.4f, 2.0f)
                .sound(SoundType.AMETHYST_CLUSTER)
                .instabreak()
                .noOcclusion()
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
            "smoky_quartz_tiles_slab", 
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
            "smoky_quartz_tiles_stairs", 
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
            registryName -> new Chair(BlockBehaviour.Properties.of()
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

    }
    
}
