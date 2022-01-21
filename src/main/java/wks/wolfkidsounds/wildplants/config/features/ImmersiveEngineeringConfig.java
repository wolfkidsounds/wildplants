package wks.wolfkidsounds.wildplants.config.features;
//TODO DEFAULT BIOMES

import net.minecraftforge.common.ForgeConfigSpec;
import wks.wolfkidsounds.wildplants.Wildplants;

public class ImmersiveEngineeringConfig {

    //IMMERSIVE ENGINEERING
    public static ForgeConfigSpec.ConfigValue<String> HEMP_BIOME_TYPE;
    public static ForgeConfigSpec.ConfigValue<Integer> HEMP_FREQUENCY;
    public static ForgeConfigSpec.ConfigValue<Integer> HEMP_PATCH_SIZE;
    public static ForgeConfigSpec.BooleanValue HEMP_ENABLED;

    public static void init(ForgeConfigSpec.Builder BUILDER) {
        Wildplants.LOGGER.debug("init-immersiveengineering-feature-config");

        BUILDER.push("WILD HEMP");
        HEMP_ENABLED = BUILDER
                .define("Enabled:", true);
        HEMP_BIOME_TYPE = BUILDER
                .comment("Default: [NONE]")
                .define("Biome Type:", "NONE");
        HEMP_FREQUENCY = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        HEMP_PATCH_SIZE = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();
    }
}