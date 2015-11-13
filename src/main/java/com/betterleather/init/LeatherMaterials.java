package com.betterleather.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class LeatherMaterials
{
    public static Item.ToolMaterial iron_leather = EnumHelper.addToolMaterial("ILeather", 2, 338, 4F, 5F, 30);
    public static ItemArmor.ArmorMaterial am_iron_leather = EnumHelper.addArmorMaterial("AMILeather", 6, new int[]{4,6,6,3}, 30);

    public static Item.ToolMaterial gold_leather = EnumHelper.addToolMaterial("GLeather", 0, 121, 10F, 8F, 30);
    public static ItemArmor.ArmorMaterial am_gold_leather = EnumHelper.addArmorMaterial("AMGLeather", 9, new int[]{5,6,3,4}, 30);

    public static Item.ToolMaterial jewel_leather = EnumHelper.addToolMaterial("JLeather", 4, 1650, 10F, 14F, 30);
    
    public static Item.ToolMaterial burning_leather = EnumHelper.addToolMaterial("BLeather", 1, 725, 3F, 6, 30);
    public static ItemArmor.ArmorMaterial am_burning_leather = EnumHelper.addArmorMaterial("AMBLeather", 5, new int[]{3,5,5,2}, 30);
    public static ItemArmor.ArmorMaterial am_ender_leather = EnumHelper.addArmorMaterial("AMEnder", 1000, new int[]{5, 8, 8, 5}, 30);

    public static ItemArmor.ArmorMaterial am_gloves = EnumHelper.addArmorMaterial("AMGloves", 2, new int[]{0,2,0,0}, 0);
}
