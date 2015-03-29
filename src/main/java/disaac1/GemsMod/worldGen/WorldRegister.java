package disaac1.GemsMod.worldGen;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WorldRegister {

	public static void MainRegistry(){
		registerWorldGen(new WorldOreGen(),1);
	}
	
	public static void registerWorldGen(IWorldGenerator iGenertor, int weightedProbability){
		GameRegistry.registerWorldGenerator(iGenertor, weightedProbability);
	}
}