package wks.wolfkidsounds.wildplants.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import wks.wolfkidsounds.wildplants.Wildplants;
import wks.wolfkidsounds.wildplants.config.CompatConfig;
import wks.wolfkidsounds.wildplants.config.features.enhancedfarming.EnhancedFarmingConfig;
import wks.wolfkidsounds.wildplants.config.features.harvestcraft.HarvestcraftConfig;
import wks.wolfkidsounds.wildplants.config.features.immersiveengineering.ImmersiveEngineeringConfig;
import wks.wolfkidsounds.wildplants.config.features.minecraft.MinecraftConfig;
import wks.wolfkidsounds.wildplants.config.features.simplefarming.SimpleFarmingConfig;
import wks.wolfkidsounds.wildplants.config.features.veggieway.VeggiewayConfig;
import wks.wolfkidsounds.wildplants.world.enhancedfarming.EnhancedFarmingWildplantsGeneration;
import wks.wolfkidsounds.wildplants.world.harvestcraft.HarvestcraftWildplantsGeneration;
import wks.wolfkidsounds.wildplants.world.immersiveengineering.ImmersiveEngineeringWildplantsGeneration;
import wks.wolfkidsounds.wildplants.world.minecraft.MinecraftWildplantsGeneration;
import wks.wolfkidsounds.wildplants.world.simplefarming.SimpleFarmingWildplantsGeneration;
import wks.wolfkidsounds.wildplants.world.veggieway.VeggiewayWildplantsGeneration;


