package org.academiadecodigo.bootcamp.SniperElite.GameObjects.Barrel;

public enum BarrelType {

    //Barrel types with a value of max Damage defined;
    //A barrel to be destroyed needs to take as many shots as their maxDamage
    PLASTIC(3),
    WOOD(5),
    METAL(8);

    private int maxDamage;

    BarrelType(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }
}
