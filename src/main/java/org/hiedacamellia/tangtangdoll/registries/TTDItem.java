package org.hiedacamellia.tangtangdoll.registries;

import net.minecraft.world.item.BlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.hiedacamellia.tangtangdoll.TangTangDoll;
import org.hiedacamellia.tangtangdoll.common.item.DollItem;

@SuppressWarnings("unused")
public class TTDItem {
    public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TangTangDoll.MODID);

    public static final DeferredItem<BlockItem> DOLL = REGISTRY.register("doll", ()->new DollItem(TTDBlock.DOLL.get()));
    public static final DeferredItem<BlockItem> DOLL_SMALL = REGISTRY.register("doll_small", ()->new DollItem(TTDBlock.DOLL_SMALL.get()));
    public static final DeferredItem<BlockItem> DOLL_SMALL_HD = REGISTRY.register("doll_small_hd", ()->new DollItem(TTDBlock.DOLL_SMALL.get()));

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}