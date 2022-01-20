package wks.wolfkidsounds.wildplants.world.immersiveengineering;

import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import wks.wolfkidsounds.wildplants.block.ImmersiveEngineeringModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.ImmersiveEngineeringConfig;

public class ImmersiveEngineeringConfiguredFeatures {

    public static Integer FREQUENCY_GLOBAL = WildplantsConfig.GLOBAL_FREQUENCY.get();
    public static Integer PATCH_SIZE_GLOBAL = WildplantsConfig.GLOBAL_PATCH_SIZE.get();

    public static Integer HEMP_FREQUENCY = ImmersiveEngineeringConfig.HEMP_FREQUENCY.get() * FREQUENCY_GLOBAL;
    public static Integer HEMP_PATCH_SIZE = ImmersiveEngineeringConfig.HEMP_PATCH_SIZE.get() * PATCH_SIZE_GLOBAL;


    public static final ConfiguredFeature<?, ?> WILD_HEMP_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ImmersiveEngineeringModBlocks.WILD_HEMP.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(HEMP_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(HEMP_FREQUENCY);
}
