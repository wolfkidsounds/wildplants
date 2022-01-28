package wks.wolfkidsounds.wildplants.config;

import net.minecraftforge.common.ForgeConfigSpec;
import wks.wolfkidsounds.wildplants.Wildplants;

public class CompatConfig {
    //COMPAT
    public static ForgeConfigSpec.BooleanValue ENABLE_MINECRAFT;

    public static void initMinecraft(ForgeConfigSpec.Builder BUILDER) {
        Wildplants.LOGGER.debug("init-compat-minecraft-configuration");
        ENABLE_MINECRAFT = BUILDER
                .define("Minecraft", true);
    }
}
