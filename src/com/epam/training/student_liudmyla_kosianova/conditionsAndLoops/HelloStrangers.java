package com.epam.training.student_liudmyla_kosianova.conditionsAndLoops;
import java.util.Scanner;

/**
 * Write a program that:
 *
 * Asks for a number - amount of strangers to meet
 * Then reads stranger names line by line
 * And, finally, prints line by line "Hello, stranger name" for each stranger
 * It is guaranteed that the input is not null.
 * It is guaranteed that the input of strangers count is int number.
 *
 * Consider special cases:
 *
 * If strangers count is zero, then program must print
 * "Oh, it looks like there is no one here".
 * If strangers count is negative, then program must print
 * "Seriously? Why so negative?".
 */

public class HelloStrangers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();
        if(inputNumber==0){
            System.out.println("Oh, it looks like there is no one here");
        }else if(inputNumber<0){
            System.out.println("Seriously? Why so negative?");
        }else{
            String name0 = scan.nextLine();
            for(int i=0; i<inputNumber; i++){

                System.out.println("Hello, " + scan.nextLine());
            }
        }


    }
}
