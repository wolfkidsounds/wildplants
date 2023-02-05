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

    //HARVESTCRAFT
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_AGAVE;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_AMARANTH;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_ARROWROOT;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_ARTICHOKE;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_ASPARAGUS;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_BARLEY;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_BEAN;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_BELLPEPPER;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_BLACKBERRY;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_BLUEBERRY;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_BROCCOLI;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_BRUSSELSPROUT;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_CABBAGE;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_CACTUSFRUIT;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_CANDLEBERRY;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_CANTALOUPE;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_CASSAVA;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_CAULIFLOWER;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_CELERY;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_CHICKPEA;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_CHILIPEPPER;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_COFFEEBEAN;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_CORN;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_COTTON;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_CRANBERRY;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_CUCUMBER;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_EGGPLANT;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_ELDERBERRY;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_FLAX;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_GARLIC;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_GINGER;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_GRAPE;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_GREENGRAPE;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_HUCKLEBERRY;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_JICAMA;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_JUNIPERBERRY;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_JUTE;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_KALE;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_KENAF;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_KIWI;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_KOHLRABI;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_LEEK;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_LENTIL;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_LETTUCE;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_MILLET;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_MULBERRY;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_MUSTARDSEEDS;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_OATS;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_OKRA;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_ONION;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_PARSNIP;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_PEANUT;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_PEAS;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_PINEAPPLE;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_QUINOA;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_RADISH;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_RASPBERRY;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_RHUBARB;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_RICE;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_RUTABAGA;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_RYE;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_SCALLION;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_SESAMESEEDS;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_SISAL;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_SOYBEAN;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_SPICELEAF;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_STRAWBERRY;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_SWEETPOTATO;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_TARO;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_TEALEAF;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_TOMATILLO;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_TOMATO;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_TURNIP;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_WATERCHESTNUT;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_WHITEMUSHROOM;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_WINTERSQUASH;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_ZUCCHINI;
    public static Holder<ConfiguredFeature<WildCropConfig, ?>> FEATURE_PATCH_WILD_HARVESTCRAFT_SPINACH;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_AGAVE;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_AMARANTH;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_ARROWROOT;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_ARTICHOKE;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_ASPARAGUS;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_BARLEY;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_BEAN;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_BELLPEPPER;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_BLACKBERRY;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_BLUEBERRY;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_BROCCOLI;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_BRUSSELSPROUT;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_CABBAGE;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_CACTUSFRUIT;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_CANDLEBERRY;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_CANTALOUPE;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_CASSAVA;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_CAULIFLOWER;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_CELERY;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_CHICKPEA;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_CHILIPEPPER;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_COFFEEBEAN;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_CORN;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_COTTON;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_CRANBERRY;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_CUCUMBER;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_EGGPLANT;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_ELDERBERRY;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_FLAX;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_GARLIC;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_GINGER;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_GRAPE;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_GREENGRAPE;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_HUCKLEBERRY;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_JICAMA;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_JUNIPERBERRY;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_JUTE;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_KALE;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_KENAF;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_KIWI;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_KOHLRABI;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_LEEK;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_LENTIL;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_LETTUCE;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_MILLET;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_MULBERRY;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_MUSTARDSEEDS;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_OATS;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_OKRA;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_ONION;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_PARSNIP;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_PEANUT;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_PEAS;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_PINEAPPLE;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_QUINOA;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_RADISH;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_RASPBERRY;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_RHUBARB;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_RICE;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_RUTABAGA;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_RYE;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_SCALLION;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_SESAMESEEDS;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_SISAL;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_SOYBEAN;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_SPICELEAF;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_STRAWBERRY;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_SWEETPOTATO;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_TARO;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_TEALEAF;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_TOMATILLO;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_TOMATO;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_TURNIP;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_WATERCHESTNUT;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_WHITEMUSHROOM;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_WINTERSQUASH;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_ZUCCHINI;
    public static Holder<PlacedFeature> PATCH_WILD_HARVESTCRAFT_SPINACH;


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
        //Wildplants.LOGGER.debug("register-minecraft-gen");
    }

    public static void registerWildImmersiveEngineeringCropGeneration() {
        //CONFIGURE FEATURES
        FEATURE_PATCH_WILD_IMMERSIVEENGINEERING_HEMP = register(new ResourceLocation(Wildplants.MOD_ID, "patch_immersiveengineering_wild_hemp"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.IMMERSIVEENGINEERING_WILD_HEMP.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));

        //CONFIGURE PATCH
        PATCH_WILD_IMMERSIVEENGINEERING_HEMP = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_immersiveengineering_wild_hemp"), FEATURE_PATCH_WILD_IMMERSIVEENGINEERING_HEMP, RarityFilter.onAverageOnceEvery(ImmersiveEngineeringConfig.CHANCE_IMMERSIVEENGINEERING_WILD_HEMP.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        //Wildplants.LOGGER.debug("register-immersiveengineering-gen");
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
        //Wildplants.LOGGER.debug("register-veggie_way-gen");
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
        //Wildplants.LOGGER.debug("register-enhancedfarming-gen");
    }

    public static void registerWildHarvestcraftCropGeneration() {
        //CONFIGURE FEATURES
        FEATURE_PATCH_WILD_HARVESTCRAFT_AGAVE = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_agave"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_AGAVE.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_AMARANTH = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_amaranth"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_AMARANTH.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_ARROWROOT = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_arrowroot"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_ARROWROOT.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_ARTICHOKE = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_artichoke"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_ARTICHOKE.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_ASPARAGUS = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_asparagus"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_ASPARAGUS.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_BARLEY = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_barley"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_BARLEY.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_BEAN = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_bean"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_BEAN.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_BELLPEPPER = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_bellpepper"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_BELLPEPPER.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_BLACKBERRY = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_blackberry"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_BLACKBERRY.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_BLUEBERRY = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_blueberry"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_BLUEBERRY.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_BROCCOLI = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_broccoli"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_BROCCOLI.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_BRUSSELSPROUT = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_brusselsprout"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_BRUSSELSPROUT.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_CABBAGE = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_cabbage"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_CABBAGE.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_CACTUSFRUIT = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_cactusfruit"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_CACTUSFRUIT.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_CANDLEBERRY = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_candleberry"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_CANDLEBERRY.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_CANTALOUPE = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_cantaloupe"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_CANTALOUPE.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_CASSAVA = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_cassava"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_CASSAVA.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_CAULIFLOWER = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_cauliflower"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_CAULIFLOWER.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_CELERY = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_celery"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_CELERY.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_CHICKPEA = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_chickpea"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_CHICKPEA.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_CHILIPEPPER = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_chilipepper"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_CHILIPEPPER.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_COFFEEBEAN = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_coffeebean"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_COFFEEBEAN.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_CORN = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_corn"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_CORN.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_COTTON = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_cotton"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_COTTON.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_CRANBERRY = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_cranberry"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_CRANBERRY.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_CUCUMBER = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_cucumber"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_CUCUMBER.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_EGGPLANT = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_eggplant"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_EGGPLANT.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_ELDERBERRY = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_elderberry"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_ELDERBERRY.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_FLAX = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_flax"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_FLAX.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_GARLIC = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_garlic"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_GARLIC.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_GINGER = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_ginger"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_GINGER.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_GRAPE = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_grape"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_GRAPE.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_GREENGRAPE = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_greengrape"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_GREENGRAPE.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_HUCKLEBERRY = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_huckleberry"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_HUCKLEBERRY.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_JICAMA = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_jicama"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_JICAMA.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_JUNIPERBERRY = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_juniperberry"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_JUNIPERBERRY.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_JUTE = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_jute"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_JUTE.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_KALE = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_kale"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_KALE.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_KENAF = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_kenaf"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_KENAF.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_KIWI = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_kiwi"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_KIWI.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_KOHLRABI = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_kohlrabi"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_KOHLRABI.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_LEEK = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_leek"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_LEEK.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_LENTIL = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_lentil"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_LENTIL.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_LETTUCE = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_lettuce"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_LETTUCE.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_MILLET = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_millet"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_MILLET.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_MULBERRY = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_mulberry"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_MULBERRY.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_MUSTARDSEEDS = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_mustardseeds"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_MUSTARDSEEDS.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_OATS = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_oats"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_OATS.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_OKRA = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_okra"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_OKRA.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_ONION = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_onion"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_ONION.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_PARSNIP = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_parsnip"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_PARSNIP.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_PEANUT = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_peanut"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_PEANUT.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_PEAS = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_peas"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_PEAS.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_PINEAPPLE = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_pineapple"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_PINEAPPLE.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_QUINOA = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_quinoa"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_QUINOA.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_RADISH = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_radish"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_RADISH.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_RASPBERRY = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_raspberry"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_RASPBERRY.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_RHUBARB = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_rhubarb"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_RHUBARB.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_RICE = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_rice"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_RICE.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_RUTABAGA = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_rutabaga"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_RUTABAGA.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_RYE = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_rye"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_RYE.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_SCALLION = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_scallion"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_SCALLION.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_SESAMESEEDS = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_sesameseeds"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_SESAMESEEDS.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_SISAL = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_sisal"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_SISAL.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_SOYBEAN = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_soybean"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_SOYBEAN.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_SPICELEAF = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_spiceleaf"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_SPICELEAF.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_SPINACH = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_spinach"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_SPINACH.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_STRAWBERRY = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_strawberry"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_STRAWBERRY.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_SWEETPOTATO = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_sweetpotato"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_SWEETPOTATO.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_TARO = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_taro"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_TARO.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_TEALEAF = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_tealeaf"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_TEALEAF.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_TOMATILLO = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_tomatillo"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_TOMATILLO.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_TOMATO = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_tomato"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_TOMATO.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_TURNIP = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_turnip"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_TURNIP.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_WATERCHESTNUT = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_waterchestnut"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_WATERCHESTNUT.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_WHITEMUSHROOM = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_whitemushroom"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_WHITEMUSHROOM.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_WINTERSQUASH = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_wintersquash"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_WINTERSQUASH.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));
        FEATURE_PATCH_WILD_HARVESTCRAFT_ZUCCHINI = register(new ResourceLocation(Wildplants.MOD_ID, "patch_wild_harvestcraft_wild_zucchini"), ModBiomeFeatures.WILD_CROP.get(), wildCropConfig(ModBlocks.HARVESTCRAFT_WILD_ZUCCHINI.get(), Blocks.GRASS, BlockPredicate.matchesTag(BlockTags.DIRT, BLOCK_BELOW)));

        //CONFIGURED PATCHES
        PATCH_WILD_HARVESTCRAFT_AGAVE = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_agave"), FEATURE_PATCH_WILD_HARVESTCRAFT_AGAVE, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_AGAVE.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_AMARANTH = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_amaranth"), FEATURE_PATCH_WILD_HARVESTCRAFT_AMARANTH, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_AMARANTH.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_ARROWROOT = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_arrowroot"), FEATURE_PATCH_WILD_HARVESTCRAFT_ARROWROOT, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_ARROWROOT.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_ARTICHOKE = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_artichoke"), FEATURE_PATCH_WILD_HARVESTCRAFT_ARTICHOKE, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_ARTICHOKE.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_ASPARAGUS = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_asparagus"), FEATURE_PATCH_WILD_HARVESTCRAFT_ASPARAGUS, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_ASPARAGUS.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_BARLEY = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_barley"), FEATURE_PATCH_WILD_HARVESTCRAFT_BARLEY, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_BARLEY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_BEAN = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_bean"), FEATURE_PATCH_WILD_HARVESTCRAFT_BEAN, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_BEAN.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_BELLPEPPER = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_bellpepper"), FEATURE_PATCH_WILD_HARVESTCRAFT_BELLPEPPER, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_BELLPEPPER.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_BLACKBERRY = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_blackberry"), FEATURE_PATCH_WILD_HARVESTCRAFT_BLACKBERRY, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_BLACKBERRY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_BLUEBERRY = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_blueberry"), FEATURE_PATCH_WILD_HARVESTCRAFT_BLUEBERRY, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_BLUEBERRY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_BROCCOLI = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_broccoli"), FEATURE_PATCH_WILD_HARVESTCRAFT_BROCCOLI, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_BROCCOLI.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_BRUSSELSPROUT = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_brusselsprout"), FEATURE_PATCH_WILD_HARVESTCRAFT_BRUSSELSPROUT, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_BRUSSELSPROUT.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_CABBAGE = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_cabbage"), FEATURE_PATCH_WILD_HARVESTCRAFT_CABBAGE, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_CABBAGE.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_CACTUSFRUIT = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_cactusfruit"), FEATURE_PATCH_WILD_HARVESTCRAFT_CACTUSFRUIT, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_CACTUSFRUIT.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_CANDLEBERRY = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_candleberry"), FEATURE_PATCH_WILD_HARVESTCRAFT_CANDLEBERRY, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_CANDLEBERRY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_CANTALOUPE = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_cantaloupe"), FEATURE_PATCH_WILD_HARVESTCRAFT_CANTALOUPE, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_CANTALOUPE.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_CASSAVA = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_cassava"), FEATURE_PATCH_WILD_HARVESTCRAFT_CASSAVA, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_CASSAVA.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_CAULIFLOWER = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_cauliflower"), FEATURE_PATCH_WILD_HARVESTCRAFT_CAULIFLOWER, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_CAULIFLOWER.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_CELERY = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_celery"), FEATURE_PATCH_WILD_HARVESTCRAFT_CELERY, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_CELERY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_CHICKPEA = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_chickpea"), FEATURE_PATCH_WILD_HARVESTCRAFT_CHICKPEA, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_CHICKPEA.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_CHILIPEPPER = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_chilipepper"), FEATURE_PATCH_WILD_HARVESTCRAFT_CHILIPEPPER, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_CHILIPEPPER.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_COFFEEBEAN = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_coffeebean"), FEATURE_PATCH_WILD_HARVESTCRAFT_COFFEEBEAN, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_COFFEEBEAN.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_CORN = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_corn"), FEATURE_PATCH_WILD_HARVESTCRAFT_CORN, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_CORN.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_COTTON = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_cotton"), FEATURE_PATCH_WILD_HARVESTCRAFT_COTTON, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_COTTON.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_CRANBERRY = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_cranberry"), FEATURE_PATCH_WILD_HARVESTCRAFT_CRANBERRY, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_CRANBERRY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_CUCUMBER = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_cucumber"), FEATURE_PATCH_WILD_HARVESTCRAFT_CUCUMBER, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_CUCUMBER.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_EGGPLANT = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_eggplant"), FEATURE_PATCH_WILD_HARVESTCRAFT_EGGPLANT, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_EGGPLANT.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_ELDERBERRY = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_elderberry"), FEATURE_PATCH_WILD_HARVESTCRAFT_ELDERBERRY, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_ELDERBERRY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_FLAX = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_flax"), FEATURE_PATCH_WILD_HARVESTCRAFT_FLAX, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_FLAX.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_GARLIC = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_garlic"), FEATURE_PATCH_WILD_HARVESTCRAFT_GARLIC, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_GARLIC.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_GINGER = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_ginger"), FEATURE_PATCH_WILD_HARVESTCRAFT_GINGER, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_GINGER.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_GRAPE = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_grape"), FEATURE_PATCH_WILD_HARVESTCRAFT_GRAPE, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_GRAPE.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_GREENGRAPE = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_greengrape"), FEATURE_PATCH_WILD_HARVESTCRAFT_GREENGRAPE, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_GREENGRAPE.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_HUCKLEBERRY = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_huckleberry"), FEATURE_PATCH_WILD_HARVESTCRAFT_HUCKLEBERRY, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_HUCKLEBERRY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_JICAMA = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_jicama"), FEATURE_PATCH_WILD_HARVESTCRAFT_JICAMA, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_JICAMA.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_JUNIPERBERRY = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_juniperberry"), FEATURE_PATCH_WILD_HARVESTCRAFT_JUNIPERBERRY, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_JUNIPERBERRY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_JUTE = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_jute"), FEATURE_PATCH_WILD_HARVESTCRAFT_JUTE, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_JUTE.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_KALE = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_kale"), FEATURE_PATCH_WILD_HARVESTCRAFT_KALE, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_KALE.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_KENAF = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_kenaf"), FEATURE_PATCH_WILD_HARVESTCRAFT_KENAF, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_KENAF.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_KIWI = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_kiwi"), FEATURE_PATCH_WILD_HARVESTCRAFT_KIWI, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_KIWI.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_KOHLRABI = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_kohlrabi"), FEATURE_PATCH_WILD_HARVESTCRAFT_KOHLRABI, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_KOHLRABI.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_LEEK = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_leek"), FEATURE_PATCH_WILD_HARVESTCRAFT_LEEK, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_LEEK.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_LENTIL = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_lentil"), FEATURE_PATCH_WILD_HARVESTCRAFT_LENTIL, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_LENTIL.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_LETTUCE = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_lettuce"), FEATURE_PATCH_WILD_HARVESTCRAFT_LETTUCE, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_LETTUCE.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_MILLET = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_millet"), FEATURE_PATCH_WILD_HARVESTCRAFT_MILLET, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_MILLET.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_MULBERRY = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_mulberry"), FEATURE_PATCH_WILD_HARVESTCRAFT_MULBERRY, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_MULBERRY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_MUSTARDSEEDS = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_mustardseeds"), FEATURE_PATCH_WILD_HARVESTCRAFT_MUSTARDSEEDS, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_MUSTARDSEEDS.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_OATS = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_oats"), FEATURE_PATCH_WILD_HARVESTCRAFT_OATS, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_OATS.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_OKRA = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_okra"), FEATURE_PATCH_WILD_HARVESTCRAFT_OKRA, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_OKRA.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_ONION = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_onion"), FEATURE_PATCH_WILD_HARVESTCRAFT_ONION, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_ONION.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_PARSNIP = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_parsnip"), FEATURE_PATCH_WILD_HARVESTCRAFT_PARSNIP, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_PARSNIP.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_PEANUT = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_peanut"), FEATURE_PATCH_WILD_HARVESTCRAFT_PEANUT, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_PEANUT.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_PEAS = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_peas"), FEATURE_PATCH_WILD_HARVESTCRAFT_PEAS, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_PEAS.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_PINEAPPLE = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_pineapple"), FEATURE_PATCH_WILD_HARVESTCRAFT_PINEAPPLE, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_PINEAPPLE.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_QUINOA = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_quinoa"), FEATURE_PATCH_WILD_HARVESTCRAFT_QUINOA, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_QUINOA.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_RADISH = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_radish"), FEATURE_PATCH_WILD_HARVESTCRAFT_RADISH, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_RADISH.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_RASPBERRY = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_raspberry"), FEATURE_PATCH_WILD_HARVESTCRAFT_RASPBERRY, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_RASPBERRY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_RHUBARB = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_rhubarb"), FEATURE_PATCH_WILD_HARVESTCRAFT_RHUBARB, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_RHUBARB.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_RICE = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_rice"), FEATURE_PATCH_WILD_HARVESTCRAFT_RICE, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_RICE.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_RUTABAGA = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_rutabaga"), FEATURE_PATCH_WILD_HARVESTCRAFT_RUTABAGA, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_RUTABAGA.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_RYE = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_rye"), FEATURE_PATCH_WILD_HARVESTCRAFT_RYE, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_RYE.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_SCALLION = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_scallion"), FEATURE_PATCH_WILD_HARVESTCRAFT_SCALLION, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_SCALLION.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_SESAMESEEDS = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_sesameseeds"), FEATURE_PATCH_WILD_HARVESTCRAFT_SESAMESEEDS, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_SESAMESEEDS.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_SISAL = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_sisal"), FEATURE_PATCH_WILD_HARVESTCRAFT_SISAL, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_SISAL.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_SOYBEAN = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_soybean"), FEATURE_PATCH_WILD_HARVESTCRAFT_SOYBEAN, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_SOYBEAN.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_SPICELEAF = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_spinach"), FEATURE_PATCH_WILD_HARVESTCRAFT_SPICELEAF, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_SPICELEAF.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_SPINACH = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_spiceleaf"), FEATURE_PATCH_WILD_HARVESTCRAFT_SPINACH, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_SPINACH.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_STRAWBERRY = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_strawberry"), FEATURE_PATCH_WILD_HARVESTCRAFT_STRAWBERRY, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_STRAWBERRY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_SWEETPOTATO = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_sweetpotato"), FEATURE_PATCH_WILD_HARVESTCRAFT_SWEETPOTATO, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_SWEETPOTATO.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_TARO = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_taro"), FEATURE_PATCH_WILD_HARVESTCRAFT_TARO, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_TARO.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_TEALEAF = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_tealeaf"), FEATURE_PATCH_WILD_HARVESTCRAFT_TEALEAF, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_TEALEAF.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_TOMATILLO = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_tomatillo"), FEATURE_PATCH_WILD_HARVESTCRAFT_TOMATILLO, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_TOMATILLO.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_TOMATO = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_tomato"), FEATURE_PATCH_WILD_HARVESTCRAFT_TOMATO, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_TOMATO.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_TURNIP = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_turnip"), FEATURE_PATCH_WILD_HARVESTCRAFT_TURNIP, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_TURNIP.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_WATERCHESTNUT = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_waterchestnut"), FEATURE_PATCH_WILD_HARVESTCRAFT_WATERCHESTNUT, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_WATERCHESTNUT.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_WHITEMUSHROOM = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_whitemushroom"), FEATURE_PATCH_WILD_HARVESTCRAFT_WHITEMUSHROOM, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_WHITEMUSHROOM.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_WINTERSQUASH = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_wintersquash"), FEATURE_PATCH_WILD_HARVESTCRAFT_WINTERSQUASH, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_WINTERSQUASH.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        PATCH_WILD_HARVESTCRAFT_ZUCCHINI = registerPlacement(new ResourceLocation(Wildplants.MOD_ID, "patch_harvestcraft_wild_zucchini"), FEATURE_PATCH_WILD_HARVESTCRAFT_ZUCCHINI, RarityFilter.onAverageOnceEvery(HarvestcraftConfig.CHANCE_HARVESTCRAFT_WILD_ZUCCHINI.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), TAGGED_IS_OVERWORLD);
        //Wildplants.LOGGER.debug("register-harvestcraft-gen");
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
