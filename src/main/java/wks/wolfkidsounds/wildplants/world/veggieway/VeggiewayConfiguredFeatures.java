package wks.wolfkidsounds.wildplants.world.veggieway;

import net.minecraft.data.worldgen.Features;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.blockplacers.SimpleBlockPlacer;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.VeggiewayConfig;

public class VeggiewayConfiguredFeatures {
    public static Integer FREQUENCY_GLOBAL = WildplantsConfig.GLOBAL_FREQUENCY.get();
    public static Integer PATCH_SIZE_GLOBAL = WildplantsConfig.GLOBAL_PATCH_SIZE.get();
    public static Integer SPREAD_SIZE = WildplantsConfig.GLOBAL_SPREAD_SIZE.get();

    public static Integer CORN_FREQUENCY_VEGGIEWAY = VeggiewayConfig.CORN_FREQUENCY_VEGGIEWAY.get() * FREQUENCY_GLOBAL;
    public static Integer CORN_PATCH_SIZE_VEGGIEWAY = VeggiewayConfig.CORN_PATCH_SIZE_VEGGIEWAY.get() * PATCH_SIZE_GLOBAL;

    public static Integer LENTIL_FREQUENCY_VEGGIEWAY = VeggiewayConfig.LENTIL_FREQUENCY_VEGGIEWAY.get() * FREQUENCY_GLOBAL;
    public static Integer LENTIL_PATCH_SIZE_VEGGIEWAY = VeggiewayConfig.LENTIL_PATCH_SIZE_VEGGIEWAY.get() * PATCH_SIZE_GLOBAL;

    public static Integer QUINOA_FREQUENCY_VEGGIEWAY = VeggiewayConfig.QUINOA_FREQUENCY_VEGGIEWAY.get() * FREQUENCY_GLOBAL;
    public static Integer QUINOA_PATCH_SIZE_VEGGIEWAY = VeggiewayConfig.QUINOA_PATCH_SIZE_VEGGIEWAY.get() * PATCH_SIZE_GLOBAL;

    public static Integer SOYBEAN_FREQUENCY_VEGGIEWAY = VeggiewayConfig.SOYBEAN_FREQUENCY_VEGGIEWAY.get() * FREQUENCY_GLOBAL;
    public static Integer SOYBEAN_PATCH_SIZE_VEGGIEWAY = VeggiewayConfig.SOYBEAN_PATCH_SIZE_VEGGIEWAY.get() * PATCH_SIZE_GLOBAL;
    
    //----------------------------------------------------------------------

    public static final ConfiguredFeature<?, ?> VEGGIEWAY_WILD_CORN_CONFIG = Feature.FLOWER.configured((
                    new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.VEGGIEWAY_WILD_CORN.get().defaultBlockState()),
                            SimpleBlockPlacer.INSTANCE)).tries(CORN_PATCH_SIZE_VEGGIEWAY).zspread(SPREAD_SIZE).xspread(SPREAD_SIZE).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(CORN_FREQUENCY_VEGGIEWAY);

    public static final ConfiguredFeature<?, ?> VEGGIEWAY_WILD_LENTIL_CONFIG = Feature.FLOWER.configured((
                    new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.VEGGIEWAY_WILD_LENTIL.get().defaultBlockState()),
                            SimpleBlockPlacer.INSTANCE)).tries(LENTIL_PATCH_SIZE_VEGGIEWAY).zspread(SPREAD_SIZE).xspread(SPREAD_SIZE).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(LENTIL_FREQUENCY_VEGGIEWAY);

    public static final ConfiguredFeature<?, ?> VEGGIEWAY_WILD_QUINOA_CONFIG = Feature.FLOWER.configured((
                    new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.VEGGIEWAY_WILD_QUINOA.get().defaultBlockState()),
                            SimpleBlockPlacer.INSTANCE)).tries(QUINOA_PATCH_SIZE_VEGGIEWAY).zspread(SPREAD_SIZE).xspread(SPREAD_SIZE).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(QUINOA_FREQUENCY_VEGGIEWAY);

    public static final ConfiguredFeature<?, ?> VEGGIEWAY_WILD_SOYBEAN_CONFIG = Feature.FLOWER.configured((
                    new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.VEGGIEWAY_WILD_SOYBEAN.get().defaultBlockState()),
                            SimpleBlockPlacer.INSTANCE)).tries(SOYBEAN_PATCH_SIZE_VEGGIEWAY).zspread(SPREAD_SIZE).xspread(SPREAD_SIZE).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(SOYBEAN_FREQUENCY_VEGGIEWAY);
}
