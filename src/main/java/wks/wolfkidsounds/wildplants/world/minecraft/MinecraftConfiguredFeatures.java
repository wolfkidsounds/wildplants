package wks.wolfkidsounds.wildplants.world.minecraft;

import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.minecraft.MinecraftConfig;

public class MinecraftConfiguredFeatures {

    public static Integer FREQUENCY_GLOBAL = WildplantsConfig.GLOBAL_FREQUENCY.get();
    public static Integer PATCH_SIZE_GLOBAL = WildplantsConfig.GLOBAL_PATCH_SIZE.get();
    public static Integer SPREAD_SIZE = WildplantsConfig.GLOBAL_SPREAD_SIZE.get();

    public static Integer WHEAT_FREQUENCY_MINECRAFT = MinecraftConfig.WHEAT_FREQUENCY_MINECRAFT.get() * FREQUENCY_GLOBAL;
    public static Integer WHEAT_PATCH_SIZE_MINECRAFT = MinecraftConfig.WHEAT_PATCH_SIZE_MINECRAFT.get() * PATCH_SIZE_GLOBAL;

    public static Integer CARROTS_FREQUENCY_MINECRAFT = MinecraftConfig.CARROTS_FREQUENCY_MINECRAFT.get() * FREQUENCY_GLOBAL;
    public static Integer CARROTS_PATCH_SIZE_MINECRAFT = MinecraftConfig.CARROTS_PATCH_SIZE_MINECRAFT.get() * PATCH_SIZE_GLOBAL;

    public static Integer POTATOES_FREQUENCY_MINECRAFT = MinecraftConfig.POTATOES_FREQUENCY_MINECRAFT.get() * FREQUENCY_GLOBAL;
    public static Integer POTATOES_PATCH_SIZE_MINECRAFT = MinecraftConfig.POTATOES_PATCH_SIZE_MINECRAFT.get() * PATCH_SIZE_GLOBAL;

    public static Integer BEETROOTS_FREQUENCY_MINECRAFT = MinecraftConfig.BEETROOTS_FREQUENCY_MINECRAFT.get() * FREQUENCY_GLOBAL;
    public static Integer BEETROOTS_PATCH_SIZE_MINECRAFT = MinecraftConfig.BEETROOTS_PATCH_SIZE_MINECRAFT.get() * PATCH_SIZE_GLOBAL;

    //----------FEATURE---CONFIGS----------------

    public static final BlockClusterFeatureConfig MINECRAFT_WILD_WHEAT_CONFIG = (
            new BlockClusterFeatureConfig.Builder(
                new SimpleBlockStateProvider(ModBlocks.MINECRAFT_WILD_WHEAT.get().getDefaultState()),
                new SimpleBlockPlacer())).tries(WHEAT_PATCH_SIZE_MINECRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();

    public static final BlockClusterFeatureConfig MINECRAFT_WILD_CARROTS_CONFIG = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.MINECRAFT_WILD_CARROTS.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(CARROTS_PATCH_SIZE_MINECRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();

    public static final BlockClusterFeatureConfig MINECRAFT_WILD_POTATOES_CONFIG = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.MINECRAFT_WILD_POTATOES.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(POTATOES_PATCH_SIZE_MINECRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();

    public static final BlockClusterFeatureConfig MINECRAFT_WILD_BEETROOTS_CONFIG = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.MINECRAFT_WILD_BEETROOTS.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(BEETROOTS_PATCH_SIZE_MINECRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();

    //----------PLACEMENT---CONFIGS----------------

    public static final ConfiguredFeature<?, ?> MINECRAFT_WILD_WHEAT_PATCH =
            Feature.FLOWER.withConfiguration(MINECRAFT_WILD_WHEAT_CONFIG)
                .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(WHEAT_FREQUENCY_MINECRAFT);

    public static final ConfiguredFeature<?, ?> MINECRAFT_WILD_CARROTS_PATCH =
            Feature.FLOWER.withConfiguration(MINECRAFT_WILD_CARROTS_CONFIG)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CARROTS_FREQUENCY_MINECRAFT);

    public static final ConfiguredFeature<?, ?> MINECRAFT_WILD_POTATOES_PATCH =
            Feature.FLOWER.withConfiguration(MINECRAFT_WILD_POTATOES_CONFIG)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(POTATOES_FREQUENCY_MINECRAFT);

    public static final ConfiguredFeature<?, ?> MINECRAFT_WILD_BEETROOTS_PATCH =
            Feature.FLOWER.withConfiguration(MINECRAFT_WILD_BEETROOTS_CONFIG)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(BEETROOTS_FREQUENCY_MINECRAFT);
}