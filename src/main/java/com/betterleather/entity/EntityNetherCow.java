package com.betterleather.entity;

import com.betterleather.common.BetterLeather;
import com.betterleather.init.LeatherItems;
import com.betterleather.item.BLeather;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Created by Mark_R on 26/08/2014.
 */
public class EntityNetherCow extends EntityCow
{
    public EntityNetherCow(World world)
    {
        super(world);
        this.isImmuneToFire = true;
    }

    public EntityCow createChild(EntityAgeable entity)
    {
        return new EntityNetherCow(this.worldObj);
    }

    protected Item getDropItem()
    {
        return LeatherItems.burning_leather;
    }

    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        int j = this.rand.nextInt(3) + this.rand.nextInt(1 + p_70628_2_);
        int k;

        for (k = 0; k < j; ++k)
        {
            this.dropItem(LeatherItems.burning_leather, 1);
        }

        j = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + p_70628_2_);

        for (k = 0; k < j; ++k)
        {
            if (!this.isBurning())
            {
                this.dropItem(LeatherItems.nether_steak, 1);
            }
            else
            {

            }
        }
    }

    public boolean interact(EntityPlayer p_70085_1_)
    {
        ItemStack itemstack = p_70085_1_.inventory.getCurrentItem();

        if (itemstack != null && itemstack.getItem() == Items.bucket)
        {
            if (itemstack.stackSize-- == 1)
            {
                p_70085_1_.inventory.setInventorySlotContents(p_70085_1_.inventory.currentItem, new ItemStack(Items.lava_bucket));
            }
            else if (!p_70085_1_.inventory.addItemStackToInventory(new ItemStack(Items.lava_bucket)))
            {
                p_70085_1_.dropPlayerItemWithRandomChoice(new ItemStack(Items.lava_bucket, 1, 0), false);
            }

            return true;
        }
        else
        {
            return super.interact(p_70085_1_);
        }
    }

    @Override
    public boolean getCanSpawnHere() {
        return true;
    }
}
