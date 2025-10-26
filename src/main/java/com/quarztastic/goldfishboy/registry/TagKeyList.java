package com.quarztastic.goldfishboy.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class TagKeyList {

    public static final TagKey<Block> MINED_BY_PICKAXE_TAG = TagKey.create(
        Registries.BLOCK,
        ResourceLocation.fromNamespaceAndPath("minecraft", "mineable/pickaxe")
    );


    public static final TagKey<Block> STONE_PRESSURE_PLATES_TAG = TagKey.create(
        Registries.BLOCK, 
        ResourceLocation.fromNamespaceAndPath("minecraft", "stone_pressure_plates")
    );

    public static final TagKey<Block> FENCES_TAG = TagKey.create(
        Registries.BLOCK, 
        ResourceLocation.fromNamespaceAndPath("minecraft", "fences")
    );

    public static final TagKey<Block> WALLS_TAG = TagKey.create(
        Registries.BLOCK, 
        ResourceLocation.fromNamespaceAndPath("minecraft", "walls")
    );

    public static final TagKey<Block> GATES_TAG = TagKey.create(
        Registries.BLOCK, 
        ResourceLocation.fromNamespaceAndPath("minecraft", "fence_gates")
    );

    public static final TagKey<Block> DOORS_TAG = TagKey.create(
        Registries.BLOCK, 
        ResourceLocation.fromNamespaceAndPath("minecraft", "doors")
    );


    public static final TagKey<Block> PIGLIN_REPELLENT_TAG = TagKey.create(
        Registries.BLOCK, 
        ResourceLocation.fromNamespaceAndPath("minecraft", "piglin_repellents")
    );



    public static final TagKey<Item> QUARTZ_ORE_TAG = TagKey.create(
        Registries.ITEM, 
        ResourceLocation.fromNamespaceAndPath("c", "ores/quartz")
    );

    public static final TagKey<Item> QUARTZ_GEM_TAG = TagKey.create(
        Registries.ITEM, 
        ResourceLocation.fromNamespaceAndPath("c", "gems/quartz")
    );
    
}
