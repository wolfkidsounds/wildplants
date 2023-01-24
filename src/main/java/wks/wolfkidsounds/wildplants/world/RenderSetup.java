package wks.wolfkidsounds.wildplants.world;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import wks.wolfkidsounds.wildplants.registry.ModBlocks;

public class RenderSetup
{
	public static void init(final FMLClientSetupEvent event) {

		//Minecraft
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINECRAFT_WILD_WHEAT.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINECRAFT_WILD_CARROTS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINECRAFT_WILD_POTATOES.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINECRAFT_WILD_BEETROOTS.get(), RenderType.cutout());
	}
}
