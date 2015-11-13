package com.betterleather.item;

import com.betterleather.common.BetterLeather;
import net.minecraft.item.ItemFood;

/**
 * Created by Mark_R on 28/08/2014.
 */
public class NetherSteak extends ItemFood
{

    public NetherSteak()
    {
        super(5, 2, true);
        this.setCreativeTab(BetterLeather.BLTabMain);
    }
}
