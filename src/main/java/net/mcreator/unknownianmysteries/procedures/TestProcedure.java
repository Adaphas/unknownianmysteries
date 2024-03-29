package net.mcreator.unknownianmysteries.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.Entity;

import net.mcreator.unknownianmysteries.UnknownianmysteriesMod;

import java.util.Map;
import java.util.HashMap;

public class TestProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			Entity entity = event.getPlayer();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", entity.getPosX());
			dependencies.put("y", entity.getPosY());
			dependencies.put("z", entity.getPosZ());
			dependencies.put("world", entity.world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency entity for procedure Test!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getUniqueID().toString()).equals("aae75476c1bd4e8f-bd84c140bc585b4c")) {
			entity.setCustomName(new StringTextComponent("Mykelti"));
		}
	}
}
