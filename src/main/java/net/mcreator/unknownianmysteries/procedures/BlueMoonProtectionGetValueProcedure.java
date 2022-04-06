package net.mcreator.unknownianmysteries.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.unknownianmysteries.enchantment.BlueMoonProtectionEnchantment;
import net.mcreator.unknownianmysteries.UnknownianmysteriesModVariables;
import net.mcreator.unknownianmysteries.UnknownianmysteriesMod;

import java.util.Map;
import java.util.HashMap;

public class BlueMoonProtectionGetValueProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency entity for procedure BlueMoonProtectionGetValue!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			double _setval = (EnchantmentHelper.getEnchantmentLevel(BlueMoonProtectionEnchantment.enchantment,
					((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.FEET) : ItemStack.EMPTY))
					+ EnchantmentHelper.getEnchantmentLevel(BlueMoonProtectionEnchantment.enchantment,
							((entity instanceof LivingEntity)
									? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.LEGS)
									: ItemStack.EMPTY))
					+ EnchantmentHelper.getEnchantmentLevel(BlueMoonProtectionEnchantment.enchantment,
							((entity instanceof LivingEntity)
									? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST)
									: ItemStack.EMPTY))
					+ EnchantmentHelper.getEnchantmentLevel(BlueMoonProtectionEnchantment.enchantment,
							((entity instanceof LivingEntity)
									? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD)
									: ItemStack.EMPTY)));
			entity.getCapability(UnknownianmysteriesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.bluemoonprotectionvalue = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
