package net.minecraft.world.level.block;

import net.minecraft.sounds.SoundEffect;
import net.minecraft.sounds.SoundEffects;
import net.minecraft.world.level.block.state.BlockBase;

public class BlockWoodButton extends BlockButtonAbstract {

    protected BlockWoodButton(BlockBase.Info blockbase_info) {
        super(true, blockbase_info);
    }

    @Override
    protected SoundEffect getSound(boolean flag) {
        return flag ? SoundEffects.WOODEN_BUTTON_CLICK_ON : SoundEffects.WOODEN_BUTTON_CLICK_OFF;
    }
}
