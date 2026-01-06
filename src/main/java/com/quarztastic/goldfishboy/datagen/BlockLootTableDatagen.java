package com.quarztastic.goldfishboy.datagen;

import java.util.Set;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.registry.BlueQuartzList;
import com.quarztastic.goldfishboy.registry.CitrineList;
import com.quarztastic.goldfishboy.registry.prasiolite_quartz.PrasioliteQuartzList;
import com.quarztastic.goldfishboy.registry.rose_quartz.RoseQuartzList;
import com.quarztastic.goldfishboy.registry.smoky_quartz.SmokyQuartzList;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

public class BlockLootTableDatagen extends BlockLootSubProvider {

    public BlockLootTableDatagen(HolderLookup.Provider lookupProvider) {
        super(
            Set.of(), 
            FeatureFlags.REGISTRY.allFlags(), 
            new java.util.HashMap<>(), 
            lookupProvider
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Quartztastic.BLOCKS.getEntries()
            .stream()
            .map(e -> (Block) e.value())
            .filter(block -> block.asItem() != Items.AIR)
            .toList();
    }

    @Override
    protected void generate() {
        Quartztastic.BLOCKS.getEntries().forEach(entry -> {
            Block block = entry.get();

            if (block.asItem() == Items.AIR) {
            return;
    }
            if (block.getName().toString().matches(".*slab.*")) {
            this.add(block, this::createSlabItemTable);
            return;
    }
            if (block.getName().toString().matches(".*bed.*")) {
            this.add(block, this.createSinglePropConditionTable(block, BlockStateProperties.BED_PART, BedPart.HEAD));
            return;
    }
            if(block.getName().toString().matches(".*door.*") && !block.getName().toString().matches(".*trapdoor.*")) {
            this.add(block, this::createDoorTable);
            return;
    }
            if(block.getName().toString().matches(".*smoky_quartz_ore.*")) {
            this.add(block, this.createOreDrop(block, SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()));
            return;
    }
            if(block.getName().toString().matches(".*smoky_quartz_netherrack_ore.*")) {
            this.add(block, this.createOreDrop(block, SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()));
            return;
    }

            if(block.getName().toString().matches(".*rose_quartz_ore.*")) {
            this.add(block, this.createOreDrop(block, RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()));
            return;
    }

            if(block.getName().toString().matches(".*citrine_ore.*")) {
            this.add(block, this.createOreDrop(block, CitrineList.CITRINE_CRYSTAL.get()));
            return;
    }
    
            if(block.getName().toString().matches(".*blue_quartz_ore.*")) {
            this.add(block, this.createOreDrop(block, BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()));
            return;
    }

            if(block.getName().toString().matches(".*prasiolite_quartz_ore.*")) {
            this.add(block, this.createOreDrop(block, PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()));
            return;
    }
            if(block.getName().toString().matches(".*prasiolite_quartz_netherrack_ore.*")) {
            this.add(block, this.createOreDrop(block, PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()));
            return;
    }       
                if (block instanceof FlowerPotBlock pot) {
                        
                this.dropSelf(block);
                
                if (block != Blocks.FLOWER_POT) {
                        Block content = pot.getPotted();
                        Block emptyPot = pot.getEmptyPot();

                        if (content.asItem() != Items.AIR) {
                        this.add(block, LootTable.lootTable()
                        .withPool(this.applyExplosionDecay(block, LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1.0F))
                                .add(LootItem.lootTableItem(content))))
                        .withPool(this.applyExplosionDecay(block, LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1.0F))
                                .add(LootItem.lootTableItem(emptyPot))
                                )));
                        }
                }
                System.out.println("Pot: " + block + " → content: " + ((FlowerPotBlock) block).getPotted() + " item: " + ((FlowerPotBlock) block).getPotted().asItem());
                return;
                }


            this.dropSelf(block);
        });
    }
}