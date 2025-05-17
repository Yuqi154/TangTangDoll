package org.hiedacamellia.tangtangdoll.data.lang;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.hiedacamellia.tangtangdoll.TangTangDoll;
import org.hiedacamellia.tangtangdoll.registries.TTDBlock;

public class EnglishLanguageProvider extends LanguageProvider {

    public EnglishLanguageProvider(PackOutput output) {
        super(output, TangTangDoll.MODID, "en_us");
    }
//玩偶名字和标签 英文
    @Override
    protected void addTranslations() {

        add("item_group.tangtangdoll", "Tang Tang Doll");

        add(TTDBlock.DOLL.get(), "Doll");
        add(TTDBlock.DOLL_SMALL.get(), "Small Doll");
        add(TTDBlock.DOLL_SMALL_HD.get(), "Small Doll HD");
        add(TTDBlock.MISS_HEIHU.get(), "Doll");
        add(TTDBlock.BILIBILI_3739055.get(), "Doll");

    }
}
