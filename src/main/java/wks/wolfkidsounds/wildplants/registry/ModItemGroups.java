package wks.wolfkidsounds.wildplants.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModItemGroups {
    public static final CreativeModeTab MINECRAFT_TAB = new CreativeModeTab("wildplants_minecraft_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.GRASS.asItem());
        }
    };
}
