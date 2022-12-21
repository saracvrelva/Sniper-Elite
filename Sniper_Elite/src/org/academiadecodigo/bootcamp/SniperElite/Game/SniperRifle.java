package org.academiadecodigo.bootcamp.SniperElite.Game;

import org.academiadecodigo.bootcamp.SniperElite.GameObjects.Destroyable;

public class SniperRifle {

    // the damage it can make to the object when it hits
    private int bulletDamage = 1;

    //it takes a destroyable - enemy or barrel - and then it calls the hit method
    public void shoot(Destroyable destroyable) {
            destroyable.hit(bulletDamage);
    }


}
