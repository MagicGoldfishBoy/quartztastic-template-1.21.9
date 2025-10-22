package com.quarztastic.goldfishboy.datagen;

import java.util.List;
import java.util.Set;


import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class Datagen {
        public void gatherData(GatherDataEvent event) {
        // event.createProvider(RecipeDatagen.Runner::new);
        // event.createProvider(ModelDatagen::new);
        event.createProvider((output, lookupProvider) -> new LootTableProvider(
            output,
            Set.of(),
            List.of(
                new LootTableProvider.SubProviderEntry(
                    LootTableDatagen::new,
                    LootContextParamSets.BLOCK
                )
            ),
            lookupProvider
        ));
    }
}
    