package wks.wolfkidsounds.wildplants.world.veggieway;

import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.veggieway.VeggiewayConfig;

public class VeggiewayConfiguredFeatures {
    public static Integer FREQUENCY_GLOBAL = WildplantsConfig.GLOBAL_FREQUENCY.get();
    public static Integer PATCH_SIZE_GLOBAL = WildplantsConfig.GLOBAL_PATCH_SIZE.get();
    public static Integer SPREAD_SIZE = WildplantsConfig.GLOBAL_SPREAD_SIZE.get();

    public static Integer CORN_FREQUENCY_VEGGIEWAY = VeggiewayConfig.CORN_FREQUENCY_VEGGIEWAY.get() * FREQUENCY_GLOBAL;
    public static Integer CORN_PATCH_SIZE_VEGGIEWAY = VeggiewayConfig.CORN_PATCH_SIZE_VEGGIEWAY.get() * PATCH_SIZE_GLOBAL;

    public static Integer LENTIL_FREQUENCY_VEGGIEWAY = VeggiewayConfig.LENTIL_FREQUENCY_VEGGIEWAY.get() * FREQUENCY_GLOBAL;
    public static Integer LENTIL_PATCH_SIZE_VEGGIEWAY = VeggiewayConfig.LENTIL_PATCH_SIZE_VEGGIEWAY.get() * PATCH_SIZE_GLOBAL;

    public static Integer QUINOA_FREQUENCY_VEGGIEWAY = VeggiewayConfig.QUINOA_FREQUENCY_VEGGIEWAY.get() * FREQUENCY_GLOBAL;
    public static Integer QUINOA_PATCH_SIZE_VEGGIEWAY = VeggiewayConfig.QUINOA_PATCH_SIZE_VEGGIEWAY.get() * PATCH_SIZE_GLOBAL;

    public static Integer SOYBEAN_FREQUENCY_VEGGIEWAY = VeggiewayConfig.SOYBEAN_FREQUENCY_VEGGIEWAY.get() * FREQUENCY_GLOBAL;
    public static Integer SOYBEAN_PATCH_SIZE_VEGGIEWAY = VeggiewayConfig.SOYBEAN_PATCH_SIZE_VEGGIEWAY.get() * PATCH_SIZE_GLOBAL;

    //----------FEATURE---CONFIGS----------------

    public static final BlockClusterFeatureConfig VEGGIEWAY_WILD_CORN_CONFIG = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.VEGGIEWAY_WILD_CORN.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(CORN_PATCH_SIZE_VEGGIEWAY).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();

    public static final BlockClusterFeatureConfig VEGGIEWAY_WILD_LENTIL_CONFIG = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.MINECRAFT_WILD_CARROTS.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(LENTIL_PATCH_SIZE_VEGGIEWAY).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();

    public static final BlockClusterFeatureConfig VEGGIEWAY_WILD_QUINOA_CONFIG = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.MINECRAFT_WILD_POTATOES.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(QUINOA_PATCH_SIZE_VEGGIEWAY).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();

    public static final BlockClusterFeatureConfig VEGGIEWAY_WILD_SOYBEAN_CONFIG = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.MINECRAFT_WILD_BEETROOTS.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(SOYBEAN_PATCH_SIZE_VEGGIEWAY).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();

    //----------PLACEMENT---CONFIGS---------------- 

    public static final ConfiguredFeature<?, ?> VEGGIEWAY_WILD_CORN_PATCH =
            Feature.FLOWER.withConfiguration(VEGGIEWAY_WILD_CORN_CONFIG)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CORN_FREQUENCY_VEGGIEWAY);

    public static final ConfiguredFeature<?, ?> VEGGIEWAY_WILD_LENTIL_PATCH =
            Feature.FLOWER.withConfiguration(VEGGIEWAY_WILD_LENTIL_CONFIG)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(LENTIL_FREQUENCY_VEGGIEWAY);

    public static final ConfiguredFeature<?, ?> VEGGIEWAY_WILD_QUINOA_PATCH =
            Feature.FLOWER.withConfiguration(VEGGIEWAY_WILD_QUINOA_CONFIG)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(QUINOA_FREQUENCY_VEGGIEWAY);

    public static final ConfiguredFeature<?, ?> VEGGIEWAY_WILD_SOYBEAN_PATCH =
            Feature.FLOWER.withConfiguration(VEGGIEWAY_WILD_SOYBEAN_CONFIG)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(SOYBEAN_FREQUENCY_VEGGIEWAY);
}
