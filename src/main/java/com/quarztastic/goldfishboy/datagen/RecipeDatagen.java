package com.quarztastic.goldfishboy.datagen;

import java.util.concurrent.CompletableFuture;

import com.quarztastic.goldfishboy.registry.BlueQuartzList;
import com.quarztastic.goldfishboy.registry.CitrineList;
import com.quarztastic.goldfishboy.registry.TagKeyList;
import com.quarztastic.goldfishboy.registry.prasiolite_quartz.PrasioliteQuartzList;
import com.quarztastic.goldfishboy.registry.rose_quartz.RoseQuartzList;
import com.quarztastic.goldfishboy.registry.smoky_quartz.SmokyQuartzList;

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
        buildTorchRecipes();
        buildLadderRecipes();
        buildContainerRecipes();
        buildSinkRecipes();
        buildPathRecipes();
        buildStatueRecipes();
        buildFlowerPotRecipes();
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


        SimpleCookingRecipeBuilder.smelting(Ingredient.of(CitrineList.CITRINE_ORE_ITEM.get()), RecipeCategory.MISC, CitrineList.CITRINE_CRYSTAL.get(), 0.4f, 60)
            .unlockedBy("has_citrine_ore", has(CitrineList.CITRINE_ORE_ITEM.get()))
            .save(this.output, "citrine_by_smelting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(CitrineList.CITRINE_ORE_ITEM.get()), RecipeCategory.MISC, CitrineList.CITRINE_CRYSTAL.get(), 0.4f, 30)
            .unlockedBy("has_citrine_ore", has(CitrineList.CITRINE_ORE_ITEM.get()))
            .save(this.output, "citrine_by_blasting");

        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, CitrineList.CITRINE_CRYSTAL.get(), 4)
            .requires(CitrineList.CITRINE_BLOCK_ITEM.get())
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .save(this.output, "citrine_by_crafting");


        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RoseQuartzList.ROSE_QUARTZ_ORE_ITEM.get()), RecipeCategory.MISC, RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get(), 0.4f, 60)
            .unlockedBy("has_rose_quartz_ore", has(RoseQuartzList.ROSE_QUARTZ_ORE_ITEM.get()))
            .save(this.output, "rose_quartz_by_smelting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RoseQuartzList.ROSE_QUARTZ_ORE_ITEM.get()), RecipeCategory.MISC, RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get(), 0.4f, 30)
            .unlockedBy("has_rose_quartz_ore", has(RoseQuartzList.ROSE_QUARTZ_ORE_ITEM.get()))
            .save(this.output, "rose_quartz_by_blasting");

        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get(), 4)
            .requires(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "rose_quartz_by_crafting");


        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlueQuartzList.BLUE_QUARTZ_ORE_ITEM.get()), RecipeCategory.MISC, BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get(), 0.4f, 60)
            .unlockedBy("has_blue_quartz_ore", has(BlueQuartzList.BLUE_QUARTZ_ORE_ITEM.get()))
            .save(this.output, "blue_quartz_by_smelting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlueQuartzList.BLUE_QUARTZ_ORE_ITEM.get()), RecipeCategory.MISC, BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get(), 0.4f, 30)
            .unlockedBy("has_blue_quartz_ore", has(BlueQuartzList.BLUE_QUARTZ_ORE_ITEM.get()))
            .save(this.output, "blue_quartz_by_blasting");

        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get(), 4)
            .requires(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "blue_quartz_by_crafting");


        SimpleCookingRecipeBuilder.smelting(Ingredient.of(PrasioliteQuartzList.PRASIOLITE_QUARTZ_ORE_ITEM.get()), RecipeCategory.MISC, PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get(), 0.4f, 60)
            .unlockedBy("has_prasiolite_quartz_ore", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_ORE_ITEM.get()))
            .save(this.output, "prasiolite_quartz_by_smelting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(PrasioliteQuartzList.PRASIOLITE_QUARTZ_ORE_ITEM.get()), RecipeCategory.MISC, PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get(), 0.4f, 30)
            .unlockedBy("has_prasiolite_quartz_ore", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_ORE_ITEM.get()))
            .save(this.output, "prasiolite_quartz_by_blasting");

        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get(), 4)
            .requires(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "prasiolite_quartz_by_crafting");
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

        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_PANE_ITEM.get(), 16)
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "smoky_quartz_pane_by_stonecutting");
            
            
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_BARS_ITEM.get(), 18)
            .pattern("@@@")
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_BARS_BLOCK_ITEM.get())
            .pattern("@@@")
            .pattern("@@@")
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_BARS_ITEM.get())
            .unlockedBy("has_smoky_quartz_bars", has(SmokyQuartzList.SMOKY_QUARTZ_BARS_ITEM.get()))
            .save(this.output);
            
            
        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_LIGHT_ITEM.get())
            .requires(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get())
            .requires(Items.GLOWSTONE)
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .unlockedBy("has_glowstone", has(Items.GLOWSTONE))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_BOOKSHELF_ITEM.get())
            .pattern("@@@")
            .pattern("###")
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_SLAB_ITEM.get())
            .define('#', Items.BOOK)
            .unlockedBy("has_smoky_quartz_slab", has(SmokyQuartzList.SMOKY_QUARTZ_SLAB_ITEM.get()))
            .unlockedBy("has_book", has(Items.BOOK))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_FURNACE_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .define('#', Items.FURNACE)
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_OVEN_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .define('#', Items.SMOKER)
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_BLAST_FURNACE_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .define('#', Items.BLAST_FURNACE)
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_CRAFTING_TABLE_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .define('#', TagKeyList.CRAFTING_TABLE_ITEM_TAG)
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_STONECUTTER_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .define('#', Items.STONECUTTER)
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_GRINDSTONE_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .define('#', Items.GRINDSTONE)
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .save(this.output);




        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get())
            .pattern("@@")
            .pattern("@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "rose_quartz_bricks_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_BRICKS_ITEM.get(), 4)
            .pattern("@@")
            .pattern("@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "rose_quartz_bricks_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.CHISELED_ROSE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "chiseled_rose_quartz_block_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.CHISELED_ROSE_QUARTZ_BLOCK_ITEM.get())
            .pattern("@")
            .pattern("@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_rose_quartz_slab", has(RoseQuartzList.ROSE_QUARTZ_SLAB_ITEM.get()))
            .save(this.output, "chiseled_rose_quartz_block_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_TILES_ITEM.get())
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output);


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_PILLAR_ITEM.get())
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_BARS_ITEM.get(), 18)
            .pattern("@@@")
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_BARS_BLOCK_ITEM.get())
            .pattern("@@@")
            .pattern("@@@")
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_BARS_ITEM.get())
            .unlockedBy("has_rose_quartz_bars", has(RoseQuartzList.ROSE_QUARTZ_BARS_ITEM.get()))
            .save(this.output);

        
        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_LIGHT_ITEM.get())
            .requires(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get())
            .requires(Items.GLOWSTONE)
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .unlockedBy("has_glowstone", has(Items.GLOWSTONE))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_BOOKSHELF_ITEM.get())
            .pattern("@@@")
            .pattern("###")
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_SLAB_ITEM.get())
            .define('#', Items.BOOK)
            .unlockedBy("has_rose_quartz_slab", has(RoseQuartzList.ROSE_QUARTZ_SLAB_ITEM.get()))
            .unlockedBy("has_book", has(Items.BOOK))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_FURNACE_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .define('#', Items.FURNACE)
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_OVEN_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .define('#', Items.SMOKER)
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_BLAST_FURNACE_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .define('#', Items.BLAST_FURNACE)
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_CRAFTING_TABLE_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .define('#', TagKeyList.CRAFTING_TABLE_ITEM_TAG)
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_STONECUTTER_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .define('#', Items.STONECUTTER)
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_GRINDSTONE_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .define('#', Items.GRINDSTONE)
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .save(this.output);




        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_BLOCK_ITEM.get())
            .pattern("@@")
            .pattern("@@")
            .define('@', CitrineList.CITRINE_CRYSTAL.get())
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .save(this.output);


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(CitrineList.CITRINE_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_BRICKS_ITEM.get())
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .save(this.output, "citrine_bricks_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_BRICKS_ITEM.get(), 4)
            .pattern("@@")
            .pattern("@@")
            .define('@', CitrineList.CITRINE_BLOCK_ITEM.get())
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .save(this.output, "citrine_bricks_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(CitrineList.CITRINE_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, CitrineList.CHISELED_CITRINE_BLOCK_ITEM.get())
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .save(this.output, "chiseled_citrine_block_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, CitrineList.CHISELED_CITRINE_BLOCK_ITEM.get())
            .pattern("@")
            .pattern("@")
            .define('@', CitrineList.CITRINE_SLAB_ITEM.get())
            .unlockedBy("has_citrine_slab", has(CitrineList.CITRINE_SLAB_ITEM.get()))
            .save(this.output, "chiseled_citrine_block_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(CitrineList.CITRINE_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_TILES_ITEM.get())
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .save(this.output);


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(CitrineList.CITRINE_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_PILLAR_ITEM.get())
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .save(this.output);

            
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_BARS_ITEM.get(), 18)
            .pattern("@@@")
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_CRYSTAL.get())
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_BARS_BLOCK_ITEM.get())
            .pattern("@@@")
            .pattern("@@@")
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_BARS_ITEM.get())
            .unlockedBy("has_citrine_bars", has(CitrineList.CITRINE_BARS_ITEM.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_BOOKSHELF_ITEM.get())
            .pattern("@@@")
            .pattern("###")
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_SLAB_ITEM.get())
            .define('#', Items.BOOK)
            .unlockedBy("has_citrine_slab", has(CitrineList.CITRINE_SLAB_ITEM.get()))
            .unlockedBy("has_book", has(Items.BOOK))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_FURNACE_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_CRYSTAL.get())
            .define('#', Items.FURNACE)
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_OVEN_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_CRYSTAL.get())
            .define('#', Items.SMOKER)
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_BLAST_FURNACE_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_CRYSTAL.get())
            .define('#', Items.BLAST_FURNACE)
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .save(this.output);

            
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_CRAFTING_TABLE_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_CRYSTAL.get())
            .define('#', TagKeyList.CRAFTING_TABLE_ITEM_TAG)
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_STONECUTTER_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_CRYSTAL.get())
            .define('#', Items.STONECUTTER)
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_GRINDSTONE_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_CRYSTAL.get())
            .define('#', Items.GRINDSTONE)
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .save(this.output);

        
        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_LIGHT_ITEM.get())
            .requires(CitrineList.CITRINE_BLOCK_ITEM.get())
            .requires(Items.GLOWSTONE)
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .unlockedBy("has_glowstone", has(Items.GLOWSTONE))
            .save(this.output);




        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get())
            .pattern("@@")
            .pattern("@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "blue_quartz_bricks_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_BRICKS_ITEM.get(), 4)
            .pattern("@@")
            .pattern("@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "blue_quartz_bricks_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.CHISELED_BLUE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "chiseled_blue_quartz_block_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.CHISELED_BLUE_QUARTZ_BLOCK_ITEM.get())
            .pattern("@")
            .pattern("@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_blue_quartz_slab", has(BlueQuartzList.BLUE_QUARTZ_SLAB_ITEM.get()))
            .save(this.output, "chiseled_blue_quartz_block_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_TILES_ITEM.get())
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output);


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_PILLAR_ITEM.get())
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output);

        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_PANE_ITEM.get(), 16)
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_BARS_ITEM.get(), 18)
            .pattern("@@@")
            .pattern("@@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_BARS_BLOCK_ITEM.get())
            .pattern("@@@")
            .pattern("@@@")
            .pattern("@@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_BARS_ITEM.get())
            .unlockedBy("has_blue_quartz_bars", has(BlueQuartzList.BLUE_QUARTZ_BARS_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_BOOKSHELF_ITEM.get())
            .pattern("@@@")
            .pattern("###")
            .pattern("@@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_SLAB_ITEM.get())
            .define('#', Items.BOOK)
            .unlockedBy("has_blue_quartz_slab", has(BlueQuartzList.BLUE_QUARTZ_SLAB_ITEM.get()))
            .unlockedBy("has_book", has(Items.BOOK))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_FURNACE_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .define('#', Items.FURNACE)
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_OVEN_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .define('#', Items.SMOKER)
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_BLAST_FURNACE_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .define('#', Items.BLAST_FURNACE)
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_CRAFTING_TABLE_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .define('#', TagKeyList.CRAFTING_TABLE_ITEM_TAG)
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_STONECUTTER_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .define('#', Items.STONECUTTER)
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        
        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_LIGHT_ITEM.get())
            .requires(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get())
            .requires(Items.GLOWSTONE)
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .unlockedBy("has_glowstone", has(Items.GLOWSTONE))
            .save(this.output);




        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get())
            .pattern("@@")
            .pattern("@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_PANE_ITEM.get(), 16)
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output);


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "prasiolite_quartz_bricks_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS_ITEM.get(), 4)
            .pattern("@@")
            .pattern("@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "prasiolite_quartz_bricks_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.CHISELED_PRASIOLITE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "chiseled_prasiolite_quartz_block_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.CHISELED_PRASIOLITE_QUARTZ_BLOCK_ITEM.get())
            .pattern("@")
            .pattern("@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_slab", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB_ITEM.get()))
            .save(this.output, "chiseled_prasiolite_quartz_block_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILES_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output);


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_PILLAR_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARS_ITEM.get(), 18)
            .pattern("@@@")
            .pattern("@@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARS_BLOCK_ITEM.get())
            .pattern("@@@")
            .pattern("@@@")
            .pattern("@@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARS_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_bars", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARS_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_BOOKSHELF_ITEM.get())
            .pattern("@@@")
            .pattern("###")
            .pattern("@@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB_ITEM.get())
            .define('#', Items.BOOK)
            .unlockedBy("has_prasiolite_quartz_slab", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB_ITEM.get()))
            .unlockedBy("has_book", has(Items.BOOK))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_FURNACE_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .define('#', Items.FURNACE)
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_OVEN_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .define('#', Items.SMOKER)
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLAST_FURNACE_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .define('#', Items.BLAST_FURNACE)
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRAFTING_TABLE_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .define('#', TagKeyList.CRAFTING_TABLE_ITEM_TAG)
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_STONECUTTER_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .define('#', Items.STONECUTTER)
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        
        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_LIGHT_ITEM.get())
            .requires(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get())
            .requires(Items.GLOWSTONE)
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
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


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_BRICK_SLAB_ITEM.get(), 2)
            .unlockedBy("has_smoky_quartz_bricks_block", has(SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "smoky_quartz_bricks_slab_by_stonecutting");  

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_BRICK_SLAB_ITEM.get(), 6)
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_smoky_quartz_bricks_block", has(SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "smoky_quartz_bricks_slab_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_TILES_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_TILE_SLAB_ITEM.get(), 2)
            .unlockedBy("has_smoky_quartz_tiles", has(SmokyQuartzList.SMOKY_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "smoky_quartz_tiles_slab_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_TILE_SLAB_ITEM.get(), 6)
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_TILES_ITEM.get())
            .unlockedBy("has_smoky_quartz_tiles", has(SmokyQuartzList.SMOKY_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "smoky_quartz_tiles_slab_by_crafting");




        SingleItemRecipeBuilder.stonecutting(Ingredient.of(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_SLAB_ITEM.get(), 2)
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "rose_quartz_slab_by_stonecutting");  

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_SLAB_ITEM.get(), 6)
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "rose_quartz_slab_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(RoseQuartzList.ROSE_QUARTZ_BRICKS_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_BRICK_SLAB_ITEM.get(), 2)
            .unlockedBy("has_rose_quartz_bricks_block", has(RoseQuartzList.ROSE_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "rose_quartz_bricks_slab_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_BRICK_SLAB_ITEM.get(), 6)
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_rose_quartz_bricks_block", has(RoseQuartzList.ROSE_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "rose_quartz_bricks_slab_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(RoseQuartzList.ROSE_QUARTZ_TILES_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_TILE_SLAB_ITEM.get(), 2)
            .unlockedBy("has_rose_quartz_tiles", has(RoseQuartzList.ROSE_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "rose_quartz_tiles_slab_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_TILE_SLAB_ITEM.get(), 6)
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_TILES_ITEM.get())
            .unlockedBy("has_rose_quartz_tiles", has(RoseQuartzList.ROSE_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "rose_quartz_tile_slab_by_crafting");


        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(CitrineList.CITRINE_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_SLAB_ITEM.get(), 2)
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .save(this.output, "citrine_slab_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_SLAB_ITEM.get(), 6)
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_BLOCK_ITEM.get())
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .save(this.output, "citrine_slab_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(CitrineList.CITRINE_BRICKS_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_BRICK_SLAB_ITEM.get(), 2)
            .unlockedBy("has_citrine_bricks_block", has(CitrineList.CITRINE_BRICKS_ITEM.get()))
            .save(this.output, "citrine_bricks_slab_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_BRICK_SLAB_ITEM.get(), 6)
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_BRICKS_ITEM.get())
            .unlockedBy("has_citrine_bricks_block", has(CitrineList.CITRINE_BRICKS_ITEM.get()))
            .save(this.output, "citrine_bricks_slab_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(CitrineList.CITRINE_TILES_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_TILE_SLAB_ITEM.get(), 2)
            .unlockedBy("has_citrine_tiles", has(CitrineList.CITRINE_TILES_ITEM.get()))
            .save(this.output, "citrine_tiles_slab_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_TILE_SLAB_ITEM.get(), 6)
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_TILES_ITEM.get())
            .unlockedBy("has_citrine_tiles", has(CitrineList.CITRINE_TILES_ITEM.get()))
            .save(this.output, "citrine_tiles_slab_by_crafting");



        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_SLAB_ITEM.get(), 2)
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "blue_quartz_slab_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_SLAB_ITEM.get(), 6)
            .pattern("@@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "blue_quartz_slab_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlueQuartzList.BLUE_QUARTZ_BRICKS_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_BRICK_SLAB_ITEM.get(), 2)
            .unlockedBy("has_blue_quartz_bricks_block", has(BlueQuartzList.BLUE_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "blue_quartz_bricks_slab_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_BRICK_SLAB_ITEM.get(), 6)
            .pattern("@@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_blue_quartz_bricks_block", has(BlueQuartzList.BLUE_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "blue_quartz_bricks_slab_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlueQuartzList.BLUE_QUARTZ_TILES_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_TILE_SLAB_ITEM.get(), 2)
            .unlockedBy("has_blue_quartz_tiles", has(BlueQuartzList.BLUE_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "blue_quartz_tiles_slab_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_TILE_SLAB_ITEM.get(), 6)
            .pattern("@@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_TILES_ITEM.get())
            .unlockedBy("has_blue_quartz_tiles", has(BlueQuartzList.BLUE_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "blue_quartz_tile_slab_by_crafting");



        SingleItemRecipeBuilder.stonecutting(Ingredient.of(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB_ITEM.get(), 2)
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "prasiolite_quartz_slab_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB_ITEM.get(), 6)
            .pattern("@@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "prasiolite_quartz_slab_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_SLAB_ITEM.get(), 2)
            .unlockedBy("has_prasiolite_quartz_bricks_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "prasiolite_quartz_bricks_slab_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_SLAB_ITEM.get(), 6)
            .pattern("@@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_bricks_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "prasiolite_quartz_bricks_slab_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILES_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILE_SLAB_ITEM.get(), 2)
            .unlockedBy("has_prasiolite_quartz_tiles", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "prasiolite_quartz_tiles_slab_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILE_SLAB_ITEM.get(), 6)
            .pattern("@@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILES_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_tiles", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "prasiolite_quartz_tile_slab_by_crafting");
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


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_BRICK_STAIRS_ITEM.get())
            .unlockedBy("has_smoky_quartz_bricks_block", has(SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "smoky_quartz_bricks_stairs_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_BRICK_STAIRS_ITEM.get(), 4)
            .pattern("@  ")
            .pattern("@@ ")
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_smoky_quartz_bricks_block", has(SmokyQuartzList.SMOKY_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "smoky_quartz_bricks_stairs_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_TILES_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_TILE_STAIRS_ITEM.get())
            .unlockedBy("has_smoky_quartz_tiles", has(SmokyQuartzList.SMOKY_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "smoky_quartz_tiles_stairs_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_TILE_STAIRS_ITEM.get(), 4)
            .pattern("@  ")
            .pattern("@@ ")
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_TILES_ITEM.get())
            .unlockedBy("has_smoky_quartz_tiles", has(SmokyQuartzList.SMOKY_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "smoky_quartz_tiles_stairs_by_crafting");




        SingleItemRecipeBuilder.stonecutting(Ingredient.of(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_STAIRS_ITEM.get())
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "rose_quartz_stairs_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_STAIRS_ITEM.get(), 4)
            .pattern("@  ")
            .pattern("@@ ")
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "rose_quartz_stairs_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(RoseQuartzList.ROSE_QUARTZ_BRICKS_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_BRICK_STAIRS_ITEM.get())
            .unlockedBy("has_rose_quartz_bricks_block", has(RoseQuartzList.ROSE_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "rose_quartz_bricks_stairs_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_BRICK_STAIRS_ITEM.get(), 4)
            .pattern("@  ")
            .pattern("@@ ")
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_rose_quartz_bricks_block", has(RoseQuartzList.ROSE_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "rose_quartz_bricks_stairs_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(RoseQuartzList.ROSE_QUARTZ_TILES_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_TILE_STAIRS_ITEM.get())
            .unlockedBy("has_rose_quartz_tiles", has(RoseQuartzList.ROSE_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "rose_quartz_tile_stairs_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_TILE_STAIRS_ITEM.get(), 4)
            .pattern("@  ")
            .pattern("@@ ")
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_TILES_ITEM.get())
            .unlockedBy("has_rose_quartz_tiles", has(RoseQuartzList.ROSE_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "rose_quartz_tile_stairs_by_crafting");



        SingleItemRecipeBuilder.stonecutting(Ingredient.of(CitrineList.CITRINE_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_STAIRS_ITEM.get())
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .save(this.output, "citrine_stairs_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_STAIRS_ITEM.get(), 4)
            .pattern("@  ")
            .pattern("@@ ")
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_BLOCK_ITEM.get())
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .save(this.output, "citrine_stairs_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(CitrineList.CITRINE_BRICKS_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_BRICK_STAIRS_ITEM.get())
            .unlockedBy("has_citrine_bricks_block", has(CitrineList.CITRINE_BRICKS_ITEM.get()))
            .save(this.output, "citrine_bricks_stairs_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_BRICK_STAIRS_ITEM.get(), 4)
            .pattern("@  ")
            .pattern("@@ ")
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_BRICKS_ITEM.get())
            .unlockedBy("has_citrine_bricks_block", has(CitrineList.CITRINE_BRICKS_ITEM.get()))
            .save(this.output, "citrine_bricks_stairs_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(CitrineList.CITRINE_TILES_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_TILE_STAIRS_ITEM.get())
            .unlockedBy("has_citrine_tiles", has(CitrineList.CITRINE_TILES_ITEM.get()))
            .save(this.output, "citrine_tiles_stairs_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_TILE_STAIRS_ITEM.get(), 4)
            .pattern("@  ")
            .pattern("@@ ")
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_TILES_ITEM.get())
            .unlockedBy("has_citrine_tiles", has(CitrineList.CITRINE_TILES_ITEM.get()))
            .save(this.output, "citrine_tiles_stairs_by_crafting");

            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_STAIRS_ITEM.get())
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "blue_quartz_stairs_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_STAIRS_ITEM.get(), 4)
            .pattern("@  ")
            .pattern("@@ ")
            .pattern("@@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "blue_quartz_stairs_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlueQuartzList.BLUE_QUARTZ_BRICKS_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_BRICK_STAIRS_ITEM.get())
            .unlockedBy("has_blue_quartz_bricks_block", has(BlueQuartzList.BLUE_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "blue_quartz_bricks_stairs_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_BRICK_STAIRS_ITEM.get(), 4)
            .pattern("@  ")
            .pattern("@@ ")
            .pattern("@@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_blue_quartz_bricks_block", has(BlueQuartzList.BLUE_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "blue_quartz_bricks_stairs_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlueQuartzList.BLUE_QUARTZ_TILES_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_TILE_STAIRS_ITEM.get())
            .unlockedBy("has_blue_quartz_tiles", has(BlueQuartzList.BLUE_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "blue_quartz_tile_stairs_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_TILE_STAIRS_ITEM.get(), 4)
            .pattern("@  ")
            .pattern("@@ ")
            .pattern("@@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_TILES_ITEM.get())
            .unlockedBy("has_blue_quartz_tiles", has(BlueQuartzList.BLUE_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "blue_quartz_tile_stairs_by_crafting");

            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_STAIRS_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "prasiolite_quartz_stairs_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_STAIRS_ITEM.get(), 4)
            .pattern("@  ")
            .pattern("@@ ")
            .pattern("@@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "prasiolite_quartz_stairs_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_STAIRS_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_bricks_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "prasiolite_quartz_bricks_stairs_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_STAIRS_ITEM.get(), 4)
            .pattern("@  ")
            .pattern("@@ ")
            .pattern("@@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_bricks_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "prasiolite_quartz_bricks_stairs_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILES_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILE_STAIRS_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_tiles", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "prasiolite_quartz_tile_stairs_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILE_STAIRS_ITEM.get(), 4)
            .pattern("@  ")
            .pattern("@@ ")
            .pattern("@@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILES_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_tiles", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILES_ITEM.get()))
            .save(this.output, "prasiolite_quartz_tile_stairs_by_crafting");
    }

    protected void buildButtonRecipes() {

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.REDSTONE, SmokyQuartzList.SMOKY_QUARTZ_BUTTON_ITEM.get(), 4)
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "smoky_quartz_button_by_stonecutting");

        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.REDSTONE, SmokyQuartzList.SMOKY_QUARTZ_BUTTON_ITEM.get())
            .requires(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .save(this.output, "smoky_quartz_button_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.REDSTONE, RoseQuartzList.ROSE_QUARTZ_BUTTON_ITEM.get(), 4)
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "rose_quartz_button_by_stonecutting");

        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.REDSTONE, RoseQuartzList.ROSE_QUARTZ_BUTTON_ITEM.get())
            .requires(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .save(this.output, "rose_quartz_button_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(CitrineList.CITRINE_BLOCK_ITEM.get()), RecipeCategory.REDSTONE, CitrineList.CITRINE_BUTTON_ITEM.get(), 4)
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .save(this.output, "citrine_button_by_stonecutting");

        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.REDSTONE, CitrineList.CITRINE_BUTTON_ITEM.get())
            .requires(CitrineList.CITRINE_CRYSTAL.get())
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .save(this.output, "citrine_button_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.REDSTONE, BlueQuartzList.BLUE_QUARTZ_BUTTON_ITEM.get(), 4)
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "blue_quartz_button_by_stonecutting");

        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.REDSTONE, BlueQuartzList.BLUE_QUARTZ_BUTTON_ITEM.get())
            .requires(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .save(this.output, "blue_quartz_button_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.REDSTONE, PrasioliteQuartzList.PRASIOLITE_QUARTZ_BUTTON_ITEM.get(), 4)
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "prasiolite_quartz_button_by_stonecutting");

        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.REDSTONE, PrasioliteQuartzList.PRASIOLITE_QUARTZ_BUTTON_ITEM.get())
            .requires(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .save(this.output, "prasiolite_quartz_button_by_crafting");
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


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.REDSTONE, RoseQuartzList.ROSE_QUARTZ_PRESSURE_PLATE_ITEM.get())
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "rose_quartz_pressure_plate_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.REDSTONE, RoseQuartzList.ROSE_QUARTZ_PRESSURE_PLATE_ITEM.get())
            .pattern("@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "rose_quartz_pressure_plate_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(CitrineList.CITRINE_BLOCK_ITEM.get()), RecipeCategory.REDSTONE, CitrineList.CITRINE_PRESSURE_PLATE_ITEM.get())
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .save(this.output, "citrine_pressure_plate_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.REDSTONE, CitrineList.CITRINE_PRESSURE_PLATE_ITEM.get())
            .pattern("@@")
            .define('@', CitrineList.CITRINE_BLOCK_ITEM.get())
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .save(this.output, "citrine_pressure_plate_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.REDSTONE, BlueQuartzList.BLUE_QUARTZ_PRESSURE_PLATE_ITEM.get())
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "blue_quartz_pressure_plate_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.REDSTONE, BlueQuartzList.BLUE_QUARTZ_PRESSURE_PLATE_ITEM.get())
            .pattern("@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "blue_quartz_pressure_plate_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.REDSTONE, PrasioliteQuartzList.PRASIOLITE_QUARTZ_PRESSURE_PLATE_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "prasiolite_quartz_pressure_plate_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.REDSTONE, PrasioliteQuartzList.PRASIOLITE_QUARTZ_PRESSURE_PLATE_ITEM.get())
            .pattern("@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "prasiolite_quartz_pressure_plate_by_crafting");
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



        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_FENCE_ITEM.get(), 6)
            .pattern("@#@")
            .pattern("@#@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get())
            .define('#', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_WALL_ITEM.get())
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))       
            .save(this.output, "rose_quartz_wall_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_WALL_ITEM.get(), 6)
            .pattern("@@@")
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "rose_quartz_wall_by_crafting");


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.REDSTONE, RoseQuartzList.ROSE_QUARTZ_GATE_ITEM.get(), 2)
            .pattern("#@#")
            .pattern("#@#")
            .define('@', RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get())
            .define('#', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_BRICK_WALL_ITEM.get(), 6)
            .pattern("@@@")
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_rose_quartz_bricks", has(RoseQuartzList.ROSE_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "rose_quartz_brick_wall_by_crafting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(RoseQuartzList.ROSE_QUARTZ_BRICKS_ITEM.get()), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_BRICK_WALL_ITEM.get())
            .unlockedBy("has_rose_quartz_bricks", has(RoseQuartzList.ROSE_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "rose_quartz_brick_wall_by_stonecutting");



        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_FENCE_ITEM.get(), 6)
            .pattern("@#@")
            .pattern("@#@")
            .define('@', CitrineList.CITRINE_BLOCK_ITEM.get())
            .define('#', CitrineList.CITRINE_CRYSTAL.get())
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_GATE_ITEM.get(), 2)
            .pattern("#@#")
            .pattern("#@#")
            .define('@', CitrineList.CITRINE_BLOCK_ITEM.get())
            .define('#', CitrineList.CITRINE_CRYSTAL.get())
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .save(this.output);

        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(CitrineList.CITRINE_BLOCK_ITEM.get()), RecipeCategory.DECORATIONS, CitrineList.CITRINE_WALL_ITEM.get())
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))       
            .save(this.output, "citrine_wall_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_WALL_ITEM.get(), 6)
            .pattern("@@@")
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_BLOCK_ITEM.get())
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .save(this.output, "citrine_wall_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(CitrineList.CITRINE_BRICKS_ITEM.get()), RecipeCategory.DECORATIONS, CitrineList.CITRINE_BRICK_WALL_ITEM.get())
            .unlockedBy("has_citrine_bricks", has(CitrineList.CITRINE_BRICKS_ITEM.get()))
            .save(this.output, "citrine_brick_wall_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_BRICK_WALL_ITEM.get(), 6)
            .pattern("@@@")
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_BRICKS_ITEM.get())
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BRICKS_ITEM.get()))
            .save(this.output, "citrine_brick_wall_by_crafting");



        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_FENCE_ITEM.get(), 6)
            .pattern("@#@")
            .pattern("@#@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get())
            .define('#', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_GATE_ITEM.get(), 2)
            .pattern("#@#")
            .pattern("#@#")
            .define('@', BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get())
            .define('#', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_WALL_ITEM.get())
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))       
            .save(this.output, "blue_quartz_wall_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_WALL_ITEM.get(), 6)
            .pattern("@@@")
            .pattern("@@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "blue_quartz_wall_by_crafting");


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_BRICK_WALL_ITEM.get(), 6)
            .pattern("@@@")
            .pattern("@@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_blue_quartz_bricks", has(BlueQuartzList.BLUE_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "blue_quartz_brick_wall_by_crafting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlueQuartzList.BLUE_QUARTZ_BRICKS_ITEM.get()), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_BRICK_WALL_ITEM.get())
            .unlockedBy("has_blue_quartz_bricks", has(BlueQuartzList.BLUE_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "blue_quartz_brick_wall_by_stonecutting");



        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_FENCE_ITEM.get(), 6)
            .pattern("@#@")
            .pattern("@#@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get())
            .define('#', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_GATE_ITEM.get(), 2)
            .pattern("#@#")
            .pattern("#@#")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get())
            .define('#', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_WALL_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))       
            .save(this.output, "prasiolite_quartz_wall_by_stonecutting");

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_WALL_ITEM.get(), 6)
            .pattern("@@@")
            .pattern("@@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "prasiolite_quartz_wall_by_crafting");


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_WALL_ITEM.get(), 6)
            .pattern("@@@")
            .pattern("@@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_bricks", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "prasiolite_quartz_brick_wall_by_crafting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS_ITEM.get()), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_WALL_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_bricks", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS_ITEM.get()))
            .save(this.output, "prasiolite_quartz_brick_wall_by_stonecutting");
    }

    protected void buildDoorRecipes() {

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_DOOR_ITEM.get(), 3)
            .pattern("@@")
            .pattern("@@")
            .pattern("@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_TRAPDOOR_ITEM.get(), 3)
            .pattern("@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_smoky_quartz_slab", has(SmokyQuartzList.SMOKY_QUARTZ_SLAB_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_DOOR_ITEM.get(), 3)
            .pattern("@@")
            .pattern("@@")
            .pattern("@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_TRAPDOOR_ITEM.get(), 3)
            .pattern("@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_rose_quartz_slab", has(RoseQuartzList.ROSE_QUARTZ_SLAB_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_DOOR_ITEM.get(), 3)
            .pattern("@@")
            .pattern("@@")
            .pattern("@@")
            .define('@', CitrineList.CITRINE_CRYSTAL.get())
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_TRAPDOOR_ITEM.get(), 3)
            .pattern("@@")
            .define('@', CitrineList.CITRINE_SLAB_ITEM.get())
            .unlockedBy("has_citrine_slab", has(CitrineList.CITRINE_SLAB_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_DOOR_ITEM.get(), 3)
            .pattern("@@")
            .pattern("@@")
            .pattern("@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_TRAPDOOR_ITEM.get(), 3)
            .pattern("@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_blue_quartz_slab", has(BlueQuartzList.BLUE_QUARTZ_SLAB_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_DOOR_ITEM.get(), 3)
            .pattern("@@")
            .pattern("@@")
            .pattern("@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_TRAPDOOR_ITEM.get(), 3)
            .pattern("@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_slab", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB_ITEM.get()))
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


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_CHAIR.get(), 4)
            .pattern("  @")
            .pattern("##@")
            .pattern("@ @")
            .define('@', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .define('#', RoseQuartzList.ROSE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_rose_quartz_slab", has(RoseQuartzList.ROSE_QUARTZ_SLAB.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_CHAIR_ITEM.get(), 4)
            .pattern("  @")
            .pattern("##@")
            .pattern("@ @")
            .define('@', CitrineList.CITRINE_CRYSTAL.get())
            .define('#', CitrineList.CITRINE_SLAB_ITEM.get())
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .unlockedBy("has_citrine_slab", has(CitrineList.CITRINE_SLAB_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_CHAIR.get(), 4)
            .pattern("  @")
            .pattern("##@")
            .pattern("@ @")
            .define('@', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .define('#', BlueQuartzList.BLUE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_blue_quartz_slab", has(BlueQuartzList.BLUE_QUARTZ_SLAB.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_CHAIR.get(), 4)
            .pattern("  @")
            .pattern("##@")
            .pattern("@ @")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .define('#', PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_prasiolite_quartz_slab", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB.get()))
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


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_TABLE_ITEM.get(), 2)
            .pattern("###")
            .pattern("@ @")
            .define('@', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .define('#', RoseQuartzList.ROSE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_rose_quartz_slab", has(RoseQuartzList.ROSE_QUARTZ_SLAB.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_TABLE_ITEM.get(), 2)
            .pattern("###")
            .pattern("@ @")
            .define('@', CitrineList.CITRINE_CRYSTAL.get())
            .define('#', CitrineList.CITRINE_SLAB_ITEM.get())
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .unlockedBy("has_citrine_slab", has(CitrineList.CITRINE_SLAB_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_TABLE_ITEM.get(), 2)
            .pattern("###")
            .pattern("@ @")
            .define('@', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .define('#', BlueQuartzList.BLUE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_blue_quartz_slab", has(BlueQuartzList.BLUE_QUARTZ_SLAB.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_TABLE_ITEM.get(), 2)
            .pattern("###")
            .pattern("@ @")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .define('#', PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_prasiolite_quartz_slab", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB.get()))
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

            
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_SHELF_ITEM.get(), 2)
            .pattern("###")
            .pattern("  @")
            .define('@', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .define('#', RoseQuartzList.ROSE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_rose_quartz_slab", has(RoseQuartzList.ROSE_QUARTZ_SLAB.get()))
            .save(this.output);

            
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_SHELF_ITEM.get(), 2)
            .pattern("###")
            .pattern("  @")
            .define('@', CitrineList.CITRINE_CRYSTAL.get())
            .define('#', CitrineList.CITRINE_SLAB_ITEM.get())
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .unlockedBy("has_citrine_slab", has(CitrineList.CITRINE_SLAB.get()))
            .save(this.output);

            
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_SHELF_ITEM.get(), 2)
            .pattern("###")
            .pattern("  @")
            .define('@', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .define('#', BlueQuartzList.BLUE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_blue_quartz_slab", has(BlueQuartzList.BLUE_QUARTZ_SLAB.get()))
            .save(this.output);

            
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_SHELF_ITEM.get(), 2)
            .pattern("###")
            .pattern("  @")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .define('#', PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_prasiolite_quartz_slab", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB.get()))
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


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_LANTERN_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .define('#', Items.TORCH)
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_torch", has(Items.TORCH))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_SOUL_LANTERN_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .define('#', Items.SOUL_TORCH)
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_soul_torch", has(Items.SOUL_TORCH))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_CHAIN.get())
            .pattern("@")
            .pattern("@")
            .pattern("@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_LANTERN.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_CRYSTAL.get())
            .define('#', Items.TORCH)
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .unlockedBy("has_torch", has(Items.TORCH))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_SOUL_LANTERN.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_CRYSTAL.get())
            .define('#', Items.SOUL_TORCH)
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .unlockedBy("has_soul_torch", has(Items.SOUL_TORCH))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_CHAIN.get())
            .pattern("@")
            .pattern("@")
            .pattern("@")
            .define('@', CitrineList.CITRINE_CRYSTAL.get())
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_LANTERN_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .define('#', Items.TORCH)
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_torch", has(Items.TORCH))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_SOUL_LANTERN_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .define('#', Items.SOUL_TORCH)
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_soul_torch", has(Items.SOUL_TORCH))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_CHAIN.get())
            .pattern("@")
            .pattern("@")
            .pattern("@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_LANTERN_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .define('#', Items.TORCH)
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_torch", has(Items.TORCH))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_SOUL_LANTERN_ITEM.get())
            .pattern("@@@")
            .pattern("@#@")
            .pattern("@@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .define('#', Items.SOUL_TORCH)
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .unlockedBy("has_soul_torch", has(Items.SOUL_TORCH))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_CHAIN.get())
            .pattern("@")
            .pattern("@")
            .pattern("@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .save(this.output);
    }

    protected void buildTorchRecipes() {

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_TORCH_ITEM.get(), 4)
            .pattern("@")
            .pattern("#")
            .define('@', TagKeyList.COALS_TAG)
            .define('#', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_coal_or_charcoal", has(TagKeyList.COALS_TAG))
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_SOUL_TORCH_ITEM.get(), 4)
            .pattern("@")
            .pattern("$")
            .pattern("#")
            .define('@', TagKeyList.COALS_TAG)
            .define('$',Items.SOUL_SAND)
            .define('#', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_coal_or_charcoal", has(TagKeyList.COALS_TAG))
            .unlockedBy("has_soul_sand", has(Items.SOUL_SAND))
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_TORCH_ITEM.get(), 4)
            .pattern("@")
            .pattern("#")
            .define('@', TagKeyList.COALS_TAG)
            .define('#', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_coal_or_charcoal", has(TagKeyList.COALS_TAG))
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_SOUL_TORCH_ITEM.get(), 4)
            .pattern("@")
            .pattern("$")
            .pattern("#")
            .define('@', TagKeyList.COALS_TAG)
            .define('$',Items.SOUL_SAND)
            .define('#', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_coal_or_charcoal", has(TagKeyList.COALS_TAG))
            .unlockedBy("has_soul_sand", has(Items.SOUL_SAND))
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_TORCH_ITEM.get(), 4)
            .pattern("@")
            .pattern("#")
            .define('@', TagKeyList.COALS_TAG)
            .define('#', CitrineList.CITRINE_CRYSTAL.get())
            .unlockedBy("has_coal_or_charcoal", has(TagKeyList.COALS_TAG))
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_SOUL_TORCH_ITEM.get(), 4)
            .pattern("@")
            .pattern("$")
            .pattern("#")
            .define('@', TagKeyList.COALS_TAG)
            .define('$',Items.SOUL_SAND)
            .define('#', CitrineList.CITRINE_CRYSTAL.get())
            .unlockedBy("has_coal_or_charcoal", has(TagKeyList.COALS_TAG))
            .unlockedBy("has_soul_sand", has(Items.SOUL_SAND))
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_TORCH_ITEM.get(), 4)
            .pattern("@")
            .pattern("#")
            .define('@', TagKeyList.COALS_TAG)
            .define('#', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_coal_or_charcoal", has(TagKeyList.COALS_TAG))
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_SOUL_TORCH_ITEM.get(), 4)
            .pattern("@")
            .pattern("$")
            .pattern("#")
            .define('@', TagKeyList.COALS_TAG)
            .define('$',Items.SOUL_SAND)
            .define('#', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_coal_or_charcoal", has(TagKeyList.COALS_TAG))
            .unlockedBy("has_soul_sand", has(Items.SOUL_SAND))
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_TORCH_ITEM.get(), 4)
            .pattern("@")
            .pattern("#")
            .define('@', TagKeyList.COALS_TAG)
            .define('#', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_coal_or_charcoal", has(TagKeyList.COALS_TAG))
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_SOUL_TORCH_ITEM.get(), 4)
            .pattern("@")
            .pattern("$")
            .pattern("#")
            .define('@', TagKeyList.COALS_TAG)
            .define('$',Items.SOUL_SAND)
            .define('#', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_coal_or_charcoal", has(TagKeyList.COALS_TAG))
            .unlockedBy("has_soul_sand", has(Items.SOUL_SAND))
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .save(this.output);
    }

    protected void buildLadderRecipes() {

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_LADDER.get(), 3)
            .pattern("@ @")
            .pattern("@@@")
            .pattern("@ @")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_LADDER.get(), 3)
            .pattern("@ @")
            .pattern("@@@")
            .pattern("@ @")
            .define('@', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_LADDER.get(), 3)
            .pattern("@ @")
            .pattern("@@@")
            .pattern("@ @")
            .define('@', CitrineList.CITRINE_CRYSTAL.get())
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_LADDER.get(), 3)
            .pattern("@ @")
            .pattern("@@@")
            .pattern("@ @")
            .define('@', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_LADDER.get(), 3)
            .pattern("@ @")
            .pattern("@@@")
            .pattern("@ @")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
            .save(this.output);
    }

    protected void buildContainerRecipes() {

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_BARREL_ITEM.get())
            .pattern("@#@")
            .pattern("@ @")
            .pattern("@#@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get())
            .define('#', SmokyQuartzList.SMOKY_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_NIGHTSTAND_ITEM.get(), 2)
            .pattern("###")
            .pattern("@$@")
            .pattern("@@@")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get())
            .define('#', SmokyQuartzList.SMOKY_QUARTZ_SLAB_ITEM.get())
            .define('$', Items.CHEST)
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .unlockedBy("has_chest", has(Items.CHEST))
            .save(this.output);



        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_BARREL_ITEM.get())
            .pattern("@#@")
            .pattern("@ @")
            .pattern("@#@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get())
            .define('#', RoseQuartzList.ROSE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_NIGHTSTAND_ITEM.get(), 2)
            .pattern("###")
            .pattern("@$@")
            .pattern("@@@")
            .define('@', RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get())
            .define('#', RoseQuartzList.ROSE_QUARTZ_SLAB_ITEM.get())
            .define('$', Items.CHEST)
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .unlockedBy("has_chest", has(Items.CHEST))
            .save(this.output);



        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_BARREL_ITEM.get())
            .pattern("@#@")
            .pattern("@ @")
            .pattern("@#@")
            .define('@', CitrineList.CITRINE_BLOCK_ITEM.get())
            .define('#', CitrineList.CITRINE_SLAB_ITEM.get())
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_NIGHTSTAND_ITEM.get(), 2)
            .pattern("###")
            .pattern("@$@")
            .pattern("@@@")
            .define('@', CitrineList.CITRINE_BLOCK_ITEM.get())
            .define('#', CitrineList.CITRINE_SLAB_ITEM.get())
            .define('$', Items.CHEST)
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .unlockedBy("has_chest", has(Items.CHEST))
            .save(this.output);



        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_BARREL_ITEM.get())
            .pattern("@#@")
            .pattern("@ @")
            .pattern("@#@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get())
            .define('#', BlueQuartzList.BLUE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_NIGHTSTAND_ITEM.get(), 2)
            .pattern("###")
            .pattern("@$@")
            .pattern("@@@")
            .define('@', BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get())
            .define('#', BlueQuartzList.BLUE_QUARTZ_SLAB_ITEM.get())
            .define('$', Items.CHEST)
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .unlockedBy("has_chest", has(Items.CHEST))
            .save(this.output);



        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARREL_ITEM.get())
            .pattern("@#@")
            .pattern("@ @")
            .pattern("@#@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get())
            .define('#', PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_NIGHTSTAND_ITEM.get(), 2)
            .pattern("###")
            .pattern("@$@")
            .pattern("@@@")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get())
            .define('#', PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB_ITEM.get())
            .define('$', Items.CHEST)
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .unlockedBy("has_chest", has(Items.CHEST))
            .save(this.output);
    }

    protected void buildSinkRecipes() {

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_SINK_ITEM.get())
            .pattern("@#@")
            .pattern(" @ ")
            .pattern(" @ ")
            .define('@', SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get())
            .define('#', Items.WATER_BUCKET)
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_SINK_ITEM.get())
            .pattern("@#@")
            .pattern(" @ ")
            .pattern(" @ ")
            .define('@', RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get())
            .define('#', Items.WATER_BUCKET)
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_SINK_ITEM.get())
            .pattern("@#@")
            .pattern(" @ ")
            .pattern(" @ ")
            .define('@', CitrineList.CITRINE_BLOCK_ITEM.get())
            .define('#', Items.WATER_BUCKET)
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_SINK_ITEM.get())
            .pattern("@#@")
            .pattern(" @ ")
            .pattern(" @ ")
            .define('@', BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get())
            .define('#', Items.WATER_BUCKET)
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output);


        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_SINK_ITEM.get())
            .pattern("@#@")
            .pattern(" @ ")
            .pattern(" @ ")
            .define('@', PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get())
            .define('#', Items.WATER_BUCKET)
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output);
    }

    protected void buildPathRecipes() {

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_PATH_ITEM.get(), 16)
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "smoky_quartz_path_by_stonecutting");

        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SmokyQuartzList.SMOKY_QUARTZ_PATH_ITEM.get(), 8)
            .requires(SmokyQuartzList.SMOKY_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_smoky_quartz_slab", has(SmokyQuartzList.SMOKY_QUARTZ_SLAB_ITEM.get()))
            .save(this.output, "smoky_quartz_path_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_PATH_ITEM.get(), 16)
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "rose_quartz_path_by_stonecutting");

        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, RoseQuartzList.ROSE_QUARTZ_PATH_ITEM.get(), 8)
            .requires(RoseQuartzList.ROSE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_rose_quartz_slab", has(RoseQuartzList.ROSE_QUARTZ_SLAB_ITEM.get()))
            .save(this.output, "rose_quartz_path_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(CitrineList.CITRINE_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_PATH_ITEM.get(), 16)
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .save(this.output, "citrine_path_by_stonecutting");

        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, CitrineList.CITRINE_PATH_ITEM.get(), 8)
            .requires(CitrineList.CITRINE_SLAB_ITEM.get())
            .unlockedBy("has_citrine_slab", has(CitrineList.CITRINE_SLAB_ITEM.get()))
            .save(this.output, "citrine_path_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_PATH_ITEM.get(), 16)
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "blue_quartz_path_by_stonecutting");

        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, BlueQuartzList.BLUE_QUARTZ_PATH_ITEM.get(), 8)
            .requires(BlueQuartzList.BLUE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_blue_quartz_slab", has(BlueQuartzList.BLUE_QUARTZ_SLAB_ITEM.get()))
            .save(this.output, "blue_quartz_path_by_crafting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_PATH_ITEM.get(), 16)
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "prasiolite_quartz_path_by_stonecutting");

        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_PATH_ITEM.get(), 8)
            .requires(PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_slab", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB_ITEM.get()))
            .save(this.output, "prasiolite_quartz_path_by_crafting");
    }

    protected void buildStatueRecipes() {

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_SKULL_STATUETTE_ITEM.get())
            .unlockedBy("has_smoky_quartz_block", has(SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "smoky_quartz_skull_statuette_by_stonecutting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_SKULL_STATUETTE_ITEM.get())
            .unlockedBy("has_rose_quartz_block", has(RoseQuartzList.ROSE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "rose_quartz_skull_statuette_by_stonecutting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(CitrineList.CITRINE_BLOCK_ITEM.get()), RecipeCategory.DECORATIONS, CitrineList.CITRINE_SKULL_STATUETTE_ITEM.get())
            .unlockedBy("has_citrine_block", has(CitrineList.CITRINE_BLOCK_ITEM.get()))
            .save(this.output, "citrine_skull_statuette_by_stonecutting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_SKULL_STATUETTE_ITEM.get())
            .unlockedBy("has_blue_quartz_block", has(BlueQuartzList.BLUE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "blue_quartz_skull_statuette_by_stonecutting");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_SKULL_STATUETTE_ITEM.get())
            .unlockedBy("has_prasiolite_quartz_block", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK_ITEM.get()))
            .save(this.output, "prasiolite_quartz_skull_statuette_by_stonecutting");
    }

    protected void buildFlowerPotRecipes() {

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmokyQuartzList.SMOKY_QUARTZ_FLOWER_POT_ITEM.get())
            .pattern("! !")
            .pattern(" ! ")
            .define('!', SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_smoky_quartz_crystal", has(SmokyQuartzList.SMOKY_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, RoseQuartzList.ROSE_QUARTZ_FLOWER_POT_ITEM.get())
            .pattern("! !")
            .pattern(" ! ")
            .define('!', RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_rose_quartz_crystal", has(RoseQuartzList.ROSE_QUARTZ_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, CitrineList.CITRINE_FLOWER_POT_ITEM.get())
            .pattern("! !")
            .pattern(" ! ")
            .define('!', CitrineList.CITRINE_CRYSTAL.get())
            .unlockedBy("has_citrine_crystal", has(CitrineList.CITRINE_CRYSTAL.get()))
            .save(this.output);

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, BlueQuartzList.BLUE_QUARTZ_FLOWER_POT_ITEM.get())
            .pattern("! !")
            .pattern(" ! ")
            .define('!', BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_blue_quartz_crystal", has(BlueQuartzList.BLUE_QUARTZ_CRYSTAL.get()))
            .save(this.output);       

        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT_ITEM.get())
            .pattern("! !")
            .pattern(" ! ")
            .define('!', PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get())
            .unlockedBy("has_prasiolite_quartz_crystal", has(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CRYSTAL.get()))
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
