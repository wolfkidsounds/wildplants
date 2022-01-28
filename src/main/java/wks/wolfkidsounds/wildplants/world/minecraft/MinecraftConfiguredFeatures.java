package wks.wolfkidsounds.wildplants.world.minecraft;

import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.MinecraftConfig;

public class MinecraftConfiguredFeatures {

    public static Integer PATCH_SIZE_GLOBAL = WildplantsConfig.GLOBAL_PATCH_SIZE.get();
    public static Integer WHEAT_PATCH_SIZE_MINECRAFT = MinecraftConfig.WHEAT_PATCH_SIZE_MINECRAFT.get() * PATCH_SIZE_GLOBAL;
    public static Integer CARROTS_PATCH_SIZE_MINECRAFT = MinecraftConfig.CARROTS_PATCH_SIZE_MINECRAFT.get() * PATCH_SIZE_GLOBAL;
    public static Integer POTATOES_PATCH_SIZE_MINECRAFT = MinecraftConfig.POTATOES_PATCH_SIZE_MINECRAFT.get() * PATCH_SIZE_GLOBAL;
    public static Integer BEETROOTS_PATCH_SIZE_MINECRAFT = MinecraftConfig.BEETROOTS_PATCH_SIZE_MINECRAFT.get() * PATCH_SIZE_GLOBAL;

    public static final ConfiguredFeature<?, ?> MINECRAFT_WILD_WHEAT_CONFIG = FeatureUtils.register("minecraft_wild_wheat_config",
            Feature.FLOWER.configured(
                    new RandomPatchConfiguration(WHEAT_PATCH_SIZE_MINECRAFT,2,2,
                            () -> Feature.SIMPLE_BLOCK.configured(
                                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.MINECRAFT_WILD_WHEAT.get()))).onlyWhenEmpty())));

    public static final ConfiguredFeature<?, ?> MINECRAFT_WILD_CARROTS_CONFIG = FeatureUtils.register("minecraft_wild_carrots_config",
            Feature.FLOWER.configured(
                    new RandomPatchConfiguration(CARROTS_PATCH_SIZE_MINECRAFT,2,2,
                            () -> Feature.SIMPLE_BLOCK.configured(
                                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.MINECRAFT_WILD_CARROTS.get()))).onlyWhenEmpty())));

    public static final ConfiguredFeature<?, ?> MINECRAFT_WILD_POTATOES_CONFIG = FeatureUtils.register("minecraft_wild_potatoes_config",
            Feature.FLOWER.configured(
                    new RandomPatchConfiguration(POTATOES_PATCH_SIZE_MINECRAFT,2,2,
                            () -> Feature.SIMPLE_BLOCK.configured(
                                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.MINECRAFT_WILD_POTATOES.get()))).onlyWhenEmpty())));

    public static final ConfiguredFeature<?, ?> MINECRAFT_WILD_BEETROOTS_CONFIG = FeatureUtils.register("minecraft_wild_beetroots_config",
            Feature.FLOWER.configured(
                    new RandomPatchConfiguration(BEETROOTS_PATCH_SIZE_MINECRAFT,2,2,
                            () -> Feature.SIMPLE_BLOCK.configured(
                                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.MINECRAFT_WILD_BEETROOTS.get()))).onlyWhenEmpty())));
}