package com.epam.training.student_liudmyla_kosianova.Arrays;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Please, proceed to the LocalMaximaRemove class and implement the removeLocalMaxima method.
 * The correct implementation should receive an array of int values
 * and return a copy of a given array with all local maxima removed in it.
 * The original array must not be changed.
 *
 * Local maximum is an element that is bigger that any of its neighbour elements.
 * You should remove elements that are local maxima in the original array.
 *
 * Details: *
 * The size of given array is guaranteed to be more than 1.
 * Given array is guaranteed to be not null.
 * If the array has no local maxima, then you should return its copy without changes.
 * You may use java.util.Arrays.* methods.
 */

public class LocalMaximaRemove {
    public static int[] removeLocalMaxima(int[] array){

        ArrayList<Integer> noMaxi = new ArrayList<>();//create a new arraylist, because I don't know how many elements will be there

        for(int i=0; i<array.length-1; i++){//populate the new arraylist with elements from the given list
            if(array[i]<=array[i+1]){

                noMaxi.add(Integer.valueOf(array[i]));
            }
        }
        noMaxi.add(Integer.valueOf(array[array.length-1]));//add the last element to the arraylist

        //create a list, that I will return
        int howLong = noMaxi.size();
        int[] answer = new int[howLong];

        for(int i=0; i< noMaxi.size();i++){
            int x = noMaxi.get(i);
            answer[i]=x;
        }

        return answer;
    }
    public  static void main(String [] agrus){
        int[] toCheck = {18, 1, 3, 6, 7, -5};
        int[] newArray = LocalMaximaRemove.removeLocalMaxima(toCheck);
        //System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.equals(new int[]{1, 3, 6, -5},newArray));
    }

}
