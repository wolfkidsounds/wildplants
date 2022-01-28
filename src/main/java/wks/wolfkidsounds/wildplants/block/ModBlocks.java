package wks.wolfkidsounds.wildplants.block;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import wks.wolfkidsounds.wildplants.Wildplants;
import wks.wolfkidsounds.wildplants.config.CompatConfig;
import wks.wolfkidsounds.wildplants.items.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Wildplants.MOD_ID);

    public static final RegistryObject<Block> MINECRAFT_WILD_WHEAT = registerMinecraftBlock("minecraft_wild_wheat",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> MINECRAFT_WILD_CARROTS = registerMinecraftBlock("minecraft_wild_carrots",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> MINECRAFT_WILD_POTATOES = registerMinecraftBlock("minecraft_wild_potatoes",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> MINECRAFT_WILD_BEETROOTS = registerMinecraftBlock("minecraft_wild_beetroots",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));


    private static <T extends Block>RegistryObject<T> registerMinecraftBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (CompatConfig.ENABLE_MINECRAFT.get()) {registerBlockItem(name, toReturn);}
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(Wildplants.ITEM_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
