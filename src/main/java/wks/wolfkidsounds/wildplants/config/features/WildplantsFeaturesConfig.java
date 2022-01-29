package wks.wolfkidsounds.wildplants.config.features;

import net.minecraftforge.common.ForgeConfigSpec;
import wks.wolfkidsounds.wildplants.Wildplants;
import wks.wolfkidsounds.wildplants.config.CompatConfig;


public final class WildplantsFeaturesConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        Wildplants.LOGGER.debug("init-feature-config");
        BUILDER.comment(
                "Valid Biome Types:\n" +
                        "Temperature: [HOT, COLD] \n" +
                        "Vegetation: [SPARSE, DENSE] \n" +
                        "Humidity: [WET, DRY] \n" +
                        "Tree Types: [SAVANNA, CONIFEROUS, JUNGLE] \n" +
                        "Attributes: [SPOOKY, DEAD, LUSH, MUSHROOM, MAGICAL, RARE, PLATEAU, MODIFIED, OCEAN, RIVER, WATER] \n" +
                        "Generic Types: [MESA, FOREST, PLAINS, MOUNTAIN, HILLS, SWAMP, SANDY, SNOWY, WASTELAND, BEACH, VOID] \n" +
                        "Use: [OVERWORLD] to generate in all biomes");

        if (CompatConfig.ENABLE_MINECRAFT.get()) {
            BUILDER.push("Minecraft");
            MinecraftConfig.init(BUILDER);
            BUILDER.pop();
        }

        if (CompatConfig.LOADED_IMMERSIVEENGINEERING && CompatConfig.ENABLE_IMMERSIVEENGINEERING.get()) {
            BUILDER.push("Immersive_Engineering");
            ImmersiveEngineeringConfig.init(BUILDER);
            BUILDER.pop();
        }

        if (CompatConfig.LOADED_HARVESTCRAFT && CompatConfig.ENABLE_HARVESTCRAFT.get()) {
            BUILDER.push("Harvestcraft");
            HarvestcraftConfig.init(BUILDER);
            BUILDER.pop();
        }

        if (CompatConfig.LOADED_VEGGIEWAY && CompatConfig.ENABLE_VEGGIEWAY.get()) {
            BUILDER.push("Veggie_Way");
            VeggiewayConfig.init(BUILDER);
            BUILDER.pop();
        }

        SPEC = BUILDER.build();
    }
}
