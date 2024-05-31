package com.crispytwig.arr.events;

import com.crispytwig.arr.AstikorReduxRedux;
import com.crispytwig.arr.client.renderer.ReplacedAnimalCartRenderer;
import de.mennomax.astikorcarts.AstikorCarts;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = AstikorReduxRedux.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(AstikorCarts.EntityTypes.ANIMAL_CART.get(), ReplacedAnimalCartRenderer::new);
    }

}
