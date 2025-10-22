package com.quarztastic.goldfishboy.datagen;

import javax.annotation.Nonnull;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.registry.SmokyQuartzRegistry;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModelDatagen extends ModelProvider {
    public ModelDatagen(PackOutput output) {
        super(output, Quartztastic.MODID);
    }

    @Override
    protected void registerModels(@Nonnull BlockModelGenerators blockModels, @Nonnull ItemModelGenerators itemModels) {
        buildSimpleItemModels(blockModels, itemModels);
        buildSimpleBlockModels(blockModels, itemModels);
        buildBlockFamilies(blockModels, itemModels);
    }

    protected void buildSimpleItemModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        itemModels.generateFlatItem(SmokyQuartzRegistry.SMOKY_QUARTZ_CRYSTAL.get(), ModelTemplates.FLAT_ITEM);
    }

    protected void buildSimpleBlockModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.createTrivialCube(SmokyQuartzRegistry.SMOKY_QUARTZ_BLOCK.get());

        blockModels.createTrivialCube(SmokyQuartzRegistry.SMOKY_QUARTZ_BRICKS.get());
    }

    protected void buildBlockFamilies(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.familyWithExistingFullBlock(SmokyQuartzRegistry.SMOKY_QUARTZ_BLOCK.get())
            .slab(SmokyQuartzRegistry.SMOKY_QUARTZ_SLAB.get())
            .stairs(SmokyQuartzRegistry.SMOKY_QUARTZ_STAIRS.get());
    }
}

