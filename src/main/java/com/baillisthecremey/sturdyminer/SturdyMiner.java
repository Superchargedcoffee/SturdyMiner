package com.example.SturdyMiner;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = SturdyMiner.MODID, name = SturdyMiner.NAME, version = SturdyMiner.VERSION)
public class SturdyMiner
{
    public static final String MODID = "sturdyminer";
    public static final String NAME = "Sturdy Miner";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // pre-initialization
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // initialization
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	// post-initialization
    }
}
