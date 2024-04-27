package net.wondiws98.scourge.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.wondiws98.scourge.enchantment.ScourgeEnchantments;

import java.util.concurrent.CompletableFuture;

public class ScourgeEnglishLanguageProvider extends FabricLanguageProvider {

    public ScourgeEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ScourgeEnchantments.SCOURGE, "Scourge");
    }
}
