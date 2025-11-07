package com.quarztastic.goldfishboy.registry;

import com.quarztastic.goldfishboy.Quartztastic;

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

public class BlueQuartzRegistry {

    static SoundType BLUE_QUARTZ_SOUND_TYPE = SoundType.AMETHYST;

    static Float BLUE_QUARTZ_DESTROY_TIME = 3.0f;
    static Float BLUE_QUARTZ_EXPLOSION_RESISTANCE = 6.0f;

    static BlockSetType BLUE_QUARTZ_BLOCK_SET_TYPE = BlockSetTypes.QUARTZ;
    static WoodType BLUE_QUARTZ_WOOD_TYPE = WoodType.CRIMSON;

    public static void registerAll() {

        BlueQuartzList.BLUE_QUARTZ_CRYSTAL = Quartztastic.ITEMS.registerSimpleItem(
            "blue_quartz_crystal"
        );

        BlueQuartzList.BLUE_QUARTZ_ORE = Quartztastic.BLOCKS.register(
            "blue_quartz_ore", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_EXPLOSION_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        BlueQuartzList.BLUE_QUARTZ_ORE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_ORE
        );

        BlueQuartzList.BLUE_QUARTZ_BLOCK = Quartztastic.BLOCKS.register(
            "blue_quartz_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_EXPLOSION_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_BLOCK
        );

        BlueQuartzList.BLUE_QUARTZ_SLAB = Quartztastic.BLOCKS.register(
            "blue_quartz_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME / 2, BLUE_QUARTZ_EXPLOSION_RESISTANCE / 2)
                .sound(BLUE_QUARTZ_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        BlueQuartzList.BLUE_QUARTZ_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_SLAB
        );

        BlueQuartzList.BLUE_QUARTZ_STAIRS = Quartztastic.BLOCKS.register(
            "blue_quartz_stairs", 
            registryName -> new StairBlock(BlueQuartzList.BLUE_QUARTZ_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_EXPLOSION_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        BlueQuartzList.BLUE_QUARTZ_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_STAIRS
        );

        BlueQuartzList.BLUE_QUARTZ_BUTTON = Quartztastic.BLOCKS.register(
            "blue_quartz_button", 
            registryName -> new ButtonBlock(BLUE_QUARTZ_BLOCK_SET_TYPE, 25, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .noCollision()
                .sound(BLUE_QUARTZ_SOUND_TYPE)
                .noOcclusion()
            )
        );
        BlueQuartzList.BLUE_QUARTZ_BUTTON_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_BUTTON
        );

        BlueQuartzList.BLUE_QUARTZ_PRESSURE_PLATE = Quartztastic.BLOCKS.register(
            "blue_quartz_pressure_plate", 
            registryName -> new PressurePlateBlock(BLUE_QUARTZ_BLOCK_SET_TYPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME / 4, BLUE_QUARTZ_EXPLOSION_RESISTANCE / 4)
                .sound(BLUE_QUARTZ_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        BlueQuartzList.BLUE_QUARTZ_PRESSURE_PLATE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_PRESSURE_PLATE
        );

        BlueQuartzList.BLUE_QUARTZ_FENCE = Quartztastic.BLOCKS.register(
            "blue_quartz_fence", 
            registryName -> new FenceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_EXPLOSION_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        BlueQuartzList.BLUE_QUARTZ_FENCE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_FENCE
        );

        BlueQuartzList.BLUE_QUARTZ_WALL = Quartztastic.BLOCKS.register(
            "blue_quartz_wall", 
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_EXPLOSION_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        BlueQuartzList.BLUE_QUARTZ_WALL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_WALL
        );

        BlueQuartzList.BLUE_QUARTZ_GATE = Quartztastic.BLOCKS.register(
            "blue_quartz_gate", 
            registryName -> new FenceGateBlock(BLUE_QUARTZ_WOOD_TYPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_EXPLOSION_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        BlueQuartzList.BLUE_QUARTZ_GATE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_GATE
        );


        BlueQuartzList.BLUE_QUARTZ_BRICKS = Quartztastic.BLOCKS.register(
            "blue_quartz_bricks", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_EXPLOSION_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        BlueQuartzList.BLUE_QUARTZ_BRICKS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_BRICKS
        );

        BlueQuartzList.BLUE_QUARTZ_BRICK_SLAB = Quartztastic.BLOCKS.register(
            "blue_quartz_brick_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_EXPLOSION_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        BlueQuartzList.BLUE_QUARTZ_BRICK_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_BRICK_SLAB
        );

        BlueQuartzList.BLUE_QUARTZ_BRICK_STAIRS = Quartztastic.BLOCKS.register(
            "blue_quartz_brick_stairs", 
            registryName -> new StairBlock(
                BlueQuartzList.BLUE_QUARTZ_BRICKS.get().defaultBlockState(),
                BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_EXPLOSION_RESISTANCE)
                    .sound(BLUE_QUARTZ_SOUND_TYPE)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
        );
        BlueQuartzList.BLUE_QUARTZ_BRICK_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_BRICK_STAIRS
        );

        BlueQuartzList.BLUE_QUARTZ_BRICK_WALL = Quartztastic.BLOCKS.register(
            "blue_quartz_brick_wall", 
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_EXPLOSION_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        BlueQuartzList.BLUE_QUARTZ_BRICK_WALL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_BRICK_WALL
        );
    }
    
}
