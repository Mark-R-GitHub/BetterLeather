package com.betterleather.common;

import com.betterleather.entity.EntityEnderCow;
import com.betterleather.entity.EntityNetherCow;
import com.betterleather.render.RenderEnderCow;
import com.betterleather.render.RenderNetherCow;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelCow;

public class ClientProxy extends CommonProxy
{
	public void RenderInformation()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityNetherCow.class, new RenderNetherCow(new ModelCow(), 0.0625f ));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderCow.class, new RenderEnderCow(new ModelCow(), 0.0625f));
	}
	
}
