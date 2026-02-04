package com.quarztastic.goldfishboy.registry.nether_quartz;

import com.quarztastic.goldfishboy.Quartztastic;

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
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
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

        registerDoors();

        registerLanternsChainsTorches();

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

        NetherQuartzBasicBlockList.NETHER_QUARTZ_LIGHT = Quartztastic.BLOCKS.register(
            "nether_quartz_light", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.3f)
                .lightLevel(state -> 15)
                .sound(NETHER_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        NetherQuartzBasicBlockList.NETHER_QUARTZ_LIGHT_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_LIGHT
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


        NetherQuartzBasicBlockList.NETHER_QUARTZ_BARS_BLOCK = Quartztastic.BLOCKS.register(
            "nether_quartz_bars_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        NetherQuartzBasicBlockList.NETHER_QUARTZ_BARS_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_BARS_BLOCK
        );


        NetherQuartzBasicBlockList.NETHER_QUARTZ_BARS = Quartztastic.BLOCKS.register(
            "nether_quartz_bars", 
            registryName -> new IronBarsBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        NetherQuartzBasicBlockList.NETHER_QUARTZ_BARS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_BARS
        );


        NetherQuartzBasicBlockList.NETHER_QUARTZ_BOOKSHELF = Quartztastic.BLOCKS.register(
            "nether_quartz_bookshelf", 
            registryName -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF)
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        NetherQuartzBasicBlockList.NETHER_QUARTZ_BOOKSHELF_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_BOOKSHELF
        );
    }

    public static void registerDoors() {

        NetherQuartzBasicBlockList.NETHER_QUARTZ_DOOR = Quartztastic.BLOCKS.register(
            "nether_quartz_door", 
            registryName -> new DoorBlock(NETHER_QUARTZ_BLOCK_SET_TYPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        NetherQuartzBasicBlockList.NETHER_QUARTZ_DOOR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_DOOR
        );


        NetherQuartzBasicBlockList.NETHER_QUARTZ_TRAPDOOR = Quartztastic.BLOCKS.register(
            "nether_quartz_trapdoor", 
            registryName -> new TrapDoorBlock(NETHER_QUARTZ_BLOCK_SET_TYPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        NetherQuartzBasicBlockList.NETHER_QUARTZ_TRAPDOOR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_TRAPDOOR
        );
    }

    public static void registerLanternsChainsTorches() {

        NetherQuartzBasicBlockList.NETHER_QUARTZ_LANTERN = Quartztastic.BLOCKS.register(
            "nether_quartz_lantern", 
            registryName -> new net.minecraft.world.level.block.LanternBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .lightLevel(state -> 15)
            )
        );

        NetherQuartzBasicBlockList.NETHER_QUARTZ_LANTERN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_LANTERN
        );


        NetherQuartzBasicBlockList.NETHER_QUARTZ_SOUL_LANTERN = Quartztastic.BLOCKS.register(
            "nether_quartz_soul_lantern", 
            registryName -> new net.minecraft.world.level.block.LanternBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .lightLevel(state -> 10)
            )
        );

        NetherQuartzBasicBlockList.NETHER_QUARTZ_SOUL_LANTERN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_SOUL_LANTERN
        );


        NetherQuartzBasicBlockList.NETHER_QUARTZ_CHAIN = Quartztastic.BLOCKS.register(
            "nether_quartz_chain", 
            registryName -> new ChainBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        NetherQuartzBasicBlockList.NETHER_QUARTZ_CHAIN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_CHAIN
        );


        NetherQuartzBasicBlockList.NETHER_QUARTZ_TORCH = Quartztastic.BLOCKS.register(
            "nether_quartz_torch", 
            registryName -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 15)
                .sound(NETHER_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        NetherQuartzBasicBlockList.NETHER_QUARTZ_WALL_TORCH = Quartztastic.BLOCKS.register(
            "nether_quartz_wall_torch", 
            registryName -> new net.minecraft.world.level.block.WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 15)
                .sound(NETHER_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        NetherQuartzBasicBlockList.NETHER_QUARTZ_TORCH_ITEM = Quartztastic.ITEMS.register(
            "nether_quartz_torch", 
            registryName -> new StandingAndWallBlockItem(
                NetherQuartzBasicBlockList.NETHER_QUARTZ_TORCH.get(),
                NetherQuartzBasicBlockList.NETHER_QUARTZ_WALL_TORCH.get(), 
                Direction.DOWN, 
                new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, registryName))
        ));


        NetherQuartzBasicBlockList.NETHER_QUARTZ_SOUL_TORCH = Quartztastic.BLOCKS.register(
            "nether_quartz_soul_torch", 
            registryName -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 10)
                .sound(NETHER_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        NetherQuartzBasicBlockList.NETHER_QUARTZ_WALL_SOUL_TORCH = Quartztastic.BLOCKS.register(
            "nether_quartz_wall_soul_torch", 
            registryName -> new net.minecraft.world.level.block.WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .instabreak()
                .lightLevel(state -> 10)
                .sound(NETHER_QUARTZ_SOUND)
                .noOcclusion()
            )
        );
        NetherQuartzBasicBlockList.NETHER_QUARTZ_SOUL_TORCH_ITEM = Quartztastic.ITEMS.register(
            "nether_quartz_soul_torch", 
            registryName -> new StandingAndWallBlockItem(
                NetherQuartzBasicBlockList.NETHER_QUARTZ_SOUL_TORCH.get(),
                NetherQuartzBasicBlockList.NETHER_QUARTZ_WALL_SOUL_TORCH.get(), 
                Direction.DOWN, 
                new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, registryName))
        ));

        NetherQuartzBasicBlockList.NETHER_QUARTZ_LADDER = Quartztastic.BLOCKS.register(
            "nether_quartz_ladder", 
            registryName -> new net.minecraft.world.level.block.LadderBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        NetherQuartzBasicBlockList.NETHER_QUARTZ_LADDER_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzBasicBlockList.NETHER_QUARTZ_LADDER
        );
    }
    
}
