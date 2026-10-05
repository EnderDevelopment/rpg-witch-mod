package com.krzesimir42.rpgwitchmodpackmod;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public
class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "rpgwitchmodpackmod");

    public static final RegistryObject<EntityType<WitchEntity>> WITCH = ENTITIES.register("witch", () -> EntityType.Builder.of(WitchEntity::new, MobCategory.CREATURE).sized(0.6f, 1.8f).build("witch"));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
