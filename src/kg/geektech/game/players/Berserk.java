package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

import java.util.Random;

public class Berserk extends Hero {

    private int savedDamage;

    public Berserk(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    public int getSavedDamage() {
        return savedDamage;
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        if (this.getHealth() > 0 && boss.getHealth() > 0){
           savedDamage = RPG_Game.random.nextInt(boss.getDamage() + 1);
           if (boss.getHealth() - savedDamage > 0){
              boss.setHealth(boss.getHealth() - savedDamage);
               System.out.println("Berserk вернул плюс к своему урону " + savedDamage + " урона" );
           }
        }
    }
}
