package com.quarztastic.goldfishboy.registry;

import com.quarztastic.goldfishboy.Quartztastic;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class BlueQuartzRegistry {

    static SoundType BLUE_QUARTZ_SOUND_TYPE = SoundType.AMETHYST;

    static Float BLUE_QUARTZ_DESTROY_TIME = 3.0f;
    static Float BLUE_QUARTZ_EXPLOSION_RESISTANCE = 6.0f;

    static BlockSetType BLUE_QUARTZ_BLOCK_SET_TYPE = BlockSetTypes.QUARTZ;
    static WoodType BLUE_QUARTZ_WOOD_TYPE = WoodType.CRIMSON;

    public static void registerAll() {

        BlueQuartzList.BLUE_QUARTZ_CRYSTAL = Quartztastic.ITEMS.registerSimpleItem(
            "blue_quartz_crystal"
        );


        BlueQuartzList.BLUE_QUARTZ_ORE = Quartztastic.BLOCKS.register(
            "blue_quartz_ore", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_EXPLOSION_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND_TYPE)
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
                .strength(BLUE_QUARTZ_DESTROY_TIME, BLUE_QUARTZ_EXPLOSION_RESISTANCE)
                .sound(BLUE_QUARTZ_SOUND_TYPE)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            BlueQuartzList.BLUE_QUARTZ_BLOCK
        );
    }
    
}
