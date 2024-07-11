package net.spiwu.cumod.block;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spiwu.cumod.CuMod;

public class ModBlocks {

    public static final Block CU_BLOCK = registerBlock("cu_block",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK).nonOpaque()));

    public static final Block CU_RAIL = registerBlock("cu_rail",
            new ModPoweredRailBlock(AbstractBlock.Settings.copy(Blocks.POWERED_RAIL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CuMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(CuMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CuMod.LOGGER.info("Registering mod blocks for " + CuMod.MOD_ID);
    }
}
