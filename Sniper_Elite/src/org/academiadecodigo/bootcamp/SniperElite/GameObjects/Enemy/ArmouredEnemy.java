package org.academiadecodigo.bootcamp.SniperElite.GameObjects.Enemy;

import org.academiadecodigo.bootcamp.SniperElite.GameObjects.Enemy.Enemy;

public class ArmouredEnemy extends Enemy {

    private int armour;

    public ArmouredEnemy(){
        super();
        this.armour = 5;

    }

    @Override
    public void getMessage() {
        super.getMessage();
        System.out.println("I'm an Armoured Enemy! You can't kill me!\n");
    }

    @Override
    public void hit(int numberOfHits) {
        int hit = (int) (Math.random() * 2);
        switch (hit) {
            case 0:
            if (armour > 1) {
                System.out.println("BAAANG!");
                armour -= numberOfHits;
                System.out.println("You hit my armour! Keep trying! I still have "+ getArmour() + " points of armour and " + getHealth() + " points of health!\n");
                break;
            } else if (armour == 1){
                System.out.println("BAAANG!");
                armour -= numberOfHits;
                System.out.println("You destroyed my armour! I still have " + getHealth() + " points of health!\n");
                break;
            }
            case 1:
                System.out.println("You failed! Keep trying!\n");
        }
        if(armour == 0) {
            super.hit(numberOfHits);
        }
    }

    public int getArmour() {
        return armour;
    }
}
