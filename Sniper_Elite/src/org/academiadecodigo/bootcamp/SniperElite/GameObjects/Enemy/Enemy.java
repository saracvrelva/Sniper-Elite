package org.academiadecodigo.bootcamp.SniperElite.GameObjects.Enemy;

import org.academiadecodigo.bootcamp.SniperElite.GameObjects.Destroyable;
import org.academiadecodigo.bootcamp.SniperElite.GameObjects.GameObject;

public abstract class Enemy extends GameObject implements Destroyable {

    //every enemy is created with a predetermined value of health; the health decreases when the enemy has been shot
    private int health;

    //set true when the health hits 0
    private boolean isDead;

    public Enemy(){
        this.health = 3;

    }


    public void hit(int numberOfHits){
        //randomly choose if the shot will hit the enemy or not
        int hit = (int) (Math.random() * 2);
        switch (hit){
            case 0:
                //when it hits will decrease health by 1 and print the message below
                //when health is = 1 we decrease health and sout a message of enemy killed
                if(health > 1) {
                    System.out.println("BAAANG!");
                    health -= numberOfHits;
                    System.out.println("AHHHHGGGHH! You hit me, but keep trying! I still have " + getHealth() + " points of life!\n");
                    break;
                } else if (health == 1){
                    System.out.println("BAAANG!");
                    health -= numberOfHits;
                    System.out.println("AHHHHGGGHH! Enemy killed!\n");
                    break;
                }
            case 1:
                //when doesn't hit it will print the message above
                System.out.println("You failed! Keep trying!\n");
                break;
        }

    }

    @Override
    public boolean isDestroyed() {
        return isDead;
    }

    @Override
    public void getMessage() {
        System.out.println("You just found an enemy!");

    }

    public void setDead(boolean dead) {
        isDead = dead;
    }


    public int getHealth() {
        return health;
    }

}
