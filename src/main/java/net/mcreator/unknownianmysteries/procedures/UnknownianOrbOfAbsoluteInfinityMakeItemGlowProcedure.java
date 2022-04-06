package net.mcreator.unknownianmysteries.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.unknownianmysteries.item.UnknownianStaffOfPowerItem;
import net.mcreator.unknownianmysteries.UnknownianmysteriesMod;

import java.util.Map;

public class UnknownianOrbOfAbsoluteInfinityMakeItemGlowProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency entity for procedure UnknownianOrbOfAbsoluteInfinityMakeItemGlow!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return UnknownianStaffOfPowerItem.block == ((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getHeldItemMainhand()
				: ItemStack.EMPTY).getItem();
	}
}
