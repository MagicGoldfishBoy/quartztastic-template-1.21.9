package com.quarztastic.goldfishboy.registry;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.block.OreBlock;
import com.quarztastic.goldfishboy.block.Pillar;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
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
    }
}
