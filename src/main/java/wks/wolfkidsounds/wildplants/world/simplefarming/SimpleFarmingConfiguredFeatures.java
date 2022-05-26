package wks.wolfkidsounds.wildplants.world.simplefarming;

import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.simplefarming.SimpleFarmingConfig;

public class SimpleFarmingConfiguredFeatures {
        public static Integer GLOBAL_FREQUENCY_SIMPLEFARMING = WildplantsConfig.GLOBAL_FREQUENCY.get();
        public static Integer GLOBAL_PATCH_SIZE_SIMPLEFARMING = WildplantsConfig.GLOBAL_PATCH_SIZE.get();
        public static Integer SPREAD_SIZE = WildplantsConfig.GLOBAL_SPREAD_SIZE.get();
    
        public static Integer CUMIN_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.CUMIN_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer CUMIN_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.CUMIN_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer QUINOA_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.QUINOA_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer QUINOA_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.QUINOA_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer SUNFLOWER_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.SUNFLOWER_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer SUNFLOWER_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.SUNFLOWER_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer CANTALOUPE_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.CANTALOUPE_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer CANTALOUPE_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.CANTALOUPE_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer HONEYDEW_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.HONEYDEW_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer HONEYDEW_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.HONEYDEW_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer SQUASH_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.SQUASH_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer SQUASH_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.SQUASH_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer BARLEY_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.BARLEY_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer BARLEY_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.BARLEY_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer BROCCOLI_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.BROCCOLI_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer BROCCOLI_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.BROCCOLI_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer CASSAVA_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.CASSAVA_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer CASSAVA_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.CASSAVA_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer CORN_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.CORN_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer CORN_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.CORN_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer COTTON_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.COTTON_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer COTTON_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.COTTON_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer CUCUMBER_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.CUCUMBER_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer CUCUMBER_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.CUCUMBER_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer EGGPLANT_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.EGGPLANT_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer EGGPLANT_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.EGGPLANT_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer GINGER_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.GINGER_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer GINGER_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.GINGER_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer GRAPE_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.GRAPE_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer GRAPE_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.GRAPE_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer KENAF_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.KENAF_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer KENAF_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.KENAF_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer LETTUCE_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.LETTUCE_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer LETTUCE_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.LETTUCE_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer OAT_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.OAT_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer OAT_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.OAT_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer ONION_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.ONION_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer ONION_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.ONION_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer PEA_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.PEA_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer PEA_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.PEA_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer PEANUT_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.PEANUT_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer PEANUT_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.PEANUT_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer PEPPER_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.PEPPER_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer PEPPER_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.PEPPER_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;

