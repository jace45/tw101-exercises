package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int start = 0, end = 100;

        Random random = new Random();
        RandomGenerator randomGenerator = new RandomGenerator(start, end, random);

        GuessChecker guessChecker = new GuessChecker(randomGenerator.getRandomNumber());

        System.out.println("Guess a number between " + start + " and " + end);

        Scanner scanner = new Scanner(System.in);
        Solver solver = new Solver(guessChecker, scanner);

        solver.findSolution();

        System.out.println("Congrats! You win!");
        System.out.println("Your guesses: " + solver.getGuesses().toString());
    }
}
