package disaac1.GemsMod.blocks;

import disaac1.GemsMod.MainClass;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ultimate_See_er extends BlockContainer
{

	public ultimate_See_er()
    {
        super(Material.cloth);
        this.isBlockContainer = true;
        this.setCreativeTab(MainClass.tabGems);
        this.setBlockBounds(0F, 0F, 0F, 1F, 1F, 1F);
        this.setUnlocalizedName("ultimate_See_er");
        this.setStepSound(soundTypeStone);
        this.setHardness(1.0f);
    }

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		// TODO Auto-generated method stub
		return null;
	}
}