package wks.wolfkidsounds.wildplants;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import wks.wolfkidsounds.wildplants.block.ModBlocks;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.harvestcraft.HarvestcraftConfig;
import wks.wolfkidsounds.wildplants.config.features.immersiveengineering.ImmersiveEngineeringConfig;
import wks.wolfkidsounds.wildplants.config.features.minecraft.MinecraftConfig;
import wks.wolfkidsounds.wildplants.config.features.mysticalagriculture.MysticalAgricultureConfig;
import wks.wolfkidsounds.wildplants.config.features.veggieway.VeggiewayConfig;
import wks.wolfkidsounds.wildplants.items.ModItems;
import wks.wolfkidsounds.wildplants.render.ModRenderers;
import wks.wolfkidsounds.wildplants.utils.FileUtils;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("wildplants")
public class Wildplants {

    public static final String MOD_ID = "wildplants";
    public static final Logger LOGGER = LogManager.getLogger(Wildplants.class);
    public static final ItemGroup ITEM_GROUP = new ItemGroup("tab_wild_plants") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.TALL_GRASS);
        }
    };

    public Wildplants() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        FileUtils.createFolders();
        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, WildplantsConfig.SPEC, "wildplants/wildplants-common.toml");
        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, MinecraftConfig.SPEC, "wildplants/features/minecraft-common.toml");
        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, ImmersiveEngineeringConfig.SPEC, "wildplants/features/immersiveengineering-common.toml");
        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, HarvestcraftConfig.SPEC, "wildplants/features/harvestcraft2-common.toml");
        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, VeggiewayConfig.SPEC, "wildplants/features/veggieway-common.toml");
        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, MysticalAgricultureConfig.SPEC, "wildplants/features/mysticalagriculture-common.toml");

        ModBlocks.register(eventBus);
        ModItems.register(eventBus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        ModRenderers.registerBlockCutout();
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
    }
}
