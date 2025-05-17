package org.hiedacamellia.tangtangdoll.data;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.hiedacamellia.tangtangdoll.TangTangDoll;
import org.hiedacamellia.tangtangdoll.data.lang.ChineseLanguageProvider;
import org.hiedacamellia.tangtangdoll.data.lang.EnglishLanguageProvider;
import org.hiedacamellia.tangtangdoll.data.provider.TTDStateProvider;

@EventBusSubscriber(modid = TangTangDoll.MODID, bus = EventBusSubscriber.Bus.MOD)
public class Data {
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        var gen = event.getGenerator();
        var packOutput = gen.getPackOutput();
        var helper = event.getExistingFileHelper();
        gen.addProvider(event.includeClient(), new EnglishLanguageProvider(packOutput));
        gen.addProvider(event.includeClient(), new ChineseLanguageProvider(packOutput));
        gen.addProvider(event.includeClient(), new TTDStateProvider(packOutput, helper));

    }
}