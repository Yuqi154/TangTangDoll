package org.hiedacamellia.tangtangdoll.registries;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.hiedacamellia.tangtangdoll.TangTangDoll;
import org.hiedacamellia.tangtangdoll.common.item.DollItem;
import org.hiedacamellia.tangtangdoll.common.item.RandomDoll;

//注册物品注意最后
@SuppressWarnings("unused")
public class TTDItem {
    public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TangTangDoll.MODID);

    public static final DeferredItem<Item> RANDOM = REGISTRY.register("random", ()->new RandomDoll(new Item.Properties()));

    public static final DeferredItem<BlockItem> MISS_HEIHU = REGISTRY.register("miss_heihu", ()->new DollItem(TTDBlock.MISS_HEIHU.get()));
    public static final DeferredItem<BlockItem> BILIBILI_3739055 = REGISTRY.register("bilibili_3739055", ()->new DollItem(TTDBlock.BILIBILI_3739055.get()));
    public static final DeferredItem<BlockItem> DOLL_HD = REGISTRY.register("doll_hd", ()->new DollItem(TTDBlock.DOLL_HD.get()));
    public static final DeferredItem<BlockItem> STAUR_XIAOLE = REGISTRY.register("staur_xiaole", ()->new DollItem(TTDBlock.STAUR_XIAOLE.get()));
    public static final DeferredItem<BlockItem> ENMUSUBI = REGISTRY.register("enmusubi", ()->new DollItem(TTDBlock.ENMUSUBI.get()));
    public static final DeferredItem<BlockItem> RAT_ZACK_ = REGISTRY.register("ray_zack_", ()->new DollItem(TTDBlock.RAT_ZACK_.get()));
    public static final DeferredItem<BlockItem> WZNYQP = REGISTRY.register("wznyqp", ()->new DollItem(TTDBlock.WZNYQP.get()));
    public static final DeferredItem<BlockItem> BKKUY = REGISTRY.register("bkkuy", ()->new DollItem(TTDBlock.BKKUY.get()));
    public static final DeferredItem<BlockItem> _17SIR = REGISTRY.register("_17sir", ()->new DollItem(TTDBlock._17SIR.get()));
    public static final DeferredItem<BlockItem> MIAN_BAO_OVO = REGISTRY.register("miao_bao_ovo", ()->new DollItem(TTDBlock.MIAN_BAO_OVO.get()));
    public static final DeferredItem<BlockItem> LINGHUAHUAA = REGISTRY.register("linghuahuaa", ()->new DollItem(TTDBlock.LINGHUAHUAA.get()));
    public static final DeferredItem<BlockItem> DAIDAI = REGISTRY.register("daidai", ()->new DollItem(TTDBlock.DAIDAI.get()));
    public static final DeferredItem<BlockItem> BA_GA1 = REGISTRY.register("ba_ga1", ()->new DollItem(TTDBlock.BA_GA1.get()));
    public static final DeferredItem<BlockItem> APRIL_YIN = REGISTRY.register("april_yin", ()->new DollItem(TTDBlock.APRIL_YIN.get()));
    public static final DeferredItem<BlockItem> MAOAOMO = REGISTRY.register("maoaomo", ()->new DollItem(TTDBlock.MAOAOMO.get()));
    public static final DeferredItem<BlockItem> NAN_CG = REGISTRY.register("nan_cg", ()->new DollItem(TTDBlock.NAN_CG.get()));
    public static final DeferredItem<BlockItem> STAUR_DIUDIU = REGISTRY.register("staur_diudiu", ()->new DollItem(TTDBlock.STAUR_DIUDIU.get()));
    public static final DeferredItem<BlockItem> HAOJIUJING = REGISTRY.register("haojiujing", ()->new DollItem(TTDBlock.HAOJIUJING.get()));
    public static final DeferredItem<BlockItem> SONG_YING = REGISTRY.register("song_ying", ()->new DollItem(TTDBlock.SONG_YING.get()));
    public static final DeferredItem<BlockItem> SUR07921 = REGISTRY.register("sur07921", ()->new DollItem(TTDBlock.SUR07921.get()));
    public static final DeferredItem<BlockItem> NANZHEN1 = REGISTRY.register("nanzhen1", ()->new DollItem(TTDBlock.NANZHEN1.get()));
    public static final DeferredItem<BlockItem> LONGJINGCHA97 = REGISTRY.register("longjingcha97", ()->new DollItem(TTDBlock.LONGJINGCHA97.get()));
    public static final DeferredItem<BlockItem> MANGSHE = REGISTRY.register("mangshe", ()->new DollItem(TTDBlock.MANGSHE.get()));
    public static final DeferredItem<BlockItem> HUALIANYU = REGISTRY.register("hualianyu", ()->new DollItem(TTDBlock.HUALIANYU.get()));
    public static final DeferredItem<BlockItem> MUDKIP521 = REGISTRY.register("mudkip521", ()->new DollItem(TTDBlock.MUDKIP521.get()));
    public static final DeferredItem<BlockItem> ZE_ZE666 = REGISTRY.register("ze_ze666", ()->new DollItem(TTDBlock.ZE_ZE666.get()));
    public static final DeferredItem<BlockItem> WHITE_BEAR0 = REGISTRY.register("white_bear0", ()->new DollItem(TTDBlock.WHITE_BEAR0.get()));
    public static final DeferredItem<BlockItem> WHITE_BEAR011 = REGISTRY.register("white_bear011", ()->new DollItem(TTDBlock.WHITE_BEAR011.get()));
    public static final DeferredItem<BlockItem> GUI_SHU0 = REGISTRY.register("gui_shu0", ()->new DollItem(TTDBlock.GUI_SHU0.get()));
    public static final DeferredItem<BlockItem> GUI_SHU01 = REGISTRY.register("gui_shu01", ()->new DollItem(TTDBlock.GUI_SHU01.get()));
    public static final DeferredItem<BlockItem> AAA = REGISTRY.register("aaa", ()->new DollItem(TTDBlock.AAA.get()));
    public static final DeferredItem<BlockItem> YIN_88 = REGISTRY.register("yin_88", ()->new DollItem(TTDBlock.YIN_88.get()));
    public static final DeferredItem<BlockItem> SERVANIGHT = REGISTRY.register("servanight", ()->new DollItem(TTDBlock.SERVANIGHT.get()));
    public static final DeferredItem<BlockItem> FSFTE = REGISTRY.register("fsfte", ()->new DollItem(TTDBlock.FSFTE.get()));
    public static final DeferredItem<BlockItem> YYLLA_A = REGISTRY.register("yylla_a", ()->new DollItem(TTDBlock.YYLLA_A.get()));


    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}