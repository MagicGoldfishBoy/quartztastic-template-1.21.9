package com.quarztastic.goldfishboy.registry;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.block.OreBlock;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class PrasioliteQuartzRegistry {

    static SoundType PRASIOLITE_QUARTZ_SOUND = SoundType.AMETHYST;

    static Float PRASIOLITE_QUARTZ_DESTROY_TIME = 3.0f;
    static Float PRASIOLITE_QUARTZ_BLAST_RESISTANCE = 6.0f;

    static BlockSetType PRASIOLITE_QUARTZ_BLOCK_SET_TYPE = BlockSetTypes.QUARTZ;
    static WoodType PRASIOLITE_QUARTZ_WOOD_TYPE = WoodType.CRIMSON;
    
    public static void registerAll() {

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL = Quartztastic.ITEMS.registerSimpleItem(
            "prasiolite_quartz_crystal"
        );


        PrasioliteQuartzList.PRASIOLITE_QUARTZ_ORE = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_ore", 
            registryName -> new OreBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
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

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_PANE = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_pane", 
            registryName -> new IronBarsBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME / 2, PRASIOLITE_QUARTZ_BLAST_RESISTANCE / 2)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_PANE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_PANE
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME / 2, PRASIOLITE_QUARTZ_BLAST_RESISTANCE / 2)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB
        );

        PrasioliteQuartzList.PRASIOLITE_QUARTZ_STAIRS = Quartztastic.BLOCKS.register(
            "prasiolite_quartz_stairs", 
            registryName -> new StairBlock(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(PRASIOLITE_QUARTZ_DESTROY_TIME, PRASIOLITE_QUARTZ_BLAST_RESISTANCE)
                .sound(PRASIOLITE_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_STAIRS
        );
    }
}
