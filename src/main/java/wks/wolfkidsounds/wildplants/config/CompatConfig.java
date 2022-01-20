package wks.wolfkidsounds.wildplants.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModList;
import wks.wolfkidsounds.wildplants.Wildplants;

public class CompatConfig {
    //COMPAT
    public static ForgeConfigSpec.BooleanValue ENABLE_MINECRAFT;

    public static ForgeConfigSpec.BooleanValue ENABLE_IMMERSIVEENGINEERING;
    public static ForgeConfigSpec.BooleanValue ENABLE_HARVESTCRAFT;
    public static ForgeConfigSpec.BooleanValue ENABLE_FARMERSDELIGHT;

    public static Boolean LOADED_IMMERSIVEENGINEERING = ModList.get().isLoaded("immersiveengineering");
    public static Boolean LOADED_HARVESTCRAFT = ModList.get().isLoaded("pamhc2crops");
    public static Boolean LOADED_FARMERSDELIGHT = ModList.get().isLoaded("farmersdelight");

    public static void initMinecraft(ForgeConfigSpec.Builder BUILDER) {
        Wildplants.LOGGER.debug("init-compat-minecraft-configuration");
        BUILDER.comment("A config file will be generated when the mod is loaded while the feature is enabled. \n" +
                "If you disable a feature the config file and block registration/generation will be disabled");
        ENABLE_MINECRAFT = BUILDER
                .define("Minecraft ", true);
    }

    public static void initImmersiveEngineering(ForgeConfigSpec.Builder BUILDER) {
        Wildplants.LOGGER.debug("init-compat-immersiveengineering-configuration");
        ENABLE_IMMERSIVEENGINEERING = BUILDER
                .define("Immersive Engineering", true);
    }

    public static void initHarvestcraft(ForgeConfigSpec.Builder BUILDER) {
        Wildplants.LOGGER.debug("init-compat-harvestcraft-configuration");
        ENABLE_HARVESTCRAFT = BUILDER
                .define("Pams Harvestcraft", true);
    }

    public static void initFarmersDelight(ForgeConfigSpec.Builder BUILDER) {
        Wildplants.LOGGER.debug("init-compat-farmersdelight-configuration");
        ENABLE_HARVESTCRAFT = BUILDER
                .define("Farmers Delight", true);
    }


}
