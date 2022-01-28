package wks.wolfkidsounds.wildplants.world.immersiveengineering;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.ImmersiveEngineeringConfig;

public class ImmersiveEngineeringPlacedFeatures {

    public static Integer FREQUENCY_GLOBAL = WildplantsConfig.GLOBAL_FREQUENCY.get();
    public static Integer HEMP_FREQUENCY_IMMERSIVEENINEERING = ImmersiveEngineeringConfig.HEMP_FREQUENCY_IMMERSIVEENINEERING.get() * FREQUENCY_GLOBAL;

    public static final PlacedFeature IMMERSIVEENGINEERING_WILD_HEMP_PLACED = PlacementUtils.register("immersiveengineering_wild_hemp_placed",
            ImmersiveEngineeringConfiguredFeatures.IMMERSIVEENGINEERING_WILD_HEMP_CONFIG.placed(RarityFilter.onAverageOnceEvery(HEMP_FREQUENCY_IMMERSIVEENINEERING),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
}
