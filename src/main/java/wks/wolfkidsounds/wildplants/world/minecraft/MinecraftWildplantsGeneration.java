package wks.wolfkidsounds.wildplants.world.minecraft;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import wks.wolfkidsounds.wildplants.config.features.MinecraftConfig;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class MinecraftWildplantsGeneration {

    public static void generateWildWheat(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(MinecraftConfig.WHEAT_BIOME_TYPE_MINECRAFT.get()))) {
            List<Supplier<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(() -> MinecraftPlacedFeatures.MINECRAFT_WILD_WHEAT_PLACED);
        }
    }

    public static void generateWildCarrots(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(MinecraftConfig.CARROTS_BIOME_TYPE_MINECRAFT.get()))) {
            List<Supplier<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(() -> MinecraftPlacedFeatures.MINECRAFT_WILD_CARROTS_PLACED);
        }
    }

    public static void generateWildPotatoes(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(MinecraftConfig.POTATOES_BIOME_TYPE_MINECRAFT.get()))) {
            List<Supplier<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(() -> MinecraftPlacedFeatures.MINECRAFT_WILD_POTATOES_PLACED);
        }
    }

    public static void generateWildBeetroots(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(MinecraftConfig.BEETROOTS_BIOME_TYPE_MINECRAFT.get()))) {
            List<Supplier<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(() -> MinecraftPlacedFeatures.MINECRAFT_WILD_BEETROOTS_PLACED);
        }
    }
}
