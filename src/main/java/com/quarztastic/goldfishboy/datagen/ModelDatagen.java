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
        buildDoorModels(blockModels, itemModels);
        buildBlockbenchBlockstates(blockModels, itemModels);
        buildLanternModels(blockModels, itemModels);
        buildTorchModels(blockModels, itemModels);
    }

    protected void buildSimpleItemModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        itemModels.generateFlatItem(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get(), ModelTemplates.FLAT_ITEM);
    }

    protected void buildSimpleBlockModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.createTrivialCube(SmokyQuartzList.SMOKY_QUARTZ_ORE.get());

        blockModels.createTrivialCube(SmokyQuartzList.SMOKY_QUARTZ_BLOCK.get());

        blockModels.createTrivialCube(SmokyQuartzList.SMOKY_QUARTZ_BRICKS.get());

        blockModels.createTrivialCube(SmokyQuartzList.CHISELED_SMOKY_QUARTZ_BLOCK.get());

        blockModels.createTrivialCube(SmokyQuartzList.SMOKY_QUARTZ_TILES.get());

        blockModels.createTrivialCube(SmokyQuartzList.SMOKY_QUARTZ_LIGHT.get());
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

        blockModels.familyWithExistingFullBlock(SmokyQuartzList.SMOKY_QUARTZ_TILES.get())
            .slab(SmokyQuartzList.SMOKY_QUARTZ_TILES_SLAB.get())
            .stairs(SmokyQuartzList.SMOKY_QUARTZ_TILES_STAIRS.get());
    }

    protected void buildPillarModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        ModelDatagenHelpers.createPillarModels(blockModels, itemModels, SmokyQuartzList.SMOKY_QUARTZ_PILLAR.get(), new Variant(modLocation("block/smoky_quartz_pillar_top")), 
        new Variant(modLocation("block/smoky_quartz_pillar_middle")), new Variant(modLocation("block/smoky_quartz_pillar_bottom")), new Variant(modLocation("block/smoky_quartz_pillar_single")));

        itemModels.itemModelOutput.accept(
            SmokyQuartzList.SMOKY_QUARTZ_PILLAR_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/smoky_quartz_pillar_single"))
        );
    }

    protected void buildDoorModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        blockModels.createDoor(SmokyQuartzList.SMOKY_QUARTZ_DOOR.get());
    }

    protected void buildBlockbenchBlockstates(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, SmokyQuartzList.SMOKY_QUARTZ_CHAIR.get(), new Variant(modLocation("block/smoky_quartz_chair")));

        itemModels.itemModelOutput.accept(
            SmokyQuartzList.SMOKY_QUARTZ_CHAIR_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/smoky_quartz_chair"))
        );


        ModelDatagenHelpers.createTableModel(blockModels, itemModels, SmokyQuartzList.SMOKY_QUARTZ_TABLE.get(), new Variant(modLocation("block/smoky_quartz_table_single")), 
        new Variant(modLocation("block/smoky_quartz_table_multiple")), new Variant(modLocation("block/smoky_quartz_table_single")), new Variant(modLocation("block/smoky_quartz_table_single")), 
        new Variant(modLocation("block/smoky_quartz_table_single")), new Variant(modLocation("block/smoky_quartz_table_single")), new Variant(modLocation("block/smoky_quartz_table_multiple")), 
        new Variant(modLocation("block/smoky_quartz_table_single")), new Variant(modLocation("block/smoky_quartz_table_single")), 
        new Variant(modLocation("block/smoky_quartz_table_multiple")), new Variant(modLocation("block/smoky_quartz_table_single")), 
        new Variant(modLocation("block/smoky_quartz_table_single")), new Variant(modLocation("block/smoky_quartz_table_multiple")),
        new Variant(modLocation("block/smoky_quartz_table_multiple")), new Variant(modLocation("block/smoky_quartz_table_multiple")), 
        new Variant(modLocation("block/smoky_quartz_table_multiple")));

        itemModels.itemModelOutput.accept(
            SmokyQuartzList.SMOKY_QUARTZ_TABLE_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/smoky_quartz_table_single"))
        );


        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, SmokyQuartzList.SMOKY_QUARTZ_SHELF.get(), new Variant(modLocation("block/smoky_quartz_shelf")));

        itemModels.itemModelOutput.accept(
            SmokyQuartzList.SMOKY_QUARTZ_SHELF_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/smoky_quartz_shelf"))
        );

        
        ModelDatagenHelpers.createLadderBlockstates(blockModels, itemModels, SmokyQuartzList.SMOKY_QUARTZ_LADDER.get(), SmokyQuartzList.SMOKY_QUARTZ_LADDER_ITEM.get(), 
            new Variant(modLocation("block/smoky_quartz_ladder")));



        ModelDatagenHelpers.createRotatableStorageBlock(blockModels, itemModels, SmokyQuartzList.SMOKY_QUARTZ_BARREL.get(), SmokyQuartzList.SMOKY_QUARTZ_BARREL_ITEM.get(), 
            new Variant(modLocation("block/smoky_quartz_barrel")), new Variant(modLocation("block/smoky_quartz_barrel_open")));


        ModelDatagenHelpers.createRotatableStorageBlock(blockModels, itemModels, SmokyQuartzList.SMOKY_QUARTZ_NIGHTSTAND.get(), SmokyQuartzList.SMOKY_QUARTZ_NIGHTSTAND_ITEM.get(), 
            new Variant(modLocation("block/smoky_quartz_nightstand")), new Variant(modLocation("block/smoky_quartz_nightstand_open")));
    }

    protected void buildLanternModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.createLantern(SmokyQuartzList.SMOKY_QUARTZ_LANTERN.get());

        blockModels.createLantern(SmokyQuartzList.SMOKY_QUARTZ_SOUL_LANTERN.get());

        ModelDatagenHelpers.createChainBlockstates(blockModels, itemModels, SmokyQuartzList.SMOKY_QUARTZ_CHAIN.get(), SmokyQuartzList.SMOKY_QUARTZ_CHAIN_ITEM.get());

    }

    protected void buildTorchModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.createNormalTorch(SmokyQuartzList.SMOKY_QUARTZ_TORCH.get(), SmokyQuartzList.SMOKY_QUARTZ_WALL_TORCH.get());

        blockModels.createNormalTorch(SmokyQuartzList.SMOKY_QUARTZ_SOUL_TORCH.get(), SmokyQuartzList.SMOKY_QUARTZ_WALL_SOUL_TORCH.get());
    }
}

