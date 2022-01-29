package wks.wolfkidsounds.wildplants.world.veggieway;

import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.VeggiewayConfig;

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
    
    //----------------------------------------------------------------------

    public static final ConfiguredFeature<?, ?> VEGGIEWAY_WILD_CORN_CONFIG = Feature.FLOWER.withConfiguration((
                    new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.VEGGIEWAY_WILD_CORN.get().getDefaultState()),
                            SimpleBlockPlacer.PLACER)).tries(CORN_PATCH_SIZE_VEGGIEWAY).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CORN_FREQUENCY_VEGGIEWAY);

    public static final ConfiguredFeature<?, ?> VEGGIEWAY_WILD_LENTIL_CONFIG = Feature.FLOWER.withConfiguration((
                    new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.VEGGIEWAY_WILD_LENTIL.get().getDefaultState()),
                            SimpleBlockPlacer.PLACER)).tries(LENTIL_PATCH_SIZE_VEGGIEWAY).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(LENTIL_FREQUENCY_VEGGIEWAY);

    public static final ConfiguredFeature<?, ?> VEGGIEWAY_WILD_QUINOA_CONFIG = Feature.FLOWER.withConfiguration((
                    new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.VEGGIEWAY_WILD_QUINOA.get().getDefaultState()),
                            SimpleBlockPlacer.PLACER)).tries(QUINOA_PATCH_SIZE_VEGGIEWAY).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(QUINOA_FREQUENCY_VEGGIEWAY);

    public static final ConfiguredFeature<?, ?> VEGGIEWAY_WILD_SOYBEAN_CONFIG = Feature.FLOWER.withConfiguration((
                    new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.VEGGIEWAY_WILD_SOYBEAN.get().getDefaultState()),
                            SimpleBlockPlacer.PLACER)).tries(SOYBEAN_PATCH_SIZE_VEGGIEWAY).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(SOYBEAN_FREQUENCY_VEGGIEWAY);
}
