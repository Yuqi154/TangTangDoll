package org.hiedacamellia.tangtangdoll.data.lang;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.hiedacamellia.tangtangdoll.TangTangDoll;
import org.hiedacamellia.tangtangdoll.registries.TTDBlock;

public class EnglishLanguageProvider extends LanguageProvider {

    public EnglishLanguageProvider(PackOutput output) {
        super(output, TangTangDoll.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {

        add("item_group.tangtangdoll", "Tang Tang Doll");

        addWithTooltip(TTDBlock.DOLL.get(), "Doll", "Tang Tang");
        addWithTooltip(TTDBlock.DOLL_SMALL.get(), "Small Doll", "Tang Tang");
        addWithTooltip(TTDBlock.DOLL_SMALL_HD.get(), "Small Doll HD", "Tang Tang");

    }


    public void addWithTooltip(Block key, String name, String tooltip) {
        this.add(key.getDescriptionId(), name);
        this.add(key.getDescriptionId()+".desc", name);
    }
}
