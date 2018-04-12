package kashiwagik.gracefulmaid.init;

import java.util.BitSet;

import kashiwagik.gracefulmaid.GracefulMaid;
import kashiwagik.gracefulmaid.client.render.RenderEntityMaid;
import kashiwagik.gracefulmaid.entity.EntityMaid;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityList;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {

	private static final ModEntities INSTANCE = new ModEntities();
	private BitSet availableIndicies;

	public static ModEntities instance() {
		return INSTANCE;
	}

	private ModEntities() {
		availableIndicies = new BitSet(256);
		availableIndicies.set(1, 255);
		for(Object id : EntityList.ID_TO_CLASS.keySet()) {
			availableIndicies.clear((Integer)id);
		}
	}

	public static int findGlobalUniqueEntityID() {
		int res = instance().availableIndicies.nextSetBit(0);
		if(res < 0) {
			throw new RuntimeException("No more entity indicies left");
		}
		return res;
	}

	public static void registerEntity() {
		createEntity(EntityMaid.class, "maid", 0x222222, 0xf5f5f5);
	}

	public static void registerRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityMaid.class, new RenderEntityMaid(Minecraft.getMinecraft().getRenderManager()));
	}

	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		int randomID = findGlobalUniqueEntityID();
		EntityRegistry.registerModEntity(entityClass, entityName, randomID, GracefulMaid.instance, 64, 1, true, solidColor, spotColor);
	}

}
