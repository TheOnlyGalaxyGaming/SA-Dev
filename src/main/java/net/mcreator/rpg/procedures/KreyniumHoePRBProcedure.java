package net.mcreator.rpg.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;

import net.mcreator.rpg.item.KreyniummHoeItem;
import net.mcreator.rpg.item.KreyniumPanelItem;
import net.mcreator.rpg.SaModVariables;
import net.mcreator.rpg.SaModElements;
import net.mcreator.rpg.SaMod;

import java.util.Map;

@SaModElements.ModElement.Tag
public class KreyniumHoePRBProcedure extends SaModElements.ModElement {
	public KreyniumHoePRBProcedure(SaModElements instance) {
		super(instance, 139);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SaMod.LOGGER.warn("Failed to load dependency entity for procedure KreyniumHoePRB!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				SaMod.LOGGER.warn("Failed to load dependency itemstack for procedure KreyniumHoePRB!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((((entity.getCapability(SaModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new SaModVariables.PlayerVariables())).pageNumber) == 12)) {
			{
				String _setval = (String) (new TranslationTextComponent("Kreynium Hoe").getString());
				entity.getCapability(SaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.recipeName = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				ItemStack _isc = (itemstack);
				final ItemStack _setstack = new ItemStack(Items.DIAMOND_HOE, (int) (1));
				final int _sltid = (int) (0);
				_setstack.setCount((int) 1);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = (itemstack);
				final ItemStack _setstack = new ItemStack(KreyniumPanelItem.block, (int) (1));
				final int _sltid = (int) (1);
				_setstack.setCount((int) 1);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = (itemstack);
				final ItemStack _setstack = new ItemStack(Items.WATER_BUCKET, (int) (1));
				final int _sltid = (int) (2);
				_setstack.setCount((int) 1);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = (itemstack);
				final ItemStack _setstack = new ItemStack(KreyniummHoeItem.block, (int) (1));
				final int _sltid = (int) (3);
				_setstack.setCount((int) 1);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = (itemstack);
				final ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
				final int _sltid = (int) (4);
				_setstack.setCount((int) 1);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
	}
}
