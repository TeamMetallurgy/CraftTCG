package com.teammetallurgy.crafttcg.objects;

import com.teammetallurgy.crafttcg.CraftTCGMain;
import jdk.nashorn.internal.runtime.options.LoggingOption;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.LootParameterSets;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.spi.LoggerRegistry;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.logging.Logger;

public class BoosterItem extends Item {
    private final ResourceLocation lootTable;

    public BoosterItem(ResourceLocation lootTable) {
        super(new Item.Properties().group(CraftTCGMain.GROUP));
        this.lootTable = lootTable;
    }

    @Override
    @Nonnull
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, @Nonnull Hand hand) {
        ItemStack heldStack = player.getHeldItem(hand);
        if(world.isRemote || this.lootTable == null){
            return new ActionResult<>(ActionResultType.FAIL, heldStack);
        }

        if (world instanceof ServerWorld) {
            ServerWorld worldServer = (ServerWorld) world;
            LootContext.Builder builder = new LootContext.Builder(worldServer);
            List<ItemStack> loot = worldServer.getServer().getLootTableManager().getLootTableFromLocation(this.lootTable).generate(builder.build(LootParameterSets.EMPTY));
            if (!loot.isEmpty()) {
                for(ItemStack lootStack : loot){
                    //player.sendStatusMessage(new TranslationTextComponent("aquaculture.loot.open", lootStack.getDisplayName()).mergeStyle(TextFormatting.YELLOW), true);
                    this.giveItem(player, lootStack);
                }
                heldStack.shrink(1);
                return new ActionResult<>(ActionResultType.SUCCESS, heldStack);
            }
        }

        return super.onItemRightClick(world, player, hand);
    }

    private void giveItem(PlayerEntity player, @Nonnull ItemStack stack) {
        if (!player.inventory.addItemStackToInventory(stack)) {
            player.dropItem(stack, false);
        } else if (player instanceof ServerPlayerEntity) {
            ((ServerPlayerEntity) player).sendContainerToPlayer(player.container);
        }
    }
}

