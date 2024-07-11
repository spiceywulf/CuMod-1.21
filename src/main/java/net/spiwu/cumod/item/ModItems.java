package net.spiwu.cumod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spiwu.cumod.CuMod;
import net.spiwu.cumod.block.ModBlocks;

public class ModItems {

    public static final Item CU_PICK = registerItem("cu_pick", new PickaxeItem(ModToolMaterial.COPPER, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.COPPER, 1, -2.8f))));
    public static final Item CU_AXE = registerItem("cu_axe", new AxeItem(ModToolMaterial.COPPER, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterial.COPPER, 6, -3.1f))));
    public static final Item CU_SHOVEL = registerItem("cu_shovel", new ShovelItem(ModToolMaterial.COPPER, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterial.COPPER, 1.5f, -3f))));
    public static final Item CU_HOE = registerItem("cu_hoe", new HoeItem(ModToolMaterial.COPPER, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.COPPER, -2, -1f))));
    public static final Item CU_SWORD = registerItem("cu_sword", new SwordItem(ModToolMaterial.COPPER, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.COPPER, 3, -2.4f))));

    public static final Item CU_HELMET = registerItem("cu_helmet", new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.HELMET, new Item.Settings().maxCount(1)));
    public static final Item CU_CHESTPLATE = registerItem("cu_chestplate", new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxCount(1)));
    public static final Item CU_LEGGINGS = registerItem("cu_leggings", new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.LEGGINGS, new Item.Settings().maxCount(1)));
    public static final Item CU_BOOTS = registerItem("cu_boots", new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.BOOTS, new Item.Settings().maxCount(1)));

    private static void addItemsToRedstoneTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.CU_RAIL);
    }

    private static void addItemsToCombatTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(CU_SWORD);
        entries.add(CU_AXE);
        entries.add(CU_HELMET);
        entries.add(CU_CHESTPLATE);
        entries.add(CU_LEGGINGS);
        entries.add(CU_BOOTS);
    }

    private static void addItemsToToolsTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(CU_SHOVEL);
        entries.add(CU_PICK);
        entries.add(CU_AXE);
        entries.add(CU_HOE);

        entries.add(ModBlocks.CU_RAIL);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CuMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CuMod.LOGGER.info("Registering Mod Items for " + CuMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(ModItems::addItemsToRedstoneTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatTabItemGroup);
    }
}
