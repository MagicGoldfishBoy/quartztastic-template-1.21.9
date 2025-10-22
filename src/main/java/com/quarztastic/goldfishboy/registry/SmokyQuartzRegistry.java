package com.quarztastic.goldfishboy.registry;

import com.quarztastic.goldfishboy.Quartztastic;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class SmokyQuartzRegistry {

    public static DeferredItem<Item> SMOKY_QUARTZ_CRYSTAL;

    public static DeferredBlock<Block> SMOKY_QUARTZ_ORE;
    public static DeferredItem<BlockItem> SMOKY_QUARTZ_ORE_ITEM;

    public static DeferredBlock<Block> SMOKY_QUARTZ_BLOCK;
    public static DeferredItem<BlockItem> SMOKY_QUARTZ_ITEM;

    public static DeferredBlock<SlabBlock> SMOKY_QUARTZ_SLAB;
    public static DeferredItem<BlockItem> SMOKY_QUARTZ_SLAB_ITEM;

    public static DeferredBlock<StairBlock> SMOKY_QUARTZ_STAIRS;
    public static DeferredItem<BlockItem> SMOKY_QUARTZ_STAIRS_ITEM;


    public static DeferredBlock<Block> SMOKY_QUARTZ_BRICKS;
    public static DeferredItem<BlockItem> SMOKY_QUARTZ_BRICKS_ITEM;

    public static void registerAll() {

        SMOKY_QUARTZ_CRYSTAL = Quartztastic.ITEMS.registerSimpleItem(
            "smoky_quartz_crystal"
        );


        SMOKY_QUARTZ_ORE = Quartztastic.BLOCKS.register(
            "smoky_quartz_ore", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SMOKY_QUARTZ_ORE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SMOKY_QUARTZ_ORE
        );


        SMOKY_QUARTZ_BLOCK = Quartztastic.BLOCKS.register(
            "smoky_quartz_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SMOKY_QUARTZ_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SMOKY_QUARTZ_BLOCK
        );


        SMOKY_QUARTZ_SLAB = Quartztastic.BLOCKS.register(
            "smoky_quartz_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SMOKY_QUARTZ_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SMOKY_QUARTZ_SLAB
        );


        SMOKY_QUARTZ_STAIRS = Quartztastic.BLOCKS.register(
            "smoky_quartz_stairs", 
            registryName -> new StairBlock(SMOKY_QUARTZ_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SMOKY_QUARTZ_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SMOKY_QUARTZ_STAIRS
        );



        SMOKY_QUARTZ_BRICKS = Quartztastic.BLOCKS.register(
            "smoky_quartz_bricks", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        SMOKY_QUARTZ_BRICKS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SMOKY_QUARTZ_BRICKS
        );

    }
    
}
