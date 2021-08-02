
package net.mcreator.rpg.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.rpg.itemgroup.SAFoodItemGroup;
import net.mcreator.rpg.SaModElements;

import java.util.List;

@SaModElements.ModElement.Tag
public class ChickenSandwich7Item extends SaModElements.ModElement {
	@ObjectHolder("sa:chicken_sandwich_7")
	public static final Item block = null;
	public ChickenSandwich7Item(SaModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(SAFoodItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(8).saturation(0.7999999999999999f).build()));
			setRegistryName("chicken_sandwich_7");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 41;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("With"));
			list.add(new StringTextComponent("Cheese"));
			list.add(new StringTextComponent("Tomato"));
		}
	}
}
