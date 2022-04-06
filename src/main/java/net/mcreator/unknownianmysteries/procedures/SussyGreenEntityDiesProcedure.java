package net.mcreator.unknownianmysteries.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.unknownianmysteries.block.SussyGreenBodyBlock;
import net.mcreator.unknownianmysteries.UnknownianmysteriesMod;

import java.util.Map;

public class SussyGreenEntityDiesProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency world for procedure SussyGreenEntityDies!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency x for procedure SussyGreenEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency y for procedure SussyGreenEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency z for procedure SussyGreenEntityDies!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), SussyGreenBodyBlock.block.getDefaultState(), 3);
	}
}
