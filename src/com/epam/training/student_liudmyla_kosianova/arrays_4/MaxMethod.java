package com.epam.training.student_liudmyla_kosianova.arrays_4;

/**
 * Please, proceed to the MaxMethod class and implement the max method.
 * The correct implementation should receive an array of int values
 * and return its maximum value.
 *
 * Details: *
 * An input array is guaranteed to not be an empty array or null.
 * Method must not modify the array.
 * Input array may contain any int value between Integer.MIN_VALUE and Integer.MAX_VALUE.
 */

public class MaxMethod {
    public static int max(int[] values) {

        int maxi = values[0];

        for(int number: values){
            if(number>maxi){
                maxi=number;
            }
        }

        return maxi;
    }

}
