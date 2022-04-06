package net.mcreator.unknownianmysteries.procedures;

import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.unknownianmysteries.item.UnknownianWeaponSwordModeItem;
import net.mcreator.unknownianmysteries.item.UnknownianWeaponGunFormItem;
import net.mcreator.unknownianmysteries.UnknownianmysteriesModVariables;
import net.mcreator.unknownianmysteries.UnknownianmysteriesMod;

import java.util.Map;

public class UnknownianWeaponGunFormItemInHandTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency entity for procedure UnknownianWeaponGunFormItemInHandTick!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency itemstack for procedure UnknownianWeaponGunFormItemInHandTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double durability = 0;
		if (("sword").equals((entity.getCapability(UnknownianmysteriesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UnknownianmysteriesModVariables.PlayerVariables())).unknownianmode)) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == UnknownianWeaponGunFormItem.block) {
				if (entity instanceof LivingEntity) {
					ItemStack _setstack = new ItemStack(UnknownianWeaponSwordModeItem.block);
					_setstack.setCount((int) 1);
					((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
				(itemstack).setDamage((int) durability);
			} else if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
					.getItem() == UnknownianWeaponGunFormItem.block) {
				if (entity instanceof LivingEntity) {
					ItemStack _setstack = new ItemStack(UnknownianWeaponSwordModeItem.block);
					_setstack.setCount((int) 1);
					((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
				(itemstack).setDamage((int) durability);
			}
		}
	}
}
