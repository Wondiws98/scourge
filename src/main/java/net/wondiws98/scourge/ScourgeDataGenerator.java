package net.wondiws98.scourge;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.wondiws98.scourge.data.ScourgeEnglishLanguageProvider;
import net.wondiws98.scourge.data.ScourgeEntityTagProvider;

public class ScourgeDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ScourgeEnglishLanguageProvider::new);
		pack.addProvider(ScourgeEntityTagProvider::new);
	}
}
