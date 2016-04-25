package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by James on 4/16/2016.
 */
public class Orc implements Monster {
    private final static int ORC_HIT_POINTS = 20;
    public int hitPoints = ORC_HIT_POINTS;

    public void takeDamage(int amount) {
        hitPoints -= amount;
    }


    public void reportStatus() {
        System.out.println("Orc, current hit points: " + hitPoints);
    }
}
