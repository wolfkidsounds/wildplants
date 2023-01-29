package wks.wolfkidsounds.wildplants.config;

import net.minecraftforge.common.ForgeConfigSpec;
import wks.wolfkidsounds.wildplants.Wildplants;

public class VeggieWayConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //VEGGIEWAY
    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_VEGGIEWAY_WILD_CORN;
    public static ForgeConfigSpec.BooleanValue GENERATE_VEGGIEWAY_WILD_CORN;

    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_VEGGIEWAY_WILD_LENTIL;
    public static ForgeConfigSpec.BooleanValue GENERATE_VEGGIEWAY_WILD_LENTIL;

    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_VEGGIEWAY_WILD_QUINOA;
    public static ForgeConfigSpec.BooleanValue GENERATE_VEGGIEWAY_WILD_QUINOA;

    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_VEGGIEWAY_WILD_SOYBEAN;
    public static ForgeConfigSpec.BooleanValue GENERATE_VEGGIEWAY_WILD_SOYBEAN;

    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_VEGGIEWAY_WILD_COTTON;
    public static ForgeConfigSpec.BooleanValue GENERATE_VEGGIEWAY_WILD_COTTON;

    //--------------------------------------------------------------

    static {
        Wildplants.LOGGER.debug("init-veggie_way-feature-config");
        BUILDER.push("VEGGIEWAY WILD CORN");
        GENERATE_VEGGIEWAY_WILD_CORN = BUILDER.define("Enabled:", true);
        CHANCE_VEGGIEWAY_WILD_CORN = BUILDER.comment("SMALLER=MORE - Default [64]").defineInRange("Chance:", 64, 0, Integer.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("VEGGIEWAY WILD LENTIL");
        GENERATE_VEGGIEWAY_WILD_LENTIL = BUILDER.define("Enabled:", true);
        CHANCE_VEGGIEWAY_WILD_LENTIL = BUILDER.comment("SMALLER=MORE - Default [64]").defineInRange("Chance:", 64, 0, Integer.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("VEGGIEWAY WILD QUINOA");
        GENERATE_VEGGIEWAY_WILD_QUINOA = BUILDER.define("Enabled:", true);
        CHANCE_VEGGIEWAY_WILD_QUINOA = BUILDER.comment("SMALLER=MORE - Default [64]").defineInRange("Chance:", 64, 5, Integer.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("VEGGIEWAY WILD SOYBEAN");
        GENERATE_VEGGIEWAY_WILD_SOYBEAN = BUILDER.define("Enabled:", true);
        CHANCE_VEGGIEWAY_WILD_SOYBEAN = BUILDER.comment("SMALLER=MORE - Default [64]").defineInRange("Chance:", 64, 5, Integer.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("VEGGIEWAY WILD COTTON");
        GENERATE_VEGGIEWAY_WILD_COTTON = BUILDER.define("Enabled:", true);
        CHANCE_VEGGIEWAY_WILD_COTTON = BUILDER.comment("SMALLER=MORE - Default [64]").defineInRange("Chance:", 64, 5, Integer.MAX_VALUE);
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}