package wks.wolfkidsounds.wildplants.block;
//TODO BLOCK-DROPS

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

public class HarvestcraftModBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, Wildplants.MOD_ID);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static final RegistryObject<Block> WILD_AGAVE = registerBlock("wild_agave",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_AMARANTH = registerBlock("wild_amaranth",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_ARROWROOT = registerBlock("wild_arrowroot",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_ARTICHOKE = registerBlock("wild_artichoke",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_ASPARAGUS = registerBlock("wild_asparagus",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    //TODO - isblock, texture
    public static final RegistryObject<Block> WILD_BARLEY = registerBlock("wild_barley",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_BEAN = registerBlock("wild_bean",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_BELLPEPPER = registerBlock("wild_bellpepper",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_BLACKBERRY = registerBlock("wild_blackberry",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_BLUEBERRY = registerBlock("wild_blueberry",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_BROCCOLI = registerBlock("wild_broccoli",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_BRUSSELSPROUT = registerBlock("wild_brusselsprout",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    //TODO isblock, texture
    public static final RegistryObject<Block> WILD_CABBAGE = registerBlock("wild_cabbage",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    //TODO isblock, texture
    public static final RegistryObject<Block> WILD_CACTUSFRUIT = registerBlock("wild_cactusfruit",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_CANDLEBERRY = registerBlock("wild_candleberry",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_CANTALOUPE = registerBlock("wild_cantaloupe",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_CASSAVA = registerBlock("wild_cassava",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_CAULIFLOWER = registerBlock("wild_cauliflower",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_CELERY = registerBlock("wild_celery",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_CHICKPEA = registerBlock("wild_chickpea",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_CHILIPEPPER = registerBlock("wild_chilipepper",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_COFFEEBEAN = registerBlock("wild_coffeebean",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_CORN = registerBlock("wild_corn",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_COTTON = registerBlock("wild_cotton",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_CRANBERRY = registerBlock("wild_cranberry",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_CUCUMBER = registerBlock("wild_cucumber",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_EGGPLANT = registerBlock("wild_eggplant",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_ELDERBERRY = registerBlock("wild_elderberry",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_FLAX = registerBlock("wild_flax",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_GARLIC = registerBlock("wild_garlic",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_GINGER = registerBlock("wild_ginger",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_GRAPE = registerBlock("wild_grape",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_GREENGRAPE = registerBlock("wild_greengrape",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_HUCKLEBERRY = registerBlock("wild_huckleberry",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_JICAMA = registerBlock("wild_jicama",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_JUNIPERBERRY = registerBlock("wild_juniperberry",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_JUTE = registerBlock("wild_jute",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_KALE = registerBlock("wild_kale",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_KENAF = registerBlock("wild_kenaf",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_KIWI = registerBlock("wild_kiwi",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_KOHLRABI = registerBlock("wild_kohlrabi",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_LEEK = registerBlock("wild_leek",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_LENTIL = registerBlock("wild_lentil",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_LETTUCE = registerBlock("wild_lettuce",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_MILLET = registerBlock("wild_millet",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_MULBERRY = registerBlock("wild_mulberry",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_MUSTARDSEEDS = registerBlock("wild_mustardseeds",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_OATS = registerBlock("wild_oats",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_OKRA = registerBlock("wild_okra",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    //TODO isblock, texture
    public static final RegistryObject<Block> WILD_ONION = registerBlock("wild_onion",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_PARSNIP = registerBlock("wild_parsnip",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_PEANUT = registerBlock("wild_peanut",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_PEAS = registerBlock("wild_peas",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_PINEAPPLE = registerBlock("wild_pineapple",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_QUINOA = registerBlock("wild_quinoa",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_RADISH = registerBlock("wild_radish",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_RASPBERRY = registerBlock("wild_raspberry",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_RHUBARB = registerBlock("wild_rhubarb",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    //TODO isblock, texture
    public static final RegistryObject<Block> WILD_RICE = registerBlock("wild_rice",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_RUTABAGA = registerBlock("wild_rutabaga",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_RYE = registerBlock("wild_rye",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_SCALLION = registerBlock("wild_scallion",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_SESAMESEEDS = registerBlock("wild_sesameseeds",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_SISAL = registerBlock("wild_sisal",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_SOYBEAN = registerBlock("wild_soybean",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_SPINACH = registerBlock("wild_spinach",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_SPICELEAF = registerBlock("wild_spiceleaf",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_STRAWBERRY = registerBlock("wild_strawberry",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_SWEETPOTATO = registerBlock("wild_sweetpotato",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_TARO = registerBlock("wild_taro",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_TEALEAF = registerBlock("wild_tealeaf",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_TOMATILLO = registerBlock("wild_tomatillo",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    //TODO isblock, texture
    public static final RegistryObject<Block> WILD_TOMATO = registerBlock("wild_tomato",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_TURNIP = registerBlock("wild_turnip",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_WATERCHESTNUT = registerBlock("wild_waterchestnut",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    //TODO isblock, texture
    public static final RegistryObject<Block> WILD_WHITEMUSHROOM = registerBlock("wild_whitemushroom",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_WINTERSQUASH = registerBlock("wild_wintersquash",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> WILD_ZUCCHINI = registerBlock("wild_zucchini",
            () -> new FlowerBlock(Effects.HASTE, 1, AbstractBlock.Properties.from(Blocks.DANDELION)));


    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        if ((Boolean)CompatConfig.LOADED_HARVESTCRAFT && (Boolean)CompatConfig.ENABLE_HARVESTCRAFT.get()) {
            ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(Wildplants.ITEM_GROUP)));
        }
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}