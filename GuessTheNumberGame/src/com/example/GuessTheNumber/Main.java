package com.example.GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Guessing Game...");
        System.out.println();

        System.out.println("May I know your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name + "!");
        System.out.println();

        System.out.println("Would you like to play the Guessing Game?");
        System.out.println("Enter: \t1 for Yes \tor\t 2 for No");

        int startGame = scanner.nextInt();

        while (startGame != 1) {
            System.out.println("Would you like to play the Guessing Game?");
            System.out.println("Enter: \t1 for Yes \tor\t 2 for No");

            startGame = scanner.nextInt();
        }



//        **********Guessing Game***********

        int numberOfTries = 1;
        int correctAnswer;
        int highestRange = 30;

        Random random = new Random();
        int randomNumber = random.nextInt(30) + 1;
        int hint1 = randomNumber - 3;
        int hint2 = randomNumber + 2;

        System.out.println();
        System.out.println("I'm thinking of a number between: 1 - " + highestRange);
        System.out.println("Can you guess the number?");
        System.out.println();


        do {
            System.out.print("Enter a number: ");
            int answer = scanner.nextInt();

            if (answer == randomNumber) {
                correctAnswer = answer;
                System.out.println("You are correct!!! The number is " + correctAnswer);
                System.out.println("You guessed the number in " + numberOfTries + " tries.");
                break;
            } else if (answer > randomNumber && answer < highestRange) {
                System.out.println("You guessed wrong. Guess lower.");
            } else if (answer > highestRange) {
                System.out.println("Your guess is not in the range. The number is between 1 - " + highestRange);
            } else {
                System.out.println("You guessed wrong. Guess higher.");
            }

            numberOfTries++;
        } while (numberOfTries<5);

        if (numberOfTries == 5) {
            System.out.println("Hint: The number is 3 steps after " + hint1 + " and 2 steps before " + hint2 + ".");

            System.out.print("Enter a number: ");
            int answer = scanner.nextInt();

            if (answer == randomNumber) {
                correctAnswer = answer;
                System.out.println("You are correct!!! The number was " + correctAnswer);
                System.out.println("You guessed the number in " + numberOfTries + " tries.");
            } else {
                System.out.println();
                System.out.println("You guessed wrong. Game Over!");
                System.out.println("The number was: " + randomNumber);
            }

        }

        System.out.println();
        System.out.println("Created by Moses Promise...");

    }
}
