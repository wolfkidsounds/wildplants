package wks.wolfkidsounds.wildplants.config;

import net.minecraftforge.common.ForgeConfigSpec;
import wks.wolfkidsounds.wildplants.Wildplants;

public final class WildplantsConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static ForgeConfigSpec.ConfigValue<Integer> GLOBAL_FREQUENCY;
    public static ForgeConfigSpec.ConfigValue<Integer> GLOBAL_PATCH_SIZE;
    public static ForgeConfigSpec.BooleanValue DEBUG;

    static {

        Wildplants.LOGGER.debug("init-configuration");

        BUILDER.push("General");
        DEBUG = BUILDER.define("DEBUG", true);
        BUILDER.push("Global_Modifier");
        //GLOBAL_CHANCE = BUILDER.comment("Global rarity modifier (higher is less) [Default: 10]").define("Rarity", 10);
        GLOBAL_FREQUENCY = BUILDER
                .comment("Global generation frequency modifier (higher is more) [Default: 1]")
                .define("Frequency", 1);
        GLOBAL_PATCH_SIZE = BUILDER
                .comment("Global generation patch size modifier (higher is more) [Default: 4]")
                .define("Size", 4);
        BUILDER.pop();
        BUILDER.push("Compat");
        BUILDER.comment("A config file will be generated when the mod is loaded while the feature is enabled. \n" +
                "If you disable a feature the config file and block registration/generation will be disabled");
        CompatConfig.initMinecraft(BUILDER);
        CompatConfig.initImmersiveEngineering(BUILDER);
        CompatConfig.initHarvestcraft(BUILDER);
        CompatConfig.initVeggieway(BUILDER);
        BUILDER.pop();
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
