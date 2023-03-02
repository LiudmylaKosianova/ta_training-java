package com.epam.training.student_liudmyla_kosianova.conditionsAndLoops;
import java.util.Scanner;

/**
 * Write a program that reads a sequence of integer values from standard input and finds the average value.
 *
 * Details: *
 * You must read sequence values until the next one is 0. Zero value means end of the input sequence.
 * The sequence is guaranteed to contain at least one value.
 * Average value is also an integer. Use integer operations.
 */

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum=0;
        int count=0;

        // Use Scanner methods to read input
        while(number!=0){
            //System.out.println("number is: "+number);
            sum+=number;
            System.out.println("sum is: "+sum);
            count++;
            System.out.println("count is "+count);

            number = scanner.nextInt();
        }
        System.out.println(sum/count);

    }


}
