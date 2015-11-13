package com.betterleather.item.armor;

import java.util.List;

import com.betterleather.common.BetterLeather;

import com.betterleather.init.LeatherItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
 
public class ILArmor extends ItemArmor
{
    public ILArmor(ArmorMaterial material, int type, int render)
    {
        super(material, type, render);
        this.setCreativeTab(BetterLeather.BLTabMain);
}

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == LeatherItems.iron_leather_helmet || stack.getItem() == LeatherItems.iron_leather_chestplate || stack.getItem() == LeatherItems.iron_leather_boots)
        {
            return "BetterLeather:textures/models/armor/ILArmor_1.png";
        }
        if(stack.getItem() == LeatherItems.iron_leather_leggings)
        {
            return "BetterLeather:textures/models/armor/ILArmor_2.png";
        }
        else return null;
    }

    public void addInformation(ItemStack i, EntityPlayer p, List list, boolean b)
    {
        String COLOR = "\u00a77";

        list.add(COLOR + "Iron-bound Set");
    }
}
