package disaac1.GemsMod.func;

import disaac1.GemsMod.MainClass;
import net.minecraft.item.ItemSpade;

public class gems_Spade extends ItemSpade{

	public gems_Spade(ToolMaterial material, String name) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(MainClass.tabGems);
	}

}
