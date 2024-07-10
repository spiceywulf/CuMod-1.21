package net.spiwu.cumod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spiwu.cumod.CuMod;

public class ModItems {

    public static final Item CU_RAIL = registerItem("cu_rail", new Item(new Item.Settings()));
    public static final Item CU_PICK = registerItem("cu_pick", new Item(new Item.Settings()));
    public static final Item CU_AXE = registerItem("cu_axe", new Item(new Item.Settings()));
    public static final Item CU_SHOVEL = registerItem("cu_shovel", new Item(new Item.Settings()));
    public static final Item CU_HOE = registerItem("cu_hoe", new Item(new Item.Settings()));

    private static void addItemsToRedstoneTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(CU_RAIL);
    }

    private static void addItemsToToolsTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(CU_SHOVEL);
        entries.add(CU_PICK);
        entries.add(CU_AXE);
        entries.add(CU_HOE);
        entries.add(CU_RAIL);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CuMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CuMod.LOGGER.info("Registering Mod Items for " + CuMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(ModItems::addItemsToRedstoneTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsTabItemGroup);
    }
}
