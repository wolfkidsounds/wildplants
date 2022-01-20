package wks.wolfkidsounds.wildplants;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import wks.wolfkidsounds.wildplants.block.ImmersiveEngineeringModBlocks;
import wks.wolfkidsounds.wildplants.block.MinecraftModBlocks;
import wks.wolfkidsounds.wildplants.config.CompatConfig;
import wks.wolfkidsounds.wildplants.config.WildplantsConfig;
import wks.wolfkidsounds.wildplants.config.features.WildplantsFeaturesConfig;
import wks.wolfkidsounds.wildplants.items.ModItems;

import java.util.stream.Collectors;

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
                WildplantsConfig.SPEC, "wildplants-common.toml");

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON,
                WildplantsFeaturesConfig.SPEC, "wildplants-features-common.toml");

        ModItems.register(eventBus);

        if ((Boolean)CompatConfig.ENABLE_MINECRAFT.get()) {
            MinecraftModBlocks.register(eventBus);
        }

        if ((Boolean)CompatConfig.LOADED_IMMERSIVEENGINEERING && (Boolean)CompatConfig.ENABLE_IMMERSIVEENGINEERING.get()) {
            ImmersiveEngineeringModBlocks.register(eventBus);
        }

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        //LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);

        if ((Boolean)CompatConfig.ENABLE_MINECRAFT.get()) {
            RenderTypeLookup.setRenderLayer(MinecraftModBlocks.WILD_WHEAT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(MinecraftModBlocks.WILD_CARROTS.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(MinecraftModBlocks.WILD_POTATOES.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(MinecraftModBlocks.WILD_BEETROOTS.get(), RenderType.getCutout());
        }

        if ((Boolean)CompatConfig.LOADED_IMMERSIVEENGINEERING && (Boolean)CompatConfig.ENABLE_IMMERSIVEENGINEERING.get()) {
            RenderTypeLookup.setRenderLayer(ImmersiveEngineeringModBlocks.WILD_HEMP.get(), RenderType.getCutout());
        }
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("wildplants", "helloworld", () -> {
            LOGGER.info("Hello world from the MDK");
            return "Hello world";
        });
    }

    private void processIMC(final InterModProcessEvent event) {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m -> m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
