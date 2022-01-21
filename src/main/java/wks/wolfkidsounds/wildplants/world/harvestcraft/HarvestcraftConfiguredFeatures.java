package wks.wolfkidsounds.wildplants.world.harvestcraft;

import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import wks.wolfkidsounds.wildplants.block.HarvestcraftModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.HarvestcraftConfig;

public class HarvestcraftConfiguredFeatures {

    public static Integer GLOBAL_FREQUENCY = WildplantsConfig.GLOBAL_FREQUENCY.get();
    public static Integer GLOBAL_PATCH_SIZE = WildplantsConfig.GLOBAL_PATCH_SIZE.get();

    public static Integer AGAVE_FREQUENCY = HarvestcraftConfig.AGAVE_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer AGAVE_PATCH_SIZE = HarvestcraftConfig.AGAVE_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer AMARANTH_FREQUENCY = HarvestcraftConfig.AMARANTH_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer AMARANTH_PATCH_SIZE = HarvestcraftConfig.AMARANTH_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer ARROWROOT_FREQUENCY = HarvestcraftConfig.ARROWROOT_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer ARROWROOT_PATCH_SIZE = HarvestcraftConfig.ARROWROOT_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer ARTICHOKE_FREQUENCY = HarvestcraftConfig.ARTICHOKE_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer ARTICHOKE_PATCH_SIZE = HarvestcraftConfig.ARROWROOT_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer ASPARAGUS_FREQUENCY = HarvestcraftConfig.ASPARAGUS_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer ASPARAGUS_PATCH_SIZE = HarvestcraftConfig.ASPARAGUS_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer BARLEY_FREQUENCY = HarvestcraftConfig.BARLEY_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer BARLEY_PATCH_SIZE = HarvestcraftConfig.BARLEY_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer BEAN_FREQUENCY = HarvestcraftConfig.BEAN_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer BEAN_PATCH_SIZE = HarvestcraftConfig.BEAN_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer BELLPEPPER_FREQUENCY = HarvestcraftConfig.BELLPEPPER_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer BELLPEPPER_PATCH_SIZE = HarvestcraftConfig.BELLPEPPER_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer BLACKBERRY_FREQUENCY = HarvestcraftConfig.BLACKBERRY_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer BLACKBERRY_PATCH_SIZE = HarvestcraftConfig.BLACKBERRY_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer BLUEBERRY_FREQUENCY = HarvestcraftConfig.BLUEBERRY_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer BLUEBERRY_PATCH_SIZE = HarvestcraftConfig.BLUEBERRY_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer BROCCOLI_FREQUENCY = HarvestcraftConfig.BROCCOLI_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer BROCCOLI_PATCH_SIZE = HarvestcraftConfig.BROCCOLI_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer BRUSSELSPROUT_FREQUENCY = HarvestcraftConfig.BRUSSELSPROUT_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer BRUSSELSPROUT_PATCH_SIZE = HarvestcraftConfig.BRUSSELSPROUT_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer CABBAGE_FREQUENCY = HarvestcraftConfig.CABBAGE_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer CABBAGE_PATCH_SIZE = HarvestcraftConfig.CABBAGE_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer CACTUSFRUIT_FREQUENCY = HarvestcraftConfig.CACTUSFRUIT_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer CACTUSFRUIT_PATCH_SIZE = HarvestcraftConfig.CACTUSFRUIT_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer CANDLEBERRY_FREQUENCY = HarvestcraftConfig.CANDLEBERRY_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer CANDLEBERRY_PATCH_SIZE = HarvestcraftConfig.CANDLEBERRY_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer CANTALOUPE_FREQUENCY = HarvestcraftConfig.CANTALOUPE_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer CANTALOUPE_PATCH_SIZE = HarvestcraftConfig.CANTALOUPE_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer CASSAVA_FREQUENCY = HarvestcraftConfig.CASSAVA_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer CASSAVA_PATCH_SIZE = HarvestcraftConfig.CASSAVA_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer CAULIFLOWER_FREQUENCY = HarvestcraftConfig.CAULIFLOWER_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer CAULIFLOWER_PATCH_SIZE = HarvestcraftConfig.CAULIFLOWER_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer CELERY_FREQUENCY = HarvestcraftConfig.CELERY_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer CELERY_PATCH_SIZE = HarvestcraftConfig.CELERY_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer CHICKPEA_FREQUENCY = HarvestcraftConfig.CHICKPEA_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer CHICKPEA_PATCH_SIZE = HarvestcraftConfig.CHICKPEA_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer CHILIPEPPER_FREQUENCY = HarvestcraftConfig.CHILIPEPPER_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer CHILIPEPPER_PATCH_SIZE = HarvestcraftConfig.CHILIPEPPER_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer COFFEEBEAN_FREQUENCY = HarvestcraftConfig.COFFEEBEAN_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer COFFEEBEAN_PATCH_SIZE = HarvestcraftConfig.COFFEEBEAN_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer CORN_FREQUENCY = HarvestcraftConfig.CORN_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer CORN_PATCH_SIZE = HarvestcraftConfig.CORN_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer COTTON_FREQUENCY = HarvestcraftConfig.COTTON_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer COTTON_PATCH_SIZE = HarvestcraftConfig.COTTON_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer CRANBERRY_FREQUENCY = HarvestcraftConfig.CRANBERRY_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer CRANBERRY_PATCH_SIZE = HarvestcraftConfig.CRANBERRY_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer CUCUMBER_FREQUENCY = HarvestcraftConfig.CUCUMBER_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer CUCUMBER_PATCH_SIZE = HarvestcraftConfig.CUCUMBER_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer EGGPLANT_FREQUENCY = HarvestcraftConfig.EGGPLANT_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer EGGPLANT_PATCH_SIZE = HarvestcraftConfig.EGGPLANT_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer ELDERBERRY_FREQUENCY = HarvestcraftConfig.ELDERBERRY_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer ELDERBERRY_PATCH_SIZE = HarvestcraftConfig.ELDERBERRY_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer FLAX_FREQUENCY = HarvestcraftConfig.FLAX_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer FLAX_PATCH_SIZE = HarvestcraftConfig.FLAX_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer GARLIC_FREQUENCY = HarvestcraftConfig.GARLIC_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer GARLIC_PATCH_SIZE = HarvestcraftConfig.GARLIC_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer GINGER_FREQUENCY = HarvestcraftConfig.GINGER_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer GINGER_PATCH_SIZE = HarvestcraftConfig.GINGER_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer GRAPE_FREQUENCY = HarvestcraftConfig.GRAPE_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer GRAPE_PATCH_SIZE = HarvestcraftConfig.GRAPE_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer GREENGRAPE_FREQUENCY = HarvestcraftConfig.GREENGRAPE_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer GREENGRAPE_PATCH_SIZE = HarvestcraftConfig.GREENGRAPE_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer HUCKLEBERRY_FREQUENCY = HarvestcraftConfig.HUCKLEBERRY_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer HUCKLEBERRY_PATCH_SIZE = HarvestcraftConfig.HUCKLEBERRY_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer JICAMA_FREQUENCY = HarvestcraftConfig.JICAMA_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer JICAMA_PATCH_SIZE = HarvestcraftConfig.JICAMA_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer JUNIPERBERRY_FREQUENCY = HarvestcraftConfig.JUNIPERBERRY_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer JUNIPERBERRY_PATCH_SIZE = HarvestcraftConfig.JUNIPERBERRY_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer JUTE_FREQUENCY = HarvestcraftConfig.JUTE_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer JUTE_PATCH_SIZE = HarvestcraftConfig.JUTE_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer KALE_FREQUENCY = HarvestcraftConfig.KALE_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer KALE_PATCH_SIZE = HarvestcraftConfig.KALE_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer KENAF_FREQUENCY = HarvestcraftConfig.KENAF_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer KENAF_PATCH_SIZE = HarvestcraftConfig.KENAF_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer KIWI_FREQUENCY = HarvestcraftConfig.KIWI_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer KIWI_PATCH_SIZE = HarvestcraftConfig.KIWI_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer KOHLRABI_FREQUENCY = HarvestcraftConfig.KOHLRABI_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer KOHLRABI_PATCH_SIZE = HarvestcraftConfig.KOHLRABI_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer LEEK_FREQUENCY = HarvestcraftConfig.LEEK_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer LEEK_PATCH_SIZE = HarvestcraftConfig.LEEK_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer LENTIL_FREQUENCY = HarvestcraftConfig.LENTIL_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer LENTIL_PATCH_SIZE = HarvestcraftConfig.LENTIL_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer LETTUCE_FREQUENCY = HarvestcraftConfig.LETTUCE_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer LETTUCE_PATCH_SIZE = HarvestcraftConfig.LETTUCE_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer MILLET_FREQUENCY = HarvestcraftConfig.MILLET_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer MILLET_PATCH_SIZE = HarvestcraftConfig.MILLET_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer MULBERRY_FREQUENCY = HarvestcraftConfig.MULBERRY_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer MULBERRY_PATCH_SIZE = HarvestcraftConfig.MULBERRY_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer MUSTARDSEEDS_FREQUENCY = HarvestcraftConfig.MUSTARDSEEDS_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer MUSTARDSEEDS_PATCH_SIZE = HarvestcraftConfig.MUSTARDSEEDS_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer OATS_FREQUENCY = HarvestcraftConfig.OATS_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer OATS_PATCH_SIZE = HarvestcraftConfig.OATS_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer OKRA_FREQUENCY = HarvestcraftConfig.OKRA_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer OKRA_PATCH_SIZE = HarvestcraftConfig.OKRA_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer ONION_FREQUENCY = HarvestcraftConfig.ONION_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer ONION_PATCH_SIZE = HarvestcraftConfig.ONION_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer PARSNIP_FREQUENCY = HarvestcraftConfig.PARSNIP_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer PARSNIP_PATCH_SIZE = HarvestcraftConfig.PARSNIP_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer PEANUT_FREQUENCY = HarvestcraftConfig.PEANUT_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer PEANUT_PATCH_SIZE = HarvestcraftConfig.PEANUT_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer PEAS_FREQUENCY = HarvestcraftConfig.PEAS_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer PEAS_PATCH_SIZE = HarvestcraftConfig.PEAS_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer PINEAPPLE_FREQUENCY = HarvestcraftConfig.PINEAPPLE_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer PINEAPPLE_PATCH_SIZE = HarvestcraftConfig.PINEAPPLE_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer QUINOA_FREQUENCY = HarvestcraftConfig.QUINOA_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer QUINOA_PATCH_SIZE = HarvestcraftConfig.QUINOA_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer RADISH_FREQUENCY = HarvestcraftConfig.RADISH_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer RADISH_PATCH_SIZE = HarvestcraftConfig.RADISH_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer RASPBERRY_FREQUENCY = HarvestcraftConfig.RASPBERRY_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer RASPBERRY_PATCH_SIZE = HarvestcraftConfig.RASPBERRY_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer RHUBARB_FREQUENCY = HarvestcraftConfig.RHUBARB_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer RHUBARB_PATCH_SIZE = HarvestcraftConfig.RHUBARB_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer RICE_FREQUENCY = HarvestcraftConfig.RICE_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer RICE_PATCH_SIZE = HarvestcraftConfig.RICE_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer RUTABAGA_FREQUENCY = HarvestcraftConfig.RUTABAGA_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer RUTABAGA_PATCH_SIZE = HarvestcraftConfig.RUTABAGA_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer RYE_FREQUENCY = HarvestcraftConfig.RYE_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer RYE_PATCH_SIZE = HarvestcraftConfig.RYE_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer SCALLION_FREQUENCY = HarvestcraftConfig.SCALLION_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer SCALLION_PATCH_SIZE = HarvestcraftConfig.SCALLION_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer SESAMESEEDS_FREQUENCY = HarvestcraftConfig.SESAMESEEDS_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer SESAMESEEDS_PATCH_SIZE = HarvestcraftConfig.SESAMESEEDS_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer SISAL_FREQUENCY = HarvestcraftConfig.SISAL_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer SISAL_PATCH_SIZE = HarvestcraftConfig.SISAL_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer SOYBEAN_FREQUENCY = HarvestcraftConfig.SOYBEAN_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer SOYBEAN_PATCH_SIZE = HarvestcraftConfig.SOYBEAN_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer SPICELEAF_FREQUENCY = HarvestcraftConfig.SPICELEAF_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer SPICELEAF_PATCH_SIZE = HarvestcraftConfig.SPICELEAF_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer STRAWBERRY_FREQUENCY = HarvestcraftConfig.STRAWBERRY_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer STRAWBERRY_PATCH_SIZE = HarvestcraftConfig.STRAWBERRY_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer SWEETPOTATO_FREQUENCY = HarvestcraftConfig.SWEETPOTATO_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer SWEETPOTATO_PATCH_SIZE = HarvestcraftConfig.SWEETPOTATO_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer TARO_FREQUENCY = HarvestcraftConfig.TARO_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer TARO_PATCH_SIZE = HarvestcraftConfig.TARO_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer TEALEAF_FREQUENCY = HarvestcraftConfig.TEALEAF_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer TEALEAF_PATCH_SIZE = HarvestcraftConfig.TEALEAF_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer TOMATILLO_FREQUENCY = HarvestcraftConfig.TOMATILLO_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer TOMATILLO_PATCH_SIZE = HarvestcraftConfig.TOMATILLO_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer TOMATO_FREQUENCY = HarvestcraftConfig.TOMATO_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer TOMATO_PATCH_SIZE = HarvestcraftConfig.TOMATO_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer TURNIP_FREQUENCY = HarvestcraftConfig.TURNIP_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer TURNIP_PATCH_SIZE = HarvestcraftConfig.TURNIP_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer WATERCHESTNUT_FREQUENCY = HarvestcraftConfig.WATERCHESTNUT_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer WATERCHESTNUT_PATCH_SIZE = HarvestcraftConfig.WATERCHESTNUT_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer WHITEMUSHROOM_FREQUENCY = HarvestcraftConfig.WHITEMUSHROOM_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer WHITEMUSHROOM_PATCH_SIZE = HarvestcraftConfig.WHITEMUSHROOM_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer WINTERSQUASH_FREQUENCY = HarvestcraftConfig.WINTERSQUASH_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer WINTERSQUASH_PATCH_SIZE = HarvestcraftConfig.WINTERSQUASH_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer ZUCCHINI_FREQUENCY = HarvestcraftConfig.ZUCCHINI_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer ZUCCHINI_PATCH_SIZE = HarvestcraftConfig.ZUCCHINI_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    public static Integer SPINACH_FREQUENCY = HarvestcraftConfig.SPINACH_FREQUENCY.get() * GLOBAL_FREQUENCY;
    public static Integer SPINACH_PATCH_SIZE = HarvestcraftConfig.SPINACH_PATCH_SIZE.get() * GLOBAL_PATCH_SIZE;

    


