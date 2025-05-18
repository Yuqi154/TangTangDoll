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
//玩偶名字和标签 中文
    @Override
    protected void addTranslations() {

        add("item_group.tangtangdoll", "糖糖玩偶");

        addWithTooltip(TTDBlock.DOLL.get(), "示例","这是一个示例");
        addWithTooltip(TTDBlock.DOLL_SMALL.get(), "小号示例","糖糖");
        addWithTooltip(TTDBlock.DOLL_SMALL_HD.get(), "小号示例（高清）","§l§b示例");
        addWithTooltip(TTDBlock.MISS_HEIHU.get(), "§l§b玩偶","§l§bCV:Miss_Heihu");
        addWithTooltip(TTDBlock.BILIBILI_3739055.get(), "§l§c玩偶","§l§cCV:Bilibili_3739055");
        addWithTooltip(TTDBlock.DOLL_HD.get(), "§l§b玩偶","§l§bCV:Bilibili_3739055");
        addWithTooltip(TTDBlock.STAUR_XIAOLE.get(), "§l§b玩偶","§l§bCV:Staur_Xiaole");
        addWithTooltip(TTDBlock.ENMUSUBI.get(), "§l§b玩偶","§l§bCV:Enmusubi");
        addWithTooltip(TTDBlock.RAT_ZACK_.get(), "§l§b玩偶","§l§bCV:Ray_Zack_");
        addWithTooltip(TTDBlock.WZNYQP.get(), "§l§b玩偶","§l§bCV:WZNYQP");
        addWithTooltip(TTDBlock.BKKUY.get(), "§l§b玩偶","§l§bCV:bkkuy");
        addWithTooltip(TTDBlock._17SIR.get(), "§l§b玩偶","§l§bCV:17sir");

    }

    public void addWithTooltip(Block key, String name, String tooltip) {
        this.add(key.getDescriptionId(), name);
        this.add(key.getDescriptionId()+".desc", tooltip);
    }
}

