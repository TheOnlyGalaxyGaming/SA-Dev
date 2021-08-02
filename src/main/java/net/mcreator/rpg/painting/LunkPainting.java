
package net.mcreator.rpg.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.rpg.SaModElements;

@SaModElements.ModElement.Tag
public class LunkPainting extends SaModElements.ModElement {
	public LunkPainting(SaModElements instance) {
		super(instance, 46);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(16, 16).setRegistryName("lunk"));
	}
}
