package com.teammetallurgy.crafttcg.objects;

import com.google.common.collect.Lists;
import com.teammetallurgy.crafttcg.CraftTCGLoot;
import com.teammetallurgy.crafttcg.CraftTCGMain;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.List;

@ObjectHolder(CraftTCGMain.MOD_ID)
@Mod.EventBusSubscriber(modid = CraftTCGMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftTCGItems {
    public static List<Item> ITEMS = Lists.newArrayList();

    public static final Item CARD_MODEL = register("card_model", new Item(new Item.Properties().group(CraftTCGMain.GROUP)));
    public static final Item CORE_BOOSTER = register("core_booster", new BoosterItem(CraftTCGLoot.CORE_SET));

    protected static Item register(String registryName, Item thisItem){
        thisItem.setRegistryName(new ResourceLocation(CraftTCGMain.MOD_ID, registryName));
        ITEMS.add(thisItem);

        return thisItem;
    }

    public static void registerItems(final RegistryEvent.Register<Item> event){
        for(Item thisItem : ITEMS){
            event.getRegistry().register(thisItem);
        }
    }
}


