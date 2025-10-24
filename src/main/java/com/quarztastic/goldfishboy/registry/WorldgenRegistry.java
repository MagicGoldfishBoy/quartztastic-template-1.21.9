package com.quarztastic.goldfishboy.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.core.RegistrySetBuilder;
import java.util.List;

import com.quarztastic.goldfishboy.Quartztastic;

public class WorldgenRegistry {
    public static final RegistrySetBuilder WORLD_GEN_BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, WorldgenRegistry::bootstrapConfiguredFeatures)
            .add(Registries.PLACED_FEATURE, WorldgenRegistry::bootstrapPlacedFeatures);
    
    // Smoky Quartz Ore feature keys
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMOKY_QUARTZ_ORE_CONFIGURED = 
            createConfiguredFeatureKey("smoky_quartz_ore");
    
    public static final ResourceKey<PlacedFeature> SMOKY_QUARTZ_ORE_PLACED = 
            createPlacedFeatureKey("smoky_quartz_ore");
    
    // Helper methods to create keys
    private static ResourceKey<ConfiguredFeature<?, ?>> createConfiguredFeatureKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, 
                ResourceLocation.fromNamespaceAndPath(Quartztastic.MODID, name));
    }
    
    private static ResourceKey<PlacedFeature> createPlacedFeatureKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, 
                ResourceLocation.fromNamespaceAndPath(Quartztastic.MODID, name));
    }
    

    public static void bootstrapConfiguredFeatures(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest basaltReplaceables = new BlockMatchTest(Blocks.BASALT);
        

        context.register(SMOKY_QUARTZ_ORE_CONFIGURED,
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(
                basaltReplaceables,
                SmokyQuartzList.SMOKY_QUARTZ_ORE.get().defaultBlockState(),
                12
            ))
        );
    }
    

    public static void bootstrapPlacedFeatures(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        

        context.register(SMOKY_QUARTZ_ORE_PLACED,
            new PlacedFeature(
                configuredFeatures.getOrThrow(SMOKY_QUARTZ_ORE_CONFIGURED),
                List.of(
                    CountPlacement.of(24),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(0),
                        VerticalAnchor.absolute(118)
                    ),
                    BiomeFilter.biome()
                )
            )
        );
    }
}