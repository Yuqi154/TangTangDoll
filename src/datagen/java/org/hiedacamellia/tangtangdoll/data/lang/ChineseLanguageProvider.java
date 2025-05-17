package org.hiedacamellia.tangtangdoll.data.lang;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.hiedacamellia.tangtangdoll.TangTangDoll;
import org.hiedacamellia.tangtangdoll.registries.TTDBlock;

public class ChineseLanguageProvider extends LanguageProvider {

    public ChineseLanguageProvider(PackOutput output) {
        super(output, TangTangDoll.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {

        add("item_group.tangtangdoll", "糖糖玩偶");

        add(TTDBlock.DOLL.get(), "玩偶");
        add(TTDBlock.DOLL_SMALL.get(), "小号玩偶");
        add(TTDBlock.DOLL_SMALL_HD.get(), "小号玩偶（高清）");

    }
}
