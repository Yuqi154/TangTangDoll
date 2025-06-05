package org.hiedacamellia.tangtangdoll.data.provider;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import org.hiedacamellia.tangtangdoll.registries.TTDItem;

import java.util.concurrent.CompletableFuture;


public class TTDRecipeProvider extends RecipeProvider {
    public TTDRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        // Add your recipe here.
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,TTDItem.RANDOM)
                .pattern("###")
                .pattern("#x#")
                .pattern("###")
                .define('#', ItemTags.WOOL)
                .define('x', Items.DIAMOND)
                .unlockedBy("has_ender_pearl", has(Items.ENDER_PEARL))
                .save(output);
    }
}