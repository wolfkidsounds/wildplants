package wks.wolfkidsounds.wildplants.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModList;
import wks.wolfkidsounds.wildplants.Wildplants;

public class CompatConfig {
    //COMPAT
    public static ForgeConfigSpec.BooleanValue ENABLE_MINECRAFT;

    public static ForgeConfigSpec.BooleanValue ENABLE_IMMERSIVEENGINEERING;
    public static ForgeConfigSpec.BooleanValue ENABLE_HARVESTCRAFT;

    public static Boolean LOADED_IMMERSIVEENGINEERING = ModList.get().isLoaded("immersiveengineering");
    public static Boolean LOADED_HARVESTCRAFT = ModList.get().isLoaded("pamhc2crops");

    public static void initMinecraft(ForgeConfigSpec.Builder BUILDER) {
        Wildplants.LOGGER.debug("init-compat-minecraft-configuration");
        ENABLE_MINECRAFT = BUILDER
                .define("Minecraft", true);
    }

    public static void initImmersiveEngineering(ForgeConfigSpec.Builder BUILDER) {
        Wildplants.LOGGER.debug("init-compat-immersiveengineering-configuration");
        ENABLE_IMMERSIVEENGINEERING = BUILDER
                .define("Immersive_Engineering", true);
    }
}
