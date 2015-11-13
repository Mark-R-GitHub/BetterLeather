package com.betterleather.item;

import com.betterleather.common.BetterLeather;
import net.minecraft.item.ItemFood;

/**
 * Created by Mark_R on 31/08/2014.
 */
public class EnderBeef extends ItemFood
{
    public EnderBeef()
    {
        super(4, 2, true);
        this.setCreativeTab(BetterLeather.BLTabMain);
    }
}


