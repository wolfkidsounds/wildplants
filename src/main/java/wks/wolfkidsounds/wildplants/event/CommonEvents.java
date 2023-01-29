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

        //CLIMATE_MINECRAFT
        if (Configuration.ENABLE_MINECRAFT.get()) {
            //TEMPERATE
            if (climate.temperature >= 0.5F && climate.temperature <= 1.0F) {
                //MINECRAFT
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
            if (event.getCategory().equals(Biome.BiomeCategory.DESERT) || event.getCategory().equals(Biome.BiomeCategory.BEACH)) {
                //MINECRAFT

                if (MinecraftConfig.GENERATE_MINECRAFT_WILD_BEETROOTS.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_MINECRAFT_BEETROOTS);
                }
            }
            Wildplants.LOGGER.debug("register-minecraft-biome-config");
        }

        //CLIMATE_IMMERSIVEENGINEERING
        if (Configuration.ENABLE_IMMERSIVEENGINEERING.get() && Configuration.LOADED_IMMERSIVEENGINEERING) {
            //TEMPERATE
            if (climate.temperature >= 0.5F && climate.temperature <= 1.0F) {
                //IMMERSIVEENGINEERING
                if (ImmersiveEngineeringConfig.GENERATE_IMMERSIVEENGINEERING_WILD_HEMP.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_IMMERSIVEENGINEERING_HEMP);
                }
            }
            Wildplants.LOGGER.debug("register-immersiveengineering-biome-config");
        }

        //CLIMATE_VEGGIE_WAY
        if (Configuration.ENABLE_VEGGIE_WAY.get() && Configuration.LOADED_VEGGIE_WAY) {
            //TEMPERATE
            if (climate.temperature >= 0.5F && climate.temperature <= 1.0F) {
                //VEGGIE_WAY
                if (VeggieWayConfig.GENERATE_VEGGIEWAY_WILD_LENTIL.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_VEGGIE_WAY_LENTIL);
                }
                if (VeggieWayConfig.GENERATE_VEGGIEWAY_WILD_QUINOA.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_VEGGIE_WAY_QUINOA);
                }
            }

            //WARM
            if (climate.temperature >= 1.5F && climate.temperature <= 2.5F) {
                //VEGGIE_WAY
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
            Wildplants.LOGGER.debug("register-minecraft-biome-config");
        }

        //CLIMATE_ENHANCEDFARMING
        if (Configuration.ENABLE_ENHANCEDFARMING.get() && Configuration.LOADED_ENHANCEDFARMING) {
            //TEMPERATE
            if (climate.temperature >= 0.5F && climate.temperature <= 1.0F) {
                //ENHANCEDFARMING
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_MINT.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_MINT);
                }
            }

            //WARM
            if (climate.temperature >= 1.5F && climate.temperature <= 2.5F && climate.downfall <= 0.0F) {
                //ENHANCEDFARMING
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_TOMATO.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_TOMATO);
                }
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_TOMATO.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_TOMATO);
                }
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_CUCUMBER.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_CUCUMBER);
                }
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_AUBERGINE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_AUBERGINE);
                }
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_GRAPE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_GRAPE);
                }
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_CORN.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_CORN);
                }
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_ONION.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_ONION);
                }
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_GARLIC.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_GARLIC);
                }
            }

            //COLD
            if (climate.temperature >= 0.2F && climate.temperature <= 0.3F) {
                //ENHANCEDFARMING
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_LETTUCE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_LETTUCE);
                }
            }

            //TROPICAL
            if (climate.temperature >= 0.8F && climate.downfall >= 0.9F) {
                //ENHANCEDFARMING
                if (EnhancedFarmingConfig.GENERATE_ENHANCEDFARMING_WILD_PINEAPPLE.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_ENHANCEDFARMING_PINEAPPLE);
                }
            }
            Wildplants.LOGGER.debug("register-enhancedfarming-biome-config");
        }
    }
}
