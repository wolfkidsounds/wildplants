package wks.wolfkidsounds.wildplants.world.veggieway;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
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
            List<Supplier<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(() -> VeggiewayPlacedFeatures.VEGGIEWAY_WILD_CORN_PLACED);
        }
    }

    public static void generateWildLentil(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(VeggiewayConfig.LENTIL_BIOME_TYPE_VEGGIEWAY.get()))) {
            List<Supplier<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(() -> VeggiewayPlacedFeatures.VEGGIEWAY_WILD_LENTIL_PLACED);
        }
    }

    public static void generateWildQuinoa(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(VeggiewayConfig.QUINOA_BIOME_TYPE_VEGGIEWAY.get()))) {
            List<Supplier<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(() -> VeggiewayPlacedFeatures.VEGGIEWAY_WILD_QUINOA_PLACED);
        }
    }

    public static void generateWildSoybean(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(VeggiewayConfig.SOYBEAN_BIOME_TYPE_VEGGIEWAY.get()))) {
            List<Supplier<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(() -> VeggiewayPlacedFeatures.VEGGIEWAY_WILD_SOYBEAN_PLACED);
        }
    }

    public static void generateWildCotton(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(VeggiewayConfig.COTTON_BIOME_TYPE_VEGGIEWAY.get()))) {
            List<Supplier<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(() -> VeggiewayPlacedFeatures.VEGGIEWAY_WILD_COTTON_PLACED);
        }
    }
}
