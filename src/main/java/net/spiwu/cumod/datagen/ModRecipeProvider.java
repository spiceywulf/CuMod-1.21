package net.spiwu.cumod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.spiwu.cumod.block.ModBlocks;
import net.spiwu.cumod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CU_PICK, 1)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.CU_PICK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CU_AXE, 1)
                .pattern("CC")
                .pattern("CS")
                .pattern(" S")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.CU_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CU_SHOVEL, 1)
                .pattern("C")
                .pattern("S")
                .pattern("S")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.CU_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CU_HOE, 1)
                .pattern("CC")
                .pattern(" S")
                .pattern(" S")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.CU_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CU_SWORD, 1)
                .pattern("C")
                .pattern("C")
                .pattern("S")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.CU_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CU_HELMET, 1)
                .pattern("CCC")
                .pattern("C C")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.CU_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CU_CHESTPLATE, 1)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.CU_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CU_LEGGINGS, 1)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.CU_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CU_BOOTS, 1)
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.CU_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CU_RAIL, 3)
                .pattern("C C")
                .pattern("CSC")
                .pattern("CRC")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .input('R', Items.REDSTONE)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.CU_RAIL)));




    }
}
