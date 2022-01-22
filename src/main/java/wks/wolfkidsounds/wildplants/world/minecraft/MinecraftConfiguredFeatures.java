package wks.wolfkidsounds.wildplants.world.minecraft;

import net.minecraft.data.worldgen.Features;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.blockplacers.SimpleBlockPlacer;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
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


    public static final ConfiguredFeature<?, ?> MINECRAFT_WILD_WHEAT_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.MINECRAFT_WILD_WHEAT.get().defaultBlockState()),
                    SimpleBlockPlacer.INSTANCE)).tries(WHEAT_PATCH_SIZE_MINECRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE)
            .decorated(Features.Decorators.ADD_32).count(WHEAT_FREQUENCY_MINECRAFT);

    public static final ConfiguredFeature<?, ?> MINECRAFT_WILD_CARROTS_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.MINECRAFT_WILD_CARROTS.get().defaultBlockState()),
                    SimpleBlockPlacer.INSTANCE)).tries(CARROTS_PATCH_SIZE_MINECRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(CARROTS_FREQUENCY_MINECRAFT);

    public static final ConfiguredFeature<?, ?> MINECRAFT_WILD_POTATOES_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.MINECRAFT_WILD_POTATOES.get().defaultBlockState()),
                    SimpleBlockPlacer.INSTANCE)).tries(POTATOES_PATCH_SIZE_MINECRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(POTATOES_FREQUENCY_MINECRAFT);

    public static final ConfiguredFeature<?, ?> MINECRAFT_WILD_BEETROOTS_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.MINECRAFT_WILD_BEETROOTS.get().defaultBlockState()),
                    SimpleBlockPlacer.INSTANCE)).tries(BEETROOTS_PATCH_SIZE_MINECRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(BEETROOTS_FREQUENCY_MINECRAFT);
}