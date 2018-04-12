package kashiwagik.gracefulmaid.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * ModelMaid by Unknown
 */
@SideOnly(Side.CLIENT)
public class ModelMaid extends ModelBiped {
    public ModelRenderer MaidRightLeg;
    public ModelRenderer MaidLeftLeg;
    public ModelRenderer MaidBody;
    public ModelRenderer MaidHead;
    public ModelRenderer HeadDress;
    public ModelRenderer BackHair;
    public ModelRenderer Knot;
    public ModelRenderer BackHairTail;
    public ModelRenderer MaidRightArm;
    public ModelRenderer MaidLeftArm;
    public ModelRenderer MaidSkirtForward;
    public ModelRenderer MaidSkirtBack;
    public ModelRenderer MaidSkirtLeft;
    public ModelRenderer MaidSkirtRight;

    public ModelMaid() {

    	super(0.0F, 0.0F, 64, 64);

        this.MaidRightLeg = new ModelRenderer(this, 44, 14);
        this.MaidRightLeg.setRotationPoint(-1.5F, 14.0F, 0.0F);
        this.MaidRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 4);
        this.MaidLeftLeg = new ModelRenderer(this, 44, 14);
        this.MaidLeftLeg.setRotationPoint(1.5F, 14.0F, 0.0F);
        this.MaidLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 4);
        this.MaidLeftLeg.mirror = true;
        this.MaidBody = new ModelRenderer(this, 34, 0);
        this.MaidBody.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.MaidBody.addBox(-3.0F, 0.0F, -1.5F, 6, 10, 3);
        this.MaidHead = new ModelRenderer(this, 0, 0);
        this.MaidHead.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.MaidHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.HeadDress = new ModelRenderer(this, 0, 33);
        this.HeadDress.setRotationPoint(0.0F, -4.2F, 0.0F);
        this.HeadDress.addBox(-4.5F, -4.0F, -3.5F, 9, 4, 7);
        this.MaidHead.addChild(this.HeadDress);
        this.BackHair = new ModelRenderer(this, 0, 17);
        this.BackHair.setRotationPoint(0.0F, -7.0F, 3.5F);
        this.BackHair.addBox(-4.0F, -1.0F, -0.5F, 8, 14, 1);
        this.setRotationAngles(this.BackHair, 0.08726646259971647F, 0.0F, 0.0F);
        this.MaidHead.addChild(this.BackHair);
        this.Knot = new ModelRenderer(this, 19, 17);
        this.Knot.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.Knot.addBox(-1.0F, 0.0F, -0.5F, 2, 1, 1);
        this.BackHair.addChild(this.Knot);
        this.BackHairTail = new ModelRenderer(this, 19, 20);
        this.BackHairTail.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.BackHairTail.addBox(-1.5F, 0.0F, -0.5F, 3, 2, 1);
        this.Knot.addChild(this.BackHairTail);
        this.MaidRightArm = new ModelRenderer(this, 34, 14);
        this.MaidRightArm.setRotationPoint(-4.0F, 5.3F, 0.0F);
        this.MaidRightArm.addBox(-1.0F, -1.3F, -1.0F, 2, 10, 2);
        this.setRotationAngles(this.MaidRightArm, 0.0F, 0.0F, 0.10000736647217022F);
        this.MaidLeftArm = new ModelRenderer(this, 34, 14);
        this.MaidLeftArm.setRotationPoint(4.0F, 5.3F, 0.0F);
        this.MaidLeftArm.addBox(-1.0F, -1.3F, -1.0F, 2, 10, 2);
        this.MaidLeftArm.mirror = true;
        this.setRotationAngles(this.MaidLeftArm, 0.0F, 0.0F, -0.10000736647217022F);
        this.MaidSkirtForward = new ModelRenderer(this, 26, 27);
        this.MaidSkirtForward.setRotationPoint(0.0F, 11.0F, -1.5F);
        this.MaidSkirtForward.addBox(-3.5F, 0.0F, -0.5F, 7, 11, 1);
        this.setRotationAngles(this.MaidSkirtForward, -0.17453292519943295F, 0.0F, 0.0F);
        this.MaidSkirtBack = new ModelRenderer(this, 48, 29);
        this.MaidSkirtBack.setRotationPoint(0.0F, 11.0F, 1.5F);
        this.MaidSkirtBack.addBox(-3.5F, 0.0F, -0.5F, 7, 11, 1);
        this.setRotationAngles(this.MaidSkirtBack, 0.17453292519943295F, 0.0F, 0.0F);
        this.MaidSkirtLeft = new ModelRenderer(this, 33, 40);
        this.MaidSkirtLeft.setRotationPoint(3.0F, 11.0F, 0.0F);
        this.MaidSkirtLeft.addBox(-0.5F, 0.0F, -2.0F, 1, 11, 4);
        this.MaidSkirtLeft.mirror = true;
        this.setRotationAngles(this.MaidSkirtLeft, 0.0F, 0.0F, -0.17453292519943295F);
        this.MaidSkirtRight = new ModelRenderer(this, 33, 40);
        this.MaidSkirtRight.setRotationPoint(-3.0F, 11.0F, 0.0F);
        this.MaidSkirtRight.addBox(-0.5F, 0.0F, -2.0F, 1, 11, 4);
        this.setRotationAngles(this.MaidSkirtRight, 0.0F, 0.0F, 0.17453292519943295F);

        this.bipedHead = this.MaidHead;
    	this.bipedBody = this.MaidBody;
        this.bipedRightArm = this.MaidRightArm;
        this.bipedLeftArm = this.MaidLeftArm;
        this.bipedRightLeg = this.MaidRightLeg;
        this.bipedLeftLeg = this.MaidLeftLeg;
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float rotationYaw, float rotationPitch, float scale) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.MaidRightLeg.render(scale);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.MaidLeftLeg.render(scale);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.MaidBody.render(scale);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.MaidHead.render(scale);
        GlStateManager.disableBlend();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.MaidRightArm.offsetX, this.MaidRightArm.offsetY, this.MaidRightArm.offsetZ);
        GlStateManager.translate(this.MaidRightArm.rotationPointX * scale, this.MaidRightArm.rotationPointY * scale, this.MaidRightArm.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.MaidRightArm.offsetX, -this.MaidRightArm.offsetY, -this.MaidRightArm.offsetZ);
        GlStateManager.translate(-this.MaidRightArm.rotationPointX * scale, -this.MaidRightArm.rotationPointY * scale, -this.MaidRightArm.rotationPointZ * scale);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.MaidRightArm.render(scale);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.MaidLeftArm.offsetX, this.MaidLeftArm.offsetY, this.MaidLeftArm.offsetZ);
        GlStateManager.translate(this.MaidLeftArm.rotationPointX * scale, this.MaidLeftArm.rotationPointY * scale, this.MaidLeftArm.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.MaidLeftArm.offsetX, -this.MaidLeftArm.offsetY, -this.MaidLeftArm.offsetZ);
        GlStateManager.translate(-this.MaidLeftArm.rotationPointX * scale, -this.MaidLeftArm.rotationPointY * scale, -this.MaidLeftArm.rotationPointZ * scale);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.MaidLeftArm.render(scale);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.MaidSkirtForward.offsetX, this.MaidSkirtForward.offsetY, this.MaidSkirtForward.offsetZ);
        GlStateManager.translate(this.MaidSkirtForward.rotationPointX * scale, this.MaidSkirtForward.rotationPointY * scale, this.MaidSkirtForward.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.MaidSkirtForward.offsetX, -this.MaidSkirtForward.offsetY, -this.MaidSkirtForward.offsetZ);
        GlStateManager.translate(-this.MaidSkirtForward.rotationPointX * scale, -this.MaidSkirtForward.rotationPointY * scale, -this.MaidSkirtForward.rotationPointZ * scale);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.MaidSkirtForward.render(scale);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.MaidSkirtBack.offsetX, this.MaidSkirtBack.offsetY, this.MaidSkirtBack.offsetZ);
        GlStateManager.translate(this.MaidSkirtBack.rotationPointX * scale, this.MaidSkirtBack.rotationPointY * scale, this.MaidSkirtBack.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.MaidSkirtBack.offsetX, -this.MaidSkirtBack.offsetY, -this.MaidSkirtBack.offsetZ);
        GlStateManager.translate(-this.MaidSkirtBack.rotationPointX * scale, -this.MaidSkirtBack.rotationPointY * scale, -this.MaidSkirtBack.rotationPointZ * scale);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.MaidSkirtBack.render(scale);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.MaidSkirtLeft.offsetX, this.MaidSkirtLeft.offsetY, this.MaidSkirtLeft.offsetZ);
        GlStateManager.translate(this.MaidSkirtLeft.rotationPointX * scale, this.MaidSkirtLeft.rotationPointY * scale, this.MaidSkirtLeft.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.MaidSkirtLeft.offsetX, -this.MaidSkirtLeft.offsetY, -this.MaidSkirtLeft.offsetZ);
        GlStateManager.translate(-this.MaidSkirtLeft.rotationPointX * scale, -this.MaidSkirtLeft.rotationPointY * scale, -this.MaidSkirtLeft.rotationPointZ * scale);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.MaidSkirtLeft.render(scale);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.MaidSkirtRight.offsetX, this.MaidSkirtRight.offsetY, this.MaidSkirtRight.offsetZ);
        GlStateManager.translate(this.MaidSkirtRight.rotationPointX * scale, this.MaidSkirtRight.rotationPointY * scale, this.MaidSkirtRight.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.MaidSkirtRight.offsetX, -this.MaidSkirtRight.offsetY, -this.MaidSkirtRight.offsetZ);
        GlStateManager.translate(-this.MaidSkirtRight.rotationPointX * scale, -this.MaidSkirtRight.rotationPointY * scale, -this.MaidSkirtRight.rotationPointZ * scale);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.MaidSkirtRight.render(scale);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    public void setRotationAngles(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
