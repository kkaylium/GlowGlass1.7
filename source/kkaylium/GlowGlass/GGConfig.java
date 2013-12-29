package kkaylium.GlowGlass;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

public class GGConfig {
	
	public static void GGConfigFile(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		
		
		config.save();
	}

}
