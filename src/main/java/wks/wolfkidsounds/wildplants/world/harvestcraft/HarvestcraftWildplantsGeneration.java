package wks.wolfkidsounds.wildplants.world.harvestcraft;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import wks.wolfkidsounds.wildplants.config.features.HarvestcraftConfig;

import java.util.List;
import java.util.Set;

public class HarvestcraftWildplantsGeneration {

    public static void generateWildAgave(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.AGAVE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_AGAVE_PLACED);
        }
    }

    public static void generateWildAmaranth(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.AMARANTH_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_AMARANTH_PLACED);
        }
    }

    public static void generateWildArrowroot(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.ARROWROOT_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_ARROWROOT_PLACED);
        }
    }

    public static void generateWildArtichoke(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.ARTICHOKE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_ARTICHOKE_PLACED);
        }
    }

    public static void generateWildAsparagus(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.ASPARAGUS_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_ASPARAGUS_PLACED);
        }
    }

    public static void generateWildBarley(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BARLEY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_BARLEY_PLACED);
        }
    }

    public static void generateWildBean(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BEAN_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_BEAN_PLACED);
        }
    }

    public static void generateWildBellpepper(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BELLPEPPER_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_BELLPEPPER_PLACED);
        }
    }

    public static void generateWildBlackberry(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BLACKBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_BLACKBERRY_PLACED);
        }
    }

    public static void generateWildBlueberry(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BLUEBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_BLUEBERRY_PLACED);
        }
    }

    public static void generateWildBroccoli(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BROCCOLI_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_BROCCOLI_PLACED);
        }
    }

    public static void generateWildBrusselsprout(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.BRUSSELSPROUT_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_BRUSSELSPROUT_PLACED);
        }
    }

    public static void generateWildCabbage(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CABBAGE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_CABBAGE_PLACED);
        }
    }

    public static void generateWildCactusfruit(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CACTUSFRUIT_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_CACTUSFRUIT_PLACED);
        }
    }

    public static void generateWildCandleberry(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CANDLEBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_CANDLEBERRY_PLACED);
        }
    }

    public static void generateWildCantaloupe(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CANTALOUPE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_CANTALOUPE_PLACED);
        }
    }

    public static void generateWildCassava(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CASSAVA_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_CASSAVA_PLACED);
        }
    }

    public static void generateWildCauliflower(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CAULIFLOWER_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_CAULIFLOWER_PLACED);
        }
    }

    public static void generateWildCelery(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CELERY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_CELERY_PLACED);
        }
    }

    public static void generateWildChickpea(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CHICKPEA_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_CHICKPEA_PLACED);
        }
    }

    public static void generateWildChilipepper(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CHILIPEPPER_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_CHILIPEPPER_PLACED);
        }
    }

    public static void generateWildCoffeebean(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.COFFEEBEAN_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_COFFEEBEAN_PLACED);
        }
    }

    public static void generateWildCorn(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CORN_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_CORN_PLACED);
        }
    }

    public static void generateWildCotton(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.COTTON_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_COTTON_PLACED);
        }
    }

    public static void generateWildCranberry(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CRANBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_CRANBERRY_PLACED);
        }
    }

    public static void generateWildCucumber(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.CUCUMBER_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_CUCUMBER_PLACED);
        }
    }

    public static void generateWildEggplant(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.EGGPLANT_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_EGGPLANT_PLACED);
        }
    }

    public static void generateWildElderberry(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.ELDERBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_ELDERBERRY_PLACED);
        }
    }

    public static void generateWildFlax(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.FLAX_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_FLAX_PLACED);
        }
    }

    public static void generateWildGarlic(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.GARLIC_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_GARLIC_PLACED);
        }
    }

    public static void generateWildGinger(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.GINGER_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_GINGER_PLACED);
        }
    }

    public static void generateWildGrape(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.GRAPE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_GRAPE_PLACED);
        }
    }

    public static void generateWildGreengrape(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.GREENGRAPE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_GREENGRAPE_PLACED);
        }
    }

    public static void generateWildHuckleberry(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.HUCKLEBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_HUCKLEBERRY_PLACED);
        }
    }

    public static void generateWildJicama(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.JICAMA_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_JICAMA_PLACED);
        }
    }

    public static void generateWildJuniperberry(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.JUNIPERBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_JUNIPERBERRY_PLACED);
        }
    }

    public static void generateWildJute(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.JUTE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_JUTE_PLACED);
        }
    }

    public static void generateWildKale(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.KALE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_KALE_PLACED);
        }
    }

    public static void generateWildKenaf(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.KENAF_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_KENAF_PLACED);
        }
    }

    public static void generateWildKiwi(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.KIWI_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_KIWI_PLACED);
        }
    }

    public static void generateWildKohlrabi(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.KOHLRABI_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_KOHLRABI_PLACED);
        }
    }

    public static void generateWildLeek(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.LEEK_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_LEEK_PLACED);
        }
    }

    public static void generateWildLentil(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.LENTIL_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_LENTIL_PLACED);
        }
    }

    public static void generateWildLettuce(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.LETTUCE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_LETTUCE_PLACED);
        }
    }

    public static void generateWildMillet(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.MILLET_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_MILLET_PLACED);
        }
    }

    public static void generateWildMulberry(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.MULBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_MULBERRY_PLACED);
        }
    }

    public static void generateWildMustardseeds(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.MUSTARDSEEDS_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_MUSTARDSEEDS_PLACED);
        }
    }

    public static void generateWildOats(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.OATS_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_OATS_PLACED);
        }
    }

    public static void generateWildOkra(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.OKRA_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_OKRA_PLACED);
        }
    }

    public static void generateWildOnion(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.ONION_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_ONION_PLACED);
        }
    }

    public static void generateWildParsnip(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.PARSNIP_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_PARSNIP_PLACED);
        }
    }

    public static void generateWildPeanut(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.PEANUT_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_PEANUT_PLACED);
        }
    }

    public static void generateWildPeas(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.PEAS_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_PEAS_PLACED);
        }
    }

    public static void generateWildPineapple(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.PINEAPPLE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_PINEAPPLE_PLACED);
        }
    }

    public static void generateWildQuinoa(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.QUINOA_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_QUINOA_PLACED);
        }
    }

    public static void generateWildRadish(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.RADISH_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_RADISH_PLACED);
        }
    }

    public static void generateWildRaspberry(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.RASPBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_RASPBERRY_PLACED);
        }
    }

    public static void generateWildRhubarb(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.RHUBARB_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_RHUBARB_PLACED);
        }
    }

    public static void generateWildRice(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.RICE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_RICE_PLACED);
        }
    }

    public static void generateWildRutabaga(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.RUTABAGA_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_RUTABAGA_PLACED);
        }
    }

    public static void generateWildRye(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.RYE_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_RYE_PLACED);
        }
    }

    public static void generateWildScallion(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SCALLION_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_SCALLION_PLACED);
        }
    }

    public static void generateWildSesameseeds(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SESAMESEEDS_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_SESAMESEEDS_PLACED);
        }
    }

    public static void generateWildSisal(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SISAL_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_SISAL_PLACED);
        }
    }

    public static void generateWildSoybean(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SOYBEAN_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_SOYBEAN_PLACED);
        }
    }

    public static void generateWildSpinach(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SPINACH_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_SPINACH_PLACED);
        }
    }

    public static void generateWildSpiceleaf(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SPICELEAF_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_SPICELEAF_PLACED);
        }
    }

    public static void generateWildStrawberry(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.STRAWBERRY_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_STRAWBERRY_PLACED);
        }
    }

    public static void generateWildSweetpotato(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.SWEETPOTATO_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_SWEETPOTATO_PLACED);
        }
    }

    public static void generateWildTaro(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.TARO_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_TARO_PLACED);
        }
    }

    public static void generateWildTealeaf(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.TEALEAF_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_TEALEAF_PLACED);
        }
    }

    public static void generateWildTomatillo(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.TOMATILLO_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_TOMATILLO_PLACED);
        }
    }

    public static void generateWildTomato(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.TOMATO_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_TOMATO_PLACED);
        }
    }

    public static void generateWildTurnip(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.TURNIP_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_TURNIP_PLACED);
        }
    }

    public static void generateWildWaterchestnut(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.WATERCHESTNUT_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_WATERCHESTNUT_PLACED);
        }
    }

    public static void generateWildWhitemushroom(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.WHITEMUSHROOM_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_WHITEMUSHROOM_PLACED);
        }
    }

    public static void generateWildWintersquash(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.WINTERSQUASH_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_WINTERSQUASH_PLACED);
        }
    }

    public static void generateWildZucchini(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(HarvestcraftConfig.ZUCCHINI_BIOME_TYPE_HARVESTCRAFT.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(HarvestcraftPlacedFeatures.HARVESTCRAFT_WILD_ZUCCHINI_PLACED);
        }
    }
}
