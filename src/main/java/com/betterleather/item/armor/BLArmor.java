package com.betterleather.item.armor;

import java.util.List;

import com.betterleather.common.BetterLeather;

import com.betterleather.init.LeatherItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BLArmor extends ItemArmor
{
    public BLArmor(ArmorMaterial material, int type, int render)
    {
        super(material, type, render);
        this.setCreativeTab(BetterLeather.BLTabMain);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == LeatherItems.burning_leather_helmet || stack.getItem() == LeatherItems.burning_leather_chestplate || stack.getItem() == LeatherItems.burning_leather_boots)
        {
            return "BetterLeather:textures/models/armor/BLArmor_1.png";
        }
        if(stack.getItem() == LeatherItems.burning_leather_leggings)
        {
            return "BetterLeather:textures/models/armor/BLArmor_2.png";
        }
        else return null;
    }

    public void addInformation(ItemStack i, EntityPlayer p, List list, boolean b)
    {
        String COLOR = "\u00a74";

        list.add(COLOR + "Burning Set");
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
        super.onArmorTick(world, player, itemStack);
        player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 40));
    }
}