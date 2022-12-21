package org.academiadecodigo.bootcamp.SniperElite.GameObjects.Barrel;

public class BarrelFactory {

    // method to return a Barrel whose type is chosen randomly
    public static Barrel getBarrel() {
        BarrelType barrelType = null;
        int chooseBarrel = (int) (Math.random() * 3);
        return new Barrel(BarrelType.values()[chooseBarrel]);
    }
        /*
        **this switch was reduced to the return above
        *
        *
        switch (chooseBarrel) {
            case 0:
                barrelType = BarrelType.PLASTIC;
                break;
            case 1:
                barrelType = BarrelType.WOOD;
                break;
            case 2:
                barrelType = BarrelType.METAL;
                break;
        }*/

}
