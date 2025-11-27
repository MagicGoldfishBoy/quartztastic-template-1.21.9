package com.quarztastic.goldfishboy.datagen;

import java.util.concurrent.CompletableFuture;

import com.quarztastic.goldfishboy.registry.BlueQuartzList;
import com.quarztastic.goldfishboy.registry.CitrineList;
import com.quarztastic.goldfishboy.registry.PrasioliteQuartzList;
import com.quarztastic.goldfishboy.registry.RoseQuartzList;
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
                SmokyQuartzList.SMOKY_QUARTZ_NETHERRACK_ORE.get(),

                SmokyQuartzList.SMOKY_QUARTZ_BLOCK.get(), 
                SmokyQuartzList.SMOKY_QUARTZ_SLAB.get(), 
                SmokyQuartzList.SMOKY_QUARTZ_STAIRS.get(), 
                SmokyQuartzList.SMOKY_QUARTZ_PRESSURE_PLATE.get(), 
                SmokyQuartzList.SMOKY_QUARTZ_FENCE.get(), 
                SmokyQuartzList.SMOKY_QUARTZ_WALL.get(), 
                SmokyQuartzList.SMOKY_QUARTZ_GATE.get(), 

                SmokyQuartzList.SMOKY_QUARTZ_BRICKS.get(), 
                SmokyQuartzList.SMOKY_QUARTZ_BRICKS_SLAB.get(), 
                SmokyQuartzList.SMOKY_QUARTZ_BRICKS_STAIRS.get(), 
                SmokyQuartzList.SMOKY_QUARTZ_BRICK_WALL.get(),

                SmokyQuartzList.CHISELED_SMOKY_QUARTZ_BLOCK.get(),

                SmokyQuartzList.SMOKY_QUARTZ_TILES.get(),
                SmokyQuartzList.SMOKY_QUARTZ_TILES_SLAB.get(),
                SmokyQuartzList.SMOKY_QUARTZ_TILES_STAIRS.get(),
                
                SmokyQuartzList.SMOKY_QUARTZ_PILLAR.get(),

                SmokyQuartzList.SMOKY_QUARTZ_PANE.get(),

                SmokyQuartzList.SMOKY_QUARTZ_BARS_BLOCK.get(),
                SmokyQuartzList.SMOKY_QUARTZ_BARS.get(),

                SmokyQuartzList.SMOKY_QUARTZ_BOOKSHELF.get(),

                SmokyQuartzList.SMOKY_QUARTZ_FURNACE_BLOCK.get(),
                SmokyQuartzList.SMOKY_QUARTZ_OVEN_BLOCK.get(),
                SmokyQuartzList.SMOKY_QUARTZ_BLAST_FURNACE_BLOCK.get(),

                SmokyQuartzList.SMOKY_QUARTZ_DOOR.get(),
                SmokyQuartzList.SMOKY_QUARTZ_TRAPDOOR.get(),
                
                SmokyQuartzList.SMOKY_QUARTZ_CHAIR.get(),
                SmokyQuartzList.SMOKY_QUARTZ_TABLE.get(),
                SmokyQuartzList.SMOKY_QUARTZ_SHELF.get(),
                SmokyQuartzList.SMOKY_QUARTZ_LIGHT.get(),
                SmokyQuartzList.SMOKY_QUARTZ_LANTERN.get(),
                SmokyQuartzList.SMOKY_QUARTZ_SOUL_LANTERN.get(),
                SmokyQuartzList.SMOKY_QUARTZ_CHAIN.get(),

                SmokyQuartzList.SMOKY_QUARTZ_BARREL.get(),
                SmokyQuartzList.SMOKY_QUARTZ_NIGHTSTAND.get(),

                SmokyQuartzList.SMOKY_QUARTZ_SINK.get(),

                SmokyQuartzList.SMOKY_QUARTZ_PATH.get(),

                SmokyQuartzList.SMOKY_QUARTZ_SKULL_STATUETTE.get(),


                RoseQuartzList.ROSE_QUARTZ_ORE.get(),

                RoseQuartzList.ROSE_QUARTZ_BLOCK.get(), 
                RoseQuartzList.ROSE_QUARTZ_SLAB.get(), 
                RoseQuartzList.ROSE_QUARTZ_STAIRS.get(), 
                RoseQuartzList.ROSE_QUARTZ_BUTTON.get(), 
                RoseQuartzList.ROSE_QUARTZ_PRESSURE_PLATE.get(), 
                RoseQuartzList.ROSE_QUARTZ_FENCE.get(), 
                RoseQuartzList.ROSE_QUARTZ_WALL.get(), 
                RoseQuartzList.ROSE_QUARTZ_GATE.get(),

                RoseQuartzList.ROSE_QUARTZ_BRICKS.get(), 
                RoseQuartzList.ROSE_QUARTZ_BRICK_SLAB.get(), 
                RoseQuartzList.ROSE_QUARTZ_BRICK_STAIRS.get(), 
                RoseQuartzList.ROSE_QUARTZ_BRICK_WALL.get(),

                RoseQuartzList.CHISELED_ROSE_QUARTZ_BLOCK.get(),

                RoseQuartzList.ROSE_QUARTZ_TILES.get(),
                RoseQuartzList.ROSE_QUARTZ_TILE_SLAB.get(),
                RoseQuartzList.ROSE_QUARTZ_TILE_STAIRS.get(),

                RoseQuartzList.ROSE_QUARTZ_PILLAR.get(),

                RoseQuartzList.ROSE_QUARTZ_BARS_BLOCK.get(),
                RoseQuartzList.ROSE_QUARTZ_BARS.get(),

                RoseQuartzList.ROSE_QUARTZ_LIGHT.get(),
                RoseQuartzList.ROSE_QUARTZ_LANTERN.get(),
                RoseQuartzList.ROSE_QUARTZ_SOUL_LANTERN.get(),
                RoseQuartzList.ROSE_QUARTZ_CHAIN.get(),

                RoseQuartzList.ROSE_QUARTZ_LADDER.get(),
                RoseQuartzList.ROSE_QUARTZ_BARREL_BLOCK.get(),
                RoseQuartzList.ROSE_QUARTZ_NIGHTSTAND_BLOCK.get(),
                RoseQuartzList.ROSE_QUARTZ_BOOKSHELF.get(),

                RoseQuartzList.ROSE_QUARTZ_FURNACE.get(),
                RoseQuartzList.ROSE_QUARTZ_OVEN.get(),
                RoseQuartzList.ROSE_QUARTZ_BLAST_FURNACE.get(),

                RoseQuartzList.ROSE_QUARTZ_DOOR.get(),
                RoseQuartzList.ROSE_QUARTZ_TRAPDOOR.get(),

                RoseQuartzList.ROSE_QUARTZ_CHAIR.get(),
                RoseQuartzList.ROSE_QUARTZ_TABLE.get(),
                RoseQuartzList.ROSE_QUARTZ_SHELF.get(),

                RoseQuartzList.ROSE_QUARTZ_SINK.get(),

                RoseQuartzList.ROSE_QUARTZ_PATH.get(),

                RoseQuartzList.ROSE_QUARTZ_SKULL_STATUETTE.get(),


                CitrineList.CITRINE_ORE.get(),

                CitrineList.CITRINE_BLOCK.get(),
                CitrineList.CITRINE_SLAB.get(),
                CitrineList.CITRINE_STAIRS.get(),
                CitrineList.CITRINE_BUTTON.get(),
                CitrineList.CITRINE_PRESSURE_PLATE.get(),
                CitrineList.CITRINE_FENCE.get(),
                CitrineList.CITRINE_WALL.get(),
                CitrineList.CITRINE_GATE.get(),

                CitrineList.CITRINE_BRICKS.get(),
                CitrineList.CITRINE_BRICK_SLAB.get(),
                CitrineList.CITRINE_BRICK_STAIRS.get(),
                CitrineList.CITRINE_BRICK_WALL.get(),

                CitrineList.CHISELED_CITRINE_BLOCK.get(),

                CitrineList.CITRINE_TILES.get(),
                CitrineList.CITRINE_TILE_SLAB.get(),
                CitrineList.CITRINE_TILE_STAIRS.get(),

                CitrineList.CITRINE_PILLAR.get(),

                CitrineList.CITRINE_BARS_BLOCK.get(),
                CitrineList.CITRINE_BARS.get(),

                CitrineList.CITRINE_BOOKSHELF.get(),
                CitrineList.CITRINE_FURNACE.get(),
                CitrineList.CITRINE_OVEN.get(),
                CitrineList.CITRINE_BLAST_FURNACE.get(),

                CitrineList.CITRINE_DOOR.get(),
                CitrineList.CITRINE_TRAPDOOR.get(),

                CitrineList.CITRINE_CHAIR.get(),
                CitrineList.CITRINE_TABLE.get(),
                CitrineList.CITRINE_SHELF.get(),
                CitrineList.CITRINE_LIGHT.get(),
                CitrineList.CITRINE_LANTERN.get(),
                CitrineList.CITRINE_SOUL_LANTERN.get(),
                CitrineList.CITRINE_CHAIN.get(),
                CitrineList.CITRINE_TORCH.get(),
                CitrineList.CITRINE_SOUL_TORCH.get(),
                CitrineList.CITRINE_LADDER.get(),

                CitrineList.CITRINE_BARREL_BLOCK.get(),
                CitrineList.CITRINE_NIGHTSTAND_BLOCK.get(),

                CitrineList.CITRINE_SINK.get(),
                CitrineList.CITRINE_PATH.get(),
                CitrineList.CITRINE_SKULL_STATUETTE.get(),


                BlueQuartzList.BLUE_QUARTZ_ORE.get(),
                BlueQuartzList.BLUE_QUARTZ_BLOCK.get(),
                BlueQuartzList.BLUE_QUARTZ_PANE.get(),
                BlueQuartzList.BLUE_QUARTZ_SLAB.get(),
                BlueQuartzList.BLUE_QUARTZ_STAIRS.get(),
                BlueQuartzList.BLUE_QUARTZ_BUTTON.get(),
                BlueQuartzList.BLUE_QUARTZ_PRESSURE_PLATE.get(),
                BlueQuartzList.BLUE_QUARTZ_FENCE.get(),
                BlueQuartzList.BLUE_QUARTZ_WALL.get(),
                BlueQuartzList.BLUE_QUARTZ_GATE.get(),

                BlueQuartzList.BLUE_QUARTZ_BRICKS.get(), 
                BlueQuartzList.BLUE_QUARTZ_BRICK_SLAB.get(), 
                BlueQuartzList.BLUE_QUARTZ_BRICK_STAIRS.get(), 
                BlueQuartzList.BLUE_QUARTZ_BRICK_WALL.get(),

                BlueQuartzList.CHISELED_BLUE_QUARTZ_BLOCK.get(),

                BlueQuartzList.BLUE_QUARTZ_TILES.get(),
                BlueQuartzList.BLUE_QUARTZ_TILE_SLAB.get(),
                BlueQuartzList.BLUE_QUARTZ_TILE_STAIRS.get(),

                BlueQuartzList.BLUE_QUARTZ_PILLAR.get(),

                BlueQuartzList.BLUE_QUARTZ_BARS_BLOCK.get(),
                BlueQuartzList.BLUE_QUARTZ_BARS.get(),

                BlueQuartzList.BLUE_QUARTZ_BOOKSHELF.get(),

                BlueQuartzList.BLUE_QUARTZ_FURNACE.get(),
                BlueQuartzList.BLUE_QUARTZ_OVEN.get(),
                BlueQuartzList.BLUE_QUARTZ_BLAST_FURNACE.get(),

                BlueQuartzList.BLUE_QUARTZ_DOOR.get(),
                BlueQuartzList.BLUE_QUARTZ_TRAPDOOR.get(),

                BlueQuartzList.BLUE_QUARTZ_CHAIR.get(),
                BlueQuartzList.BLUE_QUARTZ_TABLE.get(),
                BlueQuartzList.BLUE_QUARTZ_SHELF.get(),

                BlueQuartzList.BLUE_QUARTZ_LIGHT.get(),
                BlueQuartzList.BLUE_QUARTZ_LANTERN.get(),
                BlueQuartzList.BLUE_QUARTZ_SOUL_LANTERN.get(),
                BlueQuartzList.BLUE_QUARTZ_CHAIN.get(),

                BlueQuartzList.BLUE_QUARTZ_LADDER.get(),

                BlueQuartzList.BLUE_QUARTZ_BARREL_BLOCK.get(),
                BlueQuartzList.BLUE_QUARTZ_NIGHTSTAND_BLOCK.get(),

                BlueQuartzList.BLUE_QUARTZ_SINK.get(),

                BlueQuartzList.BLUE_QUARTZ_PATH.get(),


                PrasioliteQuartzList.PRASIOLITE_QUARTZ_ORE.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_NETHERRACK_ORE.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_PANE.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_STAIRS.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_BUTTON.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_PRESSURE_PLATE.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_FENCE.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_WALL.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_GATE.get(),

                PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS.get(), 
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_SLAB.get(), 
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_STAIRS.get(), 
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_WALL.get(),

                PrasioliteQuartzList.CHISELED_PRASIOLITE_QUARTZ_BLOCK.get(),

                PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILES.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILE_SLAB.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILE_STAIRS.get(),

                PrasioliteQuartzList.PRASIOLITE_QUARTZ_PILLAR.get(),

                PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARS_BLOCK.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARS.get(),

                PrasioliteQuartzList.PRASIOLITE_QUARTZ_BOOKSHELF.get(),

                PrasioliteQuartzList.PRASIOLITE_QUARTZ_FURNACE.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLAST_FURNACE.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_OVEN.get(),

                PrasioliteQuartzList.PRASIOLITE_QUARTZ_DOOR.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_TRAPDOOR.get(),

                PrasioliteQuartzList.PRASIOLITE_QUARTZ_CHAIR.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_TABLE.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_SHELF.get(),

                PrasioliteQuartzList.PRASIOLITE_QUARTZ_LIGHT.get()
            );

        
        this.tag(TagKeyList.STONE_PRESSURE_PLATES_TAG)
            .add(
                SmokyQuartzList.SMOKY_QUARTZ_PRESSURE_PLATE.get(),

                RoseQuartzList.ROSE_QUARTZ_PRESSURE_PLATE.get(),

                CitrineList.CITRINE_PRESSURE_PLATE.get(),

                BlueQuartzList.BLUE_QUARTZ_PRESSURE_PLATE.get(),

                PrasioliteQuartzList.PRASIOLITE_QUARTZ_PRESSURE_PLATE.get()
            );

        this.tag(TagKeyList.FENCES_TAG)
            .add(
                SmokyQuartzList.SMOKY_QUARTZ_FENCE.get(),

                RoseQuartzList.ROSE_QUARTZ_FENCE.get(),

                CitrineList.CITRINE_FENCE.get(),

                BlueQuartzList.BLUE_QUARTZ_FENCE.get(),

                PrasioliteQuartzList.PRASIOLITE_QUARTZ_FENCE.get()
            );

        this.tag(TagKeyList.WALLS_TAG)
            .add(
                SmokyQuartzList.SMOKY_QUARTZ_WALL.get(),
                SmokyQuartzList.SMOKY_QUARTZ_BRICK_WALL.get(),

                RoseQuartzList.ROSE_QUARTZ_WALL.get(),
                RoseQuartzList.ROSE_QUARTZ_BRICK_WALL.get(),

                CitrineList.CITRINE_WALL.get(),
                CitrineList.CITRINE_BRICK_WALL.get(),

                BlueQuartzList.BLUE_QUARTZ_WALL.get(),
                BlueQuartzList.BLUE_QUARTZ_BRICK_WALL.get(),

                PrasioliteQuartzList.PRASIOLITE_QUARTZ_WALL.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_WALL.get()
            );

        this.tag(TagKeyList.GATES_TAG)
            .add(
                SmokyQuartzList.SMOKY_QUARTZ_GATE.get(),

                RoseQuartzList.ROSE_QUARTZ_GATE.get(),

                CitrineList.CITRINE_GATE.get(),

                BlueQuartzList.BLUE_QUARTZ_GATE.get(),

                PrasioliteQuartzList.PRASIOLITE_QUARTZ_GATE.get()
            );

        this.tag(TagKeyList.DOORS_TAG)
            .add(
                SmokyQuartzList.SMOKY_QUARTZ_DOOR.get(),
                RoseQuartzList.ROSE_QUARTZ_DOOR.get(),
                CitrineList.CITRINE_DOOR.get(),
                BlueQuartzList.BLUE_QUARTZ_DOOR.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_DOOR.get()
            );

        this.tag(TagKeyList.TRAP_DOORS_TAG)
            .add(
                SmokyQuartzList.SMOKY_QUARTZ_TRAPDOOR.get(),
                RoseQuartzList.ROSE_QUARTZ_TRAPDOOR.get(),
                CitrineList.CITRINE_TRAPDOOR.get(),
                BlueQuartzList.BLUE_QUARTZ_TRAPDOOR.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_TRAPDOOR.get()
            );

        this.tag(TagKeyList.BARRELS_TAG)
            .add(
                SmokyQuartzList.SMOKY_QUARTZ_BARREL.get(),
                RoseQuartzList.ROSE_QUARTZ_BARREL_BLOCK.get(),
                CitrineList.CITRINE_BARREL_BLOCK.get(),
                BlueQuartzList.BLUE_QUARTZ_BARREL_BLOCK.get()
            );


        this.tag(TagKeyList.PIGLIN_REPELLENT_TAG)
            .add(
                SmokyQuartzList.SMOKY_QUARTZ_SOUL_LANTERN.get(),
                SmokyQuartzList.SMOKY_QUARTZ_SOUL_TORCH.get(),
                SmokyQuartzList.SMOKY_QUARTZ_SKULL_STATUETTE.get(),

                RoseQuartzList.ROSE_QUARTZ_SOUL_LANTERN.get(),
                RoseQuartzList.ROSE_QUARTZ_SOUL_TORCH.get(),
                RoseQuartzList.ROSE_QUARTZ_SKULL_STATUETTE.get(),

                CitrineList.CITRINE_SOUL_LANTERN.get(),
                CitrineList.CITRINE_SOUL_TORCH.get(),
                CitrineList.CITRINE_SKULL_STATUETTE.get(),

                BlueQuartzList.BLUE_QUARTZ_SOUL_LANTERN.get(),
                BlueQuartzList.BLUE_QUARTZ_SOUL_TORCH.get(),
                BlueQuartzList.BLUE_QUARTZ_SKULL_STATUETTE.get()
            );

        this.tag(TagKeyList.CLIMBABLE_TAG)
            .add(
                SmokyQuartzList.SMOKY_QUARTZ_LADDER.get(),
                RoseQuartzList.ROSE_QUARTZ_LADDER.get(),
                CitrineList.CITRINE_LADDER.get(),
                BlueQuartzList.BLUE_QUARTZ_LADDER.get()
            );

        this.tag(TagKeyList.ENCHANTMENT_POWER_PROVIDER_TAG)
            .add(
                SmokyQuartzList.SMOKY_QUARTZ_BOOKSHELF.get(),
                RoseQuartzList.ROSE_QUARTZ_BOOKSHELF.get(),
                CitrineList.CITRINE_BOOKSHELF.get(),
                BlueQuartzList.BLUE_QUARTZ_BOOKSHELF.get(),
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_BOOKSHELF.get()
            );
    }
    
}
