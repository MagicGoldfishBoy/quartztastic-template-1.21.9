package com.quarztastic.goldfishboy.datagen;

import java.util.concurrent.CompletableFuture;

import com.quarztastic.goldfishboy.registry.SmokyQuartzList;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

public class TagDatagen extends BlockTagsProvider {
    public static final TagKey<Block> MINED_BY_PICKAXE_TAG = TagKey.create(
        Registries.BLOCK,
        ResourceLocation.fromNamespaceAndPath("minecraft", "mineable/pickaxe")
    );
    public TagDatagen(PackOutput output, CompletableFuture<Provider> lookupProvider, String modId) {
        super(output, lookupProvider, modId);
    }

    @Override
    protected void addTags(Provider provider) {
        this.tag(MINED_BY_PICKAXE_TAG)
        .add(
        SmokyQuartzList.SMOKY_QUARTZ_ORE.get(),

        SmokyQuartzList.SMOKY_QUARTZ_BLOCK.get(), 
        SmokyQuartzList.SMOKY_QUARTZ_SLAB.get(), 
        SmokyQuartzList.SMOKY_QUARTZ_STAIRS.get(), 
        SmokyQuartzList.SMOKY_QUARTZ_BUTTON.get(), 

        SmokyQuartzList.SMOKY_QUARTZ_BRICKS.get(), 
        SmokyQuartzList.SMOKY_QUARTZ_BRICKS_SLAB.get(), 
        SmokyQuartzList.SMOKY_QUARTZ_BRICKS_STAIRS.get(), 
        
        SmokyQuartzList.SMOKY_QUARTZ_PILLAR.get()
        );
    }
    
}
