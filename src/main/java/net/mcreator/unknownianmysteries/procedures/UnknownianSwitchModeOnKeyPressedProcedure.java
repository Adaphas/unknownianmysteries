package net.mcreator.unknownianmysteries.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.unknownianmysteries.item.UnknownianWeaponSwordModeItem;
import net.mcreator.unknownianmysteries.item.UnknownianWeaponGunFormItem;
import net.mcreator.unknownianmysteries.UnknownianmysteriesModVariables;
import net.mcreator.unknownianmysteries.UnknownianmysteriesMod;

import java.util.Map;

public class UnknownianSwitchModeOnKeyPressedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency entity for procedure UnknownianSwitchModeOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == UnknownianWeaponSwordModeItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
						.getItem() == UnknownianWeaponSwordModeItem.block) {
			{
				String _setval = "gun";
				entity.getCapability(UnknownianmysteriesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.unknownianmode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == UnknownianWeaponGunFormItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
						.getItem() == UnknownianWeaponGunFormItem.block) {
			{
				String _setval = "sword";
				entity.getCapability(UnknownianmysteriesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.unknownianmode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				String _setval = "nothing";
				entity.getCapability(UnknownianmysteriesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.unknownianmode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
