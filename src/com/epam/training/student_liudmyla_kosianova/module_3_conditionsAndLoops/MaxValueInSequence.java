package com.epam.training.student_liudmyla_kosianova.module_3_conditionsAndLoops;
import java.util.Scanner;

/**
 * Write a program that reads a sequence of integer values from standard output
 * and finds the maximum value. You must place your solution into the max method
 * to pass tests.
 *
 * Details:
 * You must read sequence values until the next one is 0. Zero value means end of the input sequence.
 * The sequence is guaranteed to contain at least one value.
 */

public class MaxValueInSequence {
    public static int max() {


        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int maxi = number;


        while(number != 0){


            if(number>maxi){
                maxi = number;
            }

            number = scan.nextInt();

        }
        return maxi;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        System.out.println(max());
    }
}

