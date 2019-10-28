package com.jindanupajit.Oct21Java.Challenge.Week1;

import java.util.Random;
import java.util.Scanner;


public class Challenge1Part3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int testBoundary = 250;
        int testSubject;

            System.out.println("Would you like to generate a random number or input a number? (R/I)");
            System.out.print("Choose (R/I) > ");
            switch (keyboard.next()) {
                case "R":
                case "r":
                    System.out.println("Generating a random number...");
                    testSubject = (new Random()).nextInt(testBoundary)+1;
                    break; //switch
                case "I":
                case "i":
                    System.out.print("\n\nPlease enter a number: ");
                    testSubject = keyboard.nextInt();
                    break; //switch
                default:
                    System.out.print("Bad Choice!\n");
                    testSubject = 0;
            }

            if (testSubject < 0) {
                // just quit
            } else if ((testSubject <= 2)||((testSubject % 2)==0)) {
                System.out.println(testSubject+" is not a prime number");

            } else  {
                System.out.print(testSubject+" is ");
                for (int i = 3; i < testSubject; i+=2) {
                    if ((testSubject % i) != 0) {
                        continue; //for
                    } else {
                        System.out.print("not ");
                        break; //for
                    }
                }
                System.out.println("a prime number");
            }




    }
}

