package wks.wolfkidsounds.wildplants.block;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.block.FlowerBlock;
import wks.wolfkidsounds.wildplants.Wildplants;

public class WildCropBlock extends FlowerBlock {
    public WildCropBlock(MobEffect suspiciousStewEffect, int effectDuration, Properties properties) {
        super(suspiciousStewEffect, effectDuration, properties);
        Wildplants.LOGGER.debug("configure-cropblock");
    }
}
