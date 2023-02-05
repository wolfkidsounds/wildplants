package wks.wolfkidsounds.wildplants.block;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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

    //VEGGIE_WAY
    public static final RegistryObject<Block> VEGGIEWAY_WILD_CORN = registerVeggieWayBlock("veggieway_wild_corn", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> VEGGIEWAY_WILD_LENTIL = registerVeggieWayBlock("veggieway_wild_lentil", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> VEGGIEWAY_WILD_QUINOA = registerVeggieWayBlock("veggieway_wild_quinoa", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> VEGGIEWAY_WILD_SOYBEAN = registerVeggieWayBlock("veggieway_wild_soybean", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> VEGGIEWAY_WILD_COTTON = registerVeggieWayBlock("veggieway_wild_cotton", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));

    //ENHANCEDFARMING
    public static final RegistryObject<Block> ENHANCEDFARMING_WILD_MINT = registerEnhancedFarmingBlock("enhancedfarming_wild_mint", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> ENHANCEDFARMING_WILD_TOMATO = registerEnhancedFarmingBlock("enhancedfarming_wild_tomato", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> ENHANCEDFARMING_WILD_CUCUMBER = registerEnhancedFarmingBlock("enhancedfarming_wild_cucumber", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> ENHANCEDFARMING_WILD_AUBERGINE = registerEnhancedFarmingBlock("enhancedfarming_wild_aubergine", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> ENHANCEDFARMING_WILD_GRAPE = registerEnhancedFarmingBlock("enhancedfarming_wild_grape", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> ENHANCEDFARMING_WILD_PINEAPPLE = registerEnhancedFarmingBlock("enhancedfarming_wild_pineapple", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> ENHANCEDFARMING_WILD_CORN = registerEnhancedFarmingBlock("enhancedfarming_wild_corn", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> ENHANCEDFARMING_WILD_ONION = registerEnhancedFarmingBlock("enhancedfarming_wild_onion", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> ENHANCEDFARMING_WILD_GARLIC = registerEnhancedFarmingBlock("enhancedfarming_wild_garlic", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> ENHANCEDFARMING_WILD_LETTUCE = registerEnhancedFarmingBlock("enhancedfarming_wild_lettuce", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));

    //HARVESTCRAFT
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_AGAVE = registerHarvestcraftBlock("harvestcraft_wild_agave", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_AMARANTH = registerHarvestcraftBlock("harvestcraft_wild_amaranth", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ARROWROOT = registerHarvestcraftBlock("harvestcraft_wild_arrowroot", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ARTICHOKE = registerHarvestcraftBlock("harvestcraft_wild_artichoke", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ASPARAGUS = registerHarvestcraftBlock("harvestcraft_wild_asparagus", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BARLEY = registerHarvestcraftBlock("harvestcraft_wild_barley", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BEAN = registerHarvestcraftBlock("harvestcraft_wild_bean", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BELLPEPPER = registerHarvestcraftBlock("harvestcraft_wild_bellpepper", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BLACKBERRY = registerHarvestcraftBlock("harvestcraft_wild_blackberry", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BLUEBERRY = registerHarvestcraftBlock("harvestcraft_wild_blueberry", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BROCCOLI = registerHarvestcraftBlock("harvestcraft_wild_broccoli", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_BRUSSELSPROUT = registerHarvestcraftBlock("harvestcraft_wild_brusselsprout", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CABBAGE = registerHarvestcraftBlock("harvestcraft_wild_cabbage", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CACTUSFRUIT = registerHarvestcraftBlock("harvestcraft_wild_cactusfruit", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CANDLEBERRY = registerHarvestcraftBlock("harvestcraft_wild_candleberry", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CANTALOUPE = registerHarvestcraftBlock("harvestcraft_wild_cantaloupe", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CASSAVA = registerHarvestcraftBlock("harvestcraft_wild_cassava", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CAULIFLOWER = registerHarvestcraftBlock("harvestcraft_wild_cauliflower", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CELERY = registerHarvestcraftBlock("harvestcraft_wild_celery", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CHICKPEA = registerHarvestcraftBlock("harvestcraft_wild_chickpea", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CHILIPEPPER = registerHarvestcraftBlock("harvestcraft_wild_chilipepper", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_COFFEEBEAN = registerHarvestcraftBlock("harvestcraft_wild_coffeebean", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CORN = registerHarvestcraftBlock("harvestcraft_wild_corn", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_COTTON = registerHarvestcraftBlock("harvestcraft_wild_cotton", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CRANBERRY = registerHarvestcraftBlock("harvestcraft_wild_cranberry", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_CUCUMBER = registerHarvestcraftBlock("harvestcraft_wild_cucumber", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_EGGPLANT = registerHarvestcraftBlock("harvestcraft_wild_eggplant", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ELDERBERRY = registerHarvestcraftBlock("harvestcraft_wild_elderberry", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_FLAX = registerHarvestcraftBlock("harvestcraft_wild_flax", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_GARLIC = registerHarvestcraftBlock("harvestcraft_wild_garlic", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_GINGER = registerHarvestcraftBlock("harvestcraft_wild_ginger", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_GRAPE = registerHarvestcraftBlock("harvestcraft_wild_grape", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_GREENGRAPE = registerHarvestcraftBlock("harvestcraft_wild_greengrape", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_HUCKLEBERRY = registerHarvestcraftBlock("harvestcraft_wild_huckleberry", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_JICAMA = registerHarvestcraftBlock("harvestcraft_wild_jicama", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_JUNIPERBERRY = registerHarvestcraftBlock("harvestcraft_wild_juniperberry", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_JUTE = registerHarvestcraftBlock("harvestcraft_wild_jute", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_KALE = registerHarvestcraftBlock("harvestcraft_wild_kale", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_KENAF = registerHarvestcraftBlock("harvestcraft_wild_kenaf", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_KIWI = registerHarvestcraftBlock("harvestcraft_wild_kiwi", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_KOHLRABI = registerHarvestcraftBlock("harvestcraft_wild_kohlrabi", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_LEEK = registerHarvestcraftBlock("harvestcraft_wild_leek", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_LENTIL = registerHarvestcraftBlock("harvestcraft_wild_lentil", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_LETTUCE = registerHarvestcraftBlock("harvestcraft_wild_lettuce", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_MILLET = registerHarvestcraftBlock("harvestcraft_wild_millet", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_MULBERRY = registerHarvestcraftBlock("harvestcraft_wild_mulberry", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_MUSTARDSEEDS = registerHarvestcraftBlock("harvestcraft_wild_mustardseeds", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_OATS = registerHarvestcraftBlock("harvestcraft_wild_oats", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_OKRA = registerHarvestcraftBlock("harvestcraft_wild_okra", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ONION = registerHarvestcraftBlock("harvestcraft_wild_onion", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_PARSNIP = registerHarvestcraftBlock("harvestcraft_wild_parsnip", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_PEANUT = registerHarvestcraftBlock("harvestcraft_wild_peanut", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_PEAS = registerHarvestcraftBlock("harvestcraft_wild_peas", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_PINEAPPLE = registerHarvestcraftBlock("harvestcraft_wild_pineapple", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_QUINOA = registerHarvestcraftBlock("harvestcraft_wild_quinoa", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RADISH = registerHarvestcraftBlock("harvestcraft_wild_radish", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RASPBERRY = registerHarvestcraftBlock("harvestcraft_wild_raspberry", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RHUBARB = registerHarvestcraftBlock("harvestcraft_wild_rhubarb", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RICE = registerHarvestcraftBlock("harvestcraft_wild_rice", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RUTABAGA = registerHarvestcraftBlock("harvestcraft_wild_rutabaga", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_RYE = registerHarvestcraftBlock("harvestcraft_wild_rye", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SCALLION = registerHarvestcraftBlock("harvestcraft_wild_scallion", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SESAMESEEDS = registerHarvestcraftBlock("harvestcraft_wild_sesameseeds", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SISAL = registerHarvestcraftBlock("harvestcraft_wild_sisal", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SOYBEAN = registerHarvestcraftBlock("harvestcraft_wild_soybean", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SPINACH = registerHarvestcraftBlock("harvestcraft_wild_spinach", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SPICELEAF = registerHarvestcraftBlock("harvestcraft_wild_spiceleaf", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_STRAWBERRY = registerHarvestcraftBlock("harvestcraft_wild_strawberry", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_SWEETPOTATO = registerHarvestcraftBlock("harvestcraft_wild_sweetpotato", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TARO = registerHarvestcraftBlock("harvestcraft_wild_taro", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TEALEAF = registerHarvestcraftBlock("harvestcraft_wild_tealeaf", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TOMATILLO = registerHarvestcraftBlock("harvestcraft_wild_tomatillo", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TOMATO = registerHarvestcraftBlock("harvestcraft_wild_tomato", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_TURNIP = registerHarvestcraftBlock("harvestcraft_wild_turnip", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_WATERCHESTNUT = registerHarvestcraftBlock("harvestcraft_wild_waterchestnut", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_WHITEMUSHROOM = registerHarvestcraftBlock("harvestcraft_wild_whitemushroom", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_WINTERSQUASH = registerHarvestcraftBlock("harvestcraft_wild_wintersquash", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> HARVESTCRAFT_WILD_ZUCCHINI = registerHarvestcraftBlock("harvestcraft_wild_zucchini", () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
    //----------------------------------------------------------------------------------------------
    private static <T extends Block> RegistryObject<T> registerMinecraftBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (Configuration.ENABLE_MINECRAFT.get()) {
            registerBlockItem(name, toReturn);
            //Wildplants.LOGGER.debug("register-blocks-minecraft");
        }
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerImmersiveEngineeringBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (Configuration.LOADED_IMMERSIVEENGINEERING) {
            registerBlockItem(name, toReturn);
            //Wildplants.LOGGER.debug("register-blocks-immersiveengineering");
        }
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerVeggieWayBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (Configuration.LOADED_VEGGIE_WAY) {
            registerBlockItem(name, toReturn);
            //Wildplants.LOGGER.debug("register-blocks-veggie_way");
        }
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerEnhancedFarmingBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (Configuration.LOADED_ENHANCEDFARMING) {
            registerBlockItem(name, toReturn);
            //Wildplants.LOGGER.debug("register-blocks-enhancedfarming");
        }
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerHarvestcraftBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (Configuration.LOADED_HARVESTCRAFT) {
            registerBlockItem(name, toReturn);
            //Wildplants.LOGGER.debug("register-blocks-harvestcraft");
        }
        return toReturn;
    }

    //----------------------------------------------------------------------------------------------

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(Wildplants.CREATIVE_MODE_TAB)));
        //Wildplants.LOGGER.debug("register-block-ttems");
    }
}
