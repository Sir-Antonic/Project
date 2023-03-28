package com.antonic.ari;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.antonic.ari.item.ModItems;

public class AriMod implements ModInitializer {
	public static final String MOD_ID = "arimod";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
