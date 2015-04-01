package disaac1.GemsMod.init;

import sun.reflect.generics.tree.ClassTypeSignature;
import disaac1.GemsMod.Reference;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.RecipesArmor;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GemsRecipes {


	
	public static void RecipeMaster(){
		
		
		RecipeAllTools(GemsItems.ruby_Pickaxe, GemsItems.ruby_Sword, GemsItems.ruby_Spade, GemsItems.ruby_Axe, GemsItems.ruby_Hoe, GemsItems.ruby_Ingot);
		RecipeAllTools(GemsItems.sapphire_Pickaxe, GemsItems.sapphire_Sword, GemsItems.sapphire_Spade, GemsItems.sapphire_Axe, GemsItems.sapphire_Hoe, GemsItems.sapphire_Ingot);
		RecipeAllTools(GemsItems.quartz_Pickaxe, GemsItems.quartz_Sword, GemsItems.quartz_Spade, GemsItems.quartz_Axe, GemsItems.quartz_Hoe, Items.quartz);
		RecipeAllTools(GemsItems.emerald_Pickaxe, GemsItems.emerald_Sword, GemsItems.emerald_Spade, GemsItems.emerald_Axe,GemsItems.emerald_Hoe, Items.emerald);
		RecipeAllTools(GemsItems.amethyst_Pickaxe, GemsItems.amethyst_Sword, GemsItems.amethyst_Spade, GemsItems.amethyst_Axe, GemsItems.amethyst_Hoe, GemsItems.amethyst_Ingot);
		RecipeAllTools(GemsItems.topaz_Pickaxe, GemsItems.topaz_Sword, GemsItems.topaz_Spade, GemsItems.topaz_Axe, GemsItems.topaz_Hoe, GemsItems.topaz_Ingot);
		RecipeAllTools(GemsItems.obsidian_Pickaxe, GemsItems.obsidian_Sword, GemsItems.obsidian_Spade, GemsItems.obsidian_Axe, GemsItems.obsidian_Hoe, GemsItems.obsidian_Ingot);
		
		RecipeAllArmor(GemsItems.ruby_Helmet, GemsItems.ruby_Chestplate, GemsItems.ruby_Leggings, GemsItems.ruby_Boots, GemsItems.ruby_Ingot);
		RecipeAllArmor(GemsItems.sapphire_Helmet, GemsItems.sapphire_Chestplate, GemsItems.sapphire_Leggings, GemsItems.sapphire_Boots, GemsItems.sapphire_Ingot);
		RecipeAllArmor(GemsItems.quartz_Helmet, GemsItems.quartz_Chestplate, GemsItems.quartz_Leggings, GemsItems.quartz_Boots, Items.quartz);
		RecipeAllArmor(GemsItems.emerald_Helmet, GemsItems.emerald_Chestplate, GemsItems.emerald_Leggings, GemsItems.emerald_Boots, Items.emerald);
		RecipeAllArmor(GemsItems.amethyst_Helmet, GemsItems.amethyst_Chestplate, GemsItems.amethyst_Leggings, GemsItems.amethyst_Boots, GemsItems.amethyst_Ingot);
		RecipeAllArmor(GemsItems.topaz_Helmet, GemsItems.topaz_Chestplate, GemsItems.topaz_Leggings, GemsItems.topaz_Boots, GemsItems.topaz_Ingot);
		RecipeAllArmor(GemsItems.obsidian_Helmet, GemsItems.obsidian_Chestplate, GemsItems.obsidian_Leggings, GemsItems.obsidian_Boots, GemsItems.obsidian_Ingot);
		
		RecipeStorageBlock(GemsBlocks.ruby_Block, GemsItems.ruby_Ingot);
		RecipeStorageBlock(GemsBlocks.sapphire_Block, GemsItems.sapphire_Ingot);
		RecipeStorageBlock(GemsBlocks.amethyst_Block, GemsItems.amethyst_Ingot);
		RecipeStorageBlock(GemsBlocks.topaz_Block, GemsItems.topaz_Ingot);
		RecipeStorageBlock(GemsBlocks.obsidian_Block, GemsItems.obsidian_Ingot);
		
		RecipeStorageBlockBack(GemsItems.ruby_Ingot, GemsBlocks.ruby_Block);
		RecipeStorageBlockBack(GemsItems.sapphire_Ingot, GemsBlocks.sapphire_Block);
		RecipeStorageBlockBack(GemsItems.amethyst_Ingot, GemsBlocks.amethyst_Block);
		RecipeStorageBlockBack(GemsItems.topaz_Ingot, GemsBlocks.topaz_Block);
		RecipeStorageBlockBack(GemsItems.obsidian_Ingot, GemsBlocks.obsidian_Block);
		
		RecipeDust(GemsItems.diamond_Dust, Items.diamond);
		RecipeDust(GemsItems.ruby_Dust, GemsItems.ruby_Ingot);
		RecipeDust(GemsItems.sapphire_Dust, GemsItems.sapphire_Ingot);
		RecipeDust(GemsItems.emerald_Dust, Items.emerald);
		RecipeDust(GemsItems.quartz_Dust, Items.quartz);
		RecipeDust(GemsItems.amethyst_Dust, GemsItems.amethyst_Ingot);
		RecipeDust(GemsItems.topaz_Dust, GemsItems.topaz_Ingot);
		RecipeDust(GemsItems.obsidian_Dust, GemsItems.obsidian_Ingot);
		
		RecipeFurnaceItem(GemsItems.ruby_Dust, GemsItems.ruby_Ingot, 0.0f);
		RecipeFurnaceItem(GemsItems.diamond_Dust, Items.diamond, 0.0f);
		RecipeFurnaceItem(GemsItems.emerald_Dust, Items.emerald, 0.0f);
		RecipeFurnaceItem(GemsItems.sapphire_Dust, GemsItems.sapphire_Ingot, 0.0f);
		RecipeFurnaceItem(GemsItems.ultimate_Dust, GemsItems.ultimate_Ingot, 0.0f);
		RecipeFurnaceItem(GemsItems.quartz_Dust, Items.quartz, 0.0f);
		RecipeFurnaceItem(GemsItems.amethyst_Dust, GemsItems.amethyst_Ingot, 0.0f);
		RecipeFurnaceItem(GemsItems.topaz_Dust, GemsItems.topaz_Ingot, 0.0f);
		RecipeFurnaceItem(GemsItems.obsidian_Dust, GemsItems.obsidian_Ingot, 0.0f);
		
		RecipeFuranceBlock(GemsBlocks.ruby_Ore, GemsItems.ruby_Ingot, 1.0f);
		RecipeFuranceBlock(GemsBlocks.sapphire_Ore, GemsItems.sapphire_Ingot, 1.0f);
		RecipeFuranceBlock(GemsBlocks.amethyst_Ore, GemsItems.amethyst_Ingot, 1.0f);
		RecipeFuranceBlock(GemsBlocks.topaz_Ore, GemsItems.topaz_Ingot, 1.0f);
		
	}
	
	public static void registerRecipe() {
		
		GameRegistry.addShapelessRecipe(new ItemStack(GemsItems.ultimate_Dust), GemsItems.diamond_Dust, GemsItems.emerald_Dust, GemsItems.ruby_Dust, GemsItems.sapphire_Dust, GemsItems.quartz_Dust, GemsItems.amethyst_Dust, GemsItems.topaz_Dust);
		GameRegistry.addShapelessRecipe(new ItemStack(GemsItems.quartz_Dust, 4), Blocks.quartz_block, Blocks.cobblestone);
		GameRegistry.addRecipe(new ItemStack(GemsItems.obsidian_Ingot), "GGG", "GGG", "GGG", 'G', Blocks.obsidian);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian, 9), GemsItems.obsidian_Ingot);
		GameRegistry.addRecipe(new ItemStack(GemsBlocks.ultimate_See_er, 8), "GGG", "GSG", "GGG", 'G', GemsItems.ultimate_Ingot, 'S', Blocks.glass);
	
	
	}
	
	
	
	
	
	public static void RecipePickaxe(Item output, Item ingot){
		GameRegistry.addRecipe(new ItemStack(output), "GGG", " S ", " S ", 'G', ingot, 'S', Items.stick);
	}
	public static void RecipeSword(Item output, Item ingot){
		GameRegistry.addRecipe(new ItemStack(output), " G ", " G ", " S ", 'G', ingot, 'S', Items.stick);
	}
	public static void RecipeSpade(Item output, Item ingot){
		GameRegistry.addRecipe(new ItemStack(output), " G ", " S ", " S ", 'G', ingot, 'S', Items.stick);
	}
	public static void RecipeAxe(Item output, Item ingot){
		GameRegistry.addRecipe(new ItemStack(output), "GG ", "GS ", " S ", 'G', ingot, 'S', Items.stick);
	}
	public static void RecipeHoe(Item output, Item ingot){
		GameRegistry.addRecipe(new ItemStack(output), "GG ", " S ", " S ", 'G', ingot, 'S', Items.stick);
	}
	public static void RecipeHelmet(Item output, Item ingot){
		GameRegistry.addRecipe(new ItemStack(output), "GGG", "G G", "   ", 'G', ingot);
		GameRegistry.addRecipe(new ItemStack(output), "   ", "GGG", "G G", 'G', ingot);
	}
	public static void RecipeChestplate(Item output, Item ingot){
		GameRegistry.addRecipe(new ItemStack(output), "G G", "GGG", "GGG", 'G', ingot);
	}
	public static void RecipeLeggings(Item output, Item ingot){
		GameRegistry.addRecipe(new ItemStack(output), "GGG", "G G", "G G", 'G', ingot);
	}
	public static void RecipeBoots(Item output, Item ingot){
		GameRegistry.addRecipe(new ItemStack(output), "G G", "G G", "   ", 'G', ingot);
		GameRegistry.addRecipe(new ItemStack(output), "   ", "G G", "G G", 'G', ingot);
	}
	public static void RecipeStorageBlock(Block output, Item ingot){
		GameRegistry.addRecipe(new ItemStack(output), "GGG", "GGG", "GGG", 'G', ingot);
	}
	public static void RecipeStorageBlockBack(Item output, Block StorageBlock){
		GameRegistry.addShapelessRecipe(new ItemStack(output, 9), StorageBlock);
	}	
	/** Helmet, Chestplate, Leggings, Boots, Ingot **/
	public static void RecipeAllArmor(Item outputH, Item outputC, Item outputL, Item outputB, Item ingot){
		GameRegistry.addRecipe(new ItemStack(outputH), "GGG", "G G", "   ", 'G', ingot);
		GameRegistry.addRecipe(new ItemStack(outputH), "   ", "GGG", "G G", 'G', ingot);
		GameRegistry.addRecipe(new ItemStack(outputC), "G G", "GGG", "GGG", 'G', ingot);
		GameRegistry.addRecipe(new ItemStack(outputL), "GGG", "G G", "G G", 'G', ingot);
		GameRegistry.addRecipe(new ItemStack(outputB), "G G", "G G", "   ", 'G', ingot);
		GameRegistry.addRecipe(new ItemStack(outputB), "   ", "G G", "G G", 'G', ingot);
	}
	/** Pick, Sword, Spade, Axe, Hoe, Ingot **/
	public static void RecipeAllTools(Item outputP, Item outputS, Item outputSp, Item outputA, Item outputH, Item ingot){
	/** Pick, Sword, Spade, Axe, Hoe, Ingot **/
		GameRegistry.addRecipe(new ItemStack(outputP), "GGG", " S ", " S ", 'G', ingot, 'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(outputS), " G ", " G ", " S ", 'G', ingot, 'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(outputSp), " G ", " S ", " S ", 'G', ingot, 'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(outputA), "GG ", "GS ", " S ", 'G', ingot, 'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(outputH), "GG ", " S ", " S ", 'G', ingot, 'S', Items.stick);
	}
	public static void RecipeDust(Item output, Item ingot){
		GameRegistry.addShapelessRecipe(new ItemStack(output), ingot, Blocks.cobblestone);
	}
	public static void RecipeFurnaceItem(Item input, Item output, float xp ){
		GameRegistry.addSmelting(input, new ItemStack(output), xp);
	}
	public static void RecipeFuranceBlock(Block input, Item output, float xp){
		GameRegistry.addSmelting(input, new ItemStack(output), xp);
	}
	
}
