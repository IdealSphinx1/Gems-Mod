package disaac1.GemsMod.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import disaac1.GemsMod.MainClass;
import disaac1.GemsMod.Reference;
import disaac1.GemsMod.blocks.*;
import disaac1.GemsMod.func.gems_Block;

public class GemsBlocks {


	//public static Block example_name;//
	public static Block ruby_Ore;
	public static Block ruby_Block;
	public static Block sapphire_Ore;
	public static Block sapphire_Block;
	public static Block amethyst_Ore;
	public static Block amethyst_Block;
	public static Block topaz_Ore;
	public static Block topaz_Block;
	public static Block obsidian_Block;
	public static BlockContainer ultimate_See_er;

	public static void init(){

		//example_name = new BlockTest(Material.rock).setUnlocalizedName("example_name").setCreativeTab(RubiesMod.tabRubies).setHardness(1.0f).setStepSound(Block.soundTypeStone);
		ruby_Ore = new ruby_Ore(Material.rock);
		ruby_Block = new gems_Block(Material.rock, "ruby_Block");
		sapphire_Ore = new sapphire_Ore(Material.rock);
		sapphire_Block = new gems_Block(Material.rock, "sapphire_Block");
		amethyst_Ore = new amethyst_Ore(Material.rock);
		amethyst_Block = new gems_Block(Material.rock, "amethyst_Block");
		topaz_Ore = new topaz_Ore(Material.rock);
		topaz_Block = new gems_Block(Material.rock, "topaz_Block");
		obsidian_Block = new gems_Block(Material.rock, "obsidian_Block");
		ultimate_See_er = new ultimate_See_er();
	}

	public static void registers(){
		register(ruby_Ore);
		register(ruby_Block);
		register(sapphire_Ore);
		register(sapphire_Block);
		register(amethyst_Ore);
		register(amethyst_Block);
		register(topaz_Ore);
		register(topaz_Block);
		register(obsidian_Block);
		register(ultimate_See_er);
	}

	public static void registerRenders(){
		registerRender(ruby_Ore);
		registerRender(ruby_Block);
		registerRender(sapphire_Ore);
		registerRender(sapphire_Block);
		registerRender(amethyst_Ore);
		registerRender(amethyst_Block);
		registerRender(topaz_Ore);
		registerRender(topaz_Block);
		registerRender(obsidian_Block);
		registerRender(ultimate_See_er);
	}
	public static void registerRender(Block block){

		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	public static void register(Block block){
		GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
	}
}
