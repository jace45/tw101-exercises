package com.thoughtworks.tw101.exercises.exercise8;

/**
 * Created by James on 4/16/2016.
 */
public class GuessChecker {
    int randomNumber;

    public GuessChecker(int randomNumber){
        this.randomNumber = randomNumber;
    }

    public int tooHighOrTooLow(int guess){
        if(guess > randomNumber)
            return 1;
        else if (guess < randomNumber)
            return -1;
        else
            return 0;
    }
}
