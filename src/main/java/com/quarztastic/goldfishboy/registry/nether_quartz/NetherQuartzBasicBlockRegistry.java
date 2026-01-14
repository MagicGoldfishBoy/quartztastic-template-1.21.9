package com.quarztastic.goldfishboy.registry.nether_quartz;

import com.quarztastic.goldfishboy.Quartztastic;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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

public class NetherQuartzBasicBlockRegistry {

    static SoundType NETHER_QUARTZ_SOUND = SoundType.STONE;

    static Float NETHER_QUARTZ_DESTROY_TIME = 3.0f;
    static Float NETHER_QUARTZ_BLAST_RESISTANCE = 6.0f;

    static BlockSetType NETHER_QUARTZ_BLOCK_SET_TYPE = BlockSetType.STONE;
    static WoodType NETHER_QUARTZ_WOOD_TYPE = WoodType.CRIMSON;

    public static void registerAll() {

        registerFullBlocks();

        registerSlabsAndStairs();

        registerRedstoneBlocks();

        registerFenceWallsGates();

    }

    public static void registerFullBlocks() {
        NetherQuartzBasicBlockList.NETHER_QUARTZ_TEXTURE_BLOCK = Quartztastic.UNOBTAINABLE_BLOCKS.register(
            "nether_quartz_texture_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
            )
        );
    }

    public static void registerSlabsAndStairs() {

        NetherQuartzBasicBlockList.NETHER_QUARTZ_BRICK_SLAB = Quartztastic.BLOCKS.register(
            "nether_quartz_brick_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        NetherQuartzBasicBlockList.NETHER_QUARTZ_BRICK_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_BRICK_SLAB
        );

        NetherQuartzBasicBlockList.NETHER_QUARTZ_BRICK_STAIRS = Quartztastic.BLOCKS.register(
            "nether_quartz_brick_stairs", 
            registryName -> new StairBlock(
                Blocks.QUARTZ_BRICKS.defaultBlockState(),
                BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                    .sound(NETHER_QUARTZ_SOUND)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
        );
        NetherQuartzBasicBlockList.NETHER_QUARTZ_BRICK_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_BRICK_STAIRS
        );
    }

    public static void registerRedstoneBlocks() {

        NetherQuartzBasicBlockList.NETHER_QUARTZ_BUTTON = Quartztastic.BLOCKS.register(
            "nether_quartz_button", 
            registryName -> new ButtonBlock(NETHER_QUARTZ_BLOCK_SET_TYPE, 25, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .noCollision()
                .sound(NETHER_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        NetherQuartzBasicBlockList.NETHER_QUARTZ_BUTTON_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_BUTTON
        );

        NetherQuartzBasicBlockList.NETHER_QUARTZ_PRESSURE_PLATE = Quartztastic.BLOCKS.register(
            "nether_quartz_pressure_plate", 
            registryName -> new PressurePlateBlock(NETHER_QUARTZ_BLOCK_SET_TYPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME / 4, NETHER_QUARTZ_BLAST_RESISTANCE / 4)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        NetherQuartzBasicBlockList.NETHER_QUARTZ_PRESSURE_PLATE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_PRESSURE_PLATE
        );

    }

    public static void registerFenceWallsGates() {

        NetherQuartzBasicBlockList.NETHER_QUARTZ_FENCE = Quartztastic.BLOCKS.register(
            "nether_quartz_fence", 
            registryName -> new FenceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        NetherQuartzBasicBlockList.NETHER_QUARTZ_FENCE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_FENCE
        );

        NetherQuartzBasicBlockList.NETHER_QUARTZ_WALL = Quartztastic.BLOCKS.register(
            "nether_quartz_wall", 
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        NetherQuartzBasicBlockList.NETHER_QUARTZ_WALL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_WALL
        );

        NetherQuartzBasicBlockList.NETHER_QUARTZ_GATE = Quartztastic.BLOCKS.register(
            "nether_quartz_gate", 
            registryName -> new FenceGateBlock(NETHER_QUARTZ_WOOD_TYPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        NetherQuartzBasicBlockList.NETHER_QUARTZ_GATE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_GATE
        );

        NetherQuartzBasicBlockList.NETHER_QUARTZ_BRICK_WALL = Quartztastic.BLOCKS.register(
            "nether_quartz_brick_wall", 
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        NetherQuartzBasicBlockList.NETHER_QUARTZ_BRICK_WALL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_BRICK_WALL
        );


        NetherQuartzBasicBlockList.NETHER_QUARTZ_TILES = Quartztastic.BLOCKS.register(
            "nether_quartz_tiles", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        NetherQuartzBasicBlockList.NETHER_QUARTZ_TILES_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_TILES
        );

        NetherQuartzBasicBlockList.NETHER_QUARTZ_TILE_SLAB = Quartztastic.BLOCKS.register(
            "nether_quartz_tile_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME / 2, NETHER_QUARTZ_BLAST_RESISTANCE / 2)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        NetherQuartzBasicBlockList.NETHER_QUARTZ_TILE_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_TILE_SLAB
        );

        NetherQuartzBasicBlockList.NETHER_QUARTZ_TILE_STAIRS = Quartztastic.BLOCKS.register(
            "nether_quartz_tile_stairs", 
            registryName -> new StairBlock(NetherQuartzBasicBlockList.NETHER_QUARTZ_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        NetherQuartzBasicBlockList.NETHER_QUARTZ_TILE_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_TILE_STAIRS
        );
    }
    
}
