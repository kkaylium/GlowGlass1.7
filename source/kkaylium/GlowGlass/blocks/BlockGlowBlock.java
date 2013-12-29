package kkaylium.GlowGlass.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockGlowBlock extends Block{

	public BlockGlowBlock() {
		super(Material.field_151566_D);
	}
	
	public int quantityDropped(Random par1Random)
    {
        return 1;
    }

}
