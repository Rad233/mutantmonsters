package fuzs.mutantmonsters.client.core;

import com.mojang.blaze3d.vertex.PoseStack;
import fuzs.puzzleslib.util.PuzzlesUtil;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

import java.util.Optional;

public interface ClientAbstractions {
    ClientAbstractions INSTANCE = PuzzlesUtil.loadServiceProvider(ClientAbstractions.class);

    <T extends LivingEntity, M extends EntityModel<T>> boolean onRenderLiving$Pre(LivingEntity entity, LivingEntityRenderer<T, M> renderer, float partialTick, PoseStack poseStack, MultiBufferSource multiBufferSource, int packedLight);

    <T extends LivingEntity, M extends EntityModel<T>> void onRenderLiving$Post(LivingEntity entity, LivingEntityRenderer<T, M> renderer, float partialTick, PoseStack poseStack, MultiBufferSource multiBufferSource, int packedLight);

    <T extends Entity> Optional<Component> getEntityDisplayName(T entity, EntityRenderer<T> renderer, float partialTick, PoseStack poseStack, MultiBufferSource buffer, int packedLight, boolean shouldShowName);
}
