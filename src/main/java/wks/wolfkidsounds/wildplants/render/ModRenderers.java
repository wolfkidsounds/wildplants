package wks.wolfkidsounds.wildplants.render;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import wks.wolfkidsounds.wildplants.block.HarvestcraftModBlocks;
import wks.wolfkidsounds.wildplants.block.ImmersiveEngineeringModBlocks;
import wks.wolfkidsounds.wildplants.block.MinecraftModBlocks;
import wks.wolfkidsounds.wildplants.config.CompatConfig;

public class ModRenderers {

    public ModRenderers() {
    }

    public static void registerBlocks() {
        if ((Boolean)CompatConfig.ENABLE_MINECRAFT.get()) {
            RenderTypeLookup.setRenderLayer(MinecraftModBlocks.WILD_WHEAT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(MinecraftModBlocks.WILD_CARROTS.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(MinecraftModBlocks.WILD_POTATOES.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(MinecraftModBlocks.WILD_BEETROOTS.get(), RenderType.getCutout());
        }

        if ((Boolean)CompatConfig.LOADED_IMMERSIVEENGINEERING && (Boolean)CompatConfig.ENABLE_IMMERSIVEENGINEERING.get()) {
            RenderTypeLookup.setRenderLayer(ImmersiveEngineeringModBlocks.WILD_HEMP.get(), RenderType.getCutout());
        }

        if ((Boolean)CompatConfig.LOADED_HARVESTCRAFT && (Boolean)CompatConfig.ENABLE_HARVESTCRAFT.get()) {
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_AGAVE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_AMARANTH.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_ARROWROOT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_ARTICHOKE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_ASPARAGUS.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_BARLEY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_BEAN.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_BELLPEPPER.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_BLACKBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_BLUEBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_BROCCOLI.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_BRUSSELSPROUT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_CABBAGE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_CACTUSFRUIT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_CANDLEBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_CANTALOUPE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_CASSAVA.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_CAULIFLOWER.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_CELERY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_CHICKPEA.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_CHILIPEPPER.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_COFFEEBEAN.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_CORN.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_COTTON.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_CRANBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_CUCUMBER.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_EGGPLANT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_ELDERBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_FLAX.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_GARLIC.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_GINGER.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_GRAPE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_GREENGRAPE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_HUCKLEBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_JICAMA.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_JUNIPERBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_JUTE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_KALE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_KENAF.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_KIWI.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_KOHLRABI.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_LEEK.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_LENTIL.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_LETTUCE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_MILLET.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_MULBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_MUSTARDSEEDS.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_OATS.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_OKRA.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_ONION.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_PARSNIP.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_PEANUT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_PEAS.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_PINEAPPLE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_QUINOA.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_RADISH.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_RASPBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_RHUBARB.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_RICE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_RUTABAGA.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_RYE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_SCALLION.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_SESAMESEEDS.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_SISAL.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_SOYBEAN.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_SPINACH.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_SPICELEAF.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_STRAWBERRY.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_SWEETPOTATO.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_TARO.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_TEALEAF.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_TOMATILLO.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_TOMATO.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_TURNIP.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_WATERCHESTNUT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_WHITEMUSHROOM.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_WINTERSQUASH.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(HarvestcraftModBlocks.WILD_ZUCCHINI.get(), RenderType.getCutout());
        }
    }



}
