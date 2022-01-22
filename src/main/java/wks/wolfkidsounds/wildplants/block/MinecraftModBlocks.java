package wks.wolfkidsounds.wildplants.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.potion.Effects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import wks.wolfkidsounds.wildplants.Wildplants;
import wks.wolfkidsounds.wildplants.config.CompatConfig;
import wks.wolfkidsounds.wildplants.items.ModItems;

import java.util.function.Supplier;

public class MinecraftModBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, Wildplants.MOD_ID);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static final RegistryObject<Block> MINECRAFT_WILD_WHEAT = registerBlock("minecraft_wild_wheat",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MINECRAFT_WILD_CARROTS = registerBlock("minecraft_wild_carrots",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MINECRAFT_WILD_POTATOES = registerBlock("minecraft_wild_potatoes",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MINECRAFT_WILD_BEETROOTS = registerBlock("minecraft_wild_beetroots",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));


    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        if ((Boolean)CompatConfig.ENABLE_MINECRAFT.get()) {
            ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(Wildplants.ITEM_GROUP)));
        }
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
