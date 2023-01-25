package wks.wolfkidsounds.wildplants.world.veggieway;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import wks.wolfkidsounds.wildplants.config.features.veggieway.VeggiewayConfig;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class VeggiewayWildplantsGeneration {

    public static void generateWildCorn(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(VeggiewayConfig.CORN_BIOME_TYPE_VEGGIEWAY.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base = event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> VeggiewayConfiguredFeatures.VEGGIEWAY_WILD_CORN_PATCH);
        }
    }

    public static void generateWildLentil(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(VeggiewayConfig.LENTIL_BIOME_TYPE_VEGGIEWAY.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base = event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> VeggiewayConfiguredFeatures.VEGGIEWAY_WILD_LENTIL_PATCH);
        }
    }

    public static void generateWildQuinoa(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(VeggiewayConfig.QUINOA_BIOME_TYPE_VEGGIEWAY.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> VeggiewayConfiguredFeatures.VEGGIEWAY_WILD_QUINOA_PATCH);
        }
    }

    public static void generateWildSoybean(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(VeggiewayConfig.SOYBEAN_BIOME_TYPE_VEGGIEWAY.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> VeggiewayConfiguredFeatures.VEGGIEWAY_WILD_SOYBEAN_PATCH);
        }
    }
}
