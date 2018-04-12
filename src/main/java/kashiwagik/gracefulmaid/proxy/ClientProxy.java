package kashiwagik.gracefulmaid.proxy;

import kashiwagik.gracefulmaid.Reference;
import kashiwagik.gracefulmaid.init.ModEntities;
import kashiwagik.gracefulmaid.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.util.ResourceLocation;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInitregisterRenders() {
		ModItems.registerRenders();
	}

	@Override
	public void initregisterRenders() {
		ModEntities.registerRenders();
	}

	@Override
	public void registerModelBakeryVariants() {
		ModelBakery.registerItemVariants(ModItems.cloth,
				new ResourceLocation(Reference.MODID, "cloth_white"),
				new ResourceLocation(Reference.MODID, "cloth_orange"),
				new ResourceLocation(Reference.MODID, "cloth_magenta"),
				new ResourceLocation(Reference.MODID, "cloth_light_blue"),
				new ResourceLocation(Reference.MODID, "cloth_yellow"),
				new ResourceLocation(Reference.MODID, "cloth_lime"),
				new ResourceLocation(Reference.MODID, "cloth_pink"),
				new ResourceLocation(Reference.MODID, "cloth_gray"),
				new ResourceLocation(Reference.MODID, "cloth_silver"),
				new ResourceLocation(Reference.MODID, "cloth_cyan"),
				new ResourceLocation(Reference.MODID, "cloth_purple"),
				new ResourceLocation(Reference.MODID, "cloth_blue"),
				new ResourceLocation(Reference.MODID, "cloth_brown"),
				new ResourceLocation(Reference.MODID, "cloth_green"),
				new ResourceLocation(Reference.MODID, "cloth_red"),
				new ResourceLocation(Reference.MODID, "cloth_black"));

		ModelBakery.registerItemVariants(ModItems.maid_bell,
				new ResourceLocation(Reference.MODID, "maid_bell_white"),
				new ResourceLocation(Reference.MODID, "maid_bell_orange"),
				new ResourceLocation(Reference.MODID, "maid_bell_magenta"),
				new ResourceLocation(Reference.MODID, "maid_bell_light_blue"),
				new ResourceLocation(Reference.MODID, "maid_bell_yellow"),
				new ResourceLocation(Reference.MODID, "maid_bell_lime"),
				new ResourceLocation(Reference.MODID, "maid_bell_pink"),
				new ResourceLocation(Reference.MODID, "maid_bell_gray"),
				new ResourceLocation(Reference.MODID, "maid_bell_silver"),
				new ResourceLocation(Reference.MODID, "maid_bell_cyan"),
				new ResourceLocation(Reference.MODID, "maid_bell_purple"),
				new ResourceLocation(Reference.MODID, "maid_bell_blue"),
				new ResourceLocation(Reference.MODID, "maid_bell_brown"),
				new ResourceLocation(Reference.MODID, "maid_bell_green"),
				new ResourceLocation(Reference.MODID, "maid_bell_red"),
				new ResourceLocation(Reference.MODID, "maid_bell_black"));
	}

}
