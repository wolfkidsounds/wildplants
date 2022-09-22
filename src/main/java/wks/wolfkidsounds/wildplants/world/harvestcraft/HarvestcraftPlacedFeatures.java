package wks.wolfkidsounds.wildplants.world.harvestcraft;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.HarvestcraftConfig;

public class HarvestcraftPlacedFeatures {

public static Integer GLOBAL_FREQUENCY_HARVESTCRAFT = WildplantsConfig.GLOBAL_FREQUENCY.get();

public static Integer AGAVE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.AGAVE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer AMARANTH_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.AMARANTH_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer ARROWROOT_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.ARROWROOT_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer ARTICHOKE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.ARTICHOKE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer ASPARAGUS_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.ASPARAGUS_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer BARLEY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.BARLEY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer BEAN_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.BEAN_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer BELLPEPPER_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.BELLPEPPER_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer BLACKBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.BLACKBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer BLUEBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.BLUEBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer BROCCOLI_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.BROCCOLI_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer BRUSSELSPROUT_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.BRUSSELSPROUT_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer CABBAGE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CABBAGE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer CACTUSFRUIT_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CACTUSFRUIT_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer CANDLEBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CANDLEBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer CANTALOUPE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CANTALOUPE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer CASSAVA_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CASSAVA_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer CAULIFLOWER_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CAULIFLOWER_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer CELERY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CELERY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer CHICKPEA_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CHICKPEA_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer CHILIPEPPER_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CHILIPEPPER_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer COFFEEBEAN_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.COFFEEBEAN_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer CORN_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CORN_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer COTTON_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.COTTON_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer CRANBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CRANBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer CUCUMBER_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CUCUMBER_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer EGGPLANT_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.EGGPLANT_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer ELDERBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.ELDERBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer FLAX_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.FLAX_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer GARLIC_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.GARLIC_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer GINGER_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.GINGER_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer GRAPE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.GRAPE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer GREENGRAPE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.GREENGRAPE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer HUCKLEBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.HUCKLEBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer JICAMA_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.JICAMA_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer JUNIPERBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.JUNIPERBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer JUTE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.JUTE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer KALE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.KALE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer KENAF_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.KENAF_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer KIWI_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.KIWI_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer KOHLRABI_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.KOHLRABI_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer LEEK_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.LEEK_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer LENTIL_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.LENTIL_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer LETTUCE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.LETTUCE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer MILLET_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.MILLET_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer MULBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.MULBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer MUSTARDSEEDS_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.MUSTARDSEEDS_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer OATS_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.OATS_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer OKRA_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.OKRA_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer ONION_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.ONION_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer PARSNIP_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.PARSNIP_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer PEANUT_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.PEANUT_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer PEAS_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.PEAS_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer PINEAPPLE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.PINEAPPLE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer QUINOA_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.QUINOA_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer RADISH_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.RADISH_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer RASPBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.RASPBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer RHUBARB_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.RHUBARB_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer RICE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.RICE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer RUTABAGA_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.RUTABAGA_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer RYE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.RYE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer SCALLION_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.SCALLION_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer SESAMESEEDS_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.SESAMESEEDS_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer SISAL_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.SISAL_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer SOYBEAN_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.SOYBEAN_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer SPICELEAF_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.SPICELEAF_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer STRAWBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.STRAWBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer SWEETPOTATO_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.SWEETPOTATO_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer TARO_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.TARO_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer TEALEAF_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.TEALEAF_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer TOMATILLO_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.TOMATILLO_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer TOMATO_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.TOMATO_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer TURNIP_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.TURNIP_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer WATERCHESTNUT_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.WATERCHESTNUT_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer WHITEMUSHROOM_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.WHITEMUSHROOM_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer WINTERSQUASH_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.WINTERSQUASH_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer ZUCCHINI_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.ZUCCHINI_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
public static Integer SPINACH_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.SPINACH_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;

