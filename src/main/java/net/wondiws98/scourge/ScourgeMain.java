package net.wondiws98.scourge;

import net.fabricmc.api.ModInitializer;

import net.wondiws98.scourge.enchantment.ScourgeEnchantments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScourgeMain implements ModInitializer {
	public static final String MOD_ID = "scourge";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ScourgeEnchantments.registerScourgeEnchantments();
		LOGGER.info("Scourge in!");
	}
}