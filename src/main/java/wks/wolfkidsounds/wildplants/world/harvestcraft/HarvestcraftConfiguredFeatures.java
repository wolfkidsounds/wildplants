package wks.wolfkidsounds.wildplants.world.harvestcraft;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.HarvestcraftConfig;

public class HarvestcraftConfiguredFeatures {

        public static Integer GLOBAL_PATCH_SIZE_HARVESTCRAFT = WildplantsConfig.GLOBAL_PATCH_SIZE.get();
        public static Integer SPREAD_SIZE = WildplantsConfig.GLOBAL_SPREAD_SIZE.get();
        public static Integer AGAVE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.AGAVE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer AMARANTH_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.AMARANTH_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer ARROWROOT_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.ARROWROOT_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer ARTICHOKE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.ARTICHOKE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer ASPARAGUS_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.ASPARAGUS_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer BARLEY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.BARLEY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer BEAN_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.BEAN_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer BELLPEPPER_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.BELLPEPPER_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer BLACKBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.BLACKBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer BLUEBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.BLUEBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer BROCCOLI_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.BROCCOLI_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer BRUSSELSPROUT_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.BRUSSELSPROUT_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer CABBAGE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CABBAGE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer CACTUSFRUIT_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CACTUSFRUIT_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer CANDLEBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CANDLEBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer CANTALOUPE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CANTALOUPE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer CASSAVA_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CASSAVA_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer CAULIFLOWER_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CAULIFLOWER_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer CELERY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CELERY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer CHICKPEA_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CHICKPEA_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer CHILIPEPPER_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CHILIPEPPER_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer COFFEEBEAN_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.COFFEEBEAN_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer CORN_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CORN_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer COTTON_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.COTTON_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer CRANBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CRANBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer CUCUMBER_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CUCUMBER_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer EGGPLANT_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.EGGPLANT_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer ELDERBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.ELDERBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer FLAX_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.FLAX_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer GARLIC_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.GARLIC_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer GINGER_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.GINGER_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer GRAPE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.GRAPE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer GREENGRAPE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.GREENGRAPE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer HUCKLEBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.HUCKLEBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer JICAMA_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.JICAMA_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer JUNIPERBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.JUNIPERBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer JUTE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.JUTE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer KALE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.KALE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer KENAF_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.KENAF_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer KIWI_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.KIWI_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer KOHLRABI_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.KOHLRABI_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer LEEK_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.LEEK_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer LENTIL_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.LENTIL_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer LETTUCE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.LETTUCE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer MILLET_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.MILLET_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer MULBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.MULBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer MUSTARDSEEDS_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.MUSTARDSEEDS_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer OATS_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.OATS_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer OKRA_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.OKRA_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer ONION_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.ONION_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer PARSNIP_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.PARSNIP_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer PEANUT_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.PEANUT_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer PEAS_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.PEAS_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer PINEAPPLE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.PINEAPPLE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer QUINOA_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.QUINOA_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer RADISH_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.RADISH_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer RASPBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.RASPBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer RHUBARB_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.RHUBARB_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer RICE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.RICE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer RUTABAGA_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.RUTABAGA_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer RYE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.RYE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer SCALLION_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.SCALLION_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer SESAMESEEDS_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.SESAMESEEDS_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer SISAL_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.SISAL_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer SOYBEAN_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.SOYBEAN_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer SPICELEAF_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.SPICELEAF_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer STRAWBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.STRAWBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer SWEETPOTATO_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.SWEETPOTATO_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer TARO_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.TARO_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer TEALEAF_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.TEALEAF_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer TOMATILLO_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.TOMATILLO_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer TOMATO_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.TOMATO_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer TURNIP_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.TURNIP_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer WATERCHESTNUT_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.WATERCHESTNUT_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer WHITEMUSHROOM_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.WHITEMUSHROOM_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer WINTERSQUASH_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.WINTERSQUASH_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer ZUCCHINI_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.ZUCCHINI_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;
        public static Integer SPINACH_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.SPINACH_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    //----------FEATURE---CONFIGS----------------

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_AGAVE_CONFIG =
        FeatureUtils.register("harvestcraft_wild_agave_config", Feature.FLOWER,
                new RandomPatchConfiguration(AGAVE_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_AGAVE.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_AMARANTH_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_amaranth_config", Feature.FLOWER,
                new RandomPatchConfiguration(AMARANTH_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_AMARANTH.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_ARROWROOT_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_arrowroot_config", Feature.FLOWER,
                new RandomPatchConfiguration(ARROWROOT_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_ARROWROOT.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_ARTICHOKE_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_artichoke_config", Feature.FLOWER,
                new RandomPatchConfiguration(ARTICHOKE_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_ARTICHOKE.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_ASPARAGUS_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_asparagus_config", Feature.FLOWER,
                new RandomPatchConfiguration(ASPARAGUS_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_ASPARAGUS.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_BARLEY_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_barley_config", Feature.FLOWER,
                new RandomPatchConfiguration(BARLEY_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_BARLEY.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_BEAN_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_bean_config", Feature.FLOWER,
                new RandomPatchConfiguration(BEAN_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_BEAN.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_BELLPEPPER_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_bellpepper_config", Feature.FLOWER,
                new RandomPatchConfiguration(BELLPEPPER_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_BELLPEPPER.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_BLACKBERRY_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_blackberry_config", Feature.FLOWER,
                new RandomPatchConfiguration(BLACKBERRY_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_BLACKBERRY.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_BLUEBERRY_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_blueberry_config", Feature.FLOWER,
                new RandomPatchConfiguration(BLUEBERRY_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_BLUEBERRY.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_BROCCOLI_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_broccoli_config", Feature.FLOWER,
                new RandomPatchConfiguration(BROCCOLI_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_BROCCOLI.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_BRUSSELSPROUT_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_brusselsprout_config", Feature.FLOWER,
                new RandomPatchConfiguration(BRUSSELSPROUT_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_BRUSSELSPROUT.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_CABBAGE_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_cabbage_config", Feature.FLOWER,
                new RandomPatchConfiguration(CABBAGE_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_CABBAGE.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_CACTUSFRUIT_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_cactusfruit_config", Feature.FLOWER,
                new RandomPatchConfiguration(CACTUSFRUIT_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_CACTUSFRUIT.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_CANDLEBERRY_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_candleberry_config", Feature.FLOWER,
                new RandomPatchConfiguration(CANDLEBERRY_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_CANDLEBERRY.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_CANTALOUPE_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_cantaloupe_config", Feature.FLOWER,
                new RandomPatchConfiguration(CANTALOUPE_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_CANTALOUPE.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_CASSAVA_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_cassava_config", Feature.FLOWER,
                new RandomPatchConfiguration(CASSAVA_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_CASSAVA.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_CAULIFLOWER_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_cauliflower_config", Feature.FLOWER,
                new RandomPatchConfiguration(CAULIFLOWER_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_CAULIFLOWER.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_CELERY_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_celery_config", Feature.FLOWER,
                new RandomPatchConfiguration(CELERY_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_CELERY.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_CHICKPEA_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_chickpea_config", Feature.FLOWER,
                new RandomPatchConfiguration(CHICKPEA_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_CHICKPEA.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_CHILIPEPPER_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_chilipepper_config", Feature.FLOWER,
                new RandomPatchConfiguration(CHILIPEPPER_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_CHILIPEPPER.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_COFFEEBEAN_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_coffeebean_config", Feature.FLOWER,
                new RandomPatchConfiguration(COFFEEBEAN_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_COFFEEBEAN.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_CORN_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_corn_config", Feature.FLOWER,
                new RandomPatchConfiguration(CORN_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_CORN.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_COTTON_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_cotton_config", Feature.FLOWER,
                new RandomPatchConfiguration(COTTON_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_COTTON.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_CRANBERRY_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_cranberry_config", Feature.FLOWER,
                new RandomPatchConfiguration(CRANBERRY_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_CRANBERRY.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_CUCUMBER_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_cucumber_config", Feature.FLOWER,
                new RandomPatchConfiguration(CUCUMBER_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_CUCUMBER.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_EGGPLANT_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_eggplant_config", Feature.FLOWER,
                new RandomPatchConfiguration(EGGPLANT_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_EGGPLANT.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_ELDERBERRY_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_elderberry_config", Feature.FLOWER,
                new RandomPatchConfiguration(ELDERBERRY_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_ELDERBERRY.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_FLAX_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_flax_config", Feature.FLOWER,
                new RandomPatchConfiguration(FLAX_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_FLAX.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_GARLIC_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_garlic_config", Feature.FLOWER,
                new RandomPatchConfiguration(GARLIC_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_GARLIC.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_GINGER_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_ginger_config", Feature.FLOWER,
                new RandomPatchConfiguration(GINGER_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_GINGER.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_GRAPE_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_grape_config", Feature.FLOWER,
                new RandomPatchConfiguration(GRAPE_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_GRAPE.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_GREENGRAPE_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_greengrape_config", Feature.FLOWER,
                new RandomPatchConfiguration(GREENGRAPE_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_GREENGRAPE.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_HUCKLEBERRY_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_huckleberry_config", Feature.FLOWER,
                new RandomPatchConfiguration(HUCKLEBERRY_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_HUCKLEBERRY.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_JICAMA_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_jicama_config", Feature.FLOWER,
                new RandomPatchConfiguration(JICAMA_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_JICAMA.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_JUNIPERBERRY_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_juniperberry_config", Feature.FLOWER,
                new RandomPatchConfiguration(JUNIPERBERRY_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_JUNIPERBERRY.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_JUTE_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_jute_config", Feature.FLOWER,
                new RandomPatchConfiguration(JUTE_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_JUTE.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_KALE_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_kale_config", Feature.FLOWER,
                new RandomPatchConfiguration(KALE_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_KALE.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_KENAF_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_kenaf_config", Feature.FLOWER,
                new RandomPatchConfiguration(KENAF_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_KENAF.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_KIWI_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_kiwi_config", Feature.FLOWER,
                new RandomPatchConfiguration(KIWI_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_KIWI.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_KOHLRABI_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_kohlrabi_config", Feature.FLOWER,
                new RandomPatchConfiguration(KOHLRABI_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_KOHLRABI.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_LEEK_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_leek_config", Feature.FLOWER,
                new RandomPatchConfiguration(LEEK_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_LEEK.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_LENTIL_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_lentil_config", Feature.FLOWER,
                new RandomPatchConfiguration(LENTIL_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_LENTIL.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_LETTUCE_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_lettuce_config", Feature.FLOWER,
                new RandomPatchConfiguration(LETTUCE_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_LETTUCE.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_MILLET_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_millet_config", Feature.FLOWER,
                new RandomPatchConfiguration(MILLET_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_MILLET.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_MULBERRY_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_mulberry_config", Feature.FLOWER,
                new RandomPatchConfiguration(MULBERRY_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_MULBERRY.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_MUSTARDSEEDS_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_mustardseeds_config", Feature.FLOWER,
                new RandomPatchConfiguration(MUSTARDSEEDS_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_MUSTARDSEEDS.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_OATS_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_oats_config", Feature.FLOWER,
                new RandomPatchConfiguration(OATS_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_OATS.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_OKRA_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_okra_config", Feature.FLOWER,
                new RandomPatchConfiguration(OKRA_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_OKRA.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_ONION_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_onion_config", Feature.FLOWER,
                new RandomPatchConfiguration(ONION_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_ONION.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_PARSNIP_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_parsnip_config", Feature.FLOWER,
                new RandomPatchConfiguration(PARSNIP_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_PARSNIP.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_PEANUT_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_peanut_config", Feature.FLOWER,
                new RandomPatchConfiguration(PEANUT_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_PEANUT.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_PEAS_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_peas_config", Feature.FLOWER,
                new RandomPatchConfiguration(PEAS_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_PEAS.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_PINEAPPLE_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_pineapple_config", Feature.FLOWER,
                new RandomPatchConfiguration(PINEAPPLE_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_PINEAPPLE.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_QUINOA_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_quinoa_config", Feature.FLOWER,
                new RandomPatchConfiguration(QUINOA_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_QUINOA.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_RADISH_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_radish_config", Feature.FLOWER,
                new RandomPatchConfiguration(RADISH_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_RADISH.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_RASPBERRY_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_raspberry_config", Feature.FLOWER,
                new RandomPatchConfiguration(RASPBERRY_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_RASPBERRY.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_RHUBARB_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_rhubarb_config", Feature.FLOWER,
                new RandomPatchConfiguration(RHUBARB_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_RHUBARB.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_RICE_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_rice_config", Feature.FLOWER,
                new RandomPatchConfiguration(RICE_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_RICE.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_RUTABAGA_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_rutabaga_config", Feature.FLOWER,
                new RandomPatchConfiguration(RUTABAGA_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_RUTABAGA.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_RYE_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_rye_config", Feature.FLOWER,
                new RandomPatchConfiguration(RYE_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_RYE.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_SCALLION_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_scallion_config", Feature.FLOWER,
                new RandomPatchConfiguration(SCALLION_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_SCALLION.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_SESAMESEEDS_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_sesameseeds_config", Feature.FLOWER,
                new RandomPatchConfiguration(SESAMESEEDS_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_SESAMESEEDS.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_SISAL_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_sisal_config", Feature.FLOWER,
                new RandomPatchConfiguration(SISAL_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_SISAL.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_SOYBEAN_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_soybean_config", Feature.FLOWER,
                new RandomPatchConfiguration(SOYBEAN_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_SOYBEAN.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_SPINACH_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_spinach_config", Feature.FLOWER,
                new RandomPatchConfiguration(SPINACH_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_SPINACH.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_SPICELEAF_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_spiceleaf_config", Feature.FLOWER,
                new RandomPatchConfiguration(SPICELEAF_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_SPICELEAF.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_STRAWBERRY_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_strawberry_config", Feature.FLOWER,
                new RandomPatchConfiguration(STRAWBERRY_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_STRAWBERRY.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_SWEETPOTATO_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_sweetpotato_config", Feature.FLOWER,
                new RandomPatchConfiguration(SWEETPOTATO_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_SWEETPOTATO.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_TARO_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_taro_config", Feature.FLOWER,
                new RandomPatchConfiguration(TARO_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_TARO.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_TEALEAF_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_tealeaf_config", Feature.FLOWER,
                new RandomPatchConfiguration(TEALEAF_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_TEALEAF.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_TOMATILLO_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_tomatillo_config", Feature.FLOWER,
                new RandomPatchConfiguration(TOMATILLO_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_TOMATILLO.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_TOMATO_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_tomato_config", Feature.FLOWER,
                new RandomPatchConfiguration(TOMATO_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_TOMATO.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_TURNIP_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_turnip_config", Feature.FLOWER,
                new RandomPatchConfiguration(TURNIP_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_TURNIP.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_WATERCHESTNUT_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_waterchestnut_config", Feature.FLOWER,
                new RandomPatchConfiguration(WATERCHESTNUT_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_WATERCHESTNUT.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_WHITEMUSHROOM_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_whitemushroom_config", Feature.FLOWER,
                new RandomPatchConfiguration(WHITEMUSHROOM_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_WHITEMUSHROOM.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_WINTERSQUASH_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_wintersquash_config", Feature.FLOWER,
                new RandomPatchConfiguration(WINTERSQUASH_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_WINTERSQUASH.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARVESTCRAFT_WILD_ZUCCHINI_CONFIG = 
        FeatureUtils.register("harvestcraft_wild_zucchini_config", Feature.FLOWER,
                new RandomPatchConfiguration(ZUCCHINI_PATCH_SIZE_HARVESTCRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARVESTCRAFT_WILD_ZUCCHINI.get())))));
}
