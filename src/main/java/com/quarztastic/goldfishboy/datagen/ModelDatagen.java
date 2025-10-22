package com.quarztastic.goldfishboy.datagen;

import javax.annotation.Nonnull;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.registry.SmokyQuartzRegistry;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;

public class ModelDatagen extends ModelProvider {
    public ModelDatagen(PackOutput output) {
        super(output, Quartztastic.MODID);
    }

    @Override
    protected void registerModels(@Nonnull BlockModelGenerators blockModels, @Nonnull ItemModelGenerators itemModels) {
        registerSimpleBlockModels(blockModels, itemModels);
        registerBlockFamilies(blockModels, itemModels);
    }

    protected void registerSimpleBlockModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.createTrivialCube(SmokyQuartzRegistry.SMOKY_QUARTZ_BLOCK.get());

        blockModels.createTrivialCube(SmokyQuartzRegistry.SMOKY_QUARTZ_BRICKS.get());
    }

    protected void registerBlockFamilies(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.familyWithExistingFullBlock(SmokyQuartzRegistry.SMOKY_QUARTZ_BLOCK.get())
            .slab(SmokyQuartzRegistry.SMOKY_QUARTZ_SLAB.get())
            .stairs(SmokyQuartzRegistry.SMOKY_QUARTZ_STAIRS.get());
    }
}

