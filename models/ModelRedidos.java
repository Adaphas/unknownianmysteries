// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelRedidos extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer torso;
	private final ModelRenderer left_legs;
	private final ModelRenderer right_legs;
	private final ModelRenderer tail;
	private final ModelRenderer cube_r1;

	public ModelRedidos() {
		textureWidth = 32;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.setTextureOffset(0, 13).addBox(-2.0F, -11.0F, -6.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(6, 0).addBox(1.0F, -12.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(6, 6).addBox(-2.0F, -12.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 6).addBox(-1.0F, -9.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 24.0F, 0.0F);
		torso.setTextureOffset(0, 0).addBox(-3.0F, -7.0F, -6.0F, 6.0F, 3.0F, 10.0F, 0.0F, false);

		left_legs = new ModelRenderer(this);
		left_legs.setRotationPoint(0.0F, 24.0F, 0.0F);
		left_legs.setTextureOffset(0, 21).addBox(1.0F, -4.0F, -6.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		left_legs.setTextureOffset(20, 13).addBox(1.0F, -4.0F, 2.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		right_legs = new ModelRenderer(this);
		right_legs.setRotationPoint(0.0F, 24.0F, 0.0F);
		right_legs.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, 2.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		right_legs.setTextureOffset(22, 0).addBox(-3.0F, -4.0F, -6.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(11, 16).addBox(-1.0F, -7.0F, -2.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		torso.render(matrixStack, buffer, packedLight, packedOverlay);
		left_legs.render(matrixStack, buffer, packedLight, packedOverlay);
		right_legs.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_legs.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_legs.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}