package com.betterleather.block;

import java.util.Random;

import com.betterleather.common.BetterLeather;
import com.betterleather.init.LeatherItems;
import com.betterleather.item.MoltenFragment;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class MoltenOre extends Block
{
	public MoltenOre()
    {
		super(Material.rock);
		this.setResistance(3F);
		this.setHardness(4F);
		this.setLightLevel(0.7F);
		this.setCreativeTab(BetterLeather.BLTabMain);
	}
	
   public int quantityDropped(Random random)
    {
        return 2 + random.nextInt(3);
    }

	public Item getItemDropped(int metadata, Random random, int fortune)
    {
        return LeatherItems.molten_fragment;
	}
}


