package disaac1.GemsMod.func;

import disaac1.GemsMod.MainClass;
import net.minecraft.item.ItemPickaxe;

public class gems_Pickaxe extends ItemPickaxe{

	public gems_Pickaxe(ToolMaterial material, String name) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(MainClass.tabGems);
	}

}
