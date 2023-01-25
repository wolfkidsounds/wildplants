package wks.wolfkidsounds.wildplants.world.harvestcraft;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import wks.wolfkidsounds.wildplants.config.features.harvestcraft.HarvestcraftConfig;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class HarvestcraftWildplantsGeneration {

    public static void generateWildAgave(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.AGAVE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_AGAVE_PATCH);
        }
    }

    public static void generateWildAmaranth(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.AMARANTH_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_AMARANTH_PATCH);
        }
    }

    public static void generateWildArrowroot(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.ARROWROOT_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_ARROWROOT_PATCH);
        }
    }

    public static void generateWildArtichoke(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.ARTICHOKE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_ARTICHOKE_PATCH);
        }
    }

    public static void generateWildAsparagus(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.ASPARAGUS_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_ASPARAGUS_PATCH);
        }
    }

    public static void generateWildBarley(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BARLEY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_BARLEY_PATCH);
        }
    }

    public static void generateWildBean(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BEAN_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_BEAN_PATCH);
        }
    }

    public static void generateWildBellpepper(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BELLPEPPER_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_BELLPEPPER_PATCH);
        }
    }

    public static void generateWildBlackberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BLACKBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_BLACKBERRY_PATCH);
        }
    }

    public static void generateWildBlueberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BLUEBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_BLUEBERRY_PATCH);
        }
    }

    public static void generateWildBroccoli(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BROCCOLI_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_BROCCOLI_PATCH);
        }
    }

    public static void generateWildBrusselsprout(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BRUSSELSPROUT_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_BRUSSELSPROUT_PATCH);
        }
    }

    public static void generateWildCabbage(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CABBAGE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CABBAGE_PATCH);
        }
    }

    public static void generateWildCactusfruit(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CACTUSFRUIT_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CACTUSFRUIT_PATCH);
        }
    }

    public static void generateWildCandleberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CANDLEBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CANDLEBERRY_PATCH);
        }
    }

    public static void generateWildCantaloupe(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CANTALOUPE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CANTALOUPE_PATCH);
        }
    }

    public static void generateWildCassava(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CASSAVA_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CASSAVA_PATCH);
        }
    }

    public static void generateWildCauliflower(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CAULIFLOWER_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CAULIFLOWER_PATCH);
        }
    }

    public static void generateWildCelery(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CELERY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CELERY_PATCH);
        }
    }

    public static void generateWildChickpea(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CHICKPEA_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CHICKPEA_PATCH);
        }
    }

    public static void generateWildChilipepper(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CHILIPEPPER_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CHILIPEPPER_PATCH);
        }
    }

    public static void generateWildCoffeebean(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.COFFEEBEAN_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_COFFEEBEAN_PATCH);
        }
    }

    public static void generateWildCorn(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CORN_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CORN_PATCH);
        }
    }

    public static void generateWildCotton(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.COTTON_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_COTTON_PATCH);
        }
    }

    public static void generateWildCranberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CRANBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CRANBERRY_PATCH);
        }
    }

    public static void generateWildCucumber(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CUCUMBER_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CUCUMBER_PATCH);
        }
    }

    public static void generateWildEggplant(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.EGGPLANT_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_EGGPLANT_PATCH);
        }
    }

    public static void generateWildElderberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.ELDERBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_ELDERBERRY_PATCH);
        }
    }

    public static void generateWildFlax(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.FLAX_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_FLAX_PATCH);
        }
    }

    public static void generateWildGarlic(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.GARLIC_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_GARLIC_PATCH);
        }
    }

    public static void generateWildGinger(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.GINGER_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_GINGER_PATCH);
        }
    }

    public static void generateWildGrape(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.GRAPE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_GRAPE_PATCH);
        }
    }

    public static void generateWildGreengrape(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.GREENGRAPE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_GREENGRAPE_PATCH);
        }
    }

    public static void generateWildHuckleberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.HUCKLEBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_HUCKLEBERRY_PATCH);
        }
    }

    public static void generateWildJicama(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.JICAMA_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_JICAMA_PATCH);
        }
    }

    public static void generateWildJuniperberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.JUNIPERBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_JUNIPERBERRY_PATCH);
        }
    }

    public static void generateWildJute(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.JUTE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_JUTE_PATCH);
        }
    }

    public static void generateWildKale(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.KALE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_KALE_PATCH);
        }
    }

    public static void generateWildKenaf(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.KENAF_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_KENAF_PATCH);
        }
    }

    public static void generateWildKiwi(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.KIWI_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_KIWI_PATCH);
        }
    }

    public static void generateWildKohlrabi(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.KOHLRABI_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_KOHLRABI_PATCH);
        }
    }

    public static void generateWildLeek(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.LEEK_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_LEEK_PATCH);
        }
    }

    public static void generateWildLentil(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.LENTIL_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_LENTIL_PATCH);
        }
    }

    public static void generateWildLettuce(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.LETTUCE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_LETTUCE_PATCH);
        }
    }

    public static void generateWildMillet(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.MILLET_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_MILLET_PATCH);
        }
    }

    public static void generateWildMulberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.MULBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_MULBERRY_PATCH);
        }
    }

    public static void generateWildMustardseeds(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.MUSTARDSEEDS_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_MUSTARDSEEDS_PATCH);
        }
    }

    public static void generateWildOats(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.OATS_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_OATS_PATCH);
        }
    }

    public static void generateWildOkra(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.OKRA_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_OKRA_PATCH);
        }
    }

    public static void generateWildOnion(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.ONION_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_ONION_PATCH);
        }
    }

    public static void generateWildParsnip(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.PARSNIP_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_PARSNIP_PATCH);
        }
    }

    public static void generateWildPeanut(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.PEANUT_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_PEANUT_PATCH);
        }
    }

    public static void generateWildPeas(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.PEAS_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_PEAS_PATCH);
        }
    }

    public static void generateWildPineapple(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.PINEAPPLE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_PINEAPPLE_PATCH);
        }
    }

    public static void generateWildQuinoa(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.QUINOA_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_QUINOA_PATCH);
        }
    }

    public static void generateWildRadish(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.RADISH_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_RADISH_PATCH);
        }
    }

    public static void generateWildRaspberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.RASPBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_RASPBERRY_PATCH);
        }
    }

    public static void generateWildRhubarb(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.RHUBARB_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_RHUBARB_PATCH);
        }
    }

    public static void generateWildRice(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.RICE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_RICE_PATCH);
        }
    }

    public static void generateWildRutabaga(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.RUTABAGA_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_RUTABAGA_PATCH);
        }
    }

    public static void generateWildRye(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.RYE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_RYE_PATCH);
        }
    }

    public static void generateWildScallion(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SCALLION_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_SCALLION_PATCH);
        }
    }

    public static void generateWildSesameseeds(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SESAMESEEDS_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_SESAMESEEDS_PATCH);
        }
    }

    public static void generateWildSisal(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SISAL_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_SISAL_PATCH);
        }
    }

    public static void generateWildSoybean(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SOYBEAN_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_SOYBEAN_PATCH);
        }
    }

    public static void generateWildSpinach(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SPINACH_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_SPINACH_PATCH);
        }
    }

    public static void generateWildSpiceleaf(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SPICELEAF_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_SPICELEAF_PATCH);
        }
    }

    public static void generateWildStrawberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.STRAWBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_STRAWBERRY_PATCH);
        }
    }

    public static void generateWildSweetpotato(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SWEETPOTATO_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_SWEETPOTATO_PATCH);
        }
    }

    public static void generateWildTaro(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.TARO_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_TARO_PATCH);
        }
    }

    public static void generateWildTealeaf(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.TEALEAF_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_TEALEAF_PATCH);
        }
    }

    public static void generateWildTomatillo(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.TOMATILLO_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_TOMATILLO_PATCH);
        }
    }

    public static void generateWildTomato(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.TOMATO_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_TOMATO_PATCH);
        }
    }

    public static void generateWildTurnip(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.TURNIP_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_TURNIP_PATCH);
        }
    }

    public static void generateWildWaterchestnut(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.WATERCHESTNUT_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_WATERCHESTNUT_PATCH);
        }
    }

    public static void generateWildWhitemushroom(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.WHITEMUSHROOM_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_WHITEMUSHROOM_PATCH);
        }
    }

    public static void generateWildWintersquash(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.WINTERSQUASH_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_WINTERSQUASH_PATCH);
        }
    }

    public static void generateWildZucchini(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.ZUCCHINI_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_ZUCCHINI_PATCH);
        }
    }
}
