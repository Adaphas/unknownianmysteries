package net.mcreator.unknownianmysteries.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.client.Minecraft;

import net.mcreator.unknownianmysteries.UnknownianmysteriesMod;

import java.util.Map;

public class UntexturedRealmPortalTriggerUsedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency world for procedure UntexturedRealmPortalTriggerUsed!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency itemstack for procedure UntexturedRealmPortalTriggerUsed!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (world.isRemote()) {
			Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
		}
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private IWorld world;

			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				(itemstack).shrink((int) 1);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 20);
	}
}
