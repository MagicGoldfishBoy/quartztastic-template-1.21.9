package com.quarztastic.goldfishboy.registry;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.block.OreBlock;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class PrasioliteQuartzRegistry {
    
    public static void registerAll() {

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL = Quartztastic.ITEMS.registerSimpleItem(
            "prasiolite_quartz_crystal"
        );


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_ORE = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_ore", 
            registryName -> new OreBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(2.0f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_ORE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_ORE
        );


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_NETHERRACK_ORE = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_netherrack_ore", 
            registryName -> new OreBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(2.0f, 4.0f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_NETHERRACK_ORE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_NETHERRACK_ORE
        );
    }
}
