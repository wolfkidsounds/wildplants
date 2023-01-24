package wks.wolfkidsounds.wildplants.registry;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import wks.wolfkidsounds.wildplants.Wildplants;
import wks.wolfkidsounds.wildplants.world.settings.WildCropConfig;
import wks.wolfkidsounds.wildplants.world.settings.WildCropFeature;

public class ModBiomeFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, Wildplants.MOD_ID);
    public static final RegistryObject<Feature<WildCropConfig>> WILD_CROP = FEATURES.register("wild_plant", () -> new WildCropFeature(WildCropConfig.CODEC));
}
