package wks.wolfkidsounds.wildplants.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import wks.wolfkidsounds.wildplants.Wildplants;
import wks.wolfkidsounds.wildplants.config.CompatConfig;
import wks.wolfkidsounds.wildplants.config.features.ImmersiveEngineeringConfig;
import wks.wolfkidsounds.wildplants.config.features.MinecraftConfig;
import wks.wolfkidsounds.wildplants.config.features.VeggiewayConfig;
import wks.wolfkidsounds.wildplants.world.immersiveengineering.ImmersiveEngineeringWildplantsGeneration;
import wks.wolfkidsounds.wildplants.world.minecraft.MinecraftWildplantsGeneration;
import wks.wolfkidsounds.wildplants.world.veggieway.VeggiewayWildplantsGeneration;


@Mod.EventBusSubscriber(modid = Wildplants.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {

        if (CompatConfig.ENABLE_MINECRAFT.get()) {
            if (MinecraftConfig.WHEAT_ENABLED_MINECRAFT.get()) { MinecraftWildplantsGeneration.generateWildWheat(event); }
            if (MinecraftConfig.CARROTS_ENABLED_MINECRAFT.get()) { MinecraftWildplantsGeneration.generateWildCarrots(event); }
            if (MinecraftConfig.POTATOES_ENABLED_MINECRAFT.get()) { MinecraftWildplantsGeneration.generateWildPotatoes(event); }
            if (MinecraftConfig.BEETROOTS_ENABLED_MINECRAFT.get()) { MinecraftWildplantsGeneration.generateWildBeetroots(event); }
        }

        if (CompatConfig.LOADED_IMMERSIVEENGINEERING && CompatConfig.ENABLE_IMMERSIVEENGINEERING.get()) {
            if (ImmersiveEngineeringConfig.HEMP_ENABLED_IMMERSIVEENINEERING.get()) { ImmersiveEngineeringWildplantsGeneration.generateWildHemp(event); }
        }

        if (CompatConfig.LOADED_VEGGIEWAY && CompatConfig.ENABLE_VEGGIEWAY.get()) {
            if (VeggiewayConfig.CORN_ENABLED_VEGGIEWAY.get()) { VeggiewayWildplantsGeneration.generateWildCorn(event); }
            if (VeggiewayConfig.LENTIL_ENABLED_VEGGIEWAY.get()) { VeggiewayWildplantsGeneration.generateWildLentil(event); }
            if (VeggiewayConfig.QUINOA_ENABLED_VEGGIEWAY.get()) { VeggiewayWildplantsGeneration.generateWildQuinoa(event); }
            if (VeggiewayConfig.SOYBEAN_ENABLED_VEGGIEWAY.get()) { VeggiewayWildplantsGeneration.generateWildSoybean(event); }
            if (VeggiewayConfig.COTTON_ENABLED_VEGGIEWAY.get()) { VeggiewayWildplantsGeneration.generateWildCotton(event); }
        }
    }
}
