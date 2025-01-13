package com.thevibe.indiandeserts;

import com.thevibe.indiandeserts.item.ModItemGroups;
import com.thevibe.indiandeserts.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndianDeserts implements ModInitializer {
	public static final String MOD_ID = "indiandeserts";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();

	}
}