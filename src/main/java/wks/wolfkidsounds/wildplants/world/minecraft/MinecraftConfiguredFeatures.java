package wks.wolfkidsounds.wildplants.world.minecraft;

import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.MinecraftConfig;

public class MinecraftConfiguredFeatures {

    public static Integer FREQUENCY_GLOBAL = WildplantsConfig.GLOBAL_FREQUENCY.get();
    public static Integer PATCH_SIZE_GLOBAL = WildplantsConfig.GLOBAL_PATCH_SIZE.get();

    public static Integer WHEAT_FREQUENCY_MINECRAFT = MinecraftConfig.WHEAT_FREQUENCY_MINECRAFT.get() * FREQUENCY_GLOBAL;
    public static Integer WHEAT_PATCH_SIZE_MINECRAFT = MinecraftConfig.WHEAT_PATCH_SIZE_MINECRAFT.get() * PATCH_SIZE_GLOBAL;

    public static Integer CARROTS_FREQUENCY_MINECRAFT = MinecraftConfig.CARROTS_FREQUENCY_MINECRAFT.get() * FREQUENCY_GLOBAL;
    public static Integer CARROTS_PATCH_SIZE_MINECRAFT = MinecraftConfig.CARROTS_PATCH_SIZE_MINECRAFT.get() * PATCH_SIZE_GLOBAL;

    public static Integer POTATOES_FREQUENCY_MINECRAFT = MinecraftConfig.POTATOES_FREQUENCY_MINECRAFT.get() * FREQUENCY_GLOBAL;
    public static Integer POTATOES_PATCH_SIZE_MINECRAFT = MinecraftConfig.POTATOES_PATCH_SIZE_MINECRAFT.get() * PATCH_SIZE_GLOBAL;

    public static Integer BEETROOTS_FREQUENCY_MINECRAFT = MinecraftConfig.BEETROOTS_FREQUENCY_MINECRAFT.get() * FREQUENCY_GLOBAL;
    public static Integer BEETROOTS_PATCH_SIZE_MINECRAFT = MinecraftConfig.BEETROOTS_PATCH_SIZE_MINECRAFT.get() * PATCH_SIZE_GLOBAL;


    public static final ConfiguredFeature<?, ?> MINECRAFT_WILD_WHEAT_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.MINECRAFT_WILD_WHEAT.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(WHEAT_PATCH_SIZE_MINECRAFT).zSpread(2).xSpread(2).build())
            
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(WHEAT_FREQUENCY_MINECRAFT);

    public static final ConfiguredFeature<?, ?> MINECRAFT_WILD_CARROTS_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.MINECRAFT_WILD_CARROTS.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CARROTS_PATCH_SIZE_MINECRAFT).zSpread(2).xSpread(2).build())
            
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CARROTS_FREQUENCY_MINECRAFT);

    public static final ConfiguredFeature<?, ?> MINECRAFT_WILD_POTATOES_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.MINECRAFT_WILD_POTATOES.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(POTATOES_PATCH_SIZE_MINECRAFT).zSpread(2).xSpread(2).build())
            
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(POTATOES_FREQUENCY_MINECRAFT);

    public static final ConfiguredFeature<?, ?> MINECRAFT_WILD_BEETROOTS_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.MINECRAFT_WILD_BEETROOTS.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(BEETROOTS_PATCH_SIZE_MINECRAFT).zSpread(2).xSpread(2).build())
            
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(BEETROOTS_FREQUENCY_MINECRAFT);
}