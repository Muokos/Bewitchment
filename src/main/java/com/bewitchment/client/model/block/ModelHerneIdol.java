package com.bewitchment.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * idol_hornedhuntsmen - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelHerneIdol extends ModelBase {
	public ModelRenderer plith;
	public ModelRenderer body;
	public ModelRenderer lLeg01;
	public ModelRenderer rLeg01;
	public ModelRenderer chest;
	public ModelRenderer neck;
	public ModelRenderer lLeg02;
	public ModelRenderer rLeg02;
	public ModelRenderer lArm01;
	public ModelRenderer rArm01;
	public ModelRenderer lArm02;
	public ModelRenderer rArm02;
	public ModelRenderer spear;
	public ModelRenderer spearTip;
	public ModelRenderer head;
	public ModelRenderer snouta;
	public ModelRenderer snoutSlope;
	public ModelRenderer lAntler01;
	public ModelRenderer rAntler01;
	public ModelRenderer lEar;
	public ModelRenderer rEar;
	public ModelRenderer snoutb;
	public ModelRenderer lAntler02;
	public ModelRenderer lAntler03;
	public ModelRenderer lAntler05;
	public ModelRenderer lAntler04;
	public ModelRenderer lAntler06;
	public ModelRenderer rAntler02;
	public ModelRenderer rAntler05;
	public ModelRenderer rAntler03;
	public ModelRenderer rAntler04;
	public ModelRenderer rAntler06;
	public ModelRenderer lEarb;
	public ModelRenderer rEarb;
	
	public ModelHerneIdol() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.lLeg02 = new ModelRenderer(this, 0, 21);
		this.lLeg02.setRotationPoint(-0.2F, 3.2F, 2.3F);
		this.lLeg02.addBox(-1.0F, -1.2F, -1.2F, 2, 8, 2, 0.0F);
		this.lArm02 = new ModelRenderer(this, 0, 0);
		this.lArm02.mirror = true;
		this.lArm02.setRotationPoint(0.1F, 4.0F, 0.0F);
		this.lArm02.addBox(-1.0F, -0.7F, -0.9F, 2, 5, 2, 0.0F);
		this.setRotateAngle(lArm02, -1.2217304763960306F, 0.05235987755982988F, 0.08726646259971647F);
		this.rAntler06 = new ModelRenderer(this, 57, 0);
		this.rAntler06.mirror = true;
		this.rAntler06.setRotationPoint(0.0F, -0.3F, 0.0F);
		this.rAntler06.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rAntler06, 0.9250245035569946F, -0.5235987755982988F, 0.0F);
		this.rLeg01 = new ModelRenderer(this, 0, 12);
		this.rLeg01.mirror = true;
		this.rLeg01.setRotationPoint(-1.4F, 2.1F, 0.5F);
		this.rLeg01.addBox(-1.0F, -0.8F, -1.4F, 2, 6, 3, 0.0F);
		this.setRotateAngle(rLeg01, -0.2617993877991494F, 0.13962634015954636F, 0.13962634015954636F);
		this.rAntler01 = new ModelRenderer(this, 57, 0);
		this.rAntler01.mirror = true;
		this.rAntler01.setRotationPoint(-1.3F, -4.0F, -0.4F);
		this.rAntler01.addBox(-0.5F, -1.6F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rAntler01, -0.6981317007977318F, 0.0F, -0.3665191429188092F);
		this.lAntler04 = new ModelRenderer(this, 57, 0);
		this.lAntler04.setRotationPoint(0.0F, -1.8F, 0.0F);
		this.lAntler04.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lAntler04, 0.2617993877991494F, 0.0F, -0.2792526803190927F);
		this.rAntler05 = new ModelRenderer(this, 57, 0);
		this.rAntler05.mirror = true;
		this.rAntler05.setRotationPoint(0.0F, -1.5F, 0.0F);
		this.rAntler05.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rAntler05, 1.3962634015954636F, -0.3490658503988659F, 0.0F);
		this.lAntler03 = new ModelRenderer(this, 57, 0);
		this.lAntler03.setRotationPoint(0.0F, -1.9F, 0.0F);
		this.lAntler03.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lAntler03, 0.2617993877991494F, 0.0F, -0.3141592653589793F);
		this.lAntler02 = new ModelRenderer(this, 57, 0);
		this.lAntler02.setRotationPoint(0.0F, -1.5F, 0.0F);
		this.lAntler02.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lAntler02, -0.3141592653589793F, 0.0F, 0.22689280275926282F);
		this.snoutb = new ModelRenderer(this, 34, 0);
		this.snoutb.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.snoutb.addBox(-1.3F, -1.0F, -1.7F, 1, 2, 2, 0.0F);
		this.rEar = new ModelRenderer(this, 20, 28);
		this.rEar.mirror = true;
		this.rEar.setRotationPoint(-1.6F, -2.8F, 0.0F);
		this.rEar.addBox(-2.0F, -0.8F, -0.7F, 2, 1, 1, 0.0F);
		this.setRotateAngle(rEar, 0.5235987755982988F, 0.08726646259971647F, 0.45378560551852565F);
		this.lAntler05 = new ModelRenderer(this, 57, 0);
		this.lAntler05.setRotationPoint(0.0F, -0.1F, 0.0F);
		this.lAntler05.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lAntler05, 1.3962634015954636F, 0.3490658503988659F, 0.0F);
		this.rLeg02 = new ModelRenderer(this, 0, 21);
		this.rLeg02.mirror = true;
		this.rLeg02.setRotationPoint(0.0F, 2.9F, 2.5F);
		this.rLeg02.addBox(-1.0F, -1.2F, -1.2F, 2, 8, 2, 0.0F);
		this.rArm01 = new ModelRenderer(this, 0, 0);
		this.rArm01.setRotationPoint(-2.9F, -3.0F, 0.3F);
		this.rArm01.addBox(-1.0F, -0.7F, -1.0F, 2, 5, 2, 0.0F);
		this.setRotateAngle(rArm01, -0.20943951023931953F, 0.0F, 0.2617993877991494F);
		this.lLeg01 = new ModelRenderer(this, 0, 12);
		this.lLeg01.setRotationPoint(1.6F, 1.9F, 0.5F);
		this.lLeg01.addBox(-1.2F, -0.8F, -1.4F, 2, 6, 3, 0.0F);
		this.setRotateAngle(lLeg01, -0.5410520681182421F, -0.2617993877991494F, 0.0F);
		this.lAntler01 = new ModelRenderer(this, 57, 0);
		this.lAntler01.setRotationPoint(1.3F, -4.0F, -0.4F);
		this.lAntler01.addBox(-0.5F, -1.6F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lAntler01, -0.6981317007977318F, 0.0F, 0.3665191429188092F);
		this.head = new ModelRenderer(this, 40, 0);
		this.head.setRotationPoint(0.01F, -2.0F, 0.0F);
		this.head.addBox(-2.0F, -4.0F, -2.0F, 4, 4, 4, 0.0F);
		this.snoutSlope = new ModelRenderer(this, 25, 4);
		this.snoutSlope.setRotationPoint(0.0F, -2.7F, -1.9F);
		this.snoutSlope.addBox(-1.0F, -0.5F, -2.3F, 2, 1, 3, 0.0F);
		this.setRotateAngle(snoutSlope, 0.2792526803190927F, 0.0F, 0.0F);
		this.lAntler06 = new ModelRenderer(this, 57, 0);
		this.lAntler06.setRotationPoint(0.0F, -0.3F, 0.0F);
		this.lAntler06.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lAntler06, 0.9250245035569946F, 0.5235987755982988F, 0.0F);
		this.snouta = new ModelRenderer(this, 25, 0);
		this.snouta.setRotationPoint(0.0F, -1.1F, -2.3F);
		this.snouta.addBox(-0.7F, -1.0F, -1.7F, 2, 2, 2, 0.0F);
		this.rEarb = new ModelRenderer(this, 20, 28);
		this.rEarb.mirror = true;
		this.rEarb.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rEarb.addBox(-2.0F, -0.2F, -0.7F, 2, 1, 1, 0.0F);
		this.rAntler04 = new ModelRenderer(this, 57, 0);
		this.rAntler04.mirror = true;
		this.rAntler04.setRotationPoint(0.0F, -1.8F, 0.0F);
		this.rAntler04.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rAntler04, 0.2617993877991494F, 0.0F, 0.2792526803190927F);
		this.rAntler02 = new ModelRenderer(this, 57, 0);
		this.rAntler02.mirror = true;
		this.rAntler02.setRotationPoint(0.0F, -1.5F, 0.0F);
		this.rAntler02.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rAntler02, -0.3141592653589793F, 0.0F, -0.22689280275926282F);
		this.lArm01 = new ModelRenderer(this, 0, 0);
		this.lArm01.mirror = true;
		this.lArm01.setRotationPoint(2.9F, -3.0F, 0.3F);
		this.lArm01.addBox(-1.0F, -0.7F, -1.0F, 2, 5, 2, 0.0F);
		this.setRotateAngle(lArm01, -0.9948376736367678F, 0.0F, -0.5410520681182421F);
		this.chest = new ModelRenderer(this, 19, 14);
		this.chest.setRotationPoint(0.0F, -2.8F, 0.6F);
		this.chest.addBox(-3.0F, -3.6F, -2.0F, 6, 4, 4, 0.0F);
		this.spearTip = new ModelRenderer(this, 43, 30);
		this.spearTip.mirror = true;
		this.spearTip.setRotationPoint(0.0F, 0.0F, 8.2F);
		this.spearTip.addBox(-0.51F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
		this.setRotateAngle(spearTip, 0.7853981633974483F, 0.0F, 0.0F);
		this.plith = new ModelRenderer(this, 0, 0);
		this.plith.setRotationPoint(0.0F, 24.1F, 0.0F);
		this.plith.addBox(-4.0F, -4.1F, -4.0F, 8, 4, 8, 0.0F);
		this.lEar = new ModelRenderer(this, 20, 28);
		this.lEar.setRotationPoint(1.6F, -2.8F, 1.3F);
		this.lEar.addBox(0.0F, -0.8F, -0.7F, 2, 1, 1, 0.0F);
		this.setRotateAngle(lEar, 0.5235987755982988F, -0.08726646259971647F, -0.45378560551852565F);
		this.rArm02 = new ModelRenderer(this, 0, 0);
		this.rArm02.setRotationPoint(0.0F, 3.9F, 0.0F);
		this.rArm02.addBox(-1.0F, -0.7F, -0.9F, 2, 5, 2, 0.0F);
		this.setRotateAngle(rArm02, -0.7853981633974483F, -0.5410520681182421F, -0.08726646259971647F);
		this.body = new ModelRenderer(this, 27, 22);
		this.body.setRotationPoint(0.0F, 9.2F, 0.4F);
		this.body.addBox(-2.5F, -2.7F, -0.9F, 5, 5, 3, 0.0F);
		this.neck = new ModelRenderer(this, 47, 12);
		this.neck.setRotationPoint(0.0F, -6.1F, 0.6F);
		this.neck.addBox(-2.0F, -2.6F, -1.5F, 4, 3, 3, 0.0F);
		this.setRotateAngle(neck, 0.0F, 0.5235987755982988F, 0.0F);
		this.spear = new ModelRenderer(this, 27, 14);
		this.spear.mirror = true;
		this.spear.setRotationPoint(-0.1F, 3.4F, 0.0F);
		this.spear.addBox(-0.5F, -0.5F, -8.6F, 1, 1, 17, 0.0F);
		this.setRotateAngle(spear, 0.08726646259971647F, -0.12217304763960307F, -0.6981317007977318F);
		this.rAntler03 = new ModelRenderer(this, 57, 0);
		this.rAntler03.mirror = true;
		this.rAntler03.setRotationPoint(0.0F, -1.9F, 0.0F);
		this.rAntler03.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rAntler03, 0.2617993877991494F, 0.0F, 0.3141592653589793F);
		this.lEarb = new ModelRenderer(this, 20, 28);
		this.lEarb.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lEarb.addBox(0.0F, -0.2F, -0.7F, 2, 1, 1, 0.0F);
		this.lLeg01.addChild(this.lLeg02);
		this.lArm01.addChild(this.lArm02);
		this.rAntler03.addChild(this.rAntler06);
		this.body.addChild(this.rLeg01);
		this.head.addChild(this.rAntler01);
		this.lAntler03.addChild(this.lAntler04);
		this.rAntler01.addChild(this.rAntler05);
		this.lAntler02.addChild(this.lAntler03);
		this.lAntler01.addChild(this.lAntler02);
		this.snouta.addChild(this.snoutb);
		this.head.addChild(this.rEar);
		this.lAntler02.addChild(this.lAntler05);
		this.rLeg01.addChild(this.rLeg02);
		this.chest.addChild(this.rArm01);
		this.body.addChild(this.lLeg01);
		this.head.addChild(this.lAntler01);
		this.neck.addChild(this.head);
		this.head.addChild(this.snoutSlope);
		this.lAntler03.addChild(this.lAntler06);
		this.head.addChild(this.snouta);
		this.rEar.addChild(this.rEarb);
		this.rAntler03.addChild(this.rAntler04);
		this.rAntler01.addChild(this.rAntler02);
		this.chest.addChild(this.lArm01);
		this.body.addChild(this.chest);
		this.spear.addChild(this.spearTip);
		this.head.addChild(this.lEar);
		this.rArm01.addChild(this.rArm02);
		this.body.addChild(this.neck);
		this.rArm02.addChild(this.spear);
		this.rAntler02.addChild(this.rAntler03);
		this.lEar.addChild(this.lEarb);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.plith.render(f5);
		this.body.render(f5);
	}
	
	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
