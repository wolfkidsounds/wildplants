package wks.wolfkidsounds.wildplants.block;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import wks.wolfkidsounds.wildplants.Wildplants;
import wks.wolfkidsounds.wildplants.config.Configuration;
import wks.wolfkidsounds.wildplants.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Wildplants.MOD_ID);

    //MINECRAFT
    public static final RegistryObject<Block> MINECRAFT_WILD_WHEAT = registerMinecraftBlock("minecraft_wild_wheat", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> MINECRAFT_WILD_CARROTS = registerMinecraftBlock("minecraft_wild_carrots", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> MINECRAFT_WILD_POTATOES = registerMinecraftBlock("minecraft_wild_potatoes", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> MINECRAFT_WILD_BEETROOTS = registerMinecraftBlock("minecraft_wild_beetroots", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));

    //IMMERSIVEENGINEERING
    public static final RegistryObject<Block> IMMERSIVEENGINEERING_WILD_HEMP = registerImmersiveEngineeringBlock("immersiveenineering_wild_hemp", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));

    //----------------------------------------------------------------------------------------------
    private static <T extends Block> RegistryObject<T> registerMinecraftBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (Configuration.ENABLE_MINECRAFT.get()) {
            registerBlockItem(name, toReturn);
            Wildplants.LOGGER.debug("register-blocks-minecraft");
        }
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerImmersiveEngineeringBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (Configuration.ENABLE_IMMERSIVEENGINEERING.get()) {
            registerBlockItem(name, toReturn);
            Wildplants.LOGGER.debug("register-blocks-immersiveengineering");
        }
        return toReturn;
    }

    //----------------------------------------------------------------------------------------------

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(Wildplants.CREATIVE_MODE_TAB)));
        Wildplants.LOGGER.debug("register-block-ttems");
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        Wildplants.LOGGER.debug("register-modblocks-moditems");
    }
}
