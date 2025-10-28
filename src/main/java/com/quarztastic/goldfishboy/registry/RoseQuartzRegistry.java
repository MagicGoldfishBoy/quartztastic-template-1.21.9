package com.quarztastic.goldfishboy.registry;

import com.quarztastic.goldfishboy.Quartztastic;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class RoseQuartzRegistry {
public static void registerAll() {

        RoseQuartzList.ROSE_QUARTZ_CRYSTAL = Quartztastic.ITEMS.registerSimpleItem(
            "rose_quartz_crystal"
        );

        RoseQuartzList.ROSE_QUARTZ_ORE = Quartztastic.BLOCKS.register(
            "rose_quartz_ore", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(2.0f, 4.0f)
                .sound(SoundType.AMETHYST)
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
                .strength(2.0f, 4.0f)
                .sound(SoundType.AMETHYST)
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
                .strength(1.0f, 2.0f)
                .sound(SoundType.AMETHYST)
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
                .strength(2.0f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        RoseQuartzList.ROSE_QUARTZ_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            RoseQuartzList.ROSE_QUARTZ_STAIRS
        );

    }
}
