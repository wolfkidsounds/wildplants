package wks.wolfkidsounds.wildplants.render;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.CompatConfig;

public class ModRenderers {

    public ModRenderers() {
    }

    public static void registerBlockCutout() {
        if (CompatConfig.ENABLE_MINECRAFT.get()) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINECRAFT_WILD_WHEAT.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINECRAFT_WILD_CARROTS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINECRAFT_WILD_POTATOES.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINECRAFT_WILD_BEETROOTS.get(), RenderType.cutout());
        }

        if (CompatConfig.LOADED_IMMERSIVEENGINEERING && CompatConfig.ENABLE_IMMERSIVEENGINEERING.get()) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.IMMERSIVEENGINEERING_WILD_HEMP.get(), RenderType.cutout());
        }

        if (CompatConfig.LOADED_VEGGIEWAY && CompatConfig.ENABLE_VEGGIEWAY.get()) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.VEGGIEWAY_WILD_CORN.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.VEGGIEWAY_WILD_LENTIL.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.VEGGIEWAY_WILD_QUINOA.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.VEGGIEWAY_WILD_SOYBEAN.get(), RenderType.cutout());
        }
    }



}
