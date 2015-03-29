package disaac1.GemsMod;

import disaac1.GemsMod.init.GemsBlocks;
import disaac1.GemsMod.init.GemsItems;
import disaac1.GemsMod.init.GemsRecipes;
import disaac1.GemsMod.proxy.CommonProxy;
import disaac1.GemsMod.worldGen.WorldRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class MainClass {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final GemsTab tabGems = new GemsTab("tabGems");
	

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		GemsBlocks.init();
		GemsBlocks.registers();
		GemsItems.init();
		GemsItems.registers();

	}
	@EventHandler
	public void Init(FMLInitializationEvent event){
		proxy.registerRenders();	
		GemsRecipes.registerRecipe();
		GemsRecipes.RecipeMaster();
		WorldRegister.MainRegistry();
		
	}
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event){
		
	}
}
