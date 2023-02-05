package wks.wolfkidsounds.wildplants;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import wks.wolfkidsounds.wildplants.config.Configuration;
import wks.wolfkidsounds.wildplants.world.WildCropGeneration;

public class CommonSetup {
    public static void init(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

            //MINECRAFT
            if (Configuration.ENABLE_MINECRAFT.get()) {
                WildCropGeneration.registerWildMinecraftCropGeneration();
                //Wildplants.LOGGER.debug("setup-minecraft");
            }

            //IMMERSIVENGINEERING
            if (Configuration.ENABLE_IMMERSIVEENGINEERING.get() && Configuration.LOADED_IMMERSIVEENGINEERING) {
                WildCropGeneration.registerWildImmersiveEngineeringCropGeneration();
                //Wildplants.LOGGER.debug("setup-immersiveengineering");
            }

            //VEGGIE_WAY
            if (Configuration.ENABLE_VEGGIE_WAY.get() && Configuration.LOADED_VEGGIE_WAY) {
                WildCropGeneration.registerWildVeggieWayCropGeneration();
                //Wildplants.LOGGER.debug("setup-veggie_way");
            }

            //ENHANCEDFARMING
            if (Configuration.ENABLE_ENHANCEDFARMING.get() && Configuration.LOADED_ENHANCEDFARMING) {
                WildCropGeneration.registerWildEnhancedFarmingCropGeneration();
                //Wildplants.LOGGER.debug("setup-enhancedfarming");
            }

            //HARVESTCRAFT
            if (Configuration.ENABLE_HARVESTCRAFT.get() && Configuration.LOADED_HARVESTCRAFT) {
                WildCropGeneration.registerWildHarvestcraftCropGeneration();
                //Wildplants.LOGGER.debug("setup-enhancedfarming");
            }
        });
    }
}
