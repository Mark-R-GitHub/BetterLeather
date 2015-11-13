package com.betterleather.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderCow;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Mark_R on 26/08/2014.
 */
public class RenderEnderCow extends RenderCow {

    public static ResourceLocation texture;

    public RenderEnderCow(ModelBase mb, float j) {
        super(mb, j);
        texture = new ResourceLocation("betterleather", "textures/entity/ender_cow.png");
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityCow entity) {
        return texture;
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return texture;
    }
}
