package com.betterleather.block;

import com.betterleather.common.BetterLeather;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MossyGravelBricks extends Block
{
	public MossyGravelBricks()
    {
		super(Material.rock);
		setHardness(5F);
		setCreativeTab(BetterLeather.BLTabMain);
	}
}
