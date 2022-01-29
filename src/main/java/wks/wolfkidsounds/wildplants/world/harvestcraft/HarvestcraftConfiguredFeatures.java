package wks.wolfkidsounds.wildplants.world.harvestcraft;

import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.HarvestcraftConfig;

public class HarvestcraftConfiguredFeatures {

    public static Integer GLOBAL_FREQUENCY_HARVESTCRAFT = WildplantsConfig.GLOBAL_FREQUENCY.get();
    public static Integer GLOBAL_PATCH_SIZE_HARVESTCRAFT = WildplantsConfig.GLOBAL_PATCH_SIZE.get();
    public static Integer SPREAD_SIZE = WildplantsConfig.GLOBAL_SPREAD_SIZE.get();

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

    


    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_AGAVE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_AGAVE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(AGAVE_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(AGAVE_FREQUENCY_HARVESTCRAFT);
    
    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_AMARANTH_CONFIG = Feature.FLOWER.withConfiguration((
        new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_AMARANTH.get().getDefaultState()),
                SimpleBlockPlacer.PLACER)).tries(AMARANTH_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
                .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
                .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(AMARANTH_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_ARROWROOT_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_ARROWROOT.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(ARROWROOT_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(ARROWROOT_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_ARTICHOKE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_ARTICHOKE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(ARTICHOKE_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(ARTICHOKE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_ASPARAGUS_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_ASPARAGUS.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(ASPARAGUS_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(ASPARAGUS_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BARLEY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_BARLEY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(BARLEY_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(BARLEY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BEAN_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_BEAN.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(BEAN_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(BEAN_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BELLPEPPER_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_BELLPEPPER.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(BELLPEPPER_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(BELLPEPPER_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BLACKBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_BLACKBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(BLACKBERRY_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(BLACKBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BLUEBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_BLUEBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(BLUEBERRY_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(BLUEBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BROCCOLI_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_BROCCOLI.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(BROCCOLI_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(BROCCOLI_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BRUSSELSPROUT_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_BRUSSELSPROUT.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(BRUSSELSPROUT_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(BRUSSELSPROUT_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CABBAGE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CABBAGE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CABBAGE_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CABBAGE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CACTUSFRUIT_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CACTUSFRUIT.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CACTUSFRUIT_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CACTUSFRUIT_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CANDLEBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CANDLEBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CANDLEBERRY_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CANDLEBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CANTALOUPE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CANTALOUPE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CANTALOUPE_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CANTALOUPE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CASSAVA_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CASSAVA.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CASSAVA_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CASSAVA_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CAULIFLOWER_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CAULIFLOWER.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CAULIFLOWER_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CAULIFLOWER_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CELERY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CELERY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CELERY_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CELERY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CHICKPEA_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CHICKPEA.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CHICKPEA_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CHICKPEA_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CHILIPEPPER_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CHILIPEPPER.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CHILIPEPPER_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CHILIPEPPER_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_COFFEEBEAN_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_COFFEEBEAN.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(COFFEEBEAN_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(COFFEEBEAN_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CORN_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CORN.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CORN_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CORN_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_COTTON_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_COTTON.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(COTTON_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(COTTON_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CRANBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CRANBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CRANBERRY_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CRANBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CUCUMBER_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CUCUMBER.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(CUCUMBER_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(CUCUMBER_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_EGGPLANT_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_EGGPLANT.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(EGGPLANT_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(EGGPLANT_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_ELDERBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_ELDERBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(ELDERBERRY_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(ELDERBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_FLAX_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_FLAX.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(FLAX_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(FLAX_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_GARLIC_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_GARLIC.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(GARLIC_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(GARLIC_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_GINGER_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_GINGER.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(GINGER_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(GINGER_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_GRAPE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_GRAPE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(GRAPE_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(GRAPE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_GREENGRAPE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_GREENGRAPE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(GREENGRAPE_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(GREENGRAPE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_HUCKLEBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_HUCKLEBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(HUCKLEBERRY_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(HUCKLEBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_JICAMA_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_JICAMA.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(JICAMA_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(JICAMA_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_JUNIPERBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_JUNIPERBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(JUNIPERBERRY_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(JUNIPERBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_JUTE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_JUTE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(JUTE_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(JUTE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_KALE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_KALE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(KALE_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(KALE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_KENAF_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_KENAF.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(KENAF_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(KENAF_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_KIWI_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_KIWI.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(KIWI_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(KIWI_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_KOHLRABI_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_KOHLRABI.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(KOHLRABI_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(KOHLRABI_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_LEEK_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_LEEK.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(LEEK_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(LEEK_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_LENTIL_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_LENTIL.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(LENTIL_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(LENTIL_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_LETTUCE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_LETTUCE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(LETTUCE_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(LETTUCE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_MILLET_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_MILLET.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(MILLET_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(MILLET_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_MULBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_MULBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(MULBERRY_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(MULBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_MUSTARDSEEDS_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_MUSTARDSEEDS.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(MUSTARDSEEDS_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(MUSTARDSEEDS_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_OATS_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_OATS.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(OATS_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(OATS_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_OKRA_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_OKRA.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(OKRA_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(OKRA_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_ONION_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_ONION.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(ONION_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(ONION_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_PARSNIP_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_PARSNIP.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(PARSNIP_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(PARSNIP_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_PEANUT_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_PEANUT.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(PEANUT_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(PEANUT_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_PEAS_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_PEAS.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(PEAS_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(PEAS_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_PINEAPPLE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_PINEAPPLE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(PINEAPPLE_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(PINEAPPLE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_QUINOA_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_QUINOA.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(QUINOA_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(QUINOA_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_RADISH_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_RADISH.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(RADISH_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(RADISH_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_RASPBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_RASPBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(RASPBERRY_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(RASPBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_RHUBARB_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_RHUBARB.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(RHUBARB_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(RHUBARB_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_RICE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_RICE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(RICE_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(RICE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_RUTABAGA_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_RUTABAGA.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(RUTABAGA_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(RUTABAGA_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_RYE_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_RYE.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(RYE_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(RYE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SCALLION_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_SCALLION.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(SCALLION_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(SCALLION_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SESAMESEEDS_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_SESAMESEEDS.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(SESAMESEEDS_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(SESAMESEEDS_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SISAL_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_SISAL.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(SISAL_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(SISAL_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SOYBEAN_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_SOYBEAN.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(SOYBEAN_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(SOYBEAN_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SPINACH_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_SPINACH.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(SPINACH_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(SPINACH_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SPICELEAF_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_SPICELEAF.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(SPICELEAF_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(SPICELEAF_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_STRAWBERRY_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_STRAWBERRY.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(STRAWBERRY_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(STRAWBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SWEETPOTATO_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_SWEETPOTATO.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(SWEETPOTATO_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(SWEETPOTATO_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_TARO_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_TARO.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(TARO_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(TARO_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_TEALEAF_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_TEALEAF.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(TEALEAF_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(TEALEAF_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_TOMATILLO_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_TOMATILLO.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(TOMATILLO_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(TOMATILLO_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_TOMATO_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_TOMATO.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(TOMATO_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(TOMATO_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_TURNIP_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_TURNIP.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(TURNIP_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(TURNIP_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_WATERCHESTNUT_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_WATERCHESTNUT.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(WATERCHESTNUT_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(WATERCHESTNUT_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_WHITEMUSHROOM_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_WHITEMUSHROOM.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(WHITEMUSHROOM_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(WHITEMUSHROOM_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_WINTERSQUASH_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_WINTERSQUASH.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(WINTERSQUASH_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(WINTERSQUASH_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_ZUCCHINI_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_ZUCCHINI.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(ZUCCHINI_PATCH_SIZE_HARVESTCRAFT).zSpread(SPREAD_SIZE).xSpread(SPREAD_SIZE).build())
            .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT.square())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT).count(ZUCCHINI_FREQUENCY_HARVESTCRAFT);
}
