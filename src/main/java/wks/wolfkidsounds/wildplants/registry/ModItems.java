package wks.wolfkidsounds.wildplants.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import wks.wolfkidsounds.wildplants.Wildplants;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Wildplants.MOD_ID);
    // Wild Crops
    public static final RegistryObject<Item> MINECRAFT_WILD_WHEAT_ = ITEMS.register("minecraft_wild_wheat",
            () -> new BlockItem(ModBlocks.MINECRAFT_WILD_WHEAT.get(), minecraftCrop()));
    public static final RegistryObject<Item> MINECRAFT_WILD_CARROTS = ITEMS.register("minecraft_wild_carrots",
            () -> new BlockItem(ModBlocks.MINECRAFT_WILD_CARROTS.get(), minecraftCrop()));
    public static final RegistryObject<Item> MINECRAFT_WILD_POTATOES = ITEMS.register("minecraft_wild_potatoes",
            () -> new BlockItem(ModBlocks.MINECRAFT_WILD_POTATOES.get(), minecraftCrop()));
    public static final RegistryObject<Item> MINECRAFT_WILD_BEETROOTS = ITEMS.register("minecraft_wild_beetroots",
            () -> new BlockItem(ModBlocks.MINECRAFT_WILD_BEETROOTS.get(), minecraftCrop()));

    // Helper methods
    public static Item.Properties minecraftCrop() {
        return new Item.Properties().tab(ModItemGroups.MINECRAFT_TAB);
    }
}
