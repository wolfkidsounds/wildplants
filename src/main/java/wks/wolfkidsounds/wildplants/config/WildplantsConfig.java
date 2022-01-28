package wks.wolfkidsounds.wildplants.config;

import net.minecraftforge.common.ForgeConfigSpec;
import wks.wolfkidsounds.wildplants.Wildplants;

public final class WildplantsConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static ForgeConfigSpec.ConfigValue<Integer> GLOBAL_FREQUENCY;
    public static ForgeConfigSpec.ConfigValue<Integer> GLOBAL_PATCH_SIZE;

    static {

        Wildplants.LOGGER.debug("init-configuration");

        BUILDER.push("General");
        BUILDER.push("Global_Modifier");
        GLOBAL_FREQUENCY = BUILDER
                .comment("Global generation frequency modifier (higher is more) [Default: 1]")
                .define("Frequency", 1);
        GLOBAL_PATCH_SIZE = BUILDER
                .comment("Global generation patch size modifier (higher is more) [Default: 1]")
                .define("Size", 1);
        BUILDER.pop();
        BUILDER.push("Compat *NOT WORKING IN THIS VERSION*");
        BUILDER.comment("A config file will be generated when the mod is loaded while the feature is enabled. \n" +
                "If you disable a feature the config file and block registration/generation will be disabled");
        CompatConfig.initMinecraft(BUILDER);
        CompatConfig.initImmersiveEngineering(BUILDER);
        //CompatConfig.initHarvestcraft(BUILDER);
        BUILDER.pop();
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
