package com.betterleather.block;

import java.util.Random;

import com.betterleather.common.BetterLeather;

import com.betterleather.init.LeatherItems;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class MossyGravel extends BlockFalling
{
	public MossyGravel()
    {
		super(Material.ground);
		setCreativeTab(BetterLeather.BLTabMain);
		this.setResistance(3F);
		this.setHardness(4F);
		this.setLightLevel(0F);
		this.setHarvestLevel("shovel", 0);
	}

	public Item getItemDropped(int i, Random random, int j)
    {
        if (j > 3)
        {
            j = 3;
        }

        return random.nextInt(10 - j * 3) == 0 ? LeatherItems.mossy_flint : Item.getItemFromBlock(this);
    }
}

