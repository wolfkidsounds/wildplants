package wks.wolfkidsounds.wildplants.render;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.CompatConfig;

public class ModRenderers {

    public ModRenderers() {
    }

    public static void registerBlockCutout() {
        if (CompatConfig.ENABLE_MINECRAFT.get()) {
            RenderTypeLookup.setRenderLayer(ModBlocks.MINECRAFT_WILD_WHEAT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.MINECRAFT_WILD_CARROTS.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.MINECRAFT_WILD_POTATOES.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.MINECRAFT_WILD_BEETROOTS.get(), RenderType.getCutout());
        }

        if (CompatConfig.LOADED_IMMERSIVEENGINEERING && CompatConfig.ENABLE_IMMERSIVEENGINEERING.get()) {
            RenderTypeLookup.setRenderLayer(ModBlocks.IMMERSIVEENGINEERING_WILD_HEMP.get(), RenderType.getCutout());
        }

        if (CompatConfig.LOADED_HARVESTCRAFT && CompatConfig.ENABLE_HARVESTCRAFT.get()) {
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_AGAVE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_AMARANTH.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_ARROWROOT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_ARTICHOKE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_ASPARAGUS.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_BARLEY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_BEAN.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_BELLPEPPER.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_BLACKBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_BLUEBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_BROCCOLI.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_BRUSSELSPROUT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CABBAGE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CACTUSFRUIT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CANDLEBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CANTALOUPE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CASSAVA.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CAULIFLOWER.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CELERY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CHICKPEA.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CHILIPEPPER.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_COFFEEBEAN.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CORN.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_COTTON.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CRANBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_CUCUMBER.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_EGGPLANT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_ELDERBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_FLAX.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_GARLIC.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_GINGER.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_GRAPE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_GREENGRAPE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_HUCKLEBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_JICAMA.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_JUNIPERBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_JUTE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_KALE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_KENAF.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_KIWI.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_KOHLRABI.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_LEEK.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_LENTIL.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_LETTUCE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_MILLET.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_MULBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_MUSTARDSEEDS.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_OATS.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_OKRA.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_ONION.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_PARSNIP.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_PEANUT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_PEAS.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_PINEAPPLE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_QUINOA.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_RADISH.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_RASPBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_RHUBARB.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_RICE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_RUTABAGA.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_RYE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_SCALLION.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_SESAMESEEDS.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_SISAL.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_SOYBEAN.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_SPINACH.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_SPICELEAF.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_STRAWBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_SWEETPOTATO.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_TARO.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_TEALEAF.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_TOMATILLO.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_TOMATO.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_TURNIP.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_WATERCHESTNUT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_WHITEMUSHROOM.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_WINTERSQUASH.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.HARVESTCRAFT_WILD_ZUCCHINI.get(), RenderType.getCutout());
        }

        if (CompatConfig.LOADED_VEGGIEWAY && CompatConfig.ENABLE_VEGGIEWAY.get()) {
            RenderTypeLookup.setRenderLayer(ModBlocks.VEGGIEWAY_WILD_CORN.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.VEGGIEWAY_WILD_LENTIL.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.VEGGIEWAY_WILD_QUINOA.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.VEGGIEWAY_WILD_SOYBEAN.get(), RenderType.getCutout());
        }

        if (CompatConfig.LOADED_SIMPLEFARMING && CompatConfig.ENABLE_SIMPLEFARMING.get()) {
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_CUMIN.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_QUINOA.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_SUNFLOWER.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_CANTALOUPE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_HONEYDEW.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_SQUASH.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_BARLEY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_BROCCOLI.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_CASSAVA.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_CORN.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_COTTON.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_CUCUMBER.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_EGGPLANT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_GINGER.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_GRAPE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_KENAF.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_LETTUCE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_OAT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_ONION.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_PEA.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_PEANUT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_PEPPER.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_RADISH.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_RICE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_RYE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_SORGHUM.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_SOYBEAN.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_SPINACH.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_SWEETPOTATO.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_TOMATO.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_TURNIP.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_YAM.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SIMPLEFARMING_WILD_ZUCCHINI.get(), RenderType.getCutout());
        }
    }
}
