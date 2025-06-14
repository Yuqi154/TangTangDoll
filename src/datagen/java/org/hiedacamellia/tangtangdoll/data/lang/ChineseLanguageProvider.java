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
        addWithTooltip(TTDBlock.SUR07921.get(), "§l§b玩偶","§l§bCV:Sur07921");
        addWithTooltip(TTDBlock.NANZHEN1.get(), "§l§c玩偶","§l§c赞助者:nanzhen1");
        addWithTooltip(TTDBlock.LONGJINGCHA97.get(), "§l§b玩偶","§l§cB站主播:longjingcha97 直播间ID:27266678");
        addWithTooltip(TTDBlock.MANGSHE.get(), "§l§c玩偶","§l§c赞助者:mangshe");
        addWithTooltip(TTDBlock.HUALIANYU.get(), "§l§c玩偶","§l§c赞助者:hualianyu");
        addWithTooltip(TTDBlock.MUDKIP521.get(), "§l§c玩偶","§l§c赞助者:mudkip521");
        addWithTooltip(TTDBlock.ZE_ZE666.get(), "§l§c玩偶","§l§c赞助者:Ze_Ze666");
        addWithTooltip(TTDBlock.WHITE_BEAR0.get(), "§l§e玩偶","§l§bB站主播:白熊White_Bear0 直播间ID:5455911");
        addWithTooltip(TTDBlock.WHITE_BEAR011.get(), "§l§e玩偶","§l§cB站主播:白熊White_Bear0 直播间ID:5455911");
        addWithTooltip(TTDBlock.GUI_SHU0.get(), "§l§e玩偶","§l§bB站主播:归属不龟速 直播间ID:1738560725");
        addWithTooltip(TTDBlock.GUI_SHU01.get(), "§l§e玩偶","§l§cB站主播:归属不龟速 直播间ID:1738560725");
        addWithTooltip(TTDBlock.AYOOOQAQ.get(), "§l§e玩偶","§l§cB站主播:桃井椰椰 直播间ID:21806608");
        addWithTooltip(TTDBlock.AAA.get(), "§l§b玩偶","§l§bCV:AAA");
        addWithTooltip(TTDBlock.YIN_88.get(), "§l§b玩偶","§l§bCV:Yin_88");
        addWithTooltip(TTDBlock.FSFTE.get(), "§l§b玩偶","§l§bCV:Fsfte");
        addWithTooltip(TTDBlock.YYLLA_A.get(), "§l§b玩偶","§l§bCV:yylla_a");
        addWithTooltip(TTDBlock.SERVANIGHT.get(), "§l§b玩偶","§l§bCV:Servanight");



    }

    public void addWithTooltip(Block key, String name, String tooltip) {
        this.add(key.getDescriptionId(), name);
        this.add(key.getDescriptionId()+".desc", tooltip);
    }
}

