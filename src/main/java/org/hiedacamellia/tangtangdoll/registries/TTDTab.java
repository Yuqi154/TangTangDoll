package org.hiedacamellia.tangtangdoll.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.hiedacamellia.tangtangdoll.TangTangDoll;

public class TTDTab {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TangTangDoll.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TANG_TANG_DOLL = REGISTRY.register("tangtangdoll",
            () -> CreativeModeTab.builder().title(Component.translatable("item_group.tangtangdoll")).icon(() -> new ItemStack(TTDItem.DOLL.get())).displayItems((parameters, tabData) -> {
                        for (DeferredHolder<Item, ? extends Item> item: TTDItem.REGISTRY.getEntries()){
                            tabData.accept(item.get());
                        }
                    })
                    .build());
}
