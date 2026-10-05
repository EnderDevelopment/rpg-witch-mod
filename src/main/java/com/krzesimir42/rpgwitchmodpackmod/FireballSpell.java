package com.krzesimir42.rpgwitchmodpackmod;

public
class FireballSpell implements Spell {
    @Override
    public void cast(Level level, Player player) {
        Fireball fireball = new Fireball(level, player);
        level.addFreshEntity(fireball);
    }
}
