package org.hiedacamellia.tangtangdoll.common.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.items.ItemHandlerHelper;
import org.hiedacamellia.tangtangdoll.registries.TTDItem;


public class RandomDoll extends Item {
    public RandomDoll(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        var entries = TTDItem.REGISTRY.getEntries();
        var holder = entries.stream().toList().get(level.random.nextInt(entries.size()));
        ItemStack itemInHand = player.getItemInHand(usedHand);
        itemInHand.shrink(1);
        ItemHandlerHelper.giveItemToPlayer(player,new ItemStack(holder));
        return InteractionResultHolder.consume(itemInHand);
    }
}
