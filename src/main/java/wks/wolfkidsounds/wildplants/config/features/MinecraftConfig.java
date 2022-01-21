package wks.wolfkidsounds.wildplants.config.features;
//TODO DEFAULT BIOMES

import net.minecraftforge.common.ForgeConfigSpec;
import wks.wolfkidsounds.wildplants.Wildplants;

public class MinecraftConfig {

    //MINECRAFT
    public static ForgeConfigSpec.ConfigValue<String> WHEAT_BIOME_TYPE;
    public static ForgeConfigSpec.ConfigValue<Integer> WHEAT_FREQUENCY;
    public static ForgeConfigSpec.ConfigValue<Integer> WHEAT_PATCH_SIZE;
    public static ForgeConfigSpec.BooleanValue WHEAT_ENABLED;

    public static ForgeConfigSpec.ConfigValue<String> CARROTS_BIOME_TYPE;
    public static ForgeConfigSpec.ConfigValue<Integer> CARROTS_FREQUENCY;
    public static ForgeConfigSpec.ConfigValue<Integer> CARROTS_PATCH_SIZE;
    public static ForgeConfigSpec.BooleanValue CARROTS_ENABLED;

    public static ForgeConfigSpec.ConfigValue<String> POTATOES_BIOME_TYPE;
    public static ForgeConfigSpec.ConfigValue<Integer> POTATOES_FREQUENCY;
    public static ForgeConfigSpec.ConfigValue<Integer> POTATOES_PATCH_SIZE;
    public static ForgeConfigSpec.BooleanValue POTATOES_ENABLED;

    public static ForgeConfigSpec.ConfigValue<String> BEETROOTS_BIOME_TYPE;
    public static ForgeConfigSpec.ConfigValue<Integer> BEETROOTS_FREQUENCY;
    public static ForgeConfigSpec.ConfigValue<Integer> BEETROOTS_PATCH_SIZE;
    public static ForgeConfigSpec.BooleanValue BEETROOTS_ENABLED;

    public static void init(ForgeConfigSpec.Builder BUILDER) {
            Wildplants.LOGGER.debug("init-minecraft-feature-config");

            BUILDER.push("WILD WHEAT");
            WHEAT_ENABLED = BUILDER
                    .define("Enabled:", true);
            WHEAT_BIOME_TYPE = BUILDER
                    .comment("Default: [PLAINS]")
                    .define("Biome Type:", "PLAINS");
            WHEAT_FREQUENCY = BUILDER
                    .comment("Default [1]")
                    .define("Frequency:", 1);
            WHEAT_PATCH_SIZE = BUILDER
                    .comment("Default [1]")
                    .define("Patch Size:", 1);
            BUILDER.pop();

            BUILDER.push("WILD CARROTS");
            CARROTS_ENABLED = BUILDER
                    .define("Enabled:", true);
            CARROTS_BIOME_TYPE = BUILDER
                    .comment("Default: [PLAINS]")
                    .define("Biome Type:", "PLAINS");
            CARROTS_FREQUENCY = BUILDER
                    .comment("Default [1]")
                    .define("Frequency: ", 1);
            CARROTS_PATCH_SIZE = BUILDER
                    .comment("Default [1]")
                    .define("Patch Size: ", 1);
            BUILDER.pop();

            BUILDER.push("WILD POTATOES");
            POTATOES_ENABLED = BUILDER
                    .define("Enabled:", true);
            POTATOES_BIOME_TYPE = BUILDER
                    .comment("Default: [PLAINS]")
                    .define("Biome Type:", "PLAINS");
            POTATOES_FREQUENCY = BUILDER
                    .comment("Default [1]")
                    .define("Frequency:", 1);
            POTATOES_PATCH_SIZE = BUILDER
                    .comment("Default [1]")
                    .define("Patch Size:", 1);
            BUILDER.pop();

            BUILDER.push("WILD BEETROOTS");
            BEETROOTS_ENABLED = BUILDER
                    .define("Enabled:", true);
            BEETROOTS_BIOME_TYPE = BUILDER
                    .comment("Default: [PLAINS]")
                    .define("Biome Type:", "PLAINS");
            BEETROOTS_FREQUENCY = BUILDER
                    .comment("Default [1]")
                    .define("Frequency:", 1);
            BEETROOTS_PATCH_SIZE = BUILDER
                    .comment("Default [1]")
                    .define("Patch Size:", 1);
            BUILDER.pop();
    }


}