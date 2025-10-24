package com.quarztastic.goldfishboy.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagKeyList {

    public static final TagKey<Block> MINED_BY_PICKAXE_TAG = TagKey.create(
        Registries.BLOCK,
        ResourceLocation.fromNamespaceAndPath("minecraft", "mineable/pickaxe")
    );

    public static final TagKey<Block> FENCES_TAG = TagKey.create(
        Registries.BLOCK, 
        ResourceLocation.fromNamespaceAndPath("minecraft", "fences")
    );
    
}
