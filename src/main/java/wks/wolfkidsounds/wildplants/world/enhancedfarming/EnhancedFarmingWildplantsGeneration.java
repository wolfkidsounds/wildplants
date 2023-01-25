package wks.wolfkidsounds.wildplants.world.enhancedfarming;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import wks.wolfkidsounds.wildplants.config.features.enhancedfarming.EnhancedFarmingConfig;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class EnhancedFarmingWildplantsGeneration {

    public static void generateWildMint(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(EnhancedFarmingConfig.MINT_BIOME_TYPE_ENHANCEDFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> EnhancedFarmingConfiguredFeatures.ENHANCEDFARMING_WILD_MINT_PATCH);
        }
    }

    public static void generateWildTomato(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(EnhancedFarmingConfig.TOMATO_BIOME_TYPE_ENHANCEDFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> EnhancedFarmingConfiguredFeatures.ENHANCEDFARMING_WILD_TOMATO_PATCH);
        }
    }

    public static void generateWildCucumber(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(EnhancedFarmingConfig.CUCUMBER_BIOME_TYPE_ENHANCEDFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> EnhancedFarmingConfiguredFeatures.ENHANCEDFARMING_WILD_CUCUMBER_PATCH);
        }
    }

    public static void generateWildAubergine(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(EnhancedFarmingConfig.AUBERGINE_BIOME_TYPE_ENHANCEDFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> EnhancedFarmingConfiguredFeatures.ENHANCEDFARMING_WILD_AUBERGINE_PATCH);
        }
    }

    public static void generateWildGrape(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(EnhancedFarmingConfig.GRAPE_BIOME_TYPE_ENHANCEDFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> EnhancedFarmingConfiguredFeatures.ENHANCEDFARMING_WILD_GRAPE_PATCH);
        }
    }

    public static void generateWildPineapple(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(EnhancedFarmingConfig.PINEPAPPLE_BIOME_TYPE_ENHANCEDFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> EnhancedFarmingConfiguredFeatures.ENHANCEDFARMING_WILD_PINEAPPLE_PATCH);
        }
    }

    public static void generateWildCorn(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(EnhancedFarmingConfig.CORN_BIOME_TYPE_ENHANCEDFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> EnhancedFarmingConfiguredFeatures.ENHANCEDFARMING_WILD_CORN_PATCH);
        }
    }

    public static void generateWildOnion(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(EnhancedFarmingConfig.ONION_BIOME_TYPE_ENHANCEDFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> EnhancedFarmingConfiguredFeatures.ENHANCEDFARMING_WILD_ONION_PATCH);
        }
    }

    public static void generateWildGarlic(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(EnhancedFarmingConfig.GARLIC_BIOME_TYPE_ENHANCEDFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> EnhancedFarmingConfiguredFeatures.ENHANCEDFARMING_WILD_GARLIC_PATCH);
        }
    }

    public static void generateWildLettuce(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(EnhancedFarmingConfig.LETTUCE_BIOME_TYPE_ENHANCEDFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> EnhancedFarmingConfiguredFeatures.ENHANCEDFARMING_WILD_LETTUCE_PATCH);
        }
    }
}
