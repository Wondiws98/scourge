package net.wondiws98.scourge.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.RegistryWrapper;
import net.wondiws98.scourge.registry.ScourgeTags;

import java.util.concurrent.CompletableFuture;

public class ScourgeEntityTagProvider extends FabricTagProvider.EntityTypeTagProvider {
    public ScourgeEntityTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ScourgeTags.SENSITIVE_TO_SCOURGE)
                .add(EntityType.BLAZE)
                .add(EntityType.SHULKER)
                .add(EntityType.CREEPER)
                .add(EntityType.SLIME)
                .add(EntityType.MAGMA_CUBE);
    }
}
