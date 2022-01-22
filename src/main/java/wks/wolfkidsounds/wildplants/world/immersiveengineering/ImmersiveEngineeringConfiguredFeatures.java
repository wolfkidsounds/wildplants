package wks.wolfkidsounds.wildplants.world.immersiveengineering;

import net.minecraft.data.worldgen.Features;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.blockplacers.SimpleBlockPlacer;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.ImmersiveEngineeringConfig;

public class ImmersiveEngineeringConfiguredFeatures {

    public static Integer FREQUENCY_GLOBAL = WildplantsConfig.GLOBAL_FREQUENCY.get();
    public static Integer PATCH_SIZE_GLOBAL = WildplantsConfig.GLOBAL_PATCH_SIZE.get();

    public static Integer HEMP_FREQUENCY_IMMERSIVEENINEERING = ImmersiveEngineeringConfig.HEMP_FREQUENCY_IMMERSIVEENINEERING.get() * FREQUENCY_GLOBAL;
    public static Integer HEMP_PATCH_SIZE_IMMERSIVEENINEERING = ImmersiveEngineeringConfig.HEMP_PATCH_SIZE_IMMERSIVEENINEERING.get() * PATCH_SIZE_GLOBAL;


    public static final ConfiguredFeature<?, ?> IMMERSIVEENGINEERING_WILD_HEMP_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.IMMERSIVEENGINEERING_WILD_HEMP.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(HEMP_PATCH_SIZE_IMMERSIVEENINEERING).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(HEMP_FREQUENCY_IMMERSIVEENINEERING);
}
