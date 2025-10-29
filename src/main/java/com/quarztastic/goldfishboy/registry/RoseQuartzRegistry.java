package com.quarztastic.goldfishboy.registry;

import com.quarztastic.goldfishboy.Quartztastic;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class RoseQuartzRegistry {

   static SoundType ROSE_QUARTZ_SOUND = SoundType.AMETHYST;

   static float ROSE_QUARTZ_DESTROY_TIME = 2.0f;
   static float ROSE_QUARTZ_BLAST_RESISTANCE = 4.0f;

    public static void registerAll() {

            RoseQuartzList.ROSE_QUARTZ_CRYSTAL = Quartztastic.ITEMS.registerSimpleItem(
                "rose_quartz_crystal"
            );

            RoseQuartzList.ROSE_QUARTZ_ORE = Quartztastic.BLOCKS.register(
                "rose_quartz_ore", 
                registryName -> new Block(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                    .sound(ROSE_QUARTZ_SOUND)
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
                    .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                    .sound(ROSE_QUARTZ_SOUND)
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
                    .strength(ROSE_QUARTZ_DESTROY_TIME / 2, ROSE_QUARTZ_BLAST_RESISTANCE / 2)
                    .sound(ROSE_QUARTZ_SOUND)
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
                    .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                    .sound(ROSE_QUARTZ_SOUND)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                )
            );

            RoseQuartzList.ROSE_QUARTZ_STAIRS_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
                RoseQuartzList.ROSE_QUARTZ_STAIRS
            );


            RoseQuartzList.ROSE_QUARTZ_BUTTON = Quartztastic.BLOCKS.register(
                "rose_quartz_button", 
                registryName -> new ButtonBlock(BlockSetTypes.QUARTZ, 25, BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .instabreak()
                    .sound(ROSE_QUARTZ_SOUND)
                    .noOcclusion()
                    .noCollision()
                )
            );

            RoseQuartzList.ROSE_QUARTZ_BUTTON_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
                RoseQuartzList.ROSE_QUARTZ_BUTTON
            );


            RoseQuartzList.ROSE_QUARTZ_PRESSURE_PLATE = Quartztastic.BLOCKS.register(
                "rose_quartz_pressure_plate", 
                registryName -> new net.minecraft.world.level.block.PressurePlateBlock(BlockSetTypes.QUARTZ, BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .strength(ROSE_QUARTZ_DESTROY_TIME / 2, ROSE_QUARTZ_BLAST_RESISTANCE / 2)
                    .sound(ROSE_QUARTZ_SOUND)
                    .noOcclusion()
                )
            );

            RoseQuartzList.ROSE_QUARTZ_PRESSURE_PLATE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
                RoseQuartzList.ROSE_QUARTZ_PRESSURE_PLATE
            );


            RoseQuartzList.ROSE_QUARTZ_FENCE = Quartztastic.BLOCKS.register(
                "rose_quartz_fence", 
                registryName -> new net.minecraft.world.level.block.FenceBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                    .sound(ROSE_QUARTZ_SOUND)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                )
            );

            RoseQuartzList.ROSE_QUARTZ_FENCE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
                RoseQuartzList.ROSE_QUARTZ_FENCE
            );


            RoseQuartzList.ROSE_QUARTZ_WALL = Quartztastic.BLOCKS.register(
                "rose_quartz_wall", 
                registryName -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                    .sound(ROSE_QUARTZ_SOUND)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                )
            );

            RoseQuartzList.ROSE_QUARTZ_WALL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
                RoseQuartzList.ROSE_QUARTZ_WALL
            );


            RoseQuartzList.ROSE_QUARTZ_GATE = Quartztastic.BLOCKS.register(
                "rose_quartz_gate", 
                registryName -> new FenceGateBlock(WoodType.CRIMSON, BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .strength(ROSE_QUARTZ_DESTROY_TIME, ROSE_QUARTZ_BLAST_RESISTANCE)
                    .sound(ROSE_QUARTZ_SOUND)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                )
            );

            RoseQuartzList.ROSE_QUARTZ_GATE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
                RoseQuartzList.ROSE_QUARTZ_GATE
            );

        }
}