@Mod.EventBusSubscriber(modid = Wildplants.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {

        if (CompatConfig.ENABLE_MINECRAFT.get()) {
            if (MinecraftConfig.WHEAT_ENABLED_MINECRAFT.get()) {
                MinecraftWildplantsGeneration.generateWildWheat(event);
            }
            if (MinecraftConfig.CARROTS_ENABLED_MINECRAFT.get()) {
                MinecraftWildplantsGeneration.generateWildCarrots(event);
            }
            if (MinecraftConfig.POTATOES_ENABLED_MINECRAFT.get()) {
                MinecraftWildplantsGeneration.generateWildPotatoes(event);
            }
            if (MinecraftConfig.BEETROOTS_ENABLED_MINECRAFT.get()) {
                MinecraftWildplantsGeneration.generateWildBeetroots(event);
            }
        }

        if (CompatConfig.LOADED_IMMERSIVEENGINEERING && CompatConfig.ENABLE_IMMERSIVEENGINEERING.get()) {
            if (ImmersiveEngineeringConfig.HEMP_ENABLED_IMMERSIVEENINEERING.get()) {
                ImmersiveEngineeringWildplantsGeneration.generateWildHemp(event);
            }
        }

        if (CompatConfig.LOADED_HARVESTCRAFT && CompatConfig.ENABLE_HARVESTCRAFT.get()) {
            if (HarvestcraftConfig.AGAVE_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildAgave(event);
            }
            if (HarvestcraftConfig.AMARANTH_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildAmaranth(event);
            }
            if (HarvestcraftConfig.ARROWROOT_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildArrowroot(event);
            }
            if (HarvestcraftConfig.ARTICHOKE_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildArtichoke(event);
            }
            if (HarvestcraftConfig.ASPARAGUS_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildAsparagus(event);
            }
            if (HarvestcraftConfig.BARLEY_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildBarley(event);
            }
            if (HarvestcraftConfig.BEAN_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildBean(event);
            }
            if (HarvestcraftConfig.BELLPEPPER_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildBellpepper(event);
            }
            if (HarvestcraftConfig.BLACKBERRY_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildBlackberry(event);
            }
            if (HarvestcraftConfig.BLUEBERRY_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildBlueberry(event);
            }
            if (HarvestcraftConfig.BROCCOLI_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildBroccoli(event);
            }
            if (HarvestcraftConfig.BRUSSELSPROUT_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildBrusselsprout(event);
            }
            if (HarvestcraftConfig.CABBAGE_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildCabbage(event);
            }
            if (HarvestcraftConfig.CACTUSFRUIT_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildCactusfruit(event);
            }
            if (HarvestcraftConfig.CANDLEBERRY_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildCandleberry(event);
            }
            if (HarvestcraftConfig.CANTALOUPE_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildCantaloupe(event);
            }
            if (HarvestcraftConfig.CASSAVA_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildCassava(event);
            }
            if (HarvestcraftConfig.CAULIFLOWER_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildCauliflower(event);
            }
            if (HarvestcraftConfig.CELERY_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildCelery(event);
            }
            if (HarvestcraftConfig.CHICKPEA_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildChickpea(event);
            }
            if (HarvestcraftConfig.CHILIPEPPER_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildChilipepper(event);
            }
            if (HarvestcraftConfig.COFFEEBEAN_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildCoffeebean(event);
            }
            if (HarvestcraftConfig.CORN_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildCorn(event);
            }
            if (HarvestcraftConfig.COTTON_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildCotton(event);
            }
            if (HarvestcraftConfig.CRANBERRY_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildCranberry(event);
            }
            if (HarvestcraftConfig.CUCUMBER_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildCucumber(event);
            }
            if (HarvestcraftConfig.EGGPLANT_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildEggplant(event);
            }
            if (HarvestcraftConfig.ELDERBERRY_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildElderberry(event);
            }
            if (HarvestcraftConfig.FLAX_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildFlax(event);
            }
            if (HarvestcraftConfig.GARLIC_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildGarlic(event);
            }
            if (HarvestcraftConfig.GINGER_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildGinger(event);
            }
            if (HarvestcraftConfig.GRAPE_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildGrape(event);
            }
            if (HarvestcraftConfig.GREENGRAPE_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildGreengrape(event);
            }
            if (HarvestcraftConfig.HUCKLEBERRY_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildHuckleberry(event);
            }
            if (HarvestcraftConfig.JICAMA_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildJicama(event);
            }
            if (HarvestcraftConfig.JUNIPERBERRY_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildJuniperberry(event);
            }
            if (HarvestcraftConfig.JUTE_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildJute(event);
            }
            if (HarvestcraftConfig.KALE_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildKale(event);
            }
            if (HarvestcraftConfig.KENAF_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildKenaf(event);
            }
            if (HarvestcraftConfig.KIWI_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildKiwi(event);
            }
            if (HarvestcraftConfig.KOHLRABI_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildKohlrabi(event);
            }
            if (HarvestcraftConfig.LEEK_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildLeek(event);
            }
            if (HarvestcraftConfig.LENTIL_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildLentil(event);
            }
            if (HarvestcraftConfig.LETTUCE_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildLettuce(event);
            }
            if (HarvestcraftConfig.MILLET_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildMillet(event);
            }
            if (HarvestcraftConfig.MULBERRY_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildMulberry(event);
            }
            if (HarvestcraftConfig.MUSTARDSEEDS_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildMustardseeds(event);
            }
            if (HarvestcraftConfig.OATS_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildOats(event);
            }
            if (HarvestcraftConfig.OKRA_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildOkra(event);
            }
            if (HarvestcraftConfig.ONION_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildOnion(event);
            }
            if (HarvestcraftConfig.PARSNIP_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildParsnip(event);
            }
            if (HarvestcraftConfig.PEANUT_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildPeanut(event);
            }
            if (HarvestcraftConfig.PEAS_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildPeas(event);
            }
            if (HarvestcraftConfig.PINEAPPLE_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildPineapple(event);
            }
            if (HarvestcraftConfig.QUINOA_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildQuinoa(event);
            }
            if (HarvestcraftConfig.RADISH_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildRadish(event);
            }
            if (HarvestcraftConfig.RASPBERRY_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildRaspberry(event);
            }
            if (HarvestcraftConfig.RHUBARB_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildRhubarb(event);
            }
            if (HarvestcraftConfig.RICE_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildRice(event);
            }
            if (HarvestcraftConfig.RUTABAGA_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildRutabaga(event);
            }
            if (HarvestcraftConfig.RYE_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildRye(event);
            }
            if (HarvestcraftConfig.SCALLION_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildScallion(event);
            }
            if (HarvestcraftConfig.SESAMESEEDS_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildSesameseeds(event);
            }
            if (HarvestcraftConfig.SISAL_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildSisal(event);
            }
            if (HarvestcraftConfig.SOYBEAN_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildSoybean(event);
            }
            if (HarvestcraftConfig.SPINACH_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildSpinach(event);
            }
            if (HarvestcraftConfig.SPICELEAF_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildSpiceleaf(event);
            }
            if (HarvestcraftConfig.STRAWBERRY_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildStrawberry(event);
            }
            if (HarvestcraftConfig.SWEETPOTATO_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildSweetpotato(event);
            }
            if (HarvestcraftConfig.TARO_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildTaro(event);
            }
            if (HarvestcraftConfig.TEALEAF_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildTealeaf(event);
            }
            if (HarvestcraftConfig.TOMATILLO_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildTomatillo(event);
            }
            if (HarvestcraftConfig.TOMATO_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildTomato(event);
            }
            if (HarvestcraftConfig.TURNIP_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildTurnip(event);
            }
            if (HarvestcraftConfig.WATERCHESTNUT_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildWaterchestnut(event);
            }
            if (HarvestcraftConfig.WHITEMUSHROOM_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildWhitemushroom(event);
            }
            if (HarvestcraftConfig.WINTERSQUASH_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildWintersquash(event);
            }
            if (HarvestcraftConfig.ZUCCHINI_ENABLED_HARVESTCRAFT.get()) {
                HarvestcraftWildplantsGeneration.generateWildZucchini(event);
            }
        }

        if (CompatConfig.LOADED_VEGGIEWAY && CompatConfig.ENABLE_VEGGIEWAY.get()) {
            if (VeggiewayConfig.CORN_ENABLED_VEGGIEWAY.get()) {
                VeggiewayWildplantsGeneration.generateWildCorn(event);
            }
            if (VeggiewayConfig.LENTIL_ENABLED_VEGGIEWAY.get()) {
                VeggiewayWildplantsGeneration.generateWildLentil(event);
            }
            if (VeggiewayConfig.QUINOA_ENABLED_VEGGIEWAY.get()) {
                VeggiewayWildplantsGeneration.generateWildQuinoa(event);
            }
            if (VeggiewayConfig.SOYBEAN_ENABLED_VEGGIEWAY.get()) {
                VeggiewayWildplantsGeneration.generateWildSoybean(event);
            }
        }

        if (CompatConfig.LOADED_SIMPLEFARMING && CompatConfig.ENABLE_SIMPLEFARMING.get()) {
            if (SimpleFarmingConfig.CUMIN_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildCumin(event);
            }
            if (SimpleFarmingConfig.QUINOA_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildQuinoa(event);
            }
            if (SimpleFarmingConfig.SUNFLOWER_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildSunflower(event);
            }
            if (SimpleFarmingConfig.CANTALOUPE_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildCantaloupe(event);
            }
            if (SimpleFarmingConfig.HONEYDEW_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildHoneydew(event);
            }
            if (SimpleFarmingConfig.SQUASH_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildSquash(event);
            }
            if (SimpleFarmingConfig.BARLEY_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildBarley(event);
            }
            if (SimpleFarmingConfig.BROCCOLI_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildBroccoli(event);
            }
            if (SimpleFarmingConfig.CASSAVA_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildCassava(event);
            }
            if (SimpleFarmingConfig.CORN_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildCorn(event);
            }
            if (SimpleFarmingConfig.COTTON_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildCotton(event);
            }
            if (SimpleFarmingConfig.CUCUMBER_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildCucumber(event);
            }
            if (SimpleFarmingConfig.EGGPLANT_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildEggplant(event);
            }
            if (SimpleFarmingConfig.GINGER_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildGinger(event);
            }
            if (SimpleFarmingConfig.GRAPE_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildGrape(event);
            }
            if (SimpleFarmingConfig.KENAF_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildKenaf(event);
            }
            if (SimpleFarmingConfig.LETTUCE_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildLettuce(event);
            }
            if (SimpleFarmingConfig.OAT_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildOat(event);
            }
            if (SimpleFarmingConfig.ONION_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildOnion(event);
            }
            if (SimpleFarmingConfig.PEA_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildPea(event);
            }
            if (SimpleFarmingConfig.PEANUT_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildPeanut(event);
            }
            if (SimpleFarmingConfig.PEPPER_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildPepper(event);
            }
            if (SimpleFarmingConfig.RADISH_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildRadish(event);
            }
            if (SimpleFarmingConfig.RICE_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildRice(event);
            }
            if (SimpleFarmingConfig.RYE_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildRye(event);
            }
            if (SimpleFarmingConfig.SORGHUM_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildSorghum(event);
            }
            if (SimpleFarmingConfig.SOYBEAN_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildSoybean(event);
            }
            if (SimpleFarmingConfig.SPINACH_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildSpinach(event);
            }
            if (SimpleFarmingConfig.SWEETPOTATO_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildSweetpotato(event);
            }
            if (SimpleFarmingConfig.TOMATO_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildTomato(event);
            }
            if (SimpleFarmingConfig.TURNIP_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildTurnip(event);
            }
            if (SimpleFarmingConfig.YAM_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildYam(event);
            }
            if (SimpleFarmingConfig.ZUCCHINI_ENABLED_SIMPLEFARMING.get()) {
                SimpleFarmingWildplantsGeneration.generateWildZucchini(event);
            }
        }


        if (CompatConfig.LOADED_ENHANCEDFARMING && CompatConfig.ENABLE_ENHANCEDFARMING.get()) {
            if (EnhancedFarmingConfig.MINT_ENABLED_ENHANCEDFARMING.get()) {
                EnhancedFarmingWildplantsGeneration.generateWildMint(event);
            }
            if (EnhancedFarmingConfig.TOMATO_ENABLED_ENHANCEDFARMING.get()) {
                EnhancedFarmingWildplantsGeneration.generateWildTomato(event);
            }
            if (EnhancedFarmingConfig.CUCUMBER_ENABLED_ENHANCEDFARMING.get()) {
                EnhancedFarmingWildplantsGeneration.generateWildCucumber(event);
            }
            if (EnhancedFarmingConfig.AUBERGINE_ENABLED_ENHANCEDFARMING.get()) {
                EnhancedFarmingWildplantsGeneration.generateWildAubergine(event);
            }
            if (EnhancedFarmingConfig.GRAPE_ENABLED_ENHANCEDFARMING.get()) {
                EnhancedFarmingWildplantsGeneration.generateWildGrape(event);
            }
            if (EnhancedFarmingConfig.PINEPAPPLE_ENABLED_ENHANCEDFARMING.get()) {
                EnhancedFarmingWildplantsGeneration.generateWildPineapple(event);
            }
            if (EnhancedFarmingConfig.ONION_ENABLED_ENHANCEDFARMING.get()) {
                EnhancedFarmingWildplantsGeneration.generateWildOnion(event);
            }
            if (EnhancedFarmingConfig.GARLIC_ENABLED_ENHANCEDFARMING.get()) {
                EnhancedFarmingWildplantsGeneration.generateWildGarlic(event);
            }
            if (EnhancedFarmingConfig.CORN_ENABLED_ENHANCEDFARMING.get()) {
                EnhancedFarmingWildplantsGeneration.generateWildCorn(event);
            }
            if (EnhancedFarmingConfig.LETTUCE_ENABLED_ENHANCEDFARMING.get()) {
                EnhancedFarmingWildplantsGeneration.generateWildLettuce(event);
            }
        }
    }
}
