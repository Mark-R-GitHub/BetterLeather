package com.betterleather.item;

import com.betterleather.common.BetterLeather;
import net.minecraft.item.ItemFood;

/**
 * Created by Mark_R on 31/08/2014.
 */
public class EnderSteak extends ItemFood
{
    public EnderSteak()
    {
        super(8, 2, true);
        this.setCreativeTab(BetterLeather.BLTabMain);
    }
}
