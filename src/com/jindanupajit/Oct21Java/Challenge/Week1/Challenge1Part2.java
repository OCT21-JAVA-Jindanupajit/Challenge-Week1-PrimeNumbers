package com.jindanupajit.Oct21Java.Challenge.Week1;

import java.util.Random;

// PSEUDO CODE
//   prepare scanner with system input stream
//   initialize testBoundary to primitive-integer with value 250
//   initialize testSubject to primitive-integer with random value between 1 and testBoundary
//        if testSubject less or equal 2 or an even number
//                print testSubject "is not a prime number"
//        else
//                print testSubject "is "
//                for-loop i is the number from 3 to the number less than testSubject
//                    if testSubject modulus by i is not 0
//                        continue for-loop
//                    else
//                        print "not"
//                        break for-loop
//                    end-if
//                    print " a prime number"
//                end-for-loop
//        end-if


public class Challenge1Part2 {
    public static void main(String[] args) {
        int testBoundary = 250;
        int testSubject = (new Random()).nextInt(testBoundary)+1;

        if ((testSubject <= 2)||((testSubject % 2)==0)) {
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
