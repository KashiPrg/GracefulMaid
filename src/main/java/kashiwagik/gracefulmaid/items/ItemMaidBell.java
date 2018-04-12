package kashiwagik.gracefulmaid.items;

public class ItemMaidBell extends ColoredItem {

	public ItemMaidBell(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		this.setHasSubtypes(true);
	}

}
