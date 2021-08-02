
package net.mcreator.rpg.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.rpg.itemgroup.SAItemsItemGroup;
import net.mcreator.rpg.SaModElements;

@SaModElements.ModElement.Tag
public class KreyniummSwordItem extends SaModElements.ModElement {
	@ObjectHolder("sa:kreyniumm_sword")
	public static final Item block = null;
	public KreyniummSwordItem(SaModElements instance) {
		super(instance, 132);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2500;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 6.5f;
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
		}, 3, -3f, new Item.Properties().group(SAItemsItemGroup.tab)) {
		}.setRegistryName("kreyniumm_sword"));
	}
}
