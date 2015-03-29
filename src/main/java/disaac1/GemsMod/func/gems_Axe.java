package disaac1.GemsMod.func;

import disaac1.GemsMod.MainClass;
import net.minecraft.item.ItemAxe;

public class gems_Axe extends ItemAxe {

	public gems_Axe(ToolMaterial material, String name) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(MainClass.tabGems);
	}

}
