package org.hiedacamellia.tangtangdoll.registries;

import net.minecraft.world.item.BlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.hiedacamellia.tangtangdoll.TangTangDoll;

@SuppressWarnings("unused")
public class TTDItem {
    public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TangTangDoll.MODID);

    public static final DeferredItem<BlockItem> DOLL = REGISTRY.registerSimpleBlockItem("doll", TTDBlock.DOLL);
    public static final DeferredItem<BlockItem> DOLL_SMALL = REGISTRY.registerSimpleBlockItem("doll_small", TTDBlock.DOLL_SMALL);

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}