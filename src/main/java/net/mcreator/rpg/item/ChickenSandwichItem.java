
package net.mcreator.rpg.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.rpg.itemgroup.SAFoodItemGroup;
import net.mcreator.rpg.SaModElements;

@SaModElements.ModElement.Tag
public class ChickenSandwichItem extends SaModElements.ModElement {
	@ObjectHolder("sa:chicken_sandwich")
	public static final Item block = null;
	public ChickenSandwichItem(SaModElements instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(SAFoodItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(6).saturation(0.7f).build()));
			setRegistryName("chicken_sandwich");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 38;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
