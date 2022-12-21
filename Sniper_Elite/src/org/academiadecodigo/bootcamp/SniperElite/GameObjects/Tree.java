package org.academiadecodigo.bootcamp.SniperElite.GameObjects;

import org.academiadecodigo.bootcamp.SniperElite.GameObjects.GameObject;

public class Tree extends GameObject {

    @Override
    public void getMessage() {
        System.out.println("You just found a tree! Try again!\n");
    }
}
