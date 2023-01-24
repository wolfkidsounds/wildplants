package wks.wolfkidsounds.wildplants.config.features;

import net.minecraftforge.common.ForgeConfigSpec;

public class MinecraftConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //MINECRAFT
    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_MINECRAFT_WILD_WHEAT;
    public static ForgeConfigSpec.BooleanValue GENERATE_MINECRAFT_WILD_WHEAT;

    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_MINECRAFT_WILD_CARROTS;
    public static ForgeConfigSpec.BooleanValue GENERATE_MINECRAFT_WILD_CARROTS;

    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_MINECRAFT_WILD_POTATOES;
    public static ForgeConfigSpec.BooleanValue GENERATE_MINECRAFT_WILD_POTATOES;

    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_MINECRAFT_WILD_BEETROOTS;
    public static ForgeConfigSpec.BooleanValue GENERATE_MINECRAFT_WILD_BEETROOTS;

    static {
        BUILDER.push("MINECRAFT_WILD WHEAT");
        GENERATE_MINECRAFT_WILD_WHEAT = BUILDER
                .define("Enabled:", true);
        CHANCE_MINECRAFT_WILD_WHEAT = BUILDER
                .comment("Default [30]")
                .defineInRange("Chance:", 30, 0, Integer.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("MINECRAFT_WILD CARROTS");
        GENERATE_MINECRAFT_WILD_CARROTS = BUILDER
                .define("Enabled:", true);
        CHANCE_MINECRAFT_WILD_CARROTS = BUILDER
                .comment("Default [30]")
                .defineInRange("Chance:", 30, 0, Integer.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("MINECRAFT_WILD POTATOES");
        GENERATE_MINECRAFT_WILD_POTATOES = BUILDER
                .define("Enabled:", true);
        CHANCE_MINECRAFT_WILD_POTATOES = BUILDER
                .comment("Default [30]")
                .defineInRange("Chance:", 30, 5, Integer.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("MINECRAFT_WILD BEETROOTS");
        GENERATE_MINECRAFT_WILD_BEETROOTS = BUILDER
                .define("Enabled:", true);
        CHANCE_MINECRAFT_WILD_BEETROOTS = BUILDER
                .comment("Default [30]")
                .defineInRange("Chance:", 30, 5, Integer.MAX_VALUE);
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
