package net.spiwu.cumod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.spiwu.cumod.block.ModBlocks;
import net.spiwu.cumod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerStraightRail(ModBlocks.CU_RAIL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CU_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CU_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CU_PICK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CU_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CU_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CU_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.CU_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.CU_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CU_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CU_BOOTS, Models.GENERATED);
    }
}
