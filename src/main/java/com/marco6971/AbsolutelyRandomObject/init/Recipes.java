package com.marco6971.AbsolutelyRandomObject.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void init(){
		//GameRegistry.addRecipe(new ItemStack(ModItems.mapleleaf), " s ", "sss", " s ",'s', new ItemStack(Items.stick));
	//	GameRegistry.addRecipe(new ItemStack(ModBlocks.flag1), "www", "wmw", "www",'w', new ItemStack(Blocks.wool, 1, 0), 'm',new ItemStack(ModItems.mapleleaf));
		//GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.erpene), new ItemStack(ModItems.erpene));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleleaf), " s ", "sss", " s ",'s', "stickWood"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.erpene), new ItemStack(ModItems.erpene)));
	}
}