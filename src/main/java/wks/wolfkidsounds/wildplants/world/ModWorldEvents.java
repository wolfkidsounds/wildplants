package wks.wolfkidsounds.wildplants.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import wks.wolfkidsounds.wildplants.Wildplants;
import wks.wolfkidsounds.wildplants.config.CompatConfig;
import wks.wolfkidsounds.wildplants.config.features.HarvestcraftConfig;
import wks.wolfkidsounds.wildplants.config.features.ImmersiveEngineeringConfig;
import wks.wolfkidsounds.wildplants.config.features.MinecraftConfig;
import wks.wolfkidsounds.wildplants.config.features.VeggiewayConfig;
import wks.wolfkidsounds.wildplants.world.harvestcraft.HarvestcraftWildplantsGeneration;
import wks.wolfkidsounds.wildplants.world.immersiveengineering.ImmersiveEngineeringWildplantsGeneration;
import wks.wolfkidsounds.wildplants.world.minecraft.MinecraftWildplantsGeneration;
import wks.wolfkidsounds.wildplants.world.veggieway.VeggiewayWildplantsGeneration;


@Mod.EventBusSubscriber(modid = Wildplants.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {

        if (CompatConfig.ENABLE_MINECRAFT.get()) {
            if (MinecraftConfig.WHEAT_ENABLED_MINECRAFT.get()) { MinecraftWildplantsGeneration.generateWildWheat(event); }
            if (MinecraftConfig.CARROTS_ENABLED_MINECRAFT.get()) { MinecraftWildplantsGeneration.generateWildCarrots(event); }
            if (MinecraftConfig.POTATOES_ENABLED_MINECRAFT.get()) { MinecraftWildplantsGeneration.generateWildPotatoes(event); }
            if (MinecraftConfig.BEETROOTS_ENABLED_MINECRAFT.get()) { MinecraftWildplantsGeneration.generateWildBeetroots(event); }
        }

        if (CompatConfig.LOADED_IMMERSIVEENGINEERING && CompatConfig.ENABLE_IMMERSIVEENGINEERING.get()) {
            if (ImmersiveEngineeringConfig.HEMP_ENABLED_IMMERSIVEENINEERING.get()) { ImmersiveEngineeringWildplantsGeneration.generateWildHemp(event); }
        }

        if (CompatConfig.LOADED_HARVESTCRAFT && CompatConfig.ENABLE_HARVESTCRAFT.get()) {
            if (HarvestcraftConfig.AGAVE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildAgave(event); }
            if (HarvestcraftConfig.AMARANTH_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildAmaranth(event); }
            if (HarvestcraftConfig.ARROWROOT_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildArrowroot(event); }
            if (HarvestcraftConfig.ARTICHOKE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildArtichoke(event); }
            if (HarvestcraftConfig.ASPARAGUS_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildAsparagus(event); }
            if (HarvestcraftConfig.BARLEY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildBarley(event); }
            if (HarvestcraftConfig.BEAN_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildBean(event); }
            if (HarvestcraftConfig.BELLPEPPER_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildBellpepper(event); }
            if (HarvestcraftConfig.BLACKBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildBlackberry(event); }
            if (HarvestcraftConfig.BLUEBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildBlueberry(event); }
            if (HarvestcraftConfig.BROCCOLI_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildBroccoli(event); }
            if (HarvestcraftConfig.BRUSSELSPROUT_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildBrusselsprout(event); }
            if (HarvestcraftConfig.CABBAGE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCabbage(event); }
            if (HarvestcraftConfig.CACTUSFRUIT_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCactusfruit(event); }
            if (HarvestcraftConfig.CANDLEBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCandleberry(event); }
            if (HarvestcraftConfig.CANTALOUPE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCantaloupe(event); }
            if (HarvestcraftConfig.CASSAVA_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCassava(event); }
            if (HarvestcraftConfig.CAULIFLOWER_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCauliflower(event); }
            if (HarvestcraftConfig.CELERY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCelery(event); }
            if (HarvestcraftConfig.CHICKPEA_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildChickpea(event); }
            if (HarvestcraftConfig.CHILIPEPPER_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildChilipepper(event); }
            if (HarvestcraftConfig.COFFEEBEAN_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCoffeebean(event); }
            if (HarvestcraftConfig.CORN_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCorn(event); }
            if (HarvestcraftConfig.COTTON_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCotton(event); }
            if (HarvestcraftConfig.CRANBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCranberry(event); }
            if (HarvestcraftConfig.CUCUMBER_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCucumber(event); }
            if (HarvestcraftConfig.EGGPLANT_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildEggplant(event); }
            if (HarvestcraftConfig.ELDERBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildElderberry(event); }
            if (HarvestcraftConfig.FLAX_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildFlax(event); }
            if (HarvestcraftConfig.GARLIC_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildGarlic(event); }
            if (HarvestcraftConfig.GINGER_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildGinger(event); }
            if (HarvestcraftConfig.GRAPE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildGrape(event); }
            if (HarvestcraftConfig.GREENGRAPE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildGreengrape(event); }
            if (HarvestcraftConfig.HUCKLEBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildHuckleberry(event); }
            if (HarvestcraftConfig.JICAMA_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildJicama(event); }
            if (HarvestcraftConfig.JUNIPERBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildJuniperberry(event); }
            if (HarvestcraftConfig.JUTE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildJute(event); }
            if (HarvestcraftConfig.KALE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildKale(event); }
            if (HarvestcraftConfig.KENAF_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildKenaf(event); }
            if (HarvestcraftConfig.KIWI_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildKiwi(event); }
            if (HarvestcraftConfig.KOHLRABI_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildKohlrabi(event); }
            if (HarvestcraftConfig.LEEK_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildLeek(event); }
            if (HarvestcraftConfig.LENTIL_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildLentil(event); }
            if (HarvestcraftConfig.LETTUCE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildLettuce(event); }
            if (HarvestcraftConfig.MILLET_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildMillet(event); }
            if (HarvestcraftConfig.MULBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildMulberry(event); }
            if (HarvestcraftConfig.MUSTARDSEEDS_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildMustardseeds(event); }
            if (HarvestcraftConfig.OATS_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildOats(event); }
            if (HarvestcraftConfig.OKRA_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildOkra(event); }
            if (HarvestcraftConfig.ONION_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildOnion(event); }
            if (HarvestcraftConfig.PARSNIP_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildParsnip(event); }
            if (HarvestcraftConfig.PEANUT_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildPeanut(event); }
            if (HarvestcraftConfig.PEAS_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildPeas(event); }
            if (HarvestcraftConfig.PINEAPPLE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildPineapple(event); }
            if (HarvestcraftConfig.QUINOA_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildQuinoa(event); }
            if (HarvestcraftConfig.RADISH_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildRadish(event); }
            if (HarvestcraftConfig.RASPBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildRaspberry(event); }
            if (HarvestcraftConfig.RHUBARB_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildRhubarb(event); }
            if (HarvestcraftConfig.RICE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildRice(event); }
            if (HarvestcraftConfig.RUTABAGA_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildRutabaga(event); }
            if (HarvestcraftConfig.RYE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildRye(event); }
            if (HarvestcraftConfig.SCALLION_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildScallion(event); }
            if (HarvestcraftConfig.SESAMESEEDS_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildSesameseeds(event); }
            if (HarvestcraftConfig.SISAL_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildSisal(event); }
            if (HarvestcraftConfig.SOYBEAN_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildSoybean(event); }
            if (HarvestcraftConfig.SPINACH_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildSpinach(event); }
            if (HarvestcraftConfig.SPICELEAF_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildSpiceleaf(event); }
            if (HarvestcraftConfig.STRAWBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildStrawberry(event); }
            if (HarvestcraftConfig.SWEETPOTATO_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildSweetpotato(event); }
            if (HarvestcraftConfig.TARO_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildTaro(event); }
            if (HarvestcraftConfig.TEALEAF_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildTealeaf(event); }
            if (HarvestcraftConfig.TOMATILLO_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildTomatillo(event); }
            if (HarvestcraftConfig.TOMATO_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildTomato(event); }
            if (HarvestcraftConfig.TURNIP_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildTurnip(event); }
            if (HarvestcraftConfig.WATERCHESTNUT_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildWaterchestnut(event); }
            if (HarvestcraftConfig.WHITEMUSHROOM_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildWhitemushroom(event); }
            if (HarvestcraftConfig.WINTERSQUASH_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildWintersquash(event); }
            if (HarvestcraftConfig.ZUCCHINI_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildZucchini(event); }
        }

        if (CompatConfig.LOADED_VEGGIEWAY && CompatConfig.ENABLE_VEGGIEWAY.get()) {
            if (VeggiewayConfig.CORN_ENABLED_VEGGIEWAY.get()) { VeggiewayWildplantsGeneration.generateWildCorn(event); }
            if (VeggiewayConfig.LENTIL_ENABLED_VEGGIEWAY.get()) { VeggiewayWildplantsGeneration.generateWildLentil(event); }
            if (VeggiewayConfig.QUINOA_ENABLED_VEGGIEWAY.get()) { VeggiewayWildplantsGeneration.generateWildQuinoa(event); }
            if (VeggiewayConfig.SOYBEAN_ENABLED_VEGGIEWAY.get()) { VeggiewayWildplantsGeneration.generateWildSoybean(event); }
        }
    }
}
