package wks.wolfkidsounds.wildplants.config.features;

import net.minecraftforge.common.ForgeConfigSpec;
import wks.wolfkidsounds.wildplants.Wildplants;
import wks.wolfkidsounds.wildplants.config.CompatConfig;


public final class WildplantsFeaturesConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        Wildplants.LOGGER.debug("init-feature-config");

        BUILDER.push("Features");

        if ((Boolean) CompatConfig.ENABLE_MINECRAFT.get()) {
            BUILDER.push("Minecraft");
            MinecraftConfig.init(BUILDER);
            BUILDER.pop();
        }

        if ((Boolean)CompatConfig.LOADED_IMMERSIVEENGINEERING && (Boolean)CompatConfig.ENABLE_IMMERSIVEENGINEERING.get()) {
            BUILDER.push("Immersive Engineering");
            ImmersiveEngineeringConfig.init(BUILDER);
            BUILDER.pop();
        }

        if ((Boolean)CompatConfig.LOADED_HARVESTCRAFT && (Boolean)CompatConfig.ENABLE_HARVESTCRAFT.get()) {
            BUILDER.push("Harvestcraft");
            HarvestcraftConfig.init(BUILDER);
            BUILDER.pop();
        }

        if ((Boolean)CompatConfig.LOADED_FARMERSDELIGHT && (Boolean)CompatConfig.ENABLE_FARMERSDELIGHT.get()) {
            BUILDER.push("Farmers Delight");
            FarmersDelightConfig.init(BUILDER);
            BUILDER.pop();
        }

        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
