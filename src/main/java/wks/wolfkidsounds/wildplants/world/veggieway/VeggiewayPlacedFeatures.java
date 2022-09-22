package wks.wolfkidsounds.wildplants.world.veggieway;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.*;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.VeggiewayConfig;

public class VeggiewayPlacedFeatures {

    public static Integer FREQUENCY_GLOBAL = WildplantsConfig.GLOBAL_FREQUENCY.get();
    public static Integer CORN_FREQUENCY_VEGGIEWAY = VeggiewayConfig.CORN_FREQUENCY_VEGGIEWAY.get() * FREQUENCY_GLOBAL;
    public static Integer LENTIL_FREQUENCY_VEGGIEWAY = VeggiewayConfig.LENTIL_FREQUENCY_VEGGIEWAY.get() * FREQUENCY_GLOBAL;
    public static Integer QUINOA_FREQUENCY_VEGGIEWAY = VeggiewayConfig.QUINOA_FREQUENCY_VEGGIEWAY.get() * FREQUENCY_GLOBAL;
    public static Integer SOYBEAN_FREQUENCY_VEGGIEWAY = VeggiewayConfig.SOYBEAN_FREQUENCY_VEGGIEWAY.get() * FREQUENCY_GLOBAL;
    public static Integer COTTON_FREQUENCY_VEGGIEWAY = VeggiewayConfig.COTTON_FREQUENCY_VEGGIEWAY.get() * FREQUENCY_GLOBAL;

    //----------------------------------------------------------------------

    public static final Holder<PlacedFeature> VEGGIEWAY_WILD_CORN_PLACED = PlacementUtils.register("veggieway_wild_corn_placed",
            VeggiewayConfiguredFeatures.VEGGIEWAY_WILD_CORN_CONFIG, RarityFilter.onAverageOnceEvery(CORN_FREQUENCY_VEGGIEWAY),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> VEGGIEWAY_WILD_LENTIL_PLACED = PlacementUtils.register("veggieway_wild_lentil_placed",
            VeggiewayConfiguredFeatures.VEGGIEWAY_WILD_LENTIL_CONFIG, RarityFilter.onAverageOnceEvery(LENTIL_FREQUENCY_VEGGIEWAY),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> VEGGIEWAY_WILD_QUINOA_PLACED = PlacementUtils.register("veggieway_wild_quinoa_placed",
            VeggiewayConfiguredFeatures.VEGGIEWAY_WILD_QUINOA_CONFIG, RarityFilter.onAverageOnceEvery(QUINOA_FREQUENCY_VEGGIEWAY),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> VEGGIEWAY_WILD_SOYBEAN_PLACED = PlacementUtils.register("veggieway_wild_soybean_placed",
            VeggiewayConfiguredFeatures.VEGGIEWAY_WILD_SOYBEAN_CONFIG, RarityFilter.onAverageOnceEvery(SOYBEAN_FREQUENCY_VEGGIEWAY),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> VEGGIEWAY_WILD_COTTON_PLACED = PlacementUtils.register("veggieway_wild_cotton_placed",
            VeggiewayConfiguredFeatures.VEGGIEWAY_WILD_COTTON_CONFIG, RarityFilter.onAverageOnceEvery(COTTON_FREQUENCY_VEGGIEWAY),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

}
