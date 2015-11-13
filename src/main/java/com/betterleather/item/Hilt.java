package com.betterleather.item;

import java.util.List;

import com.betterleather.common.BetterLeather;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Hilt extends Item
{
	public Hilt()
    {
		this.setCreativeTab(BetterLeather.BLTabMain);
	}
	
	public void addInformation(ItemStack i, EntityPlayer p, List list, boolean b)
	{
		String COLOR = "\u00a77";
		
		list.add(COLOR + "Part of crafting a leather sword");
	}
}
