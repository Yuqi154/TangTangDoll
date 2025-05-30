package org.hiedacamellia.tangtangdoll.registries;

import net.minecraft.world.item.BlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.hiedacamellia.tangtangdoll.TangTangDoll;
import org.hiedacamellia.tangtangdoll.common.item.DollItem;
//注册物品注意最后
@SuppressWarnings("unused")
public class TTDItem {
    public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TangTangDoll.MODID);

    public static final DeferredItem<BlockItem> DOLL = REGISTRY.register("doll", ()->new DollItem(TTDBlock.DOLL.get()));
    public static final DeferredItem<BlockItem> DOLL_SMALL = REGISTRY.register("doll_small", ()->new DollItem(TTDBlock.DOLL_SMALL.get()));
    public static final DeferredItem<BlockItem> DOLL_SMALL_HD = REGISTRY.register("doll_small_hd", ()->new DollItem(TTDBlock.DOLL_SMALL.get()));
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

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}