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
import com.quarztastic.goldfishboy.registry.prasiolite_quartz.PrasioliteQuartzList;
import com.quarztastic.goldfishboy.registry.rose_quartz.RoseQuartzList;
import com.quarztastic.goldfishboy.registry.smoky_quartz.SmokyQuartzList;

public class WorldgenRegistry {
    public static final RegistrySetBuilder WORLD_GEN_BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, WorldgenRegistry::bootstrapConfiguredFeatures)
            .add(Registries.PLACED_FEATURE, WorldgenRegistry::bootstrapPlacedFeatures);
    
    // Helper methods to create keys
    private static ResourceKey<ConfiguredFeature<?, ?>> createConfiguredFeatureKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, 
                ResourceLocation.fromNamespaceAndPath(Quartztastic.MODID, name));
    }
    
    private static ResourceKey<PlacedFeature> createPlacedFeatureKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, 
                ResourceLocation.fromNamespaceAndPath(Quartztastic.MODID, name));
    }


    public static final ResourceKey<ConfiguredFeature<?, ?>> SMOKY_QUARTZ_ORE_CONFIGURED = 
            createConfiguredFeatureKey("smoky_quartz_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> SMOKY_QUARTZ_NETHERRACK_ORE_CONFIGURED = 
            createConfiguredFeatureKey("smoky_quartz_netherrack_ore");
    

    public static final ResourceKey<ConfiguredFeature<?, ?>> ROSE_QUARTZ_ORE_CONFIGURED = 
            createConfiguredFeatureKey("rose_quartz_ore");
    

    public static final ResourceKey<ConfiguredFeature<?, ?>> CITRINE_ORE_CONFIGURED = 
            createConfiguredFeatureKey("citrine_ore");
    

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_QUARTZ_ORE_CONFIGURED = 
            createConfiguredFeatureKey("blue_quartz_ore");
    

    public static final ResourceKey<ConfiguredFeature<?, ?>> PRASIOLITE_QUARTZ_ORE_CONFIGURED = 
            createConfiguredFeatureKey("prasiolite_quartz_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> PRASIOLITE_QUARTZ_NETHERRACK_ORE_CONFIGURED = 
            createConfiguredFeatureKey("prasiolite_quartz_netherrack_ore");

            

    public static final ResourceKey<PlacedFeature> SMOKY_QUARTZ_ORE_PLACED = 
            createPlacedFeatureKey("smoky_quartz_ore");

    public static final ResourceKey<PlacedFeature> SMOKY_QUARTZ_NETHERRACK_ORE_PLACED = 
            createPlacedFeatureKey("smoky_quartz_netherrack_ore");


    public static final ResourceKey<PlacedFeature> ROSE_QUARTZ_ORE_PLACED = 
            createPlacedFeatureKey("rose_quartz_ore");


    public static final ResourceKey<PlacedFeature> CITRINE_ORE_PLACED = 
            createPlacedFeatureKey("citrine_ore");


    public static final ResourceKey<PlacedFeature> BLUE_QUARTZ_ORE_PLACED = 
            createPlacedFeatureKey("blue_quartz_ore");


    public static final ResourceKey<PlacedFeature> PRASIOLITE_QUARTZ_ORE_PLACED = 
            createPlacedFeatureKey("prasiolite_quartz_ore");

    public static final ResourceKey<PlacedFeature> PRASIOLITE_QUARTZ_NETHERRACK_ORE_PLACED = 
            createPlacedFeatureKey("prasiolite_quartz_netherrack_ore");
        

    public static void bootstrapConfiguredFeatures(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest basaltReplaceables = new BlockMatchTest(Blocks.BASALT);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest soulSoilReplaceables = new BlockMatchTest(Blocks.SOUL_SOIL);
        

        context.register(SMOKY_QUARTZ_ORE_CONFIGURED,
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(
                basaltReplaceables,
                SmokyQuartzList.SMOKY_QUARTZ_ORE.get().defaultBlockState(),
                12
            ))
        );

        context.register(SMOKY_QUARTZ_NETHERRACK_ORE_CONFIGURED,
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(
                netherrackReplaceables,
                SmokyQuartzList.SMOKY_QUARTZ_NETHERRACK_ORE.get().defaultBlockState(),
                12
            ))
        );
        

        context.register(ROSE_QUARTZ_ORE_CONFIGURED,
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(
                netherrackReplaceables,
                RoseQuartzList.ROSE_QUARTZ_ORE.get().defaultBlockState(),
                8
            ))
        );
        

        context.register(CITRINE_ORE_CONFIGURED,
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(
                netherrackReplaceables,
                CitrineList.CITRINE_ORE.get().defaultBlockState(),
                8
            ))
        );
        

        context.register(BLUE_QUARTZ_ORE_CONFIGURED,
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(
                netherrackReplaceables,
                BlueQuartzList.BLUE_QUARTZ_ORE.get().defaultBlockState(),
                8
            ))
        );
        

        context.register(PRASIOLITE_QUARTZ_ORE_CONFIGURED,
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(
                soulSoilReplaceables,
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_ORE.get().defaultBlockState(),
                8
            ))
        );

        context.register(PRASIOLITE_QUARTZ_NETHERRACK_ORE_CONFIGURED,
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(
                netherrackReplaceables,
                PrasioliteQuartzList.PRASIOLITE_QUARTZ_NETHERRACK_ORE.get().defaultBlockState(),
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
                    CountPlacement.of(36),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(0),
                        VerticalAnchor.absolute(118)
                    ),
                    BiomeFilter.biome()
                )
            )
        );
        

        context.register(SMOKY_QUARTZ_NETHERRACK_ORE_PLACED,
            new PlacedFeature(
                configuredFeatures.getOrThrow(SMOKY_QUARTZ_NETHERRACK_ORE_CONFIGURED),
                List.of(
                    CountPlacement.of(36),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(0),
                        VerticalAnchor.absolute(118)
                    ),
                    BiomeFilter.biome()
                )
            )
        );

        

        context.register(ROSE_QUARTZ_ORE_PLACED,
            new PlacedFeature(
                configuredFeatures.getOrThrow(ROSE_QUARTZ_ORE_CONFIGURED),
                List.of(
                    CountPlacement.of(25),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(0),
                        VerticalAnchor.absolute(118)
                    ),
                    BiomeFilter.biome()
                )
            )
        );

        

        context.register(CITRINE_ORE_PLACED,
            new PlacedFeature(
                configuredFeatures.getOrThrow(CITRINE_ORE_CONFIGURED),
                List.of(
                    CountPlacement.of(25),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(0),
                        VerticalAnchor.absolute(118)
                    ),
                    BiomeFilter.biome()
                )
            )
        );

        

        context.register(BLUE_QUARTZ_ORE_PLACED,
            new PlacedFeature(
                configuredFeatures.getOrThrow(BLUE_QUARTZ_ORE_CONFIGURED),
                List.of(
                    CountPlacement.of(25),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(0),
                        VerticalAnchor.absolute(118)
                    ),
                    BiomeFilter.biome()
                )
            )
        );

        

        context.register(PRASIOLITE_QUARTZ_ORE_PLACED,
            new PlacedFeature(
                configuredFeatures.getOrThrow(PRASIOLITE_QUARTZ_ORE_CONFIGURED),
                List.of(
                    CountPlacement.of(25),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(0),
                        VerticalAnchor.absolute(118)
                    ),
                    BiomeFilter.biome()
                )
            )
        );

        context.register(PRASIOLITE_QUARTZ_NETHERRACK_ORE_PLACED,
            new PlacedFeature(
                configuredFeatures.getOrThrow(PRASIOLITE_QUARTZ_NETHERRACK_ORE_CONFIGURED),
                List.of(
                    CountPlacement.of(36),
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