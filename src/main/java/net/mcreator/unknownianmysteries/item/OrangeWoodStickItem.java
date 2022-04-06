
package net.mcreator.unknownianmysteries.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.unknownianmysteries.itemgroup.UnknownianMysteriesTabItemGroup;
import net.mcreator.unknownianmysteries.UnknownianmysteriesModElements;

@UnknownianmysteriesModElements.ModElement.Tag
public class OrangeWoodStickItem extends UnknownianmysteriesModElements.ModElement {
	@ObjectHolder("unknownianmysteries:orange_wood_stick")
	public static final Item block = null;

	public OrangeWoodStickItem(UnknownianmysteriesModElements instance) {
		super(instance, 157);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(UnknownianMysteriesTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("orange_wood_stick");
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
