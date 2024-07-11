package net.spiwu.cumod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.spiwu.cumod.CuMod;
import net.spiwu.cumod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup CU_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CuMod.MOD_ID, "cumod"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cu"))
                    .icon(() -> new ItemStack(Items.COPPER_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CU_SHOVEL);
                        entries.add(ModItems.CU_PICK);
                        entries.add(ModItems.CU_AXE);
                        entries.add(ModItems.CU_HOE);
                        entries.add(ModItems.CU_SWORD);

                        entries.add(ModItems.CU_HELMET);
                        entries.add(ModItems.CU_CHESTPLATE);
                        entries.add(ModItems.CU_LEGGINGS);
                        entries.add(ModItems.CU_BOOTS);

                        entries.add(ModBlocks.CU_RAIL);

                        entries.add(ModBlocks.CU_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        CuMod.LOGGER.info("Registering Item Groups for " + CuMod.MOD_ID);
    }
}
