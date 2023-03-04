package com.epam.training.student_liudmyla_kosianova.Arrays;

/**
 * Please, proceed to the SumOfEvenNumbers class and implement the sum method. *
 * The correct implementation should receive an array of int values
 * and return the sum of even numbers.
 *
 * Details: *
 * If given array is null or empty, method returns 0.
 * sum method must not modify the array.
 * Input array may contain any int value between Integer.MIN_VALUE and Integer.MAX_VALUE.
 */
 public class SumOfEvenNumbers {
     public static int theSum(int[] array){
         int evenSum = 0;
         for(int i: array){
             if(i%2==0){
                 evenSum+=i;
             }
         }
         return evenSum;
     }
     public static void main(String [] args){
         int[]vals = new int[]{-2,10,0,5};
         int result = SumOfEvenNumbers.theSum(vals);
         System.out.println(result == 8); // true
     }
}
