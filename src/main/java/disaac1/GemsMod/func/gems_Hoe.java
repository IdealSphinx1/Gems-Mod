package disaac1.GemsMod.func;

import disaac1.GemsMod.MainClass;
import net.minecraft.item.ItemHoe;

public class gems_Hoe extends ItemHoe{

	public gems_Hoe(ToolMaterial material, String name) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(MainClass.tabGems);
	}

}
