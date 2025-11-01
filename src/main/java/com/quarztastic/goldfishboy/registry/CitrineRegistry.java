package com.quarztastic.goldfishboy.registry;

import com.quarztastic.goldfishboy.Quartztastic;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CitrineRegistry {
    
    public static void registerAll() {

        CitrineList.CITRINE_CRYSTAL = Quartztastic.ITEMS.registerSimpleItem(
            "citrine_crystal"
        );

        CitrineList.CITRINE_ORE = Quartztastic.BLOCKS.register(
            "citrine_ore", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(2.0f, 4.0f)
                .sound(SoundType.AMETHYST)
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
                .strength(3.0f, 6.0f)
                .sound(SoundType.AMETHYST)
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
                .strength(3.0f, 6.0f)
                .sound(SoundType.AMETHYST)
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
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.AMETHYST)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
        );
        CitrineList.CITRINE_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_STAIRS
        );


        CitrineList.CITRINE_BRICKS = Quartztastic.BLOCKS.register(
            "citrine_bricks", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(3.0f, 6.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        CitrineList.CITRINE_BRICKS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            CitrineList.CITRINE_BRICKS
        );
    }
}
