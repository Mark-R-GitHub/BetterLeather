package com.betterleather.item;

import com.betterleather.common.BetterLeather;

import net.minecraft.item.ItemSpade;

public class ILShovel extends ItemSpade
{
	public ILShovel(ToolMaterial ILeather)
    {
		super(ILeather);
		setCreativeTab(BetterLeather.BLTabMain);
	}
}
