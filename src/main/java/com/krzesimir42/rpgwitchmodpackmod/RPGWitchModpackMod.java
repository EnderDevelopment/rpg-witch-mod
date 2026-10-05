package com.krzesimir42.rpgwitchmodpackmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("rpgwitchmodpackmod")
public
class RPGWitchModpackMod {
    private static final Logger LOGGER = LogManager.getLogger();

    public RPGWitchModpackMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register our mod's ForgeRegistries
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEntities.register(modEventBus);
        ModSpells.register(modEventBus);
    }

    public static Logger getLogger() {
        return LOGGER;
    }
}
