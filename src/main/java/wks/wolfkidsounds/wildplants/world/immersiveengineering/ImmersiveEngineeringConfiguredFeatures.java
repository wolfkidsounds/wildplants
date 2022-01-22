package wks.wolfkidsounds.wildplants.world.immersiveengineering;

import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.ImmersiveEngineeringConfig;

public class ImmersiveEngineeringConfiguredFeatures {

    public static Integer FREQUENCY_GLOBAL = WildplantsConfig.GLOBAL_FREQUENCY.get();
    public static Integer PATCH_SIZE_GLOBAL = WildplantsConfig.GLOBAL_PATCH_SIZE.get();

    public static Integer HEMP_FREQUENCY_IMMERSIVEENINEERING = ImmersiveEngineeringConfig.HEMP_FREQUENCY_IMMERSIVEENINEERING.get() * FREQUENCY_GLOBAL;
    public static Integer HEMP_PATCH_SIZE_IMMERSIVEENINEERING = ImmersiveEngineeringConfig.HEMP_PATCH_SIZE_IMMERSIVEENINEERING.get() * PATCH_SIZE_GLOBAL;


    public static final ConfiguredFeature<?, ?> IMMERSIVEENGINEERING_WILD_HEMP_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.IMMERSIVEENGINEERING_WILD_HEMP.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(HEMP_PATCH_SIZE_IMMERSIVEENINEERING).zSpread(2).xSpread(2).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(HEMP_FREQUENCY_IMMERSIVEENINEERING);
}
