package org.hiedacamellia.tangtangdoll.data.lang;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
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

        addWithTooltip(TTDBlock.DOLL.get(), "玩偶","糖糖");
        addWithTooltip(TTDBlock.DOLL_SMALL.get(), "小号玩偶","糖糖");
        addWithTooltip(TTDBlock.DOLL_SMALL_HD.get(), "小号玩偶（高清）","糖糖");

    }


    public void addWithTooltip(Block key, String name, String tooltip) {
        this.add(key.getDescriptionId(), name);
        this.add(key.getDescriptionId()+".desc", tooltip);
    }
}
