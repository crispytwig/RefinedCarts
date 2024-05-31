package com.crispytwig.arr;

import com.crispytwig.arr.client.renderer.ReplacedAnimalCartRenderer;
import de.mennomax.astikorcarts.AstikorCarts;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib.GeckoLib;


@Mod(AstikorReduxRedux.MOD_ID)
public class AstikorReduxRedux {
	public static final String MOD_ID = "arr";

	public AstikorReduxRedux() {
		IEventBus eventBus = MinecraftForge.EVENT_BUS;

		GeckoLib.initialize();

		eventBus.register(this);
	}

}