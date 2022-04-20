package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

import java.util.Random;

public class Warrior extends Hero {

    public Warrior(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        if (this.getHealth() > 0 && boss.getHealth() > 0) {
            
            }
    }
}
