package wks.wolfkidsounds.wildplants.world.minecraft;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.MinecraftConfig;

import java.util.List;

public class MinecraftConfiguredFeatures {

    public static Integer PATCH_SIZE_GLOBAL = WildplantsConfig.GLOBAL_PATCH_SIZE.get();
    public static Integer SPREAD_SIZE = WildplantsConfig.GLOBAL_SPREAD_SIZE.get();
    public static Integer WHEAT_PATCH_SIZE_MINECRAFT = MinecraftConfig.WHEAT_PATCH_SIZE_MINECRAFT.get() * PATCH_SIZE_GLOBAL;
    public static Integer CARROTS_PATCH_SIZE_MINECRAFT = MinecraftConfig.CARROTS_PATCH_SIZE_MINECRAFT.get() * PATCH_SIZE_GLOBAL;
    public static Integer POTATOES_PATCH_SIZE_MINECRAFT = MinecraftConfig.POTATOES_PATCH_SIZE_MINECRAFT.get() * PATCH_SIZE_GLOBAL;
    public static Integer BEETROOTS_PATCH_SIZE_MINECRAFT = MinecraftConfig.BEETROOTS_PATCH_SIZE_MINECRAFT.get() * PATCH_SIZE_GLOBAL;

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> MINECRAFT_WILD_WHEAT_CONFIG = 
        FeatureUtils.register("minecraft_wild_wheat_config", Feature.FLOWER,
                new RandomPatchConfiguration(WHEAT_PATCH_SIZE_MINECRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.MINECRAFT_WILD_WHEAT.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> MINECRAFT_WILD_CARROTS_CONFIG = 
        FeatureUtils.register("minecraft_wild_carrots_config", Feature.FLOWER,
                new RandomPatchConfiguration(CARROTS_PATCH_SIZE_MINECRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.MINECRAFT_WILD_CARROTS.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> MINECRAFT_WILD_POTATOES_CONFIG = 
        FeatureUtils.register("minecraft_wild_potatoes_config", Feature.FLOWER,
                new RandomPatchConfiguration(POTATOES_PATCH_SIZE_MINECRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.MINECRAFT_WILD_POTATOES.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> MINECRAFT_WILD_BEETROOTS_CONFIG = 
        FeatureUtils.register("minecraft_wild_beetroots_config", Feature.FLOWER,
                new RandomPatchConfiguration(BEETROOTS_PATCH_SIZE_MINECRAFT,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.MINECRAFT_WILD_BEETROOTS.get())))));
}
