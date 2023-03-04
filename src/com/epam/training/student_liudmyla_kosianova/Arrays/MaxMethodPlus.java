package com.epam.training.student_liudmyla_kosianova.Arrays;


import java.util.Arrays;

/**
 * Problem: Find the maximum value in the array and replace
 * the negative elements in this array with this value.
 * What solution would you propose?
 */
public class MaxMethodPlus {
    public static int findMaxi(int[] array){
        int maxi = array[0];
        for(int number: array){
            if(number > maxi){
                maxi=number;
            }
        }
        return maxi;
    }

    public static int[]  replaceNegative(int max, int[] array){

        for(int i =0; i<array.length; i++){
            if(array[i]<0){
                array[i]=max;
            }
        }
        return array;
    }
    public static void main(String [] args){
        int[] vals = new int[]{ -2, 0, 10, 5 };
        int result = MaxMethodPlus.findMaxi(vals);
        System.out.println(result == 10); // true
        int [] valsPositive = MaxMethodPlus.replaceNegative(result, vals);
        System.out.println(Arrays.toString(valsPositive));
    }

}

