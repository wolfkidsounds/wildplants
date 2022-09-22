package wks.wolfkidsounds.wildplants.world.immersiveengineering;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import wks.wolfkidsounds.wildplants.config.features.ImmersiveEngineeringConfig;

import java.util.List;
import java.util.Set;

public class ImmersiveEngineeringWildplantsGeneration {

    public static void generateWildHemp(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.getType(ImmersiveEngineeringConfig.HEMP_BIOME_TYPE_IMMERSIVEENINEERING.get()))) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(ImmersiveEngineeringPlacedFeatures.IMMERSIVEENGINEERING_WILD_HEMP_PLACED);
        }
    }
}