        public static Integer RADISH_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.RADISH_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer RADISH_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.RADISH_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer RICE_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.RICE_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer RICE_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.RICE_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer RYE_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.RYE_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer RYE_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.RYE_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer SORGHUM_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.SORGHUM_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer SORGHUM_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.SORGHUM_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer SOYBEAN_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.SOYBEAN_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer SOYBEAN_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.SOYBEAN_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer SPINACH_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.SPINACH_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer SPINACH_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.SPINACH_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer SWEETPOTATO_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.SWEETPOTATO_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer SWEETPOTATO_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.SWEETPOTATO_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer TOMATO_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.TOMATO_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer TOMATO_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.TOMATO_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer TURNIP_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.TURNIP_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer TURNIP_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.TURNIP_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer YAM_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.YAM_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer YAM_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.YAM_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
        public static Integer ZUCCHINI_FREQUENCY_SIMPLEFARMING = SimpleFarmingConfig.ZUCCHINI_FREQUENCY_SIMPLEFARMING.get() * GLOBAL_FREQUENCY_SIMPLEFARMING;
        public static Integer ZUCCHINI_PATCH_SIZE_SIMPLEFARMING = SimpleFarmingConfig.ZUCCHINI_PATCH_SIZE_SIMPLEFARMING.get() * GLOBAL_PATCH_SIZE_SIMPLEFARMING;
    
    
        //----------FEATURE---CONFIGS----------------
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_CUMIN = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_CUMIN.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(CUMIN_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_QUINOA = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_QUINOA.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(QUINOA_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_SUNFLOWER = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_SUNFLOWER.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(SUNFLOWER_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_CANTALOUPE = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_CANTALOUPE.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(CANTALOUPE_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_HONEYDEW = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_HONEYDEW.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(HONEYDEW_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_SQUASH = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_SQUASH.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(SQUASH_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_BARLEY = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_BARLEY.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(BARLEY_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_BROCCOLI = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_BROCCOLI.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(BROCCOLI_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_CASSAVA = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_CASSAVA.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(CASSAVA_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_CORN = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_CORN.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(CORN_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_COTTON = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_COTTON.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(COTTON_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_CUCUMBER = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_CUCUMBER.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(CUCUMBER_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_EGGPLANT = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_EGGPLANT.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(EGGPLANT_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_GINGER = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_GINGER.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(GINGER_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_GRAPE = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_GRAPE.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(GRAPE_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_KENAF = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_KENAF.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(KENAF_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_LETTUCE = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_LETTUCE.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(LETTUCE_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_OAT = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_OAT.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(OAT_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_ONION = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_ONION.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(ONION_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_PEA = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_PEA.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(PEA_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_PEANUT = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_PEANUT.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(PEANUT_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_PEPPER = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_PEPPER.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(PEPPER_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_RADISH = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_RADISH.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(RADISH_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_RICE = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_RICE.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(RICE_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_RYE = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_RYE.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(RYE_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_SORGHUM = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_SORGHUM.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(SORGHUM_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_SOYBEAN = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_SOYBEAN.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(SOYBEAN_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_SPINACH = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_SPINACH.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(SPINACH_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_SWEETPOTATO = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_SWEETPOTATO.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(SWEETPOTATO_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_TOMATO = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_TOMATO.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(TOMATO_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_TURNIP = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_TURNIP.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(TURNIP_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_YAM = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_YAM.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(YAM_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
    
        public static final BlockClusterFeatureConfig SIMPLEFARMING_WILD_ZUCCHINI = (
                new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(ModBlocks.SIMPLEFARMING_WILD_ZUCCHINI.get().getDefaultState()),
                        new SimpleBlockPlacer())).tries(ZUCCHINI_PATCH_SIZE_SIMPLEFARMING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();
    
        //----------PLACEMENT---CONFIGS----------------
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_CUMIN_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_CUMIN)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CUMIN_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_QUINOA_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_QUINOA)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(QUINOA_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_SUNFLOWER_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_SUNFLOWER)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(SUNFLOWER_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_CANTALOUPE_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_CANTALOUPE)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CANTALOUPE_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_HONEYDEW_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_HONEYDEW)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(HONEYDEW_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_SQUASH_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_SQUASH)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(SQUASH_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_BARLEY_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_BARLEY)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(BARLEY_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_BROCCOLI_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_BROCCOLI)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(BROCCOLI_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_CASSAVA_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_CASSAVA)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CASSAVA_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_CORN_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_CORN)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CORN_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_COTTON_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_COTTON)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(COTTON_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_CUCUMBER_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_CUCUMBER)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CUCUMBER_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_EGGPLANT_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_EGGPLANT)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(EGGPLANT_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_GINGER_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_GINGER)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(GINGER_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_GRAPE_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_GRAPE)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(GRAPE_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_KENAF_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_KENAF)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(KENAF_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_LETTUCE_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_LETTUCE)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(LETTUCE_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_OAT_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_OAT)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(OAT_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_ONION_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_ONION)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(ONION_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_PEA_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_PEA)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(PEA_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_PEANUT_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_PEANUT)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(PEANUT_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_PEPPER_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_PEPPER)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(PEPPER_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_RADISH_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_RADISH)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(RADISH_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_RICE_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_RICE)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(RICE_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_RYE_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_RYE)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(RYE_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_SORGHUM_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_SORGHUM)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(SORGHUM_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_SOYBEAN_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_SOYBEAN)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(SOYBEAN_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_SPINACH_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_SPINACH)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(SPINACH_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_SWEETPOTATO_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_SWEETPOTATO)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(SWEETPOTATO_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_TOMATO_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_TOMATO)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(TOMATO_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_TURNIP_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_TURNIP)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(TURNIP_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_YAM_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_YAM)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(YAM_FREQUENCY_SIMPLEFARMING);
    
        public static final ConfiguredFeature<?, ?> SIMPLEFARMING_WILD_ZUCCHINI_PATCH =
                Feature.FLOWER.withConfiguration(SIMPLEFARMING_WILD_ZUCCHINI)
                        .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(ZUCCHINI_FREQUENCY_SIMPLEFARMING);
}