package com.betterleather.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.betterleather.common.BetterLeather;
import com.betterleather.creativetabs.BLTabMain;

public class JewelledStone extends Block
{
	public JewelledStone()
    {
		super(Material.rock);
		this.setResistance(3F);
		this.setHardness(4F);
		this.setLightLevel(0.4F);
		this.setCreativeTab(BetterLeather.BLTabMain);
	}
}