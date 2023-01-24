package wks.wolfkidsounds.wildplants;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import wks.wolfkidsounds.wildplants.config.Configuration;
import wks.wolfkidsounds.wildplants.config.features.MinecraftConfig;
import wks.wolfkidsounds.wildplants.registry.ModBiomeFeatures;
import wks.wolfkidsounds.wildplants.registry.ModBlocks;
import wks.wolfkidsounds.wildplants.registry.ModItems;
import wks.wolfkidsounds.wildplants.registry.ModPlacementModifiers;
import wks.wolfkidsounds.wildplants.world.RenderSetup;

@Mod(Wildplants.MOD_ID)
public class Wildplants {
    public static final String MOD_ID = "wildplants";

    public Wildplants() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(CommonSetup::init);
        modEventBus.addListener(RenderSetup::init);

        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, Configuration.SPEC, "wildplants/wildplants-common.toml");
        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.CLIENT, MinecraftConfig.SPEC, "wildplants/mods/minecraft.toml");

        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModBiomeFeatures.FEATURES.register(modEventBus);
        ModPlacementModifiers.PLACEMENT_MODIFIERS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
