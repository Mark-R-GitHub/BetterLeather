package com.betterleather.item;

import com.betterleather.common.BetterLeather;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

/**
 * Created by Mark on 14/09/2014.
 */

public class HAmulet extends Item
{
    public HAmulet()
    {
        super();
        setCreativeTab(BetterLeather.BLTabMain);
        setMaxDamage(10);
        setHasSubtypes(true);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        if(this.getMovingObjectPositionFromPlayer(world, player, true) != null && this.getMovingObjectPositionFromPlayer(world, player, true).typeOfHit != MovingObjectPosition.MovingObjectType.ENTITY)
        {
            player.setHealth(player.getMaxHealth());
            stack.setItemDamage(stack.getItemDamage() + 1);
        }
        return stack;
    }
}
