package kashiwagik.gracefulmaid.items;

import java.util.List;

import kashiwagik.gracefulmaid.handlers.EnumHandler.ColorTypes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

//布やメイドベルのような、16色あるアイテムの共通事項を一括で扱うスーパークラス。
public class ColoredItem extends Item {

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for(int i = 0; i < ColorTypes.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for(int i = 0; i < ColorTypes.values().length; i++) {
			if(stack.getItemDamage() == i) {
				return this.getUnlocalizedName() + "." + ColorTypes.values()[i].getName();
			}
			else {
				continue;
			}
		}
		return this.getUnlocalizedName() + "." + ColorTypes.WHITE.getName();
	}

}
