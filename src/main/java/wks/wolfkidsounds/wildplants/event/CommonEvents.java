package wks.wolfkidsounds.wildplants.event;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import wks.wolfkidsounds.wildplants.Wildplants;
import wks.wolfkidsounds.wildplants.config.features.MinecraftConfig;
import wks.wolfkidsounds.wildplants.world.WildCropGeneration;

@Mod.EventBusSubscriber(modid = Wildplants.MOD_ID)
public class CommonEvents {
    @SubscribeEvent
    public static void onBiomeLoad(BiomeLoadingEvent event) {
        BiomeGenerationSettingsBuilder builder = event.getGeneration();
        Biome.ClimateSettings climate = event.getClimate();

        ResourceLocation biomeName = event.getName();

        //Biome Name
        if (biomeName != null && biomeName.getPath().equals("beach")) {
            if (MinecraftConfig.GENERATE_MINECRAFT_WILD_BEETROOTS.get()) {
                builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_MINECRAFT_BEETROOTS);
            }
        }

        //Biome Category
        if (event.getCategory().equals(Biome.BiomeCategory.SWAMP) || event.getCategory().equals(Biome.BiomeCategory.JUNGLE)) {
            //TEST
        }

        //Temperature
        if (climate.temperature >= 1.0F) {
            if (MinecraftConfig.GENERATE_MINECRAFT_WILD_WHEAT.get()) {
                builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_MINECRAFT_WHEAT);
            }
        }

        if (climate.temperature > 0.3F && climate.temperature < 1.0F) {
            if (MinecraftConfig.GENERATE_MINECRAFT_WILD_CARROTS.get()) {
                builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_MINECRAFT_CARROTS);
            }
        }

        if (climate.temperature > 0.0F && climate.temperature <= 0.3F) {
            if (MinecraftConfig.GENERATE_MINECRAFT_WILD_POTATOES.get()) {
                builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WildCropGeneration.PATCH_WILD_MINECRAFT_POTATOES);
            }
        }
    }
}
