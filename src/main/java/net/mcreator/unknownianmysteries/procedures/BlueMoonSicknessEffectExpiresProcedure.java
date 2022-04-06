package net.mcreator.unknownianmysteries.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.unknownianmysteries.UnknownianmysteriesModVariables;
import net.mcreator.unknownianmysteries.UnknownianmysteriesMod;

import java.util.Map;

public class BlueMoonSicknessEffectExpiresProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency entity for procedure BlueMoonSicknessEffectExpires!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(Effects.NAUSEA);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(Effects.SLOWNESS);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(Effects.BLINDNESS);
		}
		if ((entity.getCapability(UnknownianmysteriesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UnknownianmysteriesModVariables.PlayerVariables())).bluemoonprotectionvalue >= 4) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.UNLUCK);
			}
		}
	}
}
