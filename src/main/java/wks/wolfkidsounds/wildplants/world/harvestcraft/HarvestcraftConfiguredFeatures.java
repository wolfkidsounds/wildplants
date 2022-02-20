package wks.wolfkidsounds.wildplants.world.harvestcraft;

import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.harvestcraft.HarvestcraftConfig;

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
    public static Integer ARTICHOKE_PATCH_SIZE_HARVESTCRAFT = HarvestcraftConfig.ARTICHOKE_PATCH_SIZE_HARVESTCRAFT.get() * GLOBAL_PATCH_SIZE_HARVESTCRAFT;

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

    //----------FEATURE---CONFIGS----------------

    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_AGAVE = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_AGAVE.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(AGAVE_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_AMARANTH = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_AMARANTH.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(AMARANTH_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_ARROWROOT = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_ARROWROOT.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(ARROWROOT_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_ARTICHOKE = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_ARTICHOKE.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(ARTICHOKE_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_ASPARAGUS = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_ASPARAGUS.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(ASPARAGUS_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_BARLEY = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_BARLEY.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(BARLEY_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_BEAN = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_BEAN.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(BEAN_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_BELLPEPPER = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_BELLPEPPER.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(BELLPEPPER_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_BLACKBERRY = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_BLACKBERRY.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(BLACKBERRY_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_BLUEBERRY = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_BLUEBERRY.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(BLUEBERRY_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_BROCCOLI = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_BROCCOLI.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(BROCCOLI_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_BRUSSELSPROUT = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_BRUSSELSPROUT.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(BRUSSELSPROUT_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_CABBAGE = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CABBAGE.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(CABBAGE_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_CACTUSFRUIT = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CACTUSFRUIT.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(CACTUSFRUIT_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_CANDLEBERRY = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CANDLEBERRY.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(CANDLEBERRY_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_CANTALOUPE = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CANTALOUPE.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(CANTALOUPE_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_CASSAVA = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CASSAVA.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(CASSAVA_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_CAULIFLOWER = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CAULIFLOWER.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(CAULIFLOWER_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_CELERY = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CELERY.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(CELERY_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_CHICKPEA = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CHICKPEA.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(CHICKPEA_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_CHILIPEPPER = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CHILIPEPPER.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(CHILIPEPPER_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_COFFEEBEAN = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_COFFEEBEAN.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(COFFEEBEAN_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_CORN = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CORN.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(CORN_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_COTTON = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_COTTON.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(COTTON_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_CRANBERRY = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CRANBERRY.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(CRANBERRY_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_CUCUMBER = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_CUCUMBER.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(CUCUMBER_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_EGGPLANT = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_EGGPLANT.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(EGGPLANT_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_ELDERBERRY = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_ELDERBERRY.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(ELDERBERRY_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_FLAX = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_FLAX.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(FLAX_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_GARLIC = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_GARLIC.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(GARLIC_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_GINGER = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_GINGER.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(GINGER_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_GRAPE = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_GRAPE.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(GRAPE_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_GREENGRAPE = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_GREENGRAPE.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(GREENGRAPE_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_HUCKLEBERRY = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_HUCKLEBERRY.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(HUCKLEBERRY_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_JICAMA = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_JICAMA.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(JICAMA_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_JUNIPERBERRY = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_JUNIPERBERRY.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(JUNIPERBERRY_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_JUTE = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_JUTE.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(JUTE_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_KALE = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_KALE.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(KALE_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_KENAF = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_KENAF.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(KENAF_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_KIWI = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_KIWI.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(KIWI_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_KOHLRABI = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_KOHLRABI.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(KOHLRABI_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_LEEK = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_LEEK.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(LEEK_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_LENTIL = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_LENTIL.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(LENTIL_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_LETTUCE = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_LETTUCE.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(LETTUCE_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_MILLET = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_MILLET.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(MILLET_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_MULBERRY = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_MULBERRY.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(MULBERRY_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_MUSTARDSEEDS = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_MUSTARDSEEDS.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(MUSTARDSEEDS_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_OATS = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_OATS.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(OATS_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_OKRA = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_OKRA.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(OKRA_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_ONION = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_ONION.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(ONION_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_PARSNIP = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_PARSNIP.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(PARSNIP_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_PEANUT = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_PEANUT.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(PEANUT_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_PEAS = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_PEAS.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(PEAS_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_PINEAPPLE = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_PINEAPPLE.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(PINEAPPLE_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_QUINOA = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_QUINOA.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(QUINOA_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_RADISH = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_RADISH.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(RADISH_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_RASPBERRY = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_RASPBERRY.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(RASPBERRY_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_RHUBARB = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_RHUBARB.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(RHUBARB_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_RICE = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_RICE.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(RICE_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_RUTABAGA = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_RUTABAGA.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(RUTABAGA_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_RYE = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_RYE.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(RYE_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_SCALLION = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_SCALLION.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(SCALLION_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_SESAMESEEDS = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_SESAMESEEDS.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(SESAMESEEDS_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_SISAL = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_SISAL.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(SISAL_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_SOYBEAN = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_SOYBEAN.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(SOYBEAN_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_SPINACH = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_SPINACH.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(SPINACH_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_SPICELEAF = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_SPICELEAF.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(SPICELEAF_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_STRAWBERRY = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_STRAWBERRY.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(STRAWBERRY_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_SWEETPOTATO = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_SWEETPOTATO.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(SWEETPOTATO_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_TARO = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_TARO.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(TARO_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_TEALEAF = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_TEALEAF.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(TEALEAF_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_TOMATILLO = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_TOMATILLO.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(TOMATILLO_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_TOMATO = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_TOMATO.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(TOMATO_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_TURNIP = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_TURNIP.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(TURNIP_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_WATERCHESTNUT = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_WATERCHESTNUT.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(WATERCHESTNUT_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_WHITEMUSHROOM = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_WHITEMUSHROOM.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(WHITEMUSHROOM_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_WINTERSQUASH = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_WINTERSQUASH.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(WINTERSQUASH_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();


    public static final BlockClusterFeatureConfig HARVESTCRAFT_WILD_ZUCCHINI = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.HARVESTCRAFT_WILD_ZUCCHINI.get().getDefaultState()),
                    new SimpleBlockPlacer())).tries(ZUCCHINI_PATCH_SIZE_HARVESTCRAFT).xSpread(SPREAD_SIZE).zSpread(SPREAD_SIZE).build();

    //----------PLACEMENT---CONFIGS----------------

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_AGAVE_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_AGAVE)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(AGAVE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_AMARANTH_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_AMARANTH)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(AMARANTH_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_ARROWROOT_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_ARROWROOT)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(ARROWROOT_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_ARTICHOKE_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_ARTICHOKE)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(ARTICHOKE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_ASPARAGUS_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_ASPARAGUS)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(ASPARAGUS_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BARLEY_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_BARLEY)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(BARLEY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BEAN_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_BEAN)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(BEAN_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BELLPEPPER_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_BELLPEPPER)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(BELLPEPPER_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BLACKBERRY_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_BLACKBERRY)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(BLACKBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BLUEBERRY_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_BLUEBERRY)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(BLUEBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BROCCOLI_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_BROCCOLI)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(BROCCOLI_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_BRUSSELSPROUT_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_BRUSSELSPROUT)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(BRUSSELSPROUT_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CABBAGE_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_CABBAGE)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CABBAGE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CACTUSFRUIT_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_CACTUSFRUIT)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CACTUSFRUIT_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CANDLEBERRY_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_CANDLEBERRY)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CANDLEBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CANTALOUPE_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_CANTALOUPE)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CANTALOUPE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CASSAVA_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_CASSAVA)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CASSAVA_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CAULIFLOWER_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_CAULIFLOWER)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CAULIFLOWER_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CELERY_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_CELERY)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CELERY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CHICKPEA_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_CHICKPEA)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CHICKPEA_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CHILIPEPPER_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_CHILIPEPPER)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CHILIPEPPER_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_COFFEEBEAN_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_COFFEEBEAN)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(COFFEEBEAN_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CORN_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_CORN)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CORN_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_COTTON_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_COTTON)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(COTTON_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CRANBERRY_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_CRANBERRY)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CRANBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_CUCUMBER_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_CUCUMBER)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(CUCUMBER_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_EGGPLANT_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_EGGPLANT)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(EGGPLANT_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_ELDERBERRY_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_ELDERBERRY)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(ELDERBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_FLAX_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_FLAX)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(FLAX_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_GARLIC_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_GARLIC)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(GARLIC_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_GINGER_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_GINGER)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(GINGER_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_GRAPE_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_GRAPE)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(GRAPE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_GREENGRAPE_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_GREENGRAPE)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(GREENGRAPE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_HUCKLEBERRY_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_HUCKLEBERRY)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(HUCKLEBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_JICAMA_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_JICAMA)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(JICAMA_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_JUNIPERBERRY_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_JUNIPERBERRY)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(JUNIPERBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_JUTE_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_JUTE)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(JUTE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_KALE_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_KALE)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(KALE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_KENAF_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_KENAF)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(KENAF_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_KIWI_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_KIWI)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(KIWI_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_KOHLRABI_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_KOHLRABI)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(KOHLRABI_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_LEEK_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_LEEK)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(LEEK_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_LENTIL_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_LENTIL)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(LENTIL_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_LETTUCE_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_LETTUCE)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(LETTUCE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_MILLET_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_MILLET)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(MILLET_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_MULBERRY_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_MULBERRY)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(MULBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_MUSTARDSEEDS_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_MUSTARDSEEDS)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(MUSTARDSEEDS_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_OATS_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_OATS)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(OATS_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_OKRA_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_OKRA)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(OKRA_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_ONION_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_ONION)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(ONION_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_PARSNIP_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_PARSNIP)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(PARSNIP_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_PEANUT_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_PEANUT)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(PEANUT_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_PEAS_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_PEAS)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(PEAS_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_PINEAPPLE_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_PINEAPPLE)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(PINEAPPLE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_QUINOA_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_QUINOA)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(QUINOA_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_RADISH_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_RADISH)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(RADISH_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_RASPBERRY_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_RASPBERRY)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(RASPBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_RHUBARB_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_RHUBARB)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(RHUBARB_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_RICE_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_RICE)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(RICE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_RUTABAGA_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_RUTABAGA)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(RUTABAGA_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_RYE_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_RYE)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(RYE_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SCALLION_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_SCALLION)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(SCALLION_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SESAMESEEDS_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_SESAMESEEDS)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(SESAMESEEDS_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SISAL_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_SISAL)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(SISAL_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SOYBEAN_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_SOYBEAN)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(SOYBEAN_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SPINACH_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_SPINACH)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(SPINACH_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SPICELEAF_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_SPICELEAF)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(SPICELEAF_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_STRAWBERRY_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_STRAWBERRY)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(STRAWBERRY_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_SWEETPOTATO_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_SWEETPOTATO)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(SWEETPOTATO_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_TARO_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_TARO)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(TARO_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_TEALEAF_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_TEALEAF)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(TEALEAF_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_TOMATILLO_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_TOMATILLO)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(TOMATILLO_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_TOMATO_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_TOMATO)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(TOMATO_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_TURNIP_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_TURNIP)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(TURNIP_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_WATERCHESTNUT_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_WATERCHESTNUT)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(WATERCHESTNUT_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_WHITEMUSHROOM_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_WHITEMUSHROOM)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(WHITEMUSHROOM_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_WINTERSQUASH_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_WINTERSQUASH)
                    .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(WINTERSQUASH_FREQUENCY_HARVESTCRAFT);

    public static final ConfiguredFeature<?, ?> HARVESTCRAFT_WILD_ZUCCHINI_PATCH =
            Feature.FLOWER.withConfiguration(HARVESTCRAFT_WILD_ZUCCHINI)
                            .withPlacement(Features.Placements.PATCH_PLACEMENT.square()).chance(ZUCCHINI_FREQUENCY_HARVESTCRAFT);
}
