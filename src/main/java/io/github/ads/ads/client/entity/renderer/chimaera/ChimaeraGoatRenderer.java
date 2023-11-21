package io.github.ads.ads.client.entity.renderer.chimaera;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.ads.ads.client.entity.model.chimaera.ChimaeraBodyModel;
import io.github.ads.ads.client.entity.model.chimaera.ChimaeraGoatModel;
import io.github.ads.ads.entity.chimaera.ChimaeraBody;
import io.github.ads.ads.entity.chimaera.ChimaeraGoat;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ChimaeraGoatRenderer extends GeoEntityRenderer<ChimaeraGoat> {
    public ChimaeraGoatRenderer(EntityRendererProvider.Context context) {
        super(context, new ChimaeraGoatModel());
    }

    public RenderType getRenderType(ChimaeraGoat animatable, ResourceLocation texture) {
        return RenderType.entityCutoutNoCull(texture);
    }

    @Override
    public void postRender(PoseStack poseStack, ChimaeraGoat animatable, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        super.postRender(poseStack, animatable, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);

    }
}
