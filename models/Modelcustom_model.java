// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer center;
	private final ModelRenderer bottom;
	private final ModelRenderer top;
	private final ModelRenderer north;
	private final ModelRenderer south;
	private final ModelRenderer east;
	private final ModelRenderer west;

	public Modelcustom_model() {
		textureWidth = 16;
		textureHeight = 16;

		center = new ModelRenderer(this);
		center.setRotationPoint(0.0F, 24.0F, 0.0F);
		center.setTextureOffset(0, 8).addBox(-2.0F, -8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		bottom = new ModelRenderer(this);
		bottom.setRotationPoint(0.0F, 24.0F, 0.0F);
		bottom.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, 1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bottom.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bottom.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		bottom.setTextureOffset(0, 0).addBox(1.0F, -4.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bottom.setTextureOffset(0, 0).addBox(-2.0F, -4.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bottom.setTextureOffset(0, 0).addBox(1.0F, -3.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bottom.setTextureOffset(0, 0).addBox(1.0F, -3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bottom.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bottom.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		top = new ModelRenderer(this);
		top.setRotationPoint(0.0F, 12.0F, 0.0F);
		setRotationAngle(top, 3.1416F, 0.0F, 0.0F);
		top.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, 1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		top.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		top.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		top.setTextureOffset(0, 0).addBox(1.0F, -4.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		top.setTextureOffset(0, 0).addBox(-2.0F, -4.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		top.setTextureOffset(0, 0).addBox(1.0F, -3.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		top.setTextureOffset(0, 0).addBox(1.0F, -3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		top.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		top.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		north = new ModelRenderer(this);
		north.setRotationPoint(0.0F, 18.0F, -6.0F);
		setRotationAngle(north, -1.5708F, 0.0F, 0.0F);
		north.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, 1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		north.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		north.setTextureOffset(8, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		north.setTextureOffset(0, 0).addBox(1.0F, -4.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		north.setTextureOffset(0, 0).addBox(-2.0F, -4.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		north.setTextureOffset(0, 0).addBox(1.0F, -3.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		north.setTextureOffset(0, 0).addBox(1.0F, -3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		north.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		north.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		south = new ModelRenderer(this);
		south.setRotationPoint(0.0F, 18.0F, 6.0F);
		setRotationAngle(south, 1.5708F, 0.0F, 0.0F);
		south.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, 1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		south.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		south.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		south.setTextureOffset(0, 0).addBox(1.0F, -4.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		south.setTextureOffset(0, 0).addBox(-2.0F, -4.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		south.setTextureOffset(0, 0).addBox(1.0F, -3.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		south.setTextureOffset(0, 0).addBox(1.0F, -3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		south.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		south.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		east = new ModelRenderer(this);
		east.setRotationPoint(6.0F, 18.0F, 0.0F);
		setRotationAngle(east, 1.5708F, 1.5708F, 0.0F);
		east.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, 1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		east.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		east.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		east.setTextureOffset(0, 0).addBox(1.0F, -4.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		east.setTextureOffset(0, 0).addBox(-2.0F, -4.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		east.setTextureOffset(0, 0).addBox(1.0F, -3.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		east.setTextureOffset(0, 0).addBox(1.0F, -3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		east.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		east.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		west = new ModelRenderer(this);
		west.setRotationPoint(-6.0F, 18.0F, 0.0F);
		setRotationAngle(west, 1.5708F, -1.5708F, 0.0F);
		west.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, 1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		west.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		west.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		west.setTextureOffset(0, 0).addBox(1.0F, -4.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		west.setTextureOffset(0, 0).addBox(-2.0F, -4.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		west.setTextureOffset(0, 0).addBox(1.0F, -3.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		west.setTextureOffset(0, 0).addBox(1.0F, -3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		west.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		west.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		center.render(matrixStack, buffer, packedLight, packedOverlay);
		bottom.render(matrixStack, buffer, packedLight, packedOverlay);
		top.render(matrixStack, buffer, packedLight, packedOverlay);
		north.render(matrixStack, buffer, packedLight, packedOverlay);
		south.render(matrixStack, buffer, packedLight, packedOverlay);
		east.render(matrixStack, buffer, packedLight, packedOverlay);
		west.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}