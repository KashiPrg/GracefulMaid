package kashiwagik.gracefulmaid.client.render;

import kashiwagik.gracefulmaid.Reference;
import kashiwagik.gracefulmaid.client.model.ModelMaid;
import kashiwagik.gracefulmaid.entity.EntityMaid;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMaid extends RenderBiped<EntityMaid> {
	private static final ResourceLocation EntityMaidTextures = new ResourceLocation(Reference.MODID, "textures/entity/maid.png");

    public RenderEntityMaid(RenderManager renderManagerIn)
    {
        super(renderManagerIn, new ModelMaid(), 0.4F);
    }

    protected ResourceLocation getEntityTexture(EntityMaid entity) {
    	return EntityMaidTextures;
    }
}
