package com.krzesimir42.rpgwitchmodpackmod;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public
class ModSpells {
    public static final DeferredRegister<Spell> SPELLS = DeferredRegister.create(ForgeRegistries.SPELLS, "rpgwitchmodpackmod");

    public static final RegistryObject<Spell> FIREBALL = SPELLS.register("fireball", () -> new FireballSpell());
    public static final RegistryObject<Spell> HEAL = SPELLS.register("heal", () -> new HealSpell());

    public static void register(IEventBus eventBus) {
        SPELLS.register(eventBus);
    }
}
