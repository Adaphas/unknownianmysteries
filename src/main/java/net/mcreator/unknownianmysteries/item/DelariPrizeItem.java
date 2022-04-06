
package net.mcreator.unknownianmysteries.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.unknownianmysteries.itemgroup.DelariItemsItemGroup;
import net.mcreator.unknownianmysteries.UnknownianmysteriesModElements;

import java.util.List;

@UnknownianmysteriesModElements.ModElement.Tag
public class DelariPrizeItem extends UnknownianmysteriesModElements.ModElement {
	@ObjectHolder("unknownianmysteries:delari_prize")
	public static final Item block = null;

	public DelariPrizeItem(UnknownianmysteriesModElements instance) {
		super(instance, 129);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(DelariItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("delari_prize");
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent(
					"You beat the Delari Maze and now your prize is here...if you don't receive your desired reward please use the Delari Workbench"));
		}
	}
}
