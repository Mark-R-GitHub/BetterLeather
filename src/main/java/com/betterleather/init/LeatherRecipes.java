package com.betterleather.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class LeatherRecipes
{
    public static void init()
    {
        GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(Items.leather), 5);
        GameRegistry.addSmelting(LeatherItems.ender_beef, new ItemStack(LeatherItems.ender_steak), 2.5f);

        GameRegistry.addRecipe(new ItemStack(LeatherItems.hammer, 1, 0), " IS", " SI", "S  ", 'S', new ItemStack(Items.stick, 1), 'I', new ItemStack(Items.iron_ingot, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.iron_binding, 4, 0), "IH", 'H', new ItemStack(LeatherItems.hammer, 1, OreDictionary.WILDCARD_VALUE), 'I', new ItemStack(Items.iron_ingot, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.gold_binding, 4, 0), "GH", 'H', new ItemStack(LeatherItems.hammer, 1, OreDictionary.WILDCARD_VALUE), 'G', new ItemStack(Items.gold_ingot, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.jewelled_binding, 4, 0), "DH", 'H', new ItemStack(LeatherItems.hammer, 1, OreDictionary.WILDCARD_VALUE), 'D', new ItemStack(Items.diamond, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.iron_bound_leather, 1, 0), "LH", "II", 'L', new ItemStack(Items.leather, 1), 'H', new ItemStack(LeatherItems.hammer, 1, OreDictionary.WILDCARD_VALUE), 'I', new ItemStack(LeatherItems.iron_binding));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.gold_bound_leather, 1, 0), "LH", "GG", 'L', new ItemStack(Items.leather, 1), 'H', new ItemStack(LeatherItems.hammer, 1, OreDictionary.WILDCARD_VALUE), 'G', new ItemStack(LeatherItems.gold_binding));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.jewel_bound_leather, 1, 0), "LH", "JJ", 'L', new ItemStack(Items.leather, 1), 'H', new ItemStack(LeatherItems.hammer, 1, OreDictionary.WILDCARD_VALUE), 'J', new ItemStack(LeatherItems.jewelled_binding));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.hilt, 1, 0), "L  ", "S  ", 'L', new ItemStack(Items.leather, 1), 'S', new ItemStack(Items.stick, 1));

        GameRegistry.addRecipe(new ItemStack(LeatherItems.iron_leather_sword, 1, 0), " L ", " L ", " H ", 'L', new ItemStack(LeatherItems.iron_bound_leather, 1), 'H', new ItemStack(LeatherItems.hilt, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.iron_leather_pickaxe, 1, 0), "LLL", " S ", " S ", 'L', new ItemStack(LeatherItems.iron_bound_leather, 1), 'S', new ItemStack(Items.stick, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.iron_leather_axe, 1, 0), "LL ", "LS ", " S ", 'L', new ItemStack(LeatherItems.iron_bound_leather, 1), 'S', new ItemStack(Items.stick, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.iron_leather_shovel, 1, 0), " L ", " S ", " S ", 'L', new ItemStack(LeatherItems.iron_bound_leather, 1), 'S', new ItemStack(Items.stick, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.iron_leather_hoe, 1, 0), "LL ", " S ", " S ", 'L', new ItemStack(LeatherItems.iron_bound_leather, 1), 'S', new ItemStack(Items.stick, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.iron_leather_helmet, 1), "LLL", "LIL", 'L', new ItemStack(LeatherItems.iron_bound_leather), 'I', new ItemStack(LeatherItems.iron_binding, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.iron_leather_chestplate, 1), "LIL", "LLL", "LLL", 'L', new ItemStack(LeatherItems.iron_bound_leather), 'I', new ItemStack(LeatherItems.iron_binding, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.iron_leather_leggings, 1), "LIL", "L L", "L L", 'L', new ItemStack(LeatherItems.iron_bound_leather), 'I', new ItemStack(LeatherItems.iron_binding, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.iron_leather_boots, 1), " I ", "L L", "L L", 'L', new ItemStack(LeatherItems.iron_bound_leather), 'I', new ItemStack(LeatherItems.iron_binding, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.gold_leather_sword, 1, 0), " L ", " L ", " H ", 'L', new ItemStack(LeatherItems.gold_bound_leather, 1), 'H', new ItemStack(LeatherItems.hilt, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.gold_leather_pickaxe, 1, 0), "LLL", " S ", " S ", 'L', new ItemStack(LeatherItems.gold_bound_leather, 1), 'S', new ItemStack(Items.stick, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.gold_leather_axe, 1, 0), "LL ", "LS ", " S ", 'L', new ItemStack(LeatherItems.gold_bound_leather, 1), 'S', new ItemStack(Items.stick, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.gold_leather_shovel, 1, 0), " L ", " S ", " S ", 'L', new ItemStack(LeatherItems.gold_bound_leather, 1), 'S', new ItemStack(Items.stick, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.gold_leather_hoe, 1, 0), "LL ", " S ", " S ", 'L', new ItemStack(LeatherItems.gold_bound_leather, 1), 'S', new ItemStack(Items.stick, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.gold_leather_helmet, 1), "LLL", "LIL", 'L', new ItemStack(LeatherItems.gold_bound_leather), 'I', new ItemStack(LeatherItems.gold_binding, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.gold_leather_chestplate, 1), "LIL", "LLL", "LLL", 'L', new ItemStack(LeatherItems.gold_bound_leather), 'I', new ItemStack(LeatherItems.gold_binding, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.gold_leather_leggings, 1), "LIL", "L L", "L L", 'L', new ItemStack(LeatherItems.gold_bound_leather), 'I', new ItemStack(LeatherItems.gold_binding, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.gold_leather_boots, 1), " I ", "L L", "L L", 'L', new ItemStack(LeatherItems.gold_bound_leather), 'I', new ItemStack(LeatherItems.gold_binding, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.jewel_leather_sword, 1, 0), " L ", " L ", " H ", 'L', new ItemStack(LeatherItems.jewel_bound_leather, 1), 'H', new ItemStack(LeatherItems.hilt, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.jewel_leather_pickaxe, 1, 0), "LLL", " S ", " S ", 'L', new ItemStack(LeatherItems.jewel_bound_leather, 1), 'S', new ItemStack(Items.stick, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.jewel_leather_axe, 1, 0), "LL ", "LS ", " S ", 'L', new ItemStack(LeatherItems.jewel_bound_leather, 1), 'S', new ItemStack(Items.stick, 1));
        GameRegistry.addRecipe(new ItemStack(LeatherItems.jewel_leather_shovel, 1, 0), " L ", " S ", " S ", 'L', new ItemStack(LeatherItems.jewel_bound_leather, 1), 'S', new ItemStack(Items.stick, 1));
    }
}
