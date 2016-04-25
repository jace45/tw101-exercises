package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;

/**
 * Created by James on 4/17/2016.
 */
public class RandomGenerator {
    int randomNumber;

    public RandomGenerator(int start, int end, Random random){
        if (start > end) {
            throw new IllegalArgumentException("Start cannot exceed End.");
        }

        long range = (long)end - (long)start + 1;
        long fraction = (long)(range * random.nextDouble());
        randomNumber =  (int)(fraction + start);
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}
