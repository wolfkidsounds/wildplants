package wks.wolfkidsounds.wildplants.config.features;

import net.minecraftforge.common.ForgeConfigSpec;
import wks.wolfkidsounds.wildplants.Wildplants;

public class VeggiewayConfig {

    //VEGGIEWAY
    public static ForgeConfigSpec.ConfigValue<String> CORN_BIOME_TYPE_VEGGIEWAY;
    public static ForgeConfigSpec.ConfigValue<Integer> CORN_FREQUENCY_VEGGIEWAY;
    public static ForgeConfigSpec.ConfigValue<Integer> CORN_PATCH_SIZE_VEGGIEWAY;
    public static ForgeConfigSpec.BooleanValue CORN_ENABLED_VEGGIEWAY;

    public static ForgeConfigSpec.ConfigValue<String> LENTIL_BIOME_TYPE_VEGGIEWAY;
    public static ForgeConfigSpec.ConfigValue<Integer> LENTIL_FREQUENCY_VEGGIEWAY;
    public static ForgeConfigSpec.ConfigValue<Integer> LENTIL_PATCH_SIZE_VEGGIEWAY;
    public static ForgeConfigSpec.BooleanValue LENTIL_ENABLED_VEGGIEWAY;

    public static ForgeConfigSpec.ConfigValue<String> QUINOA_BIOME_TYPE_VEGGIEWAY;
    public static ForgeConfigSpec.ConfigValue<Integer> QUINOA_FREQUENCY_VEGGIEWAY;
    public static ForgeConfigSpec.ConfigValue<Integer> QUINOA_PATCH_SIZE_VEGGIEWAY;
    public static ForgeConfigSpec.BooleanValue QUINOA_ENABLED_VEGGIEWAY;

    public static ForgeConfigSpec.ConfigValue<String> SOYBEAN_BIOME_TYPE_VEGGIEWAY;
    public static ForgeConfigSpec.ConfigValue<Integer> SOYBEAN_FREQUENCY_VEGGIEWAY;
    public static ForgeConfigSpec.ConfigValue<Integer> SOYBEAN_PATCH_SIZE_VEGGIEWAY;
    public static ForgeConfigSpec.BooleanValue SOYBEAN_ENABLED_VEGGIEWAY;

    //--------------------------------------------------------------

    public static void init(ForgeConfigSpec.Builder BUILDER) {
        Wildplants.LOGGER.debug("init-minecraft-feature-config");

        BUILDER.push("WILD CORN");
        CORN_ENABLED_VEGGIEWAY = BUILDER
                .define("Enabled:", true);
        CORN_BIOME_TYPE_VEGGIEWAY = BUILDER
                .comment("Default: [SAVANNA]")
                .define("Biome Type:", "SAVANNA");
        CORN_FREQUENCY_VEGGIEWAY = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        CORN_PATCH_SIZE_VEGGIEWAY = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();

        BUILDER.push("WILD LENTIL");
        LENTIL_ENABLED_VEGGIEWAY = BUILDER
                .define("Enabled:", true);
        LENTIL_BIOME_TYPE_VEGGIEWAY = BUILDER
                .comment("Default: [MESA]")
                .define("Biome Type:", "MESA");
        LENTIL_FREQUENCY_VEGGIEWAY = BUILDER
                .comment("Default [1]")
                .define("Frequency: ", 1);
        LENTIL_PATCH_SIZE_VEGGIEWAY = BUILDER
                .comment("Default [1]")
                .define("Patch Size: ", 1);
        BUILDER.pop();

        BUILDER.push("WILD QUINOA");
        QUINOA_ENABLED_VEGGIEWAY = BUILDER
                .define("Enabled:", true);
        QUINOA_BIOME_TYPE_VEGGIEWAY = BUILDER
                .comment("Default: [COLD]")
                .define("Biome Type:", "COLD");
        QUINOA_FREQUENCY_VEGGIEWAY = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        QUINOA_PATCH_SIZE_VEGGIEWAY = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();

        BUILDER.push("WILD SOYBEAN");
        SOYBEAN_ENABLED_VEGGIEWAY = BUILDER
                .define("Enabled:", true);
        SOYBEAN_BIOME_TYPE_VEGGIEWAY = BUILDER
                .comment("Default: [WATER]")
                .define("Biome Type:", "WATER");
        SOYBEAN_FREQUENCY_VEGGIEWAY = BUILDER
                .comment("Default [1]")
                .define("Frequency:", 1);
        SOYBEAN_PATCH_SIZE_VEGGIEWAY = BUILDER
                .comment("Default [1]")
                .define("Patch Size:", 1);
        BUILDER.pop();
    }
}
