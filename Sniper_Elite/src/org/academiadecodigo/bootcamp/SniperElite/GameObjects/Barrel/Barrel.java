package org.academiadecodigo.bootcamp.SniperElite.GameObjects.Barrel;

import org.academiadecodigo.bootcamp.SniperElite.GameObjects.Destroyable;
import org.academiadecodigo.bootcamp.SniperElite.GameObjects.GameObject;

public class Barrel extends GameObject implements Destroyable {

    // the type of the barrel determines how maxDamage it can take until it is destroyed
    private BarrelType barrelType;

    //how many shots already took
    private int currentDamage;

    // set to true when destroyed (when it took as many shots as the maxDamage
    private boolean destroyed;

    public Barrel(BarrelType barrelType) {
        this.barrelType = barrelType;
    }


    @Override
    public void hit(int numberOfDamage) {
        //randomly determines if the shot will make damage or not to the barrel
        int hit = (int) (Math.random() * 2);
        switch (hit) {
            case 0:
                //when its 0 it will hit the barrel and increases by 1 the currentDamage
                if (currentDamage < barrelType.getMaxDamage() - 1) {
                    System.out.println("BAAANG!");
                    currentDamage++;
                    System.out.println("You hit the barrel! It was hit " + currentDamage + " times! You need to hit it " + (barrelType.getMaxDamage() - this.currentDamage) + " more times ! \n");
                    break;
                }else {
                    System.out.println("BAAANG!");
                    currentDamage++;
                    System.out.println("You destroyed the barrel!\n ");
                    break;
                }
            case 1:
                System.out.println("You failed! Keep trying!\n");
                break;
        }
    }

    @Override
    public boolean isDestroyed() {
        return destroyed;
    }

    @Override
    public void getMessage() {
        System.out.println("You found a BARREL! \n \n ");
    }

    public int getCurrentDamage() {
        return currentDamage;
    }

    public BarrelType getBarrelType() {
        return barrelType;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }
}
