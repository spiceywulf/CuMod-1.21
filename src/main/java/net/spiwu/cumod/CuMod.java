package net.spiwu.cumod;

import net.fabricmc.api.ModInitializer;

import net.spiwu.cumod.block.ModBlocks;
import net.spiwu.cumod.item.ModItemGroups;
import net.spiwu.cumod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CuMod implements ModInitializer {
	public static final String MOD_ID = "cumod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}