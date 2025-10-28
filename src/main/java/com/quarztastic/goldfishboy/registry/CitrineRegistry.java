package com.quarztastic.goldfishboy.registry;

import com.quarztastic.goldfishboy.Quartztastic;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
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
    }
}
