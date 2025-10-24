package com.quarztastic.goldfishboy.registry;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.block.Pillar;

import net.minecraft.client.resources.model.Material;
import net.minecraft.client.resources.model.MaterialSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.DoubleBlockCombiner.BlockType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;

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

        SmokyQuartzList.SMOKY_QUARTZ_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
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
            registryName -> new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 25, BlockBehaviour.Properties.of()
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

    }
    
}
