package com.betterleather.entity;

import com.betterleather.init.LeatherItems;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Mark_R on 31/08/2014.
 */
public class EntityEnderCow extends EntityCow
{
    public EntityEnderCow(World world)
    {
        super(world);
    }

    public EntityCow createChild(EntityAgeable entity)
    {
        return new EntityEnderCow(this.worldObj);
    }

    protected Item getDropItem()
    {
        return LeatherItems.ender_leather;
    }

    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        int j = this.rand.nextInt(3) + this.rand.nextInt(1 + p_70628_2_);
        int k;

        for (k = 0; k < j; ++k)
        {
            this.dropItem(LeatherItems.ender_leather, 1);
        }

        j = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + p_70628_2_);

        for (k = 0; k < j; ++k)
        {
            if (this.isBurning())
            {
                this.dropItem(LeatherItems.ender_steak, 1);
            }
            else
            {
                this.dropItem(LeatherItems.ender_beef, 1);
            }
        }
    }

    @Override
    public boolean getCanSpawnHere() {
        return true;
    }

    public boolean interact(EntityPlayer player)
    {
        ItemStack itemstack = player.inventory.getCurrentItem();

        if(!Loader.isModLoaded("ThermalFoundation")) return super.interact(player);

        if (itemstack != null && itemstack.getItem() == Items.bucket)
        {
            if (itemstack.stackSize-- == 1)
            {
                player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(GameRegistry.findItem("ThermalFoundation", "bucket"), 1, 2));
            }
            else if (!player.inventory.addItemStackToInventory(new ItemStack(GameRegistry.findItem("ThermalFoundation", "bucket"), 1, 2)))
            {
                player.dropPlayerItemWithRandomChoice(new ItemStack(GameRegistry.findItem("ThermalFoundation", "bucket"), 1, 2), true);
            }

            return true;
        }
        else
        {
            return super.interact(player);
        }
    }
}


