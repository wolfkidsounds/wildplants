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

    public static final RegistryObject<Block> IMMERSIVEENGINEERING_WILD_HEMP = registerImmersiveEngineeringBlock("immersiveenineering_wild_hemp",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_AGAVE = registerHarvestcraftBlock("harvestcraft_wild_agave",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_AMARANTH = registerHarvestcraftBlock("harvestcraft_wild_amaranth",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ARROWROOT = registerHarvestcraftBlock("harvestcraft_wild_arrowroot",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ARTICHOKE = registerHarvestcraftBlock("harvestcraft_wild_artichoke",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ASPARAGUS = registerHarvestcraftBlock("harvestcraft_wild_asparagus",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BARLEY = registerHarvestcraftBlock("harvestcraft_wild_barley",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BEAN = registerHarvestcraftBlock("harvestcraft_wild_bean",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BELLPEPPER = registerHarvestcraftBlock("harvestcraft_wild_bellpepper",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BLACKBERRY = registerHarvestcraftBlock("harvestcraft_wild_blackberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BLUEBERRY = registerHarvestcraftBlock("harvestcraft_wild_blueberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BROCCOLI = registerHarvestcraftBlock("harvestcraft_wild_broccoli",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BRUSSELSPROUT = registerHarvestcraftBlock("harvestcraft_wild_brusselsprout",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CABBAGE = registerHarvestcraftBlock("harvestcraft_wild_cabbage",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CACTUSFRUIT = registerHarvestcraftBlock("harvestcraft_wild_cactusfruit",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CANDLEBERRY = registerHarvestcraftBlock("harvestcraft_wild_candleberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CANTALOUPE = registerHarvestcraftBlock("harvestcraft_wild_cantaloupe",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CASSAVA = registerHarvestcraftBlock("harvestcraft_wild_cassava",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CAULIFLOWER = registerHarvestcraftBlock("harvestcraft_wild_cauliflower",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CELERY = registerHarvestcraftBlock("harvestcraft_wild_celery",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CHICKPEA = registerHarvestcraftBlock("harvestcraft_wild_chickpea",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CHILIPEPPER = registerHarvestcraftBlock("harvestcraft_wild_chilipepper",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_COFFEEBEAN = registerHarvestcraftBlock("harvestcraft_wild_coffeebean",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CORN = registerHarvestcraftBlock("harvestcraft_wild_corn",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_COTTON = registerHarvestcraftBlock("harvestcraft_wild_cotton",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CRANBERRY = registerHarvestcraftBlock("harvestcraft_wild_cranberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CUCUMBER = registerHarvestcraftBlock("harvestcraft_wild_cucumber",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_EGGPLANT = registerHarvestcraftBlock("harvestcraft_wild_eggplant",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ELDERBERRY = registerHarvestcraftBlock("harvestcraft_wild_elderberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_FLAX = registerHarvestcraftBlock("harvestcraft_wild_flax",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_GARLIC = registerHarvestcraftBlock("harvestcraft_wild_garlic",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_GINGER = registerHarvestcraftBlock("harvestcraft_wild_ginger",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_GRAPE = registerHarvestcraftBlock("harvestcraft_wild_grape",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_GREENGRAPE = registerHarvestcraftBlock("harvestcraft_wild_greengrape",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_HUCKLEBERRY = registerHarvestcraftBlock("harvestcraft_wild_huckleberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_JICAMA = registerHarvestcraftBlock("harvestcraft_wild_jicama",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_JUNIPERBERRY = registerHarvestcraftBlock("harvestcraft_wild_juniperberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_JUTE = registerHarvestcraftBlock("harvestcraft_wild_jute",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_KALE = registerHarvestcraftBlock("harvestcraft_wild_kale",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_KENAF = registerHarvestcraftBlock("harvestcraft_wild_kenaf",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_KIWI = registerHarvestcraftBlock("harvestcraft_wild_kiwi",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_KOHLRABI = registerHarvestcraftBlock("harvestcraft_wild_kohlrabi",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_LEEK = registerHarvestcraftBlock("harvestcraft_wild_leek",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_LENTIL = registerHarvestcraftBlock("harvestcraft_wild_lentil",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_LETTUCE = registerHarvestcraftBlock("harvestcraft_wild_lettuce",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_MILLET = registerHarvestcraftBlock("harvestcraft_wild_millet",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_MULBERRY = registerHarvestcraftBlock("harvestcraft_wild_mulberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_MUSTARDSEEDS = registerHarvestcraftBlock("harvestcraft_wild_mustardseeds",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_OATS = registerHarvestcraftBlock("harvestcraft_wild_oats",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_OKRA = registerHarvestcraftBlock("harvestcraft_wild_okra",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ONION = registerHarvestcraftBlock("harvestcraft_wild_onion",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_PARSNIP = registerHarvestcraftBlock("harvestcraft_wild_parsnip",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_PEANUT = registerHarvestcraftBlock("harvestcraft_wild_peanut",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_PEAS = registerHarvestcraftBlock("harvestcraft_wild_peas",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_PINEAPPLE = registerHarvestcraftBlock("harvestcraft_wild_pineapple",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_QUINOA = registerHarvestcraftBlock("harvestcraft_wild_quinoa",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RADISH = registerHarvestcraftBlock("harvestcraft_wild_radish",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RASPBERRY = registerHarvestcraftBlock("harvestcraft_wild_raspberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RHUBARB = registerHarvestcraftBlock("harvestcraft_wild_rhubarb",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RICE = registerHarvestcraftBlock("harvestcraft_wild_rice",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RUTABAGA = registerHarvestcraftBlock("harvestcraft_wild_rutabaga",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RYE = registerHarvestcraftBlock("harvestcraft_wild_rye",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SCALLION = registerHarvestcraftBlock("harvestcraft_wild_scallion",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SESAMESEEDS = registerHarvestcraftBlock("harvestcraft_wild_sesameseeds",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SISAL = registerHarvestcraftBlock("harvestcraft_wild_sisal",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SOYBEAN = registerHarvestcraftBlock("harvestcraft_wild_soybean",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SPINACH = registerHarvestcraftBlock("harvestcraft_wild_spinach",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SPICELEAF = registerHarvestcraftBlock("harvestcraft_wild_spiceleaf",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_STRAWBERRY = registerHarvestcraftBlock("harvestcraft_wild_strawberry",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SWEETPOTATO = registerHarvestcraftBlock("harvestcraft_wild_sweetpotato",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TARO = registerHarvestcraftBlock("harvestcraft_wild_taro",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TEALEAF = registerHarvestcraftBlock("harvestcraft_wild_tealeaf",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TOMATILLO = registerHarvestcraftBlock("harvestcraft_wild_tomatillo",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TOMATO = registerHarvestcraftBlock("harvestcraft_wild_tomato",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TURNIP = registerHarvestcraftBlock("harvestcraft_wild_turnip",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_WATERCHESTNUT = registerHarvestcraftBlock("harvestcraft_wild_waterchestnut",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_WHITEMUSHROOM = registerHarvestcraftBlock("harvestcraft_wild_whitemushroom",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_WINTERSQUASH = registerHarvestcraftBlock("harvestcraft_wild_wintersquash",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ZUCCHINI = registerHarvestcraftBlock("harvestcraft_wild_zucchini",
            () -> new FlowerBlock(MobEffects.HEAL, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    private static <T extends Block>RegistryObject<T> registerMinecraftBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (CompatConfig.ENABLE_MINECRAFT.get()) {registerBlockItem(name, toReturn);}
        return toReturn;
    }

    private static <T extends Block>RegistryObject<T> registerImmersiveEngineeringBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (CompatConfig.ENABLE_IMMERSIVEENGINEERING.get() && CompatConfig.LOADED_IMMERSIVEENGINEERING) {registerBlockItem(name, toReturn);}
        return toReturn;
    }

    private static <T extends Block>RegistryObject<T> registerHarvestcraftBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (CompatConfig.ENABLE_HARVESTCRAFT.get() && CompatConfig.LOADED_HARVESTCRAFT) {registerBlockItem(name, toReturn);}
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
