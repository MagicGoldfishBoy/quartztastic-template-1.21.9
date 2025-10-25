package com.quarztastic.goldfishboy.datagen;

import javax.annotation.Nonnull;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.registry.SmokyQuartzList;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.renderer.block.model.Variant;
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
        buildPillarModels(blockModels, itemModels);
    }

    protected void buildSimpleItemModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        itemModels.generateFlatItem(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get(), ModelTemplates.FLAT_ITEM);
    }

    protected void buildSimpleBlockModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.createTrivialCube(SmokyQuartzList.SMOKY_QUARTZ_ORE.get());

        blockModels.createTrivialCube(SmokyQuartzList.SMOKY_QUARTZ_BLOCK.get());

        blockModels.createTrivialCube(SmokyQuartzList.SMOKY_QUARTZ_BRICKS.get());
    }

    protected void buildBlockFamilies(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.familyWithExistingFullBlock(SmokyQuartzList.SMOKY_QUARTZ_BLOCK.get())
            .slab(SmokyQuartzList.SMOKY_QUARTZ_SLAB.get())
            .stairs(SmokyQuartzList.SMOKY_QUARTZ_STAIRS.get())
            .button(SmokyQuartzList.SMOKY_QUARTZ_BUTTON.get())
            .pressurePlate(SmokyQuartzList.SMOKY_QUARTZ_PRESSURE_PLATE.get())
            .fence(SmokyQuartzList.SMOKY_QUARTZ_FENCE.get())
            .wall(SmokyQuartzList.SMOKY_QUARTZ_WALL.get())
            .fenceGate(SmokyQuartzList.SMOKY_QUARTZ_GATE.get());

        blockModels.familyWithExistingFullBlock(SmokyQuartzList.SMOKY_QUARTZ_BRICKS.get())
            .slab(SmokyQuartzList.SMOKY_QUARTZ_BRICKS_SLAB.get())
            .stairs(SmokyQuartzList.SMOKY_QUARTZ_BRICKS_STAIRS.get())
            .wall(SmokyQuartzList.SMOKY_QUARTZ_BRICK_WALL.get());
    }

    protected void buildPillarModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        ModelDatagenHelpers.createPillarModels(blockModels, itemModels, SmokyQuartzList.SMOKY_QUARTZ_PILLAR.get(), new Variant(modLocation("block/smoky_quartz_pillar_top")), 
        new Variant(modLocation("block/smoky_quartz_pillar_middle")), new Variant(modLocation("block/smoky_quartz_pillar_bottom")), new Variant(modLocation("block/smoky_quartz_pillar_single")));

        itemModels.itemModelOutput.accept(
            SmokyQuartzList.SMOKY_QUARTZ_PILLAR_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/smoky_quartz_pillar_single"))
        );
    }
}

