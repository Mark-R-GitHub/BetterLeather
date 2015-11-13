package com.betterleather.item;

import com.betterleather.common.BetterLeather;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class ILHoe extends ItemHoe
{
	public ILHoe(ToolMaterial ILeather)
    {
		super(ILeather);
		setCreativeTab(BetterLeather.BLTabMain);
	}
}

