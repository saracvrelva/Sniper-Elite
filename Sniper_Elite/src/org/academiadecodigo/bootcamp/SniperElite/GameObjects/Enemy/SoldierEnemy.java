package org.academiadecodigo.bootcamp.SniperElite.GameObjects.Enemy;

import org.academiadecodigo.bootcamp.SniperElite.GameObjects.Enemy.Enemy;

public class SoldierEnemy extends Enemy {

    public SoldierEnemy(){
        super();
    }

    @Override
    public void getMessage() {
        super.getMessage();
        System.out.println("I'm a Soldier Enemy! Try your best!\n");
    }

}
