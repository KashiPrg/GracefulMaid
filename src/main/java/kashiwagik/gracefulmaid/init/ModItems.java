package kashiwagik.gracefulmaid.init;

import kashiwagik.gracefulmaid.GracefulMaid;
import kashiwagik.gracefulmaid.Reference;
import kashiwagik.gracefulmaid.handlers.EnumHandler;
import kashiwagik.gracefulmaid.items.ItemCloth;
import kashiwagik.gracefulmaid.items.ItemMaidBell;
import kashiwagik.gracefulmaid.util.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item maid_bell;
	public static Item cloth;

	public static void init() {
		maid_bell = new ItemMaidBell("maid_bell");
		cloth = new ItemCloth("cloth");
	}

	public static void register() {
		registerItem(maid_bell);
		registerItem(cloth);
	}

	public static void registerRenders() {
		for(int i = 0; i < EnumHandler.ColorTypes.values().length; i++) {
			registerRender(maid_bell, i, "maid_bell_" + EnumHandler.ColorTypes.values()[i].getName());
		}
		for(int i = 0; i < EnumHandler.ColorTypes.values().length; i++) {
			registerRender(cloth, i, "cloth_" + EnumHandler.ColorTypes.values()[i].getName());
		}
	}

	public static void registerItem(Item item) {
		item.setCreativeTab(GracefulMaid.Tab);
		GameRegistry.register(item);
		Utils.getLogger().info("Registered item " + item.getUnlocalizedName().substring(5));
	}

	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Registered render for " + item.getUnlocalizedName().substring(5));
	}

	public static void registerRender(Item item, int meta, String filename) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, filename), "inventory"));
		Utils.getLogger().info("Registered render for " + item.getUnlocalizedName().substring(5));
	}

}
