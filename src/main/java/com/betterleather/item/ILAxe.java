package com.betterleather.item;

import com.betterleather.common.BetterLeather;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ILAxe extends ItemAxe
{
	public ILAxe(ToolMaterial ILeather)
    {
		super(ILeather);
		setCreativeTab(BetterLeather.BLTabMain);
	}
}
