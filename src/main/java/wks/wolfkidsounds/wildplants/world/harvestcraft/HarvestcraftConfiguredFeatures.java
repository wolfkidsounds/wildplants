package wks.wolfkidsounds.wildplants.world.harvestcraft;

import net.minecraft.data.worldgen.Features;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.blockplacers.SimpleBlockPlacer;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.HarvestcraftConfig;

public class HarvestcraftConfiguredFeatures {

    public static Integer GLOBAL_FREQUENCY_HARVESTCRAFT = WildplantsConfig.GLOBAL_FREQUENCY.get();
    public static Integer GLOBAL_PATCH_SIZE_HARVESTCRAFT = WildplantsConfig.GLOBAL_PATCH_SIZE.get();

    public static Integer AGAVE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.AGAVE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer AGAVE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.AGAVE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer AMARANTH_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.AMARANTH_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer AMARANTH_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.AMARANTH_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer ARROWROOT_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.ARROWROOT_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer ARROWROOT_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.ARROWROOT_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer ARTICHOKE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.ARTICHOKE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer ARTICHOKE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.ARROWROOT_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer ASPARAGUS_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.ASPARAGUS_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer ASPARAGUS_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.ASPARAGUS_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer BARLEY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.BARLEY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer BARLEY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.BARLEY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer BEAN_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.BEAN_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer BEAN_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.BEAN_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer BELLPEPPER_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.BELLPEPPER_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer BELLPEPPER_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.BELLPEPPER_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer BLACKBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.BLACKBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer BLACKBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.BLACKBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer BLUEBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.BLUEBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer BLUEBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.BLUEBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer BROCCOLI_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.BROCCOLI_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer BROCCOLI_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.BROCCOLI_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer BRUSSELSPROUT_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.BRUSSELSPROUT_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer BRUSSELSPROUT_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.BRUSSELSPROUT_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer CABBAGE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CABBAGE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer CABBAGE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CABBAGE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer CACTUSFRUIT_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CACTUSFRUIT_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer CACTUSFRUIT_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CACTUSFRUIT_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer CANDLEBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CANDLEBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer CANDLEBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CANDLEBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer CANTALOUPE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CANTALOUPE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer CANTALOUPE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CANTALOUPE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer CASSAVA_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CASSAVA_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer CASSAVA_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CASSAVA_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer CAULIFLOWER_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CAULIFLOWER_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer CAULIFLOWER_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CAULIFLOWER_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer CELERY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CELERY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer CELERY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CELERY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer CHICKPEA_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CHICKPEA_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer CHICKPEA_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CHICKPEA_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer CHILIPEPPER_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CHILIPEPPER_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer CHILIPEPPER_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CHILIPEPPER_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer COFFEEBEAN_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.COFFEEBEAN_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer COFFEEBEAN_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.COFFEEBEAN_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer CORN_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CORN_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer CORN_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CORN_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer COTTON_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.COTTON_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer COTTON_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.COTTON_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer CRANBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CRANBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer CRANBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CRANBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer CUCUMBER_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.CUCUMBER_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer CUCUMBER_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.CUCUMBER_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer EGGPLANT_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.EGGPLANT_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer EGGPLANT_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.EGGPLANT_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer ELDERBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.ELDERBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer ELDERBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.ELDERBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer FLAX_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.FLAX_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer FLAX_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.FLAX_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer GARLIC_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.GARLIC_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer GARLIC_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.GARLIC_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer GINGER_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.GINGER_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer GINGER_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.GINGER_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer GRAPE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.GRAPE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer GRAPE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.GRAPE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer GREENGRAPE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.GREENGRAPE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer GREENGRAPE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.GREENGRAPE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer HUCKLEBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.HUCKLEBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer HUCKLEBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.HUCKLEBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer JICAMA_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.JICAMA_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer JICAMA_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.JICAMA_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer JUNIPERBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.JUNIPERBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer JUNIPERBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.JUNIPERBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer JUTE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.JUTE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer JUTE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.JUTE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer KALE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.KALE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer KALE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.KALE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer KENAF_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.KENAF_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer KENAF_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.KENAF_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer KIWI_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.KIWI_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer KIWI_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.KIWI_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer KOHLRABI_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.KOHLRABI_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer KOHLRABI_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.KOHLRABI_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer LEEK_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.LEEK_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer LEEK_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.LEEK_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer LENTIL_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.LENTIL_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer LENTIL_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.LENTIL_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer LETTUCE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.LETTUCE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer LETTUCE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.LETTUCE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer MILLET_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.MILLET_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer MILLET_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.MILLET_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer MULBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.MULBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer MULBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.MULBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer MUSTARDSEEDS_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.MUSTARDSEEDS_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer MUSTARDSEEDS_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.MUSTARDSEEDS_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer OATS_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.OATS_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer OATS_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.OATS_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer OKRA_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.OKRA_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer OKRA_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.OKRA_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer ONION_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.ONION_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer ONION_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.ONION_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer PARSNIP_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.PARSNIP_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer PARSNIP_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.PARSNIP_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer PEANUT_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.PEANUT_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer PEANUT_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.PEANUT_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer PEAS_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.PEAS_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer PEAS_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.PEAS_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer PINEAPPLE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.PINEAPPLE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer PINEAPPLE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.PINEAPPLE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer QUINOA_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.QUINOA_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer QUINOA_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.QUINOA_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer RADISH_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.RADISH_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer RADISH_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.RADISH_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer RASPBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.RASPBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer RASPBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.RASPBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer RHUBARB_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.RHUBARB_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer RHUBARB_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.RHUBARB_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer RICE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.RICE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer RICE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.RICE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer RUTABAGA_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.RUTABAGA_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer RUTABAGA_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.RUTABAGA_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer RYE_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.RYE_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer RYE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.RYE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer SCALLION_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.SCALLION_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer SCALLION_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.SCALLION_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer SESAMESEEDS_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.SESAMESEEDS_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer SESAMESEEDS_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.SESAMESEEDS_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer SISAL_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.SISAL_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer SISAL_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.SISAL_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer SOYBEAN_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.SOYBEAN_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer SOYBEAN_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.SOYBEAN_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer SPICELEAF_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.SPICELEAF_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer SPICELEAF_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.SPICELEAF_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer STRAWBERRY_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.STRAWBERRY_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer STRAWBERRY_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.STRAWBERRY_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer SWEETPOTATO_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.SWEETPOTATO_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer SWEETPOTATO_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.SWEETPOTATO_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer TARO_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.TARO_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer TARO_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.TARO_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer TEALEAF_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.TEALEAF_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer TEALEAF_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.TEALEAF_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer TOMATILLO_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.TOMATILLO_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer TOMATILLO_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.TOMATILLO_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer TOMATO_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.TOMATO_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer TOMATO_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.TOMATO_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer TURNIP_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.TURNIP_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer TURNIP_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.TURNIP_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer WATERCHESTNUT_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.WATERCHESTNUT_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer WATERCHESTNUT_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.WATERCHESTNUT_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer WHITEMUSHROOM_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.WHITEMUSHROOM_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer WHITEMUSHROOM_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.WHITEMUSHROOM_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer WINTERSQUASH_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.WINTERSQUASH_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer WINTERSQUASH_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.WINTERSQUASH_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer ZUCCHINI_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.ZUCCHINI_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer ZUCCHINI_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.ZUCCHINI_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    public static Integer SPINACH_FREQUENCY_HARVESTCRAFT = HarvestcraftConfig.SPINACH_FREQUENCY_HARVESTCRAFT.get() * GLOBAL_FREQUENCY_HARVESTCRAFT;
    public static Integer SPINACH_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.SPINACH_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

    


    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_AGAVE_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_AGAVE.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(AGAVE_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(AGAVE_FREQUENCY_HARVESTCRAFT);
    
    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_AMARANTH_CONFIG = Feature.FLOWER.configured((
        new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_AMARANTH.get().defaultBlockState()),
                SimpleBlockPlacer.INSTANCE)).tries(AMARANTH_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
        
        .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
        .decorated(Features.Decorators.ADD_32).count(AMARANTH_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_ARROWROOT_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_ARROWROOT.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(ARROWROOT_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(ARROWROOT_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_ARTICHOKE_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_ARTICHOKE.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(ARTICHOKE_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(ARTICHOKE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_ASPARAGUS_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_ASPARAGUS.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(ASPARAGUS_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(ASPARAGUS_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BARLEY_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_BARLEY.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(BARLEY_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(BARLEY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BEAN_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_BEAN.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(BEAN_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(BEAN_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BELLPEPPER_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_BELLPEPPER.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(BELLPEPPER_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(BELLPEPPER_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BLACKBERRY_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_BLACKBERRY.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(BLACKBERRY_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(BLACKBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BLUEBERRY_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_BLUEBERRY.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(BLUEBERRY_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(BLUEBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BROCCOLI_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_BROCCOLI.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(BROCCOLI_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(BROCCOLI_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BRUSSELSPROUT_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_BRUSSELSPROUT.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(BRUSSELSPROUT_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(BRUSSELSPROUT_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CABBAGE_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_CABBAGE.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(CABBAGE_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(CABBAGE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CACTUSFRUIT_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_CACTUSFRUIT.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(CACTUSFRUIT_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(CACTUSFRUIT_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CANDLEBERRY_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_CANDLEBERRY.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(CANDLEBERRY_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(CANDLEBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CANTALOUPE_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_CANTALOUPE.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(CANTALOUPE_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(CANTALOUPE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CASSAVA_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_CASSAVA.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(CASSAVA_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(CASSAVA_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CAULIFLOWER_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_CAULIFLOWER.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(CAULIFLOWER_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(CAULIFLOWER_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CELERY_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_CELERY.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(CELERY_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(CELERY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CHICKPEA_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_CHICKPEA.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(CHICKPEA_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(CHICKPEA_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CHILIPEPPER_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_CHILIPEPPER.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(CHILIPEPPER_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(CHILIPEPPER_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_COFFEEBEAN_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_COFFEEBEAN.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(COFFEEBEAN_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(COFFEEBEAN_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CORN_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_CORN.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(CORN_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(CORN_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_COTTON_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_COTTON.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(COTTON_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(COTTON_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CRANBERRY_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_CRANBERRY.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(CRANBERRY_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(CRANBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CUCUMBER_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_CUCUMBER.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(CUCUMBER_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(CUCUMBER_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_EGGPLANT_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_EGGPLANT.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(EGGPLANT_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(EGGPLANT_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_ELDERBERRY_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_ELDERBERRY.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(ELDERBERRY_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(ELDERBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_FLAX_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_FLAX.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(FLAX_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(FLAX_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_GARLIC_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_GARLIC.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(GARLIC_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(GARLIC_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_GINGER_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_GINGER.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(GINGER_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(GINGER_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_GRAPE_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_GRAPE.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(GRAPE_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(GRAPE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_GREENGRAPE_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_GREENGRAPE.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(GREENGRAPE_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(GREENGRAPE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_HUCKLEBERRY_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_HUCKLEBERRY.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(HUCKLEBERRY_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(HUCKLEBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_JICAMA_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_JICAMA.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(JICAMA_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(JICAMA_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_JUNIPERBERRY_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_JUNIPERBERRY.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(JUNIPERBERRY_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(JUNIPERBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_JUTE_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_JUTE.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(JUTE_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(JUTE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_KALE_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_KALE.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(KALE_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(KALE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_KENAF_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_KENAF.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(KENAF_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(KENAF_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_KIWI_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_KIWI.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(KIWI_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(KIWI_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_KOHLRABI_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_KOHLRABI.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(KOHLRABI_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(KOHLRABI_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_LEEK_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_LEEK.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(LEEK_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(LEEK_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_LENTIL_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_LENTIL.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(LENTIL_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(LENTIL_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_LETTUCE_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_LETTUCE.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(LETTUCE_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(LETTUCE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_MILLET_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_MILLET.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(MILLET_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(MILLET_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_MULBERRY_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_MULBERRY.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(MULBERRY_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(MULBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_MUSTARDSEEDS_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_MUSTARDSEEDS.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(MUSTARDSEEDS_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(MUSTARDSEEDS_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_OATS_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_OATS.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(OATS_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(OATS_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_OKRA_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_OKRA.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(OKRA_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(OKRA_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_ONION_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_ONION.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(ONION_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(ONION_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_PARSNIP_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_PARSNIP.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(PARSNIP_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(PARSNIP_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_PEANUT_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_PEANUT.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(PEANUT_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(PEANUT_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_PEAS_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_PEAS.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(PEAS_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(PEAS_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_PINEAPPLE_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_PINEAPPLE.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(PINEAPPLE_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(PINEAPPLE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_QUINOA_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_QUINOA.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(QUINOA_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(QUINOA_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_RADISH_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_RADISH.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(RADISH_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(RADISH_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_RASPBERRY_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_RASPBERRY.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(RASPBERRY_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(RASPBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_RHUBARB_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_RHUBARB.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(RHUBARB_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(RHUBARB_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_RICE_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_RICE.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(RICE_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(RICE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_RUTABAGA_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_RUTABAGA.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(RUTABAGA_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(RUTABAGA_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_RYE_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_RYE.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(RYE_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(RYE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SCALLION_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_SCALLION.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(SCALLION_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(SCALLION_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SESAMESEEDS_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_SESAMESEEDS.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(SESAMESEEDS_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(SESAMESEEDS_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SISAL_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_SISAL.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(SISAL_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(SISAL_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SOYBEAN_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_SOYBEAN.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(SOYBEAN_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(SOYBEAN_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SPINACH_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_SPINACH.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(SPINACH_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(SPINACH_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SPICELEAF_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_SPICELEAF.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(SPICELEAF_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(SPICELEAF_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_STRAWBERRY_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_STRAWBERRY.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(STRAWBERRY_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(STRAWBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SWEETPOTATO_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_SWEETPOTATO.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(SWEETPOTATO_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(SWEETPOTATO_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_TARO_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_TARO.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(TARO_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(TARO_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_TEALEAF_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_TEALEAF.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(TEALEAF_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(TEALEAF_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_TOMATILLO_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_TOMATILLO.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(TOMATILLO_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(TOMATILLO_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_TOMATO_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_TOMATO.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(TOMATO_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(TOMATO_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_TURNIP_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_TURNIP.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(TURNIP_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(TURNIP_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_WATERCHESTNUT_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_WATERCHESTNUT.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(WATERCHESTNUT_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(WATERCHESTNUT_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_WHITEMUSHROOM_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_WHITEMUSHROOM.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(WHITEMUSHROOM_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(WHITEMUSHROOM_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_WINTERSQUASH_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_WINTERSQUASH.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(WINTERSQUASH_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(WINTERSQUASH_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_ZUCCHINI_CONFIG = Feature.FLOWER.configured((
            new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ModBlocks.HARVESTCRAFT_WILD_ZUCCHINI.get().defaultBlockState()),
                     SimpleBlockPlacer.INSTANCE)).tries(ZUCCHINI_PATCH_SIZE_HARVESTCRAFT).zspread(2).xspread(2).build())
            .decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
            .decorated(Features.Decorators.ADD_32).count(ZUCCHINI_FREQUENCY_HARVESTCRAFT);
}
