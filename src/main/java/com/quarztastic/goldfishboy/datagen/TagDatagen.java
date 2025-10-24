package com.quarztastic.goldfishboy.datagen;

import java.util.concurrent.CompletableFuture;

import com.quarztastic.goldfishboy.registry.SmokyQuartzList;
import com.quarztastic.goldfishboy.registry.TagKeyList;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

public class TagDatagen extends BlockTagsProvider {
    
    public TagDatagen(PackOutput output, CompletableFuture<Provider> lookupProvider, String modId) {
        super(output, lookupProvider, modId);
    }

    @Override
    protected void addTags(Provider provider) {
        this.tag(TagKeyList.MINED_BY_PICKAXE_TAG)
            .add(
                SmokyQuartzList.SMOKY_QUARTZ_ORE.get(),

                SmokyQuartzList.SMOKY_QUARTZ_BLOCK.get(), 
                SmokyQuartzList.SMOKY_QUARTZ_SLAB.get(), 
                SmokyQuartzList.SMOKY_QUARTZ_STAIRS.get(), 
                SmokyQuartzList.SMOKY_QUARTZ_PRESSURE_PLATE.get(), 
                SmokyQuartzList.SMOKY_QUARTZ_FENCE.get(), 
                SmokyQuartzList.SMOKY_QUARTZ_GATE.get(), 

                SmokyQuartzList.SMOKY_QUARTZ_BRICKS.get(), 
                SmokyQuartzList.SMOKY_QUARTZ_BRICKS_SLAB.get(), 
                SmokyQuartzList.SMOKY_QUARTZ_BRICKS_STAIRS.get(), 
                
                SmokyQuartzList.SMOKY_QUARTZ_PILLAR.get()
            );
        
        this.tag(TagKeyList.STONE_PRESSURE_PLATES_TAG)
            .add(
                SmokyQuartzList.SMOKY_QUARTZ_PRESSURE_PLATE.get()
            );

        this.tag(TagKeyList.FENCES_TAG)
            .add(
                SmokyQuartzList.SMOKY_QUARTZ_FENCE.get()
            );

        this.tag(TagKeyList.GATES_TAG)
            .add(
                SmokyQuartzList.SMOKY_QUARTZ_GATE.get()
            );
    }
    
}
