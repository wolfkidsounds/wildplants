package wks.wolfkidsounds.wildplants.config.features;

import net.minecraftforge.common.ForgeConfigSpec;
import wks.wolfkidsounds.wildplants.Wildplants;

public class HarvestcraftConfig {

    //HARVESTCRAFT
    public static ForgeConfigSpec.BooleanValue AGAVE_ENABLED;
    public static ForgeConfigSpec.ConfigValue<String> AGAVE_BIOME_TYPE;
    public static ForgeConfigSpec.ConfigValue<Integer> AGAVE_FREQUENCY;
    public static ForgeConfigSpec.ConfigValue<Integer> AGAVE_PATCH_SIZE;

    public static void init(ForgeConfigSpec.Builder BUILDER) {
        Wildplants.LOGGER.debug("init-harvestcraft-feature-config");

        BUILDER.comment(
                "Valid Biome Types:\n" +
                        "Temperature: [HOT, COLD] \n" +
                        "Vegetation: [SPARSE, DENSE] \n" +
                        "Humidity: [WET, DRY] \n" +
                        "Tree Types: [SAVANNA, CONIFEROUS, JUNGLE] \n" +
                        "Attributes: [SPOOKY, DEAD, LUSH, MUSHROOM, MAGICAL, RARE, PLATEAU, MODIFIED, OCEAN, RIVER, WATER] \n" +
                        "Generic Types: [MESA, FOREST, PLAINS, MOUNTAIN, HILLS, SWAMP, SANDY, SNOWY, WASTELAND, BEACH, VOID]");

        BUILDER.push("Pams Harvestcraft 2");

        BUILDER.push("WILD AGAVE");
        AGAVE_ENABLED = BUILDER
                .define("Enabled:", true);
        AGAVE_BIOME_TYPE = BUILDER
                .comment("[Default: PLAINS]")
                .define("Biome Type:", "PLAINS");
        AGAVE_FREQUENCY = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        AGAVE_PATCH_SIZE = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();
    }
}
