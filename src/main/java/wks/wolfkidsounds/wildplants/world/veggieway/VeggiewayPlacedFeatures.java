package wks.wolfkidsounds.wildplants.world.veggieway;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.VeggiewayConfig;

public class VeggiewayPlacedFeatures {

    public static Integer FREQUENCY_GLOBAL = WildplantsConfig.GLOBAL_FREQUENCY.get();
    public static Integer CORN_FREQUENCY_VEGGIEWAY = VeggiewayConfig.CORN_FREQUENCY_VEGGIEWAY.get() * FREQUENCY_GLOBAL;
    public static Integer LENTIL_FREQUENCY_VEGGIEWAY = VeggiewayConfig.LENTIL_FREQUENCY_VEGGIEWAY.get() * FREQUENCY_GLOBAL;
    public static Integer QUINOA_FREQUENCY_VEGGIEWAY = VeggiewayConfig.QUINOA_FREQUENCY_VEGGIEWAY.get() * FREQUENCY_GLOBAL;
    public static Integer SOYBEAN_FREQUENCY_VEGGIEWAY = VeggiewayConfig.SOYBEAN_FREQUENCY_VEGGIEWAY.get() * FREQUENCY_GLOBAL;

    //----------------------------------------------------------------------

    public static final PlacedFeature VEGGIEWAY_WILD_CORN_PLACED = PlacementUtils.register("veggieway_wild_corn_placed",
            VeggiewayConfiguredFeatures.VEGGIEWAY_WILD_CORN_CONFIG.placed(CountPlacement.of(CORN_FREQUENCY_VEGGIEWAY),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature VEGGIEWAY_WILD_LENTIL_PLACED = PlacementUtils.register("veggieway_wild_lentil_placed",
            VeggiewayConfiguredFeatures.VEGGIEWAY_WILD_LENTIL_CONFIG.placed(CountPlacement.of(LENTIL_FREQUENCY_VEGGIEWAY),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature VEGGIEWAY_WILD_QUINOA_PLACED = PlacementUtils.register("veggieway_wild_quinoa_placed",
            VeggiewayConfiguredFeatures.VEGGIEWAY_WILD_QUINOA_CONFIG.placed(CountPlacement.of(QUINOA_FREQUENCY_VEGGIEWAY),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature VEGGIEWAY_WILD_SOYBEAN_PLACED = PlacementUtils.register("veggieway_wild_soybean_placed",
            VeggiewayConfiguredFeatures.VEGGIEWAY_WILD_SOYBEAN_CONFIG.placed(CountPlacement.of(SOYBEAN_FREQUENCY_VEGGIEWAY),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

}
