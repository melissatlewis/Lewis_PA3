/* COP3330 Programming Assignment 3 - Problem 1
   Written by: Melissa Lewis */

package com.company;

import java.util.Scanner;
import java.security.SecureRandom;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static SecureRandom rand = new SecureRandom();

    public static int problemGenerate(int upperBound, int problemType) {

        int randA = rand.nextInt(upperBound) + 1;
        int randB = rand.nextInt(upperBound) + 1;
        double userInput = 0;
        double answer = 0;

        switch (problemType) {
            case 1: //Addition
                answer = randA + randB;
                System.out.println("How much is " + randA + " plus " + randB + "?");
                userInput = scan.nextDouble();
                break;
            case 2: //Multiplication
                answer = randA * randB;
                System.out.println("How much is " + randA + " times " + randB + "?");
                userInput = scan.nextDouble();
                break;
            case 3: //Subtraction
                answer = randA - randB;
                System.out.println("How much is " + randA + " minus " + randB + "?");
                userInput = scan.nextDouble();
                break;
            case 4: //Division
                answer = randA / randB;
                System.out.println("How much is " + randA + " divided by " + randB + "?");
                userInput = scan.nextDouble();
                break;
            default:
                break;
        }

        if (userInput == answer) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void response(int answer) {

        int randResponse = rand.nextInt(4) + 1;

        if (answer == 1) {
            switch (randResponse) {
                case 1:
                    System.out.println("Very good!");
                    break;
                case 2:
                    System.out.println("Excellent");
                    break;
                case 3:
                    System.out.println("Nice work!");
                    break;
                case 4:
                    System.out.println("Keep up the good work!");
                    break;
                default:
                    break;
            }
        }
        else {
            switch (randResponse) {
                case 1:
                    System.out.println("No. Please try another.");
                    break;
                case 2:
                    System.out.println("Wrong. Try one more.");
                    break;
                case 3:
                    System.out.println("Don't give up!");
                    break;
                case 4:
                    System.out.println("No. Keep trying.");
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {

        int correct;
        double score;
        int upperBound = 9;
        int randomType;
        int result;
        char choice = 'y';

        while (choice == 'y') {

            correct = 0;

            System.out.println("What difficulty level? 1, 2, 3, 4");
            int difficulty = scan.nextInt();

            switch (difficulty) {
                case 1:
                    upperBound = 9;
                    break;
                case 2:
                    upperBound = 99;
                    break;
                case 3:
                    upperBound = 999;
                    break;
                case 4:
                    upperBound = 9999;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

            System.out.println("What types of problems to study?\n1. Addition\n2. Multiplication\n3. Subtraction\n4. Division\n5. Mixture");
            int problemType = scan.nextInt();

            for (int i = 0 ; i < 10 ; i++) {
                if (problemType == 5) {
                    randomType = rand.nextInt(4) + 1;
                    result = problemGenerate(upperBound, randomType);
                    response(result);
                }
                else {
                    result = problemGenerate(upperBound, problemType);
                    response(result);
                }
                correct += result;
            }

            score = correct/10;
            score = score*100;

            System.out.println("Your Score is " + score);
            if (score >= 75) {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
            else {
                System.out.println("Please ask your teacher for extra help.");
            }

            System.out.println("Rerun the program? y/n");
            choice = scan.next().charAt(0);
        }

    }

}
