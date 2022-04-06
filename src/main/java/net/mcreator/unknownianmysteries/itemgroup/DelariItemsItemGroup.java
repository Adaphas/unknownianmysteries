
package net.mcreator.unknownianmysteries.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.unknownianmysteries.item.DelariPrizeItem;
import net.mcreator.unknownianmysteries.UnknownianmysteriesModElements;

@UnknownianmysteriesModElements.ModElement.Tag
public class DelariItemsItemGroup extends UnknownianmysteriesModElements.ModElement {
	public DelariItemsItemGroup(UnknownianmysteriesModElements instance) {
		super(instance, 133);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdelari_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DelariPrizeItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
