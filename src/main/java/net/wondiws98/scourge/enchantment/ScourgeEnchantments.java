package net.wondiws98.scourge.enchantment;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.wondiws98.scourge.ScourgeMain;
import net.wondiws98.scourge.registry.ScourgeTags;

import java.util.Optional;


public class ScourgeEnchantments {
    public static final Enchantment SCOURGE = register("scourge", new DamageEnchantment(Enchantment.properties(ItemTags.WEAPON_ENCHANTABLE, ItemTags.SWORD_ENCHANTABLE, 5, 5, Enchantment.leveledCost(5, 8), Enchantment.leveledCost(25, 8), 2, EquipmentSlot.MAINHAND), Optional.of(ScourgeTags.SENSITIVE_TO_SCOURGE)));

    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(ScourgeMain.MOD_ID, name), enchantment);
    }

    public static void registerScourgeEnchantments() {
    }
}
