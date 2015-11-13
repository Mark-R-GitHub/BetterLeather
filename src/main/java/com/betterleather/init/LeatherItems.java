package com.betterleather.init;

import com.betterleather.item.*;
import com.betterleather.item.armor.BLArmor;
import com.betterleather.item.armor.EnderArmor;
import com.betterleather.item.armor.GLArmor;
import com.betterleather.item.armor.ILArmor;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class LeatherItems
{
    public static Item iron_bound_leather;
    public static Item gold_bound_leather;
    public static Item jewel_bound_leather;

    public static Item iron_binding;
    public static Item gold_binding;
    public static Item jewelled_binding;

    public static Item hammer;

    public static Item iron_leather_helmet;
    public static Item iron_leather_chestplate;
    public static Item iron_leather_leggings;
    public static Item iron_leather_boots;

    public static Item gold_leather_helmet;
    public static Item gold_leather_chestplate;
    public static Item gold_leather_leggings;
    public static Item gold_leather_boots;

    public static Item ender_leather_helmet;
    public static Item ender_leather_chestplate;
    public static Item ender_leather_leggings;
    public static Item ender_leather_boots;

    public static Item burning_leather_helmet;
    public static Item burning_leather_chestplate;
    public static Item burning_leather_leggings;
    public static Item burning_leather_boots;

    public static Item iron_leather_sword;
    public static Item iron_leather_pickaxe;
    public static Item iron_leather_axe;
    public static Item iron_leather_shovel;
    public static Item iron_leather_hoe;

    public static Item gold_leather_sword;
    public static Item gold_leather_pickaxe;
    public static Item gold_leather_axe;
    public static Item gold_leather_shovel;
    public static Item gold_leather_hoe;

    public static Item jewel_leather_sword;
    public static Item jewel_leather_pickaxe;
    public static Item jewel_leather_axe;
    public static Item jewel_leather_shovel;

    public static Item molten_fragment;
    public static Item unobtanium_chunk;
    public static Item hilt;
    public static Item mossy_flint;
    public static Item burning_leather;
    public static Item nether_steak;
    public static Item ender_leather;
    public static Item ender_steak;
    public static Item ender_beef;

    public static Item healing_amulet;


    public static void init()
    {
        iron_bound_leather = new IBLeather().setUnlocalizedName("IBLeather").setTextureName("BetterLeather:IBLeather");
        gold_bound_leather = new GBLeather().setUnlocalizedName("GBLeather").setTextureName("BetterLeather:GBLeather");
        jewel_bound_leather = new JBLeather().setUnlocalizedName("JBLeather").setTextureName("BetterLeather:JBLeather");

        hammer = new BHammer().setUnlocalizedName("BHammer").setTextureName("BetterLeather:BHammer");

        iron_binding = new IronBinding().setUnlocalizedName("IronBinding").setTextureName("BetterLeather:IronBinding");
        gold_binding = new GoldBinding().setUnlocalizedName("GoldBinding").setTextureName("BetterLeather:GoldBinding");
        jewelled_binding = new JewelledBinding().setUnlocalizedName("JewelledBinding").setTextureName("BetterLeather:JewelledBinding");

        molten_fragment = new MoltenFragment().setUnlocalizedName("MoltenFragment").setTextureName("BetterLeather:MoltenFragment");
        unobtanium_chunk = new UChunk().setUnlocalizedName("UChunk").setTextureName("BetterLeather:UChunk");
        hilt = new Hilt().setUnlocalizedName("Hilt").setTextureName("BetterLeather:Hilt");
        mossy_flint = new MossyFlint().setUnlocalizedName("MossyFlint").setTextureName("BetterLeather:MossyFlint");
        burning_leather = new BLeather().setUnlocalizedName("BLeather").setTextureName("BetterLeather:BLeather");
        nether_steak = new NetherSteak().setUnlocalizedName("NetherSteak").setTextureName("BetterLeather:NetherSteak");
        ender_leather = new EnderLeather().setUnlocalizedName("EnderLeather").setTextureName("BetterLeather:EnderLeather");
        ender_steak = new EnderSteak().setUnlocalizedName("EnderSteak").setTextureName("BetterLeather:EnderSteak");
        ender_beef = new EnderBeef().setUnlocalizedName("EnderBeef").setTextureName("BetterLeather:EnderBeef");

        healing_amulet = new HAmulet().setUnlocalizedName("HealingAmulet").setTextureName("BetterLeather:HAmulet");

        iron_leather_sword = new ILSword(LeatherMaterials.iron_leather).setUnlocalizedName("ILSword").setTextureName("BetterLeather:ILSword");
        iron_leather_pickaxe = new ILPickaxe(LeatherMaterials.iron_leather).setUnlocalizedName("ILPickaxe").setTextureName("BetterLeather:ILPickaxe");
        iron_leather_axe = new ILAxe(LeatherMaterials.iron_leather).setUnlocalizedName("ILAxe").setTextureName("BetterLeather:ILAxe");
        iron_leather_shovel = new ILShovel(LeatherMaterials.iron_leather).setUnlocalizedName("ILShovel").setTextureName("BetterLeather:ILShovel");
        iron_leather_hoe = new ILHoe(LeatherMaterials.iron_leather).setUnlocalizedName("ILHoe").setTextureName("BetterLeather:ILHoe");

        gold_leather_sword = new ILSword(LeatherMaterials.gold_leather).setUnlocalizedName("GLSword").setTextureName("BetterLeather:GLSword");
        gold_leather_pickaxe = new ILPickaxe(LeatherMaterials.gold_leather).setUnlocalizedName("GLPickaxe").setTextureName("BetterLeather:GLPickaxe");
        gold_leather_axe = new ILAxe(LeatherMaterials.gold_leather).setUnlocalizedName("GLAxe").setTextureName("BetterLeather:GLAxe");
        gold_leather_shovel = new ILShovel(LeatherMaterials.gold_leather).setUnlocalizedName("GLShovel").setTextureName("BetterLeather:GLShovel");
        gold_leather_hoe = new ILHoe(LeatherMaterials.gold_leather).setUnlocalizedName("GLHoe").setTextureName("BetterLeather:GLHoe");

        jewel_leather_sword = new ILSword(LeatherMaterials.jewel_leather).setUnlocalizedName("JLSword").setTextureName("BetterLeather:JLSword");
        jewel_leather_pickaxe = new ILPickaxe(LeatherMaterials.jewel_leather).setUnlocalizedName("JLPickaxe").setTextureName("BetterLeather:JLPickaxe");
        jewel_leather_axe = new ILAxe(LeatherMaterials.jewel_leather).setUnlocalizedName("JLAxe").setTextureName("BetterLeather:JLAxe");
        jewel_leather_shovel = new ILShovel(LeatherMaterials.jewel_leather).setUnlocalizedName("JLShovel").setTextureName("BetterLeather:JLShovel");

        iron_leather_helmet = new ILArmor(LeatherMaterials.am_iron_leather, 0, 0).setUnlocalizedName("ILHelmet").setTextureName("BetterLeather:ILHelmet");
        iron_leather_chestplate = new ILArmor(LeatherMaterials.am_iron_leather, 1, 1).setUnlocalizedName("ILChestplate").setTextureName("BetterLeather:ILChestplate");
        iron_leather_leggings = new ILArmor(LeatherMaterials.am_iron_leather, 2, 2).setUnlocalizedName("ILLeggings").setTextureName("BetterLeather:ILLeggings");
        iron_leather_boots = new ILArmor(LeatherMaterials.am_iron_leather, 3, 3).setUnlocalizedName("ILBoots").setTextureName("BetterLeather:ILBoots");

        gold_leather_helmet = new GLArmor(LeatherMaterials.am_gold_leather, 0, 0).setUnlocalizedName("GLHelmet").setTextureName("BetterLeather:GLHelmet");
        gold_leather_chestplate = new GLArmor(LeatherMaterials.am_gold_leather, 0, 1).setUnlocalizedName("GLChestplate").setTextureName("BetterLeather:GLChestplate");
        gold_leather_leggings = new GLArmor(LeatherMaterials.am_gold_leather, 0, 2).setUnlocalizedName("GLLeggings").setTextureName("BetterLeather:GLLeggings");
        gold_leather_boots = new GLArmor(LeatherMaterials.am_gold_leather, 0, 3).setUnlocalizedName("GLBoots").setTextureName("BetterLeather:GLBoots");

        ender_leather_helmet = new EnderArmor(LeatherMaterials.am_ender_leather, 0, 0).setUnlocalizedName("EnderHelmet").setTextureName("BetterLeather:EnderHelmet");
        ender_leather_chestplate = new EnderArmor(LeatherMaterials.am_ender_leather, 0, 1).setUnlocalizedName("EnderChestplate").setTextureName("BetterLeather:EnderChestplate");
        ender_leather_leggings = new EnderArmor(LeatherMaterials.am_ender_leather, 0, 2).setUnlocalizedName("EnderLeggings").setTextureName("BetterLeather:EnderLeggings");
        ender_leather_boots = new EnderArmor(LeatherMaterials.am_ender_leather, 0, 3).setUnlocalizedName("EnderBoots").setTextureName("BetterLeather:EnderBoots");

        burning_leather_helmet = new BLArmor(LeatherMaterials.am_burning_leather, 0, 0).setUnlocalizedName("BLHelmet").setTextureName("BetterLeather:BLHelmet");
        burning_leather_chestplate = new BLArmor(LeatherMaterials.am_burning_leather, 1, 1).setUnlocalizedName("BLChestplate").setTextureName("BetterLeather:BLChestplate");
        burning_leather_leggings = new BLArmor(LeatherMaterials.am_burning_leather, 2, 2).setUnlocalizedName("BLLeggings").setTextureName("BetterLeather:BLLeggings");
        burning_leather_boots = new BLArmor(LeatherMaterials.am_burning_leather, 3, 3).setUnlocalizedName("BLBoots").setTextureName("BetterLeather:BLBoots");

        GameRegistry.registerItem(iron_bound_leather, "IBLeather");
        GameRegistry.registerItem(gold_bound_leather, "GBLeather");
        GameRegistry.registerItem(jewel_bound_leather, "JBLeather");

        GameRegistry.registerItem(hammer, "BHammer");

        GameRegistry.registerItem(iron_binding, "IronBinding");
        GameRegistry.registerItem(gold_binding, "GoldBinding");
        GameRegistry.registerItem(jewelled_binding, "JewelledBinding");

        GameRegistry.registerItem(molten_fragment, "MoltenFragment");
        GameRegistry.registerItem(unobtanium_chunk, "UChunk");
        GameRegistry.registerItem(hilt, "Hilt");
        GameRegistry.registerItem(mossy_flint, "MossyFlint");
        GameRegistry.registerItem(burning_leather, "BLeather");
        GameRegistry.registerItem(nether_steak, "NetherSteak");
        GameRegistry.registerItem(ender_leather, "EnderLeather");
        GameRegistry.registerItem(ender_beef, "EnderBeef");
        GameRegistry.registerItem(ender_steak,"EnderSteak");

        GameRegistry.registerItem(healing_amulet, "HealingAmulet");

        GameRegistry.registerItem(iron_leather_sword, "ILSword");
        GameRegistry.registerItem(iron_leather_pickaxe, "ILPickaxe");
        GameRegistry.registerItem(iron_leather_shovel, "ILShovel");
        GameRegistry.registerItem(iron_leather_axe, "ILAxe");
        GameRegistry.registerItem(iron_leather_hoe, "ILHoe");

        GameRegistry.registerItem(iron_leather_helmet, "ILHelmet");
        GameRegistry.registerItem(iron_leather_chestplate, "ILChestplate");
        GameRegistry.registerItem(iron_leather_leggings, "ILLeggings");
        GameRegistry.registerItem(iron_leather_boots, "ILBoots");

        GameRegistry.registerItem(gold_leather_sword, "GLSword");
        GameRegistry.registerItem(gold_leather_pickaxe, "GLPickaxe");
        GameRegistry.registerItem(gold_leather_shovel, "GLShovel");
        GameRegistry.registerItem(gold_leather_axe, "GLAxe");
        GameRegistry.registerItem(gold_leather_hoe, "GLHoe");

        GameRegistry.registerItem(gold_leather_helmet, "GLHelmet");
        GameRegistry.registerItem(gold_leather_chestplate, "GLChestplate");
        GameRegistry.registerItem(gold_leather_leggings, "GLLeggings");
        GameRegistry.registerItem(gold_leather_boots, "GLBoots");

        GameRegistry.registerItem(jewel_leather_sword, "JLSword");
        GameRegistry.registerItem(jewel_leather_pickaxe, "JLPickaxe");
        GameRegistry.registerItem(jewel_leather_axe, "JLAxe");
        GameRegistry.registerItem(jewel_leather_shovel, "JBShovel");

        GameRegistry.registerItem(burning_leather_helmet, "BLHelmet");
        GameRegistry.registerItem(burning_leather_chestplate, "BLChestplate");
        GameRegistry.registerItem(burning_leather_leggings, "BLLeggings");
        GameRegistry.registerItem(burning_leather_boots, "BLBoots");

        GameRegistry.registerItem(ender_leather_helmet, "EnderHelmet");
        GameRegistry.registerItem(ender_leather_chestplate, "EnderChestplate");
        GameRegistry.registerItem(ender_leather_leggings, "EnderLeggings");
        GameRegistry.registerItem(ender_leather_boots, "EnderBoots");
    }
}
