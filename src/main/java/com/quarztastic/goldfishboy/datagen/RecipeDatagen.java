package com.quarztastic.goldfishboy.datagen;

import java.rmi.registry.Registry;
import java.util.concurrent.CompletableFuture;

import com.quarztastic.goldfishboy.registry.SmokyQuartzRegistry;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

public class RecipeDatagen extends RecipeProvider {

    protected RecipeDatagen(Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {
        buildItemRecipes();
        buildBlockRecipes();
        buildSlabRecipes();
        buildStairsRecipes();
    }

    protected void buildItemRecipes() {

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(SmokyQuartzRegistry.SMOKY_QUARTZ_ORE_ITEM.get()), RecipeCategory.MISC, SmokyQuartzRegistry.SMOKY_QUARTZ_CRYSTAL.get(), 0.4f, 60)
            .unlockedBy("has_smoky_quartz_ore", has(SmokyQuartzRegistry.SMOKY_QUARTZ_ORE_ITEM.get()))
            .save(this.output, "smoky_quartz_by_smelting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(SmokyQuartzRegistry.SMOKY_QUARTZ_ORE_ITEM.get()), RecipeCategory.MISC, SmokyQuartzRegistry.SMOKY_QUARTZ_CRYSTAL.get(), 0.4f, 30)
            .unlockedBy("has_smoky_quartz_ore", has(SmokyQuartzRegistry.SMOKY_QUARTZ_ORE_ITEM.get()))
            .save(this.output, "smoky_quartz_by_blasting");

        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SmokyQuartzRegistry.SMOKY_QUARTZ_CRYSTAL.get(), 4)
            .requires(SmokyQuartzRegistry.SMOKY_QUARTZ_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzRegistry.SMOKY_QUARTZ_ITEM.get()))
            .save(this.output, "smoky_quartz_by_crafting");
    }

    protected void buildBlockRecipes() {

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzRegistry.SMOKY_QUARTZ_ITEM.get())
            .pattern("@@")
            .pattern("@@")
            .define('@', SmokyQuartzRegistry.SMOKY_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzRegistry.SMOKY_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzRegistry.SMOKY_QUARTZ_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzRegistry.SMOKY_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzRegistry.SMOKY_QUARTZ_ITEM.get()))
            .save(this.output, "smoky_quartz_bricks_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzRegistry.SMOKY_QUARTZ_BRICKS_ITEM.get(), 4)
            .pattern("@@")
            .pattern("@@")
            .define('@', SmokyQuartzRegistry.SMOKY_QUARTZ_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzRegistry.SMOKY_QUARTZ_ITEM.get()))
            .save(this.output, "smoky_quartz_bricks_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzRegistry.SMOKY_QUARTZ_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzRegistry.SMOKY_QUARTZ_PILLAR_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzRegistry.SMOKY_QUARTZ_ITEM.get()))
            .save(this.output);
    }

    protected void buildSlabRecipes() {

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzRegistry.SMOKY_QUARTZ_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzRegistry.SMOKY_QUARTZ_SLAB_ITEM.get(), 2)
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzRegistry.SMOKY_QUARTZ_ITEM.get()))
            .save(this.output, "smoky_quartz_slab_by_stonecutting");  

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzRegistry.SMOKY_QUARTZ_SLAB_ITEM.get(), 6)
            .pattern("@@@")
            .define('@', SmokyQuartzRegistry.SMOKY_QUARTZ_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzRegistry.SMOKY_QUARTZ_ITEM.get()))
            .save(this.output, "smoky_quartz_slab_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzRegistry.SMOKY_QUARTZ_BRICKS_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzRegistry.SMOKY_QUARTZ_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_smoky_quartz_bricks_block", has(SmokyQuartzRegistry.SMOKY_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "smoky_quartz_bricks_slab_by_stonecutting");  

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzRegistry.SMOKY_QUARTZ_BRICKS_SLAB_ITEM.get(), 6)
            .pattern("@@@")
            .define('@', SmokyQuartzRegistry.SMOKY_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_smoky_quartz_bricks_block", has(SmokyQuartzRegistry.SMOKY_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "smoky_quartz_bricks_slab_by_crafting");

    }

    protected void buildStairsRecipes() {

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzRegistry.SMOKY_QUARTZ_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzRegistry.SMOKY_QUARTZ_STAIRS_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzRegistry.SMOKY_QUARTZ_ITEM.get()))
            .save(this.output, "smoky_quartz_stairs_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzRegistry.SMOKY_QUARTZ_STAIRS_ITEM.get(), 4)
            .pattern("@  ")
            .pattern("@@ ")
            .pattern("@@@")
            .define('@', SmokyQuartzRegistry.SMOKY_QUARTZ_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzRegistry.SMOKY_QUARTZ_ITEM.get()))
            .save(this.output, "smoky_quartz_stairs_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzRegistry.SMOKY_QUARTZ_BRICKS_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzRegistry.SMOKY_QUARTZ_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_smoky_quartz_bricks_block", has(SmokyQuartzRegistry.SMOKY_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "smoky_quartz_bricks_stairs_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzRegistry.SMOKY_QUARTZ_BRICKS_STAIRS_ITEM.get(), 4)
            .pattern("@  ")
            .pattern("@@ ")
            .pattern("@@@")
            .define('@', SmokyQuartzRegistry.SMOKY_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_smoky_quartz_bricks_block", has(SmokyQuartzRegistry.SMOKY_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "smoky_quartz_bricks_stairs_by_crafting");

    }

    public static class Runner extends RecipeProvider.Runner {

        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
            super(output, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(@javax.annotation.Nonnull HolderLookup.Provider registries, @javax.annotation.Nonnull RecipeOutput output) {
            return new RecipeDatagen(registries, output);
        }

        @Override
        @javax.annotation.Nonnull
        public String getName() {
            return "Quartztastic Recipes";
        }
    }    
}
