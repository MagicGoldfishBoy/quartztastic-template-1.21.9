package com.quarztastic.goldfishboy.registry;

import com.quarztastic.goldfishboy.Quartztastic;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class SmokyQuartzRegistry {

    public static DeferredBlock<Block> SMOKY_QUARTZ_BLOCK;
    public static DeferredItem<BlockItem> SMOKY_QUARTZ_ITEM;

    public static void registerAll() {

        SMOKY_QUARTZ_BLOCK = Quartztastic.BLOCKS.register(
            "smoky_quartz", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(0.8f, 4.0f)
                .sound(SoundType.AMETHYST)
                //.requiresCorrectToolForDrops()
                //.noOcclusion()
            )
        );

        SMOKY_QUARTZ_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            SMOKY_QUARTZ_BLOCK
        );

    }
    
}
