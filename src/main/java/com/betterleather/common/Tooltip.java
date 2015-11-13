package com.betterleather.common;


import com.betterleather.init.LeatherBlocks;
import com.betterleather.init.LeatherItems;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class Tooltip
{
	@SubscribeEvent
	public void tooltip(ItemTooltipEvent e)
	{
		ItemStack item = e.itemStack;

        if(false == true)
        {
            e.toolTip.add("\u00a76" + LanguageRegistry.instance().getStringLocalization("40228e60678619b007cdee67a42ef26e"));
        }

        if(item.getItem() == LeatherItems.nether_steak || item.getItem() == LeatherItems.burning_leather || item.getItem() == LeatherItems.burning_leather_boots || item.getItem() == LeatherItems.burning_leather_chestplate || item.getItem() == LeatherItems.burning_leather_helmet || item.getItem() == LeatherItems.burning_leather_leggings)
        {
            e.toolTip.add("\u00a7c" + LanguageRegistry.instance().getStringLocalization("e781dfef9074bcf44828e2bc80158300"));
        }

        if(item.getItem() == LeatherItems.ender_leather)
        {
            e.toolTip.add("\u00a75" + LanguageRegistry.instance().getStringLocalization("741c0de20e568dd099cb2f5b6747dbdd"));
        }

        if(item.getItem() == LeatherItems.ender_steak)
        {
            e.toolTip.add("\u00a75" + LanguageRegistry.instance().getStringLocalization("741c0de20e568dd099cb2f5b6747dbdd"));
        }

        if(item.getItem() == LeatherItems.ender_beef)
        {
            e.toolTip.add("\u00a75" + LanguageRegistry.instance().getStringLocalization("741c0de20e568dd099cb2f5b6747dbdd"));
        }

		if(item.getItem() == (LeatherItems.gold_leather_sword))
		{
			e.toolTip.add("\u00a76" + "Gold-Bound Set");
		}
		
		if(item.getItem() == (LeatherItems.iron_leather_sword))
		{
			e.toolTip.add("\u00a77" + "Iron-Bound Set");
		}
		
		if(item.getItem() == (LeatherItems.jewel_leather_sword))
		{
			e.toolTip.add("\u00a7b" + "Jewelled Set");
		}
		
		if(item.getItem() == (LeatherItems.gold_leather_pickaxe))
		{
			e.toolTip.add("\u00a76" + "Gold-Bound Set");
		}
		
		if(item.getItem() == (LeatherItems.iron_leather_pickaxe))
		{
			e.toolTip.add("\u00a77" + "Iron-Bound Set");
		}
		
		if(item.getItem() == (LeatherItems.jewel_leather_pickaxe))
		{
			e.toolTip.add("\u00a7b" + "Jewelled Set");
		}
		
		if(item.getItem() == (LeatherItems.gold_leather_axe))
		{
			e.toolTip.add("\u00a76" + "Gold-Bound Set");
		}
		
		if(item.getItem() == (LeatherItems.iron_leather_axe))
		{
			e.toolTip.add("\u00a77" + "Iron-Bound Set");
		}
		
		if(item.getItem() == (LeatherItems.jewel_leather_axe))
		{
			e.toolTip.add("\u00a7b" + "Jewelled Set");
		}
		
		if(item.getItem() == (LeatherItems.gold_leather_shovel))
		{
			e.toolTip.add("\u00a76" + "Gold-Bound Set");
		}
		
		if(item.getItem() == (LeatherItems.iron_leather_shovel))
		{
			e.toolTip.add("\u00a77" + "Iron-Bound Set");
		}
		
		if(item.getItem() == (LeatherItems.jewel_leather_shovel))
		{
			e.toolTip.add("\u00a7b" + "Jewelled Set");
		}
		
		if(item.getItem() == (LeatherItems.gold_leather_hoe))
		{
			e.toolTip.add("\u00a76" + "Gold-Bound Set");
		}
		
		if(item.getItem() == (LeatherItems.iron_leather_hoe))
		{
			e.toolTip.add("\u00a77" + "Iron-Bound Set");
		}
		
		if(item.getItem() == (ItemBlock.getItemFromBlock(LeatherBlocks.jewelled_stone)))
		{
			e.toolTip.add("\u00a7b" + "Shiny!");
		}

        if(item.getItem() == (LeatherItems.burning_leather))
        {
           e.toolTip.add("\u00a74" + "HOT TO THE TOUCH!");
        }

	}
}
