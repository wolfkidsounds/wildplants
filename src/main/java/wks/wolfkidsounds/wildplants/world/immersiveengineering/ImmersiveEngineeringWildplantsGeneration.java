package wks.wolfkidsounds.wildplants.world.immersiveengineering;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import wks.wolfkidsounds.wildplants.config.features.immersiveengineering.ImmersiveEngineeringConfig;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class ImmersiveEngineeringWildplantsGeneration {

    public static void generateWildHemp(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.getType(ImmersiveEngineeringConfig.HEMP_BIOME_TYPE_IMMERSIVEENINEERING.get()))) {
            List<Supplier<ConfiguredFeature<?, ?>>> base = event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(() -> ImmersiveEngineeringConfiguredFeatures.IMMERSIVEENGINEERING_WILD_HEMP_PATCH);
        }
    }
}
