
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
public class SlicedBreadItem extends SaModElements.ModElement {
	@ObjectHolder("sa:sliced_bread")
	public static final Item block = null;
	public SlicedBreadItem(SaModElements instance) {
		super(instance, 39);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(SAFoodItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(1).saturation(0.2f).build()));
			setRegistryName("sliced_bread");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 10;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
