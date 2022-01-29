package wks.wolfkidsounds.wildplants.config.features;

import net.minecraftforge.common.ForgeConfigSpec;
import wks.wolfkidsounds.wildplants.Wildplants;

public class ImmersiveEngineeringConfig {

    //IMMERSIVE ENGINEERING
    public static ForgeConfigSpec.ConfigValue<String> HEMP_BIOME_TYPE_IMMERSIVEENINEERING;
    public static ForgeConfigSpec.ConfigValue<Integer> HEMP_FREQUENCY_IMMERSIVEENINEERING;
    public static ForgeConfigSpec.ConfigValue<Integer> HEMP_PATCH_SIZE_IMMERSIVEENINEERING;
    public static ForgeConfigSpec.BooleanValue HEMP_ENABLED_IMMERSIVEENINEERING;

    public static void init(ForgeConfigSpec.Builder BUILDER) {
        Wildplants.LOGGER.debug("init-immersiveengineering-feature-config");

        BUILDER.push("WILD HEMP");
        HEMP_ENABLED_IMMERSIVEENINEERING = BUILDER
                .define("Enabled:", true);
        HEMP_BIOME_TYPE_IMMERSIVEENINEERING = BUILDER
                .comment("Default: [OVERWORLD]")
                .define("Biome Type:", "OVERWORLD");
        HEMP_FREQUENCY_IMMERSIVEENINEERING = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        HEMP_PATCH_SIZE_IMMERSIVEENINEERING = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();
    }
}