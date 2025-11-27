package com.quarztastic.goldfishboy.datagen;

import javax.annotation.Nonnull;

import org.checkerframework.checker.units.qual.C;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.registry.BlueQuartzList;
import com.quarztastic.goldfishboy.registry.CitrineList;
import com.quarztastic.goldfishboy.registry.PrasioliteQuartzList;
import com.quarztastic.goldfishboy.registry.RoseQuartzList;
import com.quarztastic.goldfishboy.registry.SmokyQuartzList;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.renderer.block.model.Variant;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;

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
        buildBarModels(blockModels, itemModels);
    }

    protected void buildSimpleItemModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        itemModels.generateFlatItem(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(CitrineList.CITRINE_CRYSTAL.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get(), ModelTemplates.FLAT_ITEM);
    }

    protected void buildSimpleBlockModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.createTrivialCube(SmokyQuartzList.SMOKY_QUARTZ_ORE.get());

        blockModels.createTrivialCube(SmokyQuartzList.SMOKY_QUARTZ_NETHERRACK_ORE.get());

        blockModels.createTrivialCube(SmokyQuartzList.SMOKY_QUARTZ_BLOCK.get());

        blockModels.createTrivialCube(SmokyQuartzList.SMOKY_QUARTZ_BRICKS.get());

        blockModels.createTrivialCube(SmokyQuartzList.CHISELED_SMOKY_QUARTZ_BLOCK.get());

        blockModels.createTrivialCube(SmokyQuartzList.SMOKY_QUARTZ_TILES.get());

        blockModels.createTrivialCube(SmokyQuartzList.SMOKY_QUARTZ_LIGHT.get());



        blockModels.createTrivialCube(RoseQuartzList.ROSE_QUARTZ_ORE.get());

        blockModels.createTrivialCube(RoseQuartzList.ROSE_QUARTZ_BLOCK.get());

        blockModels.createTrivialCube(RoseQuartzList.ROSE_QUARTZ_BRICKS.get());

        blockModels.createTrivialCube(RoseQuartzList.CHISELED_ROSE_QUARTZ_BLOCK.get());

        blockModels.createTrivialCube(RoseQuartzList.ROSE_QUARTZ_TILES.get());

        blockModels.createTrivialCube(RoseQuartzList.ROSE_QUARTZ_LIGHT.get());



        blockModels.createTrivialCube(CitrineList.CITRINE_ORE.get());

        blockModels.createTrivialCube(CitrineList.CITRINE_BLOCK.get());

        blockModels.createTrivialCube(CitrineList.CITRINE_BRICKS.get());

        blockModels.createTrivialCube(CitrineList.CHISELED_CITRINE_BLOCK.get());

        blockModels.createTrivialCube(CitrineList.CITRINE_TILES.get());

        blockModels.createTrivialCube(CitrineList.CITRINE_LIGHT.get());


        blockModels.createTrivialCube(BlueQuartzList.BLUE_QUARTZ_ORE.get());

        blockModels.createGlassBlocks(BlueQuartzList.BLUE_QUARTZ_BLOCK.get(), BlueQuartzList.BLUE_QUARTZ_PANE.get());

        blockModels.createTrivialCube(BlueQuartzList.BLUE_QUARTZ_BRICKS.get());

        blockModels.createTrivialCube(BlueQuartzList.CHISELED_BLUE_QUARTZ_BLOCK.get());

        blockModels.createTrivialCube(BlueQuartzList.BLUE_QUARTZ_TILES.get());

        blockModels.createTrivialCube(BlueQuartzList.BLUE_QUARTZ_LIGHT.get());


        blockModels.createTrivialCube(PrasioliteQuartzList.PRASIOLITE_QUARTZ_ORE.get());

        blockModels.createTrivialCube(PrasioliteQuartzList.PRASIOLITE_QUARTZ_NETHERRACK_ORE.get());

        blockModels.createGlassBlocks(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK.get(), PrasioliteQuartzList.PRASIOLITE_QUARTZ_PANE.get());

        blockModels.createTrivialCube(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS.get());

        blockModels.createTrivialCube(PrasioliteQuartzList.CHISELED_PRASIOLITE_QUARTZ_BLOCK.get());

        blockModels.createTrivialCube(PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILES.get());

        blockModels.createTrivialCube(PrasioliteQuartzList.PRASIOLITE_QUARTZ_LIGHT.get());


        
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




        blockModels.familyWithExistingFullBlock(RoseQuartzList.ROSE_QUARTZ_BLOCK.get())
            .slab(RoseQuartzList.ROSE_QUARTZ_SLAB.get())
            .stairs(RoseQuartzList.ROSE_QUARTZ_STAIRS.get())
            .button(RoseQuartzList.ROSE_QUARTZ_BUTTON.get())
            .pressurePlate(RoseQuartzList.ROSE_QUARTZ_PRESSURE_PLATE.get())
            .fence(RoseQuartzList.ROSE_QUARTZ_FENCE.get())
            .wall(RoseQuartzList.ROSE_QUARTZ_WALL.get())
            .fenceGate(RoseQuartzList.ROSE_QUARTZ_GATE.get());

        blockModels.familyWithExistingFullBlock(RoseQuartzList.ROSE_QUARTZ_BRICKS.get())
            .slab(RoseQuartzList.ROSE_QUARTZ_BRICK_SLAB.get())
            .stairs(RoseQuartzList.ROSE_QUARTZ_BRICK_STAIRS.get())
            .wall(RoseQuartzList.ROSE_QUARTZ_BRICK_WALL.get());

        blockModels.familyWithExistingFullBlock(RoseQuartzList.ROSE_QUARTZ_TILES.get())
            .slab(RoseQuartzList.ROSE_QUARTZ_TILE_SLAB.get())
            .stairs(RoseQuartzList.ROSE_QUARTZ_TILE_STAIRS.get());



        blockModels.familyWithExistingFullBlock(CitrineList.CITRINE_BLOCK.get())
            .slab(CitrineList.CITRINE_SLAB.get())
            .stairs(CitrineList.CITRINE_STAIRS.get())
            .button(CitrineList.CITRINE_BUTTON.get())
            .pressurePlate(CitrineList.CITRINE_PRESSURE_PLATE.get())
            .fence(CitrineList.CITRINE_FENCE.get())
            .wall(CitrineList.CITRINE_WALL.get())
            .fenceGate(CitrineList.CITRINE_GATE.get());

        blockModels.familyWithExistingFullBlock(CitrineList.CITRINE_BRICKS.get())
            .slab(CitrineList.CITRINE_BRICK_SLAB.get())
            .stairs(CitrineList.CITRINE_BRICK_STAIRS.get())
            .wall(CitrineList.CITRINE_BRICK_WALL.get());

        blockModels.familyWithExistingFullBlock(CitrineList.CITRINE_TILES.get())
            .slab(CitrineList.CITRINE_TILE_SLAB.get())
            .stairs(CitrineList.CITRINE_TILE_STAIRS.get());



        blockModels.familyWithExistingFullBlock(BlueQuartzList.BLUE_QUARTZ_BLOCK.get())
            .slab(BlueQuartzList.BLUE_QUARTZ_SLAB.get())
            .stairs(BlueQuartzList.BLUE_QUARTZ_STAIRS.get())
            .button(BlueQuartzList.BLUE_QUARTZ_BUTTON.get())
            .pressurePlate(BlueQuartzList.BLUE_QUARTZ_PRESSURE_PLATE.get())
            .fence(BlueQuartzList.BLUE_QUARTZ_FENCE.get())
            .wall(BlueQuartzList.BLUE_QUARTZ_WALL.get())
            .fenceGate(BlueQuartzList.BLUE_QUARTZ_GATE.get());

        blockModels.familyWithExistingFullBlock(BlueQuartzList.BLUE_QUARTZ_BRICKS.get())
            .slab(BlueQuartzList.BLUE_QUARTZ_BRICK_SLAB.get())
            .stairs(BlueQuartzList.BLUE_QUARTZ_BRICK_STAIRS.get())
            .wall(BlueQuartzList.BLUE_QUARTZ_BRICK_WALL.get());

        blockModels.familyWithExistingFullBlock(BlueQuartzList.BLUE_QUARTZ_TILES.get())
            .slab(BlueQuartzList.BLUE_QUARTZ_TILE_SLAB.get())
            .stairs(BlueQuartzList.BLUE_QUARTZ_TILE_STAIRS.get());


        blockModels.familyWithExistingFullBlock(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK.get())
            .slab(PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB.get())
            .stairs(PrasioliteQuartzList.PRASIOLITE_QUARTZ_STAIRS.get())
            .button(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BUTTON.get())
            .pressurePlate(PrasioliteQuartzList.PRASIOLITE_QUARTZ_PRESSURE_PLATE.get())
            .fence(PrasioliteQuartzList.PRASIOLITE_QUARTZ_FENCE.get())
            .wall(PrasioliteQuartzList.PRASIOLITE_QUARTZ_WALL.get())
            .fenceGate(PrasioliteQuartzList.PRASIOLITE_QUARTZ_GATE.get());

        blockModels.familyWithExistingFullBlock(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS.get())
            .slab(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_SLAB.get())
            .stairs(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_STAIRS.get())
            .wall(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_WALL.get());

        blockModels.familyWithExistingFullBlock(PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILES.get())
            .slab(PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILE_SLAB.get())
            .stairs(PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILE_STAIRS.get());
    }

    protected void buildPillarModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        ModelDatagenHelpers.createPillarModels(blockModels, itemModels, SmokyQuartzList.SMOKY_QUARTZ_PILLAR.get(), new Variant(modLocation("block/smoky_quartz_pillar_top")), 
        new Variant(modLocation("block/smoky_quartz_pillar_middle")), new Variant(modLocation("block/smoky_quartz_pillar_bottom")), new Variant(modLocation("block/smoky_quartz_pillar_single")));

        itemModels.itemModelOutput.accept(
            SmokyQuartzList.SMOKY_QUARTZ_PILLAR_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/smoky_quartz_pillar_single"))
        );


        ModelDatagenHelpers.createPillarModels(blockModels, itemModels, RoseQuartzList.ROSE_QUARTZ_PILLAR.get(), new Variant(modLocation("block/rose_quartz_pillar_top")), 
        new Variant(modLocation("block/rose_quartz_pillar_middle")), new Variant(modLocation("block/rose_quartz_pillar_bottom")), new Variant(modLocation("block/rose_quartz_pillar_single")));

        itemModels.itemModelOutput.accept(
            RoseQuartzList.ROSE_QUARTZ_PILLAR_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/rose_quartz_pillar_single"))
        );


        ModelDatagenHelpers.createPillarModels(blockModels, itemModels, CitrineList.CITRINE_PILLAR.get(), new Variant(modLocation("block/citrine_pillar_top")),
        new Variant(modLocation("block/citrine_pillar_middle")), new Variant(modLocation("block/citrine_pillar_bottom")), new Variant(modLocation("block/citrine_pillar_single")));

        itemModels.itemModelOutput.accept(
            CitrineList.CITRINE_PILLAR_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/citrine_pillar_single"))
        );


        ModelDatagenHelpers.createPillarModels(blockModels, itemModels, BlueQuartzList.BLUE_QUARTZ_PILLAR.get(), new Variant(modLocation("block/blue_quartz_pillar_top")), 
        new Variant(modLocation("block/blue_quartz_pillar_middle")), new Variant(modLocation("block/blue_quartz_pillar_bottom")), new Variant(modLocation("block/blue_quartz_pillar_single")));

        itemModels.itemModelOutput.accept(
            BlueQuartzList.BLUE_QUARTZ_PILLAR_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/blue_quartz_pillar_single"))
        );


        ModelDatagenHelpers.createPillarModels(blockModels, itemModels, PrasioliteQuartzList.PRASIOLITE_QUARTZ_PILLAR.get(), new Variant(modLocation("block/prasiolite_quartz_pillar_top")), 
        new Variant(modLocation("block/prasiolite_quartz_pillar_middle")), new Variant(modLocation("block/prasiolite_quartz_pillar_bottom")), new Variant(modLocation("block/prasiolite_quartz_pillar_single")));

        itemModels.itemModelOutput.accept(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_PILLAR_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/prasiolite_quartz_pillar_single"))
        );
    }

    protected void buildDoorModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.createDoor(SmokyQuartzList.SMOKY_QUARTZ_DOOR.get());

        blockModels.createOrientableTrapdoor(SmokyQuartzList.SMOKY_QUARTZ_TRAPDOOR.get());
        

        blockModels.createDoor(RoseQuartzList.ROSE_QUARTZ_DOOR.get());

        blockModels.createOrientableTrapdoor(RoseQuartzList.ROSE_QUARTZ_TRAPDOOR.get());


        blockModels.createDoor(CitrineList.CITRINE_DOOR.get());

        blockModels.createOrientableTrapdoor(CitrineList.CITRINE_TRAPDOOR.get());
        

        blockModels.createDoor(BlueQuartzList.BLUE_QUARTZ_DOOR.get());

        blockModels.createOrientableTrapdoor(BlueQuartzList.BLUE_QUARTZ_TRAPDOOR.get());
        

        blockModels.createDoor(PrasioliteQuartzList.PRASIOLITE_QUARTZ_DOOR.get());

        blockModels.createOrientableTrapdoor(PrasioliteQuartzList.PRASIOLITE_QUARTZ_TRAPDOOR.get());
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


        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, SmokyQuartzList.SMOKY_QUARTZ_SINK.get(), new Variant(modLocation("block/smoky_quartz_sink")));

        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, SmokyQuartzList.SMOKY_QUARTZ_SKULL_STATUETTE.get(), new Variant(modLocation("block/smoky_quartz_skull")));

        itemModels.itemModelOutput.accept(
            SmokyQuartzList.SMOKY_QUARTZ_SKULL_STATUETTE_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/smoky_quartz_skull"))
        );



        for (DeferredHolder<Block, ? extends Block> holder : Quartztastic.BLOCKS.getEntries()) {
            LOGGER.info("Generating model for: {}", holder.getId().getPath());
            String rawName = holder.getId().getPath();
            if (rawName.contains("bookshelf") || rawName.contains("path")) {

                String name = "block/" + rawName;

                ResourceLocation block = modLocation(name);
                Variant blockvariant = new Variant(block);

                blockModels.blockStateOutput.accept(
                    MultiVariantGenerator.dispatch(
                        holder.get(),
                        BlockModelGenerators.variant(blockvariant)
                    )
                );
            }
            if (rawName.contains("furnace") || rawName.contains("oven")) {

                String name = "block/" + rawName;
                String litName = name + "_lit";

                ResourceLocation unlit_model = modLocation(name);
                ResourceLocation lit_model = modLocation(litName);

                Variant unlit_variant = new Variant(unlit_model);
                Variant lit_variant = new Variant(lit_model);


                ModelDatagenHelpers.createRotatableFurnaceBlock(blockModels, itemModels, holder.get(), unlit_variant, lit_variant);
            }
        }

        for (DeferredHolder<Item, ? extends Item> holder : Quartztastic.ITEMS.getEntries()) {
            String rawName = holder.getId().getPath();
            if (rawName.contains("bookshelf")) {
                String name = "block/" + rawName;

                LOGGER.info("Generating model for: {}", name);

                itemModels.itemModelOutput.accept(
                    holder.get(),
                    ItemModelUtils.plainModel(modLocation(name))
                );
            }
            if (rawName.contains("furnace") || rawName.contains("oven")) {
                String name = "block/" + rawName;

                LOGGER.info("Generating model for: {}", name);

                itemModels.itemModelOutput.accept(
                    holder.get(),
                    ItemModelUtils.plainModel(modLocation(name))
                );
            }
        }

        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, RoseQuartzList.ROSE_QUARTZ_CHAIR.get(), new Variant(modLocation("block/rose_quartz_chair")));

        itemModels.itemModelOutput.accept(
            RoseQuartzList.ROSE_QUARTZ_CHAIR_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/rose_quartz_chair"))
        );


        ModelDatagenHelpers.createTableModel(blockModels, itemModels, RoseQuartzList.ROSE_QUARTZ_TABLE.get(), new Variant(modLocation("block/rose_quartz_table_single")), 
            new Variant(modLocation("block/rose_quartz_table_center")), new Variant(modLocation("block/rose_quartz_table_north")), new Variant(modLocation("block/rose_quartz_table_east")), 
            new Variant(modLocation("block/rose_quartz_table_south")), new Variant(modLocation("block/rose_quartz_table_west")), new Variant(modLocation("block/rose_quartz_table_center")), 
            new Variant(modLocation("block/rose_quartz_table_east_and_north")), new Variant(modLocation("block/rose_quartz_table_east_and_south")), 
            new Variant(modLocation("block/rose_quartz_table_center")), new Variant(modLocation("block/rose_quartz_table_west_and_north")), 
            new Variant(modLocation("block/rose_quartz_table_west_and_south")), new Variant(modLocation("block/rose_quartz_table_center")),
            new Variant(modLocation("block/rose_quartz_table_center")), new Variant(modLocation("block/rose_quartz_table_center")), 
            new Variant(modLocation("block/rose_quartz_table_center")));

        itemModels.itemModelOutput.accept(
            RoseQuartzList.ROSE_QUARTZ_TABLE_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/rose_quartz_table_single"))
        );


        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, RoseQuartzList.ROSE_QUARTZ_SHELF.get(), new Variant(modLocation("block/rose_quartz_shelf")));

        itemModels.itemModelOutput.accept(
            RoseQuartzList.ROSE_QUARTZ_SHELF_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/rose_quartz_shelf"))
        );


        ModelDatagenHelpers.createLadderBlockstates(blockModels, itemModels, RoseQuartzList.ROSE_QUARTZ_LADDER.get(), RoseQuartzList.ROSE_QUARTZ_LADDER_ITEM.get(), 
            new Variant(modLocation("block/rose_quartz_ladder")));


        ModelDatagenHelpers.createRotatableStorageBlock(blockModels, itemModels, RoseQuartzList.ROSE_QUARTZ_BARREL_BLOCK.get(), RoseQuartzList.ROSE_QUARTZ_BARREL_ITEM.get(), 
            new Variant(modLocation("block/rose_quartz_barrel")), new Variant(modLocation("block/rose_quartz_barrel_open")));


        ModelDatagenHelpers.createRotatableStorageBlock(blockModels, itemModels, RoseQuartzList.ROSE_QUARTZ_NIGHTSTAND_BLOCK.get(), RoseQuartzList.ROSE_QUARTZ_NIGHTSTAND_ITEM.get(), 
            new Variant(modLocation("block/rose_quartz_nightstand")), new Variant(modLocation("block/rose_quartz_nightstand_open")));

        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, RoseQuartzList.ROSE_QUARTZ_SINK.get(), new Variant(modLocation("block/rose_quartz_sink")));

        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, RoseQuartzList.ROSE_QUARTZ_SKULL_STATUETTE.get(), new Variant(modLocation("block/rose_quartz_skull")));
        itemModels.itemModelOutput.accept(
            RoseQuartzList.ROSE_QUARTZ_SKULL_STATUETTE_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/rose_quartz_skull"))
        );


        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, CitrineList.CITRINE_CHAIR.get(), new Variant(modLocation("block/citrine_chair")));

        itemModels.itemModelOutput.accept(
            CitrineList.CITRINE_CHAIR_ITEM.get(), 
            ItemModelUtils.plainModel(modLocation("block/citrine_chair"))
        );


        ModelDatagenHelpers.createTableModel(blockModels, itemModels, CitrineList.CITRINE_TABLE.get(), new Variant(modLocation("block/citrine_table_single")), 
            new Variant(modLocation("block/citrine_table_center")), new Variant(modLocation("block/citrine_table_north")), new Variant(modLocation("block/citrine_table_east")), 
            new Variant(modLocation("block/citrine_table_south")), new Variant(modLocation("block/citrine_table_west")), new Variant(modLocation("block/citrine_table_center")), 
            new Variant(modLocation("block/citrine_table_east_and_north")), new Variant(modLocation("block/citrine_table_east_and_south")), 
            new Variant(modLocation("block/citrine_table_center")), new Variant(modLocation("block/citrine_table_west_and_north")), 
            new Variant(modLocation("block/citrine_table_west_and_south")), new Variant(modLocation("block/citrine_table_center")),
            new Variant(modLocation("block/citrine_table_center")), new Variant(modLocation("block/citrine_table_center")), 
            new Variant(modLocation("block/citrine_table_center")));

        itemModels.itemModelOutput.accept(
            CitrineList.CITRINE_TABLE_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/citrine_table_single"))
        );


        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, CitrineList.CITRINE_SHELF.get(), new Variant(modLocation("block/citrine_shelf")));

        itemModels.itemModelOutput.accept(
            CitrineList.CITRINE_SHELF_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/citrine_shelf"))
        );


        ModelDatagenHelpers.createLadderBlockstates(blockModels, itemModels, CitrineList.CITRINE_LADDER.get(), CitrineList.CITRINE_LADDER_ITEM.get(), 
            new Variant(modLocation("block/citrine_ladder")));


        ModelDatagenHelpers.createRotatableStorageBlock(blockModels, itemModels, CitrineList.CITRINE_BARREL_BLOCK.get(), CitrineList.CITRINE_BARREL_ITEM.get(), 
            new Variant(modLocation("block/citrine_barrel")), new Variant(modLocation("block/citrine_barrel_open")));


        ModelDatagenHelpers.createRotatableStorageBlock(blockModels, itemModels, CitrineList.CITRINE_NIGHTSTAND_BLOCK.get(), CitrineList.CITRINE_NIGHTSTAND_ITEM.get(), 
            new Variant(modLocation("block/citrine_nightstand")), new Variant(modLocation("block/citrine_nightstand_open")));

            
        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, CitrineList.CITRINE_SINK.get(), new Variant(modLocation("block/citrine_sink")));

        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, CitrineList.CITRINE_SKULL_STATUETTE.get(), new Variant(modLocation("block/citrine_skull")));
        itemModels.itemModelOutput.accept(
            CitrineList.CITRINE_SKULL_STATUETTE_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/citrine_skull"))
        );


        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, BlueQuartzList.BLUE_QUARTZ_CHAIR.get(), new Variant(modLocation("block/blue_quartz_chair")));

        itemModels.itemModelOutput.accept(
            BlueQuartzList.BLUE_QUARTZ_CHAIR_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/blue_quartz_chair"))
        );


        ModelDatagenHelpers.createTableModel(blockModels, itemModels, BlueQuartzList.BLUE_QUARTZ_TABLE.get(), new Variant(modLocation("block/blue_quartz_table_single")), 
            new Variant(modLocation("block/blue_quartz_table_center")), new Variant(modLocation("block/blue_quartz_table_north")), new Variant(modLocation("block/blue_quartz_table_east")), 
            new Variant(modLocation("block/blue_quartz_table_south")), new Variant(modLocation("block/blue_quartz_table_west")), new Variant(modLocation("block/blue_quartz_table_center")), 
            new Variant(modLocation("block/blue_quartz_table_east_and_north")), new Variant(modLocation("block/blue_quartz_table_east_and_south")), 
            new Variant(modLocation("block/blue_quartz_table_center")), new Variant(modLocation("block/blue_quartz_table_west_and_north")), 
            new Variant(modLocation("block/blue_quartz_table_west_and_south")), new Variant(modLocation("block/blue_quartz_table_center")),
            new Variant(modLocation("block/blue_quartz_table_center")), new Variant(modLocation("block/blue_quartz_table_center")), 
            new Variant(modLocation("block/blue_quartz_table_center")));

        itemModels.itemModelOutput.accept(
            BlueQuartzList.BLUE_QUARTZ_TABLE_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/blue_quartz_table_single"))
        );


        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, BlueQuartzList.BLUE_QUARTZ_SHELF.get(), new Variant(modLocation("block/blue_quartz_shelf")));

        itemModels.itemModelOutput.accept(
            BlueQuartzList.BLUE_QUARTZ_SHELF_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/blue_quartz_shelf"))
        );


        ModelDatagenHelpers.createLadderBlockstates(blockModels, itemModels, BlueQuartzList.BLUE_QUARTZ_LADDER.get(), BlueQuartzList.BLUE_QUARTZ_LADDER_ITEM.get(), 
            new Variant(modLocation("block/blue_quartz_ladder")));


        ModelDatagenHelpers.createRotatableStorageBlock(blockModels, itemModels, BlueQuartzList.BLUE_QUARTZ_BARREL_BLOCK.get(), BlueQuartzList.BLUE_QUARTZ_BARREL_ITEM.get(), 
            new Variant(modLocation("block/blue_quartz_barrel")), new Variant(modLocation("block/blue_quartz_barrel_open")));


        ModelDatagenHelpers.createRotatableStorageBlock(blockModels, itemModels, BlueQuartzList.BLUE_QUARTZ_NIGHTSTAND_BLOCK.get(), BlueQuartzList.BLUE_QUARTZ_NIGHTSTAND_ITEM.get(), 
            new Variant(modLocation("block/blue_quartz_nightstand")), new Variant(modLocation("block/blue_quartz_nightstand_open")));

        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, BlueQuartzList.BLUE_QUARTZ_SINK.get(), new Variant(modLocation("block/blue_quartz_sink")));

        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, BlueQuartzList.BLUE_QUARTZ_SKULL_STATUETTE.get(), new Variant(modLocation("block/blue_quartz_skull")));
        itemModels.itemModelOutput.accept(
            BlueQuartzList.BLUE_QUARTZ_SKULL_STATUETTE_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/blue_quartz_skull"))
        );


        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, PrasioliteQuartzList.PRASIOLITE_QUARTZ_CHAIR.get(), new Variant(modLocation("block/prasiolite_quartz_chair")));

        itemModels.itemModelOutput.accept(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_CHAIR_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/prasiolite_quartz_chair"))
        );


        ModelDatagenHelpers.createTableModel(blockModels, itemModels, PrasioliteQuartzList.PRASIOLITE_QUARTZ_TABLE.get(), new Variant(modLocation("block/prasiolite_quartz_table_single")), 
            new Variant(modLocation("block/prasiolite_quartz_table_center")), new Variant(modLocation("block/prasiolite_quartz_table_north")), new Variant(modLocation("block/prasiolite_quartz_table_east")), 
            new Variant(modLocation("block/prasiolite_quartz_table_south")), new Variant(modLocation("block/prasiolite_quartz_table_west")), new Variant(modLocation("block/prasiolite_quartz_table_center")), 
            new Variant(modLocation("block/prasiolite_quartz_table_east_and_north")), new Variant(modLocation("block/prasiolite_quartz_table_east_and_south")), 
            new Variant(modLocation("block/prasiolite_quartz_table_center")), new Variant(modLocation("block/prasiolite_quartz_table_west_and_north")), 
            new Variant(modLocation("block/prasiolite_quartz_table_west_and_south")), new Variant(modLocation("block/prasiolite_quartz_table_center")),
            new Variant(modLocation("block/prasiolite_quartz_table_center")), new Variant(modLocation("block/prasiolite_quartz_table_center")), 
            new Variant(modLocation("block/prasiolite_quartz_table_center")));

        itemModels.itemModelOutput.accept(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_TABLE_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/prasiolite_quartz_table_single"))
        );


        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, PrasioliteQuartzList.PRASIOLITE_QUARTZ_SHELF.get(), new Variant(modLocation("block/prasiolite_quartz_shelf")));

        itemModels.itemModelOutput.accept(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_SHELF_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/prasiolite_quartz_shelf"))
        );


        ModelDatagenHelpers.createLadderBlockstates(blockModels, itemModels, PrasioliteQuartzList.PRASIOLITE_QUARTZ_LADDER.get(), PrasioliteQuartzList.PRASIOLITE_QUARTZ_LADDER_ITEM.get(), 
            new Variant(modLocation("block/prasiolite_quartz_ladder")));


        ModelDatagenHelpers.createRotatableStorageBlock(blockModels, itemModels, PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARREL_BLOCK.get(), PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARREL_ITEM.get(), 
            new Variant(modLocation("block/prasiolite_quartz_barrel")), new Variant(modLocation("block/prasiolite_quartz_barrel_open")));


        ModelDatagenHelpers.createRotatableStorageBlock(blockModels, itemModels, PrasioliteQuartzList.PRASIOLITE_QUARTZ_NIGHTSTAND_BLOCK.get(), PrasioliteQuartzList.PRASIOLITE_QUARTZ_NIGHTSTAND_ITEM.get(), 
            new Variant(modLocation("block/prasiolite_quartz_nightstand")), new Variant(modLocation("block/prasiolite_quartz_nightstand_open")));

        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, PrasioliteQuartzList.PRASIOLITE_QUARTZ_SINK.get(), new Variant(modLocation("block/prasiolite_quartz_sink")));
        

        ModelDatagenHelpers.createHorizontalRotationModel(blockModels, itemModels, PrasioliteQuartzList.PRASIOLITE_QUARTZ_SKULL_STATUETTE.get(), new Variant(modLocation("block/prasiolite_quartz_skull")));
        itemModels.itemModelOutput.accept(
            PrasioliteQuartzList.PRASIOLITE_QUARTZ_SKULL_STATUETTE_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/prasiolite_quartz_skull"))
        );
    }

    protected void buildLanternModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.createLantern(SmokyQuartzList.SMOKY_QUARTZ_LANTERN.get());

        blockModels.createLantern(SmokyQuartzList.SMOKY_QUARTZ_SOUL_LANTERN.get());

        ModelDatagenHelpers.createChainBlockstates(blockModels, itemModels, SmokyQuartzList.SMOKY_QUARTZ_CHAIN.get(), SmokyQuartzList.SMOKY_QUARTZ_CHAIN_ITEM.get());


        blockModels.createLantern(RoseQuartzList.ROSE_QUARTZ_LANTERN.get());

        blockModels.createLantern(RoseQuartzList.ROSE_QUARTZ_SOUL_LANTERN.get());

        ModelDatagenHelpers.createChainBlockstates(blockModels, itemModels, RoseQuartzList.ROSE_QUARTZ_CHAIN.get(), RoseQuartzList.ROSE_QUARTZ_CHAIN_ITEM.get());



        blockModels.createLantern(CitrineList.CITRINE_LANTERN.get());

        blockModels.createLantern(CitrineList.CITRINE_SOUL_LANTERN.get());

        ModelDatagenHelpers.createChainBlockstates(blockModels, itemModels, CitrineList.CITRINE_CHAIN.get(), CitrineList.CITRINE_CHAIN_ITEM.get());


        blockModels.createLantern(BlueQuartzList.BLUE_QUARTZ_LANTERN.get());

        blockModels.createLantern(BlueQuartzList.BLUE_QUARTZ_SOUL_LANTERN.get());

        ModelDatagenHelpers.createChainBlockstates(blockModels, itemModels, BlueQuartzList.BLUE_QUARTZ_CHAIN.get(), BlueQuartzList.BLUE_QUARTZ_CHAIN_ITEM.get());


        blockModels.createLantern(PrasioliteQuartzList.PRASIOLITE_QUARTZ_LANTERN.get());

        blockModels.createLantern(PrasioliteQuartzList.PRASIOLITE_QUARTZ_SOUL_LANTERN.get());

        ModelDatagenHelpers.createChainBlockstates(blockModels, itemModels, PrasioliteQuartzList.PRASIOLITE_QUARTZ_CHAIN.get(), PrasioliteQuartzList.PRASIOLITE_QUARTZ_CHAIN_ITEM.get());
    }

    protected void buildTorchModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.createNormalTorch(SmokyQuartzList.SMOKY_QUARTZ_TORCH.get(), SmokyQuartzList.SMOKY_QUARTZ_WALL_TORCH.get());

        blockModels.createNormalTorch(SmokyQuartzList.SMOKY_QUARTZ_SOUL_TORCH.get(), SmokyQuartzList.SMOKY_QUARTZ_WALL_SOUL_TORCH.get());


        blockModels.createNormalTorch(RoseQuartzList.ROSE_QUARTZ_TORCH.get(), RoseQuartzList.ROSE_QUARTZ_WALL_TORCH.get());

        blockModels.createNormalTorch(RoseQuartzList.ROSE_QUARTZ_SOUL_TORCH.get(), RoseQuartzList.ROSE_QUARTZ_WALL_SOUL_TORCH.get());


        blockModels.createNormalTorch(CitrineList.CITRINE_TORCH.get(), CitrineList.CITRINE_WALL_TORCH.get());

        blockModels.createNormalTorch(CitrineList.CITRINE_SOUL_TORCH.get(), CitrineList.CITRINE_WALL_SOUL_TORCH.get());


        blockModels.createNormalTorch(BlueQuartzList.BLUE_QUARTZ_TORCH.get(), BlueQuartzList.BLUE_QUARTZ_WALL_TORCH.get());

        blockModels.createNormalTorch(BlueQuartzList.BLUE_QUARTZ_SOUL_TORCH.get(), BlueQuartzList.BLUE_QUARTZ_WALL_SOUL_TORCH.get());


        blockModels.createNormalTorch(PrasioliteQuartzList.PRASIOLITE_QUARTZ_TORCH.get(), PrasioliteQuartzList.PRASIOLITE_QUARTZ_WALL_TORCH.get());

        blockModels.createNormalTorch(PrasioliteQuartzList.PRASIOLITE_QUARTZ_SOUL_TORCH.get(), PrasioliteQuartzList.PRASIOLITE_QUARTZ_WALL_SOUL_TORCH.get());
    }

    protected void buildBarModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.createBarsAndItem(SmokyQuartzList.SMOKY_QUARTZ_PANE.get());

        blockModels.createGlassBlocks(SmokyQuartzList.SMOKY_QUARTZ_BARS_BLOCK.get(), SmokyQuartzList.SMOKY_QUARTZ_BARS.get());


        blockModels.createGlassBlocks(RoseQuartzList.ROSE_QUARTZ_BARS_BLOCK.get(), RoseQuartzList.ROSE_QUARTZ_BARS.get());


        blockModels.createGlassBlocks(CitrineList.CITRINE_BARS_BLOCK.get(), CitrineList.CITRINE_BARS.get());


        blockModels.createGlassBlocks(BlueQuartzList.BLUE_QUARTZ_BARS_BLOCK.get(), BlueQuartzList.BLUE_QUARTZ_BARS.get());


        blockModels.createGlassBlocks(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARS_BLOCK.get(), PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARS.get());
    }
}

