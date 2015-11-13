package com.betterleather.item;

import com.betterleather.common.BetterLeather;

import net.minecraft.item.ItemPickaxe;

public class ILPickaxe extends ItemPickaxe
{
	public ILPickaxe(ToolMaterial ILeather)
    {
		super(ILeather);
		setCreativeTab(BetterLeather.BLTabMain);
	}
}
