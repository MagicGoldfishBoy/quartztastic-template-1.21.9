package com.quarztastic.goldfishboy.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import com.quarztastic.goldfishboy.Quartztastic;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.AddTableLootModifier;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;

public class LootModifierDatagen extends GlobalLootModifierProvider {
    
    public LootModifierDatagen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Quartztastic.MODID);
    }
    
    @Override
    protected void start() {
        add("smoky_quartz_nether_fortress", 
            new AddTableLootModifier(
                new LootItemCondition[] {
                    LootTableIdCondition.builder(
                        ResourceLocation.withDefaultNamespace("chests/nether_bridge")
                    ).build()
                },
                ResourceKey.create(Registries.LOOT_TABLE,
                    ResourceLocation.fromNamespaceAndPath(Quartztastic.MODID, "smoky_quartz_nether_fortress_table"))
            ),
            List.of()
        );
        add("smoky_quartz_block_nether_fortress", 
            new AddTableLootModifier(
                new LootItemCondition[] {
                    LootTableIdCondition.builder(
                        ResourceLocation.withDefaultNamespace("chests/nether_bridge")
                    ).build()
                },
                ResourceKey.create(Registries.LOOT_TABLE,
                    ResourceLocation.fromNamespaceAndPath(Quartztastic.MODID, "smoky_quartz_block_nether_fortress_table"))
            ),
            List.of()
        );


        add("citrine_crystal_bastion", 
            new AddTableLootModifier(
                new LootItemCondition[] {
                    LootTableIdCondition.builder(
                        ResourceLocation.withDefaultNamespace("chests/bastion_bridge")
                    ).build()
                },
                ResourceKey.create(Registries.LOOT_TABLE,
                    ResourceLocation.fromNamespaceAndPath(Quartztastic.MODID, "citrine_crystal_bastion_table"))
            ),
            List.of()
        );
    }
}