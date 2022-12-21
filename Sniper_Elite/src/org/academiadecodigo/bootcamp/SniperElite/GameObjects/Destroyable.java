package org.academiadecodigo.bootcamp.SniperElite.GameObjects;

public interface Destroyable {

    public abstract void hit(int numberOfDamage);

    public abstract boolean isDestroyed();

}
