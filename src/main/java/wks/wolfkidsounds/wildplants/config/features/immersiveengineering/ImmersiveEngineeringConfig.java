package wks.wolfkidsounds.wildplants.config.features.immersiveengineering;

import net.minecraftforge.common.ForgeConfigSpec;
import wks.wolfkidsounds.wildplants.Wildplants;

public class ImmersiveEngineeringConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //IMMERSIVE ENGINEERING
    public static ForgeConfigSpec.ConfigValue<String> HEMP_BIOME_TYPE_IMMERSIVEENINEERING;
    public static ForgeConfigSpec.ConfigValue<Integer> HEMP_FREQUENCY_IMMERSIVEENINEERING;
    public static ForgeConfigSpec.ConfigValue<Integer> HEMP_PATCH_SIZE_IMMERSIVEENINEERING;
    public static ForgeConfigSpec.BooleanValue HEMP_ENABLED_IMMERSIVEENINEERING;

    static {
        Wildplants.LOGGER.debug("init-immersiveengineering-feature-config");
        BUILDER.comment(
                "Valid Biome Types:\n" +
                        "Temperature: [HOT, COLD] \n" +
                        "Vegetation: [SPARSE, DENSE] \n" +
                        "Humidity: [WET, DRY] \n" +
                        "Tree Types: [SAVANNA, CONIFEROUS, JUNGLE] \n" +
                        "Attributes: [SPOOKY, DEAD, LUSH, MUSHROOM, MAGICAL, RARE, PLATEAU, MODIFIED, OCEAN, RIVER, WATER] \n" +
                        "Generic Types: [MESA, FOREST, PLAINS, MOUNTAIN, HILLS, SWAMP, SANDY, SNOWY, WASTELAND, BEACH, VOID] \n" +
                        "Use: [OVERWORLD] to generate in all biomes");

        BUILDER.push("WILD HEMP");
        HEMP_ENABLED_IMMERSIVEENINEERING = BUILDER
                .define("Enabled:", true);
        HEMP_BIOME_TYPE_IMMERSIVEENINEERING = BUILDER
                .comment("Default: [OVERWORLD]")
                .define("Biome Type:", "OVERWORLD");
        HEMP_FREQUENCY_IMMERSIVEENINEERING = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        HEMP_PATCH_SIZE_IMMERSIVEENINEERING = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}