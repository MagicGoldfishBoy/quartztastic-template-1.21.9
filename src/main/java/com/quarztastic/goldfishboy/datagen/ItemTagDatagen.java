package com.quarztastic.goldfishboy.datagen;

import java.util.concurrent.CompletableFuture;

import com.quarztastic.goldfishboy.registry.TagKeyList;
import com.quarztastic.goldfishboy.registry.blue_quartz.BlueQuartzList;
import com.quarztastic.goldfishboy.registry.citrine.CitrineList;
import com.quarztastic.goldfishboy.registry.nether_quartz.NetherQuartzBasicBlockList;
import com.quarztastic.goldfishboy.registry.nether_quartz.NetherQuartzCraftingBlockList;
import com.quarztastic.goldfishboy.registry.prasiolite_quartz.PrasioliteQuartzList;
import com.quarztastic.goldfishboy.registry.rose_quartz.RoseQuartzList;
import com.quarztastic.goldfishboy.registry.smoky_quartz.SmokyQuartzList;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
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

        this.tag(TagKeyList.CRAFTING_TABLE_ITEM_TAG)
            .add(
                NetherQuartzCraftingBlockList.NETHER_QUARTZ_CRAFTING_TABLE_ITEM.get(),

                SmokyQuartzList.SMOKY_QUARTZ_CRAFTING_TABLE_ITEM.get(),

                RoseQuartzList.ROSE_QUARTZ_CRAFTING_TABLE_ITEM.get(),

                CitrineList.CITRINE_CRAFTING_TABLE_ITEM.get(),

                BlueQuartzList.BLUE_QUARTZ_CRAFTING_TABLE_ITEM.get(),

                PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRAFTING_TABLE_ITEM.get()
        );


        this.tag(TagKeyList.BARREL_ITEM_TAG)
            .add(
                SmokyQuartzList.SMOKY_QUARTZ_BARREL_ITEM.get(),

                RoseQuartzList.ROSE_QUARTZ_BARREL_ITEM.get(),

                CitrineList.CITRINE_BARREL_ITEM.get(),

                BlueQuartzList.BLUE_QUARTZ_BARREL_ITEM.get(),

                PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARREL_ITEM.get()
            );

        this.tag(TagKeyList.CHAIN_ITEM_TAG)
            .add(
                NetherQuartzBasicBlockList.NETHER_QUARTZ_CHAIN_ITEM.get(),

                SmokyQuartzList.SMOKY_QUARTZ_CHAIN_ITEM.get(),

                RoseQuartzList.ROSE_QUARTZ_CHAIN_ITEM.get(),

                CitrineList.CITRINE_CHAIN_ITEM.get(),

                BlueQuartzList.BLUE_QUARTZ_CHAIN_ITEM.get(),

                PrasioliteQuartzList.PRASIOLITE_QUARTZ_CHAIN_ITEM.get()
            );

        this.tag(TagKeyList.BOOKSHELVES_ITEM_TAG)
            .add(
                NetherQuartzBasicBlockList.NETHER_QUARTZ_BOOKSHELF_ITEM.get(),

                SmokyQuartzList.SMOKY_QUARTZ_BOOKSHELF_ITEM.get(),

                RoseQuartzList.ROSE_QUARTZ_BOOKSHELF_ITEM.get(),

                CitrineList.CITRINE_BOOKSHELF_ITEM.get(),

                BlueQuartzList.BLUE_QUARTZ_BOOKSHELF_ITEM.get(),

                PrasioliteQuartzList.PRASIOLITE_QUARTZ_BOOKSHELF_ITEM.get()
            );
            
        this.tag(TagKeyList.PIGLIN_REPELLENT_ITEM_TAG)
            .add(
                NetherQuartzBasicBlockList.NETHER_QUARTZ_SOUL_LANTERN_ITEM.get(),
                
                SmokyQuartzList.SMOKY_QUARTZ_SOUL_LANTERN_ITEM.get(),
                SmokyQuartzList.SMOKY_QUARTZ_SOUL_TORCH_ITEM.get(),
                SmokyQuartzList.SMOKY_QUARTZ_SKULL_STATUETTE_ITEM.get(),

                RoseQuartzList.ROSE_QUARTZ_SOUL_LANTERN_ITEM.get(),
                RoseQuartzList.ROSE_QUARTZ_SOUL_TORCH_ITEM.get(),
                RoseQuartzList.ROSE_QUARTZ_SKULL_STATUETTE_ITEM.get(),

                CitrineList.CITRINE_SOUL_LANTERN_ITEM.get(),
                CitrineList.CITRINE_SOUL_TORCH_ITEM.get(),
                CitrineList.CITRINE_SKULL_STATUETTE_ITEM.get(),

                BlueQuartzList.BLUE_QUARTZ_SOUL_LANTERN_ITEM.get(),
                BlueQuartzList.BLUE_QUARTZ_SOUL_TORCH_ITEM.get(),
                BlueQuartzList.BLUE_QUARTZ_SKULL_STATUETTE_ITEM.get(),

                PrasioliteQuartzList.PRASIOLITE_QUARTZ_SOUL_LANTERN_ITEM.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_SOUL_TORCH_ITEM.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_SKULL_STATUETTE_ITEM.get()
            );
    }
    
}
