/**
 * The code of this mod element is always locked.
 *
 * You can register new events in this class too.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser -> New... and make sure to make the class
 * outside net.mcreator.unknownianmysteries as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
 *
 * This class will be added in the mod root package.
*/
package net.mcreator.unknownianmysteries;

import mezz.jei.api.*;
import mezz.jei.api.ingredients.IIngredientType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.runtime.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidStack;
import java.util.*;
import java.util.stream.Collectors;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.server.command.ModIdArgument;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.moddiscovery.ModInfo;

import net.mcreator.unknownianmysteries.item.DelariPrizeItem;

@mezz.jei.api.JeiPlugin
public class ItemElement implements IModPlugin { 
	
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("unknownianmysteries", "default");
	}

	@Override
        public void registerRecipes(IRecipeRegistration registry) {
		IIngredientManager ingredientManager = registry.getIngredientManager();

		
		IIngredientType<ItemStack> itemType = ingredientManager.getIngredientType(ItemStack.class);

		registry.addIngredientInfo(new ItemStack(DelariPrizeItem.block), itemType, "You are the 1000 Citizen, click here you win a prize");



     }
}
