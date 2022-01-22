package wks.wolfkidsounds.wildplants;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
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
import wks.wolfkidsounds.wildplants.config.features.WildplantsFeaturesConfig;
import wks.wolfkidsounds.wildplants.utils.FileUtils;
import wks.wolfkidsounds.wildplants.items.ModItems;
import wks.wolfkidsounds.wildplants.render.ModRenderers;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("wildplants")
public class Wildplants {

    public static final String MOD_ID = "wildplants";
    public static final Logger LOGGER = LogManager.getLogger(Wildplants.class);
    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab("tab_wild_plants") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blocks.TALL_GRASS);
        }
    };

    public Wildplants() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        FileUtils.createFolders();

        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, WildplantsConfig.SPEC, "wildplants/wildplants-common.toml");
        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.CLIENT, WildplantsFeaturesConfig.SPEC, "wildplants/settings-common.toml");

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
}
