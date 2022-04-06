package net.mcreator.unknownianmysteries.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.unknownianmysteries.UnknownianmysteriesMod;

import java.util.Map;

public class UntexturedRealmBlockBlockIsPlacedByProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency entity for procedure UntexturedRealmBlockBlockIsPlacedBy!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LUCK, (int) 600, (int) 1, (true), (false)));
	}
}
