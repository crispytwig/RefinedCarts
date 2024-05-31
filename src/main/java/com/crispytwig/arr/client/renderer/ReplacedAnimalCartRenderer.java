package com.crispytwig.arr.client.renderer;

import com.crispytwig.arr.client.model.ReplacedAnimalCartModel;
import com.crispytwig.arr.entity.ReplacedAnimalCartEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import de.mennomax.astikorcarts.entity.AnimalCartEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.monster.Creeper;
import software.bernie.example.client.model.entity.ReplacedCreeperModel;
import software.bernie.example.entity.ReplacedCreeperEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoReplacedEntityRenderer;

public class ReplacedAnimalCartRenderer extends GeoReplacedEntityRenderer<AnimalCartEntity, ReplacedAnimalCartEntity> {
    public ReplacedAnimalCartRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ReplacedAnimalCartModel(), new ReplacedAnimalCartEntity());
    }

    @Override
    public void preRender(PoseStack poseStack, ReplacedAnimalCartEntity animatable, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        super.preRender(poseStack, animatable, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public int getPackedOverlay(ReplacedAnimalCartEntity animatable, float u, float partialTick) {
        return super.getPackedOverlay(animatable, u, partialTick);
    }
}
