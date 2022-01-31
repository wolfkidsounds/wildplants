package wks.wolfkidsounds.wildplants.world.immersiveengineering;

import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.immersiveengineering.ImmersiveEngineeringConfig;

public class ImmersiveEngineeringConfiguredFeatures {

    public static Integer FREQUENCY_GLOBAL = WildplantsConfig.GLOBAL_FREQUENCY.get();
    public static Integer PATCH_SIZE_GLOBAL = WildplantsConfig.GLOBAL_PATCH_SIZE.get();
    public static Integer SPREAD_SIZE = WildplantsConfig.GLOBAL_SPREAD_SIZE.get();

    public static Integer HEMP_FREQUENCY_IMMERSIVEENINEERING = ImmersiveEngineeringConfig.HEMP_FREQUENCY_IMMERSIVEENINEERING.get() * FREQUENCY_GLOBAL;
    public static Integer HEMP_PATCH_SIZE_IMMERSIVEENINEERING = ImmersiveEngineeringConfig.HEMP_PATCH_SIZE_IMMERSIVEENINEERING.get() * PATCH_SIZE_GLOBAL;

    //----------FEATURE---CONFIGS----------------

    public static final BlockClusterFeatureConfig IMMERSIVEENGINEERING_WILD_HEMP_CONFIG = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.IMMERSIVEENGINEERING_WILD_HEMP.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(HEMP_PATCH_SIZE_IMMERSIVEENINEERING).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();

    //----------PLACEMENT---CONFIGS----------------

    public static final ConfiguredFeature<?, ?> IMMERSIVEENGINEERING_WILD_HEMP_PATCH =
            Feature.FLOWER.withConfiguration(IMMERSIVEENGINEERING_WILD_HEMP_CONFIG)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(HEMP_FREQUENCY_IMMERSIVEENINEERING);
}
