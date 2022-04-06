package net.mcreator.unknownianmysteries.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.unknownianmysteries.entity.UnknownianDroneEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class UnknownianDroneRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(UnknownianDroneEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcustom_model(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("unknownianmysteries:textures/texture.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("unknownianmysteries:textures/texture.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

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
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
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

}
