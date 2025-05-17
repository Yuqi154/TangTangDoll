package org.hiedacamellia.tangtangdoll.common.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DollItem extends BlockItem implements Equipable {
    public DollItem(Block block) {
        super(block, new Properties());
    }

    @Override
    public @NotNull EquipmentSlot getEquipmentSlot() {
        return EquipmentSlot.HEAD;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack itemstack, Item.@NotNull TooltipContext context, @NotNull List<Component> list, @NotNull TooltipFlag flag) {
        super.appendHoverText(itemstack, context, list, flag);
        String[] description = Component.translatable(itemstack.getDescriptionId()+".desc").getString().split("§n");
        for (String line : description) {
            list.add(Component.literal(line));
        }

    }
}
