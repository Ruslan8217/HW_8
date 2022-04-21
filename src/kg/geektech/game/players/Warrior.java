package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Warrior extends Hero {

    public Warrior(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        setDamage(getDamage());
        if (this.getHealth() > 0 && boss.getHealth() > 0) {
            int criticalDamage = RPG_Game.random.nextInt(2) + 2;
            int fight  = (getDamage() * criticalDamage);
            if (boss.getHealth() - fight > 0){
                boss.setHealth(boss.getHealth() - (fight - getDamage()));
                System.out.println("Warrior применил CRITICAL DAMAGE " + fight);
            }

            }
    }
}
