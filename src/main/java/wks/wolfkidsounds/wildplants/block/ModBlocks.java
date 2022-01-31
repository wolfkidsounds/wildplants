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
import wks.wolfkidsounds.wildplants.config.features.mysticalagriculture.MysticalAgricultureConfig;
import wks.wolfkidsounds.wildplants.items.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Wildplants.MOD_ID);
    //--------------------------------------------------------------------------------------------------

    //MINECRAFT
    public static final RegistryObject<Block> MINECRAFT_WILD_WHEAT = registerMinecraftBlock("minecraft_wild_wheat",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MINECRAFT_WILD_CARROTS = registerMinecraftBlock("minecraft_wild_carrots",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MINECRAFT_WILD_POTATOES = registerMinecraftBlock("minecraft_wild_potatoes",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MINECRAFT_WILD_BEETROOTS = registerMinecraftBlock("minecraft_wild_beetroots",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    private static <T extends Block>RegistryObject<T> registerMinecraftBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (CompatConfig.ENABLE_MINECRAFT.get()) {registerBlockItem(name, toReturn);}
        return toReturn;
    }

    //--------------------------------------------------------------------------------------------------

    //IMMERSIVE_ENGINEERING
    public static final RegistryObject<Block> IMMERSIVEENGINEERING_WILD_HEMP = registerImmersiveEngineeringBlock("immersiveenineering_wild_hemp",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    private static <T extends Block>RegistryObject<T> registerImmersiveEngineeringBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (CompatConfig.ENABLE_IMMERSIVEENGINEERING.get() && CompatConfig.LOADED_IMMERSIVEENGINEERING) {registerBlockItem(name, toReturn);}
        return toReturn;
    }

    //--------------------------------------------------------------------------------------------------

    //HARVESTCRAFT
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_AGAVE = registerHarvestcraftBlock("harvestcraft_wild_agave",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_AMARANTH = registerHarvestcraftBlock("harvestcraft_wild_amaranth",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ARROWROOT = registerHarvestcraftBlock("harvestcraft_wild_arrowroot",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ARTICHOKE = registerHarvestcraftBlock("harvestcraft_wild_artichoke",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ASPARAGUS = registerHarvestcraftBlock("harvestcraft_wild_asparagus",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BARLEY = registerHarvestcraftBlock("harvestcraft_wild_barley",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BEAN = registerHarvestcraftBlock("harvestcraft_wild_bean",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BELLPEPPER = registerHarvestcraftBlock("harvestcraft_wild_bellpepper",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BLACKBERRY = registerHarvestcraftBlock("harvestcraft_wild_blackberry",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BLUEBERRY = registerHarvestcraftBlock("harvestcraft_wild_blueberry",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BROCCOLI = registerHarvestcraftBlock("harvestcraft_wild_broccoli",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BRUSSELSPROUT = registerHarvestcraftBlock("harvestcraft_wild_brusselsprout",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CABBAGE = registerHarvestcraftBlock("harvestcraft_wild_cabbage",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CACTUSFRUIT = registerHarvestcraftBlock("harvestcraft_wild_cactusfruit",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CANDLEBERRY = registerHarvestcraftBlock("harvestcraft_wild_candleberry",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CANTALOUPE = registerHarvestcraftBlock("harvestcraft_wild_cantaloupe",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CASSAVA = registerHarvestcraftBlock("harvestcraft_wild_cassava",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CAULIFLOWER = registerHarvestcraftBlock("harvestcraft_wild_cauliflower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CELERY = registerHarvestcraftBlock("harvestcraft_wild_celery",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CHICKPEA = registerHarvestcraftBlock("harvestcraft_wild_chickpea",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CHILIPEPPER = registerHarvestcraftBlock("harvestcraft_wild_chilipepper",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_COFFEEBEAN = registerHarvestcraftBlock("harvestcraft_wild_coffeebean",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CORN = registerHarvestcraftBlock("harvestcraft_wild_corn",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_COTTON = registerHarvestcraftBlock("harvestcraft_wild_cotton",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CRANBERRY = registerHarvestcraftBlock("harvestcraft_wild_cranberry",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CUCUMBER = registerHarvestcraftBlock("harvestcraft_wild_cucumber",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_EGGPLANT = registerHarvestcraftBlock("harvestcraft_wild_eggplant",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ELDERBERRY = registerHarvestcraftBlock("harvestcraft_wild_elderberry",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_FLAX = registerHarvestcraftBlock("harvestcraft_wild_flax",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_GARLIC = registerHarvestcraftBlock("harvestcraft_wild_garlic",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_GINGER = registerHarvestcraftBlock("harvestcraft_wild_ginger",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_GRAPE = registerHarvestcraftBlock("harvestcraft_wild_grape",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_GREENGRAPE = registerHarvestcraftBlock("harvestcraft_wild_greengrape",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_HUCKLEBERRY = registerHarvestcraftBlock("harvestcraft_wild_huckleberry",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_JICAMA = registerHarvestcraftBlock("harvestcraft_wild_jicama",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_JUNIPERBERRY = registerHarvestcraftBlock("harvestcraft_wild_juniperberry",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_JUTE = registerHarvestcraftBlock("harvestcraft_wild_jute",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_KALE = registerHarvestcraftBlock("harvestcraft_wild_kale",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_KENAF = registerHarvestcraftBlock("harvestcraft_wild_kenaf",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_KIWI = registerHarvestcraftBlock("harvestcraft_wild_kiwi",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_KOHLRABI = registerHarvestcraftBlock("harvestcraft_wild_kohlrabi",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_LEEK = registerHarvestcraftBlock("harvestcraft_wild_leek",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_LENTIL = registerHarvestcraftBlock("harvestcraft_wild_lentil",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_LETTUCE = registerHarvestcraftBlock("harvestcraft_wild_lettuce",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_MILLET = registerHarvestcraftBlock("harvestcraft_wild_millet",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_MULBERRY = registerHarvestcraftBlock("harvestcraft_wild_mulberry",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_MUSTARDSEEDS = registerHarvestcraftBlock("harvestcraft_wild_mustardseeds",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_OATS = registerHarvestcraftBlock("harvestcraft_wild_oats",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_OKRA = registerHarvestcraftBlock("harvestcraft_wild_okra",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ONION = registerHarvestcraftBlock("harvestcraft_wild_onion",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_PARSNIP = registerHarvestcraftBlock("harvestcraft_wild_parsnip",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_PEANUT = registerHarvestcraftBlock("harvestcraft_wild_peanut",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_PEAS = registerHarvestcraftBlock("harvestcraft_wild_peas",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_PINEAPPLE = registerHarvestcraftBlock("harvestcraft_wild_pineapple",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_QUINOA = registerHarvestcraftBlock("harvestcraft_wild_quinoa",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RADISH = registerHarvestcraftBlock("harvestcraft_wild_radish",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RASPBERRY = registerHarvestcraftBlock("harvestcraft_wild_raspberry",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RHUBARB = registerHarvestcraftBlock("harvestcraft_wild_rhubarb",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RICE = registerHarvestcraftBlock("harvestcraft_wild_rice",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RUTABAGA = registerHarvestcraftBlock("harvestcraft_wild_rutabaga",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RYE = registerHarvestcraftBlock("harvestcraft_wild_rye",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SCALLION = registerHarvestcraftBlock("harvestcraft_wild_scallion",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SESAMESEEDS = registerHarvestcraftBlock("harvestcraft_wild_sesameseeds",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SISAL = registerHarvestcraftBlock("harvestcraft_wild_sisal",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SOYBEAN = registerHarvestcraftBlock("harvestcraft_wild_soybean",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SPINACH = registerHarvestcraftBlock("harvestcraft_wild_spinach",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SPICELEAF = registerHarvestcraftBlock("harvestcraft_wild_spiceleaf",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_STRAWBERRY = registerHarvestcraftBlock("harvestcraft_wild_strawberry",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SWEETPOTATO = registerHarvestcraftBlock("harvestcraft_wild_sweetpotato",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TARO = registerHarvestcraftBlock("harvestcraft_wild_taro",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TEALEAF = registerHarvestcraftBlock("harvestcraft_wild_tealeaf",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TOMATILLO = registerHarvestcraftBlock("harvestcraft_wild_tomatillo",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TOMATO = registerHarvestcraftBlock("harvestcraft_wild_tomato",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TURNIP = registerHarvestcraftBlock("harvestcraft_wild_turnip",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_WATERCHESTNUT = registerHarvestcraftBlock("harvestcraft_wild_waterchestnut",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_WHITEMUSHROOM = registerHarvestcraftBlock("harvestcraft_wild_whitemushroom",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_WINTERSQUASH = registerHarvestcraftBlock("harvestcraft_wild_wintersquash",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ZUCCHINI = registerHarvestcraftBlock("harvestcraft_wild_zucchini",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    private static <T extends Block>RegistryObject<T> registerHarvestcraftBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (CompatConfig.ENABLE_HARVESTCRAFT.get() && CompatConfig.LOADED_HARVESTCRAFT) {registerBlockItem(name, toReturn);}
        return toReturn;
    }

    //--------------------------------------------------------------------------------------------------

    //VEGGIE_WAY
    public static final RegistryObject<Block> VEGGIEWAY_WILD_CORN = registerVeggiewayBlock("veggieway_wild_corn",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> VEGGIEWAY_WILD_LENTIL = registerVeggiewayBlock("veggieway_wild_lentil",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> VEGGIEWAY_WILD_QUINOA = registerVeggiewayBlock("veggieway_wild_quinoa",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> VEGGIEWAY_WILD_SOYBEAN = registerVeggiewayBlock("veggieway_wild_soybean",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    private static <T extends Block>RegistryObject<T> registerVeggiewayBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (CompatConfig.ENABLE_VEGGIEWAY.get() && CompatConfig.LOADED_VEGGIEWAY) {registerBlockItem(name, toReturn);}
        return toReturn;
    }

    //--------------------------------------------------------------------------------------------------

    //MYSTICAL_AGRICULTURE
    //BASE
    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_PROSPERITY_FLOWER = registerMysticalAgricultureBaseBlock("mysticalagriculture_wild_prosperity_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_SOULIUM_FLOWER = registerMysticalAgricultureBaseBlock("mysticalagriculture_wild_soulium_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_INFERIUM_FLOWER = registerMysticalAgricultureBaseBlock("mysticalagriculture_wild_inferium_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    private static <T extends Block>RegistryObject<T> registerMysticalAgricultureBaseBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (MysticalAgricultureConfig.ENABLE_MYSTICALAGRICULTURE_BASE.get() && CompatConfig.ENABLE_MYSTICALAGRICULTURE.get() && CompatConfig.LOADED_MYSTICALAGRICULTURE) {registerBlockItem(name, toReturn);}
        return toReturn;
    }

    //--------------------------------------------------------------------------------------------------

    //ELEMENTAL
    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_AIR_FLOWER = registerMysticalAgricultureElementalBlock("mysticalagriculture_wild_air_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_EARTH_FLOWER = registerMysticalAgricultureElementalBlock("mysticalagriculture_wild_earth_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_WATER_FLOWER = registerMysticalAgricultureElementalBlock("mysticalagriculture_wild_water_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_FIRE_FLOWER = registerMysticalAgricultureElementalBlock("mysticalagriculture_wild_fire_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    private static <T extends Block>RegistryObject<T> registerMysticalAgricultureElementalBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (MysticalAgricultureConfig.ENABLE_MYSTICALAGRICULTURE_ELEMENTAL.get() && CompatConfig.ENABLE_MYSTICALAGRICULTURE.get() && CompatConfig.LOADED_MYSTICALAGRICULTURE) {registerBlockItem(name, toReturn);}
        return toReturn;
    }

    //--------------------------------------------------------------------------------------------------

    //MOBS_PASSIVE
    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_PIG_FLOWER = registerMysticalAgriculturePassiveMobBlock("mysticalagriculture_wild_pig_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_CHICKEN_FLOWER = registerMysticalAgriculturePassiveMobBlock("mysticalagriculture_wild_chicken_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_COW_FLOWER = registerMysticalAgriculturePassiveMobBlock("mysticalagriculture_wild_cow_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_SHEEP_FLOWER = registerMysticalAgriculturePassiveMobBlock("mysticalagriculture_wild_sheep_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_SQUID_FLOWER = registerMysticalAgriculturePassiveMobBlock("mysticalagriculture_wild_squid_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_FISH_FLOWER = registerMysticalAgriculturePassiveMobBlock("mysticalagriculture_wild_fish_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_TURTLE_FLOWER = registerMysticalAgriculturePassiveMobBlock("mysticalagriculture_wild_turtle_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    private static <T extends Block>RegistryObject<T> registerMysticalAgriculturePassiveMobBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (MysticalAgricultureConfig.ENABLE_MYSTICALAGRICULTURE_MOB_PASSIVE.get() && CompatConfig.ENABLE_MYSTICALAGRICULTURE.get() && CompatConfig.LOADED_MYSTICALAGRICULTURE) {registerBlockItem(name, toReturn);}
        return toReturn;
    }

    //--------------------------------------------------------------------------------------------------

    //MOBS
    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_SLIME_FLOWER = registerMysticalAgricultureMobBlock("mysticalagriculture_wild_slime_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_BLAZE_FLOWER = registerMysticalAgricultureMobBlock("mysticalagriculture_wild_blaze_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_GHAST_FLOWER = registerMysticalAgricultureMobBlock("mysticalagriculture_wild_ghast_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_ENDERMAN_FLOWER = registerMysticalAgricultureMobBlock("mysticalagriculture_wild_enderman_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_WITHERSKELETON_FLOWER = registerMysticalAgricultureMobBlock("mysticalagriculture_wild_witherskeleton_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    private static <T extends Block>RegistryObject<T> registerMysticalAgricultureMobBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (MysticalAgricultureConfig.ENABLE_MYSTICALAGRICULTURE_MOB.get() && CompatConfig.ENABLE_MYSTICALAGRICULTURE.get() && CompatConfig.LOADED_MYSTICALAGRICULTURE) {registerBlockItem(name, toReturn);}
        return toReturn;
    }

    //--------------------------------------------------------------------------------------------------

    //BLOCKS
    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_STONE_FLOWER = registerMysticalAgricultureBlocks("mysticalagriculture_wild_stone_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_DIRT_FLOWER = registerMysticalAgricultureBlocks("mysticalagriculture_wild_dirt_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_WOOD_FLOWER = registerMysticalAgricultureBlocks("mysticalagriculture_wild_wood_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_CORAL_FLOWER = registerMysticalAgricultureBlocks("mysticalagriculture_wild_coral_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_OBSIDIAN_FLOWER = registerMysticalAgricultureBlocks("mysticalagriculture_wild_obsidian_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    private static <T extends Block>RegistryObject<T> registerMysticalAgricultureBlocks(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (MysticalAgricultureConfig.ENABLE_MYSTICALAGRICULTURE_BLOCKS.get() && CompatConfig.ENABLE_MYSTICALAGRICULTURE.get() && CompatConfig.LOADED_MYSTICALAGRICULTURE) {registerBlockItem(name, toReturn);}
        return toReturn;
    }

    //--------------------------------------------------------------------------------------------------

    //OTHER
    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_NATURE_FLOWER = registerMysticalAgricultureOtherBlock("mysticalagriculture_wild_nature_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_DYE_FLOWER = registerMysticalAgricultureOtherBlock("mysticalagriculture_wild_dye_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_NETHER_FLOWER = registerMysticalAgricultureOtherBlock("mysticalagriculture_wild_nether_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_EXPERIENCE_FLOWER = registerMysticalAgricultureOtherBlock("mysticalagriculture_wild_experience_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_END_FLOWER = registerMysticalAgricultureOtherBlock("mysticalagriculture_wild_end_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    private static <T extends Block>RegistryObject<T> registerMysticalAgricultureOtherBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (MysticalAgricultureConfig.ENABLE_MYSTICALAGRICULTURE_OTHER.get() && CompatConfig.ENABLE_MYSTICALAGRICULTURE.get() && CompatConfig.LOADED_MYSTICALAGRICULTURE) {registerBlockItem(name, toReturn);}
        return toReturn;
    }

    //--------------------------------------------------------------------------------------------------

    //RESOURCES
    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_COAL_FLOWER = registerMysticalAgricultureResourceBlock("mysticalagriculture_wild_coal_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_HONEY_FLOWER = registerMysticalAgricultureResourceBlock("mysticalagriculture_wild_honey_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_RUBBER_FLOWER = registerMysticalAgricultureResourceBlock("mysticalagriculture_wild_rubber_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_SILICON_FLOWER = registerMysticalAgricultureResourceBlock("mysticalagriculture_wild_silicon_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_SULFUR_FLOWER = registerMysticalAgricultureResourceBlock("mysticalagriculture_wild_sulfur_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_SALTPETER_FLOWER = registerMysticalAgricultureResourceBlock("mysticalagriculture_wild_saltpeter_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_LAPISLAZULI_FLOWER = registerMysticalAgricultureResourceBlock("mysticalagriculture_wild_lapislazuli_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_GRAPHITE_FLOWER = registerMysticalAgricultureResourceBlock("mysticalagriculture_wild_graphite_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_REDSTONE_FLOWER = registerMysticalAgricultureResourceBlock("mysticalagriculture_wild_redstone_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_GLOWSTONE_FLOWER = registerMysticalAgricultureResourceBlock("mysticalagriculture_wild_glowstone_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_NETHERQUARTZ_FLOWER = registerMysticalAgricultureResourceBlock("mysticalagriculture_wild_netherquartz_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_APATITE_FLOWER = registerMysticalAgricultureResourceBlock("mysticalagriculture_wild_apatite_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_URANIUM_FLOWER = registerMysticalAgricultureResourceBlock("mysticalagriculture_wild_uranium_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_RUBY_FLOWER = registerMysticalAgricultureResourceBlock("mysticalagriculture_wild_ruby_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_SAPPHIRE_FLOWER = registerMysticalAgricultureResourceBlock("mysticalagriculture_wild_sapphire_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_HOPGRAPHITE_FLOWER = registerMysticalAgricultureResourceBlock("mysticalagriculture_wild_hopgraphite_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_DIAMOND_FLOWER = registerMysticalAgricultureResourceBlock("mysticalagriculture_wild_diamond_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_EMERALD_FLOWER = registerMysticalAgricultureResourceBlock("mysticalagriculture_wild_emerald_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    private static <T extends Block>RegistryObject<T> registerMysticalAgricultureResourceBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (MysticalAgricultureConfig.ENABLE_MYSTICALAGRICULTURE_RESOURCES.get() && CompatConfig.ENABLE_MYSTICALAGRICULTURE.get() && CompatConfig.LOADED_MYSTICALAGRICULTURE) {registerBlockItem(name, toReturn);}
        return toReturn;
    }

    //--------------------------------------------------------------------------------------------------

    //METALS
    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_ALUMINUM_FLOWER = registerMysticalAgricultureMetalBlock("mysticalagriculture_wild_aluminum_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_COPPER_FLOWER = registerMysticalAgricultureMetalBlock("mysticalagriculture_wild_copper_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_IRON_FLOWER = registerMysticalAgricultureMetalBlock("mysticalagriculture_wild_iron_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_BRASS_FLOWER = registerMysticalAgricultureMetalBlock("mysticalagriculture_wild_brass_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_SILVER_FLOWER = registerMysticalAgricultureMetalBlock("mysticalagriculture_wild_silver_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_LEAD_FLOWER = registerMysticalAgricultureMetalBlock("mysticalagriculture_wild_lead_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_GOLD_FLOWER = registerMysticalAgricultureMetalBlock("mysticalagriculture_wild_gold_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_STEEL_FLOWER = registerMysticalAgricultureMetalBlock("mysticalagriculture_wild_steel_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_NICKEL_FLOWER = registerMysticalAgricultureMetalBlock("mysticalagriculture_wild_nickel_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_CONSTANTAN_FLOWER = registerMysticalAgricultureMetalBlock("mysticalagriculture_wild_constantan_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_ELECTRUM_FLOWER = registerMysticalAgricultureMetalBlock("mysticalagriculture_wild_electrum_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_INVAR_FLOWER = registerMysticalAgricultureMetalBlock("mysticalagriculture_wild_invar_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_MITHRIL_FLOWER = registerMysticalAgricultureMetalBlock("mysticalagriculture_wild_mithril_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_TUNGSTEN_FLOWER = registerMysticalAgricultureMetalBlock("mysticalagriculture_wild_tungsten_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_TITANIUM_FLOWER = registerMysticalAgricultureMetalBlock("mysticalagriculture_wild_titanium_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_CHROME_FLOWER = registerMysticalAgricultureMetalBlock("mysticalagriculture_wild_chrome_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_NETHERITE_FLOWER = registerMysticalAgricultureMetalBlock("mysticalagriculture_wild_netherite_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_PLATINUM_FLOWER = registerMysticalAgricultureMetalBlock("mysticalagriculture_wild_platinum_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> MYSTICALAGRICULTURE_WILD_IRIDIUM_FLOWER = registerMysticalAgricultureMetalBlock("mysticalagriculture_wild_iridium_flower",
            () -> new FlowerBlock(Effects.INSTANT_HEALTH, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    private static <T extends Block>RegistryObject<T> registerMysticalAgricultureMetalBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (MysticalAgricultureConfig.ENABLE_MYSTICALAGRICULTURE_METALS.get() && CompatConfig.ENABLE_MYSTICALAGRICULTURE.get() && CompatConfig.LOADED_MYSTICALAGRICULTURE) {registerBlockItem(name, toReturn);}
        return toReturn;
    }

    //----------------------------------------------------------------------------------------------

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(Wildplants.ITEM_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
