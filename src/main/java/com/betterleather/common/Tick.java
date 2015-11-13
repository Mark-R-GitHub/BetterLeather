package com.betterleather.common;


import com.betterleather.init.LeatherItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.world.World;

public class Tick
{
    @SubscribeEvent
    public void burning_armor(TickEvent.PlayerTickEvent event)
    {
        EntityPlayer player = event.player;

        if (player.inventory.armorInventory[0] != null && player.inventory.armorInventory[1] != null && player.inventory.armorInventory[2] != null && player.inventory.armorInventory[3] != null)
        {
            if (player.inventory.armorInventory[0].getItem().equals(LeatherItems.burning_leather_helmet) && player.inventory.armorInventory[1].getItem().equals(LeatherItems.burning_leather_chestplate) && player.inventory.armorInventory[2].getItem().equals(LeatherItems.burning_leather_leggings) && player.inventory.armorInventory[3].getItem().equals(LeatherItems.burning_leather_boots)) {
                player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 2));
            } else {

            }
        }
    }
}