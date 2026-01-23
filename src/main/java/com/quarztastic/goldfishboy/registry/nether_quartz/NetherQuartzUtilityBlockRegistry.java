package com.quarztastic.goldfishboy.registry.nether_quartz;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.block.furnaces.NetherQuartzFurnaceBlock;
import com.quarztastic.goldfishboy.block.ovens.NetherQuartzOvenBlock;
import com.quarztastic.goldfishboy.entity.NetherQuartzFurnaceEntity;
import com.quarztastic.goldfishboy.entity.NetherQuartzOvenEntity;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class NetherQuartzUtilityBlockRegistry {

    public static void registerAll() {

        registerFurnaces();

    }

    public static void registerFurnaces() {

        NetherQuartzUtilityBlockList.NETHER_QUARTZ_FURNACE = Quartztastic.BLOCKS.register(
            "nether_quartz_furnace", 
            registryName -> new NetherQuartzFurnaceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_DESTROY_TIME, NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        NetherQuartzUtilityBlockList.NETHER_QUARTZ_FURNACE_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "nether_quartz_furnace",
            () -> new BlockEntityType<>(
            NetherQuartzFurnaceEntity::new,
            false,
            NetherQuartzUtilityBlockList.NETHER_QUARTZ_FURNACE.get())
        );

        NetherQuartzUtilityBlockList.NETHER_QUARTZ_FURNACE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzUtilityBlockList.NETHER_QUARTZ_FURNACE
        );


        NetherQuartzUtilityBlockList.NETHER_QUARTZ_OVEN = Quartztastic.BLOCKS.register(
            "nether_quartz_oven", 
            registryName -> new NetherQuartzOvenBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_DESTROY_TIME, NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        NetherQuartzUtilityBlockList.NETHER_QUARTZ_OVEN_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "nether_quartz_oven",
            () -> new BlockEntityType<>(
            NetherQuartzOvenEntity::new,
            false,
            NetherQuartzUtilityBlockList.NETHER_QUARTZ_OVEN.get())
        );

        NetherQuartzUtilityBlockList.NETHER_QUARTZ_OVEN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzUtilityBlockList.NETHER_QUARTZ_OVEN
        );

    }
    
}
