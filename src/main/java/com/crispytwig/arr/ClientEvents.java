package com.crispytwig.arr;

import com.crispytwig.arr.client.renderer.ReplacedAnimalCartRenderer;
import de.mennomax.astikorcarts.AstikorCarts;
import de.mennomax.astikorcarts.entity.AnimalCartEntity;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AstikorReduxRedux.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(AstikorCarts.EntityTypes.ANIMAL_CART.get(), ReplacedAnimalCartRenderer::new);
    }
}
