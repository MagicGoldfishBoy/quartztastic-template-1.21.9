package com.quarztastic.goldfishboy.registry.nether_quartz;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.block.Chair;
import com.quarztastic.goldfishboy.block.Shelf;
import com.quarztastic.goldfishboy.block.Sink;
import com.quarztastic.goldfishboy.block.Sink.SinkShape;
import com.quarztastic.goldfishboy.block.NetherQuartzNightstand;
import com.quarztastic.goldfishboy.block.NetherQuartzBarrelBlock;
import com.quarztastic.goldfishboy.block.Table;
import com.quarztastic.goldfishboy.entity.NetherQuartzBarrelEntity;
import com.quarztastic.goldfishboy.entity.NetherQuartzNightstandEntity;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class NetherQuartzFurnitureBlockRegistry {

    static SoundType NETHER_QUARTZ_SOUND = NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_SOUND;

    static Float NETHER_QUARTZ_DESTROY_TIME = NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_DESTROY_TIME;
    static Float NETHER_QUARTZ_BLAST_RESISTANCE = NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_BLAST_RESISTANCE;

    static BlockSetType NETHER_QUARTZ_BLOCK_SET_TYPE = NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_BLOCK_SET_TYPE;
    static WoodType NETHER_QUARTZ_WOOD_TYPE = NetherQuartzBasicBlockRegistry.NETHER_QUARTZ_WOOD_TYPE;
    
    public static void registerFurnitureBlocks() {

        NetherQuartzFurnitureBlockList.NETHER_QUARTZ_CHAIR = Quartztastic.BLOCKS.register(
            "nether_quartz_chair", 
            registryName -> new Chair(Chair.ChairShape.BLOCKY_SHAPE, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        NetherQuartzFurnitureBlockList.NETHER_QUARTZ_CHAIR_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzFurnitureBlockList.NETHER_QUARTZ_CHAIR
        );

        NetherQuartzFurnitureBlockList.NETHER_QUARTZ_TABLE = Quartztastic.BLOCKS.register(
            "nether_quartz_table", 
            registryName -> new Table(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        NetherQuartzFurnitureBlockList.NETHER_QUARTZ_TABLE_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzFurnitureBlockList.NETHER_QUARTZ_TABLE
        );

        NetherQuartzFurnitureBlockList.NETHER_QUARTZ_SHELF = Quartztastic.BLOCKS.register(
            "nether_quartz_shelf", 
            registryName -> new Shelf(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        NetherQuartzFurnitureBlockList.NETHER_QUARTZ_SHELF_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzFurnitureBlockList.NETHER_QUARTZ_SHELF
        );

        NetherQuartzFurnitureBlockList.NETHER_QUARTZ_BARREL_BLOCK = Quartztastic.BLOCKS.register(
            "nether_quartz_barrel", 
            registryName -> new NetherQuartzBarrelBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        NetherQuartzFurnitureBlockList.NETHER_QUARTZ_BARREL_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "nether_quartz_barrel",
            () -> new BlockEntityType<>(
            NetherQuartzBarrelEntity::new,
            false,
            NetherQuartzFurnitureBlockList.NETHER_QUARTZ_BARREL_BLOCK.get())
        );
        NetherQuartzFurnitureBlockList.NETHER_QUARTZ_BARREL_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzFurnitureBlockList.NETHER_QUARTZ_BARREL_BLOCK
        );


        NetherQuartzFurnitureBlockList.NETHER_QUARTZ_NIGHTSTAND_BLOCK = Quartztastic.BLOCKS.register(
            "nether_quartz_nightstand", 
            registryName -> new NetherQuartzNightstand(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
                .sound(NETHER_QUARTZ_SOUND)
                .requiresCorrectToolForDrops()
                .noOcclusion()
            )
        );
        NetherQuartzFurnitureBlockList.NETHER_QUARTZ_NIGHTSTAND_ENTITY = Quartztastic.BLOCK_ENTITIES.register(
            "nether_quartz_nightstand",
            () -> new BlockEntityType<>(
            NetherQuartzNightstandEntity::new,
            false,
            NetherQuartzFurnitureBlockList.NETHER_QUARTZ_NIGHTSTAND_BLOCK.get())
        );
        NetherQuartzFurnitureBlockList.NETHER_QUARTZ_NIGHTSTAND_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzFurnitureBlockList.NETHER_QUARTZ_NIGHTSTAND_BLOCK
        );

        NetherQuartzFurnitureBlockList.NETHER_QUARTZ_SINK = Quartztastic.BLOCKS.register(
            "nether_quartz_sink", 
            registryName -> new Sink(SinkShape.BASIN_WITH_SHELVES, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .strength(NETHER_QUARTZ_DESTROY_TIME, NETHER_QUARTZ_BLAST_RESISTANCE)
            .sound(NETHER_QUARTZ_SOUND)
            .requiresCorrectToolForDrops()
            .noOcclusion()
            )
        );
        NetherQuartzFurnitureBlockList.NETHER_QUARTZ_SINK_ITEM = Quartztastic.ITEMS.registerSimpleBlockItem(
            NetherQuartzFurnitureBlockList.NETHER_QUARTZ_SINK
        );
    }
}
