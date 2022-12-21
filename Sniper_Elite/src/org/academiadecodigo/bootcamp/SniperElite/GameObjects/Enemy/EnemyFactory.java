package org.academiadecodigo.bootcamp.SniperElite.GameObjects.Enemy;

import org.academiadecodigo.bootcamp.SniperElite.GameObjects.Enemy.ArmouredEnemy;
import org.academiadecodigo.bootcamp.SniperElite.GameObjects.Enemy.Enemy;
import org.academiadecodigo.bootcamp.SniperElite.GameObjects.Enemy.SoldierEnemy;

public class EnemyFactory {

    // method to return randomly an enemy of the type Armoured or Soldier
    public static Enemy getNewEnemy() {
        int enemyType = (int) (Math.random() *2);
        if (enemyType == 0) {
            return new SoldierEnemy();
        } else if (enemyType == 1) {
            return new ArmouredEnemy();
        }
        return null;
    }
}
