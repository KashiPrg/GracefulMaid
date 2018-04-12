package kashiwagik.gracefulmaid.handlers;

import kashiwagik.gracefulmaid.init.ModItems;
import kashiwagik.gracefulmaid.util.Utils;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {

	public static void registerCraftingRecipes() {
		for(int i = 0; i < EnumHandler.ColorTypes.values().length; i++) {
			registerColoredItemRecipe(i);
		}

		Utils.getLogger().info("Registered Crafting Recipes.");
	}

	//16色あるアイテムに対応するレシピ。
	//Recipes for items that have 16 colors
	private static void registerColoredItemRecipe(int meta) {
		GameRegistry.addRecipe(new ItemStack(ModItems.maid_bell, 1, meta), new Object[] {"CGG", " SG", "S C", 'C', new ItemStack(ModItems.cloth, 1, meta), 'G', Items.GOLD_INGOT, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.maid_bell, 1, meta), new Object[] {"GGC", "GS ", "C S", 'G', Items.GOLD_INGOT, 'C', new ItemStack(ModItems.cloth, 1, meta), 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.maid_bell, 1, meta), new Object[] {"GGG", "CSC", " S ", 'G', Items.GOLD_INGOT, 'C', new ItemStack(ModItems.cloth, 1, meta), 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.cloth, 16, meta), new Object[] {"WW", "WW", 'W', new ItemStack(Blocks.WOOL, 1, meta)});
		GameRegistry.addRecipe(new ItemStack(ModItems.cloth, 4, meta), new Object[] {" C ", "CDC", " C ", 'C', ModItems.cloth, 'D', new ItemStack(Items.DYE, 1, 15 - meta)});
		GameRegistry.addRecipe(new ItemStack(ModItems.cloth, 4, meta), new Object[] {"C C", " D ", "C C", 'C', ModItems.cloth, 'D', new ItemStack(Items.DYE, 1, 15 - meta)});
		GameRegistry.addRecipe(new ItemStack(Blocks.WOOL, 1, meta), new Object[] {"CC", "CC", 'C', new ItemStack(ModItems.cloth, 1, meta)});
	}

}
