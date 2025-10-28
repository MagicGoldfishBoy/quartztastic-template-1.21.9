package com.quarztastic.goldfishboy.datagen;

import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.registry.WorldgenRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraft.core.RegistrySetBuilder;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class WorldgenDatagen extends DatapackBuiltinEntriesProvider {
    
    public WorldgenDatagen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, new RegistrySetBuilder()
                .add(Registries.CONFIGURED_FEATURE, WorldgenRegistry::bootstrapConfiguredFeatures)
                .add(Registries.PLACED_FEATURE, WorldgenRegistry::bootstrapPlacedFeatures)
                .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, context -> {
                    var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
                    var biomes = context.lookup(Registries.BIOME);
                    
                    context.register(
                        ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
                            ResourceLocation.fromNamespaceAndPath(Quartztastic.MODID, "add_smoky_quartz_ore")),
                        new BiomeModifiers.AddFeaturesBiomeModifier(
                            HolderSet.direct(biomes.getOrThrow(Biomes.BASALT_DELTAS)),
                            HolderSet.direct(placedFeatures.getOrThrow(WorldgenRegistry.SMOKY_QUARTZ_ORE_PLACED)),
                            GenerationStep.Decoration.UNDERGROUND_ORES
                        )
                    );
                    
                    context.register(
                        ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
                            ResourceLocation.fromNamespaceAndPath(Quartztastic.MODID, "add_smoky_quartz_netherrack_ore")),
                        new BiomeModifiers.AddFeaturesBiomeModifier(
                            HolderSet.direct(biomes.getOrThrow(Biomes.BASALT_DELTAS)),
                            HolderSet.direct(placedFeatures.getOrThrow(WorldgenRegistry.SMOKY_QUARTZ_NETHERRACK_ORE_PLACED)),
                            GenerationStep.Decoration.UNDERGROUND_ORES
                        )
                    );


                    context.register(
                        ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
                            ResourceLocation.fromNamespaceAndPath(Quartztastic.MODID, "add_rose_quartz_ore")),
                        new BiomeModifiers.AddFeaturesBiomeModifier(
                            HolderSet.direct(biomes.getOrThrow(Biomes.NETHER_WASTES)),
                            HolderSet.direct(placedFeatures.getOrThrow(WorldgenRegistry.ROSE_QUARTZ_ORE_PLACED)),
                            GenerationStep.Decoration.UNDERGROUND_ORES
                        )
                    );


                    context.register(
                        ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
                            ResourceLocation.fromNamespaceAndPath(Quartztastic.MODID, "add_citrine_ore")),
                        new BiomeModifiers.AddFeaturesBiomeModifier(
                            HolderSet.direct(biomes.getOrThrow(Biomes.CRIMSON_FOREST)),
                            HolderSet.direct(placedFeatures.getOrThrow(WorldgenRegistry.CITRINE_ORE_PLACED)),
                            GenerationStep.Decoration.UNDERGROUND_ORES
                        )
                    );


                    context.register(
                        ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
                            ResourceLocation.fromNamespaceAndPath(Quartztastic.MODID, "add_blue_quartz_ore")),
                        new BiomeModifiers.AddFeaturesBiomeModifier(
                            HolderSet.direct(biomes.getOrThrow(Biomes.WARPED_FOREST)),
                            HolderSet.direct(placedFeatures.getOrThrow(WorldgenRegistry.BLUE_QUARTZ_ORE_PLACED)),
                            GenerationStep.Decoration.UNDERGROUND_ORES
                        )
                    );
                }),
            Set.of(Quartztastic.MODID));
    }
}