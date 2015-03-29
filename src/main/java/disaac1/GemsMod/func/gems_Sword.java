package disaac1.GemsMod.func;

import disaac1.GemsMod.GemsTab;
import disaac1.GemsMod.MainClass;
import net.minecraft.item.ItemSword;

public class gems_Sword extends ItemSword {

	public gems_Sword(ToolMaterial material, String name) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(MainClass.tabGems);
	}

}
