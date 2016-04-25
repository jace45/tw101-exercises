package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int start = 1, end = 100;
        Random random = new Random();
        RandomGenerator randomGenerator = new RandomGenerator(start, end, random);
        ArrayList<Integer> guesses = new ArrayList<>();
        GuessChecker guessChecker = new GuessChecker(randomGenerator.getRandomNumber());

        System.out.println("Guess a number between " + start + " and " + end);

        Scanner scanner = new Scanner(System.in);

        int guessInt = enterValidNumberString(scanner);
        guesses.add(guessInt);
        int checker = guessChecker.tooHighOrTooLow(guessInt);

        while (checker != 0){
            if (checker == 1)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");

                guessInt = enterValidNumberString(scanner);
                guesses.add(guessInt);
                checker = guessChecker.tooHighOrTooLow(guessInt);
        }
        System.out.println("Congrats! You win!");
        System.out.println("Your guesses: " + guesses.toString());
    }

    public static int enterValidNumberString(Scanner scanner){
        int check = 0;
        int guessInt = 0;

        while (check == 0){
            String guess = scanner.next();

            try {
                guessInt = Integer.parseInt(guess);
                check++;
            } catch (NumberFormatException e){
                System.out.println("Please enter valid number");
            }
        }
        return guessInt;
    }
}
