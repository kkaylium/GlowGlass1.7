package kkaylium.GlowGlass.creativeTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GlowGlassCreativeTab extends CreativeTabs{

	public GlowGlassCreativeTab(int par1, String par2Str) {
		super(par1, par2Str);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return null;
	}

}
