package wks.wolfkidsounds.wildplants.world.enhancedfarming;

import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.enhancedfarming.EnhancedFarmingConfig;

public class EnhancedFarmingConfiguredFeatures {

    public static Integer GLOBAL_FREQUENCY_ENHANCEDFARMING = WildplantsConfig.GLOBAL_FREQUENCY.get();
    public static Integer GLOBAL_PATCH_SIZE_ENHANCEDFARMING = WildplantsConfig.GLOBAL_PATCH_SIZE.get();
    public static Integer SPREAD_SIZE = WildplantsConfig.GLOBAL_SPREAD_SIZE.get();

    public static Integer MINT_FREQUENCY_ENHANCEDFARMING = EnhancedFarmingConfig.MINT_FREQUENCY_ENHANCEDFARMING.get() * GLOBAL_FREQUENCY_ENHANCEDFARMING;
    public static Integer MINT_PATCH_SIZE_ENHANCEDFARMING = EnhancedFarmingConfig.MINT_PATCH_SIZE_ENHANCEDFARMING.get() * GLOBAL_PATCH_SIZE_ENHANCEDFARMING;

    public static Integer TOMATO_FREQUENCY_ENHANCEDFARMING = EnhancedFarmingConfig.TOMATO_FREQUENCY_ENHANCEDFARMING.get() * GLOBAL_FREQUENCY_ENHANCEDFARMING;
    public static Integer TOMATO_PATCH_SIZE_ENHANCEDFARMING = EnhancedFarmingConfig.TOMATO_PATCH_SIZE_ENHANCEDFARMING.get() * GLOBAL_PATCH_SIZE_ENHANCEDFARMING;

    public static Integer CUCUMBER_FREQUENCY_ENHANCEDFARMING = EnhancedFarmingConfig.CUCUMBER_FREQUENCY_ENHANCEDFARMING.get() * GLOBAL_FREQUENCY_ENHANCEDFARMING;
    public static Integer CUCUMBER_PATCH_SIZE_ENHANCEDFARMING = EnhancedFarmingConfig.CUCUMBER_PATCH_SIZE_ENHANCEDFARMING.get() * GLOBAL_PATCH_SIZE_ENHANCEDFARMING;

    public static Integer AUBERGINE_FREQUENCY_ENHANCEDFARMING = EnhancedFarmingConfig.AUBERGINE_FREQUENCY_ENHANCEDFARMING.get() * GLOBAL_FREQUENCY_ENHANCEDFARMING;
    public static Integer AUBERGINE_PATCH_SIZE_ENHANCEDFARMING = EnhancedFarmingConfig.AUBERGINE_PATCH_SIZE_ENHANCEDFARMING.get() * GLOBAL_PATCH_SIZE_ENHANCEDFARMING;

    public static Integer GRAPE_FREQUENCY_ENHANCEDFARMING = EnhancedFarmingConfig.GRAPE_FREQUENCY_ENHANCEDFARMING.get() * GLOBAL_FREQUENCY_ENHANCEDFARMING;
    public static Integer GRAPE_PATCH_SIZE_ENHANCEDFARMING = EnhancedFarmingConfig.GRAPE_PATCH_SIZE_ENHANCEDFARMING.get() * GLOBAL_PATCH_SIZE_ENHANCEDFARMING;

    public static Integer PINEAPPLE_FREQUENCY_ENHANCEDFARMING = EnhancedFarmingConfig.PINEPAPPLE_FREQUENCY_ENHANCEDFARMING.get() * GLOBAL_FREQUENCY_ENHANCEDFARMING;
    public static Integer PINEAPPLE_PATCH_SIZE_ENHANCEDFARMING = EnhancedFarmingConfig.PINEPAPPLE_PATCH_SIZE_ENHANCEDFARMING.get() * GLOBAL_PATCH_SIZE_ENHANCEDFARMING;

    public static Integer ONION_FREQUENCY_ENHANCEDFARMING = EnhancedFarmingConfig.ONION_FREQUENCY_ENHANCEDFARMING.get() * GLOBAL_FREQUENCY_ENHANCEDFARMING;
    public static Integer ONION_PATCH_SIZE_ENHANCEDFARMING = EnhancedFarmingConfig.ONION_PATCH_SIZE_ENHANCEDFARMING.get() * GLOBAL_PATCH_SIZE_ENHANCEDFARMING;

    public static Integer CORN_FREQUENCY_ENHANCEDFARMING = EnhancedFarmingConfig.CORN_FREQUENCY_ENHANCEDFARMING.get() * GLOBAL_FREQUENCY_ENHANCEDFARMING;
    public static Integer CORN_PATCH_SIZE_ENHANCEDFARMING = EnhancedFarmingConfig.CORN_PATCH_SIZE_ENHANCEDFARMING.get() * GLOBAL_PATCH_SIZE_ENHANCEDFARMING;

    public static Integer GARLIC_FREQUENCY_ENHANCEDFARMING = EnhancedFarmingConfig.GARLIC_FREQUENCY_ENHANCEDFARMING.get() * GLOBAL_FREQUENCY_ENHANCEDFARMING;
    public static Integer GARLIC_PATCH_SIZE_ENHANCEDFARMING = EnhancedFarmingConfig.GARLIC_PATCH_SIZE_ENHANCEDFARMING.get() * GLOBAL_PATCH_SIZE_ENHANCEDFARMING;

