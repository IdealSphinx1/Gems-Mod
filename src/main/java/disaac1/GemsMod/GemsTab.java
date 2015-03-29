package disaac1.GemsMod;

import disaac1.GemsMod.init.GemsItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GemsTab extends CreativeTabs{

	public GemsTab(String label) {
		super(label);
		this.setBackgroundImageName("GemsTab.png");
	}

	@Override
	public Item getTabIconItem() {
	
		return GemsItems.ruby_Ingot;
	}

}
