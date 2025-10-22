package com.quarztastic.goldfishboy.datagen;

import java.util.concurrent.CompletableFuture;

import com.quarztastic.goldfishboy.registry.SmokyQuartzRegistry;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

public class RecipeDatagen extends RecipeProvider {

    protected RecipeDatagen(Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {
        buildBlockRecipes();
    }

    protected void buildBlockRecipes() {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzRegistry.SMOKY_QUARTZ_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzRegistry.SMOKY_QUARTZ_SLAB_ITEM.get(), 2)
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzRegistry.SMOKY_QUARTZ_ITEM.get()))
            .save(this.output, "smoky_quartz_stairs_by_stonecutting");
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
