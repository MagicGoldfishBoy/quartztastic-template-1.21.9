package com.quarztastic.goldfishboy.datagen;

import java.util.Set;

import com.quarztastic.goldfishboy.Quartztastic;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class LootTableDatagen extends BlockLootSubProvider {

    public LootTableDatagen(HolderLookup.Provider lookupProvider) {
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

            this.dropSelf(block);
        });
    }
}