    public static final ConfiguredFeature<?, ?> WILD_AGAVE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_AGAVE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(AGAVE_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(AGAVE_FREQUENCY);
    
    public static final ConfiguredFeature<?, ?> WILD_AMARANTH_CONFIG = Feature.FLOWER.withConfiguration((
        new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_AMARANTH.get().getDefaultState()),
                SimpleBlockPlacer.PLACER)).tries(AMARANTH_PATCH_SIZE).zSpread(3).xSpread(3).build())
        .withPlacement(Features.Placements.PATCH_PLACEMENT)
        .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
        .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(AMARANTH_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_ARROWROOT_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_ARROWROOT.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(ARROWROOT_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(ARROWROOT_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_ARTICHOKE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_ARTICHOKE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(ARTICHOKE_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(ARTICHOKE_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_ASPARAGUS_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_ASPARAGUS.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(ASPARAGUS_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(ASPARAGUS_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_BARLEY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_BARLEY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(BARLEY_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(BARLEY_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_BEAN_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_BEAN.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(BEAN_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(BEAN_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_BELLPEPPER_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_BELLPEPPER.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(BELLPEPPER_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(BELLPEPPER_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_BLACKBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_BLACKBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(BLACKBERRY_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(BLACKBERRY_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_BLUEBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_BLUEBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(BLUEBERRY_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(BLUEBERRY_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_BROCCOLI_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_BROCCOLI.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(BROCCOLI_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(BROCCOLI_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_BRUSSELSPROUT_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_BRUSSELSPROUT.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(BRUSSELSPROUT_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(BRUSSELSPROUT_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_CABBAGE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_CABBAGE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CABBAGE_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CABBAGE_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_CACTUSFRUIT_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_CACTUSFRUIT.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CACTUSFRUIT_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CACTUSFRUIT_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_CANDLEBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_CANDLEBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CANDLEBERRY_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CANDLEBERRY_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_CANTALOUPE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_CANTALOUPE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CANTALOUPE_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CANTALOUPE_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_CASSAVA_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_CASSAVA.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CASSAVA_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CASSAVA_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_CAULIFLOWER_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_CAULIFLOWER.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CAULIFLOWER_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CAULIFLOWER_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_CELERY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_CELERY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CELERY_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CELERY_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_CHICKPEA_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_CHICKPEA.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CHICKPEA_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CHICKPEA_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_CHILIPEPPER_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_CHILIPEPPER.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CHILIPEPPER_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CHILIPEPPER_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_COFFEEBEAN_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_COFFEEBEAN.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(COFFEEBEAN_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(COFFEEBEAN_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_CORN_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_CORN.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CORN_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CORN_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_COTTON_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_COTTON.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(COTTON_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(COTTON_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_CRANBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_CRANBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CRANBERRY_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CRANBERRY_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_CUCUMBER_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_CUCUMBER.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CUCUMBER_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CUCUMBER_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_EGGPLANT_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_EGGPLANT.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(EGGPLANT_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(EGGPLANT_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_ELDERBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_ELDERBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(ELDERBERRY_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(ELDERBERRY_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_FLAX_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_FLAX.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(FLAX_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(FLAX_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_GARLIC_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_GARLIC.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(GARLIC_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(GARLIC_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_GINGER_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_GINGER.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(GINGER_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(GINGER_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_GRAPE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_GRAPE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(GRAPE_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(GRAPE_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_GREENGRAPE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_GREENGRAPE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(GREENGRAPE_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(GREENGRAPE_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_HUCKLEBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_HUCKLEBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(HUCKLEBERRY_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(HUCKLEBERRY_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_JICAMA_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_JICAMA.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(JICAMA_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(JICAMA_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_JUNIPERBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_JUNIPERBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(JUNIPERBERRY_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(JUNIPERBERRY_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_JUTE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_JUTE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(JUTE_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(JUTE_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_KALE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_KALE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(KALE_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(KALE_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_KENAF_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_KENAF.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(KENAF_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(KENAF_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_KIWI_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_KIWI.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(KIWI_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(KIWI_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_KOHLRABI_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_KOHLRABI.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(KOHLRABI_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(KOHLRABI_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_LEEK_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_LEEK.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(LEEK_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(LEEK_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_LENTIL_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_LENTIL.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(LENTIL_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(LENTIL_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_LETTUCE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_LETTUCE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(LETTUCE_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(LETTUCE_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_MILLET_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_MILLET.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(MILLET_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(MILLET_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_MULBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_MULBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(MULBERRY_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(MULBERRY_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_MUSTARDSEEDS_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_MUSTARDSEEDS.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(MUSTARDSEEDS_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(MUSTARDSEEDS_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_OATS_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_OATS.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(OATS_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(OATS_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_OKRA_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_OKRA.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(OKRA_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(OKRA_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_ONION_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_ONION.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(ONION_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(ONION_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_PARSNIP_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_PARSNIP.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(PARSNIP_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(PARSNIP_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_PEANUT_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_PEANUT.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(PEANUT_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(PEANUT_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_PEAS_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_PEAS.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(PEAS_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(PEAS_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_PINEAPPLE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_PINEAPPLE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(PINEAPPLE_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(PINEAPPLE_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_QUINOA_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_QUINOA.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(QUINOA_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(QUINOA_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_RADISH_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_RADISH.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(RADISH_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(RADISH_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_RASPBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_RASPBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(RASPBERRY_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(RASPBERRY_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_RHUBARB_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_RHUBARB.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(RHUBARB_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(RHUBARB_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_RICE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_RICE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(RICE_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(RICE_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_RUTABAGA_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_RUTABAGA.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(RUTABAGA_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(RUTABAGA_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_RYE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_RYE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(RYE_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(RYE_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_SCALLION_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_SCALLION.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(SCALLION_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(SCALLION_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_SESAMESEEDS_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_SESAMESEEDS.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(SESAMESEEDS_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(SESAMESEEDS_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_SISAL_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_SISAL.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(SISAL_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(SISAL_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_SOYBEAN_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_SOYBEAN.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(SOYBEAN_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(SOYBEAN_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_SPINACH_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_SPINACH.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(SPINACH_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(SPINACH_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_SPICELEAF_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_SPICELEAF.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(SPICELEAF_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(SPICELEAF_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_STRAWBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_STRAWBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(STRAWBERRY_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(STRAWBERRY_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_SWEETPOTATO_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_SWEETPOTATO.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(SWEETPOTATO_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(SWEETPOTATO_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_TARO_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_TARO.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(TARO_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(TARO_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_TEALEAF_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_TEALEAF.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(TEALEAF_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(TEALEAF_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_TOMATILLO_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_TOMATILLO.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(TOMATILLO_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(TOMATILLO_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_TOMATO_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_TOMATO.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(TOMATO_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(TOMATO_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_TURNIP_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_TURNIP.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(TURNIP_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(TURNIP_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_WATERCHESTNUT_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_WATERCHESTNUT.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(WATERCHESTNUT_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(WATERCHESTNUT_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_WHITEMUSHROOM_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_WHITEMUSHROOM.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(WHITEMUSHROOM_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(WHITEMUSHROOM_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_WINTERSQUASH_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_WINTERSQUASH.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(WINTERSQUASH_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(WINTERSQUASH_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_ZUCCHINI_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HarvestcraftModBlocks.WILD_ZUCCHINI.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(ZUCCHINI_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(ZUCCHINI_FREQUENCY);

            
}
