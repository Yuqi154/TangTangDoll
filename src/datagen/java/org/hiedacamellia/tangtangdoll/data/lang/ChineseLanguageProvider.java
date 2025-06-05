package org.hiedacamellia.tangtangdoll.data.lang;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.hiedacamellia.tangtangdoll.TangTangDoll;
import org.hiedacamellia.tangtangdoll.registries.TTDBlock;
import org.hiedacamellia.tangtangdoll.registries.TTDItem;

public class ChineseLanguageProvider extends LanguageProvider {

    public ChineseLanguageProvider(PackOutput output) {
        super(output, TangTangDoll.MODID, "zh_cn");
    }
//玩偶名字和标签 中文
    @Override
    protected void addTranslations() {

        add("item_group.tangtangdoll", "糖糖玩偶");

        add(TTDItem.RANDOM.get(),"玩偶盲盒");

        addWithTooltip(TTDBlock.MISS_HEIHU.get(), "§l§c玩偶","§l§c赞助者:Miss_Heihu");
        addWithTooltip(TTDBlock.BILIBILI_3739055.get(), "§l§c玩偶","§l§c作者:Bilibili_3739055");
        addWithTooltip(TTDBlock.DOLL_HD.get(), "§l§b玩偶","§l§c作者:Bilibili_3739055");
        addWithTooltip(TTDBlock.STAUR_XIAOLE.get(), "§l§c玩偶","§l§c赞助者:Staur_Xiaole");
        addWithTooltip(TTDBlock.ENMUSUBI.get(), "§l§c玩偶","§l§c赞助者:Enmusubi");
        addWithTooltip(TTDBlock.RAT_ZACK_.get(), "§l§c玩偶","§l§c赞助者:Ray_Zack_");
        addWithTooltip(TTDBlock.WZNYQP.get(), "§l§c玩偶","§l§c赞助者:WZNYQP");
        addWithTooltip(TTDBlock.BKKUY.get(), "§l§b玩偶","§l§bCV:bkkuy");
        addWithTooltip(TTDBlock._17SIR.get(), "§l§b玩偶","§l§bCV:17sir");
        addWithTooltip(TTDBlock.MIAN_BAO_OVO.get(), "§l§b玩偶","§l§bCV:Mian_Bao_OvO");
        addWithTooltip(TTDBlock.LINGHUAHUAA.get(), "§l§c玩偶","§l§c赞助者:linghuahuaa");
        addWithTooltip(TTDBlock.DAIDAI.get(), "§l§c玩偶","§l§c赞助者:DaiDai");
        addWithTooltip(TTDBlock.BA_GA1.get(), "§l§c玩偶","§l§c赞助者:ba_ga1");
        addWithTooltip(TTDBlock.APRIL_YIN.get(), "§l§c玩偶","§l§c赞助者:April_Yin");
        addWithTooltip(TTDBlock.MAOAOMO.get(), "§l§b玩偶","§l§bCV:maoaomo");
        addWithTooltip(TTDBlock.NAN_CG.get(), "§l§c玩偶","§l§c赞助者:Nan_cg");
        addWithTooltip(TTDBlock.STAUR_DIUDIU.get(), "§l§c玩偶","§l§c任务编辑:Staur_diudiu");
        addWithTooltip(TTDBlock.HAOJIUJING.get(), "§l§B玩偶","§l§BCV:HaoJiujing");
        addWithTooltip(TTDBlock.SONG_YING.get(), "§l§b玩偶","§l§cB站主播:Song_ying 直播间ID:32171565");


    }

    public void addWithTooltip(Block key, String name, String tooltip) {
        this.add(key.getDescriptionId(), name);
        this.add(key.getDescriptionId()+".desc", tooltip);
    }
}

