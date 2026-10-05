package com.krzesimir42.rpgwitchmodpackmod;

public
class HealSpell implements Spell {
    @Override
    public void cast(Level level, Player player) {
        player.heal(5.0f);
    }
}
