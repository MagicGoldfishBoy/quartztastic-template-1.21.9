package com.quarztastic.goldfishboy.registry;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.block.Pillar;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
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

public class CitrineRegistry {

    static SoundType CITRINE_SOUND_TYPE = SoundType.AMETHYST;

    static Float CITRINE_DESTROY_TIME = 3.0f;
    static Float CITRINE_EXPLOSION_RESISTANCE = 6.0f;

    static BlockSetType CITRINE_BLOCK_SET_TYPE = BlockSetTypes.QUARTZ;
    static WoodType CITRINE_WOOD_TYPE = WoodType.CRIMSON;
    
    public static void registerAll() {

        CitrineList.CITRINE_CRYSTAL = Quartztastic.ITEMS.registerSimpleItem(
            "citrine_crystal"
        );

        CitrineList.CITRINE_ORE = Quartztastic.BLOCKS.register(
            "citrine_ore", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
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
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_BLOCK
        );

        CitrineList.CITRINE_SLAB = Quartztastic.BLOCKS.register(
            "citrine_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME / 2, CITRINE_EXPLOSION_RESISTANCE / 2)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_SLAB
        );

        CitrineList.CITRINE_STAIRS = Quartztastic.BLOCKS.register(
            "citrine_stairs", 
            registryName -> new StairBlock(
                CitrineList.CITRINE_BLOCK.get().defaultBlockState(),
                BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                    .sound(CITRINE_SOUND_TYPE)
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
                .sound(CITRINE_SOUND_TYPE)
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
                .strength(CITRINE_DESTROY_TIME / 4, CITRINE_EXPLOSION_RESISTANCE / 4)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
            )
        );
        CitrineList.CITRINE_PRESSURE_PLATE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_PRESSURE_PLATE
        );

        CitrineList.CITRINE_FENCE = Quartztastic.BLOCKS.register(
            "citrine_fence", 
            registryName -> new FenceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
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
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
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
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
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
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
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
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
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
                    .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                    .sound(CITRINE_SOUND_TYPE)
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
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
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
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
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
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
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
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_TILE_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_TILE_SLAB
        );

        CitrineList.CITRINE_TILE_STAIRS = Quartztastic.BLOCKS.register(
            "citrine_tile_stairs", 
            registryName -> new StairBlock(
                CitrineList.CITRINE_TILES.get().defaultBlockState(),
                BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                    .sound(CITRINE_SOUND_TYPE)
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
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_PILLAR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_PILLAR
        );
    }
}
