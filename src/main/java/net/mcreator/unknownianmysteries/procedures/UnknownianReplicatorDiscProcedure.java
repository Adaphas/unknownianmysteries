package net.mcreator.unknownianmysteries.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.unknownianmysteries.block.UnknownianBlockOfMysteryBlock;
import net.mcreator.unknownianmysteries.UnknownianmysteriesMod;

import java.util.function.Supplier;
import java.util.Map;

public class UnknownianReplicatorDiscProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency entity for procedure UnknownianReplicatorDisc!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (0)) == 1) {
			if (entity instanceof PlayerEntity) {
				Container _current = ((PlayerEntity) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(UnknownianBlockOfMysteryBlock.block);
						_setstack.setCount((int) 1);
						((Slot) ((Map) invobj).get((int) (9))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
		}
	}
}
