package com.kalenai.planarbinding;

import com.kalenai.planarbinding.client.handler.KeyInputEventHandler;
import com.kalenai.planarbinding.handler.ConfigurationHandler;
import com.kalenai.planarbinding.init.ModBlocks;
import com.kalenai.planarbinding.init.ModItems;
import com.kalenai.planarbinding.init.Recipes;
import com.kalenai.planarbinding.proxy.IProxy;
import com.kalenai.planarbinding.reference.Reference;
import com.kalenai.planarbinding.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class PlanarBinding {

    @Mod.Instance(Reference.MOD_ID)
    public static PlanarBinding instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        proxy.registerKeybindings();

        ModItems.init();

        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

        Recipes.init();

        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        LogHelper.info("Post Initialization Complete!");
    }




}
