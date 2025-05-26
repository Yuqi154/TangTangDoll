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

    }
}
