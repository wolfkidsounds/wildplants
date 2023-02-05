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
import wks.wolfkidsounds.wildplants.Wildplants;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.*;
import wks.wolfkidsounds.wildplants.registry.ModBiomeFeatures;
import wks.wolfkidsounds.wildplants.world.settings.BiomeTagFilter;
import wks.wolfkidsounds.wildplants.world.settings.WildCropConfig;

import java.util.List;

public class WildCropGeneration {
    public static final BlockPos BLOCK_BELOW = new BlockPos(0, -1, 0);
    public static final BiomeTagFilter TAGGED_IS_OVERWORLD = BiomeTagFilter.biomeIsInTag(Tags.Biomes.IS_OVERWORLD);

    //GLOBAL MODIFIER
    public static int TRIES = Configuration.GLOBAL_FREQUENCY.get();
    public static int SPREAD = Configuration.GLOBAL_SPREAD_SIZE.get();

    //MINECRAFT
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_MINECRAFT_WHEAT;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_MINECRAFT_CARROTS;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_MINECRAFT_POTATOES;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_MINECRAFT_BEETROOTS;
    public static Holder<PlacedFeature> PATCH_WILD_MINECRAFT_WHEAT;
    public static Holder<PlacedFeature> PATCH_WILD_MINECRAFT_CARROTS;
    public static Holder<PlacedFeature> PATCH_WILD_MINECRAFT_POTATOES;
    public static Holder<PlacedFeature> PATCH_WILD_MINECRAFT_BEETROOTS;

    //IMMERSIVEENGINEERING
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_IMMERSIVEENGINEERING_HEMP;
    public static Holder<PlacedFeature> PATCH_WILD_IMMERSIVEENGINEERING_HEMP;

    //VEGGIE_WAY
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_VEGGIE_WAY_CORN;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_VEGGIE_WAY_LENTIL;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_VEGGIE_WAY_QUINOA;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_VEGGIE_WAY_SOYBEAN;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_VEGGIE_WAY_COTTON;
    public static Holder<PlacedFeature> PATCH_WILD_VEGGIE_WAY_CORN;
    public static Holder<PlacedFeature> PATCH_WILD_VEGGIE_WAY_LENTIL;
    public static Holder<PlacedFeature> PATCH_WILD_VEGGIE_WAY_QUINOA;
    public static Holder<PlacedFeature> PATCH_WILD_VEGGIE_WAY_SOYBEAN;
    public static Holder<PlacedFeature> PATCH_WILD_VEGGIE_WAY_COTTON;

    //ENHANCEDFARMING
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_ENHANCEDFARMING_MINT;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_ENHANCEDFARMING_TOMATO;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_ENHANCEDFARMING_CUCUMBER;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_ENHANCEDFARMING_AUBERGINE;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_ENHANCEDFARMING_GRAPE;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_ENHANCEDFARMING_PINEAPPLE;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_ENHANCEDFARMING_CORN;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_ENHANCEDFARMING_ONION;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_ENHANCEDFARMING_GARLIC;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_ENHANCEDFARMING_LETTUCE;
    public static Holder<PlacedFeature> PATCH_WILD_ENHANCEDFARMING_MINT;
    public static Holder<PlacedFeature> PATCH_WILD_ENHANCEDFARMING_TOMATO;
    public static Holder<PlacedFeature> PATCH_WILD_ENHANCEDFARMING_CUCUMBER;
    public static Holder<PlacedFeature> PATCH_WILD_ENHANCEDFARMING_AUBERGINE;
    public static Holder<PlacedFeature> PATCH_WILD_ENHANCEDFARMING_GRAPE;
    public static Holder<PlacedFeature> PATCH_WILD_ENHANCEDFARMING_PINEAPPLE;
    public static Holder<PlacedFeature> PATCH_WILD_ENHANCEDFARMING_CORN;
    public static Holder<PlacedFeature> PATCH_WILD_ENHANCEDFARMING_ONION;
    public static Holder<PlacedFeature> PATCH_WILD_ENHANCEDFARMING_GARLIC;
    public static Holder<PlacedFeature> PATCH_WILD_ENHANCEDFARMING_LETTUCE;



