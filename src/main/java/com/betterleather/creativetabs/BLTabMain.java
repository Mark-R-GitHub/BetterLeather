package com.betterleather.creativetabs;
 
import com.betterleather.common.BetterLeather;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
 
public class BLTabMain extends CreativeTabs
{
    public BLTabMain(int id, String name)
    {
        super(id, name);
    }

    @Override
    public Item getTabIconItem()
    {
        return Items.leather;
    }
}