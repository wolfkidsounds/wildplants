package wks.wolfkidsounds.wildplants;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import wks.wolfkidsounds.wildplants.config.Configuration;
import wks.wolfkidsounds.wildplants.world.WildCropGeneration;

public class CommonSetup {
    public static void init(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            if (Configuration.ENABLE_MINECRAFT.get()) {WildCropGeneration.registerWildMinecraftCropGeneration();}
        });
    }
}
