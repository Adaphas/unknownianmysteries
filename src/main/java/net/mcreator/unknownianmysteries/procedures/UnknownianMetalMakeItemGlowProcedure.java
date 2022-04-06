package net.mcreator.unknownianmysteries.procedures;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.unknownianmysteries.UnknownianmysteriesMod;

import java.util.Map;

public class UnknownianMetalMakeItemGlowProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency entity for procedure UnknownianMetalMakeItemGlow!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return (entity.world.getDimensionKey()) == (World.THE_NETHER);
	}
}
