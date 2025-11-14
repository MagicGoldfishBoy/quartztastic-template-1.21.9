package com.quarztastic.goldfishboy.registry;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.block.OreBlock;
import com.quarztastic.goldfishboy.block.Pillar;
import com.quarztastic.goldfishboy.block.BlueQuartzBlastFurnaceBlock;
import com.quarztastic.goldfishboy.block.BlueQuartzOvenBlock;
import com.quarztastic.goldfishboy.block.BlueQuartzFurnaceBlock;
import com.quarztastic.goldfishboy.entity.BlueQuartzFurnaceEntity;
import com.quarztastic.goldfishboy.entity.BlueQuartzOvenEntity;
import com.quarztastic.goldfishboy.entity.BlueQuartzBlastFurnaceEntity;
import com.quarztastic.goldfishboy.entity.BlueQuartzFurnaceEntity;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class BlueQuartzRegistry {

    static SoundType BLUE_QUARTZ_SOUND = SoundType.AMETHYST;

    static Float BLUE_QUARTZ_DESTROY_TIME = 3.0f;
    static Float BLUE_QUARTZ_BLAST_RESISTANCE = 6.0f;

    static BlockSetType BLUE_QUARTZ_BLOCK_SET_TYPE = BlockSetTypes.QUARTZ;
    static WoodType BLUE_QUARTZ_WOOD_TYPE = WoodType.CRIMSON;

    public static void registerAll() {

        BlueQuartzList.BLUE_QUARTZ_CRYSTAL = Quartztastic.ITEMS.registerSimpleItem(
            "blue_quartz_crystal"
        );

        BlueQuartzList.BLUE_QUARTZ_ORE = Quartztastic.BLOCKS.register(
            "blue_quartz_ore", 
            registryName -> new OreBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
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
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_BLOCK
        );

        BlueQuartzList.BLUE_QUARTZ_PANE = Quartztastic.BLOCKS.register(
            "blue_quartz_pane", 
            registryName -> new IronBarsBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME / 2, BLUE_QUARTZ_BLAST_RESISTANCE / 2)
                .sound(BLUE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        BlueQuartzList.BLUE_QUARTZ_PANE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_PANE
        );

        BlueQuartzList.BLUE_QUARTZ_SLAB = Quartztastic.BLOCKS.register(
            "blue_quartz_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME / 2, BLUE_QUARTZ_BLAST_RESISTANCE / 2)
                .sound(BLUE_QUARTZ_SOUND)
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
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
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
                .sound(BLUE_QUARTZ_SOUND)
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
                .strength(BLUE_QUARTZ_DESTROY_TIME / 4, BLUE_QUARTZ_BLAST_RESISTANCE / 4)
                .sound(BLUE_QUARTZ_SOUND)
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
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
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
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
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
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
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
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
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
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
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
                    .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                    .sound(BLUE_QUARTZ_SOUND)
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
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        BlueQuartzList.BLUE_QUARTZ_BRICK_WALL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_BRICK_WALL
        );



        BlueQuartzList.CHISELED_BLUE_QUARTZ_BLOCK = Quartztastic.BLOCKS.register(
            "chiseled_blue_quartz_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        BlueQuartzList.CHISELED_BLUE_QUARTZ_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.CHISELED_BLUE_QUARTZ_BLOCK
        );



        BlueQuartzList.BLUE_QUARTZ_TILES = Quartztastic.BLOCKS.register(
            "blue_quartz_tiles", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        BlueQuartzList.BLUE_QUARTZ_TILES_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_TILES
        );


        BlueQuartzList.BLUE_QUARTZ_TILE_SLAB = Quartztastic.BLOCKS.register(
            "blue_quartz_tile_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME / 2, BLUE_QUARTZ_BLAST_RESISTANCE / 2)
                .sound(BLUE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        BlueQuartzList.BLUE_QUARTZ_TILE_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_TILE_SLAB
        );


        BlueQuartzList.BLUE_QUARTZ_TILE_STAIRS = Quartztastic.BLOCKS.register(
            "blue_quartz_tile_stairs", 
            registryName -> new StairBlock(BlueQuartzList.BLUE_QUARTZ_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        BlueQuartzList.BLUE_QUARTZ_TILE_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_TILE_STAIRS
        );


        BlueQuartzList.BLUE_QUARTZ_PILLAR = Quartztastic.BLOCKS.register(
            "blue_quartz_pillar", 
            registryName -> new Pillar(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        BlueQuartzList.BLUE_QUARTZ_PILLAR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_PILLAR
        );


        BlueQuartzList.BLUE_QUARTZ_BARS_BLOCK = Quartztastic.BLOCKS.register(
            "blue_quartz_bars_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        BlueQuartzList.BLUE_QUARTZ_BARS_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_BARS_BLOCK
        );


        BlueQuartzList.BLUE_QUARTZ_BARS = Quartztastic.BLOCKS.register(
            "blue_quartz_bars", 
            registryName -> new IronBarsBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        BlueQuartzList.BLUE_QUARTZ_BARS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_BARS
        );


        BlueQuartzList.BLUE_QUARTZ_BOOKSHELF = Quartztastic.BLOCKS.register(
            "blue_quartz_bookshelf", 
            registryName -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF)
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        BlueQuartzList.BLUE_QUARTZ_BOOKSHELF_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_BOOKSHELF
        );


        BlueQuartzList.BLUE_QUARTZ_FURNACE = Quartztastic.BLOCKS.register(
            "blue_quartz_furnace", 
            registryName -> new BlueQuartzFurnaceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
            )
        );

        BlueQuartzList.BLUE_QUARTZ_FURNACE_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "blue_quartz_furnace",
            () -> new BlockEntityType<>(
            BlueQuartzFurnaceEntity::new,
            false,
            BlueQuartzList.BLUE_QUARTZ_FURNACE.get())
        );

        BlueQuartzList.BLUE_QUARTZ_FURNACE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_FURNACE
        );


        BlueQuartzList.BLUE_QUARTZ_OVEN = Quartztastic.BLOCKS.register(
            "blue_quartz_oven", 
            registryName -> new BlueQuartzOvenBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
            )
        );

        BlueQuartzList.BLUE_QUARTZ_OVEN_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "blue_quartz_oven",
            () -> new BlockEntityType<>(
            BlueQuartzOvenEntity::new,
            false,
            BlueQuartzList.BLUE_QUARTZ_OVEN.get())
        );

        BlueQuartzList.BLUE_QUARTZ_OVEN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_OVEN
        );


        BlueQuartzList.BLUE_QUARTZ_BLAST_FURNACE = Quartztastic.BLOCKS.register(
            "blue_quartz_blast_furnace", 
            registryName -> new BlueQuartzBlastFurnaceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
            )
        );

        BlueQuartzList.BLUE_QUARTZ_BLAST_FURNACE_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "blue_quartz_blast_furnace",
            () -> new BlockEntityType<>(
            BlueQuartzBlastFurnaceEntity::new,
            false,
            BlueQuartzList.BLUE_QUARTZ_BLAST_FURNACE.get())
        );

        BlueQuartzList.BLUE_QUARTZ_BLAST_FURNACE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_BLAST_FURNACE
        );


        BlueQuartzList.BLUE_QUARTZ_DOOR = Quartztastic.BLOCKS.register(
            "blue_quartz_door", 
            registryName -> new DoorBlock(BlockSetTypes.QUARTZ, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        BlueQuartzList.BLUE_QUARTZ_DOOR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_DOOR
        );


        BlueQuartzList.BLUE_QUARTZ_TRAPDOOR = Quartztastic.BLOCKS.register(
            "blue_quartz_trapdoor", 
            registryName -> new TrapDoorBlock(BlockSetTypes.QUARTZ, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_BLAST_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        BlueQuartzList.BLUE_QUARTZ_TRAPDOOR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_TRAPDOOR
        );
    }
    
}
