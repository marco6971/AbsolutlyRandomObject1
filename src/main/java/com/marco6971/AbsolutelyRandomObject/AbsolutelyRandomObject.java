package com.marco6971.AbsolutelyRandomObject;

import com.marco6971.AbsolutelyRandomObject.Reference.Reference;
import com.marco6971.AbsolutelyRandomObject.handler.ConfigurationHandler;
import com.marco6971.AbsolutelyRandomObject.init.ModItems;
import com.marco6971.AbsolutelyRandomObject.proxy.IProxy;
import com.marco6971.AbsolutelyRandomObject.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod; 
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class AbsolutelyRandomObject
{
	@Mod.Instance(Reference.MOD_ID)
	public static AbsolutelyRandomObject instance;
	
	@SidedProxy (clientSide="com.marco6971.AbsolutelyRandomObject.proxy.ClientProxy", serverSide="com.marco6971.AbsolutelyRandomObject.proxy.ServerProxy")
	public static IProxy proxy;
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
	ConfigurationHandler.init(event.getSuggestedConfigurationFile());
	FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
	ModItems.init();
	LogHelper.info("PreInitialization complete!");
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event){
		LogHelper.info("Initialization complete!");
	}
    
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		LogHelper.info("PostInitialization complete!");
	}
}