    //----------PLACEMENT---CONFIGS----------------

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_AGAVE_PLACED = PlacementUtils.register("harvestcraft_wild_agave_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_AGAVE_CONFIG, RarityFilter.onAverageOnceEvery(AGAVE_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_AMARANTH_PLACED = PlacementUtils.register("harvestcraft_wild_amaranth_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_AMARANTH_CONFIG, RarityFilter.onAverageOnceEvery(AMARANTH_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_ARROWROOT_PLACED = PlacementUtils.register("harvestcraft_wild_arrowroot_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_ARROWROOT_CONFIG, RarityFilter.onAverageOnceEvery(ARROWROOT_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_ARTICHOKE_PLACED = PlacementUtils.register("harvestcraft_wild_artichoke_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_ARTICHOKE_CONFIG, RarityFilter.onAverageOnceEvery(ARTICHOKE_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_ASPARAGUS_PLACED = PlacementUtils.register("harvestcraft_wild_asparagus_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_ASPARAGUS_CONFIG, RarityFilter.onAverageOnceEvery(ASPARAGUS_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_BARLEY_PLACED = PlacementUtils.register("harvestcraft_wild_barley_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_BARLEY_CONFIG, RarityFilter.onAverageOnceEvery(BARLEY_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_BEAN_PLACED = PlacementUtils.register("harvestcraft_wild_bean_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_BEAN_CONFIG, RarityFilter.onAverageOnceEvery(BEAN_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_BELLPEPPER_PLACED = PlacementUtils.register("harvestcraft_wild_bellpepper_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_BELLPEPPER_CONFIG, RarityFilter.onAverageOnceEvery(BELLPEPPER_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_BLACKBERRY_PLACED = PlacementUtils.register("harvestcraft_wild_blackberry_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_BLACKBERRY_CONFIG, RarityFilter.onAverageOnceEvery(BLACKBERRY_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_BLUEBERRY_PLACED = PlacementUtils.register("harvestcraft_wild_blueberry_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_BLUEBERRY_CONFIG, RarityFilter.onAverageOnceEvery(BLUEBERRY_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_BROCCOLI_PLACED = PlacementUtils.register("harvestcraft_wild_broccoli_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_BROCCOLI_CONFIG, RarityFilter.onAverageOnceEvery(BROCCOLI_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_BRUSSELSPROUT_PLACED = PlacementUtils.register("harvestcraft_wild_brusselsprout_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_BRUSSELSPROUT_CONFIG, RarityFilter.onAverageOnceEvery(BRUSSELSPROUT_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_CABBAGE_PLACED = PlacementUtils.register("harvestcraft_wild_cabbage_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CABBAGE_CONFIG, RarityFilter.onAverageOnceEvery(CABBAGE_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_CACTUSFRUIT_PLACED = PlacementUtils.register("harvestcraft_wild_cactusfruit_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CACTUSFRUIT_CONFIG, RarityFilter.onAverageOnceEvery(CACTUSFRUIT_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_CANDLEBERRY_PLACED = PlacementUtils.register("harvestcraft_wild_candleberry_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CANDLEBERRY_CONFIG, RarityFilter.onAverageOnceEvery(CANDLEBERRY_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_CANTALOUPE_PLACED = PlacementUtils.register("harvestcraft_wild_cantaloupe_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CANTALOUPE_CONFIG, RarityFilter.onAverageOnceEvery(CANTALOUPE_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_CASSAVA_PLACED = PlacementUtils.register("harvestcraft_wild_cassava_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CASSAVA_CONFIG, RarityFilter.onAverageOnceEvery(CASSAVA_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_CAULIFLOWER_PLACED = PlacementUtils.register("harvestcraft_wild_cauliflower_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CAULIFLOWER_CONFIG, RarityFilter.onAverageOnceEvery(CAULIFLOWER_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_CELERY_PLACED = PlacementUtils.register("harvestcraft_wild_celery_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CELERY_CONFIG, RarityFilter.onAverageOnceEvery(CELERY_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_CHICKPEA_PLACED = PlacementUtils.register("harvestcraft_wild_chickpea_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CHICKPEA_CONFIG, RarityFilter.onAverageOnceEvery(CHICKPEA_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_CHILIPEPPER_PLACED = PlacementUtils.register("harvestcraft_wild_chilipepper_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CHILIPEPPER_CONFIG, RarityFilter.onAverageOnceEvery(CHILIPEPPER_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_COFFEEBEAN_PLACED = PlacementUtils.register("harvestcraft_wild_coffeebean_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_COFFEEBEAN_CONFIG, RarityFilter.onAverageOnceEvery(COFFEEBEAN_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_CORN_PLACED = PlacementUtils.register("harvestcraft_wild_corn_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CORN_CONFIG, RarityFilter.onAverageOnceEvery(CORN_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_COTTON_PLACED = PlacementUtils.register("harvestcraft_wild_cotton_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_COTTON_CONFIG, RarityFilter.onAverageOnceEvery(COTTON_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_CRANBERRY_PLACED = PlacementUtils.register("harvestcraft_wild_cranberry_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CRANBERRY_CONFIG, RarityFilter.onAverageOnceEvery(CRANBERRY_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_CUCUMBER_PLACED = PlacementUtils.register("harvestcraft_wild_cucumber_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_CUCUMBER_CONFIG, RarityFilter.onAverageOnceEvery(CUCUMBER_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_EGGPLANT_PLACED = PlacementUtils.register("harvestcraft_wild_eggplant_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_EGGPLANT_CONFIG, RarityFilter.onAverageOnceEvery(EGGPLANT_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_ELDERBERRY_PLACED = PlacementUtils.register("harvestcraft_wild_elderberry_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_ELDERBERRY_CONFIG, RarityFilter.onAverageOnceEvery(ELDERBERRY_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_FLAX_PLACED = PlacementUtils.register("harvestcraft_wild_flax_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_FLAX_CONFIG, RarityFilter.onAverageOnceEvery(FLAX_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_GARLIC_PLACED = PlacementUtils.register("harvestcraft_wild_garlic_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_GARLIC_CONFIG, RarityFilter.onAverageOnceEvery(GARLIC_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_GINGER_PLACED = PlacementUtils.register("harvestcraft_wild_ginger_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_GINGER_CONFIG, RarityFilter.onAverageOnceEvery(GINGER_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_GRAPE_PLACED = PlacementUtils.register("harvestcraft_wild_grape_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_GRAPE_CONFIG, RarityFilter.onAverageOnceEvery(GRAPE_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_GREENGRAPE_PLACED = PlacementUtils.register("harvestcraft_wild_greengrape_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_GREENGRAPE_CONFIG, RarityFilter.onAverageOnceEvery(GREENGRAPE_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_HUCKLEBERRY_PLACED = PlacementUtils.register("harvestcraft_wild_huckleberry_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_HUCKLEBERRY_CONFIG, RarityFilter.onAverageOnceEvery(HUCKLEBERRY_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_JICAMA_PLACED = PlacementUtils.register("harvestcraft_wild_jicama_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_JICAMA_CONFIG, RarityFilter.onAverageOnceEvery(JICAMA_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_JUNIPERBERRY_PLACED = PlacementUtils.register("harvestcraft_wild_juniperberry_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_JUNIPERBERRY_CONFIG, RarityFilter.onAverageOnceEvery(JUNIPERBERRY_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_JUTE_PLACED = PlacementUtils.register("harvestcraft_wild_jute_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_JUTE_CONFIG, RarityFilter.onAverageOnceEvery(JUTE_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_KALE_PLACED = PlacementUtils.register("harvestcraft_wild_kale_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_KALE_CONFIG, RarityFilter.onAverageOnceEvery(KALE_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_KENAF_PLACED = PlacementUtils.register("harvestcraft_wild_kenaf_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_KENAF_CONFIG, RarityFilter.onAverageOnceEvery(KENAF_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_KIWI_PLACED = PlacementUtils.register("harvestcraft_wild_kiwi_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_KIWI_CONFIG, RarityFilter.onAverageOnceEvery(KIWI_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_KOHLRABI_PLACED = PlacementUtils.register("harvestcraft_wild_kohlrabi_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_KOHLRABI_CONFIG, RarityFilter.onAverageOnceEvery(KOHLRABI_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_LEEK_PLACED = PlacementUtils.register("harvestcraft_wild_leek_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_LEEK_CONFIG, RarityFilter.onAverageOnceEvery(LEEK_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_LENTIL_PLACED = PlacementUtils.register("harvestcraft_wild_lentil_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_LENTIL_CONFIG, RarityFilter.onAverageOnceEvery(LENTIL_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_LETTUCE_PLACED = PlacementUtils.register("harvestcraft_wild_lettuce_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_LETTUCE_CONFIG, RarityFilter.onAverageOnceEvery(LETTUCE_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_MILLET_PLACED = PlacementUtils.register("harvestcraft_wild_millet_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_MILLET_CONFIG, RarityFilter.onAverageOnceEvery(MILLET_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_MULBERRY_PLACED = PlacementUtils.register("harvestcraft_wild_mulberry_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_MULBERRY_CONFIG, RarityFilter.onAverageOnceEvery(MULBERRY_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_MUSTARDSEEDS_PLACED = PlacementUtils.register("harvestcraft_wild_mustardseeds_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_MUSTARDSEEDS_CONFIG, RarityFilter.onAverageOnceEvery(MUSTARDSEEDS_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_OATS_PLACED = PlacementUtils.register("harvestcraft_wild_oats_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_OATS_CONFIG, RarityFilter.onAverageOnceEvery(OATS_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_OKRA_PLACED = PlacementUtils.register("harvestcraft_wild_okra_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_OKRA_CONFIG, RarityFilter.onAverageOnceEvery(OKRA_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_ONION_PLACED = PlacementUtils.register("harvestcraft_wild_onion_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_ONION_CONFIG, RarityFilter.onAverageOnceEvery(ONION_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_PARSNIP_PLACED = PlacementUtils.register("harvestcraft_wild_parsnip_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_PARSNIP_CONFIG, RarityFilter.onAverageOnceEvery(PARSNIP_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_PEANUT_PLACED = PlacementUtils.register("harvestcraft_wild_peanut_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_PEANUT_CONFIG, RarityFilter.onAverageOnceEvery(PEANUT_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_PEAS_PLACED = PlacementUtils.register("harvestcraft_wild_peas_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_PEAS_CONFIG, RarityFilter.onAverageOnceEvery(PEAS_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_PINEAPPLE_PLACED = PlacementUtils.register("harvestcraft_wild_pineapple_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_PINEAPPLE_CONFIG, RarityFilter.onAverageOnceEvery(PINEAPPLE_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_QUINOA_PLACED = PlacementUtils.register("harvestcraft_wild_quinoa_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_QUINOA_CONFIG, RarityFilter.onAverageOnceEvery(QUINOA_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_RADISH_PLACED = PlacementUtils.register("harvestcraft_wild_radish_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_RADISH_CONFIG, RarityFilter.onAverageOnceEvery(RADISH_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_RASPBERRY_PLACED = PlacementUtils.register("harvestcraft_wild_raspberry_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_RASPBERRY_CONFIG, RarityFilter.onAverageOnceEvery(RASPBERRY_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_RHUBARB_PLACED = PlacementUtils.register("harvestcraft_wild_rhubarb_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_RHUBARB_CONFIG, RarityFilter.onAverageOnceEvery(RHUBARB_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_RICE_PLACED = PlacementUtils.register("harvestcraft_wild_rice_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_RICE_CONFIG, RarityFilter.onAverageOnceEvery(RICE_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_RUTABAGA_PLACED = PlacementUtils.register("harvestcraft_wild_rutabaga_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_RUTABAGA_CONFIG, RarityFilter.onAverageOnceEvery(RUTABAGA_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_RYE_PLACED = PlacementUtils.register("harvestcraft_wild_rye_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_RYE_CONFIG, RarityFilter.onAverageOnceEvery(RYE_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_SCALLION_PLACED = PlacementUtils.register("harvestcraft_wild_scallion_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_SCALLION_CONFIG, RarityFilter.onAverageOnceEvery(SCALLION_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_SESAMESEEDS_PLACED = PlacementUtils.register("harvestcraft_wild_sesameseeds_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_SESAMESEEDS_CONFIG, RarityFilter.onAverageOnceEvery(SESAMESEEDS_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_SISAL_PLACED = PlacementUtils.register("harvestcraft_wild_sisal_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_SISAL_CONFIG, RarityFilter.onAverageOnceEvery(SISAL_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_SOYBEAN_PLACED = PlacementUtils.register("harvestcraft_wild_soybean_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_SOYBEAN_CONFIG, RarityFilter.onAverageOnceEvery(SOYBEAN_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_SPINACH_PLACED = PlacementUtils.register("harvestcraft_wild_spinach_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_SPINACH_CONFIG, RarityFilter.onAverageOnceEvery(SPINACH_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_SPICELEAF_PLACED = PlacementUtils.register("harvestcraft_wild_spiceleaf_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_SPICELEAF_CONFIG, RarityFilter.onAverageOnceEvery(SPICELEAF_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_STRAWBERRY_PLACED = PlacementUtils.register("harvestcraft_wild_strawberry_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_STRAWBERRY_CONFIG, RarityFilter.onAverageOnceEvery(STRAWBERRY_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_SWEETPOTATO_PLACED = PlacementUtils.register("harvestcraft_wild_sweetpotato_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_SWEETPOTATO_CONFIG, RarityFilter.onAverageOnceEvery(SWEETPOTATO_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_TARO_PLACED = PlacementUtils.register("harvestcraft_wild_taro_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_TARO_CONFIG, RarityFilter.onAverageOnceEvery(TARO_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_TEALEAF_PLACED = PlacementUtils.register("harvestcraft_wild_tealeaf_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_TEALEAF_CONFIG, RarityFilter.onAverageOnceEvery(TEALEAF_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_TOMATILLO_PLACED = PlacementUtils.register("harvestcraft_wild_tomatillo_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_TOMATILLO_CONFIG, RarityFilter.onAverageOnceEvery(TOMATILLO_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_TOMATO_PLACED = PlacementUtils.register("harvestcraft_wild_tomato_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_TOMATO_CONFIG, RarityFilter.onAverageOnceEvery(TOMATO_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_TURNIP_PLACED = PlacementUtils.register("harvestcraft_wild_turnip_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_TURNIP_CONFIG, RarityFilter.onAverageOnceEvery(TURNIP_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_WATERCHESTNUT_PLACED = PlacementUtils.register("harvestcraft_wild_waterchestnut_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_WATERCHESTNUT_CONFIG, RarityFilter.onAverageOnceEvery(WATERCHESTNUT_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_WHITEMUSHROOM_PLACED = PlacementUtils.register("harvestcraft_wild_whitemushroom_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_WHITEMUSHROOM_CONFIG, RarityFilter.onAverageOnceEvery(WHITEMUSHROOM_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_WINTERSQUASH_PLACED = PlacementUtils.register("harvestcraft_wild_wintersquash_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_WINTERSQUASH_CONFIG, RarityFilter.onAverageOnceEvery(WINTERSQUASH_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HARVESTCRAFT_WILD_ZUCCHINI_PLACED = PlacementUtils.register("harvestcraft_wild_zucchini_placed",
           HarvestcraftConfiguredFeatures.HARVESTCRAFT_WILD_ZUCCHINI_CONFIG, RarityFilter.onAverageOnceEvery(ZUCCHINI_FREQUENCY_HARVESTCRAFT),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

}
