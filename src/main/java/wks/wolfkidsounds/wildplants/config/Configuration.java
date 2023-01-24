package wks.wolfkidsounds.wildplants.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Configuration {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static ForgeConfigSpec.ConfigValue<Integer> GLOBAL_FREQUENCY;
    public static ForgeConfigSpec.ConfigValue<Integer> GLOBAL_SPREAD_SIZE;

    public static ForgeConfigSpec.BooleanValue ENABLE_MINECRAFT;
    public static ForgeConfigSpec.BooleanValue ENABLE_IMMERSIVEENGINEERING;
    public static ForgeConfigSpec.BooleanValue ENABLE_VEGGIEWAY;
    public static ForgeConfigSpec.BooleanValue ENABLE_HARVESTCRAFT;

    static {

        BUILDER.push("General");
        BUILDER.push("Global_Modifier");
        GLOBAL_FREQUENCY = BUILDER
                .comment("How often to try to place a patch. (higher is more) [Default: 50]")
                .define("Frequency", 50);
        GLOBAL_SPREAD_SIZE = BUILDER
                .comment("How far apart crops are planted in a patch.  (higher is more) [Default: 6]")
                .define("Size", 6);
        BUILDER.pop();
        BUILDER.push("Compat");
        ENABLE_MINECRAFT = BUILDER
                .define("Minecraft", true);
        ENABLE_IMMERSIVEENGINEERING = BUILDER
                .define("Immersive_Engineering", true);
        ENABLE_VEGGIEWAY = BUILDER
                .define("Veggie_Way", true);
        ENABLE_HARVESTCRAFT = BUILDER
                .define("Harvestcraft", true);
        BUILDER.pop();
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
