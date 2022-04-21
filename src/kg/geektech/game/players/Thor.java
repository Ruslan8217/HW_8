package kg.geektech.game.players;

import java.util.Random;

public class Thor extends Hero {

    public Thor(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.DEAFEN);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        if (this.getHealth() > 0 && boss.getHealth() > 0) {
            Random random = new Random();
            boolean noHummer = random.nextBoolean();
            if (!noHummer) {
                System.out.println("Thor оглушил Boss");
            } else {
                System.out.println("Молот Thorа подвел");
            }
        }
    }

}


