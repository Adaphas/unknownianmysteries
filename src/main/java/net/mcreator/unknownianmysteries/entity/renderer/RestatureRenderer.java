package net.mcreator.unknownianmysteries.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
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

import net.mcreator.unknownianmysteries.entity.RestatureEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RestatureRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RestatureEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelRestature(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("unknownianmysteries:textures/restature.png");
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
			IVertexBuilder ivertexbuilder = bufferIn
					.getBuffer(RenderType.getEyes(new ResourceLocation("unknownianmysteries:textures/restatureglow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

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
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.left_leg.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.right_leg.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.body.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.body.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
