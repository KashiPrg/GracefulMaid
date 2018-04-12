package kashiwagik.gracefulmaid.items;

public class ItemCloth extends ColoredItem {

	public ItemCloth(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		this.setHasSubtypes(true);
	}

}
