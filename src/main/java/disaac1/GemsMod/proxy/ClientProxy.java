package disaac1.GemsMod.proxy;

import disaac1.GemsMod.init.GemsBlocks;
import disaac1.GemsMod.init.GemsItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders(){
		GemsBlocks.registerRenders();
		GemsItems.registerRenders();
	}
}
