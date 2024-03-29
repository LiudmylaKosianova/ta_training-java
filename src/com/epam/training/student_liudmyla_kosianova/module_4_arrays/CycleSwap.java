package com.epam.training.student_liudmyla_kosianova.module_4_arrays;

import java.util.Arrays;

/**
 * Please, proceed to CycleSwap class and implement its static methods:
 *
 * void cycleSwap(int[] array)
 * Shifts all the elements in the given array to the right by 1 position.
 * In this case, the last array element becomes first.
 * For example, 1 3 2 7 4 becomes 4 1 3 2 7.
 *
 * void cycleSwap(int[] array, int shift)
 * Shift all the elements in the given array to the right in the cycle manner by shift positions.
 * Shift value is guaranteed to be non-negative and not bigger than the array length.
 * For example, 1 3 2 7 4 with a shift of 3 becomes 2 7 4 1 3.
 * For a greater challenge, try not using loops in your code (not mandatory).
 * Note that input array may be empty.
 */

public class CycleSwap {
    public static void cycleSwap(int[] array){
        if(array.length==0){
            return;
        }
        int lastIndex = array.length-1;
        int last = array[lastIndex];

        for(int i=lastIndex; i>0;i--){
            array[i]=array[i-1];
        }

        array[0]=last;
    }

    public static void cycleSwap(int[] array, int shift){
        if(array.length==shift) {return;}
        //creates the identical array
        int[] twin = new int[array.length];
        System.arraycopy(array,0,twin,0,array.length);

        int blue = array.length - shift;

        System.arraycopy(twin,blue,array, 0,shift);
        System.arraycopy(twin,0,array, shift,blue);

    }
    public static void main(String[] args){
        int[] array = new int[]{ 1, 3, 2, 7, 4 };
        CycleSwap.cycleSwap(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.equals(array,new int[]{4, 1, 3, 2, 7}));
        int[] array2 = new int[]{ 1, 3, 2, 7, 4 };
        CycleSwap.cycleSwap(array2,2);
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.equals(array2,new int[]{7,4, 1, 3, 2}));



    }

}
