package wks.wolfkidsounds.wildplants.config.features.mysticalagriculture;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.potion.Effects;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.RegistryObject;
import wks.wolfkidsounds.wildplants.Wildplants;
import wks.wolfkidsounds.wildplants.config.CompatConfig;

public class MysticalAgricultureConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //MYSTICALAGRICULTURE
    public static ForgeConfigSpec.BooleanValue ENABLE_MYSTICALAGRICULTURE_ELEMENTAL;
    public static ForgeConfigSpec.BooleanValue ENABLE_MYSTICALAGRICULTURE_MOB_PASSIVE;
    public static ForgeConfigSpec.BooleanValue ENABLE_MYSTICALAGRICULTURE_MOB;
    public static ForgeConfigSpec.BooleanValue ENABLE_MYSTICALAGRICULTURE_BLOCKS;
    public static ForgeConfigSpec.BooleanValue ENABLE_MYSTICALAGRICULTURE_OTHER;
    public static ForgeConfigSpec.BooleanValue ENABLE_MYSTICALAGRICULTURE_RESOURCES;
    public static ForgeConfigSpec.BooleanValue ENABLE_MYSTICALAGRICULTURE_METALS;
    
    //ELEMENTAL
    public static ForgeConfigSpec.ConfigValue<String> AIR_BIOME_TYPE_MYSTICALAGRICULTURE;
    public static ForgeConfigSpec.ConfigValue<Integer> AIR_FREQUENCY_MYSTICALAGRICULTURE;
    public static ForgeConfigSpec.ConfigValue<Integer> AIR_PATCH_SIZE_MYSTICALAGRICULTURE;
    public static ForgeConfigSpec.BooleanValue AIR_ENABLED_MYSTICALAGRICULTURE;

    public static ForgeConfigSpec.ConfigValue<String> EARTH_BIOME_TYPE_MYSTICALAGRICULTURE;
    public static ForgeConfigSpec.ConfigValue<Integer> EARTH_FREQUENCY_MYSTICALAGRICULTURE;
    public static ForgeConfigSpec.ConfigValue<Integer> EARTH_PATCH_SIZE_MYSTICALAGRICULTURE;
    public static ForgeConfigSpec.BooleanValue EARTH_ENABLED_MYSTICALAGRICULTURE;

    public static ForgeConfigSpec.ConfigValue<String> WATER_BIOME_TYPE_MYSTICALAGRICULTURE;
    public static ForgeConfigSpec.ConfigValue<Integer> WATER_FREQUENCY_MYSTICALAGRICULTURE;
    public static ForgeConfigSpec.ConfigValue<Integer> WATER_PATCH_SIZE_MYSTICALAGRICULTURE;
    public static ForgeConfigSpec.BooleanValue WATER_ENABLED_MYSTICALAGRICULTURE;

    public static ForgeConfigSpec.ConfigValue<String> FIRE_BIOME_TYPE_MYSTICALAGRICULTURE;
    public static ForgeConfigSpec.ConfigValue<Integer> FIRE_FREQUENCY_MYSTICALAGRICULTURE;
    public static ForgeConfigSpec.ConfigValue<Integer> FIRE_PATCH_SIZE_MYSTICALAGRICULTURE;
    public static ForgeConfigSpec.BooleanValue FIRE_ENABLED_MYSTICALAGRICULTURE;

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

        BUILDER.push("ELEMENTS");
        ENABLE_MYSTICALAGRICULTURE_ELEMENTAL = BUILDER
                .define("Enabled:", false);
        BUILDER.push("WILD AIR");
        AIR_ENABLED_MYSTICALAGRICULTURE = BUILDER
                .define("Enabled:", true);
        AIR_BIOME_TYPE_MYSTICALAGRICULTURE = BUILDER
                .comment("Default: [SAVANNA]")
                .define("Biome Type:", "SAVANNA");
        AIR_FREQUENCY_MYSTICALAGRICULTURE = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        AIR_PATCH_SIZE_MYSTICALAGRICULTURE = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();
        BUILDER.push("WILD EARTH");
        EARTH_ENABLED_MYSTICALAGRICULTURE = BUILDER
                .define("Enabled:", true);
        EARTH_BIOME_TYPE_MYSTICALAGRICULTURE = BUILDER
                .comment("Default: [SAVANNA]")
                .define("Biome Type:", "SAVANNA");
        EARTH_FREQUENCY_MYSTICALAGRICULTURE = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        EARTH_PATCH_SIZE_MYSTICALAGRICULTURE = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();
        BUILDER.push("WILD WATER");
        WATER_ENABLED_MYSTICALAGRICULTURE = BUILDER
                .define("Enabled:", true);
        WATER_BIOME_TYPE_MYSTICALAGRICULTURE = BUILDER
                .comment("Default: [SAVANNA]")
                .define("Biome Type:", "SAVANNA");
        WATER_FREQUENCY_MYSTICALAGRICULTURE = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        WATER_PATCH_SIZE_MYSTICALAGRICULTURE = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();
        BUILDER.push("WILD FIRE");
        FIRE_ENABLED_MYSTICALAGRICULTURE = BUILDER
                .define("Enabled:", true);
        FIRE_BIOME_TYPE_MYSTICALAGRICULTURE = BUILDER
                .comment("Default: [SAVANNA]")
                .define("Biome Type:", "SAVANNA");
        FIRE_FREQUENCY_MYSTICALAGRICULTURE = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        FIRE_PATCH_SIZE_MYSTICALAGRICULTURE = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();
        BUILDER.pop();

        BUILDER.push("PASSIVE_MOBS");
        ENABLE_MYSTICALAGRICULTURE_MOB_PASSIVE = BUILDER
                .define("Enabled:", false);

        BUILDER.pop();

        BUILDER.push("AGGRESSIVE_MOBS");
        ENABLE_MYSTICALAGRICULTURE_MOB = BUILDER
                .define("Enabled:", false);

        BUILDER.pop();

        BUILDER.push("BLOCKS");
        ENABLE_MYSTICALAGRICULTURE_BLOCKS = BUILDER
                .define("Enabled:", false);

        BUILDER.pop();

        BUILDER.push("RESOURCES");
        ENABLE_MYSTICALAGRICULTURE_RESOURCES = BUILDER
                .define("Enabled:", false);

        BUILDER.pop();

        BUILDER.push("METALS");
        ENABLE_MYSTICALAGRICULTURE_METALS = BUILDER
                .define("Enabled:", false);

        BUILDER.pop();

        BUILDER.push("OTHER");
        ENABLE_MYSTICALAGRICULTURE_OTHER = BUILDER
                .define("Enabled:", false);

        BUILDER.pop();



        SPEC = BUILDER.build();
    }
}
