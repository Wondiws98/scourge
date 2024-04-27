package net.wondiws98.scourge.registry;

import net.minecraft.entity.EntityType;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.wondiws98.scourge.ScourgeMain;

public class ScourgeTags {
    public static final TagKey<EntityType<?>> SENSITIVE_TO_SCOURGE = ScourgeTags.of("sensitive_to_scourge");

    private static TagKey<EntityType<?>> of(String id) {
        return TagKey.of(RegistryKeys.ENTITY_TYPE, new Identifier(ScourgeMain.MOD_ID, id));
    }
}
