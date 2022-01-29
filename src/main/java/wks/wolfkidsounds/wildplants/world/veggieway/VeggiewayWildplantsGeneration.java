package wks.wolfkidsounds.wildplants.world.veggieway;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import wks.wolfkidsounds.wildplants.config.features.VeggiewayConfig;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class VeggiewayWildplantsGeneration {

    public static void generateWildCorn(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(VeggiewayConfig.CORN_BIOME_TYPE_VEGGIEWAY.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(() -> VeggiewayConfiguredFeatures.VEGGIEWAY_WILD_CORN_CONFIG);
        }
    }

    public static void generateWildLentil(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(VeggiewayConfig.LENTIL_BIOME_TYPE_VEGGIEWAY.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(() -> VeggiewayConfiguredFeatures.VEGGIEWAY_WILD_LENTIL_CONFIG);
        }
    }

    public static void generateWildQuinoa(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(VeggiewayConfig.QUINOA_BIOME_TYPE_VEGGIEWAY.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(() -> VeggiewayConfiguredFeatures.VEGGIEWAY_WILD_QUINOA_CONFIG);
        }
    }

    public static void generateWildSoybean(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(VeggiewayConfig.SOYBEAN_BIOME_TYPE_VEGGIEWAY.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(() -> VeggiewayConfiguredFeatures.VEGGIEWAY_WILD_SOYBEAN_CONFIG);
        }
    }
}
