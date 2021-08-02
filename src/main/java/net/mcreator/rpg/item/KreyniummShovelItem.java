
package net.mcreator.rpg.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.rpg.itemgroup.SAItemsItemGroup;
import net.mcreator.rpg.SaModElements;

@SaModElements.ModElement.Tag
public class KreyniummShovelItem extends SaModElements.ModElement {
	@ObjectHolder("sa:kreyniumm_shovel")
	public static final Item block = null;
	public KreyniummShovelItem(SaModElements instance) {
		super(instance, 133);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 2500;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 8;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PolishedKreyniumIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(SAItemsItemGroup.tab)) {
		}.setRegistryName("kreyniumm_shovel"));
	}
}
