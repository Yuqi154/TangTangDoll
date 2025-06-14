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

        add(TTDBlock.MISS_HEIHU.get(), "Doll");
        add(TTDBlock.BILIBILI_3739055.get(), "Doll");
        add(TTDBlock.DOLL_HD.get(), "Doll HD");
        add(TTDBlock.STAUR_XIAOLE.get(), "Doll HD");
        add(TTDBlock.ENMUSUBI.get(), "Doll HD");
        add(TTDBlock.RAT_ZACK_.get(), "Doll");
        add(TTDBlock.WZNYQP.get(), "Doll");
        add(TTDBlock.BKKUY.get(), "Doll");
        add(TTDBlock._17SIR.get(), "Doll");
        add(TTDBlock.MIAN_BAO_OVO.get(), "Doll");
        add(TTDBlock.LINGHUAHUAA.get(), "Doll");
        add(TTDBlock.DAIDAI.get(), "Doll");
        add(TTDBlock.BA_GA1.get(), "Doll");
        add(TTDBlock.APRIL_YIN.get(), "Doll");
        add(TTDBlock.MAOAOMO.get(), "Doll");
        add(TTDBlock.NAN_CG.get(), "Doll");
        add(TTDBlock.STAUR_DIUDIU.get(), "Doll");
        add(TTDBlock.HAOJIUJING.get(), "Doll");
        add(TTDBlock.SONG_YING.get(), "Doll");
        add(TTDBlock.SUR07921.get(), "Doll");
        add(TTDBlock.NANZHEN1.get(), "Doll");
        add(TTDBlock.LONGJINGCHA97.get(), "Doll");
        add(TTDBlock.MANGSHE.get(), "Doll");
        add(TTDBlock.HUALIANYU.get(), "Doll");
        add(TTDBlock.MUDKIP521.get(), "Doll");
        add(TTDBlock.ZE_ZE666.get(), "Doll");
        add(TTDBlock.WHITE_BEAR0.get(), "Doll");
        add(TTDBlock.WHITE_BEAR011.get(), "Doll");
        add(TTDBlock.GUI_SHU0.get(), "Doll");
        add(TTDBlock.GUI_SHU01.get(), "Doll");
        add(TTDBlock.AAA.get(), "Doll");
        add(TTDBlock.AYOOOQAQ.get(), "Doll");
        add(TTDBlock.YIN_88.get(), "Doll");
        add(TTDBlock.YYLLA_A.get(), "Doll");
        add(TTDBlock.SERVANIGHT.get(), "Doll");
        add(TTDBlock.FSFTE.get(), "Doll");

    }
}
