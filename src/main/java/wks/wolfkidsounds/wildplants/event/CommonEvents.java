package wks.wolfkidsounds.wildplants.event;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import wks.wolfkidsounds.wildplants.Wildplants;
import wks.wolfkidsounds.wildplants.config.Configuration;
import wks.wolfkidsounds.wildplants.config.ImmersiveEngineeringConfig;
import wks.wolfkidsounds.wildplants.config.MinecraftConfig;
import wks.wolfkidsounds.wildplants.config.VeggieWayConfig;
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
    }
}
