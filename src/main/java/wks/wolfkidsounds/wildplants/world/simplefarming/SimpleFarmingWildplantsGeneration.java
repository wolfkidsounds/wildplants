package wks.wolfkidsounds.wildplants.world.simplefarming;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import wks.wolfkidsounds.wildplants.config.features.simplefarming.SimpleFarmingConfig;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class SimpleFarmingWildplantsGeneration {

    public static void generateWildCumin(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.CUMIN_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_CUMIN_PATCH);
        }
    }

    public static void generateWildQuinoa(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.QUINOA_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_QUINOA_PATCH);
        }
    }

    public static void generateWildSunflower(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.SUNFLOWER_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_SUNFLOWER_PATCH);
        }
    }

    public static void generateWildCantaloupe(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.CANTALOUPE_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_CANTALOUPE_PATCH);
        }
    }

    public static void generateWildHoneydew(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.HONEYDEW_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_HONEYDEW_PATCH);
        }
    }

    public static void generateWildSquash(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.SQUASH_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_SQUASH_PATCH);
        }
    }

    public static void generateWildBarley(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.BARLEY_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_BARLEY_PATCH);
        }
    }

    public static void generateWildBroccoli(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.BROCCOLI_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_BROCCOLI_PATCH);
        }
    }

    public static void generateWildCassava(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.CASSAVA_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_CASSAVA_PATCH);
        }
    }

    public static void generateWildCorn(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.CORN_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_CORN_PATCH);
        }
    }

    public static void generateWildCotton(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.COTTON_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_COTTON_PATCH);
        }
    }

    public static void generateWildCucumber(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.CUCUMBER_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_CUCUMBER_PATCH);
        }
    }

    public static void generateWildEggplant(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.EGGPLANT_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_EGGPLANT_PATCH);
        }
    }

    public static void generateWildGinger(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.GINGER_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_GINGER_PATCH);
        }
    }

    public static void generateWildGrape(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.GRAPE_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_GRAPE_PATCH);
        }
    }

    public static void generateWildKenaf(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.KENAF_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_KENAF_PATCH);
        }
    }

    public static void generateWildLettuce(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.LETTUCE_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_LETTUCE_PATCH);
        }
    }

    public static void generateWildOat(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.OAT_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_OAT_PATCH);
        }
    }

    public static void generateWildOnion(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.ONION_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_ONION_PATCH);
        }
    }

    public static void generateWildPea(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.PEA_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_PEA_PATCH);
        }
    }

    public static void generateWildPeanut(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.PEANUT_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_PEANUT_PATCH);
        }
    }

    public static void generateWildPepper(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.PEPPER_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_PEPPER_PATCH);
        }
    }

    public static void generateWildRadish(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.RADISH_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_RADISH_PATCH);
        }
    }

    public static void generateWildRice(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.RICE_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_RICE_PATCH);
        }
    }

    public static void generateWildRye(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.RYE_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_RYE_PATCH);
        }
    }

    public static void generateWildSorghum(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.SORGHUM_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_SORGHUM_PATCH);
        }
    }

    public static void generateWildSoybean(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.SOYBEAN_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_SOYBEAN_PATCH);
        }
    }

    public static void generateWildSpinach(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.SPINACH_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_SPINACH_PATCH);
        }
    }

    public static void generateWildSweetpotato(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.SWEETPOTATO_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_SWEETPOTATO_PATCH);
        }
    }

    public static void generateWildTomato(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.TOMATO_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_TOMATO_PATCH);
        }
    }


    public static void generateWildTurnip(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.TURNIP_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_TURNIP_PATCH);
        }
    }

    public static void generateWildYam(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.YAM_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_YAM_PATCH);
        }
    }

    public static void generateWildZucchini(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(SimpleFarmingConfig.ZUCCHINI_BIOME_TYPE_SIMPLEFARMING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> SimpleFarmingConfiguredFeatures.SIMPLEFARMING_WILD_ZUCCHINI_PATCH);
        }
    }
}
