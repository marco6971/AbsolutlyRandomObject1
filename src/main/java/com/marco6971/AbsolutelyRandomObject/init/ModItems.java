package com.marco6971.AbsolutelyRandomObject.init;

import com.marco6971.AbsolutelyRandomObject.item.ItemARO;
import com.marco6971.AbsolutelyRandomObject.item.ItemMapleLeaf;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static final ItemARO  mapleleaf = new ItemMapleLeaf();
	public static void init (){
		GameRegistry.registerItem(mapleleaf,  "mapleleaf");
	}
}
