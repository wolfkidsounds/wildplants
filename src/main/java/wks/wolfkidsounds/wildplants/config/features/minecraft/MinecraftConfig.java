package wks.wolfkidsounds.wildplants.config.features.minecraft;

import net.minecraftforge.common.ForgeConfigSpec;
import wks.wolfkidsounds.wildplants.Wildplants;

public class MinecraftConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //MINECRAFT
    public static ForgeConfigSpec.ConfigValue<String> WHEAT_BIOME_TYPE_MINECRAFT;
    public static ForgeConfigSpec.ConfigValue<Integer> WHEAT_FREQUENCY_MINECRAFT;
    public static ForgeConfigSpec.ConfigValue<Integer> WHEAT_PATCH_SIZE_MINECRAFT;
    public static ForgeConfigSpec.BooleanValue WHEAT_ENABLED_MINECRAFT;

    public static ForgeConfigSpec.ConfigValue<String> CARROTS_BIOME_TYPE_MINECRAFT;
    public static ForgeConfigSpec.ConfigValue<Integer> CARROTS_FREQUENCY_MINECRAFT;
    public static ForgeConfigSpec.ConfigValue<Integer> CARROTS_PATCH_SIZE_MINECRAFT;
    public static ForgeConfigSpec.BooleanValue CARROTS_ENABLED_MINECRAFT;

    public static ForgeConfigSpec.ConfigValue<String> POTATOES_BIOME_TYPE_MINECRAFT;
    public static ForgeConfigSpec.ConfigValue<Integer> POTATOES_FREQUENCY_MINECRAFT;
    public static ForgeConfigSpec.ConfigValue<Integer> POTATOES_PATCH_SIZE_MINECRAFT;
    public static ForgeConfigSpec.BooleanValue POTATOES_ENABLED_MINECRAFT;

    public static ForgeConfigSpec.ConfigValue<String> BEETROOTS_BIOME_TYPE_MINECRAFT;
    public static ForgeConfigSpec.ConfigValue<Integer> BEETROOTS_FREQUENCY_MINECRAFT;
    public static ForgeConfigSpec.ConfigValue<Integer> BEETROOTS_PATCH_SIZE_MINECRAFT;
    public static ForgeConfigSpec.BooleanValue BEETROOTS_ENABLED_MINECRAFT;

    static {
        Wildplants.LOGGER.debug("init-minecraft-feature-config");
        BUILDER.comment(
                "Valid Biome Types:\n" +
                        "Temperature: [HOT, COLD] \n" +
                        "Vegetation: [SPARSE, DENSE] \n" +
                        "Humidity: [WET, DRY] \n" +
                        "Tree Types: [SAVANNA, CONIFEROUS, JUNGLE] \n" +
                        "Attributes: [SPOOKY, DEAD, LUSH, MUSHROOM, MAGICAL, RARE, PLATEAU, MODIFIED, OCEAN, RIVER, WATER] \n" +
                        "Generic Types: [MESA, FOREST, PLAINS, MOUNTAIN, HILLS, SWAMP, SANDY, SNOWY, WASTELAND, BEACH, VOID] \n" +
                        "Use: [OVERWORLD] to generate in all biomes");

        BUILDER.push("MINECRAFT_WILD WHEAT");
        WHEAT_ENABLED_MINECRAFT = BUILDER
                .define("Enabled:", true);
        WHEAT_BIOME_TYPE_MINECRAFT = BUILDER
                .comment("Default: [SAVANNA]")
                .define("Biome Type:", "SAVANNA");
        WHEAT_FREQUENCY_MINECRAFT = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        WHEAT_PATCH_SIZE_MINECRAFT = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();

            BUILDER.push("MINECRAFT_WILD CARROTS");
            CARROTS_ENABLED_MINECRAFT = BUILDER
                    .define("Enabled:", true);
            CARROTS_BIOME_TYPE_MINECRAFT = BUILDER
                    .comment("Default: [PLAINS]")
                    .define("Biome Type:", "PLAINS");
            CARROTS_FREQUENCY_MINECRAFT = BUILDER
                    .comment("Default [1]")
                    .define("Frequency: ", 1);
            CARROTS_PATCH_SIZE_MINECRAFT = BUILDER
                    .comment("Default [1]")
                    .define("Patch Size: ", 1);
            BUILDER.pop();

            BUILDER.push("MINECRAFT_WILD POTATOES");
            POTATOES_ENABLED_MINECRAFT = BUILDER
                    .define("Enabled:", true);
            POTATOES_BIOME_TYPE_MINECRAFT = BUILDER
                    .comment("Default: [PLAINS]")
                    .define("Biome Type:", "PLAINS");
            POTATOES_FREQUENCY_MINECRAFT = BUILDER
                    .comment("Default [1]")
                    .define("Frequency:", 1);
            POTATOES_PATCH_SIZE_MINECRAFT = BUILDER
                    .comment("Default [1]")
                    .define("Patch Size:", 1);
            BUILDER.pop();

            BUILDER.push("MINECRAFT_WILD BEETROOTS");
            BEETROOTS_ENABLED_MINECRAFT = BUILDER
                    .define("Enabled:", true);
            BEETROOTS_BIOME_TYPE_MINECRAFT = BUILDER
                    .comment("Default: [PLAINS]")
                    .define("Biome Type:", "PLAINS");
            BEETROOTS_FREQUENCY_MINECRAFT = BUILDER
                    .comment("Default [1]")
                    .define("Frequency:", 1);
            BEETROOTS_PATCH_SIZE_MINECRAFT = BUILDER
                    .comment("Default [1]")
                    .define("Patch Size:", 1);
            BUILDER.pop();

        SPEC = BUILDER.build();
    }

}