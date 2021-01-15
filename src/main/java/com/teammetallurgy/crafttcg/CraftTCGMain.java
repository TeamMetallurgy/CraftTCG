package com.teammetallurgy.crafttcg;

import com.teammetallurgy.crafttcg.client.ClientHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("crafttcg")
public class CraftTCGMain {
    public static final String MOD_ID = "crafttcg";

    public static final ItemGroup GROUP = new ItemGroup(MOD_ID){
        @Override
        public ItemStack createIcon(){
            return new ItemStack(Items.CHAIN);
        }
    };

    public CraftTCGMain(){
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    private void setup(final FMLCommonSetupEvent event){}

    private void clientSetup(final FMLClientSetupEvent event){
        ClientHandler.init();
    }
}
