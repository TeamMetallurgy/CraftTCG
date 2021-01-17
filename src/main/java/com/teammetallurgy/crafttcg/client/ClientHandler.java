package com.teammetallurgy.crafttcg.client;

import com.teammetallurgy.crafttcg.objects.CardItem;
import com.teammetallurgy.crafttcg.objects.CraftTCGItems;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.util.ResourceLocation;

public class ClientHandler {

    public static void init(){
        ItemModelsProperties.registerProperty(CraftTCGItems.CARD_MODEL, new ResourceLocation("card"), (stack, world, entity) -> CardItem.getTextureId(stack));
    }
}
