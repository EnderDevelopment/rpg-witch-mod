package com.krzesimir42.rpgwitchmodpackmod;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public
class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "rpgwitchmodpackmod");

    public static final RegistryObject<Item> WITCH_STAFF = ITEMS.register("witch_staff", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RPG_WITCH_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
