package wks.wolfkidsounds.wildplants.config;

import net.minecraftforge.common.ForgeConfigSpec;
import wks.wolfkidsounds.wildplants.Wildplants;

public class EnhancedFarmingConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //ENHANCEDFARMING
    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_ENHANCEDFARMING_WILD_MINT;
    public static ForgeConfigSpec.BooleanValue GENERATE_ENHANCEDFARMING_WILD_MINT;

    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_ENHANCEDFARMING_WILD_TOMATO;
    public static ForgeConfigSpec.BooleanValue GENERATE_ENHANCEDFARMING_WILD_TOMATO;

    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_ENHANCEDFARMING_WILD_CUCUMBER;
    public static ForgeConfigSpec.BooleanValue GENERATE_ENHANCEDFARMING_WILD_CUCUMBER;

    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_ENHANCEDFARMING_WILD_AUBERGINE;
    public static ForgeConfigSpec.BooleanValue GENERATE_ENHANCEDFARMING_WILD_AUBERGINE;

    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_ENHANCEDFARMING_WILD_GRAPE;
    public static ForgeConfigSpec.BooleanValue GENERATE_ENHANCEDFARMING_WILD_GRAPE;

    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_ENHANCEDFARMING_WILD_PINEAPPLE;
    public static ForgeConfigSpec.BooleanValue GENERATE_ENHANCEDFARMING_WILD_PINEAPPLE;

    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_ENHANCEDFARMING_WILD_CORN;
    public static ForgeConfigSpec.BooleanValue GENERATE_ENHANCEDFARMING_WILD_CORN;

    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_ENHANCEDFARMING_WILD_ONION;
    public static ForgeConfigSpec.BooleanValue GENERATE_ENHANCEDFARMING_WILD_ONION;

    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_ENHANCEDFARMING_WILD_GARLIC;
    public static ForgeConfigSpec.BooleanValue GENERATE_ENHANCEDFARMING_WILD_GARLIC;

    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_ENHANCEDFARMING_WILD_LETTUCE;
    public static ForgeConfigSpec.BooleanValue GENERATE_ENHANCEDFARMING_WILD_LETTUCE;

    static {
        Wildplants.LOGGER.debug("init-enhancedfarming-feature-config");

        BUILDER.push("ENHANCEDFARMING WILD MINT");
        GENERATE_ENHANCEDFARMING_WILD_MINT = BUILDER.define("Enabled:", true);
        CHANCE_ENHANCEDFARMING_WILD_MINT = BUILDER.comment("SMALLER=MORE - Default [64]").defineInRange("Chance:", 265, 0, Integer.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("ENHANCEDFARMING WILD TOMATO");
        GENERATE_ENHANCEDFARMING_WILD_TOMATO = BUILDER.define("Enabled:", true);
        CHANCE_ENHANCEDFARMING_WILD_TOMATO = BUILDER.comment("SMALLER=MORE - Default [64]").defineInRange("Chance:", 265, 0, Integer.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("ENHANCEDFARMING WILD CUCUMBER");
        GENERATE_ENHANCEDFARMING_WILD_CUCUMBER = BUILDER.define("Enabled:", true);
        CHANCE_ENHANCEDFARMING_WILD_CUCUMBER = BUILDER.comment("SMALLER=MORE - Default [64]").defineInRange("Chance:", 265, 0, Integer.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("ENHANCEDFARMING WILD AUBERGINE");
        GENERATE_ENHANCEDFARMING_WILD_AUBERGINE = BUILDER.define("Enabled:", true);
        CHANCE_ENHANCEDFARMING_WILD_AUBERGINE = BUILDER.comment("SMALLER=MORE - Default [64]").defineInRange("Chance:", 265, 0, Integer.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("ENHANCEDFARMING WILD GRAPE");
        GENERATE_ENHANCEDFARMING_WILD_GRAPE = BUILDER.define("Enabled:", true);
        CHANCE_ENHANCEDFARMING_WILD_GRAPE = BUILDER.comment("SMALLER=MORE - Default [64]").defineInRange("Chance:", 265, 0, Integer.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("ENHANCEDFARMING WILD PINEAPPLE");
        GENERATE_ENHANCEDFARMING_WILD_PINEAPPLE = BUILDER.define("Enabled:", true);
        CHANCE_ENHANCEDFARMING_WILD_PINEAPPLE = BUILDER.comment("SMALLER=MORE - Default [64]").defineInRange("Chance:", 265, 0, Integer.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("ENHANCEDFARMING WILD CORN");
        GENERATE_ENHANCEDFARMING_WILD_CORN = BUILDER.define("Enabled:", true);
        CHANCE_ENHANCEDFARMING_WILD_CORN = BUILDER.comment("SMALLER=MORE - Default [64]").defineInRange("Chance:", 265, 0, Integer.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("ENHANCEDFARMING WILD ONION");
        GENERATE_ENHANCEDFARMING_WILD_ONION = BUILDER.define("Enabled:", true);
        CHANCE_ENHANCEDFARMING_WILD_ONION = BUILDER.comment("SMALLER=MORE - Default [64]").defineInRange("Chance:", 265, 0, Integer.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("ENHANCEDFARMING WILD GARLIC");
        GENERATE_ENHANCEDFARMING_WILD_GARLIC = BUILDER.define("Enabled:", true);
        CHANCE_ENHANCEDFARMING_WILD_GARLIC = BUILDER.comment("SMALLER=MORE - Default [64]").define("Patch Size: ", 1);
        BUILDER.pop();

        BUILDER.push("ENHANCEDFARMING WILD LETTUCE");
        GENERATE_ENHANCEDFARMING_WILD_LETTUCE = BUILDER.define("Enabled:", true);
        CHANCE_ENHANCEDFARMING_WILD_LETTUCE = BUILDER.comment("SMALLER=MORE - Default [64]").defineInRange("Chance:", 265, 0, Integer.MAX_VALUE);
        BUILDER.pop();


        SPEC = BUILDER.build();
    }

}