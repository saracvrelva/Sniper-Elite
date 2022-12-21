package org.academiadecodigo.bootcamp.SniperElite.Game;

import org.academiadecodigo.bootcamp.SniperElite.GameObjects.Barrel.Barrel;
import org.academiadecodigo.bootcamp.SniperElite.GameObjects.Enemy.ArmouredEnemy;
import org.academiadecodigo.bootcamp.SniperElite.GameObjects.Enemy.Enemy;
import org.academiadecodigo.bootcamp.SniperElite.GameObjects.GameObject;
import org.academiadecodigo.bootcamp.SniperElite.GameObjects.GameObjectFactory;
import org.academiadecodigo.bootcamp.SniperElite.GameObjects.Enemy.SoldierEnemy;
import org.academiadecodigo.bootcamp.SniperElite.GameObjects.Tree;

public class Game {

    private GameObject[] gameObjects;

    private final SniperRifle sniperRifle;

    private int shotsFired = 0;

    public Game(int numberGameObjects) {
        gameObjects = createObjects(numberGameObjects);
        sniperRifle = new SniperRifle();

    }


    public void start() {
        //for every object in gameObjects array it will verify if it is a soldier, armouredEnemy, a Tree or a Barrel
        //if it's a soldier enemy or an armouredEnemy it will print their message first, and then it will shoot while their health is > 0
        //if it's a barrel it will shoot until the currentDamage of the barrel is = to it's maximum damage
        //if it's a tree it will just print the tree message
        for (int i = 0; i < gameObjects.length; i++) {
            if (gameObjects[i] instanceof SoldierEnemy) {
                SoldierEnemy destroyable = (SoldierEnemy) gameObjects[i];
                destroyable.getMessage();
                while (destroyable.getHealth() > 0) {
                    sniperRifle.shoot(destroyable);
                    this.shotsFired ++;
                }
                destroyable.setDead(true);
            } else if (gameObjects[i] instanceof ArmouredEnemy) {
                ArmouredEnemy destroyable = (ArmouredEnemy) gameObjects[i];
                destroyable.getMessage();
                while(destroyable.getArmour() > 0){
                    sniperRifle.shoot(destroyable);
                    this.shotsFired ++;
                }
                while(destroyable.getHealth() > 0){
                    sniperRifle.shoot(destroyable);
                    this.shotsFired ++;
                }
                destroyable.setDead(true);
            } else if (gameObjects[i] instanceof Tree) {
                Tree destroyable = (Tree) gameObjects[i];
                destroyable.getMessage();
            } else if (gameObjects[i] instanceof Barrel) {
                Barrel destroyable = (Barrel) gameObjects[i];
                destroyable.getMessage();
                while(destroyable.getCurrentDamage() != destroyable.getBarrelType().getMaxDamage()){
                    sniperRifle.shoot(destroyable);
                    this.shotsFired++;
                }
                destroyable.setDestroyed(true);

                //try to kill the next object if it's an enemy after a barrel got destroyed
               /* if (gameObjects[i+1] instanceof ArmouredEnemy || gameObjects[i+1] instanceof SoldierEnemy){
                    ((Enemy) gameObjects[i+1]).setDead(true);
                    ((Enemy) gameObjects[i+1]).setHealth(0);
                    System.out.println("If the next one is a enemy it will be instantly killed!");
                }*/
            }
        }

        System.out.println("You shot " + shotsFired + " times!");
    }

    //give objects to the array of gameObjects
    public GameObject[] createObjects(int numberGameObjects) {
        GameObject[] objects = new GameObject[numberGameObjects];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = GameObjectFactory.getNewObject();
        }
        return objects;
    }
}
