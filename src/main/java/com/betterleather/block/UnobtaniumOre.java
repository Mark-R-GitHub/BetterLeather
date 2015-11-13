package com.betterleather.block;

import java.util.Random;

import com.betterleather.common.BetterLeather;
import com.betterleather.init.LeatherItems;
import com.betterleather.item.MoltenFragment;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class UnobtaniumOre extends Block
{
	public UnobtaniumOre()
    {
		super(Material.rock);
		this.setResistance(3F);
		this.setHardness(4F);
		this.setLightLevel(0.4F);
		this.setCreativeTab(BetterLeather.BLTabMain);
	}
	
    public int quantityDropped(Random random)
    {
        return 1 + random.nextInt(2);
    }

	public Item getItemDropped(int metadata, Random random, int fortune)
    {
        return LeatherItems.unobtanium_chunk;
	}
}


