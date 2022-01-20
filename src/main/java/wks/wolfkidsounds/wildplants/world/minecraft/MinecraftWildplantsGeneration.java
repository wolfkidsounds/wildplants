package wks.wolfkidsounds.wildplants.world.minecraft;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import wks.wolfkidsounds.wildplants.config.features.MinecraftConfig;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class MinecraftWildplantsGeneration {

    public static void generateWildWheat(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(MinecraftConfig.WHEAT_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base = event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> MinecraftConfiguredFeatures.WILD_WHEAT_CONFIG);
        }
    }

    public static void generateWildCarrots(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(MinecraftConfig.CARROTS_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base = event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> MinecraftConfiguredFeatures.WILD_CARROTS_CONFIG);
        }
    }

    public static void generateWildPotatoes(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(MinecraftConfig.POTATOES_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> MinecraftConfiguredFeatures.WILD_POTATOES_CONFIG);
        }
    }

    public static void generateWildBeetroots(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(MinecraftConfig.BEETROOTS_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> MinecraftConfiguredFeatures.WILD_BEETROOTS_CONFIG);
        }
    }
}
