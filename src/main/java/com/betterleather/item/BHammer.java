package com.betterleather.item;

import com.betterleather.common.BetterLeather;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;

public class BHammer extends Item
{
    public BHammer()
    {
        super();
        setCreativeTab(BetterLeather.BLTabMain);
        setMaxStackSize(1);
        setMaxDamage(16);
        setHasSubtypes(true);
        setFull3D();
    }

    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
    {
        return false;
    }

    @Override
    public boolean getShareTag()
    {
        return true;
    }

    @Override
    public boolean hasContainerItem(ItemStack stack)
    {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack stack = itemStack.copy();

        stack.setItemDamage(stack.getItemDamage() + 1);
        stack.stackSize = 1;

        return stack;
    }
}