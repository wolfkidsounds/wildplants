package wks.wolfkidsounds.wildplants.world.minecraft;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.*;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.MinecraftConfig;

public class MinecraftPlacedFeatures {

    public static Integer FREQUENCY_GLOBAL = WildplantsConfig.GLOBAL_FREQUENCY.get();
    public static Integer WHEAT_FREQUENCY_MINECRAFT = MinecraftConfig.WHEAT_FREQUENCY_MINECRAFT.get() * FREQUENCY_GLOBAL;
    public static Integer CARROTS_FREQUENCY_MINECRAFT = MinecraftConfig.CARROTS_FREQUENCY_MINECRAFT.get() * FREQUENCY_GLOBAL;
    public static Integer POTATOES_FREQUENCY_MINECRAFT = MinecraftConfig.POTATOES_FREQUENCY_MINECRAFT.get() * FREQUENCY_GLOBAL;
    public static Integer BEETROOTS_FREQUENCY_MINECRAFT = MinecraftConfig.BEETROOTS_FREQUENCY_MINECRAFT.get() * FREQUENCY_GLOBAL;

    public static final PlacedFeature MINECRAFT_WILD_WHEAT_PLACED = PlacementUtils.register("minecraft_wild_wheat_placed",
            MinecraftConfiguredFeatures.MINECRAFT_WILD_WHEAT_CONFIG.placed(CountPlacement.of(WHEAT_FREQUENCY_MINECRAFT),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature MINECRAFT_WILD_CARROTS_PLACED = PlacementUtils.register("minecraft_wild_carrots_placed",
            MinecraftConfiguredFeatures.MINECRAFT_WILD_CARROTS_CONFIG.placed(CountPlacement.of(CARROTS_FREQUENCY_MINECRAFT),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature MINECRAFT_WILD_POTATOES_PLACED = PlacementUtils.register("minecraft_wild_potatoes_placed",
            MinecraftConfiguredFeatures.MINECRAFT_WILD_POTATOES_CONFIG.placed(CountPlacement.of(POTATOES_FREQUENCY_MINECRAFT),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature MINECRAFT_WILD_BEETROOTS_PLACED = PlacementUtils.register("minecraft_wild_beetroots_placed",
            MinecraftConfiguredFeatures.MINECRAFT_WILD_BEETROOTS_CONFIG.placed(CountPlacement.of(BEETROOTS_FREQUENCY_MINECRAFT),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
}