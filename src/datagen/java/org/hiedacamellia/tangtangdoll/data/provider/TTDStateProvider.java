package org.hiedacamellia.tangtangdoll.data.provider;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.hiedacamellia.tangtangdoll.TangTangDoll;
import org.hiedacamellia.tangtangdoll.registries.TTDBlock;

public class TTDStateProvider extends BlockStateProvider {
    public TTDStateProvider(PackOutput gen, ExistingFileHelper helper) {
        super(gen, TangTangDoll.MODID, helper);
    }
//注册物品
    @Override
    protected void registerStatesAndModels() {

        horizontalBlock(TTDBlock.DOLL.get(),models().getExistingFile(modLoc("block/doll")));
        horizontalBlock(TTDBlock.DOLL_SMALL.get(),models().getExistingFile(modLoc("block/doll_small")));
        horizontalBlock(TTDBlock.DOLL_SMALL_HD.get(),models().getExistingFile(modLoc("block/doll_small_hd")));
        horizontalBlock(TTDBlock.MISS_HEIHU.get(),models().getExistingFile(modLoc("block/miss_heihu")));
        horizontalBlock(TTDBlock.BILIBILI_3739055.get(),models().getExistingFile(modLoc("block/bilibili_3739055")));
        horizontalBlock(TTDBlock.DOLL_HD.get(),models().getExistingFile(modLoc("block/doll_hd")));
        horizontalBlock(TTDBlock.STAUR_XIAOLE.get(),models().getExistingFile(modLoc("block/staur_xiaole")));
        horizontalBlock(TTDBlock.ENMUSUBI.get(),models().getExistingFile(modLoc("block/enmusubi")));
        horizontalBlock(TTDBlock.RAT_ZACK_.get(),models().getExistingFile(modLoc("block/ray_zack_")));
        horizontalBlock(TTDBlock.WZNYQP.get(),models().getExistingFile(modLoc("block/wznyqp")));
        horizontalBlock(TTDBlock.BKKUY.get(),models().getExistingFile(modLoc("block/bkkuy")));
        horizontalBlock(TTDBlock._17SIR.get(),models().getExistingFile(modLoc("block/_17sir")));
        horizontalBlock(TTDBlock.MIAN_BAO_OVO.get(),models().getExistingFile(modLoc("block/miao_bao_ovo")));

    }
}