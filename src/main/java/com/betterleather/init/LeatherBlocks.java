package com.betterleather.init;

import com.betterleather.block.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LeatherBlocks
{
    public static Block molten_ore;
    public static Block unobtainium_ore;
    public static Block mossy_gravel;
    public static Block mossy_gravel_bricks;

    public static void init()
    {
        molten_ore = new MoltenOre().setBlockName("MoltenOre").setBlockTextureName("BetterLeather:MoltenOre");
        unobtainium_ore = new UnobtaniumOre().setBlockName("UOre").setBlockTextureName("BetterLeather:UOre");
        mossy_gravel = new MossyGravel().setBlockName("MossyGravel").setBlockTextureName("BetterLeather:MossyGravel");
        mossy_gravel_bricks = new MossyGravelBricks().setBlockName("MossyGravelBricks").setBlockTextureName("BetterLeather:MossyGravelBricks");

        GameRegistry.registerBlock(molten_ore, "MoltenOre");
        GameRegistry.registerBlock(unobtainium_ore, "UOre");
        GameRegistry.registerBlock(mossy_gravel, "MossyGravel");
        GameRegistry.registerBlock(mossy_gravel_bricks, "MossyGravelBricks");
    }
}
