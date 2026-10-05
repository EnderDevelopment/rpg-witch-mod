package com.krzesimir42.rpgwitchmodpackmod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public
class ModCreativeModeTab {
    public static final CreativeModeTab RPG_WITCH_TAB = new CreativeModeTab("rpg_witch_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.WITCH_STAFF.get());
        }
    };
}
