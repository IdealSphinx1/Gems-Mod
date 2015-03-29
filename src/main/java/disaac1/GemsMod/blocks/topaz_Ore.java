package disaac1.GemsMod.blocks;

import java.util.Collection;
import java.util.Random;
import com.google.common.collect.ImmutableMap;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import disaac1.GemsMod.MainClass;
import disaac1.GemsMod.init.GemsItems;

public class topaz_Ore extends Block {
	

	public topaz_Ore(Material material) {
		super(material);
		this.setHarvestLevel("pickaxe", 2);
		this.setUnlocalizedName("topaz_Ore");
		this.setCreativeTab(MainClass.tabGems);
		this.setHardness(2.0f);
		this.setResistance(2.0f);
		this.setStepSound(Block.soundTypeStone);
		
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
    	return GemsItems.topaz_Ingot;

    }
    @Override
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0)
        {
            int j = random.nextInt(fortune + 2) - 1;

            if (j < 0)
            {
                j = 0;
            }

            return quantityDropped(random) * (j + 1);
        }
        else
        {
            return quantityDropped(random);
        }
     }
    public void dropXpOnBlockBreak(World worldIn, BlockPos pos, int amount)
    {
        if (!worldIn.isRemote)
        {
            while (amount > 0)
            {
                int j = EntityXPOrb.getXPSplit(amount);
                amount -= j;
                worldIn.spawnEntityInWorld(new EntityXPOrb(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, j));
            }
        }
    }

	
}
