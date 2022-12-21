package org.academiadecodigo.bootcamp.SniperElite.GameObjects;

import org.academiadecodigo.bootcamp.SniperElite.GameObjects.Barrel.Barrel;
import org.academiadecodigo.bootcamp.SniperElite.GameObjects.Barrel.BarrelFactory;
import org.academiadecodigo.bootcamp.SniperElite.GameObjects.Barrel.BarrelType;
import org.academiadecodigo.bootcamp.SniperElite.GameObjects.Enemy.EnemyFactory;

public class GameObjectFactory {

    //method to return randomly an enemy, a Barrel or a tree
    public static GameObject getNewObject() {
        int objectType = (int) (Math.random() * 11);
        if (objectType <= 6) {
            return EnemyFactory.getNewEnemy();
        } else if (objectType < 9 && objectType > 7) {
            return BarrelFactory.getBarrel();
        } else {
            return new Tree();
        }
    }

}
