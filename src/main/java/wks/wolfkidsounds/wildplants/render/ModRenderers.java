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
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.VEGGIEWAY_WILD_COTTON.get(), RenderType.cutout());
        }

        if (CompatConfig.LOADED_HARVESTCRAFT && CompatConfig.ENABLE_HARVESTCRAFT.get()) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_AGAVE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_AMARANTH.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_ARROWROOT.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_ARTICHOKE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_ASPARAGUS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_BARLEY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_BEAN.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_BELLPEPPER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_BLACKBERRY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_BLUEBERRY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_BROCCOLI.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_BRUSSELSPROUT.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CABBAGE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CACTUSFRUIT.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CANDLEBERRY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CANTALOUPE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CASSAVA.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CAULIFLOWER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CELERY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CHICKPEA.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CHILIPEPPER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_COFFEEBEAN.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CORN.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_COTTON.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CRANBERRY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CUCUMBER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_EGGPLANT.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_ELDERBERRY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_FLAX.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_GARLIC.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_GINGER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_GRAPE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_GREENGRAPE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_HUCKLEBERRY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_JICAMA.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_JUNIPERBERRY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_JUTE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_KALE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_KENAF.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_KIWI.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_KOHLRABI.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_LEEK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_LENTIL.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_LETTUCE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_MILLET.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_MULBERRY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_MUSTARDSEEDS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_OATS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_OKRA.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_ONION.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_PARSNIP.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_PEANUT.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_PEAS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_PINEAPPLE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_QUINOA.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_RADISH.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_RASPBERRY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_RHUBARB.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_RICE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_RUTABAGA.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_RYE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_SCALLION.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_SESAMESEEDS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_SISAL.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_SOYBEAN.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_SPINACH.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_SPICELEAF.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_STRAWBERRY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_SWEETPOTATO.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_TARO.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_TEALEAF.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_TOMATILLO.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_TOMATO.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_TURNIP.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_WATERCHESTNUT.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_WHITEMUSHROOM.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_WINTERSQUASH.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_ZUCCHINI.get(), RenderType.cutout());
        }
    }



}
