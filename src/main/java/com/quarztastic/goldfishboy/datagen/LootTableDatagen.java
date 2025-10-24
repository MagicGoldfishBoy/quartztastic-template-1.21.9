package com.quarztastic.goldfishboy.datagen;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.registry.SmokyQuartzList;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.LootTableProvider.SubProviderEntry;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class LootTableDatagen extends LootTableProvider {
    
    public LootTableDatagen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, Set.of(), List.of(
            new SubProviderEntry(lookup -> new CustomChestLoot(), LootContextParamSets.CHEST)
        ), registries);
    }
    
    static class CustomChestLoot implements LootTableSubProvider {
        
        @Override
        public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> output) {
            ResourceLocation location = ResourceLocation.fromNamespaceAndPath(Quartztastic.MODID, "smoky_quartz_nether_fortress_table");
            
            output.accept(ResourceKey.create(Registries.LOOT_TABLE, location), 
                LootTable.lootTable()
                    .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
                            .setWeight(10)
                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3)))
                        )
                    )
            );

            location = ResourceLocation.fromNamespaceAndPath(Quartztastic.MODID, "smoky_quartz_block_nether_fortress_table");
            
            output.accept(ResourceKey.create(Registries.LOOT_TABLE, location), 
                LootTable.lootTable()
                    .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(SmokyQuartzList.SMOKY_QUARTZ_ITEM.get())
                            .setWeight(5)
                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2)))
                        )
                    )
            );
        }
    }
}