    public static Integer LETTUCE_FREQUENCY_ENHANCEDFARMING = EnhancedFarmingConfig.LETTUCE_FREQUENCY_ENHANCEDFARMING.get() * GLOBAL_FREQUENCY_ENHANCEDFARMING;
    public static Integer LETTUCE_PATCH_SIZE_ENHANCEDFARMING = EnhancedFarmingConfig.LETTUCE_PATCH_SIZE_ENHANCEDFARMING.get() * GLOBAL_PATCH_SIZE_ENHANCEDFARMING;

    //----------FEATURE---CONFIGS----------------

    public static final BlockClusterFeatureConfig ENHANCEDFARMING_WILD_MINT = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.ENHANCEDFARMING_WILD_MINT.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(MINT_PATCH_SIZE_ENHANCEDFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig ENHANCEDFARMING_WILD_TOMATO = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.ENHANCEDFARMING_WILD_TOMATO.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(TOMATO_PATCH_SIZE_ENHANCEDFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig ENHANCEDFARMING_WILD_CUCUMBER = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.ENHANCEDFARMING_WILD_CUCUMBER.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(CUCUMBER_PATCH_SIZE_ENHANCEDFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig ENHANCEDFARMING_WILD_AUBERGINE = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.ENHANCEDFARMING_WILD_AUBERGINE.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(AUBERGINE_PATCH_SIZE_ENHANCEDFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig ENHANCEDFARMING_WILD_GRAPE = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.ENHANCEDFARMING_WILD_GRAPE.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(GRAPE_PATCH_SIZE_ENHANCEDFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig ENHANCEDFARMING_WILD_PINEAPPLE = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.ENHANCEDFARMING_WILD_PINEAPPLE.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(PINEAPPLE_PATCH_SIZE_ENHANCEDFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig ENHANCEDFARMING_WILD_ONION = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.ENHANCEDFARMING_WILD_ONION.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(ONION_PATCH_SIZE_ENHANCEDFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig ENHANCEDFARMING_WILD_CORN = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.ENHANCEDFARMING_WILD_CORN.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(CORN_PATCH_SIZE_ENHANCEDFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig ENHANCEDFARMING_WILD_GARLIC = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.ENHANCEDFARMING_WILD_GARLIC.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(GARLIC_PATCH_SIZE_ENHANCEDFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig ENHANCEDFARMING_WILD_LETTUCE = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.ENHANCEDFARMING_WILD_LETTUCE.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(LETTUCE_PATCH_SIZE_ENHANCEDFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();

    //----------PLACEMENT---CONFIGS----------------

    public static final ConfiguredFeature<?, ?> ENHANCEDFARMING_WILD_MINT_PATCH =
            Feature.FLOWER.withConfiguration(ENHANCEDFARMING_WILD_MINT)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(MINT_FREQUENCY_ENHANCEDFARMING);

    public static final ConfiguredFeature<?, ?> ENHANCEDFARMING_WILD_TOMATO_PATCH =
            Feature.FLOWER.withConfiguration(ENHANCEDFARMING_WILD_TOMATO)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(TOMATO_FREQUENCY_ENHANCEDFARMING);

    public static final ConfiguredFeature<?, ?> ENHANCEDFARMING_WILD_CUCUMBER_PATCH =
            Feature.FLOWER.withConfiguration(ENHANCEDFARMING_WILD_CUCUMBER)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CUCUMBER_FREQUENCY_ENHANCEDFARMING);

    public static final ConfiguredFeature<?, ?> ENHANCEDFARMING_WILD_AUBERGINE_PATCH =
            Feature.FLOWER.withConfiguration(ENHANCEDFARMING_WILD_AUBERGINE)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(AUBERGINE_FREQUENCY_ENHANCEDFARMING);

    public static final ConfiguredFeature<?, ?> ENHANCEDFARMING_WILD_GRAPE_PATCH =
            Feature.FLOWER.withConfiguration(ENHANCEDFARMING_WILD_GRAPE)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(GRAPE_FREQUENCY_ENHANCEDFARMING);

    public static final ConfiguredFeature<?, ?> ENHANCEDFARMING_WILD_PINEAPPLE_PATCH =
            Feature.FLOWER.withConfiguration(ENHANCEDFARMING_WILD_PINEAPPLE)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(PINEAPPLE_FREQUENCY_ENHANCEDFARMING);

    public static final ConfiguredFeature<?, ?> ENHANCEDFARMING_WILD_ONION_PATCH =
            Feature.FLOWER.withConfiguration(ENHANCEDFARMING_WILD_ONION)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(ONION_FREQUENCY_ENHANCEDFARMING);

    public static final ConfiguredFeature<?, ?> ENHANCEDFARMING_WILD_CORN_PATCH =
            Feature.FLOWER.withConfiguration(ENHANCEDFARMING_WILD_CORN)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CORN_FREQUENCY_ENHANCEDFARMING);

    public static final ConfiguredFeature<?, ?> ENHANCEDFARMING_WILD_GARLIC_PATCH =
            Feature.FLOWER.withConfiguration(ENHANCEDFARMING_WILD_GARLIC)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(GARLIC_FREQUENCY_ENHANCEDFARMING);

    public static final ConfiguredFeature<?, ?> ENHANCEDFARMING_WILD_LETTUCE_PATCH =
            Feature.FLOWER.withConfiguration(ENHANCEDFARMING_WILD_LETTUCE)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(LETTUCE_FREQUENCY_ENHANCEDFARMING);
}