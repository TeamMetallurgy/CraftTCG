package com.teammetallurgy.crafttcg.objects;

import com.teammetallurgy.crafttcg.CardTexture;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;

import javax.annotation.Nonnull;

public class CardItem extends Item {
    public CardItem(Properties properties) {
        super(properties);
    }

    public static int getTextureId(@Nonnull ItemStack stack) {
        String textureName = stack.getTag() != null && stack.getTag().contains("artid") ? stack.getTag().getString("artid") : "none";

        return CardTexture.getCardID(textureName);
    }
}

