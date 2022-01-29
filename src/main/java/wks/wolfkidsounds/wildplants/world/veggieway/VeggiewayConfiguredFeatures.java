package wks.wolfkidsounds.wildplants.world.veggieway;

import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.VeggiewayConfig;

public class VeggiewayConfiguredFeatures {
    public static Integer PATCH_SIZE_GLOBAL = WildplantsConfig.GLOBAL_PATCH_SIZE.get();
    public static Integer SPREAD_SIZE = WildplantsConfig.GLOBAL_SPREAD_SIZE.get();
    public static Integer CORN_PATCH_SIZE_VEGGIEWAY = VeggiewayConfig.CORN_PATCH_SIZE_VEGGIEWAY.get() * PATCH_SIZE_GLOBAL;
    public static Integer LENTIL_PATCH_SIZE_VEGGIEWAY = VeggiewayConfig.LENTIL_PATCH_SIZE_VEGGIEWAY.get() * PATCH_SIZE_GLOBAL;
    public static Integer QUINOA_PATCH_SIZE_VEGGIEWAY = VeggiewayConfig.QUINOA_PATCH_SIZE_VEGGIEWAY.get() * PATCH_SIZE_GLOBAL;
    public static Integer SOYBEAN_PATCH_SIZE_VEGGIEWAY = VeggiewayConfig.SOYBEAN_PATCH_SIZE_VEGGIEWAY.get() * PATCH_SIZE_GLOBAL;
    
    //----------------------------------------------------------------------

    public static final ConfiguredFeature<?, ?> VEGGIEWAY_WILD_CORN_CONFIG = FeatureUtils.register("veggieway_wild_corn_config",
            Feature.FLOWER.configured(
                    new RandomPatchConfiguration(CORN_PATCH_SIZE_VEGGIEWAY,SPREAD_SIZE,SPREAD_SIZE,
                            () -> Feature.SIMPLE_BLOCK.configured(
                                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.VEGGIEWAY_WILD_CORN.get()))).onlyWhenEmpty())));

    public static final ConfiguredFeature<?, ?> VEGGIEWAY_WILD_LENTIL_CONFIG = FeatureUtils.register("veggieway_wild_lentil_config",
            Feature.FLOWER.configured(
                    new RandomPatchConfiguration(LENTIL_PATCH_SIZE_VEGGIEWAY,SPREAD_SIZE,SPREAD_SIZE,
                            () -> Feature.SIMPLE_BLOCK.configured(
                                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.VEGGIEWAY_WILD_LENTIL.get()))).onlyWhenEmpty())));

    public static final ConfiguredFeature<?, ?> VEGGIEWAY_WILD_QUINOA_CONFIG = FeatureUtils.register("veggieway_wild_quinoa_config",
            Feature.FLOWER.configured(
                    new RandomPatchConfiguration(QUINOA_PATCH_SIZE_VEGGIEWAY,SPREAD_SIZE,SPREAD_SIZE,
                            () -> Feature.SIMPLE_BLOCK.configured(
                                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.VEGGIEWAY_WILD_QUINOA.get()))).onlyWhenEmpty())));

    public static final ConfiguredFeature<?, ?> VEGGIEWAY_WILD_SOYBEAN_CONFIG = FeatureUtils.register("veggieway_wild_soybean_config",
            Feature.FLOWER.configured(
                    new RandomPatchConfiguration(SOYBEAN_PATCH_SIZE_VEGGIEWAY,SPREAD_SIZE,SPREAD_SIZE,
                            () -> Feature.SIMPLE_BLOCK.configured(
                                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.VEGGIEWAY_WILD_SOYBEAN.get()))).onlyWhenEmpty())));
}
