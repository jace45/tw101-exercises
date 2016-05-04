package com.thoughtworks.tw101.exercises.exercise8;

/**
 * Created by James on 4/16/2016.
 */
public class GuessChecker {
    private int randomNumber;
    private boolean numberIsTooHigh = false;
    private boolean guessIsRight = false;

    public GuessChecker(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public void tooHighOrTooLow(int guess){
        if (guess > randomNumber){
            numberIsTooHigh = true;
        } else if (guess < randomNumber) {
            numberIsTooHigh = false;
        } else {
            guessIsRight = true;
        }
    }

    public boolean isNumberTooHigh(){
        return numberIsTooHigh;
    }

    public boolean isGuessRight(){
        return guessIsRight;
    }
}
