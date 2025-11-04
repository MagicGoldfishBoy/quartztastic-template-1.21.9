package com.quarztastic.goldfishboy.registry;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.block.Chair;
import com.quarztastic.goldfishboy.block.CitrineBlastFurnaceBlock;
import com.quarztastic.goldfishboy.block.CitrineFurnaceBlock;
import com.quarztastic.goldfishboy.block.CitrineOvenBlock;
import com.quarztastic.goldfishboy.block.Pillar;
import com.quarztastic.goldfishboy.block.Shelf;
import com.quarztastic.goldfishboy.block.Table;
import com.quarztastic.goldfishboy.entity.CitrineBlastFurnaceEntity;
import com.quarztastic.goldfishboy.entity.CitrineFurnaceEntity;
import com.quarztastic.goldfishboy.entity.CitrineOvenEntity;
import com.quarztastic.goldfishboy.entity.RoseQuartzFurnaceEntity;

import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
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


        CitrineList.CITRINE_BARS_BLOCK = Quartztastic.BLOCKS.register(
            "citrine_bars_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_BARS_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_BARS_BLOCK
        );

        CitrineList.CITRINE_BARS = Quartztastic.BLOCKS.register(
            "citrine_bars", 
            registryName  -> new IronBarsBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME / 2, CITRINE_EXPLOSION_RESISTANCE / 2)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_BARS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_BARS
        );


        CitrineList.CITRINE_BOOKSHELF = Quartztastic.BLOCKS.register(
            "citrine_bookshelf", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_BOOKSHELF_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_BOOKSHELF
        );

        CitrineList.CITRINE_FURNACE = Quartztastic.BLOCKS.register(
            "citrine_furnace", 
            registryName -> new CitrineFurnaceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_FURNACE_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "citrine_furnace",
            () -> new BlockEntityType<>(
            CitrineFurnaceEntity::new,
            false,
            CitrineList.CITRINE_FURNACE.get())
        );
        CitrineList.CITRINE_FURNACE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_FURNACE
        );

        CitrineList.CITRINE_OVEN = Quartztastic.BLOCKS.register(
            "citrine_oven", 
            registryName -> new CitrineOvenBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_OVEN_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "citrine_oven", 
            () -> new BlockEntityType<>(
                CitrineOvenEntity::new, 
                false,
                CitrineList.CITRINE_OVEN.get())
        );
        CitrineList.CITRINE_OVEN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_OVEN
        );

        CitrineList.CITRINE_BLAST_FURNACE = Quartztastic.BLOCKS.register(
            "citrine_blast_furnace", 
            registryName -> new CitrineBlastFurnaceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_BLAST_FURNACE_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "citrine_blast_furnace", 
            () -> new BlockEntityType<>(
                CitrineBlastFurnaceEntity::new,
                false,
                CitrineList.CITRINE_BLAST_FURNACE.get()
            )
        );
        CitrineList.CITRINE_BLAST_FURNACE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_BLAST_FURNACE
        );


        CitrineList.CITRINE_DOOR = Quartztastic.BLOCKS.register(
            "citrine_door", 
            registryName -> new DoorBlock(CITRINE_BLOCK_SET_TYPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_DOOR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_DOOR
        );

        CitrineList.CITRINE_TRAPDOOR = Quartztastic.BLOCKS.register(
            "citrine_trapdoor", 
            registryName -> new TrapDoorBlock(CITRINE_BLOCK_SET_TYPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_TRAPDOOR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_TRAPDOOR
        );


        CitrineList.CITRINE_CHAIR = Quartztastic.BLOCKS.register(
            "citrine_chair", 
            registryName -> new Chair("dining", BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_CHAIR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_CHAIR
        );

        CitrineList.CITRINE_TABLE = Quartztastic.BLOCKS.register(
            "citrine_table", 
            registryName -> new Table(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_TABLE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_TABLE
        );

        CitrineList.CITRINE_SHELF = Quartztastic.BLOCKS.register(
            "citrine_shelf", 
            registryName -> new Shelf(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_SHELF_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_SHELF
        );

        CitrineList.CITRINE_LIGHT = Quartztastic.BLOCKS.register(
            "citrine_light", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
                .lightLevel(state -> 15)
            )
        );
        CitrineList.CITRINE_LIGHT_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_LIGHT
        );

        CitrineList.CITRINE_LANTERN = Quartztastic.BLOCKS.register(
            "citrine_lantern", 
            registryName -> new LanternBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
                .lightLevel(state -> 15)
            )
        );
        CitrineList.CITRINE_LANTERN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_LANTERN
        );

        CitrineList.CITRINE_SOUL_LANTERN = Quartztastic.BLOCKS.register(
            "citrine_soul_lantern", 
            registryName -> new LanternBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
                .lightLevel(state -> 10)
            )
        );
        CitrineList.CITRINE_SOUL_LANTERN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_SOUL_LANTERN
        );

        CitrineList.CITRINE_CHAIN = Quartztastic.BLOCKS.register(
            "citrine_chain", 
            registryName -> new ChainBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_CHAIN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_CHAIN
        );


        CitrineList.CITRINE_TORCH = Quartztastic.BLOCKS.register(
            "citrine_torch", 
            registryName -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 15)
                .sound(CITRINE_SOUND_TYPE)
                .noOcclusion()
            )
        );

        CitrineList.CITRINE_WALL_TORCH = Quartztastic.BLOCKS.register(
            "citrine_wall_torch", 
            registryName -> new net.minecraft.world.level.block.WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 15)
                .sound(CITRINE_SOUND_TYPE)
                .noOcclusion()
            )
        );

        CitrineList.CITRINE_TORCH_ITEM = Quartztastic.ITEMS.register(
            "citrine_torch", 
            registryName -> new StandingAndWallBlockItem(
                CitrineList.CITRINE_TORCH.get(),
                CitrineList.CITRINE_WALL_TORCH.get(), 
                Direction.DOWN, 
                new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, registryName))
        ));


        CitrineList.CITRINE_SOUL_TORCH = Quartztastic.BLOCKS.register(
            "citrine_soul_torch", 
            registryName -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 10)
                .sound(CITRINE_SOUND_TYPE)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_WALL_SOUL_TORCH = Quartztastic.BLOCKS.register(
            "citrine_wall_soul_torch", 
            registryName -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 10)
                .sound(CITRINE_SOUND_TYPE)
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_SOUL_TORCH_ITEM = Quartztastic.ITEMS.register(
            "citrine_soul_torch", 
            registryName -> new StandingAndWallBlockItem(
                CitrineList.CITRINE_SOUL_TORCH.get(),
                CitrineList.CITRINE_WALL_SOUL_TORCH.get(), 
                Direction.DOWN, 
                new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, registryName))
        ));

        CitrineList.CITRINE_LADDER = Quartztastic.BLOCKS.register(
            "citrine_ladder", 
            registryName -> new LadderBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(CITRINE_DESTROY_TIME, CITRINE_EXPLOSION_RESISTANCE)
                .sound(CITRINE_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_LADDER_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_LADDER
        );
    }
}
