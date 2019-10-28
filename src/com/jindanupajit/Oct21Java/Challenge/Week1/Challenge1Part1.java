package com.jindanupajit.Oct21Java.Challenge.Week1;

import java.util.Scanner;

// PSEUDO CODE
//   prepare scanner with system input stream
//   declare testSubject to primitive-integer
//   infinite-loop
//        prompt "\n\nEnter a number to test, '0' to quit> "
//        input-integer testSubject
//        if testSubject less than 0
//                print "Invalid Number"
//                continue infinite-loop
//        else-if testSubject is 0
//                print "Bye"
//                break infinite-loop
//        else-if testSubject less or equal 2 or an even number
//                print testSubject "is not a prime number"
//                continue infinite-loop
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
//  end infinite-loop

public class Challenge1Part1 {

    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int testSubject;
      while(true) {
          System.out.print("\n\nEnter a number to test, '0' to quit> ");
          testSubject = keyboard.nextInt();
          if (testSubject < 0) {
              System.out.println("Invalid Number");
              continue; //while
          } else if (testSubject == 0) {
              System.out.println("Bye");
              break; //while
          } else if ((testSubject <= 2)||((testSubject % 2)==0)) {
              System.out.println(testSubject+" is not a prime number");
              continue; //while
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
}

