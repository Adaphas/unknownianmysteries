
package net.mcreator.unknownianmysteries.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.unknownianmysteries.item.UnknownianPowerCoreItem;

@Mod.EventBusSubscriber
public class UnknownianFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == UnknownianPowerCoreItem.block)
			event.setBurnTime(1728000);
	}
}
