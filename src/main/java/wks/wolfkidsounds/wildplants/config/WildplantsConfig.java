package wks.wolfkidsounds.wildplants.config;

import net.minecraftforge.common.ForgeConfigSpec;
import wks.wolfkidsounds.wildplants.Wildplants;

public final class WildplantsConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static ForgeConfigSpec.ConfigValue<Integer> GLOBAL_FREQUENCY;
    public static ForgeConfigSpec.ConfigValue<Integer> GLOBAL_PATCH_SIZE;
    public static ForgeConfigSpec.ConfigValue<Integer> GLOBAL_SPREAD_SIZE;

    static {

        Wildplants.LOGGER.debug("init-configuration");

        BUILDER.push("General");
        BUILDER.push("Global_Modifier");
        GLOBAL_FREQUENCY = BUILDER
                .comment("How many plant patches there are in the world (higher is more) [Default: 1]")
                .define("Frequency", 2);
        GLOBAL_PATCH_SIZE = BUILDER
                .comment("How many plants are placed in a patch at maximum (higher is more) [Default: 8]")
                .define("Size", 8);
        GLOBAL_SPREAD_SIZE = BUILDER
                .comment("How far apart the plants are at maximum (higher is more far) [Default: 3]")
                .define("Spread", 3);
        BUILDER.pop();
        BUILDER.push("Compat");
        BUILDER.comment("A config file will be generated when the mod is loaded while the feature is enabled. \n" +
                "If you disable a feature the config file and block registration/generation will be disabled");
        CompatConfig.initMinecraft(BUILDER);
        CompatConfig.initVeggieway(BUILDER);
        BUILDER.pop();
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
