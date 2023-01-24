package wks.wolfkidsounds.wildplants.registry;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import wks.wolfkidsounds.wildplants.Wildplants;
import wks.wolfkidsounds.wildplants.block.WildCropBlock;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Wildplants.MOD_ID);

    // Minecraft
    public static final RegistryObject<Block> MINECRAFT_WILD_WHEAT = BLOCKS.register("minecraft_wild_wheat",
            () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));

    public static final RegistryObject<Block> MINECRAFT_WILD_CARROTS = BLOCKS.register("minecraft_wild_carrots",
            () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));

    public static final RegistryObject<Block> MINECRAFT_WILD_POTATOES = BLOCKS.register("minecraft_wild_potatoes",
            () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));

    public static final RegistryObject<Block> MINECRAFT_WILD_BEETROOTS = BLOCKS.register("minecraft_wild_beetroots",
            () -> new WildCropBlock(MobEffects.GLOWING, 1, Block.Properties.copy(Blocks.TALL_GRASS)));
}
