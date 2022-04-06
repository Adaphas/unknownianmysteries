package net.mcreator.unknownianmysteries.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.unknownianmysteries.item.UnknownianPowerCoreItem;
import net.mcreator.unknownianmysteries.UnknownianmysteriesMod;

import java.util.Map;

public class UnGravitizerUseProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency entity for procedure UnGravitizerUse!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		boolean removedantigrav = false;
		removedantigrav = (true);
		if ((entity instanceof LivingEntity) ? (entity.hasNoGravity()) : false) {
			removedantigrav = (false);
			entity.setNoGravity((false));
		}
		if (removedantigrav) {
			if (((entity instanceof PlayerEntity)
					? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(UnknownianPowerCoreItem.block))
					: false) && !((entity instanceof LivingEntity) ? (entity.hasNoGravity()) : false)) {
				entity.setNoGravity((true));
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(UnknownianPowerCoreItem.block);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
			}
		}
	}
}
