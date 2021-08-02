package net.mcreator.rpg.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.rpg.SaModVariables;
import net.mcreator.rpg.SaModElements;
import net.mcreator.rpg.SaMod;

import java.util.Map;

@SaModElements.ModElement.Tag
public class PressRecipeBookLastPageProcedure extends SaModElements.ModElement {
	public PressRecipeBookLastPageProcedure(SaModElements instance) {
		super(instance, 104);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SaMod.LOGGER.warn("Failed to load dependency entity for procedure PressRecipeBookLastPage!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getCapability(SaModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new SaModVariables.PlayerVariables())).pageNumber) <= 12)) {
			{
				double _setval = (double) (((entity.getCapability(SaModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SaModVariables.PlayerVariables())).pageNumber) - 1);
				entity.getCapability(SaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageNumber = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
