package net.oraclehisty.mod1;

import net.fabricmc.api.ModInitializer;
import net.oraclehisty.mod1.item.ModItems;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Mod1 implements ModInitializer {

	public static final String MOD_ID = "mod1";

	public static final Logger LOGGER = LogManager.getLogger("mod1");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();

		LOGGER.info("Histy's mod 1 Locked and Loaded");
	}
}
