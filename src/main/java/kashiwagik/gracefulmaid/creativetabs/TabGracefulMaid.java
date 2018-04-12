package kashiwagik.gracefulmaid.creativetabs;

import kashiwagik.gracefulmaid.Reference;
import kashiwagik.gracefulmaid.handlers.EnumHandler;
import kashiwagik.gracefulmaid.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TabGracefulMaid extends CreativeTabs {

	public TabGracefulMaid() {
		super(Reference.MODID);
	}

	//クリエイティブタブのアイコンを赤いメイドベル(メタ値14)に設定している
	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack() {
		return new ItemStack(ModItems.maid_bell, 1, EnumHandler.ColorTypes.RED.getID());
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return null;
	}
}
