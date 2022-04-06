
package net.mcreator.unknownianmysteries.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import net.mcreator.unknownianmysteries.itemgroup.UnknownianMysteriesTabItemGroup;
import net.mcreator.unknownianmysteries.UnknownianmysteriesModElements;

@UnknownianmysteriesModElements.ModElement.Tag
public class UnknownianDisc6Item extends UnknownianmysteriesModElements.ModElement {
	@ObjectHolder("unknownianmysteries:unknownian_disc_6")
	public static final Item block = null;

	public UnknownianDisc6Item(UnknownianmysteriesModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, UnknownianmysteriesModElements.sounds.get(new ResourceLocation("unknownianmysteries:unknownianoverwrite")),
					new Item.Properties().group(UnknownianMysteriesTabItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("unknownian_disc_6");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
