package wks.wolfkidsounds.wildplants;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.Configuration;

public class ClientSetup {
    public static void init(final FMLClientSetupEvent event) {
        if (Configuration.ENABLE_MINECRAFT.get()) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINECRAFT_WILD_WHEAT.get(),  RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINECRAFT_WILD_CARROTS.get(),  RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINECRAFT_WILD_POTATOES.get(),  RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINECRAFT_WILD_BEETROOTS.get(),  RenderType.cutout());
        }

        if (Configuration.ENABLE_IMMERSIVEENGINEERING.get() && Configuration.LOADED_IMMERSIVEENGINEERING) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.IMMERSIVEENGINEERING_WILD_HEMP.get(),  RenderType.cutout());
        }
    }
}
