package com.quarztastic.goldfishboy.registry.nether_quartz;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.block.NetherQuartzBlastFurnaceBlock;
import com.quarztastic.goldfishboy.block.crafting_tables.NetherQuartzCraftingTable;
import com.quarztastic.goldfishboy.block.furnaces.NetherQuartzFurnaceBlock;
import com.quarztastic.goldfishboy.block.grindstones.NetherQuartzGrindstone;
import com.quarztastic.goldfishboy.block.ovens.NetherQuartzOvenBlock;
import com.quarztastic.goldfishboy.block.stonecutters.NetherQuartzStonecutter;
import com.quarztastic.goldfishboy.entity.NetherQuartzBlastFurnaceEntity;
import com.quarztastic.goldfishboy.entity.NetherQuartzFurnaceEntity;
import com.quarztastic.goldfishboy.entity.NetherQuartzOvenEntity;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class NetherQuartzCraftingBlockRegistry {

    public static void registerAll() {

        registerFurnaces();

        registerCraftingBlocks();
    }

    public static void registerFurnaces() {

        NetherQuartzCraftingBlockList.NETHER_QUARTZ_FURNACE = Quartztastic.BLOCKS.register(
            "nether_quartz_furnace", 
            registryName -> new NetherQuartzFurnaceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_DESTROY_TIME, NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        NetherQuartzCraftingBlockList.NETHER_QUARTZ_FURNACE_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "nether_quartz_furnace",
            () -> new BlockEntityType<>(
            NetherQuartzFurnaceEntity::new,
            false,
            NetherQuartzCraftingBlockList.NETHER_QUARTZ_FURNACE.get())
        );

        NetherQuartzCraftingBlockList.NETHER_QUARTZ_FURNACE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzCraftingBlockList.NETHER_QUARTZ_FURNACE
        );


        NetherQuartzCraftingBlockList.NETHER_QUARTZ_OVEN = Quartztastic.BLOCKS.register(
            "nether_quartz_oven", 
            registryName -> new NetherQuartzOvenBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_DESTROY_TIME, NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );

        NetherQuartzCraftingBlockList.NETHER_QUARTZ_OVEN_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "nether_quartz_oven",
            () -> new BlockEntityType<>(
            NetherQuartzOvenEntity::new,
            false,
            NetherQuartzCraftingBlockList.NETHER_QUARTZ_OVEN.get())
        );

        NetherQuartzCraftingBlockList.NETHER_QUARTZ_OVEN_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzCraftingBlockList.NETHER_QUARTZ_OVEN
        );


        NetherQuartzCraftingBlockList.NETHER_QUARTZ_BLAST_FURNACE = Quartztastic.BLOCKS.register(
            "nether_quartz_blast_furnace", 
            registryName -> new NetherQuartzBlastFurnaceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_DESTROY_TIME, NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        NetherQuartzCraftingBlockList.NETHER_QUARTZ_BLAST_FURNACE_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "nether_quartz_blast_furnace",
            () -> new BlockEntityType<>(
            NetherQuartzBlastFurnaceEntity::new,
            false,
            NetherQuartzCraftingBlockList.NETHER_QUARTZ_BLAST_FURNACE.get())
        );
        NetherQuartzCraftingBlockList.NETHER_QUARTZ_BLAST_FURNACE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzCraftingBlockList.NETHER_QUARTZ_BLAST_FURNACE
        );

    }

    public static void registerCraftingBlocks() {

        NetherQuartzCraftingBlockList.NETHER_QUARTZ_CRAFTING_TABLE = Quartztastic.BLOCKS.register(
            "nether_quartz_crafting_table", 
            registryName -> new NetherQuartzCraftingTable(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_DESTROY_TIME, NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        NetherQuartzCraftingBlockList.NETHER_QUARTZ_CRAFTING_TABLE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzCraftingBlockList.NETHER_QUARTZ_CRAFTING_TABLE
        );

        NetherQuartzCraftingBlockList.NETHER_QUARTZ_STONECUTTER = Quartztastic.BLOCKS.register(
            "nether_quartz_stonecutter", 
            registryName -> new NetherQuartzStonecutter(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_DESTROY_TIME, NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        NetherQuartzCraftingBlockList.NETHER_QUARTZ_STONECUTTER_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzCraftingBlockList.NETHER_QUARTZ_STONECUTTER
        );

        NetherQuartzCraftingBlockList.NETHER_QUARTZ_GRINDSTONE = Quartztastic.BLOCKS.register(
            "nether_quartz_grindstone", 
            registryName -> new NetherQuartzGrindstone(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_DESTROY_TIME, NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        NetherQuartzCraftingBlockList.NETHER_QUARTZ_GRINDSTONE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzCraftingBlockList.NETHER_QUARTZ_GRINDSTONE
        );

    }
    
}
