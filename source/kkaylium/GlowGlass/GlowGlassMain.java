package kkaylium.GlowGlass;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(name = "GlowGlass", modid = "glowglass", version = "a0.0.1")
public class GlowGlassMain {
	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		GGConfig.GGConfigFile(event);
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}

}
