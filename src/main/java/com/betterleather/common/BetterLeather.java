package com.betterleather.common;

import com.betterleather.entity.EntityEnderCow;
import com.betterleather.entity.EntityNetherCow;
import com.betterleather.init.LeatherBlocks;
import com.betterleather.init.LeatherItems;
import com.betterleather.init.LeatherRecipes;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.MinecraftForge;

import com.betterleather.worldgen.OreGenerator;
import com.betterleather.creativetabs.BLTabMain;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "BetterLeather", name = "Better Leather", version = "1.9", useMetadata = true)
public class BetterLeather
{
	@SidedProxy(clientSide = "com.betterleather.common.ClientProxy", serverSide = "com.betterleather.common.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance("BetterLeather")
	public static BetterLeather instance;

	public static OreGenerator OreGen = new OreGenerator();

	public static CreativeTabs BLTabMain;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
    {
		BLTabMain = new BLTabMain(CreativeTabs.getNextID(), "BLTabMain");

		e.getModMetadata().name = "Better Leather";
		e.getModMetadata().authorList.add("FluidGaming");
		e.getModMetadata().authorList.add("tattyseal");
		e.getModMetadata().authorList.add("Fuzew");
		e.getModMetadata().version = "Version 1.9";
		e.getModMetadata().description = "Leather but better. \nFluidGaming : Code \nTattyseal : Textures & Code  \nFuzew : Textures";
		e.getModMetadata().logoFile = "/assets/betterleather/logo/logoFile.png";
		
		FMLCommonHandler.instance().bus().register(new Tick());
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e)
	{
        LeatherBlocks.init();
        LeatherItems.init();

        GameRegistry.registerWorldGenerator(OreGen, 1);

        int id = EntityRegistry.findGlobalUniqueEntityId();
        BiomeGenBase[] nether = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.NETHER);

        EntityRegistry.registerGlobalEntityID(EntityNetherCow.class, "NetherCow", id, 0x963430, 0xDB7D3E);
        EntityRegistry.registerModEntity(EntityNetherCow.class, "NetherCow", id, BetterLeather.instance, 64, 5, true);
        EntityRegistry.addSpawn(EntityNetherCow.class, 10, 8, 12, EnumCreatureType.creature, nether);

        int id2 = EntityRegistry.findGlobalUniqueEntityId();
        BiomeGenBase[] end = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.END);

        EntityRegistry.registerGlobalEntityID(EntityEnderCow.class, "EnderCow", id2 , 0x660066, 0x990099);
        EntityRegistry.registerModEntity(EntityEnderCow.class, "EnderCow", id2, BetterLeather.instance, 64, 5, true);
        EntityRegistry.addSpawn(EntityEnderCow.class, 10, 8, 12, EnumCreatureType.creature, end);

        proxy.RenderInformation();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
        LeatherRecipes.init();

        MinecraftForge.EVENT_BUS.register(new Tooltip());
	}
}
	
	

