// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelRestature extends EntityModel<Entity> {
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer body;

	public ModelRestature() {
		textureWidth = 64;
		textureHeight = 64;

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		right_leg.setTextureOffset(0, 34).addBox(-6.0F, -5.0F, -1.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		left_leg.setTextureOffset(22, 31).addBox(2.0F, -5.0F, -1.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 21).addBox(-7.0F, -8.0F, -2.0F, 14.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 15).addBox(-7.0F, -17.0F, -2.0F, 14.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-7.0F, -17.0F, 1.0F, 14.0F, 12.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(28, 27).addBox(-6.0F, -10.0F, -1.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 27).addBox(-6.0F, -14.0F, -1.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 31).addBox(-6.0F, -12.0F, 0.0F, 12.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.left_leg.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.body.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.body.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}