package com.betterleather.item.armor;

import com.betterleather.common.BetterLeather;
import com.betterleather.init.LeatherItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

public class EnderArmor extends ItemArmor
{
    public EnderArmor(ArmorMaterial material, int type, int render)
    {
        super(material, type, render);
        this.setCreativeTab(BetterLeather.BLTabMain);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == LeatherItems.ender_leather_leggings)
        {
            return "BetterLeather:textures/models/armor/EnderArmor_2.png";
        }

        return "BetterLeather:textures/models/armor/EnderArmor_1.png";
    }

    public void addInformation(ItemStack i, EntityPlayer p, List list, boolean b)
    {
        String COLOR = EnumChatFormatting.DARK_GREEN + "";

        list.add(COLOR + "Ender Set");
    }
}