    public static void registerWildMinecraftCropGeneration() {
        //CONFIGURE FEATURES
        FEATURE_PATCH_WILD_MINECRAFT_WHEAT = register(new ResourceLocation(Wildplants.MOD_ID, "patch_minecraft_wild_wheat"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.MINECRAFT_WILD_WHEAT.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_MINECRAFT_CARROTS = register(new ResourceLocation(Wildplants.MOD_ID, "patch_minecraft_wild_carrots"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.MINECRAFT_WILD_CARROTS.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_MINECRAFT_POTATOES = register(new ResourceLocation(Wildplants.MOD_ID, "patch_minecraft_wild_potatoes"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.MINECRAFT_WILD_POTATOES.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_MINECRAFT_BEETROOTS = register(new ResourceLocation(Wildplants.MOD_ID, "patch_minecraft_wild_beetroots"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.MINECRAFT_WILD_BEETROOTS.get(), Blocks.DEAD_BUSH, BlockPredicate.matchesTag(BlockTags.SAND, BLOCK_BELOW)));

        //CONFIGURE PATCH
        PATCH_WILD_MINECRAFT_WHEAT = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_minecraft_wild_wheat"), FEATURE_PATCH_WILD_MINECRAFT_WHEAT, RarityFilter.onAverageOnceEvery(MinecraftConfig.CHANCE_MINECRAFT_WILD_WHEAT.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_MINECRAFT_CARROTS = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_minecraft_wild_carrots"), FEATURE_PATCH_WILD_MINECRAFT_CARROTS, RarityFilter.onAverageOnceEvery(MinecraftConfig.CHANCE_MINECRAFT_WILD_CARROTS.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_MINECRAFT_POTATOES = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_minecraft_wild_potatoes"), FEATURE_PATCH_WILD_MINECRAFT_POTATOES, RarityFilter.onAverageOnceEvery(MinecraftConfig.CHANCE_MINECRAFT_WILD_POTATOES.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_MINECRAFT_BEETROOTS = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_minecraft_wild_beetroots"), FEATURE_PATCH_WILD_MINECRAFT_BEETROOTS, RarityFilter.onAverageOnceEvery(MinecraftConfig.CHANCE_MINECRAFT_WILD_BEETROOTS.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        Wildplants.LOGGER.debug("register-minecraft-gen");
    }

    public static void registerWildImmersiveEngineeringCropGeneration() {
        //CONFIGURE FEATURES
        FEATURE_PATCH_WILD_IMMERSIVEENGINEERING_HEMP = register(new ResourceLocation(Wildplants.MOD_ID, "patch_immersiveengineering_wild_hemp"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.IMMERSIVEENGINEERING_WILD_HEMP.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));

        //CONFIGURE PATCH
        PATCH_WILD_IMMERSIVEENGINEERING_HEMP = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_immersiveengineering_wild_hemp"), FEATURE_PATCH_WILD_IMMERSIVEENGINEERING_HEMP, RarityFilter.onAverageOnceEvery(ImmersiveEngineeringConfig.CHANCE_IMMERSIVEENGINEERING_WILD_HEMP.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        Wildplants.LOGGER.debug("register-immersiveengineering-gen");
    }

    public static void registerWildVeggieWayCropGeneration() {
        //CONFIGURE FEATURES
        FEATURE_PATCH_WILD_VEGGIE_WAY_CORN = register(new ResourceLocation(Wildplants.MOD_ID, "patch_veggie-way_wild_corn"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.VEGGIEWAY_WILD_CORN.get(), Blocks.DEAD_BUSH, BlockPredicate.matchesTag(BlockTags.SAND, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_VEGGIE_WAY_LENTIL = register(new ResourceLocation(Wildplants.MOD_ID, "patch_veggie-way_wild_lentil"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.VEGGIEWAY_WILD_LENTIL.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_VEGGIE_WAY_QUINOA = register(new ResourceLocation(Wildplants.MOD_ID, "patch_veggie-way_wild_quinoa"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.VEGGIEWAY_WILD_QUINOA.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_VEGGIE_WAY_SOYBEAN = register(new ResourceLocation(Wildplants.MOD_ID, "patch_veggie-way_wild_soybean"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.VEGGIEWAY_WILD_SOYBEAN.get(), Blocks.DEAD_BUSH, BlockPredicate.matchesTag(BlockTags.SAND, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_VEGGIE_WAY_COTTON = register(new ResourceLocation(Wildplants.MOD_ID, "patch_veggie-way_wild_cotton"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.VEGGIEWAY_WILD_COTTON.get(), Blocks.DEAD_BUSH, BlockPredicate.matchesTag(BlockTags.SAND, BLOCK_BELOW)));

        //CONFIGURE PATCH
        PATCH_WILD_VEGGIE_WAY_CORN = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_veggie-way_wild_corn"), FEATURE_PATCH_WILD_VEGGIE_WAY_CORN, RarityFilter.onAverageOnceEvery(VeggieWayConfig.CHANCE_VEGGIEWAY_WILD_CORN.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_VEGGIE_WAY_LENTIL = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_veggie-way_wild_lentil"), FEATURE_PATCH_WILD_VEGGIE_WAY_LENTIL, RarityFilter.onAverageOnceEvery(VeggieWayConfig.CHANCE_VEGGIEWAY_WILD_LENTIL.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_VEGGIE_WAY_QUINOA = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_veggie-way_wild_quinoa"), FEATURE_PATCH_WILD_VEGGIE_WAY_QUINOA, RarityFilter.onAverageOnceEvery(VeggieWayConfig.CHANCE_VEGGIEWAY_WILD_QUINOA.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_VEGGIE_WAY_SOYBEAN = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_veggie-way_wild_soybean"), FEATURE_PATCH_WILD_VEGGIE_WAY_SOYBEAN, RarityFilter.onAverageOnceEvery(VeggieWayConfig.CHANCE_VEGGIEWAY_WILD_SOYBEAN.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_VEGGIE_WAY_COTTON = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_veggie-way_wild_cotton"), FEATURE_PATCH_WILD_VEGGIE_WAY_COTTON, RarityFilter.onAverageOnceEvery(VeggieWayConfig.CHANCE_VEGGIEWAY_WILD_COTTON.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        Wildplants.LOGGER.debug("register-veggie_way-gen");
    }

    public static void registerWildEnhancedFarmingCropGeneration() {
        //CONFIGURE FEATURES
        FEATURE_PATCH_WILD_ENHANCEDFARMING_MINT = register(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_mint"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.ENHANCEDFARMING_WILD_MINT.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_ENHANCEDFARMING_TOMATO = register(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_tomato"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.ENHANCEDFARMING_WILD_TOMATO.get(), Blocks.DEAD_BUSH, BlockPredicate.matchesTag(BlockTags.SAND, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_ENHANCEDFARMING_CUCUMBER = register(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_cucumber"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.ENHANCEDFARMING_WILD_CUCUMBER.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_ENHANCEDFARMING_AUBERGINE = register(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_aubergine"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.ENHANCEDFARMING_WILD_AUBERGINE.get(), Blocks.DEAD_BUSH, BlockPredicate.matchesTag(BlockTags.SAND, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_ENHANCEDFARMING_GRAPE = register(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_grape"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.ENHANCEDFARMING_WILD_GRAPE.get(), Blocks.DIRT, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_ENHANCEDFARMING_PINEAPPLE = register(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_pineapple"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.ENHANCEDFARMING_WILD_PINEAPPLE.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_ENHANCEDFARMING_CORN = register(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_corn"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.ENHANCEDFARMING_WILD_CORN.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_ENHANCEDFARMING_ONION = register(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_onion"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.ENHANCEDFARMING_WILD_ONION.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_ENHANCEDFARMING_GARLIC = register(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_garlic"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.ENHANCEDFARMING_WILD_GARLIC.get(), Blocks.DEAD_BUSH, BlockPredicate.matchesTag(BlockTags.SAND, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_ENHANCEDFARMING_LETTUCE = register(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_lettuce"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.ENHANCEDFARMING_WILD_LETTUCE.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));

        //CONFIGURE PATCH
        PATCH_WILD_ENHANCEDFARMING_MINT = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_mint"), FEATURE_PATCH_WILD_ENHANCEDFARMING_MINT, RarityFilter.onAverageOnceEvery(EnhancedFarmingConfig.CHANCE_ENHANCEDFARMING_WILD_MINT.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_ENHANCEDFARMING_TOMATO = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_tomato"), FEATURE_PATCH_WILD_ENHANCEDFARMING_TOMATO, RarityFilter.onAverageOnceEvery(EnhancedFarmingConfig.CHANCE_ENHANCEDFARMING_WILD_TOMATO.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_ENHANCEDFARMING_CUCUMBER = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_cucumber"), FEATURE_PATCH_WILD_ENHANCEDFARMING_CUCUMBER, RarityFilter.onAverageOnceEvery(EnhancedFarmingConfig.CHANCE_ENHANCEDFARMING_WILD_CUCUMBER.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_ENHANCEDFARMING_AUBERGINE = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_aubergine"), FEATURE_PATCH_WILD_ENHANCEDFARMING_AUBERGINE, RarityFilter.onAverageOnceEvery(EnhancedFarmingConfig.CHANCE_ENHANCEDFARMING_WILD_AUBERGINE.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_ENHANCEDFARMING_GRAPE = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_grape"), FEATURE_PATCH_WILD_ENHANCEDFARMING_GRAPE, RarityFilter.onAverageOnceEvery(EnhancedFarmingConfig.CHANCE_ENHANCEDFARMING_WILD_GRAPE.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_ENHANCEDFARMING_PINEAPPLE = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_pineapple"), FEATURE_PATCH_WILD_ENHANCEDFARMING_PINEAPPLE, RarityFilter.onAverageOnceEvery(EnhancedFarmingConfig.CHANCE_ENHANCEDFARMING_WILD_PINEAPPLE.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_ENHANCEDFARMING_CORN = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_corn"), FEATURE_PATCH_WILD_ENHANCEDFARMING_CORN, RarityFilter.onAverageOnceEvery(EnhancedFarmingConfig.CHANCE_ENHANCEDFARMING_WILD_CORN.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_ENHANCEDFARMING_ONION = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_onion"), FEATURE_PATCH_WILD_ENHANCEDFARMING_ONION, RarityFilter.onAverageOnceEvery(EnhancedFarmingConfig.CHANCE_ENHANCEDFARMING_WILD_ONION.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_ENHANCEDFARMING_GARLIC = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_garlic"), FEATURE_PATCH_WILD_ENHANCEDFARMING_GARLIC, RarityFilter.onAverageOnceEvery(EnhancedFarmingConfig.CHANCE_ENHANCEDFARMING_WILD_GARLIC.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_ENHANCEDFARMING_LETTUCE = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_enhancedfarming_wild_lettuce"), FEATURE_PATCH_WILD_ENHANCEDFARMING_LETTUCE, RarityFilter.onAverageOnceEvery(EnhancedFarmingConfig.CHANCE_ENHANCEDFARMING_WILD_LETTUCE.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        Wildplants.LOGGER.debug("register-enhancedfarming-gen");
    }
    //--------------------------------------------------------------------------

    public static WildCropConfig wildCropConfig(Block primaryBlock, Block secondaryBlock, BlockPredicate plantedOn) {
        return new WildCropConfig(TRIES, SPREAD + 1, SPREAD - 1, plantBlockConfig(primaryBlock, plantedOn), plantBlockConfig(secondaryBlock, plantedOn), null);
    }

    public static Holder<PlacedFeature> plantBlockConfig(Block block, BlockPredicate plantedOn) {
        return PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(block)), BlockPredicate.allOf(BlockPredicate.ONLY_IN_AIR_PREDICATE, plantedOn));
    }

    //REGISTER
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
