package net.mcreator.unknownianmysteries.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.unknownianmysteries.block.UnknownianNukeBlock;
import net.mcreator.unknownianmysteries.UnknownianmysteriesMod;

import java.util.Map;

public class UnknownianNukeGUIButtonPressedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency world for procedure UnknownianNukeGUIButtonPressed!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency x for procedure UnknownianNukeGUIButtonPressed!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency y for procedure UnknownianNukeGUIButtonPressed!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency z for procedure UnknownianNukeGUIButtonPressed!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency entity for procedure UnknownianNukeGUIButtonPressed!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Unknownian Nuke Activated, 15 seconds till explosion!"), (true));
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
				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == UnknownianNukeBlock.block) {
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
					if (world instanceof World && !((World) world).isRemote) {
						((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 50, Explosion.Mode.DESTROY);
					}
					if (world instanceof World && !((World) world).isRemote) {
						((World) world).createExplosion(null, (int) (x + 1), (int) y, (int) z, (float) 50, Explosion.Mode.DESTROY);
					}
					if (world instanceof World && !((World) world).isRemote) {
						((World) world).createExplosion(null, (int) (x + 1), (int) y, (int) (z + 1), (float) 50, Explosion.Mode.DESTROY);
					}
					if (world instanceof World && !((World) world).isRemote) {
						((World) world).createExplosion(null, (int) x, (int) y, (int) (z + 1), (float) 50, Explosion.Mode.DESTROY);
					}
					if (world instanceof World && !((World) world).isRemote) {
						((World) world).createExplosion(null, (int) (x - 1), (int) y, (int) (z + 1), (float) 50, Explosion.Mode.DESTROY);
					}
					if (world instanceof World && !((World) world).isRemote) {
						((World) world).createExplosion(null, (int) (x - 1), (int) y, (int) z, (float) 50, Explosion.Mode.DESTROY);
					}
					if (world instanceof World && !((World) world).isRemote) {
						((World) world).createExplosion(null, (int) (x - 1), (int) y, (int) (z - 1), (float) 50, Explosion.Mode.DESTROY);
					}
					if (world instanceof World && !((World) world).isRemote) {
						((World) world).createExplosion(null, (int) (x - 1), (int) y, (int) (z - 1), (float) 50, Explosion.Mode.DESTROY);
					}
					if (world instanceof World && !((World) world).isRemote) {
						((World) world).createExplosion(null, (int) x, (int) y, (int) (z - 1), (float) 50, Explosion.Mode.DESTROY);
					}
					if (world instanceof World && !((World) world).isRemote) {
						((World) world).createExplosion(null, (int) (x + 1), (int) y, (int) (z - 1), (float) 50, Explosion.Mode.DESTROY);
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 300);
	}
}
