package com.quarztastic.goldfishboy.registry;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.block.Chair;
import com.quarztastic.goldfishboy.block.Pillar;
import com.quarztastic.goldfishboy.block.RoseQuartzBlastFurnaceBlock;
import com.quarztastic.goldfishboy.block.RoseQuartzFurnaceBlock;
import com.quarztastic.goldfishboy.block.RoseQuartzOvenBlock;
import com.quarztastic.goldfishboy.block.Shelf;
import com.quarztastic.goldfishboy.block.Table;
import com.quarztastic.goldfishboy.entity.RoseQuartzBlastFurnaceEntity;
import com.quarztastic.goldfishboy.entity.RoseQuartzFurnaceEntity;
import com.quarztastic.goldfishboy.entity.SmokyQuartzFurnaceEntity;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class RoseQuartzRegistry {

   static SoundType ROSE_QUARTZ_SOUND = SoundType.AMETHYST;

   static float ROSE_QUARTZ_DESTROY_TIME = 2.0f;
   static float ROSE_QUARTZ_BLAST_RESISTANCE = 4.0f;

    public static void registerAll() {

            RoseQuartzList.ROSE_QUARTZ_CRYSTAL = Quartztastic.ITEMS.registerSimpleItem(
                "rose_quartz_crystal"
            );

            RoseQuartzList.ROSE_QUARTZ_ORE = Quartztastic.BLOCKS.register(
                "rose_quartz_ore", 
                registryName -> new Block(BlockBehaviour.Properties.of()
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
                registryName -> new ButtonBlock(BlockSetTypes.QUARTZ, 25, BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .instabreak()
                    .sound(ROSE_QUARTZ_SOUND)
                    .noOcclusion()
                    .noCollision()
                )
            );

            RoseQuartzList.ROSE_QUARTZ_BUTTON_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
                RoseQuartzList.ROSE_QUARTZ_BUTTON
            );


            RoseQuartzList.ROSE_QUARTZ_PRESSURE_PLATE = Quartztastic.BLOCKS.register(
                "rose_quartz_pressure_plate", 
                registryName -> new net.minecraft.world.level.block.PressurePlateBlock(BlockSetTypes.QUARTZ, BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .strength(ROSE_QUARTZ_DESTROY_TIME / 2, ROSE_QUARTZ_BLAST_RESISTANCE / 2)
                    .sound(ROSE_QUARTZ_SOUND)
                    .noOcclusion()
                )
            );

            RoseQuartzList.ROSE_QUARTZ_PRESSURE_PLATE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
                RoseQuartzList.ROSE_QUARTZ_PRESSURE_PLATE
            );


            RoseQuartzList.ROSE_QUARTZ_FENCE = Quartztastic.BLOCKS.register(
                "rose_quartz_fence", 
                registryName -> new net.minecraft.world.level.block.FenceBlock(BlockBehaviour.Properties.of()
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
                registryName -> new FenceGateBlock(WoodType.CRIMSON, BlockBehaviour.Properties.of()
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
                    .strength(ROSE_QUARTZ_DESTROY_TIME / 2, ROSE_QUARTZ_BLAST_RESISTANCE / 2)
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
                registryName -> new StairBlock(RoseQuartzList.ROSE_QUARTZ_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
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
                RoseQuartzFurnaceEntity::new,
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


            RoseQuartzList.ROSE_QUARTZ_CHAIR = Quartztastic.BLOCKS.register(
                "rose_quartz_chair", 
                registryName -> new Chair("royal", BlockBehaviour.Properties.of()
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
}
