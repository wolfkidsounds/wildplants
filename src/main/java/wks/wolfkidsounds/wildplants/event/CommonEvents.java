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

        boolean temperate = climate.temperature >= 0.5F && climate.temperature <= 0.7F && climate.downfall >= 0.3F && climate.downfall <= 0.9F;
        boolean temperate_cool = climate.temperature >= 0.1F && climate.temperature <= 0.5F && climate.downfall >= 0.3F && climate.downfall <= 0.9F;
        boolean temperate_warm = climate.temperature >= 0.7F && climate.temperature <= 0.9F && climate.downfall >= 0.3F && climate.downfall <= 0.9F;
        boolean tropical = climate.temperature >= 0.8F && climate.temperature <= 1.0F && climate.downfall >= 0.8F && climate.downfall <= 1.0F;
        boolean cold = climate.temperature >= -0.5F && climate.temperature <= 0.5F && climate.downfall >= 0.3F && climate.downfall <= 0.9F;
        boolean mushroom = event.getCategory().equals(Biome.BiomeCategory.MUSHROOM);
        boolean arid = climate.temperature >= 1.0F && climate.downfall <= 0.1F;
        boolean sandy = event.getCategory().equals(Biome.BiomeCategory.DESERT) || event.getCategory().equals(Biome.BiomeCategory.BEACH);
        boolean nothere = event.getCategory().equals(Biome.BiomeCategory.UNDERGROUND);

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

        if (temperate_warm) {
            Wildplants.LOGGER.debug("Found Biomes: TEMPERATE_WARM");
            //Wildplants.LOGGER.debug(temperate_warm);
        }

        if (temperate_cool) {
            Wildplants.LOGGER.debug("Found Biomes: TEMPERATE_COOL");
            //Wildplants.LOGGER.debug(temperate_cool);
        }

        if (arid) {
            Wildplants.LOGGER.debug("Found Biomes: ARID");
            //Wildplants.LOGGER.debug(arid);
        }

        if (cold) {
            Wildplants.LOGGER.debug("Found Biomes: COLD");
            //Wildplants.LOGGER.debug(tropical);
        }

        if (tropical) {
            Wildplants.LOGGER.debug("Found Biomes: TROPICAL");
            //Wildplants.LOGGER.debug(tropical);
        }

        if (nothere) {
            Wildplants.LOGGER.debug("Found Biomes: CAVES");
            Wildplants.LOGGER.debug("Dismissing Underground Biomes");
        }

        //----------------------------------------------------------

        //CLIMATE_MINECRAFT
        if (Configuration.ENABLE_MINECRAFT.get()) {
            Wildplants.LOGGER.debug("LOADED:MINECRAFT");
            //TEMPERATE NORM
            if (!nothere && temperate) {
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
            if (!nothere && sandy) {
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
            if (!nothere && temperate) {
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
            if (!nothere && temperate) {
                if (VeggieWayConfig.GENERATE_VEGGIEWAY_WILD_LENTIL.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_VEGGIE_WAY_LENTIL);
                }
                if (VeggieWayConfig.GENERATE_VEGGIEWAY_WILD_QUINOA.get()) {
                    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_VEGGIE_WAY_QUINOA);
                }
            }

            //TEMPERATE WARM
            if (!nothere && temperate_warm) {
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
    }
}
