package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int start = 1, end = 100;
        Random random = new Random();
        RandomGenerator randomGenerator = new RandomGenerator(start, end, random);

        GuessChecker guessChecker = new GuessChecker(randomGenerator.getRandomNumber());

        System.out.println("Guess a number between " + start + " and " + end);

        Scanner scanner = new Scanner(System.in);
        String guess = scanner.next();

        int guessInt = Integer.parseInt(guess);

        int checker = guessChecker.tooHighOrTooLow(guessInt);

        while (checker != 0){
            if (checker == 1)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
            guess = scanner.next();

            guessInt = Integer.parseInt(guess);

            checker = guessChecker.tooHighOrTooLow(guessInt);
        }
        System.out.println("Congrats! You win!");
    }
}
