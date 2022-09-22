package wks.wolfkidsounds.wildplants.world.immersiveengineering;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.ImmersiveEngineeringConfig;

public class ImmersiveEngineeringConfiguredFeatures {

    public static Integer PATCH_SIZE_GLOBAL = WildplantsConfig.GLOBAL_PATCH_SIZE.get();
    public static Integer SPREAD_SIZE = WildplantsConfig.GLOBAL_SPREAD_SIZE.get();
    public static Integer HEMP_PATCH_SIZE_IMMERSIVEENINEERING = ImmersiveEngineeringConfig.HEMP_PATCH_SIZE_IMMERSIVEENINEERING.get() * PATCH_SIZE_GLOBAL;

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> IMMERSIVEENGINEERING_WILD_HEMP_CONFIG =
        FeatureUtils.register("immersiveengineering_wild_hemp_config", Feature.FLOWER,
                new RandomPatchConfiguration(HEMP_PATCH_SIZE_IMMERSIVEENINEERING,SPREAD_SIZE,SPREAD_SIZE, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.IMMERSIVEENGINEERING_WILD_HEMP.get())))));
}
