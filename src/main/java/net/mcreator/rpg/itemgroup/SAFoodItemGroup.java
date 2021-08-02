
package net.mcreator.rpg.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.rpg.item.BlockofCheeseItem;
import net.mcreator.rpg.SaModElements;

@SaModElements.ModElement.Tag
public class SAFoodItemGroup extends SaModElements.ModElement {
	public SAFoodItemGroup(SaModElements instance) {
		super(instance, 115);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsa_food") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BlockofCheeseItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
