package wks.wolfkidsounds.wildplants;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.*;
import wks.wolfkidsounds.wildplants.item.ModItems;
import wks.wolfkidsounds.wildplants.registry.ModBiomeFeatures;
import wks.wolfkidsounds.wildplants.registry.ModPlacementModifiers;

import javax.annotation.Nonnull;

@Mod(Wildplants.MOD_ID)
public class Wildplants {
    public static final String MOD_ID = "wildplants";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final CreativeModeTab CREATIVE_MODE_TAB = new CreativeModeTab("wildplants_creative_tab") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blocks.GRASS);
        }
    };

    public Wildplants() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(CommonSetup::init);
        modEventBus.addListener(ClientSetup::init);
        LOGGER.debug("register-eventbus");

        //Configurations
        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, Configuration.SPEC, "wildplants/wildplants-common.toml");

        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, MinecraftConfig.SPEC, "wildplants/mods/minecraft.toml");
        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, ImmersiveEngineeringConfig.SPEC, "wildplants/mods/immersiveengineering.toml");
        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, VeggieWayConfig.SPEC, "wildplants/mods/veggieway.toml");
        //ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, EnhancedFarmingConfig.SPEC, "wildplants/mods/enhancedfarming.toml");
        //ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, HarvestcraftConfig.SPEC, "wildplants/mods/harvestcraft.toml");
        LOGGER.debug("register-config");

        //Registry
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModBiomeFeatures.FEATURES.register(modEventBus);
        ModPlacementModifiers.PLACEMENT_MODIFIERS.register(modEventBus);
        LOGGER.debug("register-ModObjects");

        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.debug("register-eventbus");
    }
}
