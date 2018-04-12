package kashiwagik.gracefulmaid;

import kashiwagik.gracefulmaid.creativetabs.TabGracefulMaid;
import kashiwagik.gracefulmaid.handlers.RecipeHandler;
import kashiwagik.gracefulmaid.init.ModEntities;
import kashiwagik.gracefulmaid.init.ModItems;
import kashiwagik.gracefulmaid.init.ModSounds;
import kashiwagik.gracefulmaid.proxy.CommonProxy;
import kashiwagik.gracefulmaid.util.Utils;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class GracefulMaid {

	public static final CreativeTabs Tab = new TabGracefulMaid();

	@Mod.Instance(Reference.MODID)
	public static GracefulMaid instance;

	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Utils.getLogger().info("Pre Initialize Started.");
		ModItems.init();
		ModItems.register();
		ModSounds.registerSounds();

		proxy.preInitregisterRenders();
		Utils.getLogger().info("Pre Initialize Finished.");
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		Utils.getLogger().info("Initialize Started.");
		RecipeHandler.registerCraftingRecipes();
		ModEntities.registerEntity();

		proxy.initregisterRenders();
		proxy.registerModelBakeryVariants();
		Utils.getLogger().info("Initialize Finished.");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Utils.getLogger().info("Post Initialize Started.");

		Utils.getLogger().info("Post Initialize Finished.");
	}

}
