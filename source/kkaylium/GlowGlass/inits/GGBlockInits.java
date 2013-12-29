package kkaylium.GlowGlass.inits;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import kkaylium.GlowGlass.blocks.BlockGlowBlock;
import kkaylium.GlowGlass.blocks.BlockGlowGlass;

public class GGBlockInits {
	
	//Glow Glass
	public static Block GGWhite;
	public static Block GGBlack;
	public static Block GGRed;
	public static Block GGOrange;
	public static Block GGYellow;
	public static Block GGLime;
	public static Block GGGreen;
	public static Block GGSky;
	public static Block GGBlue;
	public static Block GGLilac;
	public static Block GGPurple;
	public static Block GGPink;
	
	//Glow Blocks
	public static Block GBWhite;
	public static Block GBBlack;
	public static Block GBRed;
	public static Block GBOrange;
	public static Block GBYellow;
	public static Block GBLime;
	public static Block GBGreen;
	public static Block GBSky;
	public static Block GBBlue;
	public static Block GBLilac;
	public static Block GBPurple;
	public static Block GBPink;
	
	//Glow Doors
	public static Block GDWhite;
	public static Block GDBlack;
	public static Block GDRed;
	public static Block GDOrange;
	public static Block GDYellow;
	public static Block GDLime;
	public static Block GDGreen;
	public static Block GDSky;
	public static Block GDBlue;
	public static Block GDLilac;
	public static Block GDPurple;
	public static Block GDPink;
	
	//Glow Ores
	public static Block GOWhite;
	public static Block GOBlack;
	public static Block GORed;
	public static Block GOOrange;
	public static Block GOYellow;
	public static Block GOLime;
	public static Block GOGreen;
	public static Block GOSky;
	public static Block GOBlue;
	public static Block GOLilac;
	public static Block GOPurple;
	public static Block GOPink;
	
	//Glow Fences
	
	//Glow Fence Gates
	
	public static void glowGlassBlocksInit()
	{
		//func_149663_c will have to be changed back to unlocalizedName soon FYI
		//func_149658_d will have to be changed back to setTextureName
		
		GGWhite = new BlockGlowGlass().func_149663_c("GGWhite").func_149658_d("glowglass:GGWhite").func_149647_a(CreativeTabs.tabBlock);
		GGBlack = new BlockGlowGlass().func_149663_c("GGBlack");
		GGRed = new BlockGlowGlass().func_149663_c("GGRed");
		GGOrange = new BlockGlowGlass().func_149663_c("GGOrange");
		GGYellow = new BlockGlowGlass().func_149663_c("GGYellow");
		GGLime = new BlockGlowGlass().func_149663_c("GGLime");
		GGGreen = new BlockGlowGlass().func_149663_c("GGGreen");
		GGSky = new BlockGlowGlass().func_149663_c("GGSky");
		GGBlue = new BlockGlowGlass().func_149663_c("GGBlue");
		GGLilac = new BlockGlowGlass().func_149663_c("GGLilac");
		GGPurple = new BlockGlowGlass().func_149663_c("GGPurple");
		GGPink = new BlockGlowGlass().func_149663_c("GGPink");
	}
	
	public static void glowBlockInit()
	{
		GBWhite = new BlockGlowBlock().func_149663_c("GBWhite");
		GBBlack = new BlockGlowBlock().func_149663_c("GBBlack");
		GBRed = new BlockGlowBlock().func_149663_c("GBRed");
		GBOrange = new BlockGlowBlock().func_149663_c("GBOrange");
		GBYellow = new BlockGlowBlock().func_149663_c("GBYellow");
		GBLime = new BlockGlowBlock().func_149663_c("GBLime");
		GBGreen = new BlockGlowBlock().func_149663_c("GBGreen");
		GBSky = new BlockGlowBlock().func_149663_c("GBSky");
		GBBlue = new BlockGlowBlock().func_149663_c("GBBlue");
		GBLilac = new BlockGlowBlock().func_149663_c("GBLilac");
		GBPurple = new BlockGlowBlock().func_149663_c("GBPurple");
		GBPink = new BlockGlowBlock().func_149663_c("GBPink");
	}
	
	public static void glowDoorBlocksInit()
	{
		
	}
	
	public static void glowOresInit()
	{
		
	}

}
