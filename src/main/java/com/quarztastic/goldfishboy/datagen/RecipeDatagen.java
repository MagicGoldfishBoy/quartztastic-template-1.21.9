package com.quarztastic.goldfishboy.datagen;

import java.rmi.registry.Registry;
import java.util.concurrent.CompletableFuture;

import com.quarztastic.goldfishboy.registry.SmokyQuartzList;

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
import net.minecraft.world.item.Items;
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
        buildButtonRecipes();
        buildPressurePlateRecipes();
        buildFenceWallGateRecipes();
        buildDoorRecipes();
        buildChairRecipes();
        buildTableRecipes();
        buildShelfRecipes();
        buildLanternChainRecipes();
    }

    protected void buildItemRecipes() {

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_ORE_ITEM.get()), RecipeCategory.MISC, SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get(), 0.4f, 60)
            .unlockedBy("has_smoky_quartz_ore", has(SmokyQuartzList.SMOKY_QUARTZ_ORE_ITEM.get()))
            .save(this.output, "smoky_quartz_by_smelting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_ORE_ITEM.get()), RecipeCategory.MISC, SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get(), 0.4f, 30)
            .unlockedBy("has_smoky_quartz_ore", has(SmokyQuartzList.SMOKY_QUARTZ_ORE_ITEM.get()))
            .save(this.output, "smoky_quartz_by_blasting");

        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get(), 4)
            .requires(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "smoky_quartz_by_crafting");
    }

    protected void buildBlockRecipes() {

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get())
            .pattern("@@")
            .pattern("@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "smoky_quartz_bricks_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get(), 4)
            .pattern("@@")
            .pattern("@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "smoky_quartz_bricks_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.CHISELED_SMOKY_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "chiseled_smoky_quartz_block_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.CHISELED_SMOKY_QUARTZ_BLOCK_ITEM.get())
            .pattern("@")
            .pattern("@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_smoky_quartz_slab", has(SmokyQuartzList.SMOKY_QUARTZ_SLAB_ITEM.get()))
            .save(this.output, "chiseled_smoky_quartz_block_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_TILES_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output);


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_PILLAR_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output);   
            
            
        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_LIGHT_ITEM.get())
            .requires(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get())
            .requires(Items.GLOWSTONE)
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .unlockedBy("has_glowstone", has(Items.GLOWSTONE))
            .save(this.output);
    }

    protected void buildSlabRecipes() {

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_SLAB_ITEM.get(), 2)
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "smoky_quartz_slab_by_stonecutting");  

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_SLAB_ITEM.get(), 6)
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "smoky_quartz_slab_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_smoky_quartz_bricks_block", has(SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "smoky_quartz_bricks_slab_by_stonecutting");  

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_BRICKS_SLAB_ITEM.get(), 6)
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_smoky_quartz_bricks_block", has(SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "smoky_quartz_bricks_slab_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_TILES_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_TILES_SLAB_ITEM.get(), 2)
            .unlockedBy("has_smoky_quartz_tiles", has(SmokyQuartzList.SMOKY_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "smoky_quartz_tiles_slab_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_TILES_SLAB_ITEM.get(), 6)
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_TILES_ITEM.get())
            .unlockedBy("has_smoky_quartz_tiles", has(SmokyQuartzList.SMOKY_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "smoky_quartz_tiles_slab_by_crafting");
    }

    protected void buildStairsRecipes() {

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_STAIRS_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "smoky_quartz_stairs_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_STAIRS_ITEM.get(), 4)
            .pattern("@  ")
            .pattern("@@ ")
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "smoky_quartz_stairs_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_smoky_quartz_bricks_block", has(SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "smoky_quartz_bricks_stairs_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_BRICKS_STAIRS_ITEM.get(), 4)
            .pattern("@  ")
            .pattern("@@ ")
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_smoky_quartz_bricks_block", has(SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "smoky_quartz_bricks_stairs_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_TILES_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_TILES_STAIRS_ITEM.get())
            .unlockedBy("has_smoky_quartz_tiles", has(SmokyQuartzList.SMOKY_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "smoky_quartz_tiles_stairs_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_TILES_STAIRS_ITEM.get(), 4)
            .pattern("@  ")
            .pattern("@@ ")
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_TILES_ITEM.get())
            .unlockedBy("has_smoky_quartz_tiles", has(SmokyQuartzList.SMOKY_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "smoky_quartz_tiles_stairs_by_crafting");

    }

    protected void buildButtonRecipes() {

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.REDSTONE, SmokyQuartzList.SMOKY_QUARTZ_BUTTON_ITEM.get(), 2)
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "smoky_quartz_button_by_stonecutting");

        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.REDSTONE, SmokyQuartzList.SMOKY_QUARTZ_BUTTON_ITEM.get())
            .requires(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "smoky_quartz_button_by_crafting");
    }

    protected void buildPressurePlateRecipes() {

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.REDSTONE, SmokyQuartzList.SMOKY_QUARTZ_PRESSURE_PLATE_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "smoky_quartz_pressure_plate_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.REDSTONE, SmokyQuartzList.SMOKY_QUARTZ_PRESSURE_PLATE_ITEM.get())
            .pattern("@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "smoky_quartz_pressure_plate_by_crafting");
    }

    protected void buildFenceWallGateRecipes() {

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_FENCE_ITEM.get(), 6)
            .pattern("@#@")
            .pattern("@#@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get())
            .define('#', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_WALL_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))       
            .save(this.output, "smoky_quartz_wall_by_stonecutting");     

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_WALL_ITEM.get(), 6)
            .pattern("@@@")
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "smoky_quartz_wall_by_crafting");


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.REDSTONE, SmokyQuartzList.SMOKY_QUARTZ_GATE_ITEM.get(), 2)
            .pattern("#@#")
            .pattern("#@#")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get())
            .define('#', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get()), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_BRICK_WALL_ITEM.get())
            .unlockedBy("has_smoky_quartz_bricks", has(SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "smoky_quartz_brick_wall_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_BRICK_WALL_ITEM.get(), 6)
            .pattern("@@@")
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "smoky_quartz_brick_wall_by_crafting");
    }

    protected void buildDoorRecipes() {

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_DOOR_ITEM.get(), 3)
            .pattern("@@")
            .pattern("@@")
            .pattern("@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .save(this.output);
    }

    protected void buildChairRecipes() {

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_CHAIR.get(), 4)
            .pattern("  @")
            .pattern("##@")
            .pattern("@ @")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .define('#', SmokyQuartzList.SMOKY_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_smoky_quartz_slab", has(SmokyQuartzList.SMOKY_QUARTZ_SLAB.get()))
            .save(this.output);
    }

    protected void buildTableRecipes() {

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_TABLE_ITEM.get(), 2)
            .pattern("###")
            .pattern("@ @")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .define('#', SmokyQuartzList.SMOKY_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_smoky_quartz_slab", has(SmokyQuartzList.SMOKY_QUARTZ_SLAB.get()))
            .save(this.output);
    }

    protected void buildShelfRecipes() {

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_SHELF_ITEM.get(), 2)
            .pattern("###")
            .pattern("  @")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .define('#', SmokyQuartzList.SMOKY_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_smoky_quartz_slab", has(SmokyQuartzList.SMOKY_QUARTZ_SLAB.get()))
            .save(this.output);            
    }

    protected void buildLanternChainRecipes() {

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_LANTERN_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .define('#', Items.TORCH)
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_torch", has(Items.TORCH))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_SOUL_LANTERN_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .define('#', Items.SOUL_TORCH)
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_soul_torch", has(Items.SOUL_TORCH))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_CHAIN.get())
            .pattern("@")
            .pattern("@")
            .pattern("@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .save(this.output);
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
