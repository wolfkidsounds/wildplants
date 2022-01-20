package wks.wolfkidsounds.wildplants.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import wks.wolfkidsounds.wildplants.Wildplants;
import wks.wolfkidsounds.wildplants.config.CompatConfig;
import wks.wolfkidsounds.wildplants.config.features.ImmersiveEngineeringConfig;
import wks.wolfkidsounds.wildplants.config.features.MinecraftConfig;
import wks.wolfkidsounds.wildplants.world.immersiveengineering.ImmersiveEngineeringWildplantsGeneration;
import wks.wolfkidsounds.wildplants.world.minecraft.MinecraftWildplantsGeneration;


@Mod.EventBusSubscriber(modid = Wildplants.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {

        if ((Boolean) CompatConfig.ENABLE_MINECRAFT.get()) {
            if ((Boolean) MinecraftConfig.WHEAT_ENABLED.get()) {MinecraftWildplantsGeneration.generateWildWheat(event);}
            if ((Boolean) MinecraftConfig.CARROTS_ENABLED.get()) {MinecraftWildplantsGeneration.generateWildCarrots(event);}
            if ((Boolean) MinecraftConfig.POTATOES_ENABLED.get()) {MinecraftWildplantsGeneration.generateWildPotatoes(event);}
            if ((Boolean) MinecraftConfig.BEETROOTS_ENABLED.get()) {MinecraftWildplantsGeneration.generateWildBeetroots(event);}
        }

        if ((Boolean)CompatConfig.LOADED_IMMERSIVEENGINEERING && (Boolean)CompatConfig.ENABLE_IMMERSIVEENGINEERING.get()) {
            if ((Boolean) ImmersiveEngineeringConfig.HEMP_ENABLED.get()) {ImmersiveEngineeringWildplantsGeneration.generateWildHemp(event);}
        }
    }
}
