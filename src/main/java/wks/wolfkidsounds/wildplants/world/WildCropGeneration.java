package wks.wolfkidsounds.wildplants.world;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.common.Tags;
import wks.wolfkidsounds.wildplants.config.Configuration;
import wks.wolfkidsounds.wildplants.Wildplants;
import wks.wolfkidsounds.wildplants.config.features.MinecraftConfig;
import wks.wolfkidsounds.wildplants.registry.ModBiomeFeatures;
import wks.wolfkidsounds.wildplants.registry.ModBlocks;
import wks.wolfkidsounds.wildplants.world.settings.BiomeTagFilter;
import wks.wolfkidsounds.wildplants.world.settings.WildCropConfig;

import java.util.List;

public class WildCropGeneration {
    public static final BlockPos BLOCK_BELOW = new BlockPos(0, -1, 0);
    public static final BiomeTagFilter TAGGED_IS_OVERWORLD = BiomeTagFilter.biomeIsInTag(Tags.Biomes.IS_OVERWORLD);
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_MINECRAFT_WHEAT;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_MINECRAFT_CARROTS;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_MINECRAFT_POTATOES;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_MINECRAFT_BEETROOTS;
    public static Holder<PlacedFeature> PATCH_WILD_MINECRAFT_WHEAT;
    public static Holder<PlacedFeature> PATCH_WILD_MINECRAFT_CARROTS;
    public static Holder<PlacedFeature> PATCH_WILD_MINECRAFT_POTATOES;
    public static Holder<PlacedFeature> PATCH_WILD_MINECRAFT_BEETROOTS;

    public static int TRIES = Configuration.GLOBAL_FREQUENCY.get();
    public static int SPREAD = Configuration.GLOBAL_SPREAD_SIZE.get();

    public static void registerWildMinecraftCropGeneration() {
        FEATURE_PATCH_WILD_MINECRAFT_WHEAT = register(new ResourceLocation(Wildplants.MOD_ID, "patch_minecraft_wild_wheat"),
                ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.MINECRAFT_WILD_WHEAT.get(), BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));

        FEATURE_PATCH_WILD_MINECRAFT_CARROTS = register(new ResourceLocation(Wildplants.MOD_ID, "patch_minecraft_wild_carrots"),
                ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.MINECRAFT_WILD_CARROTS.get(), BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));

        FEATURE_PATCH_WILD_MINECRAFT_POTATOES = register(new ResourceLocation(Wildplants.MOD_ID, "patch_minecraft_wild_potatoes"),
                ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.MINECRAFT_WILD_POTATOES.get(), BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));

        FEATURE_PATCH_WILD_MINECRAFT_BEETROOTS = register(new ResourceLocation(Wildplants.MOD_ID, "patch_minecraft_wild_beetroots"),
                ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.MINECRAFT_WILD_BEETROOTS.get(), BlockPredicate.matchesBlocks(List.of(Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.COARSE_DIRT, Blocks.RED_SAND, Blocks.SAND), BLOCK_BELOW)));


        PATCH_WILD_MINECRAFT_WHEAT = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_minecraft_wild_wheat"),
                FEATURE_PATCH_WILD_MINECRAFT_WHEAT, RarityFilter.onAverageOnceEvery(MinecraftConfig.CHANCE_MINECRAFT_WILD_WHEAT.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);

        PATCH_WILD_MINECRAFT_CARROTS = registerPlacement(new ResourceLocation("patch_wild_onions"),
                FEATURE_PATCH_WILD_MINECRAFT_CARROTS, RarityFilter.onAverageOnceEvery(MinecraftConfig.CHANCE_MINECRAFT_WILD_CARROTS.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);

        PATCH_WILD_MINECRAFT_POTATOES = registerPlacement(new ResourceLocation("patch_wild_tomatoes"),
                FEATURE_PATCH_WILD_MINECRAFT_POTATOES, RarityFilter.onAverageOnceEvery(MinecraftConfig.CHANCE_MINECRAFT_WILD_POTATOES.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);

        PATCH_WILD_MINECRAFT_BEETROOTS = registerPlacement(new ResourceLocation("patch_wild_carrots"),
                FEATURE_PATCH_WILD_MINECRAFT_BEETROOTS, RarityFilter.onAverageOnceEvery(MinecraftConfig.CHANCE_MINECRAFT_WILD_BEETROOTS.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);

    }

    public static WildCropConfig wildCropConfig(Block primaryBlock, BlockPredicate plantedOn) {
        return new WildCropConfig(TRIES, SPREAD+1, SPREAD-1, plantBlockConfig(primaryBlock, plantedOn), null);
    }

    public static Holder<PlacedFeature> plantBlockConfig(Block block, BlockPredicate plantedOn) {
        return PlacementUtils.filtered(
                Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(block)),
                BlockPredicate.allOf(BlockPredicate.ONLY_IN_AIR_PREDICATE, plantedOn));
    }

    // Registry stuff

    static Holder<PlacedFeature> registerPlacement(ResourceLocation id, Holder<? extends ConfiguredFeature<?, ?>> feature, PlacementModifier... modifiers) {
        return BuiltinRegistries.register(BuiltinRegistries.PLACED_FEATURE, id, new PlacedFeature(Holder.hackyErase(feature), List.of(modifiers)));
    }

    protected static <FC extends FeatureConfiguration, F extends Feature<FC>> Holder<ConfiguredFeature<FC, ?>> register(ResourceLocation id, F feature, FC featureConfig) {
        return register(BuiltinRegistries.CONFIGURED_FEATURE, id, new ConfiguredFeature<>(feature, featureConfig));
    }

    private static <V extends T, T> Holder<V> register(Registry<T> registry, ResourceLocation id, V value) {
        return (Holder<V>) BuiltinRegistries.register(registry, id, value);
    }
}
