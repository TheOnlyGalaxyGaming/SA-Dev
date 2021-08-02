package net.mcreator.rpg.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.rpg.SaModElements;
import net.mcreator.rpg.SaMod;

import java.util.Map;

@SaModElements.ModElement.Tag
public class StrengthStymFoodEatenProcedure extends SaModElements.ModElement {
	public StrengthStymFoodEatenProcedure(SaModElements instance) {
		super(instance, 150);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SaMod.LOGGER.warn("Failed to load dependency entity for procedure StrengthStymFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (true) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 45, (int) 4, (false), (false)));
		}
	}
}
