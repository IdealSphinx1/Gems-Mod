package disaac1.GemsMod.func;

import disaac1.GemsMod.MainClass;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class gems_Block extends Block {

	public gems_Block(Material materialIn, String name) {
		super(materialIn);
		this.setHarvestLevel("pickaxe", 2);
		this.setUnlocalizedName(name);
		this.setCreativeTab(MainClass.tabGems);
		this.setHardness(3.0f);
		this.setResistance(2.0f);
		this.setStepSound(Block.soundTypeStone);
	}

}
