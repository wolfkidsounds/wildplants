package wks.wolfkidsounds.wildplants.event;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import wks.wolfkidsounds.wildplants.Wildplants;
import wks.wolfkidsounds.wildplants.config.*;
import wks.wolfkidsounds.wildplants.world.WildCropGeneration;

@Mod.EventBusSubscriber(modid = Wildplants.MOD_ID)
public class CommonEvents {

    @SubscribeEvent
    public static void onBiomeLoad(BiomeLoadingEvent event) {
        BiomeGenerationSettingsBuilder builder = event.getGeneration();
        Biome.ClimateSettings climate = event.getClimate();

        boolean cold = climate.temperature >= 0.0F && climate.temperature <= 0.3F;
        boolean temperate = climate.temperature >= 0.3F && climate.temperature <= 0.6F;
        boolean warm = climate.temperature >= 0.6F && climate.temperature <= 0.9F;
        boolean tropical = climate.temperature >= 0.6F && climate.temperature <= 1.0F && climate.downfall >= 0.8F;
        boolean arid = climate.temperature >= 1.0F && climate.downfall <= 0.1F;
        boolean mushroom = event.getCategory().equals(Biome.BiomeCategory.MUSHROOM);
        boolean sandy = event.getCategory().equals(Biome.BiomeCategory.DESERT) || event.getCategory().equals(Biome.BiomeCategory.BEACH);


        //CLIMATE CHECKER
        if (mushroom) {
            Wildplants.LOGGER.debug("Found Biomes: MUSHROOM");
        }

        if (sandy) {
            Wildplants.LOGGER.debug("Found Biomes: SANDY");
            //Wildplants.LOGGER.debug(mushroom);
        }

        if (temperate) {
            Wildplants.LOGGER.debug("Found Biomes: TEMPERATE");
            //Wildplants.LOGGER.debug(temperate);
        }

        if (warm) {
            Wildplants.LOGGER.debug("Found Biomes: WARM");
            //Wildplants.LOGGER.debug(warm);
        }

        if (cold) {
            Wildplants.LOGGER.debug("Found Biomes: COLD");
            //Wildplants.LOGGER.debug(cold);
        }

        if (arid) {
            Wildplants.LOGGER.debug("Found Biomes: ARID");
            //Wildplants.LOGGER.debug(arid);
        }


        if (tropical) {
            Wildplants.LOGGER.debug("Found Biomes: TROPICAL");
            //Wildplants.LOGGER.debug(tropical);
        }

        //----------------------------------------------------------

        //CLIMATE_MINECRAFT
        if (Configuration.ENABLE_MINECRAFT.get()) {
            Wildplants.LOGGER.debug("LOADED:MINECRAFT");
            //TEMPERATE NORM

            if (temperate) {
                if (MinecraftConfig.GENERATE_MINECRAFT_WILD_WHEAT.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_MINECRAFT_WHEAT);
                }
                if (MinecraftConfig.GENERATE_MINECRAFT_WILD_CARROTS.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_MINECRAFT_CARROTS);
                }
                if (MinecraftConfig.GENERATE_MINECRAFT_WILD_POTATOES.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_MINECRAFT_POTATOES);
                }
            }

            //SANDY
            if (sandy) {
                if (MinecraftConfig.GENERATE_MINECRAFT_WILD_BEETROOTS.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_MINECRAFT_BEETROOTS);
                }
            }
            Wildplants.LOGGER.debug("register-minecraft-biome-config");
        }

        //CLIMATE_IMMERSIVEENGINEERING
        if (Configuration.ENABLE_IMMERSIVEENGINEERING.get() && Configuration.LOADED_IMMERSIVEENGINEERING) {
            Wildplants.LOGGER.debug("LOADED:IMMERSIVEENGINEERING");
            //TEMPERATE NORM
            if (temperate) {
                if (ImmersiveEngineeringConfig.GENERATE_IMMERSIVEENGINEERING_WILD_HEMP.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_IMMERSIVEENGINEERING_HEMP);
                }
            }
            Wildplants.LOGGER.debug("register-immersiveengineering-biome-config");
        }

        //CLIMATE_VEGGIE_WAY
        if (Configuration.ENABLE_VEGGIE_WAY.get() && Configuration.LOADED_VEGGIE_WAY) {
            Wildplants.LOGGER.debug("LOADED:VEGGIEWAY");
            //TEMPERATE NORM
            if (temperate) {
                if (VeggieWayConfig.GENERATE_VEGGIEWAY_WILD_LENTIL.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_VEGGIE_WAY_LENTIL);
                }
                if (VeggieWayConfig.GENERATE_VEGGIEWAY_WILD_QUINOA.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_VEGGIE_WAY_QUINOA);
                }
            }

            //TEMPERATE WARM
            if (warm) {
                if (VeggieWayConfig.GENERATE_VEGGIEWAY_WILD_CORN.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_VEGGIE_WAY_CORN);
                }
                if (VeggieWayConfig.GENERATE_VEGGIEWAY_WILD_SOYBEAN.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_VEGGIE_WAY_SOYBEAN);
                }
                if (VeggieWayConfig.GENERATE_VEGGIEWAY_WILD_COTTON.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_VEGGIE_WAY_COTTON);
                }
            }
            Wildplants.LOGGER.debug("register-veggie_way-biome-config");
        }

        //CLIMATE_ENHANCEDFARMING
        if (Configuration.ENABLE_ENHANCEDFARMING.get() && Configuration.LOADED_ENHANCEDFARMING) {
            Wildplants.LOGGER.debug("FOUND:EnhancedFarming");
            //TEMPERATE
            if (temperate) {
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_MINT.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_MINT);
                    Wildplants.LOGGER.debug("PLANT:ENHANCEDFARMING:TEMPERATE:MINT");
                }
            }

            if (warm) {
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_TOMATO.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_TOMATO);
                    Wildplants.LOGGER.debug("PLANT:ENHANCEDFARMING:WARM:TOMATO");
                }
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_CUCUMBER.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_CUCUMBER);
                    Wildplants.LOGGER.debug("PLANT:ENHANCEDFARMING:WARM:CUCUMBER");
                }
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_AUBERGINE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_AUBERGINE);
                    Wildplants.LOGGER.debug("PLANT:ENHANCEDFARMING:WARM:AUBERGINE");
                }
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_GRAPE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_GRAPE);
                    Wildplants.LOGGER.debug("PLANT:ENHANCEDFARMING:WARM:GRAPE");
                }
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_CORN.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_CORN);
                    Wildplants.LOGGER.debug("PLANT:ENHANCEDFARMING:WARM:CORN");
                }
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_ONION.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_ONION);
                    Wildplants.LOGGER.debug("PLANT:ENHANCEDFARMING:WARM:ONION");
                }
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_GARLIC.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_GARLIC);
                    Wildplants.LOGGER.debug("PLANT:ENHANCEDFARMING:WARM:GARLIC");
                }
            }

            if (tropical) {
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_PINEAPPLE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_PINEAPPLE);
                    Wildplants.LOGGER.debug("PLANT:ENHANCEDFARMING:TROPICAL:PINEAPPLE");
                }
            }

            if (cold) {
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_LETTUCE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_LETTUCE);
                    Wildplants.LOGGER.debug("PLANT:ENHANCEDFARMING:COLD:LETTUCE");
                }
            }
            Wildplants.LOGGER.debug("register-enhancedfarming-biome-config");
        }

        //CLIMATE_HARVESTCRAFT
        if (Configuration.ENABLE_HARVESTCRAFT.get() && Configuration.LOADED_HARVESTCRAFT) {
            Wildplants.LOGGER.debug("FOUND:Harvestcraft");
            if (mushroom) {
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_WHITEMUSHROOM.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_WHITEMUSHROOM);
                }
            }

            if (temperate) {
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_BLACKBERRY.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_BLACKBERRY);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_BLUEBERRY.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_BLUEBERRY);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_CRANBERRY.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_CRANBERRY);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_ELDERBERRY.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_ELDERBERRY);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_HUCKLEBERRY.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_HUCKLEBERRY);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_KIWI.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_KIWI);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_MULBERRY.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_MULBERRY);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_RASPBERRY.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_RASPBERRY);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_TEALEAF.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_TEALEAF);
                }
            }

            if (warm) {
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_AMARANTH.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_AMARANTH);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_ARTICHOKE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_ARTICHOKE);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_BEAN.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_BEAN);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_BELLPEPPER.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_BELLPEPPER);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_CANDLEBERRY.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_CANDLEBERRY);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_CANTALOUPE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_CANTALOUPE);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_CHICKPEA.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_CHICKPEA);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_CHILIPEPPER.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_CHILIPEPPER);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_CORN.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_CORN);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_COTTON.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_COTTON);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_CUCUMBER.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_CUCUMBER);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_EGGPLANT.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_EGGPLANT);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_GARLIC.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_GARLIC);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_GRAPE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_GRAPE);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_GREENGRAPE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_GREENGRAPE);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_KENAF.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_KENAF);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_LENTIL.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_LENTIL);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_MILLET.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_MILLET);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_MUSTARDSEEDS.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_MUSTARDSEEDS);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_OKRA.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_OKRA);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_ONION.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_ONION);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_PEANUT.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_PEANUT);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_SCALLION.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_SCALLION);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_SESAMESEEDS.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_SESAMESEEDS);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_SOYBEAN.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_SOYBEAN);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_TOMATILLO.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_TOMATILLO);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_TOMATO.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_TOMATO);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_WINTERSQUASH.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_WINTERSQUASH);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_ZUCCHINI.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_ZUCCHINI);
                }
            }

            if (cold) {
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_ASPARAGUS.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_ASPARAGUS);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_BARLEY.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_BARLEY);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_BROCCOLI.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_BROCCOLI);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_BRUSSELSPROUT.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_BRUSSELSPROUT);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_CABBAGE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_CABBAGE);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_CAULIFLOWER.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_CAULIFLOWER);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_CELERY.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_CELERY);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_FLAX.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_FLAX);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_JUNIPERBERRY.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_JUNIPERBERRY);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_KALE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_KALE);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_KOHLRABI.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_KOHLRABI);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_LEEK.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_LEEK);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_LETTUCE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_LETTUCE);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_OATS.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_OATS);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_PARSNIP.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_PARSNIP);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_PEAS.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_PEAS);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_QUINOA.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_QUINOA);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_RADISH.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_RADISH);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_RHUBARB.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_RHUBARB);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_RUTABAGA.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_RUTABAGA);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_RYE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_RYE);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_SPINACH.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_SPINACH);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_STRAWBERRY.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_STRAWBERRY);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_TURNIP.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_TURNIP);
                }
            }

            if (arid) {
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_AGAVE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_AGAVE);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_CACTUSFRUIT.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_CACTUSFRUIT);
                }
            }


            if (tropical) {
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_ARROWROOT.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_ARROWROOT);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_CASSAVA.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_CASSAVA);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_COFFEEBEAN.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_COFFEEBEAN);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_GINGER.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_GINGER);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_JICAMA.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_JICAMA);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_JUTE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_JUTE);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_PINEAPPLE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_PINEAPPLE);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_RICE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_RICE);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_SISAL.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_SISAL);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_SPICELEAF.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_SPICELEAF);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_SWEETPOTATO.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_SWEETPOTATO);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_TARO.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_TARO);
                }
                if (HarvestcraftConfig.GENERATE_HARVESTCRAFT_WILD_WATERCHESTNUT.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_HARVESTCRAFT_WATERCHESTNUT);
                }
            }

            Wildplants.LOGGER.debug("register-harvestcraft-biome-config");
        }
    }
}
