
package net.mcreator.rpg.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.rpg.itemgroup.SAItemsItemGroup;
import net.mcreator.rpg.SaModElements;

@SaModElements.ModElement.Tag
public class TomatoSeedsItem extends SaModElements.ModElement {
	@ObjectHolder("sa:tomato_seeds")
	public static final Item block = null;
	public TomatoSeedsItem(SaModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SAItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("tomato_seeds");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
