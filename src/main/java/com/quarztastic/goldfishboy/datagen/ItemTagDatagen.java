package com.quarztastic.goldfishboy.datagen;

import java.util.concurrent.CompletableFuture;

import com.quarztastic.goldfishboy.registry.BlueQuartzList;
import com.quarztastic.goldfishboy.registry.CitrineList;
import com.quarztastic.goldfishboy.registry.RoseQuartzList;
import com.quarztastic.goldfishboy.registry.TagKeyList;
import com.quarztastic.goldfishboy.registry.prasiolite_quartz.PrasioliteQuartzList;
import com.quarztastic.goldfishboy.registry.smoky_quartz.SmokyQuartzList;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

public class ItemTagDatagen extends ItemTagsProvider {

    public ItemTagDatagen(PackOutput output, CompletableFuture<Provider> lookupProvider, String modId) {
        super(output, lookupProvider, modId);
    }

    @Override
    protected void addTags(Provider provider) {
        
        this.tag(TagKeyList.QUARTZ_ORE_TAG)
            .add(
            SmokyQuartzList.SMOKY_QUARTZ_ORE_ITEM.get(),
            SmokyQuartzList.SMOKY_QUARTZ_NETHERRACK_ORE_ITEM.get(),

            RoseQuartzList.ROSE_QUARTZ_ORE_ITEM.get(),

            CitrineList.CITRINE_ORE_ITEM.get(),

            BlueQuartzList.BLUE_QUARTZ_ORE_ITEM.get(),

            PrasioliteQuartzList.PRASIOLITE_QUARTZ_ORE_ITEM.get(),
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_NETHERRACK_ORE_ITEM.get()
        );

        this.tag(TagKeyList.QUARTZ_GEM_TAG)
            .add(
            SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get(),

            RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get(),

            CitrineList.CITRINE_CRYSTAL.get(),

            BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get(),

            PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()
        );

        this.tag(TagKeyList.CRAFTING_TABLE_TAG)
            .add(
            SmokyQuartzList.SMOKY_QUARTZ_CRAFTING_TABLE_ITEM.get(),

            RoseQuartzList.ROSE_QUARTZ_CRAFTING_TABLE_ITEM.get(),

            CitrineList.CITRINE_CRAFTING_TABLE_ITEM.get(),

            BlueQuartzList.BLUE_QUARTZ_CRAFTING_TABLE_ITEM.get(),

            PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRAFTING_TABLE_ITEM.get()
        );
    }
    
}
