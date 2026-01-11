package com.quarztastic.goldfishboy;

import com.quarztastic.goldfishboy.registry.blue_quartz.BlueQuartzList;
import com.quarztastic.goldfishboy.registry.citrine.CitrineList;
import com.quarztastic.goldfishboy.registry.prasiolite_quartz.PrasioliteQuartzList;
import com.quarztastic.goldfishboy.registry.rose_quartz.RoseQuartzList;
import com.quarztastic.goldfishboy.registry.smoky_quartz.SmokyQuartzList;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

public class QuartztasticCommonSetupMethods {

    static void setSmokyQuartzPotPlants(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            FlowerPotBlock smokyQuartzPot = SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT.get();
            
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.POPPY), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_POPPY.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.DANDELION), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_DANDELION.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BLUE_ORCHID), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_BLUE_ORCHID.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.ALLIUM), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_ALLIUM.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.AZURE_BLUET), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_AZURE_BLUET.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.RED_TULIP), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_RED_TULIP.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.ORANGE_TULIP), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_ORANGE_TULIP.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WHITE_TULIP), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_WHITE_TULIP.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.PINK_TULIP), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_PINK_TULIP.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.OXEYE_DAISY), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_OXEYE_DAISY.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CORNFLOWER), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_CORNFLOWER.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.LILY_OF_THE_VALLEY), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_LILY_OF_THE_VALLEY.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WITHER_ROSE), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_WITHER_ROSE.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.TORCHFLOWER), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_TORCHFLOWER.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CLOSED_EYEBLOSSOM), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_CLOSED_EYEBLOSSOM.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.OPEN_EYEBLOSSOM), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_OPEN_EYEBLOSSOM.get()
            );

            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.OAK_SAPLING), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_OAK_SAPLING.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.SPRUCE_SAPLING), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_SPRUCE_SAPLING.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BIRCH_SAPLING), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_BIRCH_SAPLING.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.JUNGLE_SAPLING), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_JUNGLE_SAPLING.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.ACACIA_SAPLING), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_ACACIA_SAPLING.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.DARK_OAK_SAPLING), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_DARK_OAK_SAPLING.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.AZALEA), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_AZALEA.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.FLOWERING_AZALEA), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_FLOWERING_AZALEA.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.MANGROVE_PROPAGULE), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_MANGROVE_PROPAGULE.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CHERRY_SAPLING), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_CHERRY_SAPLING.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.PALE_OAK_SAPLING), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_PALE_OAK_SAPLING.get()
            );

            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.RED_MUSHROOM), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_RED_MUSHROOM.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BROWN_MUSHROOM), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_BROWN_MUSHROOM.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CRIMSON_FUNGUS), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_CRIMSON_FUNGUS.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WARPED_FUNGUS), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_WARPED_FUNGUS.get()
            );

            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CRIMSON_ROOTS), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_CRIMSON_ROOTS.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WARPED_ROOTS), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_WARPED_ROOTS.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.FERN), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_FERN.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.DEAD_BUSH), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_DEAD_BUSH.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CACTUS), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_CACTUS.get()
            );
            smokyQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BAMBOO), 
                () -> SmokyQuartzList.SMOKY_QUARTZ_POTTED_BAMBOO.get()
            );
        });
    }
   
    static void setRoseQuartzPotPlants(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            FlowerPotBlock roseQuartzPot = RoseQuartzList.ROSE_QUARTZ_FLOWER_POT.get();
            
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.POPPY), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_POPPY.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.DANDELION), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_DANDELION.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BLUE_ORCHID), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_BLUE_ORCHID.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.ALLIUM), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_ALLIUM.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.AZURE_BLUET), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_AZURE_BLUET.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.RED_TULIP), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_RED_TULIP.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.ORANGE_TULIP), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_ORANGE_TULIP.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WHITE_TULIP), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_WHITE_TULIP.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.PINK_TULIP), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_PINK_TULIP.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.OXEYE_DAISY), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_OXEYE_DAISY.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CORNFLOWER), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_CORNFLOWER.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.LILY_OF_THE_VALLEY), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_LILY_OF_THE_VALLEY.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WITHER_ROSE), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_WITHER_ROSE.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.TORCHFLOWER), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_TORCHFLOWER.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CLOSED_EYEBLOSSOM), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.OPEN_EYEBLOSSOM), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_OPEN_EYEBLOSSOM.get()
            );

            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.OAK_SAPLING), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_OAK_SAPLING.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.SPRUCE_SAPLING), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_SPRUCE_SAPLING.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BIRCH_SAPLING), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_BIRCH_SAPLING.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.JUNGLE_SAPLING), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_JUNGLE_SAPLING.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.ACACIA_SAPLING), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_ACACIA_SAPLING.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.DARK_OAK_SAPLING), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_DARK_OAK_SAPLING.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.AZALEA), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_AZALEA.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.FLOWERING_AZALEA), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_FLOWERING_AZALEA.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.MANGROVE_PROPAGULE), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_MANGROVE_PROPAGULE.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CHERRY_SAPLING), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_CHERRY_SAPLING.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.PALE_OAK_SAPLING), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_PALE_OAK_SAPLING.get()
            );

            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.RED_MUSHROOM), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_RED_MUSHROOM.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BROWN_MUSHROOM), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_BROWN_MUSHROOM.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CRIMSON_FUNGUS), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_CRIMSON_FUNGUS.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WARPED_FUNGUS), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_WARPED_FUNGUS.get()
            );

            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CRIMSON_ROOTS), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_CRIMSON_ROOTS.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WARPED_ROOTS), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_WARPED_ROOTS.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.FERN), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_FERN.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.DEAD_BUSH), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_DEAD_BUSH.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CACTUS), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_CACTUS.get()
            );
            roseQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BAMBOO), 
                () -> RoseQuartzList.ROSE_QUARTZ_POTTED_BAMBOO.get()
            );
        });
    }

    static void setCitrinePotPlants(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            FlowerPotBlock citrinePot = CitrineList.CITRINE_FLOWER_POT.get();
            
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.POPPY), 
                () -> CitrineList.CITRINE_POTTED_POPPY.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.DANDELION), 
                () -> CitrineList.CITRINE_POTTED_DANDELION.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BLUE_ORCHID), 
                () -> CitrineList.CITRINE_POTTED_BLUE_ORCHID.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.ALLIUM), 
                () -> CitrineList.CITRINE_POTTED_ALLIUM.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.AZURE_BLUET), 
                () -> CitrineList.CITRINE_POTTED_AZURE_BLUET.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.RED_TULIP), 
                () -> CitrineList.CITRINE_POTTED_RED_TULIP.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.ORANGE_TULIP), 
                () -> CitrineList.CITRINE_POTTED_ORANGE_TULIP.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WHITE_TULIP), 
                () -> CitrineList.CITRINE_POTTED_WHITE_TULIP.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.PINK_TULIP), 
                () -> CitrineList.CITRINE_POTTED_PINK_TULIP.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.OXEYE_DAISY), 
                () -> CitrineList.CITRINE_POTTED_OXEYE_DAISY.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CORNFLOWER), 
                () -> CitrineList.CITRINE_POTTED_CORNFLOWER.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.LILY_OF_THE_VALLEY), 
                () -> CitrineList.CITRINE_POTTED_LILY_OF_THE_VALLEY.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WITHER_ROSE), 
                () -> CitrineList.CITRINE_POTTED_WITHER_ROSE.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.TORCHFLOWER), 
                () -> CitrineList.CITRINE_POTTED_TORCHFLOWER.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CLOSED_EYEBLOSSOM), 
                () -> CitrineList.CITRINE_POTTED_CLOSED_EYEBLOSSOM.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.OPEN_EYEBLOSSOM), 
                () -> CitrineList.CITRINE_POTTED_OPEN_EYEBLOSSOM.get()
            );

            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.OAK_SAPLING), 
                () -> CitrineList.CITRINE_POTTED_OAK_SAPLING.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.SPRUCE_SAPLING), 
                () -> CitrineList.CITRINE_POTTED_SPRUCE_SAPLING.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BIRCH_SAPLING), 
                () -> CitrineList.CITRINE_POTTED_BIRCH_SAPLING.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.JUNGLE_SAPLING), 
                () -> CitrineList.CITRINE_POTTED_JUNGLE_SAPLING.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.ACACIA_SAPLING), 
                () -> CitrineList.CITRINE_POTTED_ACACIA_SAPLING.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.DARK_OAK_SAPLING), 
                () -> CitrineList.CITRINE_POTTED_DARK_OAK_SAPLING.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.AZALEA), 
                () -> CitrineList.CITRINE_POTTED_AZALEA.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.FLOWERING_AZALEA), 
                () -> CitrineList.CITRINE_POTTED_FLOWERING_AZALEA.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.MANGROVE_PROPAGULE), 
                () -> CitrineList.CITRINE_POTTED_MANGROVE_PROPAGULE.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CHERRY_SAPLING), 
                () -> CitrineList.CITRINE_POTTED_CHERRY_SAPLING.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.PALE_OAK_SAPLING), 
                () -> CitrineList.CITRINE_POTTED_PALE_OAK_SAPLING.get()
            );

            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.RED_MUSHROOM), 
                () -> CitrineList.CITRINE_POTTED_RED_MUSHROOM.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BROWN_MUSHROOM), 
                () -> CitrineList.CITRINE_POTTED_BROWN_MUSHROOM.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CRIMSON_FUNGUS), 
                () -> CitrineList.CITRINE_POTTED_CRIMSON_FUNGUS.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WARPED_FUNGUS), 
                () -> CitrineList.CITRINE_POTTED_WARPED_FUNGUS.get()
            );

            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CRIMSON_ROOTS), 
                () -> CitrineList.CITRINE_POTTED_CRIMSON_ROOTS.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WARPED_ROOTS), 
                () -> CitrineList.CITRINE_POTTED_WARPED_ROOTS.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.FERN), 
                () -> CitrineList.CITRINE_POTTED_FERN.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.DEAD_BUSH), 
                () -> CitrineList.CITRINE_POTTED_DEAD_BUSH.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CACTUS), 
                () -> CitrineList.CITRINE_POTTED_CACTUS.get()
            );
            citrinePot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BAMBOO), 
                () -> CitrineList.CITRINE_POTTED_BAMBOO.get()
            );
            
        });
        
    }   

    static void setBlueQuartzPotPlants(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            FlowerPotBlock blueQuartzPot = BlueQuartzList.BLUE_QUARTZ_FLOWER_POT.get();
            
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.POPPY), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_POPPY.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.DANDELION), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_DANDELION.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BLUE_ORCHID), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_BLUE_ORCHID.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.ALLIUM), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_ALLIUM.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.AZURE_BLUET), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_AZURE_BLUET.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.RED_TULIP), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_RED_TULIP.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.ORANGE_TULIP), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_ORANGE_TULIP.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WHITE_TULIP), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_WHITE_TULIP.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.PINK_TULIP), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_PINK_TULIP.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.OXEYE_DAISY), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_OXEYE_DAISY.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CORNFLOWER), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_CORNFLOWER.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.LILY_OF_THE_VALLEY), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_LILY_OF_THE_VALLEY.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WITHER_ROSE), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_WITHER_ROSE.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.TORCHFLOWER), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_TORCHFLOWER.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CLOSED_EYEBLOSSOM), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.OPEN_EYEBLOSSOM), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_OPEN_EYEBLOSSOM.get()
            );

            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.OAK_SAPLING), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_OAK_SAPLING.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.SPRUCE_SAPLING), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_SPRUCE_SAPLING.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BIRCH_SAPLING), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_BIRCH_SAPLING.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.JUNGLE_SAPLING), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_JUNGLE_SAPLING.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.ACACIA_SAPLING), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_ACACIA_SAPLING.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.DARK_OAK_SAPLING), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_DARK_OAK_SAPLING.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.AZALEA), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_AZALEA.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.FLOWERING_AZALEA), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_FLOWERING_AZALEA.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.MANGROVE_PROPAGULE), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_MANGROVE_PROPAGULE.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CHERRY_SAPLING), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_CHERRY_SAPLING.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.PALE_OAK_SAPLING), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_PALE_OAK_SAPLING.get()
            );

            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.RED_MUSHROOM), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_RED_MUSHROOM.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BROWN_MUSHROOM), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_BROWN_MUSHROOM.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CRIMSON_FUNGUS), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_CRIMSON_FUNGUS.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WARPED_FUNGUS), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_WARPED_FUNGUS.get()
            );

            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CRIMSON_ROOTS), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_CRIMSON_ROOTS.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WARPED_ROOTS), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_WARPED_ROOTS.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.FERN), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_FERN.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.DEAD_BUSH), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_DEAD_BUSH.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CACTUS), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_CACTUS.get()
            );
            blueQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BAMBOO), 
                () -> BlueQuartzList.BLUE_QUARTZ_POTTED_BAMBOO.get()
            );
        });
    }
   
    static void setPrasioliteQuartzPotPlants(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            FlowerPotBlock prasioliteQuartzPot = PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT.get();
            
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.POPPY), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_POPPY.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.DANDELION), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_DANDELION.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BLUE_ORCHID), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_BLUE_ORCHID.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.ALLIUM), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_ALLIUM.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.AZURE_BLUET), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_AZURE_BLUET.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.RED_TULIP), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_RED_TULIP.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.ORANGE_TULIP), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_ORANGE_TULIP.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WHITE_TULIP), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_WHITE_TULIP.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.PINK_TULIP), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_PINK_TULIP.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.OXEYE_DAISY), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_OXEYE_DAISY.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CORNFLOWER), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_CORNFLOWER.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.LILY_OF_THE_VALLEY), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_LILY_OF_THE_VALLEY.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WITHER_ROSE), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_WITHER_ROSE.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.TORCHFLOWER), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_TORCHFLOWER.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CLOSED_EYEBLOSSOM), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.OPEN_EYEBLOSSOM), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_OPEN_EYEBLOSSOM.get()
            );

            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.OAK_SAPLING), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_OAK_SAPLING.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.SPRUCE_SAPLING), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_SPRUCE_SAPLING.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BIRCH_SAPLING), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_BIRCH_SAPLING.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.JUNGLE_SAPLING), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_JUNGLE_SAPLING.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.ACACIA_SAPLING), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_ACACIA_SAPLING.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.DARK_OAK_SAPLING), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_DARK_OAK_SAPLING.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.AZALEA), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_AZALEA.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.FLOWERING_AZALEA), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_FLOWERING_AZALEA.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.MANGROVE_PROPAGULE), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_MANGROVE_PROPAGULE.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CHERRY_SAPLING), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_CHERRY_SAPLING.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.PALE_OAK_SAPLING), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_PALE_OAK_SAPLING.get()
            );

            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.RED_MUSHROOM), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_RED_MUSHROOM.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BROWN_MUSHROOM), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_BROWN_MUSHROOM.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CRIMSON_FUNGUS), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_CRIMSON_FUNGUS.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WARPED_FUNGUS), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_WARPED_FUNGUS.get()
            );

            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CRIMSON_ROOTS), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_CRIMSON_ROOTS.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WARPED_ROOTS), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_WARPED_ROOTS.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.FERN), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_FERN.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.DEAD_BUSH), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_DEAD_BUSH.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CACTUS), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_CACTUS.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BAMBOO), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_BAMBOO.get()
            );
        });
    }

}
