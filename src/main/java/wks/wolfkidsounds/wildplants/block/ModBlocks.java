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
import wks.wolfkidsounds.wildplants.items.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Wildplants.MOD_ID);

    public static final RegistryObject<Block> MINECRAFT_WILD_WHEAT = registerBlock("minecraft_wild_wheat",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> MINECRAFT_WILD_CARROTS = registerBlock("minecraft_wild_carrots",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> MINECRAFT_WILD_POTATOES = registerBlock("minecraft_wild_potatoes",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> MINECRAFT_WILD_BEETROOTS = registerBlock("minecraft_wild_beetroots",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> IMMERSIVEENGINEERING_WILD_HEMP = registerBlock("immersiveenineering_wild_hemp",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_AGAVE = registerBlock("harvestcraft_wild_agave",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_AMARANTH = registerBlock("harvestcraft_wild_amaranth",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ARROWROOT = registerBlock("harvestcraft_wild_arrowroot",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ARTICHOKE = registerBlock("harvestcraft_wild_artichoke",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ASPARAGUS = registerBlock("harvestcraft_wild_asparagus",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BARLEY = registerBlock("harvestcraft_wild_barley",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BEAN = registerBlock("harvestcraft_wild_bean",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BELLPEPPER = registerBlock("harvestcraft_wild_bellpepper",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BLACKBERRY = registerBlock("harvestcraft_wild_blackberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BLUEBERRY = registerBlock("harvestcraft_wild_blueberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BROCCOLI = registerBlock("harvestcraft_wild_broccoli",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BRUSSELSPROUT = registerBlock("harvestcraft_wild_brusselsprout",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CABBAGE = registerBlock("harvestcraft_wild_cabbage",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CACTUSFRUIT = registerBlock("harvestcraft_wild_cactusfruit",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CANDLEBERRY = registerBlock("harvestcraft_wild_candleberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CANTALOUPE = registerBlock("harvestcraft_wild_cantaloupe",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CASSAVA = registerBlock("harvestcraft_wild_cassava",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CAULIFLOWER = registerBlock("harvestcraft_wild_cauliflower",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CELERY = registerBlock("harvestcraft_wild_celery",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CHICKPEA = registerBlock("harvestcraft_wild_chickpea",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CHILIPEPPER = registerBlock("harvestcraft_wild_chilipepper",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_COFFEEBEAN = registerBlock("harvestcraft_wild_coffeebean",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CORN = registerBlock("harvestcraft_wild_corn",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_COTTON = registerBlock("harvestcraft_wild_cotton",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CRANBERRY = registerBlock("harvestcraft_wild_cranberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CUCUMBER = registerBlock("harvestcraft_wild_cucumber",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_EGGPLANT = registerBlock("harvestcraft_wild_eggplant",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ELDERBERRY = registerBlock("harvestcraft_wild_elderberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_FLAX = registerBlock("harvestcraft_wild_flax",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_GARLIC = registerBlock("harvestcraft_wild_garlic",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_GINGER = registerBlock("harvestcraft_wild_ginger",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_GRAPE = registerBlock("harvestcraft_wild_grape",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_GREENGRAPE = registerBlock("harvestcraft_wild_greengrape",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_HUCKLEBERRY = registerBlock("harvestcraft_wild_huckleberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_JICAMA = registerBlock("harvestcraft_wild_jicama",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_JUNIPERBERRY = registerBlock("harvestcraft_wild_juniperberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_JUTE = registerBlock("harvestcraft_wild_jute",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_KALE = registerBlock("harvestcraft_wild_kale",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_KENAF = registerBlock("harvestcraft_wild_kenaf",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_KIWI = registerBlock("harvestcraft_wild_kiwi",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_KOHLRABI = registerBlock("harvestcraft_wild_kohlrabi",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_LEEK = registerBlock("harvestcraft_wild_leek",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_LENTIL = registerBlock("harvestcraft_wild_lentil",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_LETTUCE = registerBlock("harvestcraft_wild_lettuce",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_MILLET = registerBlock("harvestcraft_wild_millet",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_MULBERRY = registerBlock("harvestcraft_wild_mulberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_MUSTARDSEEDS = registerBlock("harvestcraft_wild_mustardseeds",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_OATS = registerBlock("harvestcraft_wild_oats",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_OKRA = registerBlock("harvestcraft_wild_okra",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ONION = registerBlock("harvestcraft_wild_onion",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_PARSNIP = registerBlock("harvestcraft_wild_parsnip",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_PEANUT = registerBlock("harvestcraft_wild_peanut",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_PEAS = registerBlock("harvestcraft_wild_peas",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_PINEAPPLE = registerBlock("harvestcraft_wild_pineapple",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_QUINOA = registerBlock("harvestcraft_wild_quinoa",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RADISH = registerBlock("harvestcraft_wild_radish",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RASPBERRY = registerBlock("harvestcraft_wild_raspberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RHUBARB = registerBlock("harvestcraft_wild_rhubarb",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RICE = registerBlock("harvestcraft_wild_rice",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RUTABAGA = registerBlock("harvestcraft_wild_rutabaga",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RYE = registerBlock("harvestcraft_wild_rye",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SCALLION = registerBlock("harvestcraft_wild_scallion",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SESAMESEEDS = registerBlock("harvestcraft_wild_sesameseeds",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SISAL = registerBlock("harvestcraft_wild_sisal",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SOYBEAN = registerBlock("harvestcraft_wild_soybean",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SPINACH = registerBlock("harvestcraft_wild_spinach",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SPICELEAF = registerBlock("harvestcraft_wild_spiceleaf",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_STRAWBERRY = registerBlock("harvestcraft_wild_strawberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SWEETPOTATO = registerBlock("harvestcraft_wild_sweetpotato",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TARO = registerBlock("harvestcraft_wild_taro",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TEALEAF = registerBlock("harvestcraft_wild_tealeaf",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TOMATILLO = registerBlock("harvestcraft_wild_tomatillo",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TOMATO = registerBlock("harvestcraft_wild_tomato",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TURNIP = registerBlock("harvestcraft_wild_turnip",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_WATERCHESTNUT = registerBlock("harvestcraft_wild_waterchestnut",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_WHITEMUSHROOM = registerBlock("harvestcraft_wild_whitemushroom",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_WINTERSQUASH = registerBlock("harvestcraft_wild_wintersquash",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ZUCCHINI = registerBlock("harvestcraft_wild_zucchini",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
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
