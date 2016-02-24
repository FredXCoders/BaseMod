package com.fredxcoders.mod;


import com.fredxcoders.mod.helper.RecipeHelper;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * This is the class to use to define everything about our mod
 * @author elliott
 *
 */
@Mod(modid="dojo_basemod", name="Base Mod", version="0.1")
public class BaseMod {
	
	public static final String MODID = "fredxcoders_basemod";

	@Instance(MODID)
	public static BaseMod instance;

	@EventHandler
	public void load(FMLPreInitializationEvent event){
		
		ItemStack[][] recipe = RecipeHelper.getBlankRecipe();
		recipe[0][0] = new ItemStack(Blocks.dirt);
		RecipeHelper.addRecipe(new ItemStack(Items.beef,10), recipe);	//dirt makes myBlock!
	}
}
