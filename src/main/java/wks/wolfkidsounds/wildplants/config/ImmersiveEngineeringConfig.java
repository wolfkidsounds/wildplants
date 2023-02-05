package wks.wolfkidsounds.wildplants.config;


import net.minecraftforge.common.ForgeConfigSpec;
import wks.wolfkidsounds.wildplants.Wildplants;

public class ImmersiveEngineeringConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //IMMERSIVEENGINEERING
    public static ForgeConfigSpec.ConfigValue<Integer> CHANCE_IMMERSIVEENGINEERING_WILD_HEMP;
    public static ForgeConfigSpec.BooleanValue GENERATE_IMMERSIVEENGINEERING_WILD_HEMP;

    static {
        Wildplants.LOGGER.debug("init-immersiveengineering-feature-config");
        BUILDER.push("IMMERSIVEENGINEERING WILD HEMP");
        GENERATE_IMMERSIVEENGINEERING_WILD_HEMP = BUILDER.define("Enabled:", true);
        CHANCE_IMMERSIVEENGINEERING_WILD_HEMP = BUILDER.comment("SMALLER=MORE - Default [64]").defineInRange("Chance:", 265, 0, Integer.MAX_VALUE);
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
