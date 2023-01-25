package wks.wolfkidsounds.wildplants.config.features.enhancedfarming;

import net.minecraftforge.common.ForgeConfigSpec;
import wks.wolfkidsounds.wildplants.Wildplants;

public class EnhancedFarmingConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //MINECRAFT
    public static ForgeConfigSpec.ConfigValue<String> MINT_BIOME_TYPE_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> MINT_FREQUENCY_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> MINT_PATCH_SIZE_ENHANCEDFARMING;
    public static ForgeConfigSpec.BooleanValue MINT_ENABLED_ENHANCEDFARMING;

    public static ForgeConfigSpec.ConfigValue<String> TOMATO_BIOME_TYPE_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> TOMATO_FREQUENCY_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> TOMATO_PATCH_SIZE_ENHANCEDFARMING;
    public static ForgeConfigSpec.BooleanValue TOMATO_ENABLED_ENHANCEDFARMING;

    public static ForgeConfigSpec.ConfigValue<String> CUCUMBER_BIOME_TYPE_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> CUCUMBER_FREQUENCY_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> CUCUMBER_PATCH_SIZE_ENHANCEDFARMING;
    public static ForgeConfigSpec.BooleanValue CUCUMBER_ENABLED_ENHANCEDFARMING;

    public static ForgeConfigSpec.ConfigValue<String> AUBERGINE_BIOME_TYPE_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> AUBERGINE_FREQUENCY_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> AUBERGINE_PATCH_SIZE_ENHANCEDFARMING;
    public static ForgeConfigSpec.BooleanValue AUBERGINE_ENABLED_ENHANCEDFARMING;

    public static ForgeConfigSpec.ConfigValue<String> GRAPE_BIOME_TYPE_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> GRAPE_FREQUENCY_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> GRAPE_PATCH_SIZE_ENHANCEDFARMING;
    public static ForgeConfigSpec.BooleanValue GRAPE_ENABLED_ENHANCEDFARMING;

    public static ForgeConfigSpec.ConfigValue<String> PINEPAPPLE_BIOME_TYPE_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> PINEPAPPLE_FREQUENCY_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> PINEPAPPLE_PATCH_SIZE_ENHANCEDFARMING;
    public static ForgeConfigSpec.BooleanValue PINEPAPPLE_ENABLED_ENHANCEDFARMING;

    public static ForgeConfigSpec.ConfigValue<String> CORN_BIOME_TYPE_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> CORN_FREQUENCY_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> CORN_PATCH_SIZE_ENHANCEDFARMING;
    public static ForgeConfigSpec.BooleanValue CORN_ENABLED_ENHANCEDFARMING;

    public static ForgeConfigSpec.ConfigValue<String> ONION_BIOME_TYPE_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> ONION_FREQUENCY_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> ONION_PATCH_SIZE_ENHANCEDFARMING;
    public static ForgeConfigSpec.BooleanValue ONION_ENABLED_ENHANCEDFARMING;

    public static ForgeConfigSpec.ConfigValue<String> GARLIC_BIOME_TYPE_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> GARLIC_FREQUENCY_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> GARLIC_PATCH_SIZE_ENHANCEDFARMING;
    public static ForgeConfigSpec.BooleanValue GARLIC_ENABLED_ENHANCEDFARMING;

    public static ForgeConfigSpec.ConfigValue<String> LETTUCE_BIOME_TYPE_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> LETTUCE_FREQUENCY_ENHANCEDFARMING;
    public static ForgeConfigSpec.ConfigValue<Integer> LETTUCE_PATCH_SIZE_ENHANCEDFARMING;
    public static ForgeConfigSpec.BooleanValue LETTUCE_ENABLED_ENHANCEDFARMING;

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


        BUILDER.push("MINECRAFT_WILD MINT");
        MINT_ENABLED_ENHANCEDFARMING = BUILDER
                .define("Enabled:", true);
        MINT_BIOME_TYPE_ENHANCEDFARMING = BUILDER
                .comment("Default: [SAVANNA]")
                .define("Biome Type:", "SAVANNA");
        MINT_FREQUENCY_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        MINT_PATCH_SIZE_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();

        BUILDER.push("MINECRAFT_WILD TOMATO");
        TOMATO_ENABLED_ENHANCEDFARMING = BUILDER
                .define("Enabled:", true);
        TOMATO_BIOME_TYPE_ENHANCEDFARMING = BUILDER
                .comment("Default: [SAVANNA]")
                .define("Biome Type:", "SAVANNA");
        TOMATO_FREQUENCY_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        TOMATO_PATCH_SIZE_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();

        BUILDER.push("MINECRAFT_WILD CUCUMBER");
        CUCUMBER_ENABLED_ENHANCEDFARMING = BUILDER
                .define("Enabled:", true);
        CUCUMBER_BIOME_TYPE_ENHANCEDFARMING = BUILDER
                .comment("Default: [SAVANNA]")
                .define("Biome Type:", "SAVANNA");
        CUCUMBER_FREQUENCY_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        CUCUMBER_PATCH_SIZE_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();

        BUILDER.push("MINECRAFT_WILD AUBERGINE");
        AUBERGINE_ENABLED_ENHANCEDFARMING = BUILDER
                .define("Enabled:", true);
        AUBERGINE_BIOME_TYPE_ENHANCEDFARMING = BUILDER
                .comment("Default: [SAVANNA]")
                .define("Biome Type:", "SAVANNA");
        AUBERGINE_FREQUENCY_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        AUBERGINE_PATCH_SIZE_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();

        BUILDER.push("MINECRAFT_WILD GRAPE");
        GRAPE_ENABLED_ENHANCEDFARMING = BUILDER
                .define("Enabled:", true);
        GRAPE_BIOME_TYPE_ENHANCEDFARMING = BUILDER
                .comment("Default: [SAVANNA]")
                .define("Biome Type:", "SAVANNA");
        GRAPE_FREQUENCY_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        GRAPE_PATCH_SIZE_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();

        BUILDER.push("MINECRAFT_WILD PINEPAPPLE");
        PINEPAPPLE_ENABLED_ENHANCEDFARMING = BUILDER
                .define("Enabled:", true);
        PINEPAPPLE_BIOME_TYPE_ENHANCEDFARMING = BUILDER
                .comment("Default: [SAVANNA]")
                .define("Biome Type:", "SAVANNA");
        PINEPAPPLE_FREQUENCY_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        PINEPAPPLE_PATCH_SIZE_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();

        BUILDER.push("MINECRAFT_WILD CORN");
        CORN_ENABLED_ENHANCEDFARMING = BUILDER
                .define("Enabled:", true);
        CORN_BIOME_TYPE_ENHANCEDFARMING = BUILDER
                .comment("Default: [SAVANNA]")
                .define("Biome Type:", "SAVANNA");
        CORN_FREQUENCY_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        CORN_PATCH_SIZE_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();

        BUILDER.push("MINECRAFT_WILD ONION");
        ONION_ENABLED_ENHANCEDFARMING = BUILDER
                .define("Enabled:", true);
        ONION_BIOME_TYPE_ENHANCEDFARMING = BUILDER
                .comment("Default: [SAVANNA]")
                .define("Biome Type:", "SAVANNA");
        ONION_FREQUENCY_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        ONION_PATCH_SIZE_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();

        BUILDER.push("MINECRAFT_WILD GARLIC");
        GARLIC_ENABLED_ENHANCEDFARMING = BUILDER
                .define("Enabled:", true);
        GARLIC_BIOME_TYPE_ENHANCEDFARMING = BUILDER
                .comment("Default: [PLAINS]")
                .define("Biome Type:", "PLAINS");
        GARLIC_FREQUENCY_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Frequency: ", 1);
        GARLIC_PATCH_SIZE_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Patch Size: ", 1);
        BUILDER.pop();

        BUILDER.push("MINECRAFT_WILD LETTUCE");
        LETTUCE_ENABLED_ENHANCEDFARMING = BUILDER
                .define("Enabled:", true);
        LETTUCE_BIOME_TYPE_ENHANCEDFARMING = BUILDER
                .comment("Default: [PLAINS]")
                .define("Biome Type:", "PLAINS");
        LETTUCE_FREQUENCY_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        LETTUCE_PATCH_SIZE_ENHANCEDFARMING = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();


        SPEC = BUILDER.build();
    }

}