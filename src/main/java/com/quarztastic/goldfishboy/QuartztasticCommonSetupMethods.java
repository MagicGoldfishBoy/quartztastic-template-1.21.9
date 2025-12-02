package com.quarztastic.goldfishboy;

import com.quarztastic.goldfishboy.registry.prasiolite_quartz.PrasioliteQuartzList;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

public class QuartztasticCommonSetupMethods {
    
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
        });
    }
}
