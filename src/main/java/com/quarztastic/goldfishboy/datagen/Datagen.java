package com.quarztastic.goldfishboy.datagen;

import java.util.List;
import java.util.Set;

import com.quarztastic.goldfishboy.Quartztastic;

import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class Datagen {
        public void gatherData(GatherDataEvent event) {
        event.createProvider(RecipeDatagen.Runner::new);
        event.createProvider(ModelDatagen::new);
        event.createProvider((out, lookup) -> new BlockTagDatagen(out, lookup, Quartztastic.MODID));
        event.createProvider((out, lookup) -> new ItemTagDatagen(out, lookup, Quartztastic.MODID));
        event.createProvider((output, lookupProvider) -> new LootTableProvider(
            output,
            Set.of(),
            List.of(
                new LootTableProvider.SubProviderEntry(
                    BlockLootTableDatagen::new,
                    LootContextParamSets.BLOCK
                ),
                new LootTableProvider.SubProviderEntry(
                    lookup -> new LootTableDatagen.CustomChestLoot(),
                    LootContextParamSets.CHEST
                )
            ),
            lookupProvider
        ));
        event.createProvider((output, lookupProvider) -> new LootModifierDatagen(output, lookupProvider));

        event.createProvider((output, lookupProvider) -> new WorldgenDatagen(output, lookupProvider));
    };
}
    