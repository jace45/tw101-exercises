package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by James on 5/4/2016.
 */
public class Solver {
    private GuessChecker guessChecker;
    private Scanner scanner;
    private ArrayList<Integer> guesses = new ArrayList<>();
    private int guess;


    public Solver(GuessChecker guessChecker, Scanner scanner){
        this.guessChecker = guessChecker;
        this.scanner = scanner;
    }

    public void findSolution(){
        while (!guessChecker.isGuessRight()){
            guess = enterValidNumberString(scanner);
            guesses.add(guess);
            guessChecker.tooHighOrTooLow(guess);

            if (guessChecker.isNumberTooHigh() && !guessChecker.isGuessRight()) {
                System.out.println("Your guess is too High");
            } else if (!guessChecker.isGuessRight()) {
                System.out.println("Your guess is too low");
            }
        }
    }


    public ArrayList<Integer> getGuesses(){
        return guesses;
    }


    public static int enterValidNumberString(Scanner scanner){
        boolean isValidNumber = false;
        int guessInt = 0;

        while (!isValidNumber) {
            String guess = scanner.next();

            try {
                guessInt = Integer.parseInt(guess);
                isValidNumber = true;
            } catch (NumberFormatException e){
                System.out.println("Please enter valid number");
            }
        }
        return guessInt;
    }
}
