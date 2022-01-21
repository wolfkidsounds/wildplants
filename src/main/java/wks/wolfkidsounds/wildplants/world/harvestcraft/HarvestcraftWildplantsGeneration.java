package wks.wolfkidsounds.wildplants.world.harvestcraft;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import wks.wolfkidsounds.wildplants.config.features.HarvestcraftConfig;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class HarvestcraftWildplantsGeneration {

    public static void generateWildAgave(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.AGAVE_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_AGAVE_CONFIG);
        }
    }

    public static void generateWildAmaranth(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.AMARANTH_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_AMARANTH_CONFIG);
        }
    }

    public static void generateWildArrowroot(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.ARROWROOT_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_ARROWROOT_CONFIG);
        }
    }

    public static void generateWildArtichoke(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.ARTICHOKE_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_ARTICHOKE_CONFIG);
        }
    }

    public static void generateWildAsparagus(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.ASPARAGUS_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_ASPARAGUS_CONFIG);
        }
    }

    public static void generateWildBarley(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BARLEY_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_BARLEY_CONFIG);
        }
    }

    public static void generateWildBean(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BEAN_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_BEAN_CONFIG);
        }
    }

    public static void generateWildBellpepper(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BELLPEPPER_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_BELLPEPPER_CONFIG);
        }
    }

    public static void generateWildBlackberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BLACKBERRY_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_BLACKBERRY_CONFIG);
        }
    }

    public static void generateWildBlueberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BLUEBERRY_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_BLUEBERRY_CONFIG);
        }
    }

    public static void generateWildBroccoli(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BROCCOLI_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_BROCCOLI_CONFIG);
        }
    }

    public static void generateWildBrusselsprout(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BRUSSELSPROUT_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_BRUSSELSPROUT_CONFIG);
        }
    }

    public static void generateWildCabbage(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CABBAGE_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_CABBAGE_CONFIG);
        }
    }

    public static void generateWildCactusfruit(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CACTUSFRUIT_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_CACTUSFRUIT_CONFIG);
        }
    }

    public static void generateWildCandleberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CANDLEBERRY_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_CANDLEBERRY_CONFIG);
        }
    }

    public static void generateWildCantaloupe(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CANTALOUPE_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_CANTALOUPE_CONFIG);
        }
    }

    public static void generateWildCassava(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CASSAVA_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_CASSAVA_CONFIG);
        }
    }

    public static void generateWildCauliflower(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CAULIFLOWER_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_CAULIFLOWER_CONFIG);
        }
    }

    public static void generateWildCelery(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CELERY_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_CELERY_CONFIG);
        }
    }

    public static void generateWildChickpea(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CHICKPEA_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_CHICKPEA_CONFIG);
        }
    }

    public static void generateWildChilipepper(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CHILIPEPPER_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_CHILIPEPPER_CONFIG);
        }
    }

    public static void generateWildCoffeebean(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.COFFEEBEAN_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_COFFEEBEAN_CONFIG);
        }
    }

    public static void generateWildCorn(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CORN_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_CORN_CONFIG);
        }
    }

    public static void generateWildCotton(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.COTTON_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_COTTON_CONFIG);
        }
    }

    public static void generateWildCranberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CRANBERRY_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_CRANBERRY_CONFIG);
        }
    }

    public static void generateWildCucumber(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CUCUMBER_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_CUCUMBER_CONFIG);
        }
    }

    public static void generateWildEggplant(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.EGGPLANT_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_EGGPLANT_CONFIG);
        }
    }

    public static void generateWildElderberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.ELDERBERRY_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_ELDERBERRY_CONFIG);
        }
    }

    public static void generateWildFlax(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.FLAX_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_FLAX_CONFIG);
        }
    }

    public static void generateWildGarlic(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.GARLIC_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_GARLIC_CONFIG);
        }
    }

    public static void generateWildGinger(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.GINGER_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_GINGER_CONFIG);
        }
    }

    public static void generateWildGrape(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.GRAPE_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_GRAPE_CONFIG);
        }
    }

    public static void generateWildGreengrape(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.GREENGRAPE_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_GREENGRAPE_CONFIG);
        }
    }

    public static void generateWildHuckleberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.HUCKLEBERRY_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_HUCKLEBERRY_CONFIG);
        }
    }

    public static void generateWildJicama(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.JICAMA_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_JICAMA_CONFIG);
        }
    }

    public static void generateWildJuniperberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.JUNIPERBERRY_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_JUNIPERBERRY_CONFIG);
        }
    }

    public static void generateWildJute(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.JUTE_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_JUTE_CONFIG);
        }
    }

    public static void generateWildKale(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.KALE_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_KALE_CONFIG);
        }
    }

    public static void generateWildKenaf(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.KENAF_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_KENAF_CONFIG);
        }
    }

    public static void generateWildKiwi(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.KIWI_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_KIWI_CONFIG);
        }
    }

    public static void generateWildKohlrabi(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.KOHLRABI_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_KOHLRABI_CONFIG);
        }
    }

    public static void generateWildLeek(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.LEEK_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_LEEK_CONFIG);
        }
    }

    public static void generateWildLentil(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.LENTIL_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_LENTIL_CONFIG);
        }
    }

    public static void generateWildLettuce(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.LETTUCE_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_LETTUCE_CONFIG);
        }
    }

    public static void generateWildMillet(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.MILLET_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_MILLET_CONFIG);
        }
    }

    public static void generateWildMulberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.MULBERRY_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_MULBERRY_CONFIG);
        }
    }

    public static void generateWildMustardseeds(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.MUSTARDSEEDS_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_MUSTARDSEEDS_CONFIG);
        }
    }

    public static void generateWildOats(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.OATS_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_OATS_CONFIG);
        }
    }

    public static void generateWildOkra(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.OKRA_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_OKRA_CONFIG);
        }
    }

    public static void generateWildOnion(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.ONION_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_ONION_CONFIG);
        }
    }

    public static void generateWildParsnip(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.PARSNIP_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_PARSNIP_CONFIG);
        }
    }

    public static void generateWildPeanut(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.PEANUT_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_PEANUT_CONFIG);
        }
    }

    public static void generateWildPeas(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.PEAS_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_PEAS_CONFIG);
        }
    }

    public static void generateWildPineapple(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.PINEAPPLE_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_PINEAPPLE_CONFIG);
        }
    }

    public static void generateWildQuinoa(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.QUINOA_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_QUINOA_CONFIG);
        }
    }

    public static void generateWildRadish(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.RADISH_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_RADISH_CONFIG);
        }
    }

    public static void generateWildRaspberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.RASPBERRY_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_RASPBERRY_CONFIG);
        }
    }

    public static void generateWildRhubarb(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.RHUBARB_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_RHUBARB_CONFIG);
        }
    }

    public static void generateWildRice(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.RICE_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_RICE_CONFIG);
        }
    }

    public static void generateWildRutabaga(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.RUTABAGA_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_RUTABAGA_CONFIG);
        }
    }

    public static void generateWildRye(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.RYE_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_RYE_CONFIG);
        }
    }

    public static void generateWildScallion(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SCALLION_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_SCALLION_CONFIG);
        }
    }

    public static void generateWildSesameseeds(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SESAMESEEDS_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_SESAMESEEDS_CONFIG);
        }
    }

    public static void generateWildSisal(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SISAL_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_SISAL_CONFIG);
        }
    }

    public static void generateWildSoybean(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SOYBEAN_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_SOYBEAN_CONFIG);
        }
    }

    public static void generateWildSpinach(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SPINACH_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_SPINACH_CONFIG);
        }
    }

    public static void generateWildSpiceleaf(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SPICELEAF_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_SPICELEAF_CONFIG);
        }
    }

    public static void generateWildStrawberry(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.STRAWBERRY_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_STRAWBERRY_CONFIG);
        }
    }

    public static void generateWildSweetpotato(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SWEETPOTATO_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_SWEETPOTATO_CONFIG);
        }
    }

    public static void generateWildTaro(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.TARO_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_TARO_CONFIG);
        }
    }

    public static void generateWildTealeaf(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.TEALEAF_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_TEALEAF_CONFIG);
        }
    }

    public static void generateWildTomatillo(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.TOMATILLO_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_TOMATILLO_CONFIG);
        }
    }

    public static void generateWildTomato(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.TOMATO_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_TOMATO_CONFIG);
        }
    }

    public static void generateWildTurnip(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.TURNIP_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_TURNIP_CONFIG);
        }
    }

    public static void generateWildWaterchestnut(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.WATERCHESTNUT_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_WATERCHESTNUT_CONFIG);
        }
    }

    public static void generateWildWhitemushroom(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.WHITEMUSHROOM_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_WHITEMUSHROOM_CONFIG);
        }
    }

    public static void generateWildWintersquash(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.WINTERSQUASH_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_WINTERSQUASH_CONFIG);
        }
    }

    public static void generateWildZucchini(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.ZUCCHINI_BIOME_TYPE.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> HarvestcraftConfiguredFeatures.WILD_ZUCCHINI_CONFIG);
        }
    }
}
