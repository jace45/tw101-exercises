package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by James on 4/16/2016.
 */
public class Troll implements Monster {
    private final static int TROLL_HIT_POINTS = 40;
    public int hitPoints = TROLL_HIT_POINTS;

    public void takeDamage(int amount) {
        hitPoints -= (amount/2);
    }


    public void reportStatus() {
        System.out.println("Troll, current hit points: " + hitPoints);
    }
}
