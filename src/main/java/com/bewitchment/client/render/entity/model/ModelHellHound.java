package com.bewitchment.client.render.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.math.MathHelper;

/**
 * hellhoundALT - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelHellHound extends ModelBase {
	public ModelRenderer lFrontLeg;
	public ModelRenderer body;
	public ModelRenderer lHindLeg;
	public ModelRenderer rHindLeg;
	public ModelRenderer rFrontLeg;
	public ModelRenderer head;
	public ModelRenderer mane;
	public ModelRenderer neck;
	public ModelRenderer tailThin01;
	public ModelRenderer mane02;
	public ModelRenderer mane01;
	public ModelRenderer tailThin02;
	public ModelRenderer tailThin03;
	public ModelRenderer tailThin04;
	public ModelRenderer tailThin05;
	public ModelRenderer lEar;
	public ModelRenderer rEar;
	public ModelRenderer muzzle;
	public ModelRenderer lowerJaw;
	public ModelRenderer lHorn01;
	public ModelRenderer rHorn01;
	public ModelRenderer lHorn02;
	public ModelRenderer lHorn03a;
	public ModelRenderer lHorn03b;
	public ModelRenderer lHorn03c;
	public ModelRenderer lHorn03d;
	public ModelRenderer lHorn04a;
	public ModelRenderer lHorn04b;
	public ModelRenderer lHorn04c;
	public ModelRenderer lHorn04d;
	public ModelRenderer lHorn05a;
	public ModelRenderer lHorn05b;
	public ModelRenderer lHorn05c;
	public ModelRenderer lHorn05d;
	public ModelRenderer lHorn06;
	public ModelRenderer rHorn02;
	public ModelRenderer rHorn03a;
	public ModelRenderer rHorn03b;
	public ModelRenderer rHorn03c;
	public ModelRenderer rHorn03d;
	public ModelRenderer rHorn04a;
	public ModelRenderer rHorn04b;
	public ModelRenderer rHorn04c;
	public ModelRenderer rHorn04d;
	public ModelRenderer rHorn05a;
	public ModelRenderer rHorn05b;
	public ModelRenderer rHorn05c;
	public ModelRenderer rHorn05d;
	public ModelRenderer rHorn06;

	public ModelHellHound() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.rEar = new ModelRenderer(this, 16, 14);
		this.rEar.mirror = true;
		this.rEar.setRotationPoint(-2.0F, -3.0F, -2.0F);
		this.rEar.addBox(-1.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
		this.rHorn01 = new ModelRenderer(this, 46, 0);
		this.rHorn01.mirror = true;
		this.rHorn01.setRotationPoint(-1.3F, -2.1F, -1.4F);
		this.rHorn01.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		//this.setRotateAngle(rHorn01, -1.0016444577195458F, -0.4553564018453205F, 0.0F);
		this.lHorn05d = new ModelRenderer(this, 52, 12);
		this.lHorn05d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn05d.addBox(-0.7F, -3.0F, -0.3F, 1, 3, 1, 0.0F);
		this.lHorn02 = new ModelRenderer(this, 55, 0);
		this.lHorn02.setRotationPoint(0.0F, -2.5F, -0.1F);
		this.lHorn02.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		//this.setRotateAngle(lHorn02, -0.6108652381980153F, 0.17453292519943295F, 0.0F);
		this.lHorn03b = new ModelRenderer(this, 52, 7);
		this.lHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03b.addBox(-0.8F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		this.lHorn03d = new ModelRenderer(this, 52, 7);
		this.lHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03d.addBox(-0.8F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.rHindLeg = new ModelRenderer(this, 0, 18);
		this.rHindLeg.mirror = true;
		this.rHindLeg.setRotationPoint(-1.5F, 16.0F, 6.0F);
		this.rHindLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.lowerJaw = new ModelRenderer(this, 0, 43);
		this.lowerJaw.setRotationPoint(0.0F, 2.0F, -3.8F);
		this.lowerJaw.addBox(-1.5F, -0.4F, -3.0F, 3, 1, 3, 0.0F);
		this.lHorn03c = new ModelRenderer(this, 52, 7);
		this.lHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03c.addBox(-0.2F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.rHorn03d = new ModelRenderer(this, 52, 7);
		this.rHorn03d.mirror = true;
		this.rHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03d.addBox(-0.8F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.rHorn05d = new ModelRenderer(this, 52, 12);
		this.rHorn05d.mirror = true;
		this.rHorn05d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn05d.addBox(-0.7F, -3.0F, -0.3F, 1, 3, 1, 0.0F);
		this.tailThin01 = new ModelRenderer(this, 20, 33);
		this.tailThin01.setRotationPoint(0.0F, 6.8F, 2.2F);
		this.tailThin01.addBox(-0.5F, -0.5F, -0.5F, 1, 4, 1, 0.0F);
		//this.setRotateAngle(tailThin01, -1.0471975511965976F, 0.0F, 0.0F);
		this.lHorn06 = new ModelRenderer(this, 58, 13);
		this.lHorn06.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.lHorn06.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		//this.setRotateAngle(lHorn06, -0.6283185307179586F, 0.0F, 0.0F);
		this.rFrontLeg = new ModelRenderer(this, 0, 18);
		this.rFrontLeg.mirror = true;
		this.rFrontLeg.setRotationPoint(-1.5F, 16.0F, -4.0F);
		this.rFrontLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.lEar = new ModelRenderer(this, 16, 14);
		this.lEar.setRotationPoint(2.0F, -3.0F, -2.0F);
		this.lEar.addBox(-1.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
		this.tailThin03 = new ModelRenderer(this, 32, 33);
		this.tailThin03.setRotationPoint(0.0F, 4.4F, 0.0F);
		this.tailThin03.addBox(-0.5F, -0.1F, -0.5F, 1, 5, 1, 0.0F);
		//this.setRotateAngle(tailThin03, 0.20943951023931953F, 0.0F, 0.0F);
		this.body = new ModelRenderer(this, 18, 14);
		this.body.setRotationPoint(0.0F, 14.0F, 1.0F);
		this.body.addBox(-3.0F, -2.0F, -3.0F, 6, 9, 6, 0.0F);
		//this.setRotateAngle(body, 1.5707963267948966F, 0.0F, 0.0F);
		this.rHorn05b = new ModelRenderer(this, 52, 12);
		this.rHorn05b.mirror = true;
		this.rHorn05b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn05b.addBox(-0.7F, -3.0F, -0.7F, 1, 3, 1, 0.0F);
		this.head = new ModelRenderer(this, 0, 0);
		this.head.setRotationPoint(0.0F, 13.5F, -8.0F);
		this.head.addBox(-3.0F, -3.0F, -4.0F, 6, 6, 4, 0.0F);
		//this.setRotateAngle(head, 0.091106186954104F, 0.0F, 0.0F);
		this.lHorn05a = new ModelRenderer(this, 52, 12);
		this.lHorn05a.setRotationPoint(0.0F, -2.5F, -0.1F);
		this.lHorn05a.addBox(-0.3F, -3.0F, -0.7F, 1, 3, 1, 0.0F);
		//this.setRotateAngle(lHorn05a, -0.6981317007977318F, 0.3490658503988659F, 0.0F);
		this.lHorn04c = new ModelRenderer(this, 57, 6);
		this.lHorn04c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn04c.addBox(-0.3F, -3.0F, -0.3F, 1, 3, 1, 0.0F);
		this.rHorn03a = new ModelRenderer(this, 52, 7);
		this.rHorn03a.mirror = true;
		this.rHorn03a.setRotationPoint(0.0F, -1.5F, -0.1F);
		this.rHorn03a.addBox(-0.2F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		//this.setRotateAngle(rHorn03a, -0.6981317007977318F, -0.20943951023931953F, 0.0F);
		this.lHorn03a = new ModelRenderer(this, 52, 7);
		this.lHorn03a.setRotationPoint(0.0F, -1.5F, -0.1F);
		this.lHorn03a.addBox(-0.2F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		//this.setRotateAngle(lHorn03a, -0.6981317007977318F, 0.20943951023931953F, 0.0F);
		this.lHindLeg = new ModelRenderer(this, 0, 18);
		this.lHindLeg.setRotationPoint(1.5F, 16.0F, 6.0F);
		this.lHindLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.rHorn04a = new ModelRenderer(this, 57, 6);
		this.rHorn04a.mirror = true;
		this.rHorn04a.setRotationPoint(0.0F, -1.5F, -0.1F);
		this.rHorn04a.addBox(-0.3F, -3.0F, -0.7F, 1, 3, 1, 0.0F);
		//this.setRotateAngle(rHorn04a, -0.6981317007977318F, 0.0F, 0.0F);
		this.mane = new ModelRenderer(this, 21, 0);
		this.mane.setRotationPoint(0.0F, -4.0F, 0.0F);
		this.mane.addBox(-4.0F, -3.5F, -3.01F, 8, 7, 7, 0.0F);
		this.rHorn03b = new ModelRenderer(this, 52, 7);
		this.rHorn03b.mirror = true;
		this.rHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03b.addBox(-0.8F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		this.lHorn01 = new ModelRenderer(this, 46, 0);
		this.lHorn01.setRotationPoint(1.3F, -2.1F, -1.4F);
		this.lHorn01.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		//this.setRotateAngle(lHorn01, -1.0016444577195458F, 0.4553564018453205F, 0.0F);
		this.rHorn04d = new ModelRenderer(this, 57, 6);
		this.rHorn04d.mirror = true;
		this.rHorn04d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn04d.addBox(-0.7F, -3.0F, -0.3F, 1, 3, 1, 0.0F);
		this.tailThin05 = new ModelRenderer(this, 44, 33);
		this.tailThin05.setRotationPoint(0.0F, 1.3F, 0.1F);
		this.tailThin05.addBox(-0.5F, -0.5F, -0.59F, 2, 2, 1, 0.0F);
		//this.setRotateAngle(tailThin05, 0.0F, 0.0F, 0.7853981633974483F);
		this.tailThin02 = new ModelRenderer(this, 26, 33);
		this.tailThin02.setRotationPoint(0.0F, 3.3F, 0.0F);
		this.tailThin02.addBox(-0.5F, -0.1F, -0.5F, 1, 5, 1, 0.0F);
		//this.setRotateAngle(tailThin02, 0.27314402793711257F, 0.0F, 0.0F);
		this.rHorn05c = new ModelRenderer(this, 52, 12);
		this.rHorn05c.mirror = true;
		this.rHorn05c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn05c.addBox(-0.3F, -3.0F, -0.3F, 1, 3, 1, 0.0F);
		this.lHorn05b = new ModelRenderer(this, 52, 12);
		this.lHorn05b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn05b.addBox(-0.7F, -3.0F, -0.7F, 1, 3, 1, 0.0F);
		this.muzzle = new ModelRenderer(this, 0, 10);
		this.muzzle.setRotationPoint(0.0F, 0.7F, -3.9F);
		this.muzzle.addBox(-1.5F, -1.0F, -3.0F, 3, 2, 3, 0.0F);
		this.lHorn04d = new ModelRenderer(this, 57, 6);
		this.lHorn04d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn04d.addBox(-0.7F, -3.0F, -0.3F, 1, 3, 1, 0.0F);
		this.neck = new ModelRenderer(this, 0, 32);
		this.neck.setRotationPoint(0.0F, -5.4F, 0.5F);
		this.neck.addBox(-2.5F, -2.5F, -4.0F, 5, 5, 4, 0.0F);
		//this.setRotateAngle(neck, -1.5707963267948966F, 0.0F, 0.0F);
		this.rHorn02 = new ModelRenderer(this, 55, 0);
		this.rHorn02.mirror = true;
		this.rHorn02.setRotationPoint(0.0F, -2.5F, -0.1F);
		this.rHorn02.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		//this.setRotateAngle(rHorn02, -0.6108652381980153F, -0.17453292519943295F, 0.0F);
		this.rHorn06 = new ModelRenderer(this, 58, 13);
		this.rHorn06.mirror = true;
		this.rHorn06.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.rHorn06.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		//this.setRotateAngle(rHorn06, -0.6283185307179586F, 0.0F, 0.0F);
		this.mane02 = new ModelRenderer(this, 28, 48);
		this.mane02.setRotationPoint(0.0F, -1.0F, 2.7F);
		this.mane02.addBox(-3.5F, -1.0F, 0.0F, 7, 2, 7, 0.0F);
		//this.setRotateAngle(mane02, -1.2915436464758039F, 0.0F, 0.0F);
		this.rHorn04b = new ModelRenderer(this, 57, 6);
		this.rHorn04b.mirror = true;
		this.rHorn04b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn04b.addBox(-0.7F, -3.0F, -0.7F, 1, 3, 1, 0.0F);
		this.rHorn05a = new ModelRenderer(this, 52, 12);
		this.rHorn05a.mirror = true;
		this.rHorn05a.setRotationPoint(0.0F, -2.5F, -0.1F);
		this.rHorn05a.addBox(-0.3F, -3.0F, -0.7F, 1, 3, 1, 0.0F);
		//this.setRotateAngle(rHorn05a, -0.6981317007977318F, -0.3490658503988659F, 0.0F);
		this.mane01 = new ModelRenderer(this, 0, 48);
		this.mane01.setRotationPoint(0.0F, -1.8F, -3.0F);
		this.mane01.addBox(-3.0F, -1.0F, 0.0F, 6, 2, 7, 0.0F);
		//this.setRotateAngle(mane01, 0.4363323129985824F, 0.0F, 0.0F);
		this.lFrontLeg = new ModelRenderer(this, 0, 18);
		this.lFrontLeg.setRotationPoint(1.5F, 16.0F, -4.0F);
		this.lFrontLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.lHorn05c = new ModelRenderer(this, 52, 12);
		this.lHorn05c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn05c.addBox(-0.3F, -3.0F, -0.3F, 1, 3, 1, 0.0F);
		this.lHorn04b = new ModelRenderer(this, 57, 6);
		this.lHorn04b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn04b.addBox(-0.7F, -3.0F, -0.7F, 1, 3, 1, 0.0F);
		this.lHorn04a = new ModelRenderer(this, 57, 6);
		this.lHorn04a.setRotationPoint(0.0F, -1.5F, -0.1F);
		this.lHorn04a.addBox(-0.3F, -3.0F, -0.7F, 1, 3, 1, 0.0F);
		//this.setRotateAngle(lHorn04a, -0.6981317007977318F, 0.0F, 0.0F);
		this.rHorn04c = new ModelRenderer(this, 57, 6);
		this.rHorn04c.mirror = true;
		this.rHorn04c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn04c.addBox(-0.3F, -3.0F, -0.3F, 1, 3, 1, 0.0F);
		this.rHorn03c = new ModelRenderer(this, 52, 7);
		this.rHorn03c.mirror = true;
		this.rHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03c.addBox(-0.2F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.tailThin04 = new ModelRenderer(this, 37, 33);
		this.tailThin04.setRotationPoint(0.0F, 4.3F, 0.0F);
		this.tailThin04.addBox(-1.0F, -0.1F, -0.5F, 2, 2, 1, 0.0F);
		///this.setRotateAngle(tailThin04, 0.20943951023931953F, 0.0F, 0.0F);
		this.head.addChild(this.rEar);
		this.head.addChild(this.rHorn01);
		this.lHorn05a.addChild(this.lHorn05d);
		this.lHorn01.addChild(this.lHorn02);
		this.lHorn03a.addChild(this.lHorn03b);
		this.lHorn03a.addChild(this.lHorn03d);
		this.head.addChild(this.lowerJaw);
		this.lHorn03a.addChild(this.lHorn03c);
		this.rHorn03a.addChild(this.rHorn03d);
		this.rHorn05a.addChild(this.rHorn05d);
		this.body.addChild(this.tailThin01);
		this.lHorn05a.addChild(this.lHorn06);
		this.head.addChild(this.lEar);
		this.tailThin02.addChild(this.tailThin03);
		this.rHorn05a.addChild(this.rHorn05b);
		this.lHorn04a.addChild(this.lHorn05a);
		this.lHorn04a.addChild(this.lHorn04c);
		this.rHorn02.addChild(this.rHorn03a);
		this.lHorn02.addChild(this.lHorn03a);
		this.rHorn03a.addChild(this.rHorn04a);
		this.body.addChild(this.mane);
		this.rHorn03a.addChild(this.rHorn03b);
		this.head.addChild(this.lHorn01);
		this.rHorn04a.addChild(this.rHorn04d);
		this.tailThin04.addChild(this.tailThin05);
		this.tailThin01.addChild(this.tailThin02);
		this.rHorn05a.addChild(this.rHorn05c);
		this.lHorn05a.addChild(this.lHorn05b);
		this.head.addChild(this.muzzle);
		this.lHorn04a.addChild(this.lHorn04d);
		this.body.addChild(this.neck);
		this.rHorn01.addChild(this.rHorn02);
		this.rHorn05a.addChild(this.rHorn06);
		this.mane.addChild(this.mane02);
		this.rHorn04a.addChild(this.rHorn04b);
		this.rHorn04a.addChild(this.rHorn05a);
		this.neck.addChild(this.mane01);
		this.lHorn05a.addChild(this.lHorn05c);
		this.lHorn04a.addChild(this.lHorn04b);
		this.lHorn03a.addChild(this.lHorn04a);
		this.rHorn04a.addChild(this.rHorn04c);
		this.rHorn03a.addChild(this.rHorn03c);
		this.tailThin03.addChild(this.tailThin04);
	}

	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);

		if (this.isChild) {
			float f = 2.0F;
			GlStateManager.pushMatrix();
			GlStateManager.translate(0.0F, 5.0F * scale, 2.0F * scale);
			this.head.renderWithRotation(scale);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.scale(0.5F, 0.5F, 0.5F);
			GlStateManager.translate(0.0F, 24.0F * scale, 0.0F);
			this.body.render(scale);
			this.rFrontLeg.render(scale);
			this.lFrontLeg.render(scale);
			this.rHindLeg.render(scale);
			this.lHindLeg.render(scale);
			this.tailThin01.renderWithRotation(scale);
			this.mane.render(scale);
			GlStateManager.popMatrix();
		} else {
			this.head.renderWithRotation(scale);
			this.body.render(scale);
			this.rFrontLeg.render(scale);
			this.lFrontLeg.render(scale);
			this.rFrontLeg.render(scale);
			this.lFrontLeg.render(scale);
			this.tailThin01.renderWithRotation(scale);
			this.mane.render(scale);
		}
	}

	/**
	 * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
	 * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
	 * "far" arms and legs can swing at most.
	 */
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
		this.head.rotateAngleX = headPitch * 0.017453292F;
		this.head.rotateAngleY = netHeadYaw * 0.017453292F;
		this.tailThin01.rotateAngleX = ageInTicks;
	}
}