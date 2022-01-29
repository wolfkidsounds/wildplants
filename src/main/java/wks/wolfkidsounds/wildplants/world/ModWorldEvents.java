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

        if ((Boolean) CompatConfig.ENABLE_MINECRAFT.get()) {
            if ((Boolean) MinecraftConfig.WHEAT_ENABLED_MINECRAFT.get()) { MinecraftWildplantsGeneration.generateWildWheat(event); }
            if ((Boolean) MinecraftConfig.CARROTS_ENABLED_MINECRAFT.get()) { MinecraftWildplantsGeneration.generateWildCarrots(event); }
            if ((Boolean) MinecraftConfig.POTATOES_ENABLED_MINECRAFT.get()) { MinecraftWildplantsGeneration.generateWildPotatoes(event); }
            if ((Boolean) MinecraftConfig.BEETROOTS_ENABLED_MINECRAFT.get()) { MinecraftWildplantsGeneration.generateWildBeetroots(event); }
        }

        if ((Boolean)CompatConfig.LOADED_IMMERSIVEENGINEERING && (Boolean)CompatConfig.ENABLE_IMMERSIVEENGINEERING.get()) {
            if ((Boolean) ImmersiveEngineeringConfig.HEMP_ENABLED_IMMERSIVEENINEERING.get()) { ImmersiveEngineeringWildplantsGeneration.generateWildHemp(event); }
        }

        if ((Boolean)CompatConfig.LOADED_HARVESTCRAFT && (Boolean)CompatConfig.ENABLE_HARVESTCRAFT.get()) {
            if ((Boolean) HarvestcraftConfig.AGAVE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildAgave(event); }
            if ((Boolean) HarvestcraftConfig.AMARANTH_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildAmaranth(event); }
            if ((Boolean) HarvestcraftConfig.ARROWROOT_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildArrowroot(event); }
            if ((Boolean) HarvestcraftConfig.ARTICHOKE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildArtichoke(event); }
            if ((Boolean) HarvestcraftConfig.ASPARAGUS_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildAsparagus(event); }
            if ((Boolean) HarvestcraftConfig.BARLEY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildBarley(event); }
            if ((Boolean) HarvestcraftConfig.BEAN_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildBean(event); }
            if ((Boolean) HarvestcraftConfig.BELLPEPPER_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildBellpepper(event); }
            if ((Boolean) HarvestcraftConfig.BLACKBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildBlackberry(event); }
            if ((Boolean) HarvestcraftConfig.BLUEBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildBlueberry(event); }
            if ((Boolean) HarvestcraftConfig.BROCCOLI_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildBroccoli(event); }
            if ((Boolean) HarvestcraftConfig.BRUSSELSPROUT_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildBrusselsprout(event); }
            if ((Boolean) HarvestcraftConfig.CABBAGE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCabbage(event); }
            if ((Boolean) HarvestcraftConfig.CACTUSFRUIT_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCactusfruit(event); }
            if ((Boolean) HarvestcraftConfig.CANDLEBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCandleberry(event); }
            if ((Boolean) HarvestcraftConfig.CANTALOUPE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCantaloupe(event); }
            if ((Boolean) HarvestcraftConfig.CASSAVA_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCassava(event); }
            if ((Boolean) HarvestcraftConfig.CAULIFLOWER_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCauliflower(event); }
            if ((Boolean) HarvestcraftConfig.CELERY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCelery(event); }
            if ((Boolean) HarvestcraftConfig.CHICKPEA_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildChickpea(event); }
            if ((Boolean) HarvestcraftConfig.CHILIPEPPER_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildChilipepper(event); }
            if ((Boolean) HarvestcraftConfig.COFFEEBEAN_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCoffeebean(event); }
            if ((Boolean) HarvestcraftConfig.CORN_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCorn(event); }
            if ((Boolean) HarvestcraftConfig.COTTON_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCotton(event); }
            if ((Boolean) HarvestcraftConfig.CRANBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCranberry(event); }
            if ((Boolean) HarvestcraftConfig.CUCUMBER_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildCucumber(event); }
            if ((Boolean) HarvestcraftConfig.EGGPLANT_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildEggplant(event); }
            if ((Boolean) HarvestcraftConfig.ELDERBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildElderberry(event); }
            if ((Boolean) HarvestcraftConfig.FLAX_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildFlax(event); }
            if ((Boolean) HarvestcraftConfig.GARLIC_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildGarlic(event); }
            if ((Boolean) HarvestcraftConfig.GINGER_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildGinger(event); }
            if ((Boolean) HarvestcraftConfig.GRAPE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildGrape(event); }
            if ((Boolean) HarvestcraftConfig.GREENGRAPE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildGreengrape(event); }
            if ((Boolean) HarvestcraftConfig.HUCKLEBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildHuckleberry(event); }
            if ((Boolean) HarvestcraftConfig.JICAMA_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildJicama(event); }
            if ((Boolean) HarvestcraftConfig.JUNIPERBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildJuniperberry(event); }
            if ((Boolean) HarvestcraftConfig.JUTE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildJute(event); }
            if ((Boolean) HarvestcraftConfig.KALE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildKale(event); }
            if ((Boolean) HarvestcraftConfig.KENAF_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildKenaf(event); }
            if ((Boolean) HarvestcraftConfig.KIWI_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildKiwi(event); }
            if ((Boolean) HarvestcraftConfig.KOHLRABI_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildKohlrabi(event); }
            if ((Boolean) HarvestcraftConfig.LEEK_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildLeek(event); }
            if ((Boolean) HarvestcraftConfig.LENTIL_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildLentil(event); }
            if ((Boolean) HarvestcraftConfig.LETTUCE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildLettuce(event); }
            if ((Boolean) HarvestcraftConfig.MILLET_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildMillet(event); }
            if ((Boolean) HarvestcraftConfig.MULBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildMulberry(event); }
            if ((Boolean) HarvestcraftConfig.MUSTARDSEEDS_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildMustardseeds(event); }
            if ((Boolean) HarvestcraftConfig.OATS_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildOats(event); }
            if ((Boolean) HarvestcraftConfig.OKRA_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildOkra(event); }
            if ((Boolean) HarvestcraftConfig.ONION_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildOnion(event); }
            if ((Boolean) HarvestcraftConfig.PARSNIP_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildParsnip(event); }
            if ((Boolean) HarvestcraftConfig.PEANUT_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildPeanut(event); }
            if ((Boolean) HarvestcraftConfig.PEAS_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildPeas(event); }
            if ((Boolean) HarvestcraftConfig.PINEAPPLE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildPineapple(event); }
            if ((Boolean) HarvestcraftConfig.QUINOA_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildQuinoa(event); }
            if ((Boolean) HarvestcraftConfig.RADISH_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildRadish(event); }
            if ((Boolean) HarvestcraftConfig.RASPBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildRaspberry(event); }
            if ((Boolean) HarvestcraftConfig.RHUBARB_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildRhubarb(event); }
            if ((Boolean) HarvestcraftConfig.RICE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildRice(event); }
            if ((Boolean) HarvestcraftConfig.RUTABAGA_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildRutabaga(event); }
            if ((Boolean) HarvestcraftConfig.RYE_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildRye(event); }
            if ((Boolean) HarvestcraftConfig.SCALLION_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildScallion(event); }
            if ((Boolean) HarvestcraftConfig.SESAMESEEDS_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildSesameseeds(event); }
            if ((Boolean) HarvestcraftConfig.SISAL_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildSisal(event); }
            if ((Boolean) HarvestcraftConfig.SOYBEAN_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildSoybean(event); }
            if ((Boolean) HarvestcraftConfig.SPINACH_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildSpinach(event); }
            if ((Boolean) HarvestcraftConfig.SPICELEAF_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildSpiceleaf(event); }
            if ((Boolean) HarvestcraftConfig.STRAWBERRY_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildStrawberry(event); }
            if ((Boolean) HarvestcraftConfig.SWEETPOTATO_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildSweetpotato(event); }
            if ((Boolean) HarvestcraftConfig.TARO_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildTaro(event); }
            if ((Boolean) HarvestcraftConfig.TEALEAF_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildTealeaf(event); }
            if ((Boolean) HarvestcraftConfig.TOMATILLO_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildTomatillo(event); }
            if ((Boolean) HarvestcraftConfig.TOMATO_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildTomato(event); }
            if ((Boolean) HarvestcraftConfig.TURNIP_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildTurnip(event); }
            if ((Boolean) HarvestcraftConfig.WATERCHESTNUT_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildWaterchestnut(event); }
            if ((Boolean) HarvestcraftConfig.WHITEMUSHROOM_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildWhitemushroom(event); }
            if ((Boolean) HarvestcraftConfig.WINTERSQUASH_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildWintersquash(event); }
            if ((Boolean) HarvestcraftConfig.ZUCCHINI_ENABLED_HARVESTCRAFT.get()) { HarvestcraftWildplantsGeneration.generateWildZucchini(event); }
        }

        if ((Boolean) CompatConfig.ENABLE_MINECRAFT.get()) {
            if ((Boolean) VeggiewayConfig.CORN_ENABLED_VEGGIEWAY.get()) { VeggiewayWildplantsGeneration.generateWildCorn(event); }
            if ((Boolean) VeggiewayConfig.LENTIL_ENABLED_VEGGIEWAY.get()) { VeggiewayWildplantsGeneration.generateWildLentil(event); }
            if ((Boolean) VeggiewayConfig.QUINOA_ENABLED_VEGGIEWAY.get()) { VeggiewayWildplantsGeneration.generateWildQuinoa(event); }
            if ((Boolean) VeggiewayConfig.SOYBEAN_ENABLED_VEGGIEWAY.get()) { VeggiewayWildplantsGeneration.generateWildSoybean(event); }
        }
    }
}
