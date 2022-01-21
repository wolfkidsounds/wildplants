package wks.wolfkidsounds.wildplants.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import wks.wolfkidsounds.wildplants.Wildplants;
import wks.wolfkidsounds.wildplants.config.CompatConfig;
import wks.wolfkidsounds.wildplants.config.features.HarvestcraftConfig;
import wks.wolfkidsounds.wildplants.config.features.ImmersiveEngineeringConfig;
import wks.wolfkidsounds.wildplants.config.features.MinecraftConfig;
import wks.wolfkidsounds.wildplants.world.harvestcraft.HarvestcraftWildplantsGeneration;
import wks.wolfkidsounds.wildplants.world.immersiveengineering.ImmersiveEngineeringWildplantsGeneration;
import wks.wolfkidsounds.wildplants.world.minecraft.MinecraftWildplantsGeneration;


@Mod.EventBusSubscriber(modid = Wildplants.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {

        if ((Boolean) CompatConfig.ENABLE_MINECRAFT.get()) {
            if ((Boolean) MinecraftConfig.WHEAT_ENABLED.get()) { MinecraftWildplantsGeneration.generateWildWheat(event); }
            if ((Boolean) MinecraftConfig.CARROTS_ENABLED.get()) { MinecraftWildplantsGeneration.generateWildCarrots(event); }
            if ((Boolean) MinecraftConfig.POTATOES_ENABLED.get()) { MinecraftWildplantsGeneration.generateWildPotatoes(event); }
            if ((Boolean) MinecraftConfig.BEETROOTS_ENABLED.get()) { MinecraftWildplantsGeneration.generateWildBeetroots(event); }
        }

        if ((Boolean)CompatConfig.LOADED_IMMERSIVEENGINEERING && (Boolean)CompatConfig.ENABLE_IMMERSIVEENGINEERING.get()) {
            if ((Boolean) ImmersiveEngineeringConfig.HEMP_ENABLED.get()) { ImmersiveEngineeringWildplantsGeneration.generateWildHemp(event); }
        }

        if ((Boolean)CompatConfig.LOADED_HARVESTCRAFT && (Boolean)CompatConfig.ENABLE_HARVESTCRAFT.get()) {
            if ((Boolean) HarvestcraftConfig.AGAVE_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildAgave(event); }
            if ((Boolean) HarvestcraftConfig.AMARANTH_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildAmaranth(event); }
            if ((Boolean) HarvestcraftConfig.ARROWROOT_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildArrowroot(event); }
            if ((Boolean) HarvestcraftConfig.ARTICHOKE_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildArtichoke(event); }
            if ((Boolean) HarvestcraftConfig.ASPARAGUS_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildAsparagus(event); }
            if ((Boolean) HarvestcraftConfig.BARLEY_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildBarley(event); }
            if ((Boolean) HarvestcraftConfig.BEAN_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildBean(event); }
            if ((Boolean) HarvestcraftConfig.BELLPEPPER_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildBellpepper(event); }
            if ((Boolean) HarvestcraftConfig.BLACKBERRY_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildBlackberry(event); }
            if ((Boolean) HarvestcraftConfig.BLUEBERRY_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildBlueberry(event); }
            if ((Boolean) HarvestcraftConfig.BROCCOLI_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildBroccoli(event); }
            if ((Boolean) HarvestcraftConfig.BRUSSELSPROUT_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildBrusselsprout(event); }
            if ((Boolean) HarvestcraftConfig.CABBAGE_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildCabbage(event); }
            if ((Boolean) HarvestcraftConfig.CACTUSFRUIT_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildCactusfruit(event); }
            if ((Boolean) HarvestcraftConfig.CANDLEBERRY_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildCandleberry(event); }
            if ((Boolean) HarvestcraftConfig.CANTALOUPE_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildCantaloupe(event); }
            if ((Boolean) HarvestcraftConfig.CASSAVA_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildCassava(event); }
            if ((Boolean) HarvestcraftConfig.CAULIFLOWER_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildCauliflower(event); }
            if ((Boolean) HarvestcraftConfig.CELERY_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildCelery(event); }
            if ((Boolean) HarvestcraftConfig.CHICKPEA_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildChickpea(event); }
            if ((Boolean) HarvestcraftConfig.CHILIPEPPER_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildChilipepper(event); }
            if ((Boolean) HarvestcraftConfig.COFFEEBEAN_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildCoffeebean(event); }
            if ((Boolean) HarvestcraftConfig.CORN_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildCorn(event); }
            if ((Boolean) HarvestcraftConfig.COTTON_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildCotton(event); }
            if ((Boolean) HarvestcraftConfig.CRANBERRY_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildCranberry(event); }
            if ((Boolean) HarvestcraftConfig.CUCUMBER_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildCucumber(event); }
            if ((Boolean) HarvestcraftConfig.EGGPLANT_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildEggplant(event); }
            if ((Boolean) HarvestcraftConfig.ELDERBERRY_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildElderberry(event); }
            if ((Boolean) HarvestcraftConfig.FLAX_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildFlax(event); }
            if ((Boolean) HarvestcraftConfig.GARLIC_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildGarlic(event); }
            if ((Boolean) HarvestcraftConfig.GINGER_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildGinger(event); }
            if ((Boolean) HarvestcraftConfig.GRAPE_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildGrape(event); }
            if ((Boolean) HarvestcraftConfig.GREENGRAPE_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildGreengrape(event); }
            if ((Boolean) HarvestcraftConfig.HUCKLEBERRY_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildHuckleberry(event); }
            if ((Boolean) HarvestcraftConfig.JICAMA_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildJicama(event); }
            if ((Boolean) HarvestcraftConfig.JUNIPERBERRY_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildJuniperberry(event); }
            if ((Boolean) HarvestcraftConfig.JUTE_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildJute(event); }
            if ((Boolean) HarvestcraftConfig.KALE_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildKale(event); }
            if ((Boolean) HarvestcraftConfig.KENAF_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildKenaf(event); }
            if ((Boolean) HarvestcraftConfig.KIWI_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildKiwi(event); }
            if ((Boolean) HarvestcraftConfig.KOHLRABI_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildKohlrabi(event); }
            if ((Boolean) HarvestcraftConfig.LEEK_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildLeek(event); }
            if ((Boolean) HarvestcraftConfig.LENTIL_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildLentil(event); }
            if ((Boolean) HarvestcraftConfig.LETTUCE_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildLettuce(event); }
            if ((Boolean) HarvestcraftConfig.MILLET_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildMillet(event); }
            if ((Boolean) HarvestcraftConfig.MULBERRY_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildMulberry(event); }
            if ((Boolean) HarvestcraftConfig.MUSTARDSEEDS_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildMustardseeds(event); }
            if ((Boolean) HarvestcraftConfig.OATS_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildOats(event); }
            if ((Boolean) HarvestcraftConfig.OKRA_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildOkra(event); }
            if ((Boolean) HarvestcraftConfig.ONION_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildOnion(event); }
            if ((Boolean) HarvestcraftConfig.PARSNIP_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildParsnip(event); }
            if ((Boolean) HarvestcraftConfig.PEANUT_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildPeanut(event); }
            if ((Boolean) HarvestcraftConfig.PEAS_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildPeas(event); }
            if ((Boolean) HarvestcraftConfig.PINEAPPLE_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildPineapple(event); }
            if ((Boolean) HarvestcraftConfig.QUINOA_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildQuinoa(event); }
            if ((Boolean) HarvestcraftConfig.RADISH_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildRadish(event); }
            if ((Boolean) HarvestcraftConfig.RASPBERRY_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildRaspberry(event); }
            if ((Boolean) HarvestcraftConfig.RHUBARB_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildRhubarb(event); }
            if ((Boolean) HarvestcraftConfig.RICE_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildRice(event); }
            if ((Boolean) HarvestcraftConfig.RUTABAGA_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildRutabaga(event); }
            if ((Boolean) HarvestcraftConfig.RYE_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildRye(event); }
            if ((Boolean) HarvestcraftConfig.SCALLION_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildScallion(event); }
            if ((Boolean) HarvestcraftConfig.SESAMESEEDS_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildSesameseeds(event); }
            if ((Boolean) HarvestcraftConfig.SISAL_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildSisal(event); }
            if ((Boolean) HarvestcraftConfig.SOYBEAN_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildSoybean(event); }
            if ((Boolean) HarvestcraftConfig.SPINACH_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildSpinach(event); }
            if ((Boolean) HarvestcraftConfig.SPICELEAF_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildSpiceleaf(event); }
            if ((Boolean) HarvestcraftConfig.STRAWBERRY_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildStrawberry(event); }
            if ((Boolean) HarvestcraftConfig.SWEETPOTATO_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildSweetpotato(event); }
            if ((Boolean) HarvestcraftConfig.TARO_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildTaro(event); }
            if ((Boolean) HarvestcraftConfig.TEALEAF_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildTealeaf(event); }
            if ((Boolean) HarvestcraftConfig.TOMATILLO_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildTomatillo(event); }
            if ((Boolean) HarvestcraftConfig.TOMATO_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildTomato(event); }
            if ((Boolean) HarvestcraftConfig.TURNIP_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildTurnip(event); }
            if ((Boolean) HarvestcraftConfig.WATERCHESTNUT_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildWaterchestnut(event); }
            if ((Boolean) HarvestcraftConfig.WHITEMUSHROOM_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildWhitemushroom(event); }
            if ((Boolean) HarvestcraftConfig.WINTERSQUASH_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildWintersquash(event); }
            if ((Boolean) HarvestcraftConfig.ZUCCHINI_ENABLED.get()) { HarvestcraftWildplantsGeneration.generateWildZucchini(event); }
        }
    }
}
