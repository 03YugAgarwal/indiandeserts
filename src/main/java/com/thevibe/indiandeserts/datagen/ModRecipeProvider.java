package com.thevibe.indiandeserts.datagen;

import com.thevibe.indiandeserts.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.FRESH_MILK, 8)
                .input(Items.MILK_BUCKET)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                .offerTo(recipeExporter);


        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.SUGAR_CANE),RecipeCategory.FOOD, ModItems.JAGGERY, 0.25f, 200)
                .criterion(hasItem(Items.SUGAR_CANE), conditionsFromItem(Items.SUGAR_CANE))
                .offerTo(recipeExporter);

    }
}