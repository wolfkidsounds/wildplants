package wks.wolfkidsounds.wildplants.world.minecraft;

import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import wks.wolfkidsounds.wildplants.block.MinecraftModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.MinecraftConfig;

public class MinecraftConfiguredFeatures {

    public static Integer FREQUENCY_GLOBAL = WildplantsConfig.GLOBAL_FREQUENCY.get();
    public static Integer PATCH_SIZE_GLOBAL = WildplantsConfig.GLOBAL_PATCH_SIZE.get();

    public static Integer WHEAT_FREQUENCY = MinecraftConfig.WHEAT_FREQUENCY.get() * FREQUENCY_GLOBAL;
    public static Integer WHEAT_PATCH_SIZE = MinecraftConfig.WHEAT_PATCH_SIZE.get() * PATCH_SIZE_GLOBAL;

    public static Integer CARROTS_FREQUENCY = MinecraftConfig.CARROTS_FREQUENCY.get() * FREQUENCY_GLOBAL;
    public static Integer CARROTS_PATCH_SIZE = MinecraftConfig.CARROTS_PATCH_SIZE.get() * PATCH_SIZE_GLOBAL;

    public static Integer POTATOES_FREQUENCY = MinecraftConfig.POTATOES_FREQUENCY.get() * FREQUENCY_GLOBAL;
    public static Integer POTATOES_PATCH_SIZE = MinecraftConfig.POTATOES_PATCH_SIZE.get() * PATCH_SIZE_GLOBAL;

    public static Integer BEETROOTS_FREQUENCY = MinecraftConfig.BEETROOTS_FREQUENCY.get() * FREQUENCY_GLOBAL;
    public static Integer BEETROOTS_PATCH_SIZE = MinecraftConfig.BEETROOTS_PATCH_SIZE.get() * PATCH_SIZE_GLOBAL;


    public static final ConfiguredFeature<?, ?> WILD_WHEAT_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(MinecraftModBlocks.WILD_WHEAT.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(WHEAT_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(WHEAT_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_CARROTS_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(MinecraftModBlocks.WILD_CARROTS.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CARROTS_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CARROTS_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_POTATOES_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(MinecraftModBlocks.WILD_POTATOES.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(POTATOES_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(POTATOES_FREQUENCY);

    public static final ConfiguredFeature<?, ?> WILD_BEETROOTS_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(MinecraftModBlocks.WILD_BEETROOTS.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(BEETROOTS_PATCH_SIZE).zSpread(3).xSpread(3).build())
            .withPlacement(Features.Placements.PATCH_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(BEETROOTS_FREQUENCY);
}