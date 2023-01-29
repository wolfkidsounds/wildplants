package wks.wolfkidsounds.wildplants;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import wks.wolfkidsounds.wildplants.config.Configuration;
import wks.wolfkidsounds.wildplants.world.WildCropGeneration;

public class CommonSetup {
    public static void init(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            if (Configuration.ENABLE_MINECRAFT.get()) {
                WildCropGeneration.registerWildMinecraftCropGeneration();
                Wildplants.LOGGER.debug("setup-minecraft");
            }
            if (Configuration.ENABLE_IMMERSIVEENGINEERING.get() && Configuration.LOADED_IMMERSIVEENGINEERING) {
                WildCropGeneration.registerWildImmersiveEngineeringCropGeneration();
                Wildplants.LOGGER.debug("setup-immersiveengineering");
            }
        });
    }
}
