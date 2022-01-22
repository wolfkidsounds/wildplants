package wks.wolfkidsounds.wildplants;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import wks.wolfkidsounds.wildplants.block.HarvestcraftModBlocks;
import wks.wolfkidsounds.wildplants.block.ImmersiveEngineeringModBlocks;
import wks.wolfkidsounds.wildplants.block.MinecraftModBlocks;
import wks.wolfkidsounds.wildplants.config.CompatConfig;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.WildplantsFeaturesConfig;
import wks.wolfkidsounds.wildplants.items.ModItems;
import wks.wolfkidsounds.wildplants.render.ModRenderers;

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
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON,
                WildplantsConfig.SPEC, "./wildplants/wildplants-common.toml");

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON,
                WildplantsFeaturesConfig.SPEC, "./wildplants/wildplants-features-common.toml");

        ModItems.register(eventBus);

        if ((Boolean)CompatConfig.ENABLE_MINECRAFT.get()) {
            MinecraftModBlocks.register(eventBus);
        }

        if ((Boolean)CompatConfig.LOADED_IMMERSIVEENGINEERING && (Boolean)CompatConfig.ENABLE_IMMERSIVEENGINEERING.get()) {
            ImmersiveEngineeringModBlocks.register(eventBus);
        }

        if ((Boolean)CompatConfig.LOADED_HARVESTCRAFT && (Boolean)CompatConfig.ENABLE_HARVESTCRAFT.get()) {
            HarvestcraftModBlocks.register(eventBus);
        }

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        //LOGGER.info("HELLO FROM PREINIT");
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);

        ModRenderers.registerBlocks();
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
    }
}
