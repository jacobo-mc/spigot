package net.minecraft.world.item.enchantment;

import net.minecraft.world.entity.EnumItemSlot;

public class EnchantmentSweeping extends Enchantment {

    public EnchantmentSweeping(Enchantment.Rarity enchantment_rarity, EnumItemSlot... aenumitemslot) {
        super(enchantment_rarity, EnchantmentSlotType.WEAPON, aenumitemslot);
    }

    @Override
    public int getMinCost(int i) {
        return 5 + (i - 1) * 9;
    }

    @Override
    public int getMaxCost(int i) {
        return this.getMinCost(i) + 15;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    public static float getSweepingDamageRatio(int i) {
        return 1.0F - 1.0F / (float) (i + 1);
    }
}
