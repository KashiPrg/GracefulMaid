package kashiwagik.gracefulmaid.init;

import kashiwagik.gracefulmaid.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSounds {

	public static void registerSounds() {

	}

	private static SoundEvent registerSound(String soundName) {
		final ResourceLocation ID = new ResourceLocation(Reference.MODID, soundName);
		return GameRegistry.register(new SoundEvent(ID).setRegistryName(ID));
	}

}
