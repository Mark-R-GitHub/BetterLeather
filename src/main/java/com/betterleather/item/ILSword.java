package com.betterleather.item;

import com.betterleather.common.BetterLeather;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ILSword extends ItemSword
{
	public ILSword(ToolMaterial ILeather)
    {
		super(ILeather);
		setCreativeTab(BetterLeather.BLTabMain);
	}
}
