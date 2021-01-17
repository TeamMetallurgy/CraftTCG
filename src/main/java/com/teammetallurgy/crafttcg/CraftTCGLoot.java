package com.teammetallurgy.crafttcg;

import com.teammetallurgy.crafttcg.objects.CraftTCGItems;
import com.teammetallurgy.crafttcg.objects.CraftTCGItems;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Items;
import net.minecraft.loot.ConstantRange;
import net.minecraft.loot.ItemLootEntry;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.datafix.fixes.MinecartEntityTypes;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CraftTCGMain.MOD_ID)
public class CraftTCGLoot {

    public static final ResourceLocation CORE_SET = register("sets/core");

    private static ResourceLocation register(String path) {
        return LootTables.register(new ResourceLocation(CraftTCGMain.MOD_ID, path));
    }

    @SubscribeEvent
    public static void onLootLoad(LootTableLoadEvent e) {

        if(e.getName().equals(new ResourceLocation("minecraft", "entities/creeper"))) {
            e.getTable().addPool(LootPool.builder().rolls(ConstantRange.of(1)).addEntry(ItemLootEntry.builder(CraftTCGItems.CORE_BOOSTER).weight(90)).addEntry(ItemLootEntry.builder(Items.AIR).weight(10)).build());
        }
    }
}


