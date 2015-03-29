package disaac1.GemsMod.init;

import java.util.Stack;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import disaac1.GemsMod.MainClass;
import disaac1.GemsMod.Reference;
import disaac1.GemsMod.func.gems_Armor;
import disaac1.GemsMod.func.gems_Axe;
import disaac1.GemsMod.func.gems_Dust;
import disaac1.GemsMod.func.gems_Hoe;
import disaac1.GemsMod.func.gems_Ingot;
import disaac1.GemsMod.func.gems_Pickaxe;
import disaac1.GemsMod.func.gems_Spade;
import disaac1.GemsMod.func.gems_Sword;


public class GemsItems {

	public static ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 2, 750, 7.0f, 2.5f, 12);
	public static ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 2, 750, 7.0f, 2.5f, 12);
	public static ToolMaterial QUARTZ = EnumHelper.addToolMaterial("QUARTZ", 1, 50, 10.0f, 4.0f, 25 );
	public static ToolMaterial EMERALD = EnumHelper.addToolMaterial("EMERALD", 3, 1500, 7.0f, 3.0f, 10);
	public static ToolMaterial AMETHYST = EnumHelper.addToolMaterial("AMETHYST", 2, 1000, 7.0f, 2.5f, 16);
	public static ToolMaterial TOPAZ = EnumHelper.addToolMaterial("TOPAZ", 2, 800, 7.0f, 3.0f, 16);
	public static ToolMaterial OBSIDIAN = EnumHelper.addToolMaterial("OBSIDIAN", 3, 5000, 4.0f, 2.0f, 30);
	
	public static ArmorMaterial RUBYARMOR= EnumHelper.addArmorMaterial("RUBYARMOR", "gemsmod:ruby", 47, new int[]{2, 5, 3, 2}, 28);
	public static ArmorMaterial SAPPHIREARMOR = EnumHelper.addArmorMaterial("SAPPHIREARMOR", "gemsmod:sapphire", 47, new int[]{2, 5, 3, 2}, 28);
	public static ArmorMaterial QUARTZARMOR = EnumHelper.addArmorMaterial("QUARTZARMOR", "gemsmod:quartz", 20, new int[]{1, 3, 2, 1}, 10);
	public static ArmorMaterial EMERALDARMOR = EnumHelper.addArmorMaterial("EMERALDARMOR", "gemsmod:emerald", 55, new int[]{3,5,4,2}, 25);
	public static ArmorMaterial AMETHYSTAMOR = EnumHelper.addArmorMaterial("AMETHYSTAMROR", "gemsmod:amethyst", 50, new int[]{3, 5, 3, 2}, 30);
	public static ArmorMaterial TOPAZARMOR = EnumHelper.addArmorMaterial("TOPAZARMOR", "gemsmod:topaz", 50, new int[]{4, 5, 5, 4}, 28);
	public static ArmorMaterial OBSIDIANARMOR = EnumHelper.addArmorMaterial("OBSIDIAN", "gemsmod:obsidian", 500, new int[]{2, 2, 2, 2}, 30);
	
	//public static Item example_name;//
	//Ruby
	public static Item ruby_Ingot;
	public static Item ruby_Sword;
	public static Item ruby_Spade;
	public static Item ruby_Axe;
	public static Item ruby_Hoe;
	public static Item ruby_Pickaxe;
	public static ItemArmor ruby_Helmet;
	public static ItemArmor ruby_Chestplate;
	public static ItemArmor ruby_Leggings;
	public static ItemArmor ruby_Boots;
	//Sapphire
	public static Item sapphire_Ingot;
	public static Item sapphire_Sword;
	public static Item sapphire_Spade;
	public static Item sapphire_Axe;
	public static Item sapphire_Hoe;
	public static Item sapphire_Pickaxe;
	public static ItemArmor sapphire_Helmet;
	public static ItemArmor sapphire_Chestplate;
	public static ItemArmor sapphire_Leggings;
	public static ItemArmor sapphire_Boots;
	
	//Ultimate
	public static Item ultimate_Ingot;
	
	//Emerald
	public static Item emerald_Helmet;
	public static Item emerald_Chestplate;
	public static Item emerald_Leggings;
	public static Item emerald_Boots;
	public static Item emerald_Pickaxe;
	public static Item emerald_Sword;
	public static Item emerald_Spade;
	public static Item emerald_Axe;
	public static Item emerald_Hoe;
	
	//Quartz
	public static Item quartz_Helmet;
	public static Item quartz_Chestplate;
	public static Item quartz_Leggings;
	public static Item quartz_Boots;
	public static Item quartz_Pickaxe;
	public static Item quartz_Sword;
	public static Item quartz_Spade;
	public static Item quartz_Axe;
	public static Item quartz_Hoe;

	//Amethyst
	public static Item amethyst_Helmet;
	public static Item amethyst_Chestplate;
	public static Item amethyst_Leggings;
	public static Item amethyst_Boots;
	public static Item amethyst_Pickaxe;
	public static Item amethyst_Sword;
	public static Item amethyst_Spade;
	public static Item amethyst_Axe;
	public static Item amethyst_Hoe;
	public static Item amethyst_Ingot;
	
	//Topaz
	public static Item topaz_Helmet;
	public static Item topaz_Chestplate;
	public static Item topaz_Leggings;
	public static Item topaz_Boots;
	public static Item topaz_Pickaxe;
	public static Item topaz_Sword;
	public static Item topaz_Spade;
	public static Item topaz_Axe;
	public static Item topaz_Hoe;
	public static Item topaz_Ingot;
	
	//Obsidian
	public static Item obsidian_Helmet;
	public static Item obsidian_Chestplate;
	public static Item obsidian_Leggings;
	public static Item obsidian_Boots;
	public static Item obsidian_Pickaxe;
	public static Item obsidian_Sword;
	public static Item obsidian_Spade;
	public static Item obsidian_Axe;
	public static Item obsidian_Hoe;
	public static Item obsidian_Ingot;
	
	//Dusts
	public static Item diamond_Dust;
	public static Item ruby_Dust;
	public static Item sapphire_Dust;
	public static Item emerald_Dust;
	public static Item ultimate_Dust;
	public static Item quartz_Dust;
	public static Item amethyst_Dust;
	public static Item topaz_Dust;
	public static Item obsidian_Dust;


	public static void init() {
		ruby_Ingot = new gems_Ingot("ruby_Ingot");
		ruby_Helmet = new gems_Armor(RUBYARMOR, 0, 0, "ruby_Helmet");
		ruby_Chestplate = new gems_Armor(RUBYARMOR, 0, 1, "ruby_Chestplate");
		ruby_Leggings = new gems_Armor(RUBYARMOR, 0, 2, "ruby_Leggings");
		ruby_Boots = new gems_Armor(RUBYARMOR, 0, 3, "ruby_Boots");
		ruby_Pickaxe = new gems_Pickaxe(RUBY, "ruby_Pickaxe");
		ruby_Sword = new gems_Sword(RUBY, "ruby_Sword");
		ruby_Spade= new gems_Spade(RUBY, "ruby_Spade");
		ruby_Axe = new gems_Axe(RUBY, "ruby_Axe");
		ruby_Hoe = new gems_Hoe(RUBY, "ruby_Hoe");

		sapphire_Ingot = new gems_Ingot("sapphire_Ingot");
		sapphire_Helmet = new gems_Armor(SAPPHIREARMOR, 0, 0, "sapphire_Helmet");
		sapphire_Chestplate = new gems_Armor(SAPPHIREARMOR, 0, 1, "sapphire_Chestplate");
		sapphire_Leggings = new gems_Armor(SAPPHIREARMOR, 0, 2, "sapphire_Leggings");
		sapphire_Boots = new gems_Armor(SAPPHIREARMOR, 0, 3, "sapphire_Boots");
		sapphire_Pickaxe = new gems_Pickaxe(SAPPHIRE, "sapphire_Pickaxe");
		sapphire_Sword = new gems_Sword(SAPPHIRE, "sapphire_Sword");
		sapphire_Spade= new gems_Spade(SAPPHIRE, "sapphire_Spade");
		sapphire_Axe = new gems_Axe(SAPPHIRE, "sapphire_Axe");
		sapphire_Hoe = new gems_Hoe(SAPPHIRE, "sapphire_Hoe");
		
		quartz_Helmet = new gems_Armor(QUARTZARMOR, 0, 0, "quartz_Helmet");
		quartz_Chestplate = new gems_Armor(QUARTZARMOR, 0, 1, "quartz_Chestplate");
		quartz_Leggings = new gems_Armor(QUARTZARMOR, 0, 2, "quartz_Leggings");
		quartz_Boots = new gems_Armor(QUARTZARMOR, 0, 3, "quartz_Boots");
		quartz_Pickaxe = new gems_Pickaxe(QUARTZ, "quartz_Pickaxe");
		quartz_Sword = new gems_Sword(QUARTZ, "quartz_Sword");
		quartz_Axe = new gems_Axe(QUARTZ, "quartz_Axe");
		quartz_Spade = new gems_Spade(QUARTZ, "quartz_Spade");
		quartz_Hoe = new gems_Hoe(QUARTZ, "quartz_Hoe");
		
		emerald_Helmet = new gems_Armor(EMERALDARMOR, 0, 0, "emerald_Helmet");
		emerald_Chestplate = new gems_Armor(EMERALDARMOR, 0, 1, "emerald_Chestplate");
		emerald_Leggings = new gems_Armor(EMERALDARMOR, 0, 2, "emerald_Leggings");
		emerald_Boots = new gems_Armor(EMERALDARMOR, 0, 3, "emerald_Boots");
		emerald_Pickaxe = new gems_Pickaxe(EMERALD, "emerald_Pickaxe");
		emerald_Sword = new gems_Sword(EMERALD, "emerald_Sword");
		emerald_Axe = new gems_Axe(EMERALD, "emerald_Axe");
		emerald_Spade = new gems_Spade(EMERALD, "emerald_Spade");
		emerald_Hoe = new gems_Hoe(EMERALD, "emerald_Hoe");
		
		amethyst_Ingot = new gems_Ingot("amethyst_Ingot");
		amethyst_Helmet = new gems_Armor(AMETHYSTAMOR, 0, 0, "amethyst_Helmet");
		amethyst_Chestplate = new gems_Armor(AMETHYSTAMOR, 0, 1, "amethyst_Chestplate");
		amethyst_Leggings = new gems_Armor(AMETHYSTAMOR, 0, 2, "amethyst_Leggings");
		amethyst_Boots = new gems_Armor(AMETHYSTAMOR, 0, 3, "amethyst_Boots");
		amethyst_Pickaxe = new gems_Pickaxe(AMETHYST, "amethyst_Pickaxe");
		amethyst_Sword = new gems_Sword(AMETHYST, "amethyst_Sword");
		amethyst_Axe = new gems_Axe(AMETHYST, "amethyst_Axe");
		amethyst_Spade = new gems_Spade(AMETHYST, "amethyst_Spade");
		amethyst_Hoe = new gems_Hoe(AMETHYST, "amethyst_Hoe");
		
		topaz_Ingot = new gems_Ingot("topaz_Ingot");
		topaz_Helmet = new gems_Armor(TOPAZARMOR, 0, 0, "topaz_Helmet");
		topaz_Chestplate = new gems_Armor(TOPAZARMOR, 0, 1, "topaz_Chestplate");
		topaz_Leggings = new gems_Armor(TOPAZARMOR, 0, 2, "topaz_Leggings");
		topaz_Boots = new gems_Armor(TOPAZARMOR, 0, 3, "topaz_Boots");
		topaz_Pickaxe = new gems_Pickaxe(TOPAZ, "topaz_Pickaxe");
		topaz_Sword = new gems_Sword(TOPAZ, "topaz_Sword");
		topaz_Axe = new gems_Axe(TOPAZ, "topaz_Axe");
		topaz_Spade = new gems_Spade(TOPAZ, "topaz_Spade");
		topaz_Hoe = new gems_Hoe(TOPAZ, "topaz_Hoe");
		
		obsidian_Ingot = new gems_Ingot("obsidian_Ingot");
		obsidian_Helmet = new gems_Armor(OBSIDIANARMOR, 0, 0, "obsidian_Helmet");
		obsidian_Chestplate = new gems_Armor(OBSIDIANARMOR, 0, 1, "obsidian_Chestplate");
		obsidian_Leggings = new gems_Armor(OBSIDIANARMOR, 0, 2, "obsidian_Leggings");
		obsidian_Boots = new gems_Armor(OBSIDIANARMOR, 0, 3, "obsidian_Boots");
		obsidian_Pickaxe = new gems_Pickaxe(OBSIDIAN, "obsidian_Pickaxe");
		obsidian_Sword = new gems_Sword(OBSIDIAN, "obsidian_Sword");
		obsidian_Axe = new gems_Axe(OBSIDIAN, "obsidian_Axe");
		obsidian_Spade = new gems_Spade(OBSIDIAN, "obsidian_Spade");
		obsidian_Hoe = new gems_Hoe(OBSIDIAN, "obsidian_Hoe");
		
		ultimate_Ingot = new gems_Ingot("ultimate_Ingot");
		
		diamond_Dust = new gems_Dust("diamond_Dust");
		ruby_Dust = new gems_Dust("ruby_Dust");
		sapphire_Dust = new gems_Dust("sapphire_Dust");
		emerald_Dust = new gems_Dust("emerald_Dust");
		quartz_Dust = new gems_Dust("quartz_Dust");
		amethyst_Dust = new gems_Dust("amethyst_Dust");
		topaz_Dust = new gems_Dust("topaz_Dust");
		obsidian_Dust = new gems_Dust("obsidian_Dust");
		ultimate_Dust = new gems_Dust("ultimate_Dust");
	}
	public static void registers(){
		register(ruby_Ingot);
		register(ruby_Sword);
		register(ruby_Spade);
		register(ruby_Axe);
		register(ruby_Hoe);
		register(ruby_Pickaxe);
		register(sapphire_Ingot);
		register(sapphire_Sword);
		register(sapphire_Spade);
		register(sapphire_Axe);
		register(sapphire_Hoe);
		register(sapphire_Pickaxe);
		register(ruby_Helmet);
		register(ruby_Chestplate);
		register(ruby_Leggings);
		register(ruby_Boots);
		register(sapphire_Helmet);
		register(sapphire_Chestplate);
		register(sapphire_Leggings);
		register(sapphire_Boots);
		register(diamond_Dust);
		register(ruby_Dust);
		register(obsidian_Dust);
		register(sapphire_Dust);
		register(emerald_Dust);
		register(quartz_Dust);
		register(amethyst_Dust);
		register(topaz_Dust);
		register(ultimate_Dust);
		register(ultimate_Ingot);
		register(quartz_Helmet);
		register(quartz_Chestplate);
		register(quartz_Leggings);
		register(quartz_Boots);
		register(quartz_Pickaxe);
		register(quartz_Sword);
		register(quartz_Spade);
		register(quartz_Axe);
		register(quartz_Hoe);
		register(emerald_Helmet);
		register(emerald_Chestplate);
		register(emerald_Leggings);
		register(emerald_Boots);
		register(emerald_Pickaxe);
		register(emerald_Sword);
		register(emerald_Spade);
		register(emerald_Axe);
		register(emerald_Hoe);
		register(amethyst_Ingot);
		register(amethyst_Helmet);
		register(amethyst_Chestplate);
		register(amethyst_Leggings);
		register(amethyst_Boots);
		register(amethyst_Pickaxe);
		register(amethyst_Sword);
		register(amethyst_Spade);
		register(amethyst_Axe);
		register(amethyst_Hoe);
		register(topaz_Ingot);
		register(topaz_Helmet);
		register(topaz_Chestplate);
		register(topaz_Leggings);
		register(topaz_Boots);
		register(topaz_Pickaxe);
		register(topaz_Sword);
		register(topaz_Spade);
		register(topaz_Axe);
		register(topaz_Hoe);
		register(obsidian_Ingot);
		register(obsidian_Helmet);
		register(obsidian_Chestplate);
		register(obsidian_Leggings);
		register(obsidian_Boots);
		register(obsidian_Pickaxe);
		register(obsidian_Sword);
		register(obsidian_Spade);
		register(obsidian_Axe);
		register(obsidian_Hoe);
	}
	public static void registerRenders() {
		
		registerRender(ruby_Ingot);
		registerRender(ruby_Sword);
		registerRender(ruby_Spade);
		registerRender(ruby_Axe);
		registerRender(ruby_Hoe);
		registerRender(ruby_Pickaxe);
		registerRender(sapphire_Ingot);
		registerRender(sapphire_Sword);
		registerRender(sapphire_Spade);
		registerRender(sapphire_Axe);
		registerRender(sapphire_Hoe);
		registerRender(sapphire_Pickaxe);
		registerRender(ruby_Helmet);
		registerRender(ruby_Chestplate);
		registerRender(ruby_Leggings);
		registerRender(ruby_Boots);
		registerRender(sapphire_Helmet);
		registerRender(sapphire_Chestplate);
		registerRender(sapphire_Leggings);
		registerRender(sapphire_Boots);
		registerRender(diamond_Dust);
		registerRender(ruby_Dust);
		registerRender(sapphire_Dust);
		registerRender(emerald_Dust);
		registerRender(amethyst_Dust);
		registerRender(topaz_Dust);
		registerRender(ultimate_Dust);
		registerRender(ultimate_Ingot);
		registerRender(quartz_Helmet);
		registerRender(quartz_Chestplate);
		registerRender(quartz_Leggings);
		registerRender(quartz_Boots);
		registerRender(quartz_Pickaxe);
		registerRender(quartz_Sword);
		registerRender(quartz_Spade);
		registerRender(quartz_Axe);
		registerRender(quartz_Hoe);
		registerRender(quartz_Dust);
		registerRender(emerald_Helmet);
		registerRender(emerald_Chestplate);
		registerRender(emerald_Leggings);
		registerRender(emerald_Boots);
		registerRender(emerald_Pickaxe);
		registerRender(emerald_Sword);
		registerRender(emerald_Spade);
		registerRender(emerald_Axe);
		registerRender(emerald_Hoe);
		registerRender(amethyst_Ingot);
		registerRender(amethyst_Helmet);
		registerRender(amethyst_Chestplate);
		registerRender(amethyst_Leggings);
		registerRender(amethyst_Boots);
		registerRender(amethyst_Pickaxe);
		registerRender(amethyst_Sword);
		registerRender(amethyst_Spade);
		registerRender(amethyst_Axe);
		registerRender(amethyst_Hoe);
		registerRender(topaz_Ingot);
		registerRender(topaz_Helmet);
		registerRender(topaz_Chestplate);
		registerRender(topaz_Leggings);
		registerRender(topaz_Boots);
		registerRender(topaz_Pickaxe);
		registerRender(topaz_Sword);
		registerRender(topaz_Spade);
		registerRender(topaz_Axe);
		registerRender(topaz_Hoe);
		registerRender(obsidian_Ingot);
		registerRender(obsidian_Helmet);
		registerRender(obsidian_Chestplate);
		registerRender(obsidian_Leggings);
		registerRender(obsidian_Boots);
		registerRender(obsidian_Pickaxe);
		registerRender(obsidian_Sword);
		registerRender(obsidian_Spade);
		registerRender(obsidian_Axe);
		registerRender(obsidian_Hoe);
		registerRender(obsidian_Dust);
	}
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	public static void register(Item item){
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));

	}
}
