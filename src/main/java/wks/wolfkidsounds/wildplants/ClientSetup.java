package wks.wolfkidsounds.wildplants;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.Configuration;

public class ClientSetup {
    public static void init(final FMLClientSetupEvent event) {

        //MINECRAFT
        if (Configuration.ENABLE_MINECRAFT.get()) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINECRAFT_WILD_WHEAT.get(),  RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINECRAFT_WILD_CARROTS.get(),  RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINECRAFT_WILD_POTATOES.get(),  RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINECRAFT_WILD_BEETROOTS.get(),  RenderType.cutout());
        }

        //IMMERSIVEENGINEERING
        if (Configuration.LOADED_IMMERSIVEENGINEERING) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.IMMERSIVEENGINEERING_WILD_HEMP.get(),  RenderType.cutout());
        }

        //VEGGIE_WAY
        if (Configuration.LOADED_VEGGIE_WAY) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.VEGGIEWAY_WILD_CORN.get(),  RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.VEGGIEWAY_WILD_LENTIL.get(),  RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.VEGGIEWAY_WILD_QUINOA.get(),  RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.VEGGIEWAY_WILD_SOYBEAN.get(),  RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.VEGGIEWAY_WILD_COTTON.get(),  RenderType.cutout());
        }

        //ENHANCEDFARMING
        if (Configuration.LOADED_ENHANCEDFARMING) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENHANCEDFARMING_WILD_MINT.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENHANCEDFARMING_WILD_TOMATO.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENHANCEDFARMING_WILD_CUCUMBER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENHANCEDFARMING_WILD_AUBERGINE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENHANCEDFARMING_WILD_GRAPE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENHANCEDFARMING_WILD_PINEAPPLE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENHANCEDFARMING_WILD_CORN.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENHANCEDFARMING_WILD_ONION.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENHANCEDFARMING_WILD_GARLIC.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENHANCEDFARMING_WILD_LETTUCE.get(), RenderType.cutout());
        }
    }
}
