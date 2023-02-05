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
    }
}
