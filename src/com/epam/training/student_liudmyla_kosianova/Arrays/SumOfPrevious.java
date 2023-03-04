package com.epam.training.student_liudmyla_kosianova.Arrays;

import java.util.Arrays;

/**
 * implement getSumCheckArray method.
 * The correct implementation should receive an array of int values
 * and return an array of booleans where each element is a result of a check
 * if a corresponding element is a sum of two previous elements in given array.
 *
 * Details:
 * The length of given array is guaranteed to be 2 or more.
 * Given array is guaranteed to be not null.
 * Method returns an array of booleans where each element is a result for corresponding element in given array.
 * First two elements of the boolean array are always false.
 */
public class SumOfPrevious {
    public static boolean[] getSumCheckArray (int[] array){
        int x = array.length;
        boolean[] sumCheck = new boolean[x];
        sumCheck[0]= false;
        sumCheck[1]= false;
        for(int i=2; i<array.length;i++){
            if(array[i]==array[i-1]+array[i-2]){
                sumCheck[i]= true;
            }else{sumCheck[i]= false;}
        }

        return sumCheck;
    }
    public static void main(String[] args){
        int[] first = new int[] {1, -1, 0, 4, 6, 10, 15, 25};
        boolean[] check = SumOfPrevious.getSumCheckArray(first);
        System.out.println(Arrays.toString(check));
    }

}
