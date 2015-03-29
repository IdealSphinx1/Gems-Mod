package disaac1.GemsMod.func;

import disaac1.GemsMod.MainClass;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class gems_Armor extends ItemArmor {

	public gems_Armor(ArmorMaterial material, int renderIndex, int armorType, String name) {
		super(material, renderIndex, armorType);
		this.setUnlocalizedName(name);
		this.setCreativeTab(MainClass.tabGems);
	}

}
