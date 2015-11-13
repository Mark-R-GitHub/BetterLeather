package com.betterleather.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.betterleather.common.BetterLeather;

public class Jewel extends Item
{
	public Jewel()
    {
		this.setCreativeTab(BetterLeather.BLTabMain);
	}
	
	public void addInformation(ItemStack i, EntityPlayer p, List list, boolean b)
	{
		String COLOR = "\u00a77";
		String COLOR1 ="\u00a77";
		
		list.add(COLOR + "Good for tools, but not for armour.");
		
		COLOR = "\u00a7b";
		
		
		list.add(COLOR + "Shiny, too!");
	}
}
