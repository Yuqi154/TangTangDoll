package org.hiedacamellia.tangtangdoll;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.hiedacamellia.tangtangdoll.registries.TTDBlock;
import org.hiedacamellia.tangtangdoll.registries.TTDItem;
import org.hiedacamellia.tangtangdoll.registries.TTDTab;
import org.slf4j.Logger;

@Mod(TangTangDoll.MODID)
public class TangTangDoll
{
    public static final String MODID = "tangtangdoll";
    private static final Logger LOGGER = LogUtils.getLogger();

    public TangTangDoll(IEventBus modEventBus, ModContainer modContainer)
    {

        TTDBlock.BLOCKS.register(modEventBus);
        TTDItem.register(modEventBus);
        TTDTab.REGISTRY.register(modEventBus);

    }

}
