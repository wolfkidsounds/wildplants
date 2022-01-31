package wks.wolfkidsounds.wildplants.config.features.mysticalagriculture;

import net.minecraftforge.common.ForgeConfigSpec;
import wks.wolfkidsounds.wildplants.Wildplants;
import wks.wolfkidsounds.wildplants.config.CompatConfig;

public class MysticalAgricultureConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //MYSTICALAGRICULTURE
    public static ForgeConfigSpec.BooleanValue ENABLE_MYSTICALAGRICULTURE_BASE;
    public static ForgeConfigSpec.BooleanValue ENABLE_MYSTICALAGRICULTURE_ELEMENTAL;
    public static ForgeConfigSpec.BooleanValue ENABLE_MYSTICALAGRICULTURE_MOB_PASSIVE;
    public static ForgeConfigSpec.BooleanValue ENABLE_MYSTICALAGRICULTURE_MOB;
    public static ForgeConfigSpec.BooleanValue ENABLE_MYSTICALAGRICULTURE_BLOCKS;
    public static ForgeConfigSpec.BooleanValue ENABLE_MYSTICALAGRICULTURE_OTHER;
    public static ForgeConfigSpec.BooleanValue ENABLE_MYSTICALAGRICULTURE_RESOURCES;
    public static ForgeConfigSpec.BooleanValue ENABLE_MYSTICALAGRICULTURE_METALS;

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


        BUILDER.push("BASE");
        ENABLE_MYSTICALAGRICULTURE_BASE = BUILDER
                .define("Enabled:", true);

        BUILDER.pop();

        BUILDER.push("ELEMENTS");
        ENABLE_MYSTICALAGRICULTURE_ELEMENTAL = BUILDER
                .define("Enabled:", true);

        BUILDER.pop();

        BUILDER.push("PASSIVE_MOBS");
        ENABLE_MYSTICALAGRICULTURE_MOB_PASSIVE = BUILDER
                .define("Enabled:", true);

        BUILDER.pop();

        BUILDER.push("AGGRESSIVE_MOBS");
        ENABLE_MYSTICALAGRICULTURE_MOB = BUILDER
                .define("Enabled:", true);

        BUILDER.pop();

        BUILDER.push("BLOCKS");
        ENABLE_MYSTICALAGRICULTURE_BLOCKS = BUILDER
                .define("Enabled:", true);

        BUILDER.pop();

        BUILDER.push("RESOURCES");
        ENABLE_MYSTICALAGRICULTURE_RESOURCES = BUILDER
                .define("Enabled:", true);

        BUILDER.pop();

        BUILDER.push("METALS");
        ENABLE_MYSTICALAGRICULTURE_METALS = BUILDER
                .define("Enabled:", true);

        BUILDER.pop();

        BUILDER.push("OTHER");
        ENABLE_MYSTICALAGRICULTURE_OTHER = BUILDER
                .define("Enabled:", true);

        BUILDER.pop();



        SPEC = BUILDER.build();
    }
}
